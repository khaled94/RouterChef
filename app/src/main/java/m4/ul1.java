package m4;

import a6.f;
import java.util.Objects;
import java.util.concurrent.Executor;
import n3.k;

/* loaded from: classes.dex */
public final class ul1 implements kz1<hz0> {

    /* renamed from: s */
    public final /* synthetic */ tc1 f14446s;

    /* renamed from: t */
    public final /* synthetic */ op1 f14447t;

    /* renamed from: u */
    public final /* synthetic */ vl1 f14448u;

    /* renamed from: v */
    public final /* synthetic */ wl1 f14449v;

    public ul1(wl1 wl1Var, tc1 tc1Var, op1 op1Var, vl1 vl1Var) {
        this.f14449v = wl1Var;
        this.f14446s = tc1Var;
        this.f14447t = op1Var;
        this.f14448u = vl1Var;
    }

    @Override // m4.kz1
    public final void a(Object obj) {
        hz0 hz0Var = (hz0) obj;
        synchronized (this.f14449v) {
            try {
                ((oq0) hz0Var.f6196g.f12264s.f14854s).f12268w = this.f14449v.f15045d;
                this.f14446s.a(hz0Var);
                wl1 wl1Var = this.f14449v;
                Executor executor = wl1Var.f15043b;
                sl1 sl1Var = wl1Var.f15045d;
                Objects.requireNonNull(sl1Var);
                executor.execute(new kk0(sl1Var, 1));
                this.f14449v.f15045d.r();
                op1 op1Var = this.f14447t;
                if (op1Var != null) {
                    qp1 qp1Var = this.f14449v.f15048g;
                    op1Var.b(hz0Var.f6190a.f10489b);
                    op1Var.c(hz0Var.f6195f.f12238s);
                    op1Var.d(true);
                    qp1Var.a(op1Var.f());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // m4.kz1
    public final void f(Throwable th) {
        kz0 g10 = this.f14449v.f15046e.g();
        cn l10 = g10 == null ? f.l(th, null) : g10.a().a(th);
        synchronized (this.f14449v) {
            try {
                if (g10 != null) {
                    g10.b().d(l10);
                    this.f14449v.f15043b.execute(new k(this, l10, 3));
                } else {
                    this.f14449v.f15045d.d(l10);
                    this.f14449v.b(this.f14448u).c().a().f15056f.a();
                }
                x90.i(l10.f7067s, th, "RewardedAdLoader.onFailure");
                op1 op1Var = this.f14447t;
                if (op1Var != null) {
                    qp1 qp1Var = this.f14449v.f15048g;
                    op1Var.a(l10);
                    op1Var.d(false);
                    qp1Var.a(op1Var.f());
                }
                this.f14446s.mo22zza();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
