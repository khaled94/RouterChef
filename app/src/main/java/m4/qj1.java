package m4;

import a6.f;

/* loaded from: classes.dex */
public final class qj1 implements kz1 {

    /* renamed from: s */
    public final /* synthetic */ tc1 f12893s;

    /* renamed from: t */
    public final /* synthetic */ op1 f12894t;

    /* renamed from: u */
    public final /* synthetic */ rj1 f12895u;

    /* renamed from: v */
    public final /* synthetic */ sj1 f12896v;

    public qj1(sj1 sj1Var, tc1 tc1Var, op1 op1Var, rj1 rj1Var) {
        this.f12896v = sj1Var;
        this.f12893s = tc1Var;
        this.f12894t = op1Var;
        this.f12895u = rj1Var;
    }

    @Override // m4.kz1
    public final void a(Object obj) {
        am0 am0Var = (am0) obj;
        synchronized (this.f12896v) {
            this.f12896v.f13702i = null;
            if (((Boolean) jo.f10145d.f10148c.a(es.f8163o5)).booleanValue()) {
                ((oq0) am0Var.f6196g.f12264s.f14854s).f12267v = this.f12896v.f13697d;
            }
            this.f12893s.a(am0Var);
            op1 op1Var = this.f12894t;
            if (op1Var != null) {
                qp1 qp1Var = this.f12896v.f13700g;
                op1Var.b(am0Var.f6190a.f10489b);
                op1Var.c(am0Var.f6195f.f12238s);
                op1Var.d(true);
                qp1Var.a(op1Var.f());
            }
        }
    }

    @Override // m4.kz1
    public final void f(Throwable th) {
        wj0 wj0Var = (wj0) this.f12896v.f13698e.g();
        cn l10 = wj0Var == null ? f.l(th, null) : wj0Var.a().a(th);
        synchronized (this.f12896v) {
            sj1 sj1Var = this.f12896v;
            sj1Var.f13702i = null;
            if (wj0Var != null) {
                wj0Var.c().d(l10);
                if (((Boolean) jo.f10145d.f10148c.a(es.f8163o5)).booleanValue()) {
                    this.f12896v.f13695b.execute(new pj1(this, l10, 0));
                }
            } else {
                sj1Var.f13697d.d(l10);
                ((wj0) this.f12896v.c(this.f12895u).f()).a().f15056f.a();
            }
            x90.i(l10.f7067s, th, "AppOpenAdLoader.onFailure");
            this.f12893s.mo22zza();
            op1 op1Var = this.f12894t;
            if (op1Var != null) {
                qp1 qp1Var = this.f12896v.f13700g;
                op1Var.a(l10);
                op1Var.d(false);
                qp1Var.a(op1Var.f());
            }
        }
    }
}
