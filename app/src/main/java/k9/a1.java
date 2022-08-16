package k9;

import x8.f;

/* loaded from: classes.dex */
public final class a1 extends q {

    /* renamed from: t */
    public static final a1 f5638t = new a1();

    @Override // k9.q
    public final void m0(f fVar, Runnable runnable) {
        if (((d1) fVar.get(d1.f5644s)) != null) {
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // k9.q
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
