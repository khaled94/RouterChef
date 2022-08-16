package m4;

import h4.a;
import java.util.Objects;

/* loaded from: classes.dex */
public final class se1 implements nd2<me1<he1>> {

    /* renamed from: a */
    public final vd2<ge1> f13615a;

    /* renamed from: b */
    public final vd2<a> f13616b;

    public se1(vd2<ge1> vd2Var, vd2<a> vd2Var2) {
        this.f13615a = vd2Var;
        this.f13616b = vd2Var2;
    }

    @Override // m4.vd2
    public final Object a() {
        ie1 ie1Var = (ie1) this.f13615a;
        Objects.requireNonNull(ie1Var);
        t90 t90Var = u90.f14294a;
        d.a.d(t90Var);
        return new me1(new ge1(t90Var, ((lf0) ie1Var.f9617b).b()), 10000L, this.f13616b.a());
    }
}
