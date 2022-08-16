package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import f6.a;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b */
    public AnimatorSet f3439b;

    public ExpandableTransformationBehavior() {
    }

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    public void s(View view, View view2, boolean z10, boolean z11) {
        AnimatorSet animatorSet = this.f3439b;
        boolean z12 = animatorSet != null;
        if (z12) {
            animatorSet.cancel();
        }
        AnimatorSet t10 = t(view, view2, z10, z12);
        this.f3439b = t10;
        t10.addListener(new a(this));
        this.f3439b.start();
        if (!z11) {
            this.f3439b.end();
        }
    }

    public abstract AnimatorSet t(View view, View view2, boolean z10, boolean z11);
}
