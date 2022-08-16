package m4;

/* loaded from: classes.dex */
public final class qb1<AdT> implements e71<AdT> {

    /* renamed from: a */
    public final vs f12759a;

    /* renamed from: b */
    public final uz1 f12760b;

    /* renamed from: c */
    public final zo1 f12761c;

    /* renamed from: d */
    public final wb1 f12762d;

    public qb1(zo1 zo1Var, uz1 uz1Var, vs vsVar, wb1 wb1Var) {
        this.f12761c = zo1Var;
        this.f12760b = uz1Var;
        this.f12759a = vsVar;
        this.f12762d = wb1Var;
    }

    @Override // m4.e71
    public final boolean a(km1 km1Var, cm1 cm1Var) {
        gm1 gm1Var;
        return (this.f12759a == null || (gm1Var = cm1Var.f7061t) == null || gm1Var.f8966a == null) ? false : true;
    }

    @Override // m4.e71
    public final tz1<AdT> b(km1 km1Var, cm1 cm1Var) {
        w90 w90Var = new w90();
        ub1 ub1Var = new ub1();
        pb1 pb1Var = new pb1(this, w90Var, km1Var, cm1Var, ub1Var);
        synchronized (ub1Var) {
            ub1Var.f14330s = pb1Var;
        }
        gm1 gm1Var = cm1Var.f7061t;
        rs rsVar = new rs(ub1Var, gm1Var.f8967b, gm1Var.f8966a);
        zo1 zo1Var = this.f12761c;
        return qo1.c(new y10(this, rsVar, 2), this.f12760b, wo1.CUSTOM_RENDER_SYN, zo1Var).b(wo1.CUSTOM_RENDER_ACK).d(w90Var).a();
    }
}
