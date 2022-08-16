package m4;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class vz1 implements Executor {

    /* renamed from: s */
    public final /* synthetic */ Executor f14803s;

    /* renamed from: t */
    public final /* synthetic */ my1 f14804t;

    public vz1(Executor executor, my1 my1Var) {
        this.f14803s = executor;
        this.f14804t = my1Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.f14803s.execute(runnable);
        } catch (RejectedExecutionException e10) {
            this.f14804t.m(e10);
        }
    }
}
