package m4;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class oo1 {

    /* renamed from: a */
    public final Object f12244a;

    /* renamed from: b */
    public final List<tz1<?>> f12245b;

    /* renamed from: c */
    public final /* synthetic */ uo1 f12246c;

    public /* synthetic */ oo1(uo1 uo1Var, Object obj, List list) {
        this.f12246c = uo1Var;
        this.f12244a = obj;
        this.f12245b = list;
    }

    public final <O> to1<O> a(Callable<O> callable) {
        lz1 e10 = mz1.e(this.f12245b);
        tz1 a10 = e10.a(no1.f11879a, u90.f14299f);
        uo1 uo1Var = this.f12246c;
        return new to1<>(uo1Var, this.f12244a, a10, this.f12245b, e10.a(callable, uo1Var.f14465a));
    }
}
