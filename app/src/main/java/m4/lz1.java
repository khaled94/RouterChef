package m4;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class lz1<V> {

    /* renamed from: a */
    public final boolean f11052a;

    /* renamed from: b */
    public final gw1<tz1<? extends V>> f11053b;

    public /* synthetic */ lz1(boolean z10, gw1 gw1Var) {
        this.f11052a = z10;
        this.f11053b = gw1Var;
    }

    public final <C> tz1<C> a(Callable<C> callable, Executor executor) {
        return new cz1(this.f11053b, this.f11052a, executor, callable);
    }
}
