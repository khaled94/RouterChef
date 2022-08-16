package c5;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class u<TResult> implements x<TResult> {

    /* renamed from: s */
    public final Executor f2801s;

    /* renamed from: t */
    public final Object f2802t = new Object();
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: u */
    public e f2803u;

    public u(Executor executor, e eVar) {
        this.f2801s = executor;
        this.f2803u = eVar;
    }

    @Override // c5.x
    public final void a(i<TResult> iVar) {
        if (iVar.n() || iVar.l()) {
            return;
        }
        synchronized (this.f2802t) {
            if (this.f2803u == null) {
                return;
            }
            this.f2801s.execute(new t(this, iVar));
        }
    }
}
