package androidx.appcompat.widget;

import a6.f;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.raouf.routerchef.R;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: s */
    public boolean f650s;

    /* renamed from: t */
    public boolean f651t;

    /* renamed from: u */
    public int f652u = -1;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] iArr = f.C;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        z.o(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        this.f650s = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f650s);
        }
    }

    private void setStacked(boolean z10) {
        if (this.f651t != z10) {
            if (z10 && !this.f650s) {
                return;
            }
            this.f651t = z10;
            setOrientation(z10 ? 1 : 0);
            setGravity(z10 ? 8388613 : 80);
            View findViewById = findViewById(R.id.spacer);
            if (findViewById != null) {
                findViewById.setVisibility(z10 ? 8 : 4);
            }
            for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                bringChildToFront(getChildAt(childCount));
            }
        }
    }

    public final int a(int i10) {
        int childCount = getChildCount();
        while (i10 < childCount) {
            if (getChildAt(i10).getVisibility() == 0) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int i13 = 0;
        if (this.f650s) {
            if (size > this.f652u && this.f651t) {
                setStacked(false);
            }
            this.f652u = size;
        }
        if (this.f651t || View.MeasureSpec.getMode(i10) != 1073741824) {
            i12 = i10;
            z10 = false;
        } else {
            i12 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z10 = true;
        }
        super.onMeasure(i12, i11);
        if (this.f650s && !this.f651t) {
            if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                setStacked(true);
                z10 = true;
            }
        }
        if (z10) {
            super.onMeasure(i10, i11);
        }
        int a10 = a(0);
        if (a10 >= 0) {
            View childAt = getChildAt(a10);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (this.f651t) {
                int a11 = a(a10 + 1);
                i13 = a11 >= 0 ? getChildAt(a11).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                i13 = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        if (z.d.d(this) != i13) {
            setMinimumHeight(i13);
            if (i11 != 0) {
                return;
            }
            super.onMeasure(i10, i11);
        }
    }

    public void setAllowStacking(boolean z10) {
        if (this.f650s != z10) {
            this.f650s = z10;
            if (!z10 && this.f651t) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
