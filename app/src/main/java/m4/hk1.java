package m4;

import java.util.Iterator;
import m4.am0;
import m4.fo0;

/* loaded from: classes.dex */
public final class hk1<R extends fo0<AdT>, AdT extends am0> implements dl1<R, pn1<R, AdT>> {

    /* renamed from: a */
    public R f9368a;

    @Override // m4.dl1
    public final /* bridge */ /* synthetic */ tz1 a(el1 el1Var, cl1 cl1Var) {
        return b(el1Var, cl1Var, null);
    }

    public final tz1<pn1<R, AdT>> b(el1 el1Var, cl1<R> cl1Var, R r10) {
        eo0<R> b10 = cl1Var.b(el1Var.f8002b);
        b10.a(new il1());
        R f10 = b10.f();
        this.f9368a = f10;
        final wm0 a10 = f10.a();
        final pn1 pn1Var = new pn1();
        gz1 r11 = gz1.r(a10.c());
        xy1 xy1Var = new xy1() { // from class: m4.gk1
            @Override // m4.xy1
            public final tz1 h(Object obj) {
                pn1 pn1Var2 = pn1.this;
                wm0 wm0Var = a10;
                km1 km1Var = (km1) obj;
                pn1Var2.f12577b = km1Var;
                Iterator<cm1> it = km1Var.f10489b.f10125a.iterator();
                boolean z10 = false;
                loop0: while (true) {
                    if (it.hasNext()) {
                        for (String str : it.next().f7032a) {
                            if (!str.contains("FirstPartyRenderer")) {
                                break loop0;
                            }
                            z10 = true;
                        }
                    } else if (z10) {
                        return wm0Var.b(mz1.m(km1Var));
                    }
                }
                return mz1.m(null);
            }
        };
        dz1 dz1Var = dz1.f7671s;
        return mz1.o(mz1.p(r11, xy1Var, dz1Var), new cu1() { // from class: m4.fk1
            @Override // m4.cu1
            public final Object a(Object obj) {
                pn1 pn1Var2 = pn1.this;
                pn1Var2.f12578c = (AdT) obj;
                return pn1Var2;
            }
        }, dz1Var);
    }

    @Override // m4.dl1
    public final /* synthetic */ Object g() {
        return this.f9368a;
    }
}
