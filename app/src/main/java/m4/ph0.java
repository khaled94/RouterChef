package m4;

import java.util.Set;
import l3.s;

/* loaded from: classes.dex */
public final class ph0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f12512a;

    /* renamed from: b */
    public final vd2 f12513b;

    public /* synthetic */ ph0(vd2 vd2Var, int i10) {
        this.f12512a = i10;
        this.f12513b = vd2Var;
    }

    @Override // m4.vd2
    public final Object a() {
        switch (this.f12512a) {
            case 0:
                return new fs1(((lf0) this.f12513b).b(), s.B.f5802q.a());
            case 1:
                return new vq0(((td2) this.f12513b).a());
            case 2:
                return new ls0(((td2) this.f12513b).a());
            case 3:
                return new yb1((h01) this.f12513b.a());
            default:
                return new nd1((Set) this.f12513b.a());
        }
    }
}
