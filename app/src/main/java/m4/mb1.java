package m4;

import android.view.View;
import java.util.concurrent.atomic.AtomicBoolean;
import l3.f;

/* loaded from: classes.dex */
public final class mb1 implements f {

    /* renamed from: s */
    public final ro0 f11133s;

    /* renamed from: t */
    public final cp0 f11134t;

    /* renamed from: u */
    public final ls0 f11135u;

    /* renamed from: v */
    public final fs0 f11136v;

    /* renamed from: w */
    public final dj0 f11137w;

    /* renamed from: x */
    public final AtomicBoolean f11138x = new AtomicBoolean(false);

    public mb1(ro0 ro0Var, cp0 cp0Var, ls0 ls0Var, fs0 fs0Var, dj0 dj0Var) {
        this.f11133s = ro0Var;
        this.f11134t = cp0Var;
        this.f11135u = ls0Var;
        this.f11136v = fs0Var;
        this.f11137w = dj0Var;
    }

    @Override // l3.f
    public final void a() {
        if (this.f11138x.get()) {
            this.f11133s.N();
        }
    }

    @Override // l3.f
    public final void c() {
        if (this.f11138x.get()) {
            this.f11134t.zza();
            this.f11135u.zza();
        }
    }

    @Override // l3.f
    public final synchronized void d(View view) {
        if (!this.f11138x.compareAndSet(false, true)) {
            return;
        }
        this.f11137w.l();
        this.f11136v.O0(view);
    }
}
