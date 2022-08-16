package m4;

import android.os.Bundle;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class u91 extends t91<ik0> {

    /* renamed from: a */
    public final if0 f14300a;

    /* renamed from: b */
    public final go0 f14301b;

    /* renamed from: c */
    public final rb1 f14302c;

    /* renamed from: d */
    public final dr0 f14303d;

    /* renamed from: e */
    public final yt0 f14304e;

    /* renamed from: f */
    public final cq0 f14305f;

    /* renamed from: g */
    public final ViewGroup f14306g;

    public u91(if0 if0Var, go0 go0Var, rb1 rb1Var, dr0 dr0Var, yt0 yt0Var, cq0 cq0Var, ViewGroup viewGroup) {
        this.f14300a = if0Var;
        this.f14301b = go0Var;
        this.f14302c = rb1Var;
        this.f14303d = dr0Var;
        this.f14304e = yt0Var;
        this.f14305f = cq0Var;
        this.f14306g = viewGroup;
    }

    @Override // m4.t91
    public final tz1<ik0> c(om1 om1Var, Bundle bundle) {
        mg0 i10 = this.f14300a.i();
        go0 go0Var = this.f14301b;
        go0Var.f8989b = om1Var;
        go0Var.f8990c = bundle;
        i10.f11187c = new ho0(go0Var);
        i10.f11186b = this.f14303d;
        i10.f11188d = this.f14302c;
        i10.f11191g = this.f14304e;
        i10.f11189e = new ul0(this.f14305f, 0);
        i10.f11190f = new fk0(this.f14306g, 0);
        wm0<ik0> c10 = i10.f().c();
        return c10.b(c10.c());
    }
}
