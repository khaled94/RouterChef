package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes.dex */
public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ CoordinatorLayout f3000a;

    /* renamed from: b */
    public final /* synthetic */ AppBarLayout f3001b;

    /* renamed from: c */
    public final /* synthetic */ AppBarLayout.BaseBehavior f3002c;

    public a(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.f3002c = baseBehavior;
        this.f3000a = coordinatorLayout;
        this.f3001b = appBarLayout;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f3002c.B(this.f3000a, this.f3001b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
