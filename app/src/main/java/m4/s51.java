package m4;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class s51 implements gq0, mp0, vo0, jq0 {

    /* renamed from: s */
    public final dp1 f13529s;

    /* renamed from: t */
    public final ep1 f13530t;

    /* renamed from: u */
    public final d90 f13531u;

    public s51(dp1 dp1Var, ep1 ep1Var, d90 d90Var) {
        this.f13529s = dp1Var;
        this.f13530t = ep1Var;
        this.f13531u = d90Var;
    }

    @Override // m4.vo0
    public final void d(cn cnVar) {
        dp1 dp1Var = this.f13529s;
        dp1Var.a("action", "ftl");
        dp1Var.a("ftl", String.valueOf(cnVar.f7067s));
        dp1Var.a("ed", cnVar.f7069u);
        this.f13530t.a(this.f13529s);
    }

    @Override // m4.jq0
    public final void h() {
        if (((Boolean) jo.f10145d.f10148c.a(es.N4)).booleanValue()) {
            this.f13529s.a("scar", "true");
        }
    }

    @Override // m4.mp0
    public final void j() {
        ep1 ep1Var = this.f13530t;
        dp1 dp1Var = this.f13529s;
        dp1Var.a("action", "loaded");
        ep1Var.a(dp1Var);
    }

    @Override // m4.gq0
    public final void l0(km1 km1Var) {
        this.f13529s.f(km1Var, this.f13531u);
    }

    @Override // m4.gq0
    public final void v0(o50 o50Var) {
        dp1 dp1Var = this.f13529s;
        Bundle bundle = o50Var.f11995s;
        Objects.requireNonNull(dp1Var);
        if (bundle.containsKey("cnt")) {
            dp1Var.f7586a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            dp1Var.f7586a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }
}
