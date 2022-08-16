package androidx.fragment.app;

import android.transition.Transition;

/* loaded from: classes.dex */
public final class s0 implements Transition.TransitionListener {

    /* renamed from: a */
    public final /* synthetic */ Runnable f1579a;

    public s0(Runnable runnable) {
        this.f1579a = runnable;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        this.f1579a.run();
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
    }
}
