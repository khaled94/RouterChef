package q0;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import java.util.Objects;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;

/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {
    public static final int I = ViewConfiguration.getTapTimeout();
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;

    /* renamed from: s */
    public final C0103a f17026s;

    /* renamed from: u */
    public final View f17028u;

    /* renamed from: v */
    public b f17029v;

    /* renamed from: t */
    public final AccelerateInterpolator f17027t = new AccelerateInterpolator();

    /* renamed from: w */
    public float[] f17030w = {0.0f, 0.0f};

    /* renamed from: x */
    public float[] f17031x = {Float.MAX_VALUE, Float.MAX_VALUE};
    public float[] A = {0.0f, 0.0f};
    public float[] B = {0.0f, 0.0f};
    public float[] C = {Float.MAX_VALUE, Float.MAX_VALUE};
    public int y = 1;

    /* renamed from: z */
    public int f17032z = I;

    /* renamed from: q0.a$a */
    /* loaded from: classes.dex */
    public static class C0103a {

        /* renamed from: a */
        public int f17033a;

        /* renamed from: b */
        public int f17034b;

        /* renamed from: c */
        public float f17035c;

        /* renamed from: d */
        public float f17036d;

        /* renamed from: h */
        public float f17040h;

        /* renamed from: i */
        public int f17041i;

        /* renamed from: e */
        public long f17037e = Long.MIN_VALUE;

        /* renamed from: g */
        public long f17039g = -1;

        /* renamed from: f */
        public long f17038f = 0;

        public final float a(long j3) {
            long j10 = this.f17037e;
            if (j3 < j10) {
                return 0.0f;
            }
            long j11 = this.f17039g;
            if (j11 < 0 || j3 < j11) {
                return a.b(((float) (j3 - j10)) / this.f17033a, 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f17040h;
            return (a.b(((float) (j3 - j11)) / this.f17041i, 0.0f, 1.0f) * f10) + (1.0f - f10);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
            a.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            if (!aVar.G) {
                return;
            }
            if (aVar.E) {
                aVar.E = false;
                C0103a c0103a = aVar.f17026s;
                Objects.requireNonNull(c0103a);
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                c0103a.f17037e = currentAnimationTimeMillis;
                c0103a.f17039g = -1L;
                c0103a.f17038f = currentAnimationTimeMillis;
                c0103a.f17040h = 0.5f;
            }
            C0103a c0103a2 = a.this.f17026s;
            if (!(c0103a2.f17039g > 0 && AnimationUtils.currentAnimationTimeMillis() > c0103a2.f17039g + ((long) c0103a2.f17041i)) && a.this.g()) {
                a aVar2 = a.this;
                if (aVar2.F) {
                    aVar2.F = false;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    aVar2.f17028u.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (c0103a2.f17038f != 0) {
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a10 = c0103a2.a(currentAnimationTimeMillis2);
                    c0103a2.f17038f = currentAnimationTimeMillis2;
                    h.b(((g) a.this).J, (int) (((float) (currentAnimationTimeMillis2 - c0103a2.f17038f)) * ((a10 * 4.0f) + ((-4.0f) * a10 * a10)) * c0103a2.f17036d));
                    View view = a.this.f17028u;
                    WeakHashMap<View, f0> weakHashMap = z.f5921a;
                    z.d.m(view, this);
                    return;
                }
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            a.this.G = false;
        }
    }

    public a(View view) {
        C0103a c0103a = new C0103a();
        this.f17026s = c0103a;
        this.f17028u = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.C;
        float f11 = ((int) ((1575.0f * f10) + 0.5f)) / 1000.0f;
        fArr[0] = f11;
        fArr[1] = f11;
        float[] fArr2 = this.B;
        float f12 = ((int) ((f10 * 315.0f) + 0.5f)) / 1000.0f;
        fArr2[0] = f12;
        fArr2[1] = f12;
        float[] fArr3 = this.f17031x;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f17030w;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.A;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        c0103a.f17033a = 500;
        c0103a.f17034b = 500;
    }

    public static float b(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a(int r4, float r5, float r6, float r7) {
        /*
            r3 = this;
            float[] r0 = r3.f17030w
            r0 = r0[r4]
            float[] r1 = r3.f17031x
            r1 = r1[r4]
            float r0 = r0 * r6
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r5, r0)
            float r6 = r6 - r5
            float r5 = r3.c(r6, r0)
            float r5 = r5 - r1
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 >= 0) goto L25
            android.view.animation.AccelerateInterpolator r6 = r3.f17027t
            float r5 = -r5
            float r5 = r6.getInterpolation(r5)
            float r5 = -r5
            goto L2f
        L25:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 <= 0) goto L38
            android.view.animation.AccelerateInterpolator r6 = r3.f17027t
            float r5 = r6.getInterpolation(r5)
        L2f:
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = b(r5, r6, r0)
            goto L39
        L38:
            r5 = r2
        L39:
            int r6 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r6 != 0) goto L3e
            return r2
        L3e:
            float[] r0 = r3.A
            r0 = r0[r4]
            float[] r1 = r3.B
            r1 = r1[r4]
            float[] r2 = r3.C
            r4 = r2[r4]
            float r0 = r0 * r7
            if (r6 <= 0) goto L53
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            return r4
        L53:
            float r5 = -r5
            float r5 = r5 * r0
            float r4 = b(r5, r1, r4)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.a.a(int, float, float, float):float");
    }

    public final float c(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.y;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (this.G && i10 == 1) {
                    return 1.0f;
                }
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
        return 0.0f;
    }

    public final void e() {
        int i10 = 0;
        if (this.E) {
            this.G = false;
            return;
        }
        C0103a c0103a = this.f17026s;
        Objects.requireNonNull(c0103a);
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i11 = (int) (currentAnimationTimeMillis - c0103a.f17037e);
        int i12 = c0103a.f17034b;
        if (i11 > i12) {
            i10 = i12;
        } else if (i11 >= 0) {
            i10 = i11;
        }
        c0103a.f17041i = i10;
        c0103a.f17040h = c0103a.a(currentAnimationTimeMillis);
        c0103a.f17039g = currentAnimationTimeMillis;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g() {
        /*
            r9 = this;
            q0.a$a r0 = r9.f17026s
            float r1 = r0.f17036d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.f17035c
            float r2 = java.lang.Math.abs(r0)
            float r0 = r0 / r2
            int r0 = (int) r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L53
            r4 = r9
            q0.g r4 = (q0.g) r4
            android.widget.ListView r4 = r4.J
            int r5 = r4.getCount()
            if (r5 != 0) goto L23
        L21:
            r1 = r3
            goto L51
        L23:
            int r6 = r4.getChildCount()
            int r7 = r4.getFirstVisiblePosition()
            int r8 = r7 + r6
            if (r1 <= 0) goto L41
            if (r8 < r5) goto L50
            int r6 = r6 - r2
            android.view.View r1 = r4.getChildAt(r6)
            int r1 = r1.getBottom()
            int r4 = r4.getHeight()
            if (r1 > r4) goto L50
            goto L21
        L41:
            if (r1 >= 0) goto L21
            if (r7 > 0) goto L50
            android.view.View r1 = r4.getChildAt(r3)
            int r1 = r1.getTop()
            if (r1 < 0) goto L50
            goto L21
        L50:
            r1 = r2
        L51:
            if (r1 != 0) goto L54
        L53:
            r2 = r3
        L54:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.a.g():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 != 3) goto L28;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.H
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L7f
        L16:
            r5.e()
            goto L7f
        L1a:
            r5.F = r2
            r5.D = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f17028u
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.a(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f17028u
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.a(r2, r7, r6, r3)
            q0.a$a r7 = r5.f17026s
            r7.f17035c = r0
            r7.f17036d = r6
            boolean r6 = r5.G
            if (r6 != 0) goto L7f
            boolean r6 = r5.g()
            if (r6 == 0) goto L7f
            q0.a$b r6 = r5.f17029v
            if (r6 != 0) goto L61
            q0.a$b r6 = new q0.a$b
            r6.<init>()
            r5.f17029v = r6
        L61:
            r5.G = r2
            r5.E = r2
            boolean r6 = r5.D
            if (r6 != 0) goto L78
            int r6 = r5.f17032z
            if (r6 <= 0) goto L78
            android.view.View r7 = r5.f17028u
            q0.a$b r0 = r5.f17029v
            long r3 = (long) r6
            java.util.WeakHashMap<android.view.View, m0.f0> r6 = m0.z.f5921a
            m0.z.d.n(r7, r0, r3)
            goto L7d
        L78:
            q0.a$b r6 = r5.f17029v
            r6.run()
        L7d:
            r5.D = r2
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
