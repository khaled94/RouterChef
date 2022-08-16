package m4;

import d.a;
import java.util.Objects;

/* loaded from: classes.dex */
public final class cx0 implements nd2<bx0> {

    /* renamed from: a */
    public final vd2<uz1> f7150a = eb.f7756v;

    /* renamed from: b */
    public final vd2<mx0> f7151b;

    /* renamed from: c */
    public final vd2<rx0> f7152c;

    public cx0(vd2 vd2Var, vd2 vd2Var2) {
        this.f7151b = vd2Var;
        this.f7152c = vd2Var2;
    }

    /* renamed from: b */
    public final bx0 a() {
        t90 t90Var = u90.f14294a;
        a.d(t90Var);
        mx0 a10 = ((nx0) this.f7151b).a();
        sx0 sx0Var = (sx0) this.f7152c;
        Objects.requireNonNull(sx0Var);
        return new bx0(t90Var, a10, new rx0(t90Var, ((nx0) sx0Var.f13839b).a()));
    }
}
