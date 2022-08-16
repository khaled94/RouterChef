package d6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class a extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ com.google.android.material.textfield.a f3944a;

    public a(com.google.android.material.textfield.a aVar) {
        this.f3944a = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f3944a.f3951a.setEndIconVisible(true);
    }
}
