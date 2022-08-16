package s6;

import c5.i;
import c5.l;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    public final Executor f18252a;

    /* renamed from: b */
    public i<Void> f18253b = l.e(null);

    /* renamed from: c */
    public final Object f18254c = new Object();

    /* renamed from: d */
    public final ThreadLocal<Boolean> f18255d = new ThreadLocal<>();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            f.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            f.this.f18255d.set(Boolean.TRUE);
        }
    }

    public f(Executor executor) {
        this.f18252a = executor;
        executor.execute(new a());
    }

    public final void a() {
        if (Boolean.TRUE.equals(this.f18255d.get())) {
            return;
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }

    public final <T> i<T> b(Callable<T> callable) {
        i<T> iVar;
        synchronized (this.f18254c) {
            iVar = (i<T>) this.f18253b.f(this.f18252a, new g(callable));
            this.f18253b = iVar.f(this.f18252a, new e5.i());
        }
        return iVar;
    }

    public final <T> i<T> c(Callable<i<T>> callable) {
        i<T> iVar;
        synchronized (this.f18254c) {
            iVar = (i<T>) this.f18253b.h(this.f18252a, new g(callable));
            this.f18253b = iVar.f(this.f18252a, new e5.i());
        }
        return iVar;
    }
}
