package m4;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;
import t3.t;

/* loaded from: classes.dex */
public abstract class sy1<InputT, OutputT> extends vy1<OutputT> {
    public static final Logger G = Logger.getLogger(sy1.class.getName());
    @CheckForNull
    public bw1<? extends tz1<? extends InputT>> D;
    public final boolean E;
    public final boolean F;

    public sy1(bw1<? extends tz1<? extends InputT>> bw1Var, boolean z10, boolean z11) {
        super(bw1Var.size());
        this.D = bw1Var;
        this.E = z10;
        this.F = z11;
    }

    public static void v(Throwable th) {
        G.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    @Override // m4.my1
    @CheckForNull
    public final String h() {
        bw1<? extends tz1<? extends InputT>> bw1Var = this.D;
        return bw1Var != null ? "futures=".concat(bw1Var.toString()) : super.h();
    }

    @Override // m4.my1
    public final void i() {
        bw1<? extends tz1<? extends InputT>> bw1Var = this.D;
        boolean z10 = true;
        r(1);
        boolean z11 = this.f11358s instanceof by1;
        if (bw1Var == null) {
            z10 = false;
        }
        if (z10 && z11) {
            boolean o10 = o();
            sx1<? extends tz1<? extends InputT>> it = bw1Var.iterator();
            while (it.hasNext()) {
                it.next().cancel(o10);
            }
        }
    }

    public void r(int i10) {
        this.D = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s(int i10, Future<? extends InputT> future) {
        try {
            x(i10, mz1.r(future));
        } catch (ExecutionException e10) {
            u(e10.getCause());
        } catch (Throwable th) {
            u(th);
        }
    }

    public final void t(@CheckForNull bw1<? extends Future<? extends InputT>> bw1Var) {
        int a10 = vy1.B.a(this);
        int i10 = 0;
        hu1.i(a10 >= 0, "Less than 0 remaining futures");
        if (a10 == 0) {
            if (bw1Var != null) {
                sx1<? extends Future<? extends InputT>> it = bw1Var.iterator();
                while (it.hasNext()) {
                    Future<? extends InputT> next = it.next();
                    if (!next.isCancelled()) {
                        s(i10, next);
                    }
                    i10++;
                }
            }
            this.f14797z = null;
            y();
            r(2);
        }
    }

    public final void u(Throwable th) {
        boolean z10;
        Objects.requireNonNull(th);
        if (this.E && !m(th)) {
            Set<Throwable> set = this.f14797z;
            if (set == null) {
                Set<Throwable> newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                w(newSetFromMap);
                vy1.B.g(this, newSetFromMap);
                set = this.f14797z;
                Objects.requireNonNull(set);
            }
            Throwable th2 = th;
            while (true) {
                if (th2 == null) {
                    z10 = true;
                    break;
                } else if (!set.add(th2)) {
                    z10 = false;
                    break;
                } else {
                    th2 = th2.getCause();
                }
            }
            if (z10) {
                v(th);
                return;
            }
        }
        if (th instanceof Error) {
            v(th);
        }
    }

    public final void w(Set<Throwable> set) {
        Objects.requireNonNull(set);
        if (!(this.f11358s instanceof by1)) {
            Throwable a10 = a();
            Objects.requireNonNull(a10);
            while (a10 != null && set.add(a10)) {
                a10 = a10.getCause();
            }
        }
    }

    public abstract void x(int i10, InputT inputt);

    public abstract void y();

    public final void z() {
        dz1 dz1Var = dz1.f7671s;
        bw1<? extends tz1<? extends InputT>> bw1Var = this.D;
        Objects.requireNonNull(bw1Var);
        if (bw1Var.isEmpty()) {
            y();
        } else if (!this.E) {
            t tVar = new t(this, this.F ? this.D : null, 2);
            sx1<? extends tz1<? extends InputT>> it = this.D.iterator();
            while (it.hasNext()) {
                it.next().b(tVar, dz1Var);
            }
        } else {
            sx1<? extends tz1<? extends InputT>> it2 = this.D.iterator();
            final int i10 = 0;
            while (it2.hasNext()) {
                final tz1<? extends InputT> next = it2.next();
                next.b(new Runnable() { // from class: m4.ry1
                    @Override // java.lang.Runnable
                    public final void run() {
                        sy1 sy1Var = sy1.this;
                        tz1 tz1Var = next;
                        int i11 = i10;
                        Objects.requireNonNull(sy1Var);
                        try {
                            if (tz1Var.isCancelled()) {
                                sy1Var.D = null;
                                sy1Var.cancel(false);
                            } else {
                                sy1Var.s(i11, tz1Var);
                            }
                        } finally {
                            sy1Var.t(null);
                        }
                    }
                }, dz1Var);
                i10++;
            }
        }
    }
}
