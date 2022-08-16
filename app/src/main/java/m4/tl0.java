package m4;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class tl0 implements mp0, rh {

    /* renamed from: s */
    public final cm1 f14097s;

    /* renamed from: t */
    public final cp0 f14098t;

    /* renamed from: u */
    public final sp0 f14099u;

    /* renamed from: v */
    public final AtomicBoolean f14100v = new AtomicBoolean();

    /* renamed from: w */
    public final AtomicBoolean f14101w = new AtomicBoolean();

    public tl0(cm1 cm1Var, cp0 cp0Var, sp0 sp0Var) {
        this.f14097s = cm1Var;
        this.f14098t = cp0Var;
        this.f14099u = sp0Var;
    }

    @Override // m4.mp0
    public final synchronized void j() {
        if (this.f14097s.f7042f != 1) {
            if (this.f14100v.compareAndSet(false, true)) {
                this.f14098t.zza();
            }
        }
    }

    @Override // m4.rh
    public final void x(qh qhVar) {
        if (this.f14097s.f7042f == 1 && qhVar.f12866j && this.f14100v.compareAndSet(false, true)) {
            this.f14098t.zza();
        }
        if (!qhVar.f12866j || !this.f14101w.compareAndSet(false, true)) {
            return;
        }
        sp0 sp0Var = this.f14099u;
        synchronized (sp0Var) {
            sp0Var.M0(q80.f12738t);
        }
    }
}
