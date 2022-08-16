package m4;

/* loaded from: classes.dex */
public final class i9 extends v9 {

    /* renamed from: h */
    public static volatile String f9561h;

    /* renamed from: i */
    public static final Object f9562i = new Object();

    public i9(n8 n8Var, v5 v5Var, int i10) {
        super(n8Var, "uVfRV2qL6y+/frn7UQ8HZUcJpLFj+yNt3k4Ns9czyDlwcIbIheGCFGCtGsGaaHh4", "RmtCo/dRwPWzjhuo/V+opsA0IDlV0P6pRfQFRNu3WDY=", v5Var, i10, 1);
    }

    @Override // m4.v9
    public final void a() {
        v5 v5Var = this.f14619d;
        if (v5Var.f9884u) {
            v5Var.m();
            v5Var.f9884u = false;
        }
        k6.p0((k6) v5Var.f9883t, "E");
        if (f9561h == null) {
            synchronized (f9562i) {
                if (f9561h == null) {
                    f9561h = (String) this.f14620e.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f14619d) {
            try {
                v5 v5Var2 = this.f14619d;
                String str = f9561h;
                if (v5Var2.f9884u) {
                    v5Var2.m();
                    v5Var2.f9884u = false;
                }
                k6.p0((k6) v5Var2.f9883t, str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
