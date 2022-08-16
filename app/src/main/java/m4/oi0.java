package m4;

import android.content.Context;
import java.util.Objects;
import k4.b;
import n3.g1;

/* loaded from: classes.dex */
public final class oi0 implements fp0 {

    /* renamed from: s */
    public final ym1 f12167s;

    public oi0(ym1 ym1Var) {
        this.f12167s = ym1Var;
    }

    @Override // m4.fp0
    public final void g(Context context) {
        try {
            ym1 ym1Var = this.f12167s;
            Objects.requireNonNull(ym1Var);
            ym1Var.f15839a.w1();
            if (context == null) {
                return;
            }
            ym1 ym1Var2 = this.f12167s;
            Objects.requireNonNull(ym1Var2);
            ym1Var2.f15839a.y3(new b(context));
        } catch (pm1 e10) {
            g1.k("Cannot invoke onResume for the mediation adapter.", e10);
        }
    }

    @Override // m4.fp0
    public final void r(Context context) {
        try {
            ym1 ym1Var = this.f12167s;
            Objects.requireNonNull(ym1Var);
            ym1Var.f15839a.S();
        } catch (pm1 e10) {
            g1.k("Cannot invoke onPause for the mediation adapter.", e10);
        }
    }

    @Override // m4.fp0
    public final void s(Context context) {
        try {
            ym1 ym1Var = this.f12167s;
            Objects.requireNonNull(ym1Var);
            ym1Var.f15839a.k();
        } catch (pm1 e10) {
            g1.k("Cannot invoke onDestroy for the mediation adapter.", e10);
        }
    }
}
