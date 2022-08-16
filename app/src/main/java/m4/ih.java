package m4;

/* loaded from: classes.dex */
public final class ih implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f9648s;

    /* renamed from: t */
    public final /* synthetic */ int f9649t;

    /* renamed from: u */
    public final /* synthetic */ lh f9650u;

    public ih(lh lhVar, int i10, int i11, int i12, float f10) {
        this.f9650u = lhVar;
        this.f9648s = i10;
        this.f9649t = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f9648s;
        int i11 = this.f9649t;
        va0 va0Var = ((dc0) ((mh) this.f9650u.f10839c)).E;
        if (va0Var != null) {
            va0Var.e(i10, i11);
        }
    }
}
