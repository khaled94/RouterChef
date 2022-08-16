package p1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import r.a;

/* loaded from: classes.dex */
public final class j extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ a f16917a;

    /* renamed from: b */
    public final /* synthetic */ i f16918b;

    public j(i iVar, a aVar) {
        this.f16918b = iVar;
        this.f16917a = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f16917a.remove(animator);
        this.f16918b.E.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f16918b.E.add(animator);
    }
}
