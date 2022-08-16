package m4;

/* loaded from: classes.dex */
public final class a9 extends v9 {

    /* renamed from: h */
    public static volatile Long f6072h;

    /* renamed from: i */
    public static final Object f6073i = new Object();

    public a9(n8 n8Var, v5 v5Var, int i10) {
        super(n8Var, "9GRJeHWq4dh2BvJK4ycB7gT7rSPz0ZkF1/0dgXOpChUtvNoPNNrpav7wZxlsKwP4", "wAGvvwsR6C1vDVsIyeUg+KWcunmHMDzvTAjP5mYaviw=", v5Var, i10, 44);
    }

    @Override // m4.v9
    public final void a() {
        if (f6072h == null) {
            synchronized (f6073i) {
                if (f6072h == null) {
                    f6072h = (Long) this.f14620e.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f14619d) {
            try {
                v5 v5Var = this.f14619d;
                long longValue = f6072h.longValue();
                if (v5Var.f9884u) {
                    v5Var.m();
                    v5Var.f9884u = false;
                }
                k6.E((k6) v5Var.f9883t, longValue);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
