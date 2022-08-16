package m4;

import android.app.Activity;
import android.view.View;

/* loaded from: classes.dex */
public final class v8 extends v9 {

    /* renamed from: h */
    public final Activity f14596h;

    /* renamed from: i */
    public final View f14597i;

    public v8(n8 n8Var, v5 v5Var, int i10, View view, Activity activity) {
        super(n8Var, "VJibBREzYucPjNukhWG65jB60OIZQrcDVR3W2JV3G5ynshQ4Nd74pHrZYUgRiYK0", "TiANcug5zndviERrHpzUihvZthrd+vHCK5ngnbrocVE=", v5Var, i10, 62);
        this.f14597i = view;
        this.f14596h = activity;
    }

    @Override // m4.v9
    public final void a() {
        if (this.f14597i == null) {
            return;
        }
        boolean booleanValue = ((Boolean) jo.f10145d.f10148c.a(es.F1)).booleanValue();
        Object[] objArr = (Object[]) this.f14620e.invoke(null, this.f14597i, this.f14596h, Boolean.valueOf(booleanValue));
        synchronized (this.f14619d) {
            v5 v5Var = this.f14619d;
            long longValue = ((Long) objArr[0]).longValue();
            if (v5Var.f9884u) {
                v5Var.m();
                v5Var.f9884u = false;
            }
            k6.S((k6) v5Var.f9883t, longValue);
            v5 v5Var2 = this.f14619d;
            long longValue2 = ((Long) objArr[1]).longValue();
            if (v5Var2.f9884u) {
                v5Var2.m();
                v5Var2.f9884u = false;
            }
            k6.T((k6) v5Var2.f9883t, longValue2);
            if (booleanValue) {
                v5 v5Var3 = this.f14619d;
                String str = (String) objArr[2];
                if (v5Var3.f9884u) {
                    v5Var3.m();
                    v5Var3.f9884u = false;
                }
                k6.U((k6) v5Var3.f9883t, str);
            }
        }
    }
}
