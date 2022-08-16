package m4;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class ba0 {
    public static final void a(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        da0 da0Var = new da0(view, onGlobalLayoutListener);
        ViewTreeObserver b10 = da0Var.b();
        if (b10 != null) {
            da0Var.f(b10);
        }
    }

    public static final void b(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        ea0 ea0Var = new ea0(view, onScrollChangedListener);
        ViewTreeObserver b10 = ea0Var.b();
        if (b10 != null) {
            ea0Var.f(b10);
        }
    }
}
