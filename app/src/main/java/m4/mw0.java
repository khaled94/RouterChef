package m4;

import r.a;

/* loaded from: classes.dex */
public final class mw0 implements ep0 {

    /* renamed from: s */
    public final ev0 f11327s;

    /* renamed from: t */
    public final iv0 f11328t;

    public mw0(ev0 ev0Var, iv0 iv0Var) {
        this.f11327s = ev0Var;
        this.f11328t = iv0Var;
    }

    @Override // m4.ep0
    public final void l() {
        if (this.f11327s.s() == null) {
            return;
        }
        vd0 o10 = this.f11327s.o();
        vd0 p = this.f11327s.p();
        if (o10 == null) {
            o10 = p != null ? p : null;
        }
        if (!this.f11328t.b() || o10 == null) {
            return;
        }
        o10.a("onSdkImpression", new a());
    }
}
