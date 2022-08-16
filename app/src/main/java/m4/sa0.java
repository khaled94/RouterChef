package m4;

/* loaded from: classes.dex */
public final class sa0 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ boolean f13568s;

    /* renamed from: t */
    public final /* synthetic */ ta0 f13569t;

    public sa0(ta0 ta0Var, boolean z10) {
        this.f13569t = ta0Var;
        this.f13568s = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f13569t.c("windowVisibilityChanged", "isVisible", String.valueOf(this.f13568s));
    }
}
