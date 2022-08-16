package m4;

import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class ml0 extends ik0 {

    /* renamed from: i */
    public final zv f11238i;

    /* renamed from: j */
    public final Runnable f11239j;

    /* renamed from: k */
    public final Executor f11240k;

    public ml0(zl0 zl0Var, zv zvVar, Runnable runnable, Executor executor) {
        super(zl0Var);
        this.f11238i = zvVar;
        this.f11239j = runnable;
        this.f11240k = executor;
    }

    public static /* synthetic */ void j(AtomicReference atomicReference) {
        Runnable runnable = (Runnable) atomicReference.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // m4.am0
    public final void b() {
        this.f11240k.execute(new oe(this, new ll0(new AtomicReference(this.f11239j)), 4, null));
    }

    @Override // m4.ik0
    public final int c() {
        return 0;
    }

    @Override // m4.ik0
    public final View d() {
        return null;
    }

    @Override // m4.ik0
    public final lq e() {
        return null;
    }

    @Override // m4.ik0
    public final dm1 f() {
        return null;
    }

    @Override // m4.ik0
    public final dm1 g() {
        return null;
    }

    @Override // m4.ik0
    public final void h() {
    }

    @Override // m4.ik0
    public final void i(ViewGroup viewGroup, on onVar) {
    }
}
