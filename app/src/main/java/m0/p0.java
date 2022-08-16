package m0;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import j0.d;

/* loaded from: classes.dex */
public final class p0 extends d {
    public final WindowInsetsController C;
    public Window D;

    public p0(Window window) {
        this.C = window.getInsetsController();
        this.D = window;
    }

    @Override // j0.d
    public final void b(boolean z10) {
        if (z10) {
            Window window = this.D;
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.C.setSystemBarsAppearance(16, 16);
            return;
        }
        Window window2 = this.D;
        if (window2 != null) {
            View decorView2 = window2.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.C.setSystemBarsAppearance(0, 16);
    }

    @Override // j0.d
    public final void c(boolean z10) {
        if (z10) {
            Window window = this.D;
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
            }
            this.C.setSystemBarsAppearance(8, 8);
            return;
        }
        Window window2 = this.D;
        if (window2 != null) {
            View decorView2 = window2.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.C.setSystemBarsAppearance(0, 8);
    }
}
