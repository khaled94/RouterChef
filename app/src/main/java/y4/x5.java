package y4;

import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class x5 implements Callable<String> {

    /* renamed from: a */
    public final /* synthetic */ k6 f20811a;

    /* renamed from: b */
    public final /* synthetic */ a6 f20812b;

    public x5(a6 a6Var, k6 k6Var) {
        this.f20812b = a6Var;
        this.f20811a = k6Var;
    }

    @Override // java.util.concurrent.Callable
    public final String call() {
        a6 a6Var = this.f20812b;
        String str = this.f20811a.f20535s;
        Objects.requireNonNull(str, "null reference");
        if (!a6Var.L(str).g() || !f.b(this.f20811a.N).g()) {
            this.f20812b.C().F.a("Analytics storage consent denied. Returning null app instance id");
            return null;
        }
        return this.f20812b.J(this.f20811a).N();
    }
}
