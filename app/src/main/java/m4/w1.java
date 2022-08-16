package m4;

import t3.w;

/* loaded from: classes.dex */
public final class w1 implements u1 {

    /* renamed from: q */
    public static final double[] f14824q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a */
    public String f14825a;

    /* renamed from: b */
    public mp2 f14826b;

    /* renamed from: c */
    public final w f14827c;

    /* renamed from: d */
    public final dd f14828d;

    /* renamed from: e */
    public final h2 f14829e;

    /* renamed from: f */
    public final boolean[] f14830f = new boolean[4];

    /* renamed from: g */
    public final v1 f14831g = new v1();

    /* renamed from: h */
    public long f14832h;

    /* renamed from: i */
    public boolean f14833i;

    /* renamed from: j */
    public boolean f14834j;

    /* renamed from: k */
    public long f14835k;

    /* renamed from: l */
    public long f14836l;

    /* renamed from: m */
    public long f14837m;

    /* renamed from: n */
    public long f14838n;

    /* renamed from: o */
    public boolean f14839o;
    public boolean p;

    public w1(w wVar) {
        dd ddVar;
        this.f14827c = wVar;
        if (wVar != null) {
            this.f14829e = new h2(178);
            ddVar = new dd();
        } else {
            ddVar = null;
            this.f14829e = null;
        }
        this.f14828d = ddVar;
        this.f14836l = -9223372036854775807L;
        this.f14838n = -9223372036854775807L;
    }

    @Override // m4.u1
    public final void b() {
        bg1.e(this.f14830f);
        v1 v1Var = this.f14831g;
        v1Var.f14550a = false;
        v1Var.f14551b = 0;
        v1Var.f14552c = 0;
        h2 h2Var = this.f14829e;
        if (h2Var != null) {
            h2Var.b();
        }
        this.f14832h = 0L;
        this.f14833i = false;
        this.f14836l = -9223372036854775807L;
        this.f14838n = -9223372036854775807L;
    }

    @Override // m4.u1
    public final void c() {
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x020f  */
    @Override // m4.u1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(m4.dd r25) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.w1.d(m4.dd):void");
    }

    @Override // m4.u1
    public final void e(vo2 vo2Var, a3 a3Var) {
        a3Var.c();
        this.f14825a = a3Var.b();
        this.f14826b = vo2Var.p(a3Var.a(), 2);
        w wVar = this.f14827c;
        if (wVar != null) {
            wVar.e(vo2Var, a3Var);
        }
    }

    @Override // m4.u1
    public final void f(long j3, int i10) {
        this.f14836l = j3;
    }
}
