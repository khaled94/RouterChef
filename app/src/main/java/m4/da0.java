package m4;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import l3.s;
import n3.x1;

/* loaded from: classes.dex */
public final class da0 extends fa0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: t */
    public final WeakReference<ViewTreeObserver.OnGlobalLayoutListener> f7272t;

    public da0(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        super(view);
        this.f7272t = new WeakReference<>(onGlobalLayoutListener);
    }

    public final void f(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    public final void g(ViewTreeObserver viewTreeObserver) {
        x1 x1Var = s.B.f5791e;
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f7272t.get();
        if (onGlobalLayoutListener != null) {
            onGlobalLayoutListener.onGlobalLayout();
            return;
        }
        ViewTreeObserver b10 = b();
        if (b10 == null) {
            return;
        }
        g(b10);
    }
}
