package m4;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class t71 implements e71<xj0> {

    /* renamed from: a */
    public final sj0 f13943a;

    /* renamed from: b */
    public final Context f13944b;

    /* renamed from: c */
    public final yz0 f13945c;

    /* renamed from: d */
    public final Executor f13946d;

    public t71(sj0 sj0Var, Context context, Executor executor, yz0 yz0Var) {
        this.f13944b = context;
        this.f13943a = sj0Var;
        this.f13946d = executor;
        this.f13945c = yz0Var;
    }

    @Override // m4.e71
    public final boolean a(km1 km1Var, cm1 cm1Var) {
        gm1 gm1Var = cm1Var.f7061t;
        return (gm1Var == null || gm1Var.f8966a == null) ? false : true;
    }

    @Override // m4.e71
    public final tz1<xj0> b(final km1 km1Var, final cm1 cm1Var) {
        return mz1.p(mz1.m(null), new xy1() { // from class: m4.s71
            @Override // m4.xy1
            public final tz1 h(Object obj) {
                t71 t71Var = t71.this;
                km1 km1Var2 = km1Var;
                cm1 cm1Var2 = cm1Var;
                on a10 = ql.a(t71Var.f13944b, cm1Var2.f7063v);
                final vd0 a11 = t71Var.f13945c.a(a10, cm1Var2, km1Var2.f10489b.f10126b);
                oj0 b10 = t71Var.f13943a.b(new lm0(km1Var2, cm1Var2, null), new pj0((View) a11, a11, ql.e(a10), cm1Var2.X, cm1Var2.f7035b0, cm1Var2.L));
                b10.p().a(a11, false, null);
                cp0 h10 = b10.h();
                ep0 ep0Var = new ep0() { // from class: m4.r71
                    @Override // m4.ep0
                    public final void l() {
                        vd0 vd0Var = vd0.this;
                        if (vd0Var.q0() != null) {
                            ((ce0) vd0Var.q0()).s();
                        }
                    }
                };
                t90 t90Var = u90.f14299f;
                h10.I0(ep0Var, t90Var);
                b10.p();
                gm1 gm1Var = cm1Var2.f7061t;
                return mz1.o(xz0.b(a11, gm1Var.f8967b, gm1Var.f8966a), new ww(b10, 1), t90Var);
            }
        }, this.f13946d);
    }
}
