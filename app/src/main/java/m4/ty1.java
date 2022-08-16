package m4;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class ty1 extends x50 {

    /* renamed from: a */
    public final AtomicReferenceFieldUpdater<vy1<?>, Set<Throwable>> f14206a;

    /* renamed from: b */
    public final AtomicIntegerFieldUpdater<vy1<?>> f14207b;

    public ty1(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.f14206a = atomicReferenceFieldUpdater;
        this.f14207b = atomicIntegerFieldUpdater;
    }

    @Override // m4.x50
    public final int a(vy1<?> vy1Var) {
        return this.f14207b.decrementAndGet(vy1Var);
    }

    @Override // m4.x50
    public final void g(vy1 vy1Var, Set set) {
        AtomicReferenceFieldUpdater<vy1<?>, Set<Throwable>> atomicReferenceFieldUpdater = this.f14206a;
        while (!atomicReferenceFieldUpdater.compareAndSet(vy1Var, null, set) && atomicReferenceFieldUpdater.get(vy1Var) == null) {
        }
    }
}
