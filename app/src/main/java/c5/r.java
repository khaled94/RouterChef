package c5;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class r<TResult> implements x<TResult> {

    /* renamed from: s */
    public final Executor f2793s;

    /* renamed from: t */
    public final Object f2794t = new Object();
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: u */
    public c f2795u;

    public r(Executor executor, c cVar) {
        this.f2793s = executor;
        this.f2795u = cVar;
    }

    @Override // c5.x
    public final void a(i<TResult> iVar) {
        if (iVar.l()) {
            synchronized (this.f2794t) {
                if (this.f2795u == null) {
                    return;
                }
                this.f2793s.execute(new q(this));
            }
        }
    }
}
