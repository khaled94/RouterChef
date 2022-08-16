package m4;

/* loaded from: classes.dex */
public final class kl1 implements kz1<xs0> {

    /* renamed from: s */
    public final /* synthetic */ tc1 f10475s;

    /* renamed from: t */
    public final /* synthetic */ op1 f10476t;

    /* renamed from: u */
    public final /* synthetic */ nt0 f10477u;

    /* renamed from: v */
    public final /* synthetic */ ll1 f10478v;

    public kl1(ll1 ll1Var, tc1 tc1Var, op1 op1Var, nt0 nt0Var) {
        this.f10478v = ll1Var;
        this.f10475s = tc1Var;
        this.f10476t = op1Var;
        this.f10477u = nt0Var;
    }

    @Override // m4.kz1
    public final void a(Object obj) {
        xs0 xs0Var = (xs0) obj;
        synchronized (this.f10478v) {
            this.f10478v.f10916i = null;
            yr<Boolean> yrVar = es.f8170p5;
            jo joVar = jo.f10145d;
            if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
                w3 w3Var = xs0Var.f6196g.f12264s;
                w3Var.b(this.f10478v.f10911d);
                ((oq0) w3Var.f14854s).f12268w = this.f10478v.f10912e;
            }
            this.f10475s.a(xs0Var);
            if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
                this.f10478v.f10909b.execute(new mb0(this, 2));
                this.f10478v.f10909b.execute(new nb0(this, 2));
            }
            op1 op1Var = this.f10476t;
            if (op1Var != null) {
                qp1 qp1Var = this.f10478v.f10914g;
                op1Var.b(xs0Var.f6190a.f10489b);
                op1Var.c(xs0Var.f6195f.f12238s);
                op1Var.d(true);
                qp1Var.a(op1Var.f());
            }
        }
    }

    @Override // m4.kz1
    public final void f(Throwable th) {
        cn a10 = this.f10477u.a().a(th);
        synchronized (this.f10478v) {
            this.f10478v.f10916i = null;
            this.f10477u.b().d(a10);
            if (((Boolean) jo.f10145d.f10148c.a(es.f8170p5)).booleanValue()) {
                this.f10478v.f10909b.execute(new kj0(this, a10, 2));
                this.f10478v.f10909b.execute(new vu0(this, a10, 1));
            }
            x90.i(a10.f7067s, th, "InterstitialAdLoader.onFailure");
            op1 op1Var = this.f10476t;
            if (op1Var != null) {
                qp1 qp1Var = this.f10478v.f10914g;
                op1Var.a(a10);
                op1Var.d(false);
                qp1Var.a(op1Var.f());
            }
            this.f10475s.mo22zza();
        }
    }
}
