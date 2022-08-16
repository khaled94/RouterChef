package m4;

import androidx.lifecycle.h0;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import s3.f;

/* loaded from: classes.dex */
public final class zo0 extends br0<wo0> implements wo0 {

    /* renamed from: t */
    public final ScheduledExecutorService f16298t;

    /* renamed from: u */
    public ScheduledFuture<?> f16299u;

    /* renamed from: v */
    public boolean f16300v = false;

    /* renamed from: w */
    public final boolean f16301w = ((Boolean) jo.f10145d.f10148c.a(es.f8240y6)).booleanValue();

    public zo0(yo0 yo0Var, Set<es0<wo0>> set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.f16298t = scheduledExecutorService;
        I0(yo0Var, executor);
    }

    public final void O0() {
        if (!this.f16301w) {
            return;
        }
        this.f16299u = this.f16298t.schedule(new ib(this, 2), ((Integer) jo.f10145d.f10148c.a(es.f8248z6)).intValue(), TimeUnit.MILLISECONDS);
    }

    @Override // m4.wo0
    public final void a() {
        M0(h0.f1696v);
    }

    @Override // m4.wo0
    public final void d(cn cnVar) {
        M0(new d7(cnVar));
    }

    @Override // m4.wo0
    public final void p0(pt0 pt0Var) {
        if (this.f16301w) {
            if (this.f16300v) {
                return;
            }
            ScheduledFuture<?> scheduledFuture = this.f16299u;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
        }
        M0(new f(pt0Var, 2));
    }
}
