package m4;

import h4.a;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class cq0 extends br0<dq0> {

    /* renamed from: t */
    public final ScheduledExecutorService f7106t;

    /* renamed from: u */
    public final a f7107u;
    @GuardedBy("this")

    /* renamed from: v */
    public long f7108v = -1;
    @GuardedBy("this")

    /* renamed from: w */
    public long f7109w = -1;
    @GuardedBy("this")

    /* renamed from: x */
    public boolean f7110x = false;
    @GuardedBy("this")
    public ScheduledFuture<?> y;

    public cq0(ScheduledExecutorService scheduledExecutorService, a aVar) {
        super(Collections.emptySet());
        this.f7106t = scheduledExecutorService;
        this.f7107u = aVar;
    }

    public final synchronized void O0(int i10) {
        if (i10 <= 0) {
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(i10);
        if (this.f7110x) {
            long j3 = this.f7109w;
            if (j3 <= 0 || millis >= j3) {
                millis = j3;
            }
            this.f7109w = millis;
            return;
        }
        long b10 = this.f7107u.b();
        long j10 = this.f7108v;
        if (b10 <= j10 && j10 - this.f7107u.b() <= millis) {
            return;
        }
        P0(millis);
    }

    public final synchronized void P0(long j3) {
        ScheduledFuture<?> scheduledFuture = this.y;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.y.cancel(true);
        }
        this.f7108v = this.f7107u.b() + j3;
        this.y = this.f7106t.schedule(new cr(this), j3, TimeUnit.MILLISECONDS);
    }
}
