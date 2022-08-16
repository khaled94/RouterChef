package m4;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class ea0 extends fa0 implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: t */
    public final WeakReference<ViewTreeObserver.OnScrollChangedListener> f7752t;

    public ea0(View view, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        super(view);
        this.f7752t = new WeakReference<>(onScrollChangedListener);
    }

    public final void f(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this);
    }

    public final void g(ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = this.f7752t.get();
        if (onScrollChangedListener != null) {
            onScrollChangedListener.onScrollChanged();
            return;
        }
        ViewTreeObserver b10 = b();
        if (b10 == null) {
            return;
        }
        g(b10);
    }
}
