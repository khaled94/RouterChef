package c5;

import d4.m;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class b0<TResult> extends i<TResult> {

    /* renamed from: a */
    public final Object f2770a = new Object();

    /* renamed from: b */
    public final y<TResult> f2771b = new y<>();
    @GuardedBy("mLock")

    /* renamed from: c */
    public boolean f2772c;

    /* renamed from: d */
    public volatile boolean f2773d;
    @GuardedBy("mLock")

    /* renamed from: e */
    public TResult f2774e;
    @GuardedBy("mLock")

    /* renamed from: f */
    public Exception f2775f;

    @Override // c5.i
    public final i<TResult> a(Executor executor, c cVar) {
        this.f2771b.a(new r(executor, cVar));
        u();
        return this;
    }

    @Override // c5.i
    public final i<TResult> b(Executor executor, d<TResult> dVar) {
        this.f2771b.a(new s(executor, dVar));
        u();
        return this;
    }

    @Override // c5.i
    public final i<TResult> c(Executor executor, e eVar) {
        this.f2771b.a(new u(executor, eVar));
        u();
        return this;
    }

    @Override // c5.i
    public final i<TResult> d(Executor executor, f<? super TResult> fVar) {
        this.f2771b.a(new v(executor, fVar));
        u();
        return this;
    }

    @Override // c5.i
    public final <TContinuationResult> i<TContinuationResult> e(a<TResult, TContinuationResult> aVar) {
        return f(k.f2777a, aVar);
    }

    @Override // c5.i
    public final <TContinuationResult> i<TContinuationResult> f(Executor executor, a<TResult, TContinuationResult> aVar) {
        b0 b0Var = new b0();
        this.f2771b.a(new o(executor, aVar, b0Var));
        u();
        return b0Var;
    }

    @Override // c5.i
    public final <TContinuationResult> i<TContinuationResult> g(a<TResult, i<TContinuationResult>> aVar) {
        return h(k.f2777a, aVar);
    }

    @Override // c5.i
    public final <TContinuationResult> i<TContinuationResult> h(Executor executor, a<TResult, i<TContinuationResult>> aVar) {
        b0 b0Var = new b0();
        this.f2771b.a(new p(executor, aVar, b0Var));
        u();
        return b0Var;
    }

    @Override // c5.i
    public final Exception i() {
        Exception exc;
        synchronized (this.f2770a) {
            exc = this.f2775f;
        }
        return exc;
    }

    @Override // c5.i
    public final TResult j() {
        TResult tresult;
        synchronized (this.f2770a) {
            m.k(this.f2772c, "Task is not yet complete");
            if (!this.f2773d) {
                Exception exc = this.f2775f;
                if (exc != null) {
                    throw new g(exc);
                }
                tresult = this.f2774e;
            } else {
                throw new CancellationException("Task is already canceled.");
            }
        }
        return tresult;
    }

    @Override // c5.i
    public final <X extends Throwable> TResult k(Class<X> cls) {
        TResult tresult;
        synchronized (this.f2770a) {
            m.k(this.f2772c, "Task is not yet complete");
            if (!this.f2773d) {
                if (cls.isInstance(this.f2775f)) {
                    throw cls.cast(this.f2775f);
                }
                Exception exc = this.f2775f;
                if (exc != null) {
                    throw new g(exc);
                }
                tresult = this.f2774e;
            } else {
                throw new CancellationException("Task is already canceled.");
            }
        }
        return tresult;
    }

    @Override // c5.i
    public final boolean l() {
        return this.f2773d;
    }

    @Override // c5.i
    public final boolean m() {
        boolean z10;
        synchronized (this.f2770a) {
            z10 = this.f2772c;
        }
        return z10;
    }

    @Override // c5.i
    public final boolean n() {
        boolean z10;
        synchronized (this.f2770a) {
            z10 = false;
            if (this.f2772c && !this.f2773d && this.f2775f == null) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // c5.i
    public final <TContinuationResult> i<TContinuationResult> o(h<TResult, TContinuationResult> hVar) {
        a0 a0Var = k.f2777a;
        b0 b0Var = new b0();
        this.f2771b.a(new w(a0Var, hVar, b0Var));
        u();
        return b0Var;
    }

    @Override // c5.i
    public final <TContinuationResult> i<TContinuationResult> p(Executor executor, h<TResult, TContinuationResult> hVar) {
        b0 b0Var = new b0();
        this.f2771b.a(new w(executor, hVar, b0Var));
        u();
        return b0Var;
    }

    public final void q(Exception exc) {
        m.i(exc, "Exception must not be null");
        synchronized (this.f2770a) {
            t();
            this.f2772c = true;
            this.f2775f = exc;
        }
        this.f2771b.b(this);
    }

    public final void r(TResult tresult) {
        synchronized (this.f2770a) {
            t();
            this.f2772c = true;
            this.f2774e = tresult;
        }
        this.f2771b.b(this);
    }

    public final boolean s() {
        synchronized (this.f2770a) {
            if (this.f2772c) {
                return false;
            }
            this.f2772c = true;
            this.f2773d = true;
            this.f2771b.b(this);
            return true;
        }
    }

    @GuardedBy("mLock")
    public final void t() {
        if (this.f2772c) {
            int i10 = b.f2769s;
            if (m()) {
                Exception i11 = i();
                String concat = i11 != null ? "failure" : n() ? "result ".concat(String.valueOf(j())) : l() ? "cancellation" : "unknown issue";
                throw new b(concat.length() != 0 ? "Complete with: ".concat(concat) : new String("Complete with: "), i11);
            }
            throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
    }

    public final void u() {
        synchronized (this.f2770a) {
            if (!this.f2772c) {
                return;
            }
            this.f2771b.b(this);
        }
    }
}
