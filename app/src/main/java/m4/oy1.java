package m4;

/* loaded from: classes.dex */
public final class oy1<I, O> extends qy1<I, O, xy1<? super I, ? extends O>, tz1<? extends O>> {
    public oy1(tz1<? extends I> tz1Var, xy1<? super I, ? extends O> xy1Var) {
        super(tz1Var, xy1Var);
    }

    @Override // m4.qy1
    public final /* bridge */ /* synthetic */ Object s(Object obj, Object obj2) {
        xy1 xy1Var = (xy1) obj;
        tz1<O> h10 = xy1Var.h(obj2);
        hu1.d(h10, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", xy1Var);
        return h10;
    }

    @Override // m4.qy1
    public final /* synthetic */ void t(Object obj) {
        n((tz1) obj);
    }
}
