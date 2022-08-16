package m4;

import d.a;

/* loaded from: classes.dex */
public final class cn0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f7072a;

    /* renamed from: b */
    public final vd2 f7073b;

    /* renamed from: c */
    public final vd2 f7074c;

    public /* synthetic */ cn0(vd2 vd2Var, vd2 vd2Var2, int i10) {
        this.f7072a = i10;
        this.f7073b = vd2Var;
        this.f7074c = vd2Var2;
    }

    @Override // m4.vd2
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f7072a) {
            case 0:
                t90 t90Var = u90.f14294a;
                a.d(t90Var);
                return new es0((ms0) this.f7073b.a(), t90Var);
            default:
                return new fy0((av0) this.f7073b.a(), ((ov0) this.f7074c).b());
        }
    }
}
