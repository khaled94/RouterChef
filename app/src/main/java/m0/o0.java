package m0;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class o0 extends n0 {
    public o0(Window window, View view) {
        super(window, view);
    }

    @Override // j0.d
    public final void b(boolean z10) {
        if (z10) {
            this.C.clearFlags(134217728);
            this.C.addFlags(Integer.MIN_VALUE);
            View decorView = this.C.getDecorView();
            decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
            return;
        }
        View decorView2 = this.C.getDecorView();
        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
    }
}
