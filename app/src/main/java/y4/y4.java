package y4;

import d4.m;

/* loaded from: classes.dex */
public final class y4 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ k6 f20822s;

    /* renamed from: t */
    public final /* synthetic */ boolean f20823t;

    /* renamed from: u */
    public final /* synthetic */ p f20824u;

    /* renamed from: v */
    public final /* synthetic */ e5 f20825v;

    public y4(e5 e5Var, k6 k6Var, boolean z10, p pVar) {
        this.f20825v = e5Var;
        this.f20822s = k6Var;
        this.f20823t = z10;
        this.f20824u = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e5 e5Var = this.f20825v;
        j1 j1Var = e5Var.f20389v;
        if (j1Var == null) {
            ((w2) e5Var.f20505s).C().f20710x.a("Discarding data. Failed to send event to service");
            return;
        }
        m.h(this.f20822s);
        this.f20825v.k(j1Var, this.f20823t ? null : this.f20824u, this.f20822s);
        this.f20825v.r();
    }
}
