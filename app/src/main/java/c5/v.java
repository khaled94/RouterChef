package c5;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import m4.jh;

/* loaded from: classes.dex */
public final class v<TResult> implements x<TResult> {

    /* renamed from: s */
    public final Executor f2804s;

    /* renamed from: t */
    public final Object f2805t = new Object();
    @GuardedBy("mLock")
    @Nullable

    /* renamed from: u */
    public f<? super TResult> f2806u;

    public v(Executor executor, f<? super TResult> fVar) {
        this.f2804s = executor;
        this.f2806u = fVar;
    }

    @Override // c5.x
    public final void a(i<TResult> iVar) {
        if (iVar.n()) {
            synchronized (this.f2805t) {
                if (this.f2806u == null) {
                    return;
                }
                this.f2804s.execute(new jh(this, iVar, 3));
            }
        }
    }
}
