package m4;

import t3.w;

/* loaded from: classes.dex */
public final class z1 implements u1 {

    /* renamed from: l */
    public static final float[] f15962l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a */
    public final w f15963a;

    /* renamed from: f */
    public y1 f15968f;

    /* renamed from: g */
    public long f15969g;

    /* renamed from: h */
    public String f15970h;

    /* renamed from: i */
    public mp2 f15971i;

    /* renamed from: j */
    public boolean f15972j;

    /* renamed from: c */
    public final boolean[] f15965c = new boolean[4];

    /* renamed from: d */
    public final x1 f15966d = new x1();

    /* renamed from: k */
    public long f15973k = -9223372036854775807L;

    /* renamed from: e */
    public final h2 f15967e = new h2(178);

    /* renamed from: b */
    public final dd f15964b = new dd();

    public z1(w wVar) {
        this.f15963a = wVar;
    }

    @Override // m4.u1
    public final void b() {
        bg1.e(this.f15965c);
        this.f15966d.b();
        y1 y1Var = this.f15968f;
        if (y1Var != null) {
            y1Var.f15559b = false;
            y1Var.f15560c = false;
            y1Var.f15561d = false;
            y1Var.f15562e = -1;
        }
        this.f15967e.b();
        this.f15969g = 0L;
        this.f15973k = -9223372036854775807L;
    }

    @Override // m4.u1
    public final void c() {
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0284 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0190  */
    @Override // m4.u1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(m4.dd r25) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.z1.d(m4.dd):void");
    }

    @Override // m4.u1
    public final void e(vo2 vo2Var, a3 a3Var) {
        a3Var.c();
        this.f15970h = a3Var.b();
        mp2 p = vo2Var.p(a3Var.a(), 2);
        this.f15971i = p;
        this.f15968f = new y1(p);
        this.f15963a.e(vo2Var, a3Var);
    }

    @Override // m4.u1
    public final void f(long j3, int i10) {
        if (j3 != -9223372036854775807L) {
            this.f15973k = j3;
        }
    }
}
