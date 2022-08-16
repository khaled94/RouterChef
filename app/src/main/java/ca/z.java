package ca;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class z {

    /* renamed from: d */
    public static final a f2888d = new a();

    /* renamed from: a */
    public boolean f2889a;

    /* renamed from: b */
    public long f2890b;

    /* renamed from: c */
    public long f2891c;

    /* loaded from: classes.dex */
    public class a extends z {
        @Override // ca.z
        public final z d(long j3) {
            return this;
        }

        @Override // ca.z
        public final void f() {
        }

        @Override // ca.z
        public final z g(long j3) {
            return this;
        }
    }

    public z a() {
        this.f2889a = false;
        return this;
    }

    public z b() {
        this.f2891c = 0L;
        return this;
    }

    public long c() {
        if (this.f2889a) {
            return this.f2890b;
        }
        throw new IllegalStateException("No deadline");
    }

    public z d(long j3) {
        this.f2889a = true;
        this.f2890b = j3;
        return this;
    }

    public boolean e() {
        return this.f2889a;
    }

    public void f() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.f2889a && this.f2890b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public z g(long j3) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (j3 >= 0) {
            if (timeUnit == null) {
                throw new IllegalArgumentException("unit == null");
            }
            this.f2891c = timeUnit.toNanos(j3);
            return this;
        }
        throw new IllegalArgumentException("timeout < 0: " + j3);
    }
}
