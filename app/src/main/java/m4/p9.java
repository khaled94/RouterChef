package m4;

/* loaded from: classes.dex */
public final class p9 extends v9 {

    /* renamed from: h */
    public final t8 f12445h;

    /* renamed from: i */
    public long f12446i;

    public p9(n8 n8Var, v5 v5Var, int i10, t8 t8Var) {
        super(n8Var, "e3op4R4hYomHt8fD4e46pNuu/60OumzY4fWht1zvNw/PVRGde3uP5Y0px+X+3p+E", "jLlOehpoNgAQzvuHrTyBcudcfwOhFguv/E47mcpJrto=", v5Var, i10, 53);
        this.f12445h = t8Var;
        if (t8Var != null) {
            this.f12446i = t8Var.a();
        }
    }

    @Override // m4.v9
    public final void a() {
        if (this.f12445h != null) {
            v5 v5Var = this.f14619d;
            long longValue = ((Long) this.f14620e.invoke(null, Long.valueOf(this.f12446i))).longValue();
            if (v5Var.f9884u) {
                v5Var.m();
                v5Var.f9884u = false;
            }
            k6.K((k6) v5Var.f9883t, longValue);
        }
    }
}
