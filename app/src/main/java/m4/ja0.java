package m4;

/* loaded from: classes.dex */
public final class ja0 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f9885s;

    /* renamed from: t */
    public final /* synthetic */ int f9886t;

    /* renamed from: u */
    public final /* synthetic */ na0 f9887u;

    public ja0(na0 na0Var, int i10, int i11) {
        this.f9887u = na0Var;
        this.f9885s = i10;
        this.f9886t = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oa0 oa0Var = this.f9887u.H;
        if (oa0Var != null) {
            ((ta0) oa0Var).i(this.f9885s, this.f9886t);
        }
    }
}
