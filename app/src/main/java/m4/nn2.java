package m4;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;
import java.util.Objects;

/* loaded from: classes.dex */
public final class nn2 extends Surface {

    /* renamed from: v */
    public static int f11873v;

    /* renamed from: w */
    public static boolean f11874w;

    /* renamed from: s */
    public final boolean f11875s;

    /* renamed from: t */
    public final mn2 f11876t;

    /* renamed from: u */
    public boolean f11877u;

    public /* synthetic */ nn2(mn2 mn2Var, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f11876t = mn2Var;
        this.f11875s = z10;
    }

    public static nn2 a(Context context, boolean z10) {
        boolean z11 = false;
        r01.h(!z10 || b(context));
        mn2 mn2Var = new mn2();
        int i10 = z10 ? f11873v : 0;
        mn2Var.start();
        Handler handler = new Handler(mn2Var.getLooper(), mn2Var);
        mn2Var.f11259t = handler;
        mn2Var.f11258s = new z51(handler);
        synchronized (mn2Var) {
            mn2Var.f11259t.obtainMessage(1, i10, 0).sendToTarget();
            while (mn2Var.f11262w == null && mn2Var.f11261v == null && mn2Var.f11260u == null) {
                try {
                    mn2Var.wait();
                } catch (InterruptedException unused) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = mn2Var.f11261v;
        if (runtimeException == null) {
            Error error = mn2Var.f11260u;
            if (error != null) {
                throw error;
            }
            nn2 nn2Var = mn2Var.f11262w;
            Objects.requireNonNull(nn2Var);
            return nn2Var;
        }
        throw runtimeException;
    }

    public static synchronized boolean b(Context context) {
        int i10;
        String eglQueryString;
        String eglQueryString2;
        synchronized (nn2.class) {
            if (!f11874w) {
                int i11 = ls1.f10971a;
                int i12 = 2;
                if (i11 >= 24 && ((i11 >= 26 || (!"samsung".equals(ls1.f10973c) && !"XT1650".equals(ls1.f10974d))) && ((i11 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_EXT_protected_content")))) {
                    if (i11 >= 17 && (eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString2.contains("EGL_KHR_surfaceless_context")) {
                        i12 = 1;
                    }
                    f11873v = i12;
                    f11874w = true;
                }
                i12 = 0;
                f11873v = i12;
                f11874w = true;
            }
            i10 = f11873v;
        }
        return i10 != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f11876t) {
            try {
                if (!this.f11877u) {
                    Handler handler = this.f11876t.f11259t;
                    Objects.requireNonNull(handler);
                    handler.sendEmptyMessage(2);
                    this.f11877u = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
