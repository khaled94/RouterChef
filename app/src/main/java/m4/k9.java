package m4;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class k9 extends v9 {
    public k9(n8 n8Var, v5 v5Var, int i10) {
        super(n8Var, "nKg4HNqb3w+l+hWBt0181NzZuRHIlhptjDdMcQ5dE3JWGvySjoPYfybKeplgFTfD", "XexrqxQZ83Dsows1I9oUUMC34QJd/x5AyWUFr5Va7Yc=", v5Var, i10, 73);
    }

    @Override // m4.v9
    public final void a() {
        try {
            int i10 = 1;
            boolean booleanValue = ((Boolean) this.f14620e.invoke(null, this.f14616a.f11550a)).booleanValue();
            v5 v5Var = this.f14619d;
            if (true == booleanValue) {
                i10 = 2;
            }
            if (v5Var.f9884u) {
                v5Var.m();
                v5Var.f9884u = false;
            }
            k6.g0((k6) v5Var.f9883t, i10);
        } catch (InvocationTargetException unused) {
            v5 v5Var2 = this.f14619d;
            if (v5Var2.f9884u) {
                v5Var2.m();
                v5Var2.f9884u = false;
            }
            k6.g0((k6) v5Var2.f9883t, 3);
        }
    }
}
