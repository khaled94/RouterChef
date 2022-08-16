package c5;

import java.util.concurrent.Executor;
import m4.ce2;

/* loaded from: classes.dex */
public final class o<TResult, TContinuationResult> implements x<TResult> {

    /* renamed from: s */
    public final Executor f2786s;

    /* renamed from: t */
    public final a<TResult, TContinuationResult> f2787t;

    /* renamed from: u */
    public final b0<TContinuationResult> f2788u;

    public o(Executor executor, a<TResult, TContinuationResult> aVar, b0<TContinuationResult> b0Var) {
        this.f2786s = executor;
        this.f2787t = aVar;
        this.f2788u = b0Var;
    }

    @Override // c5.x
    public final void a(i<TResult> iVar) {
        this.f2786s.execute(new ce2(this, iVar));
    }
}
