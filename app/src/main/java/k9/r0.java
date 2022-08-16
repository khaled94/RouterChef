package k9;

import d0.b;
import e9.f;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import v8.g;

/* loaded from: classes.dex */
public abstract class r0 extends o implements c0, j0 {

    /* renamed from: v */
    public s0 f5682v;

    @Override // k9.j0
    public final boolean b() {
        return true;
    }

    @Override // k9.c0
    public final void d() {
        boolean z10;
        s0 n10 = n();
        do {
            Object o10 = n10.o();
            if (!(o10 instanceof r0)) {
                if (!(o10 instanceof j0) || ((j0) o10).e() == null) {
                    return;
                }
                l();
                return;
            } else if (o10 == this) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s0.f5684s;
                d0 d0Var = b.F;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(n10, o10, d0Var)) {
                        if (atomicReferenceFieldUpdater.get(n10) != o10) {
                            z10 = false;
                            continue;
                            break;
                        }
                    } else {
                        z10 = true;
                        continue;
                        break;
                    }
                }
            } else {
                return;
            }
        } while (!z10);
    }

    @Override // k9.j0
    public final u0 e() {
        return null;
    }

    public final s0 n() {
        s0 s0Var = this.f5682v;
        if (s0Var != null) {
            return s0Var;
        }
        g gVar = new g("lateinit property job has not been initialized");
        f.i(gVar, f.class.getName());
        throw gVar;
    }

    @Override // n9.h
    public final String toString() {
        return getClass().getSimpleName() + '@' + u.b(this) + "[job@" + u.b(n()) + ']';
    }
}
