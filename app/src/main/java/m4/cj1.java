package m4;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class cj1 implements eh1<dj1> {

    /* renamed from: a */
    public final z80 f7000a;

    /* renamed from: b */
    public final boolean f7001b;

    /* renamed from: c */
    public final ScheduledExecutorService f7002c;

    /* renamed from: d */
    public final uz1 f7003d;

    public cj1(z80 z80Var, boolean z10, uz1 uz1Var, ScheduledExecutorService scheduledExecutorService) {
        this.f7000a = z80Var;
        this.f7001b = z10;
        this.f7003d = uz1Var;
        this.f7002c = scheduledExecutorService;
    }

    @Override // m4.eh1
    public final tz1<dj1> a() {
        return (zt.f16329a.e().booleanValue() || this.f7001b) ? mz1.i(mz1.q(mz1.o(mz1.m(null), bj1.f6547a, this.f7003d), zt.f16330b.e().longValue(), TimeUnit.MILLISECONDS, this.f7002c), Exception.class, new cu1() { // from class: m4.aj1
            @Override // m4.cu1
            public final Object a(Object obj) {
                cj1.this.f7000a.g((Exception) obj, "TrustlessTokenSignal");
                return null;
            }
        }, this.f7003d) : mz1.m(null);
    }
}
