package m4;

import java.util.Map;
import n3.n1;

/* loaded from: classes.dex */
public final class jp1 implements ep1 {

    /* renamed from: a */
    public final mp1 f10156a;

    /* renamed from: b */
    public final kp1 f10157b;

    /* renamed from: c */
    public final cp1 f10158c;

    public jp1(cp1 cp1Var, mp1 mp1Var, kp1 kp1Var) {
        this.f10158c = cp1Var;
        this.f10156a = mp1Var;
        this.f10157b = kp1Var;
    }

    @Override // m4.ep1
    public final void a(dp1 dp1Var) {
        cp1 cp1Var = this.f10158c;
        cp1Var.f7101a.execute(new n1(cp1Var, b(dp1Var)));
    }

    @Override // m4.ep1
    public final String b(dp1 dp1Var) {
        mp1 mp1Var = this.f10156a;
        Map<String, String> g10 = dp1Var.g();
        this.f10157b.a(g10);
        return mp1Var.a(g10);
    }
}
