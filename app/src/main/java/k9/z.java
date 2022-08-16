package k9;

import androidx.lifecycle.h0;
import c4.a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import n9.d;
import n9.q;

/* loaded from: classes.dex */
public final class z<T> extends q<T> {

    /* renamed from: v */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5698v = AtomicIntegerFieldUpdater.newUpdater(z.class, "_decision");
    private volatile /* synthetic */ int _decision;

    @Override // n9.q, k9.a
    public final void C(Object obj) {
        boolean z10;
        while (true) {
            int i10 = this._decision;
            z10 = false;
            if (i10 == 0) {
                if (f5698v.compareAndSet(this, 0, 2)) {
                    z10 = true;
                    break;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("Already resumed".toString());
            }
        }
        if (z10) {
            return;
        }
        d.a(h0.b(this.f16717u), a.c(obj), null);
    }

    @Override // n9.q, k9.s0
    public final void f(Object obj) {
        C(obj);
    }
}
