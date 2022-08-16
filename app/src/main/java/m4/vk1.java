package m4;

import n3.g1;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public final class vk1 implements cu1<t41, xk1> {

    /* renamed from: a */
    public final /* synthetic */ yk1 f14710a;

    public vk1(yk1 yk1Var) {
        this.f14710a = yk1Var;
    }

    @Override // m4.cu1
    @NullableDecl
    public final /* bridge */ /* synthetic */ xk1 a(@NullableDecl t41 t41Var) {
        g1.h("", t41Var);
        g1.a("Failed to get a cache key, reverting to legacy flow.");
        yk1 yk1Var = this.f14710a;
        yk1Var.f15806d = new xk1(null, yk1Var.a());
        return this.f14710a.f15806d;
    }
}
