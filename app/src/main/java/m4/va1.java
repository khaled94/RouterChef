package m4;

import android.content.Context;
import android.view.View;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class va1 implements e71<hz0> {

    /* renamed from: a */
    public final Context f14627a;

    /* renamed from: b */
    public final yz0 f14628b;

    /* renamed from: c */
    public final kz0 f14629c;

    /* renamed from: d */
    public final om1 f14630d;

    /* renamed from: e */
    public final Executor f14631e;

    /* renamed from: f */
    public final o90 f14632f;

    /* renamed from: g */
    public final ox f14633g;

    /* renamed from: h */
    public final boolean f14634h = ((Boolean) jo.f10145d.f10148c.a(es.R5)).booleanValue();

    public va1(Context context, o90 o90Var, om1 om1Var, Executor executor, kz0 kz0Var, yz0 yz0Var, ox oxVar) {
        this.f14627a = context;
        this.f14630d = om1Var;
        this.f14629c = kz0Var;
        this.f14631e = executor;
        this.f14632f = o90Var;
        this.f14628b = yz0Var;
        this.f14633g = oxVar;
    }

    @Override // m4.e71
    public final boolean a(km1 km1Var, cm1 cm1Var) {
        gm1 gm1Var = cm1Var.f7061t;
        return (gm1Var == null || gm1Var.f8966a == null) ? false : true;
    }

    @Override // m4.e71
    public final tz1<hz0> b(final km1 km1Var, final cm1 cm1Var) {
        final c01 c01Var = new c01();
        tz1<hz0> p = mz1.p(mz1.m(null), new xy1() { // from class: m4.ra1
            @Override // m4.xy1
            public final tz1 h(Object obj) {
                va1 va1Var = va1.this;
                final cm1 cm1Var2 = cm1Var;
                km1 km1Var2 = km1Var;
                c01 c01Var2 = c01Var;
                final vd0 a10 = va1Var.f14628b.a(va1Var.f14630d.f12204e, cm1Var2, km1Var2.f10489b.f10126b);
                he0 he0Var = (he0) a10;
                he0Var.Q0(cm1Var2.T);
                View view = (View) a10;
                Objects.requireNonNull(c01Var2);
                w90 w90Var = new w90();
                final iz0 f10 = va1Var.f14629c.f(new lm0(km1Var2, cm1Var2, null), new jz0(new ua1(va1Var.f14627a, va1Var.f14628b, va1Var.f14630d, va1Var.f14632f, cm1Var2, w90Var, a10, va1Var.f14633g, va1Var.f14634h), a10));
                w90Var.a(f10);
                he0Var.D0("/reward", new by(f10.o()));
                f10.h().I0(new ep0() { // from class: m4.pa1
                    @Override // m4.ep0
                    public final void l() {
                        vd0 vd0Var = vd0.this;
                        if (vd0Var.q0() != null) {
                            ((ce0) vd0Var.q0()).s();
                        }
                    }
                }, u90.f14299f);
                f10.r().a(a10, true, va1Var.f14634h ? va1Var.f14633g : null);
                f10.r();
                gm1 gm1Var = cm1Var2.f7061t;
                return mz1.o(xz0.b(a10, gm1Var.f8967b, gm1Var.f8966a), new cu1() { // from class: m4.qa1
                    @Override // m4.cu1
                    public final Object a(Object obj2) {
                        vd0 vd0Var = vd0.this;
                        cm1 cm1Var3 = cm1Var2;
                        iz0 iz0Var = f10;
                        if (cm1Var3.J) {
                            vd0Var.a0();
                        }
                        vd0Var.t0();
                        vd0Var.onPause();
                        return iz0Var.q();
                    }
                }, va1Var.f14631e);
            }
        }, this.f14631e);
        ((my1) p).b(new yd0(c01Var, 3), this.f14631e);
        return p;
    }
}
