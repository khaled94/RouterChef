package y4;

/* loaded from: classes.dex */
public final class p3 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ boolean f20649s;

    /* renamed from: t */
    public final /* synthetic */ f4 f20650t;

    public p3(f4 f4Var, boolean z10) {
        this.f20650t = f4Var;
        this.f20649s = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean f10 = ((w2) this.f20650t.f20505s).f();
        boolean e10 = ((w2) this.f20650t.f20505s).e();
        ((w2) this.f20650t.f20505s).S = Boolean.valueOf(this.f20649s);
        if (e10 == this.f20649s) {
            ((w2) this.f20650t.f20505s).C().F.b("Default data collection state already set to", Boolean.valueOf(this.f20649s));
        }
        if (((w2) this.f20650t.f20505s).f() == f10 || ((w2) this.f20650t.f20505s).f() != ((w2) this.f20650t.f20505s).e()) {
            ((w2) this.f20650t.f20505s).C().C.c("Default data collection is different than actual status", Boolean.valueOf(this.f20649s), Boolean.valueOf(f10));
        }
        this.f20650t.G();
    }
}
