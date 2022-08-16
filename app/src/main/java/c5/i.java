package c5;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class i<TResult> {
    public i<TResult> a(Executor executor, c cVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public i<TResult> b(Executor executor, d<TResult> dVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract i<TResult> c(Executor executor, e eVar);

    public abstract i<TResult> d(Executor executor, f<? super TResult> fVar);

    public <TContinuationResult> i<TContinuationResult> e(a<TResult, TContinuationResult> aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> i<TContinuationResult> f(Executor executor, a<TResult, TContinuationResult> aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> i<TContinuationResult> g(a<TResult, i<TContinuationResult>> aVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public <TContinuationResult> i<TContinuationResult> h(Executor executor, a<TResult, i<TContinuationResult>> aVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Exception i();

    public abstract TResult j();

    public abstract <X extends Throwable> TResult k(Class<X> cls);

    public abstract boolean l();

    public abstract boolean m();

    public abstract boolean n();

    public <TContinuationResult> i<TContinuationResult> o(h<TResult, TContinuationResult> hVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public <TContinuationResult> i<TContinuationResult> p(Executor executor, h<TResult, TContinuationResult> hVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
