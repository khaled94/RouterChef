package n9;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class i<E> {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16706a = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur = new j(8, false);

    public final boolean a(E e10) {
        while (true) {
            j jVar = (j) this._cur;
            int a10 = jVar.a(e10);
            if (a10 != 0) {
                if (a10 == 1) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16706a;
                    j<E> e11 = jVar.e();
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, jVar, e11) && atomicReferenceFieldUpdater.get(this) == jVar) {
                    }
                } else if (a10 == 2) {
                    return false;
                }
            } else {
                return true;
            }
        }
    }

    public final void b() {
        while (true) {
            j jVar = (j) this._cur;
            if (jVar.b()) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16706a;
            j<E> e10 = jVar.e();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, jVar, e10) && atomicReferenceFieldUpdater.get(this) == jVar) {
            }
        }
    }

    public final int c() {
        return ((j) this._cur).c();
    }

    public final E d() {
        while (true) {
            j jVar = (j) this._cur;
            E e10 = (E) jVar.f();
            if (e10 != j.f16709g) {
                return e10;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16706a;
            j<E> e11 = jVar.e();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, jVar, e11) && atomicReferenceFieldUpdater.get(this) == jVar) {
            }
        }
    }
}
