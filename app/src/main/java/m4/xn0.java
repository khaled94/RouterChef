package m4;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class xn0 implements to0, yr0, uq0, bp0 {

    /* renamed from: s */
    public final cp0 f15414s;

    /* renamed from: t */
    public final cm1 f15415t;

    /* renamed from: u */
    public final ScheduledExecutorService f15416u;

    /* renamed from: v */
    public final Executor f15417v;

    /* renamed from: w */
    public final a02<Boolean> f15418w = new a02<>();

    /* renamed from: x */
    public ScheduledFuture<?> f15419x;

    public xn0(cp0 cp0Var, cm1 cm1Var, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f15414s = cp0Var;
        this.f15415t = cm1Var;
        this.f15416u = scheduledExecutorService;
        this.f15417v = executor;
    }

    @Override // m4.yr0
    public final void b() {
        if (((Boolean) jo.f10145d.f10148c.a(es.Y0)).booleanValue()) {
            cm1 cm1Var = this.f15415t;
            if (cm1Var.V != 2) {
                return;
            }
            if (cm1Var.f7059r == 0) {
                this.f15414s.zza();
                return;
            }
            mz1.t(this.f15418w, new vm0(this, 1), this.f15417v);
            this.f15419x = this.f15416u.schedule(new cj(this, 4), this.f15415t.f7059r, TimeUnit.MILLISECONDS);
        }
    }

    @Override // m4.uq0
    public final void c() {
    }

    @Override // m4.yr0
    public final void d() {
    }

    @Override // m4.bp0
    public final synchronized void d0(cn cnVar) {
        if (this.f15418w.isDone()) {
            return;
        }
        ScheduledFuture<?> scheduledFuture = this.f15419x;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.f15418w.m(new Exception());
    }

    @Override // m4.to0
    public final void e() {
    }

    @Override // m4.uq0
    public final synchronized void g() {
        if (this.f15418w.isDone()) {
            return;
        }
        ScheduledFuture<?> scheduledFuture = this.f15419x;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.f15418w.l(Boolean.TRUE);
    }

    @Override // m4.to0
    public final void i() {
    }

    @Override // m4.to0
    public final void k() {
        int i10 = this.f15415t.V;
        if (i10 == 0 || i10 == 1) {
            this.f15414s.zza();
        }
    }

    @Override // m4.to0
    public final void o() {
    }

    @Override // m4.to0
    public final void u(a60 a60Var, String str, String str2) {
    }

    @Override // m4.to0
    public final void x() {
    }
}
