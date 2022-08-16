package m4;

/* loaded from: classes.dex */
public final class b2 implements u1 {

    /* renamed from: a */
    public final s2 f6328a;

    /* renamed from: e */
    public long f6332e;

    /* renamed from: g */
    public String f6334g;

    /* renamed from: h */
    public mp2 f6335h;

    /* renamed from: i */
    public a2 f6336i;

    /* renamed from: j */
    public boolean f6337j;

    /* renamed from: l */
    public boolean f6339l;

    /* renamed from: f */
    public final boolean[] f6333f = new boolean[3];

    /* renamed from: b */
    public final h2 f6329b = new h2(7);

    /* renamed from: c */
    public final h2 f6330c = new h2(8);

    /* renamed from: d */
    public final h2 f6331d = new h2(6);

    /* renamed from: k */
    public long f6338k = -9223372036854775807L;

    /* renamed from: m */
    public final dd f6340m = new dd();

    public b2(s2 s2Var) {
        this.f6328a = s2Var;
    }

    @Override // m4.u1
    public final void b() {
        this.f6332e = 0L;
        this.f6339l = false;
        this.f6338k = -9223372036854775807L;
        bg1.e(this.f6333f);
        this.f6329b.b();
        this.f6330c.b();
        this.f6331d.b();
        a2 a2Var = this.f6336i;
        if (a2Var != null) {
            a2Var.f6017g = false;
        }
    }

    @Override // m4.u1
    public final void c() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d4 A[SYNTHETIC] */
    @Override // m4.u1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(m4.dd r26) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.b2.d(m4.dd):void");
    }

    @Override // m4.u1
    public final void e(vo2 vo2Var, a3 a3Var) {
        a3Var.c();
        this.f6334g = a3Var.b();
        mp2 p = vo2Var.p(a3Var.a(), 2);
        this.f6335h = p;
        this.f6336i = new a2(p);
        this.f6328a.b(vo2Var, a3Var);
    }

    @Override // m4.u1
    public final void f(long j3, int i10) {
        if (j3 != -9223372036854775807L) {
            this.f6338k = j3;
        }
        this.f6339l |= (i10 & 2) != 0;
    }
}
