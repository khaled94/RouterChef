package m4;

import androidx.fragment.app.a;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public final class g02<V> extends fz1<V> implements RunnableFuture<V> {
    @CheckForNull

    /* renamed from: z */
    public volatile rz1<?> f8697z;

    public g02(Callable<V> callable) {
        this.f8697z = new f02(this, callable);
    }

    public g02(wy1<V> wy1Var) {
        this.f8697z = new e02(this, wy1Var);
    }

    @Override // m4.my1
    @CheckForNull
    public final String h() {
        rz1<?> rz1Var = this.f8697z;
        if (rz1Var != null) {
            String rz1Var2 = rz1Var.toString();
            return a.b(new StringBuilder(rz1Var2.length() + 7), "task=[", rz1Var2, "]");
        }
        return super.h();
    }

    @Override // m4.my1
    public final void i() {
        rz1<?> rz1Var;
        if (o() && (rz1Var = this.f8697z) != null) {
            rz1Var.g();
        }
        this.f8697z = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        rz1<?> rz1Var = this.f8697z;
        if (rz1Var != null) {
            rz1Var.run();
        }
        this.f8697z = null;
    }
}
