package m4;

import android.content.Context;
import android.view.View;
import b7.b;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class p71 implements e71<ck0> {

    /* renamed from: a */
    public final zj0 f12421a;

    /* renamed from: b */
    public final yz0 f12422b;

    /* renamed from: c */
    public final om1 f12423c;

    /* renamed from: d */
    public final Executor f12424d;

    /* renamed from: e */
    public final o90 f12425e;

    /* renamed from: f */
    public final ox f12426f;

    /* renamed from: g */
    public final boolean f12427g = ((Boolean) jo.f10145d.f10148c.a(es.R5)).booleanValue();

    public p71(zj0 zj0Var, Context context, Executor executor, yz0 yz0Var, om1 om1Var, o90 o90Var, ox oxVar) {
        this.f12421a = zj0Var;
        this.f12424d = executor;
        this.f12422b = yz0Var;
        this.f12423c = om1Var;
        this.f12425e = o90Var;
        this.f12426f = oxVar;
    }

    @Override // m4.e71
    public final boolean a(km1 km1Var, cm1 cm1Var) {
        gm1 gm1Var = cm1Var.f7061t;
        return (gm1Var == null || gm1Var.f8966a == null) ? false : true;
    }

    @Override // m4.e71
    public final tz1<ck0> b(final km1 km1Var, final cm1 cm1Var) {
        final c01 c01Var = new c01();
        tz1<ck0> p = mz1.p(mz1.m(null), new xy1() { // from class: m4.o71
            @Override // m4.xy1
            public final tz1 h(Object obj) {
                p71 p71Var = p71.this;
                final cm1 cm1Var2 = cm1Var;
                km1 km1Var2 = km1Var;
                c01 c01Var2 = c01Var;
                final vd0 a10 = p71Var.f12422b.a(p71Var.f12423c.f12204e, cm1Var2, km1Var2.f10489b.f10126b);
                ((he0) a10).Q0(cm1Var2.T);
                View view = (View) a10;
                Objects.requireNonNull(c01Var2);
                w90 w90Var = new w90();
                final yj0 b10 = p71Var.f12421a.b(new lm0(km1Var2, cm1Var2, null), new ct0(new q71(p71Var.f12425e, w90Var, cm1Var2, a10, p71Var.f12423c, p71Var.f12427g, p71Var.f12426f), a10), new b(cm1Var2.X));
                b10.p().a(a10, false, p71Var.f12427g ? p71Var.f12426f : null);
                w90Var.a(b10);
                b10.h().I0(new ep0() { // from class: m4.m71
                    @Override // m4.ep0
                    public final void l() {
                        vd0 vd0Var = vd0.this;
                        if (vd0Var.q0() != null) {
                            ((ce0) vd0Var.q0()).s();
                        }
                    }
                }, u90.f14299f);
                b10.p();
                gm1 gm1Var = cm1Var2.f7061t;
                return mz1.o(xz0.b(a10, gm1Var.f8967b, gm1Var.f8966a), new cu1() { // from class: m4.n71
                    @Override // m4.cu1
                    public final Object a(Object obj2) {
                        vd0 vd0Var = vd0.this;
                        cm1 cm1Var3 = cm1Var2;
                        yj0 yj0Var = b10;
                        if (cm1Var3.J) {
                            vd0Var.a0();
                        }
                        vd0Var.t0();
                        vd0Var.onPause();
                        return yj0Var.n();
                    }
                }, p71Var.f12424d);
            }
        }, this.f12424d);
        ((my1) p).b(new cj(c01Var, 6), this.f12424d);
        return p;
    }
}
