package m4;

import n9.d;

/* loaded from: classes.dex */
public abstract class ha implements ya {

    /* renamed from: a */
    public final int f9152a;

    /* renamed from: b */
    public za f9153b;

    /* renamed from: c */
    public int f9154c;

    /* renamed from: d */
    public int f9155d;

    /* renamed from: e */
    public re f9156e;

    /* renamed from: f */
    public long f9157f;

    /* renamed from: g */
    public boolean f9158g = true;

    /* renamed from: h */
    public boolean f9159h;

    public ha(int i10) {
        this.f9152a = i10;
    }

    @Override // m4.ya
    public final boolean C() {
        return this.f9158g;
    }

    @Override // m4.ya
    public final void F() {
        d.i(this.f9155d == 2);
        this.f9155d = 1;
        l();
    }

    @Override // m4.ya
    public final void G(ua[] uaVarArr, re reVar, long j3) {
        d.i(!this.f9159h);
        this.f9156e = reVar;
        this.f9158g = false;
        this.f9157f = j3;
        m(uaVarArr, j3);
    }

    @Override // m4.ya
    public final void I(int i10) {
        this.f9154c = i10;
    }

    @Override // m4.ya
    public final void K(za zaVar, ua[] uaVarArr, re reVar, long j3, boolean z10, long j10) {
        d.i(this.f9155d == 0);
        this.f9153b = zaVar;
        this.f9155d = 1;
        g();
        d.i(!this.f9159h);
        this.f9156e = reVar;
        this.f9158g = false;
        this.f9157f = j10;
        m(uaVarArr, j10);
        j(j3, z10);
    }

    @Override // m4.ya
    public final void M(long j3) {
        this.f9159h = false;
        this.f9158g = false;
        j(j3, false);
    }

    @Override // m4.ya
    public final int a() {
        return this.f9155d;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x022e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(l3.h r43, m4.bc r44, boolean r45) {
        /*
            Method dump skipped, instructions count: 715
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.ha.b(l3.h, m4.bc, boolean):int");
    }

    @Override // m4.ya
    public final int c() {
        return this.f9152a;
    }

    @Override // m4.ya
    public final ha d() {
        return this;
    }

    public abstract void e();

    @Override // m4.ya
    public final re f() {
        return this.f9156e;
    }

    public abstract void g();

    @Override // m4.ya
    public pg h() {
        return null;
    }

    @Override // m4.ya
    public final void i() {
        boolean z10 = true;
        if (this.f9155d != 1) {
            z10 = false;
        }
        d.i(z10);
        this.f9155d = 0;
        this.f9156e = null;
        this.f9159h = false;
        e();
    }

    public abstract void j(long j3, boolean z10);

    public abstract void k();

    public abstract void l();

    public void m(ua[] uaVarArr, long j3) {
    }

    @Override // m4.ya
    public final void o() {
        this.f9156e.f13260b.f13614z.a();
    }

    @Override // m4.ya
    public final void q() {
        this.f9159h = true;
    }

    @Override // m4.ya
    public final void u() {
        boolean z10 = true;
        if (this.f9155d != 1) {
            z10 = false;
        }
        d.i(z10);
        this.f9155d = 2;
        k();
    }

    @Override // m4.ya
    public final boolean y() {
        return this.f9159h;
    }
}
