package m4;

/* loaded from: classes.dex */
public final class q12 extends r02 {

    /* renamed from: b */
    public final /* synthetic */ int f12681b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q12(Class cls, int i10) {
        super(cls);
        this.f12681b = i10;
    }

    @Override // m4.r02
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        switch (this.f12681b) {
            case 0:
                g42 g42Var = (g42) obj;
                return new a72(g42Var.B().e(), g42Var.A().v());
            default:
                v32 v32Var = (v32) obj;
                return new t72(new q72(v32Var.A().e()), v32Var.z().v());
        }
    }
}
