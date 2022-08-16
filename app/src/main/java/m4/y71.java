package m4;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import n3.u;
import n3.v;
import z3.k;

/* loaded from: classes.dex */
public final class y71 implements e71<ik0> {

    /* renamed from: a */
    public final dl0 f15603a;

    /* renamed from: b */
    public final Context f15604b;

    /* renamed from: c */
    public final yz0 f15605c;

    /* renamed from: d */
    public final om1 f15606d;

    /* renamed from: e */
    public final Executor f15607e;

    /* renamed from: f */
    public final cu1<cm1, v> f15608f;

    public y71(dl0 dl0Var, Context context, Executor executor, yz0 yz0Var, om1 om1Var, cu1<cm1, v> cu1Var) {
        this.f15604b = context;
        this.f15603a = dl0Var;
        this.f15607e = executor;
        this.f15605c = yz0Var;
        this.f15606d = om1Var;
        this.f15608f = cu1Var;
    }

    @Override // m4.e71
    public final boolean a(km1 km1Var, cm1 cm1Var) {
        gm1 gm1Var = cm1Var.f7061t;
        return (gm1Var == null || gm1Var.f8966a == null) ? false : true;
    }

    @Override // m4.e71
    public final tz1<ik0> b(final km1 km1Var, final cm1 cm1Var) {
        return mz1.p(mz1.m(null), new xy1() { // from class: m4.x71
            @Override // m4.xy1
            public final tz1 h(Object obj) {
                View view;
                y71 y71Var = y71.this;
                km1 km1Var2 = km1Var;
                cm1 cm1Var2 = cm1Var;
                on a10 = ql.a(y71Var.f15604b, cm1Var2.f7063v);
                final vd0 a11 = y71Var.f15605c.a(a10, cm1Var2, km1Var2.f10489b.f10126b);
                ((he0) a11).Q0(cm1Var2.T);
                if (!((Boolean) jo.f10145d.f10148c.a(es.f8070c5)).booleanValue() || !cm1Var2.f7041e0) {
                    view = new b01(y71Var.f15604b, (View) a11, y71Var.f15608f.a(cm1Var2));
                } else {
                    view = ql0.a(y71Var.f15604b, (View) a11, cm1Var2);
                }
                final jk0 a12 = y71Var.f15603a.a(new lm0(km1Var2, cm1Var2, null), new qk0(view, a11, new bs(a11), ql.e(a10)));
                ((lg0) a12).f10791g1.a().a(a11, false, null);
                cp0 h10 = a12.h();
                ep0 ep0Var = new ep0() { // from class: m4.v71
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
                ((lg0) a12).f10791g1.a();
                gm1 gm1Var = cm1Var2.f7061t;
                tz1<?> b10 = xz0.b(a11, gm1Var.f8967b, gm1Var.f8966a);
                if (cm1Var2.J) {
                    ((w90) b10).b(new u(a11, 2), y71Var.f15607e);
                }
                ((w90) b10).b(new k(y71Var, a11, 5), y71Var.f15607e);
                return mz1.o(b10, new cu1() { // from class: m4.w71
                    @Override // m4.cu1
                    public final Object a(Object obj2) {
                        return jk0.this.n();
                    }
                }, t90Var);
            }
        }, this.f15607e);
    }
}
