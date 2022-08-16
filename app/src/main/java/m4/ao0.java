package m4;

import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ao0 implements mp0, fp0 {

    /* renamed from: s */
    public final cm1 f6222s;

    public ao0(cm1 cm1Var) {
        this.f6222s = cm1Var;
    }

    @Override // m4.fp0
    public final void g(Context context) {
    }

    @Override // m4.mp0
    public final void j() {
        i40 i40Var = this.f6222s.f7033a0;
        if (i40Var == null || !i40Var.f9530a) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.f6222s.f7033a0.f9531b.isEmpty()) {
            return;
        }
        arrayList.add(this.f6222s.f7033a0.f9531b);
    }

    @Override // m4.fp0
    public final void r(Context context) {
    }

    @Override // m4.fp0
    public final void s(Context context) {
    }
}
