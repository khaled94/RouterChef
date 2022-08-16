package com.google.android.material.transformation;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ View f3456a;

    public a(View view) {
        this.f3456a = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f3456a.invalidate();
    }
}
