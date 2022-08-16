package m4;

import e1.h;

/* loaded from: classes.dex */
public final class f2 implements u1 {

    /* renamed from: a */
    public final String f8323a;

    /* renamed from: b */
    public final dd f8324b;

    /* renamed from: c */
    public final nl1 f8325c;

    /* renamed from: d */
    public mp2 f8326d;

    /* renamed from: e */
    public String f8327e;

    /* renamed from: f */
    public t f8328f;

    /* renamed from: g */
    public int f8329g;

    /* renamed from: h */
    public int f8330h;

    /* renamed from: i */
    public int f8331i;

    /* renamed from: j */
    public int f8332j;

    /* renamed from: k */
    public long f8333k = -9223372036854775807L;

    /* renamed from: l */
    public boolean f8334l;

    /* renamed from: m */
    public int f8335m;

    /* renamed from: n */
    public int f8336n;

    /* renamed from: o */
    public int f8337o;
    public boolean p;

    /* renamed from: q */
    public long f8338q;

    /* renamed from: r */
    public int f8339r;

    /* renamed from: s */
    public long f8340s;

    /* renamed from: t */
    public int f8341t;

    /* renamed from: u */
    public String f8342u;

    public f2(String str) {
        this.f8323a = str;
        dd ddVar = new dd(1024);
        this.f8324b = ddVar;
        byte[] bArr = (byte[]) ddVar.f7311d;
        this.f8325c = new nl1(bArr, bArr.length);
    }

    public static long g(nl1 nl1Var) {
        return nl1Var.c((nl1Var.c(2) + 1) * 8);
    }

    public final int a(nl1 nl1Var) {
        int a10 = nl1Var.a();
        go2 e10 = h.e(nl1Var, true);
        this.f8342u = e10.f8994c;
        this.f8339r = e10.f8992a;
        this.f8341t = e10.f8993b;
        return a10 - nl1Var.a();
    }

    @Override // m4.u1
    public final void b() {
        this.f8329g = 0;
        this.f8333k = -9223372036854775807L;
        this.f8334l = false;
    }

    @Override // m4.u1
    public final void c() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x014a, code lost:
        if (r14.f8334l == false) goto L100;
     */
    @Override // m4.u1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(m4.dd r15) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.f2.d(m4.dd):void");
    }

    @Override // m4.u1
    public final void e(vo2 vo2Var, a3 a3Var) {
        a3Var.c();
        this.f8326d = vo2Var.p(a3Var.a(), 1);
        this.f8327e = a3Var.b();
    }

    @Override // m4.u1
    public final void f(long j3, int i10) {
        if (j3 != -9223372036854775807L) {
            this.f8333k = j3;
        }
    }
}
