package m4;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class z91 extends t91<hz0> {

    /* renamed from: a */
    public final if0 f16054a;

    /* renamed from: b */
    public final go0 f16055b;

    /* renamed from: c */
    public final dr0 f16056c;

    public z91(if0 if0Var, go0 go0Var, dr0 dr0Var) {
        this.f16054a = if0Var;
        this.f16055b = go0Var;
        this.f16056c = dr0Var;
    }

    @Override // m4.t91
    public final tz1<hz0> c(om1 om1Var, Bundle bundle) {
        ig0 m10 = this.f16054a.m();
        go0 go0Var = this.f16055b;
        go0Var.f8989b = om1Var;
        go0Var.f8990c = bundle;
        m10.f9641d = new ho0(go0Var);
        m10.f9640c = this.f16056c;
        wm0<hz0> a10 = m10.c().a();
        return a10.b(a10.c());
    }
}
