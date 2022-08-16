package m0;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;

/* loaded from: classes.dex */
public final class t implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: s */
    public final View f5917s;

    /* renamed from: t */
    public ViewTreeObserver f5918t;

    /* renamed from: u */
    public final Runnable f5919u;

    public t(View view, Runnable runnable) {
        this.f5917s = view;
        this.f5918t = view.getViewTreeObserver();
        this.f5919u = runnable;
    }

    public static t a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        Objects.requireNonNull(runnable, "runnable == null");
        t tVar = new t(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(tVar);
        view.addOnAttachStateChangeListener(tVar);
        return tVar;
    }

    public final void b() {
        (this.f5918t.isAlive() ? this.f5918t : this.f5917s.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f5917s.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        b();
        this.f5919u.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f5918t = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        b();
    }
}
