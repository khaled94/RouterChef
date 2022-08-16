package f6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.transformation.ExpandableTransformationBehavior;

/* loaded from: classes.dex */
public final class a extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ ExpandableTransformationBehavior f4550a;

    public a(ExpandableTransformationBehavior expandableTransformationBehavior) {
        this.f4550a = expandableTransformationBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f4550a.f3439b = null;
    }
}
