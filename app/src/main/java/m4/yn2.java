package m4;

import android.util.Log;
import android.view.Display;
import android.view.Surface;

/* loaded from: classes.dex */
public final class yn2 {

    /* renamed from: a */
    public final pn2 f15854a = new pn2();

    /* renamed from: b */
    public final vn2 f15855b;

    /* renamed from: c */
    public final xn2 f15856c;

    /* renamed from: d */
    public boolean f15857d;

    /* renamed from: e */
    public Surface f15858e;

    /* renamed from: f */
    public float f15859f;

    /* renamed from: g */
    public float f15860g;

    /* renamed from: h */
    public float f15861h;

    /* renamed from: i */
    public float f15862i;

    /* renamed from: j */
    public int f15863j;

    /* renamed from: k */
    public long f15864k;

    /* renamed from: l */
    public long f15865l;

    /* renamed from: m */
    public long f15866m;

    /* renamed from: n */
    public long f15867n;

    /* renamed from: o */
    public long f15868o;
    public long p;

    /* renamed from: q */
    public long f15869q;

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public yn2(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            m4.pn2 r0 = new m4.pn2
            r0.<init>()
            r3.f15854a = r0
            r0 = 0
            if (r4 == 0) goto L3c
            android.content.Context r4 = r4.getApplicationContext()
            int r1 = m4.ls1.f10971a
            r2 = 17
            if (r1 < r2) goto L27
            java.lang.String r1 = "display"
            java.lang.Object r1 = r4.getSystemService(r1)
            android.hardware.display.DisplayManager r1 = (android.hardware.display.DisplayManager) r1
            if (r1 == 0) goto L27
            m4.wn2 r2 = new m4.wn2
            r2.<init>(r1)
            goto L28
        L27:
            r2 = r0
        L28:
            if (r2 != 0) goto L3d
            java.lang.String r1 = "window"
            java.lang.Object r4 = r4.getSystemService(r1)
            android.view.WindowManager r4 = (android.view.WindowManager) r4
            if (r4 == 0) goto L3c
            m4.h7 r1 = new m4.h7
            r2 = 5
            r1.<init>(r4, r2)
            r2 = r1
            goto L3d
        L3c:
            r2 = r0
        L3d:
            r3.f15855b = r2
            if (r2 == 0) goto L43
            m4.xn2 r0 = m4.xn2.f15425w
        L43:
            r3.f15856c = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.f15864k = r0
            r3.f15865l = r0
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.f15859f = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.f15862i = r4
            r4 = 0
            r3.f15863j = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.yn2.<init>(android.content.Context):void");
    }

    public static /* synthetic */ void a(yn2 yn2Var, Display display) {
        long j3;
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            yn2Var.f15864k = refreshRate;
            j3 = (refreshRate * 80) / 100;
        } else {
            Log.w("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j3 = -9223372036854775807L;
            yn2Var.f15864k = -9223372036854775807L;
        }
        yn2Var.f15865l = j3;
    }

    public final void b() {
        Surface surface;
        if (ls1.f10971a < 30 || (surface = this.f15858e) == null || this.f15863j == Integer.MIN_VALUE || this.f15861h == 0.0f) {
            return;
        }
        this.f15861h = 0.0f;
        un2.a(surface, 0.0f);
    }

    public final void c() {
        this.f15866m = 0L;
        this.p = -1L;
        this.f15867n = -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:
        if (java.lang.Math.abs(r0 - r10.f15860g) >= r2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0089, code lost:
        if (r10.f15854a.f12584e >= 30) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008c, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008d, code lost:
        if (r5 == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0090, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            r10 = this;
            int r0 = m4.ls1.f10971a
            r1 = 30
            if (r0 < r1) goto L96
            android.view.Surface r0 = r10.f15858e
            if (r0 != 0) goto Lc
            goto L96
        Lc:
            m4.pn2 r0 = r10.f15854a
            boolean r0 = r0.a()
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 == 0) goto L39
            m4.pn2 r0 = r10.f15854a
            m4.on2 r3 = r0.f12580a
            boolean r3 = r3.c()
            if (r3 == 0) goto L37
            r3 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            m4.on2 r0 = r0.f12580a
            long r5 = r0.f12234e
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L30
            goto L33
        L30:
            long r7 = r0.f12235f
            long r7 = r7 / r5
        L33:
            double r5 = (double) r7
            double r3 = r3 / r5
            float r0 = (float) r3
            goto L3b
        L37:
            r0 = r2
            goto L3b
        L39:
            float r0 = r10.f15859f
        L3b:
            float r3 = r10.f15860g
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 != 0) goto L42
            return
        L42:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L83
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L83
            m4.pn2 r1 = r10.f15854a
            boolean r1 = r1.a()
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L76
            m4.pn2 r1 = r10.f15854a
            m4.on2 r3 = r1.f12580a
            boolean r3 = r3.c()
            if (r3 == 0) goto L65
            m4.on2 r1 = r1.f12580a
            long r3 = r1.f12235f
            goto L6a
        L65:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L6a:
            r7 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 < 0) goto L76
            r2 = 1017370378(0x3ca3d70a, float:0.02)
        L76:
            float r1 = r10.f15860g
            float r1 = r0 - r1
            float r1 = java.lang.Math.abs(r1)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L8c
            goto L8d
        L83:
            if (r4 != 0) goto L91
            m4.pn2 r2 = r10.f15854a
            int r2 = r2.f12584e
            if (r2 < r1) goto L8c
            goto L8d
        L8c:
            r5 = r6
        L8d:
            if (r5 == 0) goto L90
            goto L91
        L90:
            return
        L91:
            r10.f15860g = r0
            r10.e(r6)
        L96:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.yn2.d():void");
    }

    public final void e(boolean z10) {
        Surface surface;
        if (ls1.f10971a < 30 || (surface = this.f15858e) == null || this.f15863j == Integer.MIN_VALUE) {
            return;
        }
        float f10 = 0.0f;
        if (this.f15857d) {
            float f11 = this.f15860g;
            if (f11 != -1.0f) {
                f10 = this.f15862i * f11;
            }
        }
        if (!z10 && this.f15861h == f10) {
            return;
        }
        this.f15861h = f10;
        un2.a(surface, f10);
    }
}
