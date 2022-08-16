package m4;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class x91 extends t91<xs0> {

    /* renamed from: a */
    public final if0 f15252a;

    /* renamed from: b */
    public final go0 f15253b;

    /* renamed from: c */
    public final rb1 f15254c;

    /* renamed from: d */
    public final dr0 f15255d;

    public x91(if0 if0Var, go0 go0Var, rb1 rb1Var, dr0 dr0Var) {
        this.f15252a = if0Var;
        this.f15253b = go0Var;
        this.f15254c = rb1Var;
        this.f15255d = dr0Var;
    }

    @Override // m4.t91
    public final tz1<xs0> c(om1 om1Var, Bundle bundle) {
        xg0 k10 = this.f15252a.k();
        go0 go0Var = this.f15253b;
        go0Var.f8989b = om1Var;
        go0Var.f8990c = bundle;
        k10.f15328c = new ho0(go0Var);
        k10.f15327b = this.f15255d;
        k10.f15329d = this.f15254c;
        wm0<xs0> a10 = k10.f().a();
        return a10.b(a10.c());
    }
}
