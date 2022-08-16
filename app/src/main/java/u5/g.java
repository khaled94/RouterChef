package u5;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.raouf.routerchef.R;
import h6.a;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;

/* loaded from: classes.dex */
public class g extends ViewGroup {

    /* renamed from: s */
    public int f19110s;

    /* renamed from: t */
    public int f19111t;

    /* renamed from: u */
    public boolean f19112u;

    /* renamed from: v */
    public int f19113v;

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public g(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f19112u = false;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, a.A, 0, 0);
        this.f19110s = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f19111t = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    public boolean a() {
        return this.f19112u;
    }

    public int getItemSpacing() {
        return this.f19111t;
    }

    public int getLineSpacing() {
        return this.f19110s;
    }

    public int getRowCount() {
        return this.f19113v;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        if (getChildCount() == 0) {
            this.f19113v = 0;
            return;
        }
        this.f19113v = 1;
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        boolean z11 = z.e.d(this) == 1;
        int paddingRight = z11 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z11 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i16 = (i12 - i10) - paddingLeft;
        int i17 = paddingRight;
        int i18 = paddingTop;
        for (int i19 = 0; i19 < getChildCount(); i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i14 = m0.g.c(marginLayoutParams);
                    i15 = m0.g.b(marginLayoutParams);
                } else {
                    i15 = 0;
                    i14 = 0;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i17 + i14;
                if (!this.f19112u && measuredWidth > i16) {
                    i18 = this.f19110s + paddingTop;
                    this.f19113v++;
                    i17 = paddingRight;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.f19113v - 1));
                int i20 = i17 + i14;
                int measuredWidth2 = childAt.getMeasuredWidth() + i20;
                int measuredHeight = childAt.getMeasuredHeight() + i18;
                if (z11) {
                    i20 = i16 - measuredWidth2;
                    measuredWidth2 = (i16 - i17) - i14;
                }
                childAt.layout(i20, i18, measuredWidth2, measuredHeight);
                i17 += childAt.getMeasuredWidth() + i14 + i15 + this.f19111t;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        int i14 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i14 - getPaddingRight();
        int i15 = paddingTop;
        int i16 = 0;
        for (int i17 = 0; i17 < getChildCount(); i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i10, i11);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i12 = marginLayoutParams.leftMargin + 0;
                    i13 = marginLayoutParams.rightMargin + 0;
                } else {
                    i13 = 0;
                    i12 = 0;
                }
                if (childAt.getMeasuredWidth() + paddingLeft + i12 > paddingRight && !a()) {
                    paddingLeft = getPaddingLeft();
                    i15 = paddingTop + this.f19110s;
                }
                int measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i12;
                int measuredHeight = childAt.getMeasuredHeight() + i15;
                if (measuredWidth > i16) {
                    i16 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i12 + i13 + this.f19111t + paddingLeft;
                if (i17 == getChildCount() - 1) {
                    i16 += i13;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        int paddingRight2 = getPaddingRight() + i16;
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(paddingRight2, size);
        } else if (mode != 1073741824) {
            size = paddingRight2;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(paddingBottom, size2);
        } else if (mode2 != 1073741824) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    public void setItemSpacing(int i10) {
        this.f19111t = i10;
    }

    public void setLineSpacing(int i10) {
        this.f19110s = i10;
    }

    public void setSingleLine(boolean z10) {
        this.f19112u = z10;
    }
}
