package m4;

/* loaded from: classes.dex */
public final class o9 extends v9 {
    public o9(n8 n8Var, v5 v5Var, int i10) {
        super(n8Var, "n2Au6L29UBBc2fEdbhtyAmTKpQRV7jQpdKVw+7Bcq8RzfUQmGwjEOtWTLTfPZXlx", "dCN8M8R2yrrpg52x17w1rrrZtT0eIXPeEX6Ibp28VuQ=", v5Var, i10, 51);
    }

    @Override // m4.v9
    public final void a() {
        synchronized (this.f14619d) {
            try {
                i8 i8Var = new i8((String) this.f14620e.invoke(null, new Object[0]));
                v5 v5Var = this.f14619d;
                long longValue = i8Var.f9555a.longValue();
                if (v5Var.f9884u) {
                    v5Var.m();
                    v5Var.f9884u = false;
                }
                k6.I((k6) v5Var.f9883t, longValue);
                v5 v5Var2 = this.f14619d;
                long longValue2 = i8Var.f9556b.longValue();
                if (v5Var2.f9884u) {
                    v5Var2.m();
                    v5Var2.f9884u = false;
                }
                k6.J((k6) v5Var2.f9883t, longValue2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
