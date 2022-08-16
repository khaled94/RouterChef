package m4;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class w8 extends v9 {
    public w8(n8 n8Var, v5 v5Var, int i10) {
        super(n8Var, "SnrtMYC9+qStj9ZoSAj1DR6mGb7YlLFiZbsMn2F8wpevpQUtlzrwws7lBSZ1KQhS", "3Z4807bJ0KoyYYoQ9dcfmEBolGH5CdxZiQurF1neOqs=", v5Var, i10, 49);
    }

    @Override // m4.v9
    public final void a() {
        v5 v5Var = this.f14619d;
        if (v5Var.f9884u) {
            v5Var.m();
            v5Var.f9884u = false;
        }
        k6.e0((k6) v5Var.f9883t, 3);
        try {
            int i10 = 1;
            boolean booleanValue = ((Boolean) this.f14620e.invoke(null, this.f14616a.f11550a)).booleanValue();
            v5 v5Var2 = this.f14619d;
            if (true == booleanValue) {
                i10 = 2;
            }
            if (v5Var2.f9884u) {
                v5Var2.m();
                v5Var2.f9884u = false;
            }
            k6.e0((k6) v5Var2.f9883t, i10);
        } catch (InvocationTargetException e10) {
            if (!(e10.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e10;
            }
        }
    }
}
