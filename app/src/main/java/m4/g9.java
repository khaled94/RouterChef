package m4;

/* loaded from: classes.dex */
public final class g9 extends v9 {

    /* renamed from: h */
    public final z7 f8770h;

    public g9(n8 n8Var, v5 v5Var, int i10, z7 z7Var) {
        super(n8Var, "pJoEelkZiKPOxk90a9HaLYHjU9iyGURNQtyjZ4Eem1yb/gFTG2yLqZLPefEosnhY", "oU8dxPYnryKlPd91mK89Z7Qor1PaeT+LMYSHnhThZ+4=", v5Var, i10, 11);
        this.f8770h = z7Var;
    }

    @Override // m4.v9
    public final void a() {
        z7 z7Var = this.f8770h;
        if (z7Var != null) {
            v5 v5Var = this.f14619d;
            long longValue = ((Long) this.f14620e.invoke(null, z7Var.f16023a)).longValue();
            if (v5Var.f9884u) {
                v5Var.m();
                v5Var.f9884u = false;
            }
            k6.u0((k6) v5Var.f9883t, longValue);
        }
    }
}
