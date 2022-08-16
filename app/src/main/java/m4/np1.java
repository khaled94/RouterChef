package m4;

import java.util.Map;

/* loaded from: classes.dex */
public final class np1 implements ep1 {

    /* renamed from: a */
    public final mp1 f11882a;

    /* renamed from: b */
    public final kp1 f11883b;

    public np1(mp1 mp1Var, kp1 kp1Var) {
        this.f11882a = mp1Var;
        this.f11883b = kp1Var;
    }

    @Override // m4.ep1
    public final void a(dp1 dp1Var) {
    }

    @Override // m4.ep1
    public final String b(dp1 dp1Var) {
        mp1 mp1Var = this.f11882a;
        Map<String, String> g10 = dp1Var.g();
        this.f11883b.a(g10);
        return mp1Var.a(g10);
    }
}
