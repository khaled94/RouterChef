package m4;

import h4.a;

/* loaded from: classes.dex */
public final class dm0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f7547a;

    /* renamed from: b */
    public final vd2 f7548b;

    public /* synthetic */ dm0(vd2 vd2Var, int i10) {
        this.f7547a = i10;
        this.f7548b = vd2Var;
    }

    @Override // m4.vd2
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f7547a) {
            case 0:
                return new bm0(((qd2) this.f7548b).a());
            case 1:
                return new ip0(((td2) this.f7548b).a());
            default:
                return new n11((a) this.f7548b.a());
        }
    }
}
