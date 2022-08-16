package m4;

/* loaded from: classes.dex */
public final class wc1 implements kz1<am0> {

    /* renamed from: s */
    public final /* synthetic */ tc1 f14936s;

    /* renamed from: t */
    public final /* synthetic */ op1 f14937t;

    /* renamed from: u */
    public final /* synthetic */ cu0 f14938u;

    /* renamed from: v */
    public final /* synthetic */ xc1 f14939v;

    public wc1(xc1 xc1Var, tc1 tc1Var, op1 op1Var, cu0 cu0Var) {
        this.f14939v = xc1Var;
        this.f14936s = tc1Var;
        this.f14937t = op1Var;
        this.f14938u = cu0Var;
    }

    @Override // m4.kz1
    public final void a(Object obj) {
        am0 am0Var = (am0) obj;
        synchronized (this.f14939v) {
            try {
                am0Var.f6196g.f12264s.b(this.f14939v.f15299d.f13591b);
                this.f14936s.a(am0Var);
                this.f14939v.f15297b.b().execute(new cj(this, 7));
                op1 op1Var = this.f14937t;
                if (op1Var != null) {
                    qp1 qp1Var = this.f14939v.f15300e;
                    op1Var.b(am0Var.f6190a.f10489b);
                    op1Var.c(am0Var.f6195f.f12238s);
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
        cn a10 = this.f14938u.a().a(th);
        this.f14938u.b().d(a10);
        this.f14939v.f15297b.b().execute(new mz(this, a10, 2));
        x90.i(a10.f7067s, th, "NativeAdLoader.onFailure");
        this.f14936s.mo22zza();
        op1 op1Var = this.f14937t;
        if (op1Var != null) {
            qp1 qp1Var = this.f14939v.f15300e;
            op1Var.a(a10);
            op1Var.d(false);
            qp1Var.a(op1Var.f());
        }
    }
}
