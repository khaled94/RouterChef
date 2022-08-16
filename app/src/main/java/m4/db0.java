package m4;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

@TargetApi(14)
/* loaded from: classes.dex */
public final class db0 extends Thread implements SurfaceTexture.OnFrameAvailableListener, bb0 {
    public static final float[] T = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};
    public float B;
    public float C;
    public int D;
    public int E;
    public SurfaceTexture F;
    public SurfaceTexture G;
    public int H;
    public int I;
    public int J;
    public final FloatBuffer K;
    public EGL10 N;
    public EGLDisplay O;
    public EGLContext P;
    public EGLSurface Q;
    public volatile boolean R;
    public volatile boolean S;

    /* renamed from: s */
    public final cb0 f7279s;

    /* renamed from: t */
    public final float[] f7280t = new float[9];

    /* renamed from: u */
    public final float[] f7281u = new float[9];

    /* renamed from: v */
    public final float[] f7282v = new float[9];

    /* renamed from: w */
    public final float[] f7283w = new float[9];

    /* renamed from: x */
    public final float[] f7284x = new float[9];
    public final float[] y = new float[9];

    /* renamed from: z */
    public final float[] f7285z = new float[9];
    public float A = Float.NaN;
    public final CountDownLatch L = new CountDownLatch(1);
    public final Object M = new Object();

    public db0(Context context) {
        super("SphericalVideoProcessor");
        float[] fArr = T;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.K = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        cb0 cb0Var = new cb0(context);
        this.f7279s = cb0Var;
        cb0Var.f6770h = this;
    }

    public static final void e(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder sb = new StringBuilder(str.length() + 21);
            sb.append(str);
            sb.append(": glError ");
            sb.append(glGetError);
            Log.e("SphericalVideoRenderer", sb.toString());
        }
    }

    public static final void f(float[] fArr, float[] fArr2, float[] fArr3) {
        float f10 = fArr2[1] * fArr3[3];
        fArr[0] = (fArr2[2] * fArr3[6]) + f10 + (fArr2[0] * fArr3[0]);
        fArr[1] = (fArr2[2] * fArr3[7]) + (fArr2[1] * fArr3[4]) + (fArr2[0] * fArr3[1]);
        fArr[2] = (fArr2[2] * fArr3[8]) + (fArr2[1] * fArr3[5]) + (fArr2[0] * fArr3[2]);
        fArr[3] = (fArr2[5] * fArr3[6]) + (fArr2[4] * fArr3[3]) + (fArr2[3] * fArr3[0]);
        fArr[4] = (fArr2[5] * fArr3[7]) + (fArr2[4] * fArr3[4]) + (fArr2[3] * fArr3[1]);
        fArr[5] = (fArr2[5] * fArr3[8]) + (fArr2[4] * fArr3[5]) + (fArr2[3] * fArr3[2]);
        fArr[6] = (fArr2[8] * fArr3[6]) + (fArr2[7] * fArr3[3]) + (fArr2[6] * fArr3[0]);
        fArr[7] = (fArr2[8] * fArr3[7]) + (fArr2[7] * fArr3[4]) + (fArr2[6] * fArr3[1]);
        float f11 = fArr2[6] * fArr3[2];
        fArr[8] = (fArr2[8] * fArr3[8]) + (fArr2[7] * fArr3[5]) + f11;
    }

    public static final void g(float[] fArr, float f10) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d5 = f10;
        fArr[4] = (float) Math.cos(d5);
        fArr[5] = (float) (-Math.sin(d5));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d5);
        fArr[8] = (float) Math.cos(d5);
    }

    public static final void h(float[] fArr, float f10) {
        double d5 = f10;
        fArr[0] = (float) Math.cos(d5);
        fArr[1] = (float) (-Math.sin(d5));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d5);
        fArr[4] = (float) Math.cos(d5);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    public static final int i(int i10, String str) {
        int glCreateShader = GLES20.glCreateShader(i10);
        e("createShader");
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            e("shaderSource");
            GLES20.glCompileShader(glCreateShader);
            e("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            e("getShaderiv");
            if (iArr[0] == 0) {
                StringBuilder sb = new StringBuilder(37);
                sb.append("Could not compile shader ");
                sb.append(i10);
                sb.append(":");
                Log.e("SphericalVideoRenderer", sb.toString());
                Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(glCreateShader));
                GLES20.glDeleteShader(glCreateShader);
                e("deleteShader");
                return 0;
            }
        }
        return glCreateShader;
    }

    public final void a(int i10, int i11) {
        synchronized (this.M) {
            this.E = i10;
            this.D = i11;
            this.R = true;
            this.M.notifyAll();
        }
    }

    public final void b() {
        synchronized (this.M) {
            this.S = true;
            this.G = null;
            this.M.notifyAll();
        }
    }

    public final void c(float f10, float f11) {
        int i10 = this.E;
        int i11 = this.D;
        float f12 = i10 > i11 ? i10 : i11;
        this.B -= (f10 * 1.7453293f) / f12;
        float f13 = this.C - ((f11 * 1.7453293f) / f12);
        this.C = f13;
        if (f13 < -1.5707964f) {
            this.C = -1.5707964f;
            f13 = -1.5707964f;
        }
        if (f13 > 1.5707964f) {
            this.C = 1.5707964f;
        }
    }

    public final boolean d() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.Q;
        boolean z10 = false;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            z10 = this.N.eglDestroySurface(this.O, this.Q) | this.N.eglMakeCurrent(this.O, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.Q = null;
        }
        EGLContext eGLContext = this.P;
        if (eGLContext != null) {
            z10 |= this.N.eglDestroyContext(this.O, eGLContext);
            this.P = null;
        }
        EGLDisplay eGLDisplay = this.O;
        if (eGLDisplay != null) {
            boolean eglTerminate = this.N.eglTerminate(eGLDisplay);
            this.O = null;
            return eglTerminate | z10;
        }
        return z10;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.J++;
        synchronized (this.M) {
            this.M.notifyAll();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.graphics.SurfaceTexture, android.graphics.SurfaceTexture$OnFrameAvailableListener] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1038
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.db0.run():void");
    }
}
