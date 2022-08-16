package w;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;
import l0.g;
import w.d;

/* loaded from: classes.dex */
public final class c extends a implements d.c {
    public boolean A;
    public boolean B;
    public float C;
    public View[] D;

    @Override // w.d.c
    public final void a() {
    }

    @Override // w.d.c
    public final void b() {
    }

    public float getProgress() {
        return this.C;
    }

    @Override // androidx.constraintlayout.widget.a
    public final void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g.f5720z);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 1) {
                    this.A = obtainStyledAttributes.getBoolean(index, this.A);
                } else if (index == 0) {
                    this.B = obtainStyledAttributes.getBoolean(index, this.B);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f10) {
        this.C = f10;
        int i10 = 0;
        if (this.f1122t <= 0) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            int childCount = viewGroup.getChildCount();
            while (i10 < childCount) {
                boolean z10 = viewGroup.getChildAt(i10) instanceof c;
                i10++;
            }
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
        View[] viewArr = this.y;
        if (viewArr == null || viewArr.length != this.f1122t) {
            this.y = new View[this.f1122t];
        }
        for (int i11 = 0; i11 < this.f1122t; i11++) {
            this.y[i11] = constraintLayout.d(this.f1121s[i11]);
        }
        this.D = this.y;
        while (i10 < this.f1122t) {
            View view = this.D[i10];
            i10++;
        }
    }
}
