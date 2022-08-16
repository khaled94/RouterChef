package m4;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import n9.d;

/* loaded from: classes.dex */
public final class ah extends HandlerThread implements SurfaceTexture.OnFrameAvailableListener, Handler.Callback {

    /* renamed from: s */
    public final int[] f6146s = new int[1];

    /* renamed from: t */
    public Handler f6147t;

    /* renamed from: u */
    public SurfaceTexture f6148u;

    /* renamed from: v */
    public Error f6149v;

    /* renamed from: w */
    public RuntimeException f6150w;

    /* renamed from: x */
    public bh f6151x;

    public ah() {
        super("dummySurface");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        try {
            if (i10 != 1) {
                if (i10 == 2) {
                    this.f6148u.updateTexImage();
                    return true;
                } else if (i10 != 3) {
                    return true;
                } else {
                    try {
                        this.f6148u.release();
                        this.f6151x = null;
                        this.f6148u = null;
                        GLES20.glDeleteTextures(1, this.f6146s, 0);
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
            }
            try {
                boolean z10 = message.arg1 != 0;
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                d.j(eglGetDisplay != null, "eglGetDisplay failed");
                int[] iArr = new int[2];
                d.j(EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = new int[1];
                d.j(EGL14.eglChooseConfig(eglGetDisplay, new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) && iArr2[0] > 0 && eGLConfigArr[0] != null, "eglChooseConfig failed");
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, z10 ? new int[]{12440, 2, 12992, 1, 12344} : new int[]{12440, 2, 12344}, 0);
                d.j(eglCreateContext != null, "eglCreateContext failed");
                EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfig, z10 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                d.j(eglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
                d.j(EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext), "eglMakeCurrent failed");
                GLES20.glGenTextures(1, this.f6146s, 0);
                SurfaceTexture surfaceTexture = new SurfaceTexture(this.f6146s[0]);
                this.f6148u = surfaceTexture;
                surfaceTexture.setOnFrameAvailableListener(this);
                this.f6151x = new bh(this, this.f6148u);
                synchronized (this) {
                    notify();
                }
            } catch (Error e10) {
                Log.e("DummySurface", "Failed to initialize dummy surface", e10);
                this.f6149v = e10;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e11) {
                Log.e("DummySurface", "Failed to initialize dummy surface", e11);
                this.f6150w = e11;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f6147t.sendEmptyMessage(2);
    }
}
