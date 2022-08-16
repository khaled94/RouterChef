package y4;

/* loaded from: classes.dex */
public final class n4 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ l4 f20605s;

    /* renamed from: t */
    public final /* synthetic */ l4 f20606t;

    /* renamed from: u */
    public final /* synthetic */ long f20607u;

    /* renamed from: v */
    public final /* synthetic */ boolean f20608v;

    /* renamed from: w */
    public final /* synthetic */ p4 f20609w;

    public n4(p4 p4Var, l4 l4Var, l4 l4Var2, long j3, boolean z10) {
        this.f20609w = p4Var;
        this.f20605s = l4Var;
        this.f20606t = l4Var2;
        this.f20607u = j3;
        this.f20608v = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20609w.l(this.f20605s, this.f20606t, this.f20607u, this.f20608v, null);
    }
}
