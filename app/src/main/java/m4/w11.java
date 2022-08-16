package m4;

import d.a;
import java.util.Objects;

/* loaded from: classes.dex */
public final class w11 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f14840a;

    /* renamed from: b */
    public final vd2 f14841b;

    /* renamed from: c */
    public final vd2 f14842c;

    public /* synthetic */ w11(vd2 vd2Var, vd2 vd2Var2, int i10) {
        this.f14840a = i10;
        this.f14841b = vd2Var;
        this.f14842c = vd2Var2;
    }

    @Override // m4.vd2
    public final Object a() {
        switch (this.f14840a) {
            case 0:
                return new v11((x11) this.f14841b.a(), new fk0(((u11) this.f14842c).f14242a.a(), 7));
            default:
                lh1 lh1Var = (lh1) this.f14841b;
                Objects.requireNonNull(lh1Var);
                t90 t90Var = u90.f14294a;
                a.d(t90Var);
                return new me1(new kh1(t90Var, ((lf0) lh1Var.f10841b).b()), dt.f7631a.e().longValue(), (h4.a) this.f14842c.a());
        }
    }
}
