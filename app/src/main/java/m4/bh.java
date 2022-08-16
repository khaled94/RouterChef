package m4;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;
import n9.d;

@TargetApi(17)
/* loaded from: classes.dex */
public final class bh extends Surface {

    /* renamed from: u */
    public static boolean f6524u;

    /* renamed from: v */
    public static boolean f6525v;

    /* renamed from: s */
    public final ah f6526s;

    /* renamed from: t */
    public boolean f6527t;

    public /* synthetic */ bh(ah ahVar, SurfaceTexture surfaceTexture) {
        super(surfaceTexture);
        this.f6526s = ahVar;
    }

    public static bh a(Context context, boolean z10) {
        if (wg.f14958a >= 17) {
            boolean z11 = false;
            d.i(!z10 || b(context));
            ah ahVar = new ah();
            ahVar.start();
            ahVar.f6147t = new Handler(ahVar.getLooper(), ahVar);
            synchronized (ahVar) {
                ahVar.f6147t.obtainMessage(1, z10 ? 1 : 0, 0).sendToTarget();
                while (ahVar.f6151x == null && ahVar.f6150w == null && ahVar.f6149v == null) {
                    try {
                        ahVar.wait();
                    } catch (InterruptedException unused) {
                        z11 = true;
                    }
                }
            }
            if (z11) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = ahVar.f6150w;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = ahVar.f6149v;
            if (error != null) {
                throw error;
            }
            return ahVar.f6151x;
        }
        throw new UnsupportedOperationException("Unsupported prior to API level 17");
    }

    public static synchronized boolean b(Context context) {
        boolean z10;
        synchronized (bh.class) {
            if (!f6525v) {
                int i10 = wg.f14958a;
                if (i10 >= 17) {
                    boolean z11 = false;
                    String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                        if (i10 == 24) {
                            String str = wg.f14961d;
                            if ((str.startsWith("SM-G950") || str.startsWith("SM-G955")) && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
                            }
                        }
                        z11 = true;
                    }
                    f6524u = z11;
                }
                f6525v = true;
            }
            z10 = f6524u;
        }
        return z10;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f6526s) {
            try {
                if (!this.f6527t) {
                    this.f6526s.f6147t.sendEmptyMessage(3);
                    this.f6527t = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
