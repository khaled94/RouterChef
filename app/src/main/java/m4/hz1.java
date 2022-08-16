package m4;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class hz1<V> extends gz1<V> {

    /* renamed from: z */
    public final tz1<V> f9486z;

    public hz1(tz1<V> tz1Var) {
        Objects.requireNonNull(tz1Var);
        this.f9486z = tz1Var;
    }

    @Override // m4.my1, m4.tz1
    public final void b(Runnable runnable, Executor executor) {
        this.f9486z.b(runnable, executor);
    }

    @Override // m4.my1, java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return this.f9486z.cancel(z10);
    }

    @Override // m4.my1, java.util.concurrent.Future
    public final V get() {
        return this.f9486z.get();
    }

    @Override // m4.my1, java.util.concurrent.Future
    public final V get(long j3, TimeUnit timeUnit) {
        return this.f9486z.get(j3, timeUnit);
    }

    @Override // m4.my1, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f9486z.isCancelled();
    }

    @Override // m4.my1, java.util.concurrent.Future
    public final boolean isDone() {
        return this.f9486z.isDone();
    }

    @Override // m4.my1
    public final String toString() {
        return this.f9486z.toString();
    }
}
