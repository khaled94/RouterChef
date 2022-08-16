package m4;

import l3.a;

/* loaded from: classes.dex */
public final class hh0 implements nq0, vj {

    /* renamed from: s */
    public final Object f9336s;

    public /* synthetic */ hh0(Object obj) {
        this.f9336s = obj;
    }

    public static final a a() {
        return new a(new hc0(), new xa0());
    }

    @Override // m4.vj
    public final void c(cl clVar) {
        ak r10 = clVar.n().r();
        rk r11 = clVar.n().x().r();
        String str = ((km1) this.f9336s).f10489b.f10126b.f8004b;
        if (r11.f9884u) {
            r11.m();
            r11.f9884u = false;
        }
        tk.x((tk) r11.f9883t, str);
        if (r10.f9884u) {
            r10.m();
            r10.f9884u = false;
        }
        bk.z((bk) r10.f9883t, r11.k());
        clVar.o(r10);
    }

    @Override // m4.nq0
    /* renamed from: h */
    public final void mo21h(Object obj) {
        ((vj1) obj).h((qn) this.f9336s);
    }
}
