package m4;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import m4.dh1;

/* loaded from: classes.dex */
public final class zf1<S extends dh1> implements eh1<S> {

    /* renamed from: a */
    public final eh1<S> f16188a;

    /* renamed from: b */
    public final long f16189b;

    /* renamed from: c */
    public final ScheduledExecutorService f16190c;

    public zf1(eh1<S> eh1Var, long j3, ScheduledExecutorService scheduledExecutorService) {
        this.f16188a = eh1Var;
        this.f16189b = j3;
        this.f16190c = scheduledExecutorService;
    }

    @Override // m4.eh1
    public final tz1<S> a() {
        tz1<S> a10 = this.f16188a.a();
        long j3 = this.f16189b;
        if (j3 > 0) {
            a10 = mz1.q(a10, j3, TimeUnit.MILLISECONDS, this.f16190c);
        }
        return mz1.j(a10, Throwable.class, yf1.f15674a, u90.f14299f);
    }
}
