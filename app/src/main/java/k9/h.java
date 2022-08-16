package k9;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import n9.c;

/* loaded from: classes.dex */
public final class h extends q0 {

    /* renamed from: w */
    public final f<?> f5659w;

    public h(f<?> fVar) {
        this.f5659w = fVar;
    }

    @Override // d9.l
    public final /* bridge */ /* synthetic */ v8.h c(Throwable th) {
        m(th);
        return v8.h.f19835a;
    }

    @Override // k9.o
    public final void m(Throwable th) {
        f<?> fVar = this.f5659w;
        s0 n10 = n();
        Objects.requireNonNull(fVar);
        CancellationException L = n10.L();
        if (!fVar.r() ? false : ((c) fVar.f5649v).j(L)) {
            return;
        }
        fVar.l(L);
        fVar.n();
    }
}
