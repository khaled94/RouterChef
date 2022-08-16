package m4;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public final class cz1<V> extends sy1<Object, V> {
    @CheckForNull
    public bz1 H;

    public cz1(bw1<? extends tz1<?>> bw1Var, boolean z10, Executor executor, Callable<V> callable) {
        super(bw1Var, z10, false);
        this.H = new bz1(this, callable, executor);
        z();
    }

    @Override // m4.my1
    public final void j() {
        bz1 bz1Var = this.H;
        if (bz1Var != null) {
            bz1Var.g();
        }
    }

    @Override // m4.sy1
    public final void r(int i10) {
        this.D = null;
        if (i10 == 1) {
            this.H = null;
        }
    }

    @Override // m4.sy1
    public final void x(int i10, @CheckForNull Object obj) {
    }

    @Override // m4.sy1
    public final void y() {
        bz1 bz1Var = this.H;
        if (bz1Var != null) {
            try {
                bz1Var.f6664u.execute(bz1Var);
            } catch (RejectedExecutionException e10) {
                bz1Var.f6665v.m(e10);
            }
        }
    }
}
