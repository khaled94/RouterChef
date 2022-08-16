package m4;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class mo1<E, V> implements tz1<V> {

    /* renamed from: s */
    public final E f11264s;

    /* renamed from: t */
    public final String f11265t;

    /* renamed from: u */
    public final tz1<V> f11266u;

    public mo1(E e10, String str, tz1<V> tz1Var) {
        this.f11264s = e10;
        this.f11265t = str;
        this.f11266u = tz1Var;
    }

    @Override // m4.tz1
    public final void b(Runnable runnable, Executor executor) {
        this.f11266u.b(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return this.f11266u.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        return this.f11266u.get();
    }

    @Override // java.util.concurrent.Future
    public final V get(long j3, TimeUnit timeUnit) {
        return this.f11266u.get(j3, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f11266u.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f11266u.isDone();
    }

    public final String toString() {
        String str = this.f11265t;
        int identityHashCode = System.identityHashCode(this);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(str);
        sb.append("@");
        sb.append(identityHashCode);
        return sb.toString();
    }
}
