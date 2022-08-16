package m4;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import l3.s;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class w90<T> implements tz1<T> {

    /* renamed from: s */
    public final a02<T> f14885s = new a02<>();

    public final boolean a(T t10) {
        boolean l10 = this.f14885s.l(t10);
        if (!l10) {
            s.B.f5793g.f(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return l10;
    }

    @Override // m4.tz1
    public final void b(Runnable runnable, Executor executor) {
        this.f14885s.b(runnable, executor);
    }

    public final boolean c(Throwable th) {
        boolean m10 = this.f14885s.m(th);
        if (!m10) {
            s.B.f5793g.f(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return m10;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.f14885s.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public final T get() {
        return this.f14885s.get();
    }

    @Override // java.util.concurrent.Future
    public final T get(long j3, TimeUnit timeUnit) {
        return this.f14885s.get(j3, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f14885s.f11358s instanceof by1;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f14885s.isDone();
    }
}
