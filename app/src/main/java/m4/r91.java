package m4;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class r91 extends t91<hm0> {

    /* renamed from: a */
    public final if0 f13201a;

    /* renamed from: b */
    public final yt0 f13202b;

    /* renamed from: c */
    public final go0 f13203c;

    /* renamed from: d */
    public final dr0 f13204d;

    public r91(if0 if0Var, yt0 yt0Var, go0 go0Var, dr0 dr0Var) {
        this.f13201a = if0Var;
        this.f13202b = yt0Var;
        this.f13203c = go0Var;
        this.f13204d = dr0Var;
    }

    @Override // m4.t91
    public final tz1<hm0> c(om1 om1Var, Bundle bundle) {
        bg0 l10 = this.f13201a.l();
        go0 go0Var = this.f13203c;
        go0Var.f8989b = om1Var;
        go0Var.f8990c = bundle;
        l10.f6512c = new ho0(go0Var);
        l10.f6511b = this.f13204d;
        l10.f6513d = this.f13202b;
        l10.f6514e = new fk0(null, 0);
        wm0<hm0> a10 = l10.f().a();
        return a10.b(a10.c());
    }
}
