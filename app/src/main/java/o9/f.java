package o9;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import k9.h0;

/* loaded from: classes.dex */
public class f extends h0 {

    /* renamed from: t */
    public a f16830t;

    public f(int i10, int i11, long j3) {
        this.f16830t = new a(i10, i11, j3, "DefaultDispatcher");
    }

    @Override // k9.q
    public final void m0(x8.f fVar, Runnable runnable) {
        a aVar = this.f16830t;
        AtomicLongFieldUpdater atomicLongFieldUpdater = a.f16812z;
        aVar.j(runnable, k.f16840f, false);
    }
}
