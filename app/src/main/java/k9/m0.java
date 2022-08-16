package k9;

import d9.l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import v8.h;

/* loaded from: classes.dex */
public final class m0 extends q0 {

    /* renamed from: x */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5671x = AtomicIntegerFieldUpdater.newUpdater(m0.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* renamed from: w */
    public final l<Throwable, h> f5672w;

    /* JADX WARN: Multi-variable type inference failed */
    public m0(l<? super Throwable, h> lVar) {
        this.f5672w = lVar;
    }

    @Override // d9.l
    public final /* bridge */ /* synthetic */ h c(Throwable th) {
        m(th);
        return h.f19835a;
    }

    @Override // k9.o
    public final void m(Throwable th) {
        if (f5671x.compareAndSet(this, 0, 1)) {
            this.f5672w.c(th);
        }
    }
}
