package m4;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class iz1<V> implements Future<V> {
    @Override // java.util.concurrent.Future
    public final V get() {
        return ((jz1) this).f10219s.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return ((jz1) this).f10219s.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return ((jz1) this).f10219s.isDone();
    }

    public final String toString() {
        return ((jz1) this).f10219s.toString();
    }

    @Override // java.util.concurrent.Future
    public final V get(long j3, TimeUnit timeUnit) {
        return ((jz1) this).f10219s.get(j3, timeUnit);
    }
}
