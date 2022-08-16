package m4;

import android.view.View;

/* loaded from: classes.dex */
public final class zd0 implements View.OnAttachStateChangeListener {

    /* renamed from: s */
    public final /* synthetic */ g70 f16152s;

    /* renamed from: t */
    public final /* synthetic */ ce0 f16153t;

    public zd0(ce0 ce0Var, g70 g70Var) {
        this.f16153t = ce0Var;
        this.f16152s = g70Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f16153t.g(view, this.f16152s, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
