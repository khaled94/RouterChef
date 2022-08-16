package p1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class k extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ i f16919a;

    public k(i iVar) {
        this.f16919a = iVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f16919a.n();
        animator.removeListener(this);
    }
}
