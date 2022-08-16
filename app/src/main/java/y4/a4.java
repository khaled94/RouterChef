package y4;

/* loaded from: classes.dex */
public final class a4 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ f f20282s;

    /* renamed from: t */
    public final /* synthetic */ int f20283t;

    /* renamed from: u */
    public final /* synthetic */ long f20284u;

    /* renamed from: v */
    public final /* synthetic */ boolean f20285v;

    /* renamed from: w */
    public final /* synthetic */ f4 f20286w;

    public a4(f4 f4Var, f fVar, int i10, long j3, boolean z10) {
        this.f20286w = f4Var;
        this.f20282s = fVar;
        this.f20283t = i10;
        this.f20284u = j3;
        this.f20285v = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20286w.y(this.f20282s);
        f4.I(this.f20286w, this.f20282s, this.f20283t, this.f20284u, false, this.f20285v);
    }
}
