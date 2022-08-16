package m4;

import d.a;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class y31 implements nd2<x31> {

    /* renamed from: a */
    public final vd2<om1> f15582a;

    /* renamed from: b */
    public final vd2<g31> f15583b;

    /* renamed from: c */
    public final vd2<ScheduledExecutorService> f15584c;

    /* renamed from: d */
    public final vd2<i61> f15585d;

    public y31(vd2 vd2Var, vd2 vd2Var2, vd2 vd2Var3, vd2 vd2Var4) {
        this.f15582a = vd2Var;
        this.f15583b = vd2Var2;
        this.f15584c = vd2Var3;
        this.f15585d = vd2Var4;
    }

    @Override // m4.vd2
    public final /* bridge */ /* synthetic */ Object a() {
        om1 b10 = ((mo0) this.f15582a).b();
        g31 a10 = ((h31) this.f15583b).a();
        t90 t90Var = u90.f14294a;
        a.d(t90Var);
        return new x31(b10, a10, t90Var, this.f15584c.a(), this.f15585d.a());
    }
}
