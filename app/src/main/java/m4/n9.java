package m4;

/* loaded from: classes.dex */
public final class n9 extends v9 {

    /* renamed from: h */
    public final StackTraceElement[] f11573h;

    public n9(n8 n8Var, v5 v5Var, int i10, StackTraceElement[] stackTraceElementArr) {
        super(n8Var, "xd283h5qAcacM5zVZnbCaCYEYmyBvCzSWmcoDFc838gJ/DBCdoedE0EgOC5ZJs5s", "KFN28huBDzw/UNPPRO5YgG4GEIzzfegN1j75wmksmGk=", v5Var, i10, 45);
        this.f11573h = stackTraceElementArr;
    }

    @Override // m4.v9
    public final void a() {
        k6 k6Var;
        StackTraceElement[] stackTraceElementArr = this.f11573h;
        if (stackTraceElementArr != null) {
            int i10 = 1;
            f8 f8Var = new f8((String) this.f14620e.invoke(null, stackTraceElementArr));
            synchronized (this.f14619d) {
                try {
                    v5 v5Var = this.f14619d;
                    long longValue = f8Var.f8366a.longValue();
                    if (v5Var.f9884u) {
                        v5Var.m();
                        v5Var.f9884u = false;
                    }
                    k6.F((k6) v5Var.f9883t, longValue);
                    if (f8Var.f8367b.booleanValue()) {
                        v5 v5Var2 = this.f14619d;
                        if (true != f8Var.f8368c.booleanValue()) {
                            i10 = 2;
                        }
                        if (v5Var2.f9884u) {
                            v5Var2.m();
                            v5Var2.f9884u = false;
                        }
                        k6Var = (k6) v5Var2.f9883t;
                    } else {
                        v5 v5Var3 = this.f14619d;
                        i10 = 3;
                        if (v5Var3.f9884u) {
                            v5Var3.m();
                            v5Var3.f9884u = false;
                        }
                        k6Var = (k6) v5Var3.f9883t;
                    }
                    k6.f0(k6Var, i10);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
