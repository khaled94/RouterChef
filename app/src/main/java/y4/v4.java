package y4;

/* loaded from: classes.dex */
public final class v4 extends j {

    /* renamed from: e */
    public final /* synthetic */ e5 f20776e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(e5 e5Var, k3 k3Var) {
        super(k3Var);
        this.f20776e = e5Var;
    }

    @Override // y4.j
    public final void b() {
        e5 e5Var = this.f20776e;
        e5Var.g();
        if (!e5Var.m()) {
            return;
        }
        ((w2) e5Var.f20505s).C().F.a("Inactivity, disconnecting from the service");
        e5Var.w();
    }
}
