package m4;

/* loaded from: classes.dex */
public final class la0 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f10690s;

    /* renamed from: t */
    public final /* synthetic */ Object f10691t;

    public /* synthetic */ la0(Object obj, int i10) {
        this.f10690s = i10;
        this.f10691t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10690s) {
            case 0:
                na0 na0Var = (na0) this.f10691t;
                oa0 oa0Var = na0Var.H;
                if (oa0Var == null) {
                    return;
                }
                if (!na0Var.I) {
                    ((ta0) oa0Var).f13971u.setVisibility(4);
                    ((na0) this.f10691t).I = true;
                }
                ((ta0) ((na0) this.f10691t).H).f();
                return;
            default:
                ti0 ti0Var = (ti0) this.f10691t;
                ti0Var.f14068t.execute(new ma0(ti0Var, 1));
                return;
        }
    }
}
