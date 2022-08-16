package m4;

import java.lang.Throwable;

/* loaded from: classes.dex */
public final class xx1<V, X extends Throwable> extends zx1<V, X, xy1<? super X, ? extends V>, tz1<? extends V>> {
    public xx1(tz1<? extends V> tz1Var, Class<X> cls, xy1<? super X, ? extends V> xy1Var) {
        super(tz1Var, cls, xy1Var);
    }

    @Override // m4.zx1
    public final /* bridge */ /* synthetic */ Object s(Object obj, Throwable th) {
        xy1 xy1Var = (xy1) obj;
        tz1 h10 = xy1Var.h(th);
        hu1.d(h10, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", xy1Var);
        return h10;
    }

    @Override // m4.zx1
    public final /* synthetic */ void t(Object obj) {
        n((tz1) obj);
    }
}
