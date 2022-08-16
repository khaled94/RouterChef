package m4;

/* loaded from: classes.dex */
public final class ai0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f6167a;

    /* renamed from: b */
    public final vd2 f6168b;

    public /* synthetic */ ai0(vd2 vd2Var, int i10) {
        this.f6167a = i10;
        this.f6168b = vd2Var;
    }

    @Override // m4.vd2
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f6167a) {
            case 0:
                return new zh0((x21) this.f6168b.a());
            case 1:
                return new iv0(((mm0) this.f6168b).b());
            default:
                return new b31(((lf0) this.f6168b).b());
        }
    }
}
