package y4;

import d4.m;

/* loaded from: classes.dex */
public final class r4 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ k6 f20697s;

    /* renamed from: t */
    public final /* synthetic */ boolean f20698t;

    /* renamed from: u */
    public final /* synthetic */ d6 f20699u;

    /* renamed from: v */
    public final /* synthetic */ e5 f20700v;

    public r4(e5 e5Var, k6 k6Var, boolean z10, d6 d6Var) {
        this.f20700v = e5Var;
        this.f20697s = k6Var;
        this.f20698t = z10;
        this.f20699u = d6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e5 e5Var = this.f20700v;
        j1 j1Var = e5Var.f20389v;
        if (j1Var == null) {
            ((w2) e5Var.f20505s).C().f20710x.a("Discarding data. Failed to set user property");
            return;
        }
        m.h(this.f20697s);
        this.f20700v.k(j1Var, this.f20698t ? null : this.f20699u, this.f20697s);
        this.f20700v.r();
    }
}
