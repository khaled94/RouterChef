package m3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class q extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ s f5978a;

    public q(s sVar) {
        this.f5978a = sVar;
    }

    public final void a(boolean z10) {
        this.f5978a.setClickable(z10);
        this.f5978a.f5983s.setClickable(z10);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        a(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        a(false);
    }
}
