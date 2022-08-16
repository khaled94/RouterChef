package m4;

import d.a;
import g1.l;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class m81 implements e71<ik0> {

    /* renamed from: a */
    public final dl0 f11109a;

    /* renamed from: b */
    public final y71 f11110b;

    /* renamed from: c */
    public final uz1 f11111c;

    /* renamed from: d */
    public final uo0 f11112d;

    /* renamed from: e */
    public final ScheduledExecutorService f11113e;

    public m81(dl0 dl0Var, y71 y71Var, uo0 uo0Var, ScheduledExecutorService scheduledExecutorService, uz1 uz1Var) {
        this.f11109a = dl0Var;
        this.f11110b = y71Var;
        this.f11112d = uo0Var;
        this.f11113e = scheduledExecutorService;
        this.f11111c = uz1Var;
    }

    @Override // m4.e71
    public final boolean a(km1 km1Var, cm1 cm1Var) {
        return ((om1) km1Var.f10488a.f8363t).a() != null && this.f11110b.a(km1Var, cm1Var);
    }

    @Override // m4.e71
    public final tz1<ik0> b(final km1 km1Var, final cm1 cm1Var) {
        return this.f11111c.Z(new Callable() { // from class: m4.l81
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final m81 m81Var = m81.this;
                final km1 km1Var2 = km1Var;
                final cm1 cm1Var2 = cm1Var;
                ml0 a10 = m81Var.f11109a.b(new lm0(km1Var2, cm1Var2, null), new l(((om1) km1Var2.f10488a.f8363t).a(), new Runnable() { // from class: m4.k81
                    @Override // java.lang.Runnable
                    public final void run() {
                        m81 m81Var2 = m81.this;
                        km1 km1Var3 = km1Var2;
                        cm1 cm1Var3 = cm1Var2;
                        mz1.t(mz1.q(m81Var2.f11110b.b(km1Var3, cm1Var3), cm1Var3.O, TimeUnit.SECONDS, m81Var2.f11113e), new i7(m81Var2, 2), m81Var2.f11111c);
                    }
                })).p.a();
                a.d(a10);
                return a10;
            }
        });
    }
}
