package m4;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class of1 implements dh1<Bundle> {

    /* renamed from: a */
    public final bm1 f12144a;

    public of1(bm1 bm1Var) {
        this.f12144a = bm1Var;
    }

    @Override // m4.dh1
    public final void h(Bundle bundle) {
        boolean z10;
        boolean z11;
        Bundle bundle2 = bundle;
        bm1 bm1Var = this.f12144a;
        if (bm1Var != null) {
            synchronized (bm1Var.f6570b) {
                bm1Var.a();
                z10 = true;
                z11 = bm1Var.f6572d == 2;
            }
            bundle2.putBoolean("render_in_browser", z11);
            bm1 bm1Var2 = this.f12144a;
            synchronized (bm1Var2.f6570b) {
                bm1Var2.a();
                if (bm1Var2.f6572d != 3) {
                    z10 = false;
                }
            }
            bundle2.putBoolean("disable_ml", z10);
        }
    }
}
