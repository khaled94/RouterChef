package m4;

import c4.s;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class jm0 implements kz1, ye0 {

    /* renamed from: s */
    public final /* synthetic */ Object f10123s;

    /* renamed from: t */
    public final /* synthetic */ Object f10124t;

    public /* synthetic */ jm0(c01 c01Var, vd0 vd0Var) {
        this.f10123s = c01Var;
        this.f10124t = vd0Var;
    }

    public /* synthetic */ jm0(km0 km0Var, kz1 kz1Var) {
        this.f10124t = km0Var;
        this.f10123s = kz1Var;
    }

    @Override // m4.ye0
    public final void J(boolean z10) {
        vd0 vd0Var = (vd0) this.f10124t;
        Objects.requireNonNull((c01) this.f10123s);
        vd0Var.t0();
        ((ce0) vd0Var.q0()).s();
    }

    @Override // m4.kz1
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        final km0 km0Var = (km0) this.f10124t;
        List<? extends tz1<? extends am0>> list = ((hm0) obj).f9378a;
        final kz1 kz1Var = (kz1) this.f10123s;
        if (list == null || list.isEmpty()) {
            km0Var.f10484a.execute(new yd0(kz1Var, 1));
            return;
        }
        tz1 m10 = mz1.m(null);
        for (final tz1<? extends am0> tz1Var : list) {
            m10 = mz1.p(mz1.j(m10, Throwable.class, new ny(kz1Var, 2), km0Var.f10484a), new xy1() { // from class: m4.im0
                @Override // m4.xy1
                public final tz1 h(Object obj2) {
                    km0 km0Var2 = km0.this;
                    kz1 kz1Var2 = kz1Var;
                    tz1 tz1Var2 = tz1Var;
                    am0 am0Var = (am0) obj2;
                    Objects.requireNonNull(km0Var2);
                    if (am0Var != null) {
                        kz1Var2.a(am0Var);
                    }
                    return mz1.q(tz1Var2, yt.f15902a.e().longValue(), TimeUnit.MILLISECONDS, km0Var2.f10485b);
                }
            }, km0Var.f10484a);
        }
        mz1.t(m10, new zb0(km0Var, kz1Var), km0Var.f10484a);
    }

    @Override // m4.kz1
    public final void f(Throwable th) {
        ((kz1) this.f10123s).f(th);
        u90.f14298e.execute(new s((km0) this.f10124t, 3));
    }
}
