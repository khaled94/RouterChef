package y4;

import d4.m;

/* loaded from: classes.dex */
public final class z4 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ k6 f20864s;

    /* renamed from: t */
    public final /* synthetic */ boolean f20865t;

    /* renamed from: u */
    public final /* synthetic */ b f20866u;

    /* renamed from: v */
    public final /* synthetic */ e5 f20867v;

    public z4(e5 e5Var, k6 k6Var, boolean z10, b bVar) {
        this.f20867v = e5Var;
        this.f20864s = k6Var;
        this.f20865t = z10;
        this.f20866u = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e5 e5Var = this.f20867v;
        j1 j1Var = e5Var.f20389v;
        if (j1Var == null) {
            ((w2) e5Var.f20505s).C().f20710x.a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        m.h(this.f20864s);
        this.f20867v.k(j1Var, this.f20865t ? null : this.f20866u, this.f20864s);
        this.f20867v.r();
    }
}
