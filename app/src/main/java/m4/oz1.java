package m4;

import i0.b;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class oz1<V> implements tz1<V> {

    /* renamed from: t */
    public static final tz1<?> f12316t = new oz1(null);

    /* renamed from: u */
    public static final Logger f12317u = Logger.getLogger(oz1.class.getName());

    /* renamed from: s */
    public final V f12318s;

    public oz1(V v10) {
        this.f12318s = v10;
    }

    @Override // m4.tz1
    public final void b(Runnable runnable, Executor executor) {
        Objects.requireNonNull(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = f12317u;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            logger.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", b.a(new StringBuilder(valueOf.length() + 57 + valueOf2.length()), "RuntimeException while executing runnable ", valueOf, " with executor ", valueOf2), (Throwable) e10);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        return this.f12318s;
    }

    @Override // java.util.concurrent.Future
    public final V get(long j3, TimeUnit timeUnit) {
        Objects.requireNonNull(timeUnit);
        return this.f12318s;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.f12318s);
        return b.a(new StringBuilder(String.valueOf(obj).length() + 27 + valueOf.length()), obj, "[status=SUCCESS, result=[", valueOf, "]]");
    }
}
