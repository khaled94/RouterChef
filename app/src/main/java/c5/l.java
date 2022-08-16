package c5;

import d4.m;
import java.util.Collection;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import m4.vc0;
import m4.wu0;

/* loaded from: classes.dex */
public final class l {
    public static <TResult> TResult a(i<TResult> iVar) {
        m.g("Must not be called on the main application thread");
        m.i(iVar, "Task must not be null");
        if (iVar.m()) {
            return (TResult) g(iVar);
        }
        vc0 vc0Var = new vc0();
        h(iVar, vc0Var);
        ((CountDownLatch) vc0Var.f14660s).await();
        return (TResult) g(iVar);
    }

    public static <TResult> TResult b(i<TResult> iVar, long j3, TimeUnit timeUnit) {
        m.g("Must not be called on the main application thread");
        m.i(iVar, "Task must not be null");
        m.i(timeUnit, "TimeUnit must not be null");
        if (iVar.m()) {
            return (TResult) g(iVar);
        }
        vc0 vc0Var = new vc0();
        h(iVar, vc0Var);
        if (!((CountDownLatch) vc0Var.f14660s).await(j3, timeUnit)) {
            throw new TimeoutException("Timed out waiting for Task");
        }
        return (TResult) g(iVar);
    }

    @Deprecated
    public static <TResult> i<TResult> c(Executor executor, Callable<TResult> callable) {
        m.i(executor, "Executor must not be null");
        b0 b0Var = new b0();
        executor.execute(new wu0(b0Var, callable, 1));
        return b0Var;
    }

    public static <TResult> i<TResult> d(Exception exc) {
        b0 b0Var = new b0();
        b0Var.q(exc);
        return b0Var;
    }

    public static <TResult> i<TResult> e(TResult tresult) {
        b0 b0Var = new b0();
        b0Var.r(tresult);
        return b0Var;
    }

    public static i<Void> f(Collection<? extends i<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return e(null);
        }
        for (i<?> iVar : collection) {
            Objects.requireNonNull(iVar, "null tasks are not accepted");
        }
        b0 b0Var = new b0();
        n nVar = new n(collection.size(), b0Var);
        for (i<?> iVar2 : collection) {
            h(iVar2, nVar);
        }
        return b0Var;
    }

    public static <TResult> TResult g(i<TResult> iVar) {
        if (iVar.n()) {
            return iVar.j();
        }
        if (!iVar.l()) {
            throw new ExecutionException(iVar.i());
        }
        throw new CancellationException("Task is already canceled");
    }

    public static <T> void h(i<T> iVar, m<? super T> mVar) {
        z zVar = k.f2778b;
        iVar.d(zVar, mVar);
        iVar.c(zVar, mVar);
        iVar.a(zVar, mVar);
    }
}
