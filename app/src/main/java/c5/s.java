package c5;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import m4.pe;

/* loaded from: classes.dex */
public final class s<TResult> implements x<TResult> {

    /* renamed from: s */
    public final Executor f2796s;

    /* renamed from: t */
    public final Object f2797t = new Object();
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: u */
    public d<TResult> f2798u;

    public s(Executor executor, d<TResult> dVar) {
        this.f2796s = executor;
        this.f2798u = dVar;
    }

    @Override // c5.x
    public final void a(i<TResult> iVar) {
        synchronized (this.f2797t) {
            if (this.f2798u == null) {
                return;
            }
            this.f2796s.execute(new pe(this, iVar, 4));
        }
    }
}
