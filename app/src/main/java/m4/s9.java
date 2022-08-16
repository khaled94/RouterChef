package m4;

import android.view.View;

/* loaded from: classes.dex */
public final class s9 extends v9 {

    /* renamed from: h */
    public final View f13552h;

    public s9(n8 n8Var, v5 v5Var, int i10, View view) {
        super(n8Var, "hQ5xuCRMiz6eJqaT4+9Wf/Kj854Yma0NmQLTM8SLOoEkyUHQjbgUSxF3PTxTz3Bq", "CIY4BMAyy7Fe28Pq7/h8od2SEEojcWEgmd3J7ORxssU=", v5Var, i10, 57);
        this.f13552h = view;
    }

    @Override // m4.v9
    public final void a() {
        if (this.f13552h != null) {
            Boolean bool = (Boolean) jo.f10145d.f10148c.a(es.R1);
            q8 q8Var = new q8((String) this.f14620e.invoke(null, this.f13552h, this.f14616a.f11550a.getResources().getDisplayMetrics(), bool));
            i6 v10 = j6.v();
            long longValue = q8Var.f12733a.longValue();
            if (v10.f9884u) {
                v10.m();
                v10.f9884u = false;
            }
            j6.x((j6) v10.f9883t, longValue);
            long longValue2 = q8Var.f12734b.longValue();
            if (v10.f9884u) {
                v10.m();
                v10.f9884u = false;
            }
            j6.y((j6) v10.f9883t, longValue2);
            long longValue3 = q8Var.f12735c.longValue();
            if (v10.f9884u) {
                v10.m();
                v10.f9884u = false;
            }
            j6.z((j6) v10.f9883t, longValue3);
            if (bool.booleanValue()) {
                long longValue4 = q8Var.f12736d.longValue();
                if (v10.f9884u) {
                    v10.m();
                    v10.f9884u = false;
                }
                j6.A((j6) v10.f9883t, longValue4);
            }
            v5 v5Var = this.f14619d;
            j6 k10 = v10.k();
            if (v5Var.f9884u) {
                v5Var.m();
                v5Var.f9884u = false;
            }
            k6.O((k6) v5Var.f9883t, k10);
        }
    }
}
