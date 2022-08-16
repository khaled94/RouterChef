package m4;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import android.util.Log;

/* loaded from: classes.dex */
public final class z51 implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static final int[] y = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: s */
    public final Handler f16003s;

    /* renamed from: t */
    public final int[] f16004t = new int[1];

    /* renamed from: u */
    public EGLDisplay f16005u;

    /* renamed from: v */
    public EGLContext f16006v;

    /* renamed from: w */
    public EGLSurface f16007w;

    /* renamed from: x */
    public SurfaceTexture f16008x;

    public z51(Handler handler) {
        this.f16003s = handler;
    }

    public final void a(int i10) {
        EGLConfig eGLConfig;
        EGLSurface eGLSurface;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            int[] iArr = new int[2];
            if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                throw new m41("eglInitialize failed");
            }
            this.f16005u = eglGetDisplay;
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, y, 0, eGLConfigArr, 0, 1, iArr2, 0);
            if (!eglChooseConfig || iArr2[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
                throw new m41(ls1.c("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]));
            }
            EGLContext eglCreateContext = EGL14.eglCreateContext(this.f16005u, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
            if (eglCreateContext == null) {
                throw new m41("eglCreateContext failed");
            }
            this.f16006v = eglCreateContext;
            EGLDisplay eGLDisplay = this.f16005u;
            if (i10 == 1) {
                eGLSurface = EGL14.EGL_NO_SURFACE;
            } else {
                eGLSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                if (eGLSurface == null) {
                    throw new m41("eglCreatePbufferSurface failed");
                }
            }
            if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eglCreateContext)) {
                throw new m41("eglMakeCurrent failed");
            }
            this.f16007w = eGLSurface;
            GLES20.glGenTextures(1, this.f16004t, 0);
            int i11 = 0;
            while (true) {
                int glGetError = GLES20.glGetError();
                if (glGetError == 0) {
                    break;
                }
                String valueOf = String.valueOf(GLU.gluErrorString(glGetError));
                Log.e("GlUtil", valueOf.length() != 0 ? "glError ".concat(valueOf) : new String("glError "));
                i11 = glGetError;
            }
            if (i11 != 0) {
                String valueOf2 = String.valueOf(GLU.gluErrorString(i11));
                Log.e("GlUtil", valueOf2.length() != 0 ? "glError ".concat(valueOf2) : new String("glError "));
            }
            SurfaceTexture surfaceTexture = new SurfaceTexture(this.f16004t[0]);
            this.f16008x = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(this);
            return;
        }
        throw new m41("eglGetDisplay failed");
    }

    /* JADX WARN: Finally extract failed */
    public final void b() {
        this.f16003s.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f16008x;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f16004t, 0);
            }
            EGLDisplay eGLDisplay = this.f16005u;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f16005u;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f16007w;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f16005u, this.f16007w);
            }
            EGLContext eGLContext = this.f16006v;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f16005u, eGLContext);
            }
            if (ls1.f10971a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f16005u;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f16005u);
            }
            this.f16005u = null;
            this.f16006v = null;
            this.f16007w = null;
            this.f16008x = null;
        } catch (Throwable th) {
            EGLDisplay eGLDisplay4 = this.f16005u;
            if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay5 = this.f16005u;
                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay5, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface4 = this.f16007w;
            if (eGLSurface4 != null && !eGLSurface4.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f16005u, this.f16007w);
            }
            EGLContext eGLContext2 = this.f16006v;
            if (eGLContext2 != null) {
                EGL14.eglDestroyContext(this.f16005u, eGLContext2);
            }
            if (ls1.f10971a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay6 = this.f16005u;
            if (eGLDisplay6 != null && !eGLDisplay6.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f16005u);
            }
            this.f16005u = null;
            this.f16006v = null;
            this.f16007w = null;
            this.f16008x = null;
            throw th;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f16003s.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f16008x;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
