package y4;

/* loaded from: classes.dex */
public final class y3 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ Boolean f20820s;

    /* renamed from: t */
    public final /* synthetic */ f4 f20821t;

    public y3(f4 f4Var, Boolean bool) {
        this.f20821t = f4Var;
        this.f20820s = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20821t.F(this.f20820s, true);
    }
}
