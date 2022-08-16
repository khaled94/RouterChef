package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import n5.d;

/* loaded from: classes.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ d f3457a;

    /* renamed from: b */
    public final /* synthetic */ Drawable f3458b;

    public b(d dVar, Drawable drawable) {
        this.f3457a = dVar;
        this.f3458b = drawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f3457a.setCircularRevealOverlayDrawable(null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f3457a.setCircularRevealOverlayDrawable(this.f3458b);
    }
}
