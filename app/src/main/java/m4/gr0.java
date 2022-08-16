package m4;

/* loaded from: classes.dex */
public final class gr0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f9006a;

    /* renamed from: b */
    public final Object f9007b;

    public /* synthetic */ gr0(Object obj, int i10) {
        this.f9006a = i10;
        this.f9007b = obj;
    }

    @Override // m4.vd2
    public final Object a() {
        switch (this.f9006a) {
            case 0:
                return ((dr0) this.f9007b).f7603h;
            default:
                vd0 vd0Var = ((ct0) this.f9007b).f7142b;
                if (vd0Var == null) {
                    return null;
                }
                return vd0Var.E();
        }
    }
}
