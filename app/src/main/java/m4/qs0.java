package m4;

import d.a;

/* loaded from: classes.dex */
public final class qs0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f12990a;

    /* renamed from: b */
    public final vd2 f12991b;

    public /* synthetic */ qs0(vd2 vd2Var, int i10) {
        this.f12990a = i10;
        this.f12991b = vd2Var;
    }

    @Override // m4.vd2
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f12990a) {
            case 0:
                return new ps0(((td2) this.f12991b).a());
            case 1:
                t90 t90Var = u90.f14294a;
                a.d(t90Var);
                return new zb1(t90Var);
            default:
                return new zg1((il1) this.f12991b.a());
        }
    }
}
