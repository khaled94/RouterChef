package m4;

import h4.a;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
import l3.s;

/* loaded from: classes.dex */
public final class nj0 implements ai {

    /* renamed from: a */
    public final ScheduledExecutorService f11798a;

    /* renamed from: b */
    public final a f11799b;
    @GuardedBy("this")

    /* renamed from: c */
    public ScheduledFuture<?> f11800c;
    @GuardedBy("this")

    /* renamed from: d */
    public long f11801d = -1;
    @GuardedBy("this")

    /* renamed from: e */
    public long f11802e = -1;
    @GuardedBy("this")

    /* renamed from: f */
    public Runnable f11803f = null;
    @GuardedBy("this")

    /* renamed from: g */
    public boolean f11804g = false;

    public nj0(ScheduledExecutorService scheduledExecutorService, a aVar) {
        this.f11798a = scheduledExecutorService;
        this.f11799b = aVar;
        s.B.f5792f.b(this);
    }

    @Override // m4.ai
    public final void J(boolean z10) {
        ScheduledFuture<?> scheduledFuture;
        if (z10) {
            synchronized (this) {
                if (this.f11804g) {
                    if (this.f11802e > 0 && (scheduledFuture = this.f11800c) != null && scheduledFuture.isCancelled()) {
                        this.f11800c = this.f11798a.schedule(this.f11803f, this.f11802e, TimeUnit.MILLISECONDS);
                    }
                    this.f11804g = false;
                }
            }
            return;
        }
        synchronized (this) {
            if (!this.f11804g) {
                ScheduledFuture<?> scheduledFuture2 = this.f11800c;
                if (scheduledFuture2 == null || scheduledFuture2.isDone()) {
                    this.f11802e = -1L;
                } else {
                    this.f11800c.cancel(true);
                    this.f11802e = this.f11801d - this.f11799b.b();
                }
                this.f11804g = true;
            }
        }
    }

    public final synchronized void a(int i10, Runnable runnable) {
        this.f11803f = runnable;
        long j3 = i10;
        this.f11801d = this.f11799b.b() + j3;
        this.f11800c = this.f11798a.schedule(runnable, j3, TimeUnit.MILLISECONDS);
    }
}
