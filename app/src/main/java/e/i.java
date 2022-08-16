package e;

import android.view.View;
import m0.l0;
import m0.q;
import m0.z;

/* loaded from: classes.dex */
public final class i implements q {

    /* renamed from: a */
    public final /* synthetic */ h f4238a;

    public i(h hVar) {
        this.f4238a = hVar;
    }

    @Override // m0.q
    public final l0 a(View view, l0 l0Var) {
        int f10 = l0Var.f();
        int U = this.f4238a.U(l0Var);
        if (f10 != U) {
            l0Var = l0Var.i(l0Var.d(), U, l0Var.e(), l0Var.c());
        }
        return z.k(view, l0Var);
    }
}
