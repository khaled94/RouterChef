package k9;

import java.util.concurrent.CancellationException;
import v8.h;

/* loaded from: classes.dex */
public final class j extends q0 implements i {

    /* renamed from: w */
    public final k f5661w;

    @Override // d9.l
    public final /* bridge */ /* synthetic */ h c(Throwable th) {
        m(th);
        return h.f19835a;
    }

    @Override // k9.i
    public final boolean g(Throwable th) {
        s0 n10 = n();
        if (th instanceof CancellationException) {
            return true;
        }
        return n10.g(th);
    }

    @Override // k9.o
    public final void m(Throwable th) {
        this.f5661w.H(n());
    }
}
