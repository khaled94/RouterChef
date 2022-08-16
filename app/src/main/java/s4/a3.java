package s4;

import c1.f;
import d.b;
import h2.u;

/* loaded from: classes.dex */
public final class a3 {

    /* renamed from: a */
    public final u f17706a;

    /* renamed from: b */
    public final a4 f17707b;

    /* renamed from: c */
    public final a4 f17708c;

    /* renamed from: d */
    public final h6 f17709d;

    public a3() {
        u uVar = new u(9);
        this.f17706a = uVar;
        a4 a4Var = new a4(null, uVar);
        this.f17708c = a4Var;
        this.f17707b = a4Var.a();
        h6 h6Var = new h6(0);
        this.f17709d = h6Var;
        a4Var.f("require", new jd(h6Var));
        h6Var.d("internal.platform", f2.f17861a);
        a4Var.f("runtime.counter", new g(Double.valueOf(0.0d)));
    }

    public final n a(a4 a4Var, r4... r4VarArr) {
        n nVar = n.f18009j;
        for (r4 r4Var : r4VarArr) {
            nVar = b.f(r4Var);
            f.g(this.f17708c);
            if ((nVar instanceof o) || (nVar instanceof m)) {
                nVar = this.f17706a.g(a4Var, nVar);
            }
        }
        return nVar;
    }
}
