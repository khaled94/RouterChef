package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import n5.d;

/* loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ d f3459a;

    public c(d dVar) {
        this.f3459a = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        d.C0096d revealInfo = this.f3459a.getRevealInfo();
        revealInfo.f16614c = Float.MAX_VALUE;
        this.f3459a.setRevealInfo(revealInfo);
    }
}
