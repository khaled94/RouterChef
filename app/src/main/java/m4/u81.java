package m4;

import android.content.Context;
import android.view.View;
import c4.s;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class u81 implements e71<xs0> {

    /* renamed from: a */
    public final Context f14280a;

    /* renamed from: b */
    public final yz0 f14281b;

    /* renamed from: c */
    public final nt0 f14282c;

    /* renamed from: d */
    public final om1 f14283d;

    /* renamed from: e */
    public final Executor f14284e;

    /* renamed from: f */
    public final o90 f14285f;

    /* renamed from: g */
    public final ox f14286g;

    /* renamed from: h */
    public final boolean f14287h = ((Boolean) jo.f10145d.f10148c.a(es.R5)).booleanValue();

    public u81(Context context, o90 o90Var, om1 om1Var, Executor executor, nt0 nt0Var, yz0 yz0Var, ox oxVar) {
        this.f14280a = context;
        this.f14283d = om1Var;
        this.f14282c = nt0Var;
        this.f14284e = executor;
        this.f14285f = o90Var;
        this.f14281b = yz0Var;
        this.f14286g = oxVar;
    }

    @Override // m4.e71
    public final boolean a(km1 km1Var, cm1 cm1Var) {
        gm1 gm1Var = cm1Var.f7061t;
        return (gm1Var == null || gm1Var.f8966a == null) ? false : true;
    }

    @Override // m4.e71
    public final tz1<xs0> b(final km1 km1Var, final cm1 cm1Var) {
        final c01 c01Var = new c01();
        tz1<xs0> p = mz1.p(mz1.m(null), new xy1() { // from class: m4.s81
            @Override // m4.xy1
            public final tz1 h(Object obj) {
                u81 u81Var = u81.this;
                final cm1 cm1Var2 = cm1Var;
                km1 km1Var2 = km1Var;
                c01 c01Var2 = c01Var;
                final vd0 a10 = u81Var.f14281b.a(u81Var.f14283d.f12204e, cm1Var2, km1Var2.f10489b.f10126b);
                ((he0) a10).Q0(cm1Var2.T);
                View view = (View) a10;
                Objects.requireNonNull(c01Var2);
                w90 w90Var = new w90();
                final ys0 c10 = u81Var.f14282c.c(new lm0(km1Var2, cm1Var2, null), new ct0(new t81(u81Var.f14280a, u81Var.f14285f, w90Var, cm1Var2, a10, u81Var.f14283d, u81Var.f14287h, u81Var.f14286g), a10));
                w90Var.a(c10);
                c10.h().I0(new ep0() { // from class: m4.q81
                    @Override // m4.ep0
                    public final void l() {
                        vd0 vd0Var = vd0.this;
                        if (vd0Var.q0() != null) {
                            ((ce0) vd0Var.q0()).s();
                        }
                    }
                }, u90.f14299f);
                c10.q().a(a10, true, u81Var.f14287h ? u81Var.f14286g : null);
                c10.q();
                gm1 gm1Var = cm1Var2.f7061t;
                return mz1.o(xz0.b(a10, gm1Var.f8967b, gm1Var.f8966a), new cu1() { // from class: m4.r81
                    @Override // m4.cu1
                    public final Object a(Object obj2) {
                        vd0 vd0Var = vd0.this;
                        cm1 cm1Var3 = cm1Var2;
                        ys0 ys0Var = c10;
                        if (cm1Var3.J) {
                            vd0Var.a0();
                        }
                        vd0Var.t0();
                        vd0Var.onPause();
                        return ys0Var.o();
                    }
                }, u81Var.f14284e);
            }
        }, this.f14284e);
        ((my1) p).b(new s(c01Var, 4), this.f14284e);
        return p;
    }
}
