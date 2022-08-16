package m4;

import android.content.Context;

/* loaded from: classes.dex */
public final class d01 implements fp0 {

    /* renamed from: s */
    public final vd0 f7166s;

    public d01(vd0 vd0Var) {
        this.f7166s = vd0Var;
    }

    @Override // m4.fp0
    public final void g(Context context) {
        vd0 vd0Var = this.f7166s;
        if (vd0Var != null) {
            vd0Var.onResume();
        }
    }

    @Override // m4.fp0
    public final void r(Context context) {
        vd0 vd0Var = this.f7166s;
        if (vd0Var != null) {
            vd0Var.onPause();
        }
    }

    @Override // m4.fp0
    public final void s(Context context) {
        vd0 vd0Var = this.f7166s;
        if (vd0Var != null) {
            vd0Var.destroy();
        }
    }
}
