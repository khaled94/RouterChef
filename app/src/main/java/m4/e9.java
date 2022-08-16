package m4;

/* loaded from: classes.dex */
public final class e9 extends v9 {

    /* renamed from: h */
    public static volatile Long f7745h;

    /* renamed from: i */
    public static final Object f7746i = new Object();

    public e9(n8 n8Var, v5 v5Var, int i10) {
        super(n8Var, "hUIXYyX7voAFfmX9K6Tyj7UNRMoApsO3NHhichzgf1HY6Km4YpCnpT8GA4sfwulx", "RhEw32BK9OU3wzUC3Jj98VTZvnt6yWz3Jzx/x8tD2qo=", v5Var, i10, 22);
    }

    @Override // m4.v9
    public final void a() {
        if (f7745h == null) {
            synchronized (f7746i) {
                if (f7745h == null) {
                    f7745h = (Long) this.f14620e.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f14619d) {
            try {
                v5 v5Var = this.f14619d;
                long longValue = f7745h.longValue();
                if (v5Var.f9884u) {
                    v5Var.m();
                    v5Var.f9884u = false;
                }
                k6.B0((k6) v5Var.f9883t, longValue);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
