package m4;

import h4.a;

/* loaded from: classes.dex */
public final class nr0 implements nd2<ba1> {

    /* renamed from: a */
    public final dr0 f11894a;

    /* renamed from: b */
    public final vd2<a> f11895b;

    /* renamed from: c */
    public final vd2<ca1> f11896c;

    /* renamed from: d */
    public final vd2<j71> f11897d;

    /* renamed from: e */
    public final vd2<zp1> f11898e;

    public nr0(dr0 dr0Var, vd2<a> vd2Var, vd2<ca1> vd2Var2, vd2<j71> vd2Var3, vd2<zp1> vd2Var4) {
        this.f11894a = dr0Var;
        this.f11895b = vd2Var;
        this.f11896c = vd2Var2;
        this.f11897d = vd2Var3;
        this.f11898e = vd2Var4;
    }

    @Override // m4.vd2
    public final Object a() {
        dr0 dr0Var = this.f11894a;
        a a10 = this.f11895b.a();
        ca1 a11 = ((da1) this.f11896c).a();
        j71 a12 = this.f11897d.a();
        zp1 a13 = this.f11898e.a();
        if (dr0Var.f7611q == null) {
            dr0Var.f7611q = new ba1(a10, a11, a12, a13);
        }
        ba1 ba1Var = dr0Var.f7611q;
        d.a.d(ba1Var);
        return ba1Var;
    }
}
