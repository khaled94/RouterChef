package m4;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zz1 extends wz1 implements ScheduledExecutorService {

    /* renamed from: t */
    public final ScheduledExecutorService f16372t;

    public zz1(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.f16372t = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j3, TimeUnit timeUnit) {
        g02 g02Var = new g02(Executors.callable(runnable, null));
        return new xz1(g02Var, this.f16372t.schedule(g02Var, j3, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j3, TimeUnit timeUnit) {
        g02 g02Var = new g02(callable);
        return new xz1(g02Var, this.f16372t.schedule(g02Var, j3, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j3, long j10, TimeUnit timeUnit) {
        yz1 yz1Var = new yz1(runnable);
        return new xz1(yz1Var, this.f16372t.scheduleAtFixedRate(yz1Var, j3, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j3, long j10, TimeUnit timeUnit) {
        yz1 yz1Var = new yz1(runnable);
        return new xz1(yz1Var, this.f16372t.scheduleWithFixedDelay(yz1Var, j3, j10, timeUnit));
    }
}
