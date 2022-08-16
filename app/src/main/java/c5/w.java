package c5;

import java.util.concurrent.Executor;
import m4.kh;

/* loaded from: classes.dex */
public final class w<TResult, TContinuationResult> implements f<TContinuationResult>, e, c, x {

    /* renamed from: s */
    public final Executor f2807s;

    /* renamed from: t */
    public final h<TResult, TContinuationResult> f2808t;

    /* renamed from: u */
    public final b0<TContinuationResult> f2809u;

    public w(Executor executor, h<TResult, TContinuationResult> hVar, b0<TContinuationResult> b0Var) {
        this.f2807s = executor;
        this.f2808t = hVar;
        this.f2809u = b0Var;
    }

    @Override // c5.x
    public final void a(i<TResult> iVar) {
        this.f2807s.execute(new kh(this, iVar, 3));
    }

    @Override // c5.c
    public final void b() {
        this.f2809u.s();
    }

    @Override // c5.f
    public final void c(TContinuationResult tcontinuationresult) {
        this.f2809u.r(tcontinuationresult);
    }

    @Override // c5.e
    public final void e(Exception exc) {
        this.f2809u.q(exc);
    }
}
