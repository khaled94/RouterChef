package x;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;
import l0.g;

/* loaded from: classes.dex */
public abstract class f extends a {
    public boolean A;
    public boolean B;

    @Override // androidx.constraintlayout.widget.a
    public final void g(ConstraintLayout constraintLayout) {
        f(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.a
    public final void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g.f5715t);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 6) {
                    this.A = true;
                } else if (index == 22) {
                    this.B = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.a, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.A || this.B) {
            ViewParent parent = getParent();
            if (!(parent instanceof ConstraintLayout)) {
                return;
            }
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i10 = 0; i10 < this.f1122t; i10++) {
                View d5 = constraintLayout.d(this.f1121s[i10]);
                if (d5 != null) {
                    if (this.A) {
                        d5.setVisibility(visibility);
                    }
                    if (this.B && elevation > 0.0f) {
                        d5.setTranslationZ(d5.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        f((ConstraintLayout) parent);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        f((ConstraintLayout) parent);
    }
}
