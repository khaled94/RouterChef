package m4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public final class ey1 extends ay1 {

    /* renamed from: a */
    public final AtomicReferenceFieldUpdater<ly1, Thread> f8301a;

    /* renamed from: b */
    public final AtomicReferenceFieldUpdater<ly1, ly1> f8302b;

    /* renamed from: c */
    public final AtomicReferenceFieldUpdater<my1, ly1> f8303c;

    /* renamed from: d */
    public final AtomicReferenceFieldUpdater<my1, dy1> f8304d;

    /* renamed from: e */
    public final AtomicReferenceFieldUpdater<my1, Object> f8305e;

    public ey1(AtomicReferenceFieldUpdater<ly1, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<ly1, ly1> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<my1, ly1> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<my1, dy1> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<my1, Object> atomicReferenceFieldUpdater5) {
        this.f8301a = atomicReferenceFieldUpdater;
        this.f8302b = atomicReferenceFieldUpdater2;
        this.f8303c = atomicReferenceFieldUpdater3;
        this.f8304d = atomicReferenceFieldUpdater4;
        this.f8305e = atomicReferenceFieldUpdater5;
    }

    @Override // m4.ay1
    public final void a(ly1 ly1Var, @CheckForNull ly1 ly1Var2) {
        this.f8302b.lazySet(ly1Var, ly1Var2);
    }

    @Override // m4.ay1
    public final void b(ly1 ly1Var, Thread thread) {
        this.f8301a.lazySet(ly1Var, thread);
    }

    @Override // m4.ay1
    public final boolean c(my1<?> my1Var, @CheckForNull dy1 dy1Var, dy1 dy1Var2) {
        AtomicReferenceFieldUpdater<my1, dy1> atomicReferenceFieldUpdater = this.f8304d;
        while (!atomicReferenceFieldUpdater.compareAndSet(my1Var, dy1Var, dy1Var2)) {
            if (atomicReferenceFieldUpdater.get(my1Var) != dy1Var) {
                return false;
            }
        }
        return true;
    }

    @Override // m4.ay1
    public final boolean d(my1<?> my1Var, @CheckForNull Object obj, Object obj2) {
        AtomicReferenceFieldUpdater<my1, Object> atomicReferenceFieldUpdater = this.f8305e;
        while (!atomicReferenceFieldUpdater.compareAndSet(my1Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(my1Var) != obj) {
                return false;
            }
        }
        return true;
    }

    @Override // m4.ay1
    public final boolean e(my1<?> my1Var, @CheckForNull ly1 ly1Var, @CheckForNull ly1 ly1Var2) {
        AtomicReferenceFieldUpdater<my1, ly1> atomicReferenceFieldUpdater = this.f8303c;
        while (!atomicReferenceFieldUpdater.compareAndSet(my1Var, ly1Var, ly1Var2)) {
            if (atomicReferenceFieldUpdater.get(my1Var) != ly1Var) {
                return false;
            }
        }
        return true;
    }
}
