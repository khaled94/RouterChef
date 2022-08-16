package m4;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class bz1 extends rz1 {

    /* renamed from: u */
    public final Executor f6664u;

    /* renamed from: v */
    public final /* synthetic */ cz1 f6665v;

    /* renamed from: w */
    public final Callable f6666w;

    /* renamed from: x */
    public final /* synthetic */ cz1 f6667x;

    public bz1(cz1 cz1Var, Callable callable, Executor executor) {
        this.f6667x = cz1Var;
        this.f6665v = cz1Var;
        Objects.requireNonNull(executor);
        this.f6664u = executor;
        this.f6666w = callable;
    }

    @Override // m4.rz1
    public final Object a() {
        return this.f6666w.call();
    }

    @Override // m4.rz1
    public final String b() {
        return this.f6666w.toString();
    }

    @Override // m4.rz1
    public final void d(Throwable th) {
        cz1 cz1Var = this.f6665v;
        cz1Var.H = null;
        if (th instanceof ExecutionException) {
            th = ((ExecutionException) th).getCause();
        } else if (th instanceof CancellationException) {
            cz1Var.cancel(false);
            return;
        }
        cz1Var.m(th);
    }

    @Override // m4.rz1
    public final void e(Object obj) {
        this.f6665v.H = null;
        this.f6667x.l(obj);
    }

    @Override // m4.rz1
    public final boolean f() {
        return this.f6665v.isDone();
    }
}
