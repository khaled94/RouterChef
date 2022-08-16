package m4;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class di1 implements eh1<ei1> {

    /* renamed from: a */
    public final z80 f7515a;

    /* renamed from: b */
    public final ScheduledExecutorService f7516b;

    /* renamed from: c */
    public final Executor f7517c;

    public di1(z80 z80Var, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f7515a = z80Var;
        this.f7516b = scheduledExecutorService;
        this.f7517c = executor;
    }

    @Override // m4.eh1
    public final tz1<ei1> a() {
        return mz1.i((gz1) mz1.q(mz1.o(gz1.r(mz1.n(new np0(this, 4), this.f7517c)), ci1.f6992a, this.f7517c), ((Long) jo.f10145d.f10148c.a(es.C0)).longValue(), TimeUnit.MILLISECONDS, this.f7516b), Exception.class, new cu1() { // from class: m4.bi1
            @Override // m4.cu1
            public final Object a(Object obj) {
                di1.this.f7515a.g((Exception) obj, "AttestationTokenSignal");
                return null;
            }
        }, dz1.f7671s);
    }
}
