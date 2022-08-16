package m4;

import h2.u;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class to1<O> {

    /* renamed from: a */
    public final Object f14121a;

    /* renamed from: b */
    public final String f14122b;

    /* renamed from: c */
    public final tz1<?> f14123c;

    /* renamed from: d */
    public final List<tz1<?>> f14124d;

    /* renamed from: e */
    public final tz1<O> f14125e;

    /* renamed from: f */
    public final /* synthetic */ uo1 f14126f;

    public to1(uo1 uo1Var, uo1 uo1Var2, String str, tz1 tz1Var, List<tz1> list, tz1<O> tz1Var2) {
        this.f14126f = uo1Var;
        this.f14121a = uo1Var2;
        this.f14122b = str;
        this.f14123c = tz1Var;
        this.f14124d = list;
        this.f14125e = tz1Var2;
    }

    public /* synthetic */ to1(uo1 uo1Var, Object obj, tz1 tz1Var, List list, tz1 tz1Var2) {
        this(uo1Var, obj, null, tz1Var, list, tz1Var2);
    }

    public final mo1 a() {
        Object obj = this.f14121a;
        String str = this.f14122b;
        if (str == null) {
            Objects.requireNonNull((zo1) this.f14126f);
            str = ((wo1) obj).f15078s;
        }
        mo1 mo1Var = new mo1(obj, str, this.f14125e);
        this.f14126f.f14467c.H0(mo1Var);
        tz1<?> tz1Var = this.f14123c;
        pj1 pj1Var = new pj1(this, mo1Var, 1);
        t90 t90Var = u90.f14299f;
        tz1Var.b(pj1Var, t90Var);
        mz1.t(mo1Var, new u(this, mo1Var, 7), t90Var);
        return mo1Var;
    }

    public final to1<O> b(Object obj) {
        return this.f14126f.b(obj, a());
    }

    public final <T extends Throwable> to1<O> c(Class<T> cls, xy1<T, O> xy1Var) {
        uo1 uo1Var = this.f14126f;
        return new to1<>(uo1Var, this.f14121a, this.f14122b, this.f14123c, this.f14124d, mz1.j(this.f14125e, cls, xy1Var, uo1Var.f14465a));
    }

    public final <O2> to1<O2> d(tz1<O2> tz1Var) {
        return g(new v41(tz1Var, 1), u90.f14299f);
    }

    public final <O2> to1<O2> e(final ko1<O, O2> ko1Var) {
        return f(new xy1() { // from class: m4.ro1
            @Override // m4.xy1
            public final tz1 h(Object obj) {
                return mz1.m(ko1.this.mo30h(obj));
            }
        });
    }

    public final <O2> to1<O2> f(xy1<O, O2> xy1Var) {
        return g(xy1Var, this.f14126f.f14465a);
    }

    public final <O2> to1<O2> g(xy1<O, O2> xy1Var, Executor executor) {
        return new to1<>(this.f14126f, this.f14121a, this.f14122b, this.f14123c, this.f14124d, mz1.p(this.f14125e, xy1Var, executor));
    }

    public final to1 h(long j3) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        uo1 uo1Var = this.f14126f;
        return new to1(uo1Var, this.f14121a, this.f14122b, this.f14123c, this.f14124d, mz1.q(this.f14125e, j3, timeUnit, uo1Var.f14466b));
    }
}
