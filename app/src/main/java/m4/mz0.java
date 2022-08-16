package m4;

/* loaded from: classes.dex */
public final class mz0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f11364a;

    /* renamed from: b */
    public final vd2 f11365b;

    public /* synthetic */ mz0(vd2 vd2Var, int i10) {
        this.f11364a = i10;
        this.f11365b = vd2Var;
    }

    @Override // m4.vd2
    public final Object a() {
        switch (this.f11364a) {
            case 0:
                return new es0((zr0) this.f11365b.a(), u90.f14299f);
            case 1:
                dp1 dp1Var = new dp1();
                dp1Var.f7586a.put("request_id", (String) this.f11365b.a());
                return dp1Var;
            default:
                return new ki1(((lf0) this.f11365b).b());
        }
    }
}
