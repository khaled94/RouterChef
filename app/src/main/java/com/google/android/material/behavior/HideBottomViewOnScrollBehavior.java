package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a */
    public int f3010a = 0;

    /* renamed from: b */
    public int f3011b = 2;

    /* renamed from: c */
    public int f3012c = 0;

    /* renamed from: d */
    public ViewPropertyAnimator f3013d;

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
            HideBottomViewOnScrollBehavior.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f3013d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        this.f3010a = v10.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v10.getLayoutParams()).bottomMargin;
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void l(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
        boolean z10 = false;
        if (i10 > 0) {
            if (this.f3011b == 1) {
                z10 = true;
            }
            if (z10) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.f3013d;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f3011b = 1;
            s(view, this.f3010a + this.f3012c, 175L, e5.a.f4410c);
        } else if (i10 >= 0) {
        } else {
            if (this.f3011b == 2) {
                z10 = true;
            }
            if (z10) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator2 = this.f3013d;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
                view.clearAnimation();
            }
            this.f3011b = 2;
            s(view, 0, 225L, e5.a.f4411d);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11) {
        return i10 == 2;
    }

    public final void s(V v10, int i10, long j3, TimeInterpolator timeInterpolator) {
        this.f3013d = v10.animate().translationY(i10).setInterpolator(timeInterpolator).setDuration(j3).setListener(new a());
    }
}
