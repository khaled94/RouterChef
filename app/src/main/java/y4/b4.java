package y4;

/* loaded from: classes.dex */
public final class b4 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ f f20316s;

    /* renamed from: t */
    public final /* synthetic */ int f20317t;

    /* renamed from: u */
    public final /* synthetic */ long f20318u;

    /* renamed from: v */
    public final /* synthetic */ boolean f20319v;

    /* renamed from: w */
    public final /* synthetic */ f4 f20320w;

    public b4(f4 f4Var, f fVar, int i10, long j3, boolean z10) {
        this.f20320w = f4Var;
        this.f20316s = fVar;
        this.f20317t = i10;
        this.f20318u = j3;
        this.f20319v = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20320w.y(this.f20316s);
        f4.I(this.f20320w, this.f20316s, this.f20317t, this.f20318u, false, this.f20319v);
    }
}
