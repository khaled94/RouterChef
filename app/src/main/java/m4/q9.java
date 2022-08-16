package m4;

/* loaded from: classes.dex */
public final class q9 extends v9 {

    /* renamed from: h */
    public static volatile Long f12749h;

    /* renamed from: i */
    public static final Object f12750i = new Object();

    public q9(n8 n8Var, v5 v5Var, int i10) {
        super(n8Var, "M8X9pjLXmkUmNpxAUiXCS0VzRrfgsx47JCdWPtF77o1zbxjaTxGH9o3y3XsfapA3", "IGAB4+J/PDJStxsBeRODYeAaV8Ap48L0bK2MK3UJNBs=", v5Var, i10, 33);
    }

    @Override // m4.v9
    public final void a() {
        if (f12749h == null) {
            synchronized (f12750i) {
                if (f12749h == null) {
                    f12749h = (Long) this.f14620e.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f14619d) {
            try {
                v5 v5Var = this.f14619d;
                long longValue = f12749h.longValue();
                if (v5Var.f9884u) {
                    v5Var.m();
                    v5Var.f9884u = false;
                }
                k6.v((k6) v5Var.f9883t, longValue);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
