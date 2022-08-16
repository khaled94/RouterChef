package m4;

import androidx.fragment.app.a;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public abstract class rz1<T> extends AtomicReference<Runnable> implements Runnable {

    /* renamed from: s */
    public static final qz1 f13471s = new qz1();

    /* renamed from: t */
    public static final qz1 f13472t = new qz1();

    public abstract T a();

    public abstract String b();

    public final void c(Thread thread) {
        Runnable runnable = get();
        pz1 pz1Var = null;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (runnable instanceof pz1) {
                pz1Var = (pz1) runnable;
            } else if (runnable != f13472t) {
                break;
            }
            i10++;
            if (i10 > 1000) {
                qz1 qz1Var = f13472t;
                if (runnable == qz1Var || compareAndSet(runnable, qz1Var)) {
                    z10 = Thread.interrupted() || z10;
                    LockSupport.park(pz1Var);
                }
            } else {
                Thread.yield();
            }
            runnable = get();
        }
        if (z10) {
            thread.interrupt();
        }
    }

    public abstract void d(Throwable th);

    public abstract void e(T t10);

    public abstract boolean f();

    public final void g() {
        Runnable runnable = get();
        if (runnable instanceof Thread) {
            pz1 pz1Var = new pz1(this);
            pz1Var.setExclusiveOwnerThread(Thread.currentThread());
            if (!compareAndSet(runnable, pz1Var)) {
                return;
            }
            try {
                Thread thread = (Thread) runnable;
                thread.interrupt();
                if (getAndSet(f13471s) != f13472t) {
                    return;
                }
                LockSupport.unpark(thread);
            } catch (Throwable th) {
                if (getAndSet(f13471s) == f13472t) {
                    LockSupport.unpark((Thread) runnable);
                }
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        T t10 = null;
        if (!compareAndSet(null, currentThread)) {
            return;
        }
        boolean z10 = !f();
        if (z10) {
            try {
                t10 = a();
            } catch (Throwable th) {
                if (!compareAndSet(currentThread, f13471s)) {
                    c(currentThread);
                }
                d(th);
                return;
            }
        }
        if (!compareAndSet(currentThread, f13471s)) {
            c(currentThread);
        }
        if (!z10) {
            return;
        }
        e(t10);
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = get();
        if (runnable == f13471s) {
            str = "running=[DONE]";
        } else if (runnable instanceof pz1) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            str = a.b(new StringBuilder(String.valueOf(name).length() + 21), "running=[RUNNING ON ", name, "]");
        } else {
            str = "running=[NOT STARTED YET]";
        }
        String b10 = b();
        return a.b(new StringBuilder(str.length() + 2 + String.valueOf(b10).length()), str, ", ", b10);
    }
}
