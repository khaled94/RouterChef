package m4;

/* loaded from: classes.dex */
public final /* synthetic */ class jd0 implements ye0, rk1 {

    /* renamed from: s */
    public final Object f9928s;

    public /* synthetic */ jd0(Object obj) {
        this.f9928s = obj;
    }

    @Override // m4.ye0
    public final void J(boolean z10) {
        v90 v90Var = (v90) this.f9928s;
        if (z10) {
            v90Var.d();
        } else {
            v90Var.c(new ea1(1, "Image Web View failed to load."));
        }
    }

    @Override // m4.rk1
    public final void h(Object obj) {
        ((pp) obj).p0((cn) this.f9928s);
    }
}
