package y4;

/* loaded from: classes.dex */
public final class z3 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ f f20858s;

    /* renamed from: t */
    public final /* synthetic */ long f20859t;

    /* renamed from: u */
    public final /* synthetic */ int f20860u;

    /* renamed from: v */
    public final /* synthetic */ long f20861v;

    /* renamed from: w */
    public final /* synthetic */ boolean f20862w;

    /* renamed from: x */
    public final /* synthetic */ f4 f20863x;

    public z3(f4 f4Var, f fVar, long j3, int i10, long j10, boolean z10) {
        this.f20863x = f4Var;
        this.f20858s = fVar;
        this.f20859t = j3;
        this.f20860u = i10;
        this.f20861v = j10;
        this.f20862w = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20863x.y(this.f20858s);
        this.f20863x.q(this.f20859t, false);
        f4.I(this.f20863x, this.f20858s, this.f20860u, this.f20861v, true, this.f20862w);
    }
}
