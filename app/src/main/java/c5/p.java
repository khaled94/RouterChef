package c5;

import h2.m;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class p<TResult, TContinuationResult> implements f<TContinuationResult>, e, c, x {

    /* renamed from: s */
    public final Executor f2789s;

    /* renamed from: t */
    public final a<TResult, i<TContinuationResult>> f2790t;

    /* renamed from: u */
    public final b0<TContinuationResult> f2791u;

    public p(Executor executor, a<TResult, i<TContinuationResult>> aVar, b0<TContinuationResult> b0Var) {
        this.f2789s = executor;
        this.f2790t = aVar;
        this.f2791u = b0Var;
    }

    @Override // c5.x
    public final void a(i<TResult> iVar) {
        this.f2789s.execute(new m(this, iVar, 3));
    }

    @Override // c5.c
    public final void b() {
        this.f2791u.s();
    }

    @Override // c5.f
    public final void c(TContinuationResult tcontinuationresult) {
        this.f2791u.r(tcontinuationresult);
    }

    @Override // c5.e
    public final void e(Exception exc) {
        this.f2791u.q(exc);
    }
}
