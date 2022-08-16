package y4;

import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class u2 extends j3 {
    public static final AtomicLong C = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: u */
    public t2 f20750u;

    /* renamed from: v */
    public t2 f20751v;
    public final Object A = new Object();
    public final Semaphore B = new Semaphore(2);

    /* renamed from: w */
    public final PriorityBlockingQueue<s2<?>> f20752w = new PriorityBlockingQueue<>();

    /* renamed from: x */
    public final BlockingQueue<s2<?>> f20753x = new LinkedBlockingQueue();
    public final r2 y = new r2(this, "Thread death: Uncaught exception on worker thread");

    /* renamed from: z */
    public final r2 f20754z = new r2(this, "Thread death: Uncaught exception on network thread");

    public u2(w2 w2Var) {
        super(w2Var);
    }

    @Override // y4.i3
    public final void f() {
        if (Thread.currentThread() == this.f20751v) {
            return;
        }
        throw new IllegalStateException("Call expected from network thread");
    }

    @Override // y4.i3
    public final void g() {
        if (Thread.currentThread() == this.f20750u) {
            return;
        }
        throw new IllegalStateException("Call expected from worker thread");
    }

    @Override // y4.j3
    public final boolean i() {
        return false;
    }

    public final <T> T n(AtomicReference<T> atomicReference, long j3, String str, Runnable runnable) {
        synchronized (atomicReference) {
            ((w2) this.f20505s).B().q(runnable);
            try {
                atomicReference.wait(j3);
            } catch (InterruptedException unused) {
                ((w2) this.f20505s).C().A.a(str.length() != 0 ? "Interrupted waiting for ".concat(str) : new String("Interrupted waiting for "));
                return null;
            }
        }
        T t10 = atomicReference.get();
        if (t10 == null) {
            ((w2) this.f20505s).C().A.a(str.length() != 0 ? "Timed out waiting for ".concat(str) : new String("Timed out waiting for "));
        }
        return t10;
    }

    public final <V> Future<V> o(Callable<V> callable) {
        j();
        s2<?> s2Var = new s2<>(this, callable, false);
        if (Thread.currentThread() == this.f20750u) {
            if (!this.f20752w.isEmpty()) {
                ((w2) this.f20505s).C().A.a("Callable skipped the worker queue.");
            }
            s2Var.run();
        } else {
            t(s2Var);
        }
        return s2Var;
    }

    public final void p(Runnable runnable) {
        j();
        s2<?> s2Var = new s2<>(this, runnable, false, "Task exception on network thread");
        synchronized (this.A) {
            this.f20753x.add(s2Var);
            t2 t2Var = this.f20751v;
            if (t2Var == null) {
                t2 t2Var2 = new t2(this, "Measurement Network", this.f20753x);
                this.f20751v = t2Var2;
                t2Var2.setUncaughtExceptionHandler(this.f20754z);
                this.f20751v.start();
            } else {
                synchronized (t2Var.f20735s) {
                    t2Var.f20735s.notifyAll();
                }
            }
        }
    }

    public final void q(Runnable runnable) {
        j();
        Objects.requireNonNull(runnable, "null reference");
        t(new s2<>(this, runnable, false, "Task exception on worker thread"));
    }

    public final void r(Runnable runnable) {
        j();
        t(new s2<>(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean s() {
        return Thread.currentThread() == this.f20750u;
    }

    public final void t(s2<?> s2Var) {
        synchronized (this.A) {
            this.f20752w.add(s2Var);
            t2 t2Var = this.f20750u;
            if (t2Var == null) {
                t2 t2Var2 = new t2(this, "Measurement Worker", this.f20752w);
                this.f20750u = t2Var2;
                t2Var2.setUncaughtExceptionHandler(this.y);
                this.f20750u.start();
            } else {
                synchronized (t2Var.f20735s) {
                    t2Var.f20735s.notifyAll();
                }
            }
        }
    }
}
