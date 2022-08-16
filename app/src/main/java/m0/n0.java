package m0;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public class n0 extends m0 {
    public n0(Window window, View view) {
        super(window, view);
    }

    @Override // j0.d
    public final void c(boolean z10) {
        if (z10) {
            this.C.clearFlags(67108864);
            this.C.addFlags(Integer.MIN_VALUE);
            View decorView = this.C.getDecorView();
            decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
            return;
        }
        View decorView2 = this.C.getDecorView();
        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
    }
}
