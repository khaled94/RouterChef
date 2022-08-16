package androidx.appcompat.widget;

import a6.f;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import m0.z;

/* loaded from: classes.dex */
public class q0 extends ViewGroup {
    public int[] A;
    public int[] B;
    public Drawable C;
    public int D;
    public int E;
    public int F;
    public int G;

    /* renamed from: s */
    public boolean f988s;

    /* renamed from: t */
    public int f989t;

    /* renamed from: u */
    public int f990u;

    /* renamed from: v */
    public int f991v;

    /* renamed from: w */
    public int f992w;

    /* renamed from: x */
    public int f993x;
    public float y;

    /* renamed from: z */
    public boolean f994z;

    /* loaded from: classes.dex */
    public static class a extends LinearLayout.LayoutParams {
        public a(int i10, int i11) {
            super(i10, i11);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public q0(Context context) {
        this(context, null);
    }

    public q0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public q0(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        int resourceId;
        this.f988s = true;
        this.f989t = -1;
        this.f990u = 0;
        this.f992w = 8388659;
        int[] iArr = f.F;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        z.o(this, context, iArr, attributeSet, obtainStyledAttributes, i10);
        int i11 = obtainStyledAttributes.getInt(1, -1);
        if (i11 >= 0) {
            setOrientation(i11);
        }
        int i12 = obtainStyledAttributes.getInt(0, -1);
        if (i12 >= 0) {
            setGravity(i12);
        }
        boolean z10 = obtainStyledAttributes.getBoolean(2, true);
        if (!z10) {
            setBaselineAligned(z10);
        }
        this.y = obtainStyledAttributes.getFloat(4, -1.0f);
        this.f989t = obtainStyledAttributes.getInt(3, -1);
        this.f994z = obtainStyledAttributes.getBoolean(7, false);
        setDividerDrawable((!obtainStyledAttributes.hasValue(5) || (resourceId = obtainStyledAttributes.getResourceId(5, 0)) == 0) ? obtainStyledAttributes.getDrawable(5) : f.a.b(context, resourceId));
        this.F = obtainStyledAttributes.getInt(8, 0);
        this.G = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public final void f(Canvas canvas, int i10) {
        this.C.setBounds(getPaddingLeft() + this.G, i10, (getWidth() - getPaddingRight()) - this.G, this.E + i10);
        this.C.draw(canvas);
    }

    public final void g(Canvas canvas, int i10) {
        this.C.setBounds(i10, getPaddingTop() + this.G, this.D + i10, (getHeight() - getPaddingBottom()) - this.G);
        this.C.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i10;
        if (this.f989t < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f989t;
        if (childCount <= i11) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i11);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f989t != 0) {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            return -1;
        }
        int i12 = this.f990u;
        if (this.f991v == 1 && (i10 = this.f992w & 112) != 48) {
            if (i10 == 16) {
                i12 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f993x) / 2;
            } else if (i10 == 80) {
                i12 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f993x;
            }
        }
        return i12 + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f989t;
    }

    public Drawable getDividerDrawable() {
        return this.C;
    }

    public int getDividerPadding() {
        return this.G;
    }

    public int getDividerWidth() {
        return this.D;
    }

    public int getGravity() {
        return this.f992w;
    }

    public int getOrientation() {
        return this.f991v;
    }

    public int getShowDividers() {
        return this.F;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.y;
    }

    /* renamed from: h */
    public a generateDefaultLayoutParams() {
        int i10 = this.f991v;
        if (i10 == 0) {
            return new a(-2, -2);
        }
        if (i10 != 1) {
            return null;
        }
        return new a(-1, -2);
    }

    /* renamed from: i */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* renamed from: j */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public final boolean k(int i10) {
        if (i10 == 0) {
            return (this.F & 1) != 0;
        } else if (i10 == getChildCount()) {
            return (this.F & 4) != 0;
        } else if ((this.F & 2) == 0) {
            return false;
        } else {
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                if (getChildAt(i11).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        if (this.C == null) {
            return;
        }
        int i13 = 0;
        if (this.f991v == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i13 < virtualChildCount) {
                View childAt = getChildAt(i13);
                if (childAt != null && childAt.getVisibility() != 8 && k(i13)) {
                    f(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin) - this.E);
                }
                i13++;
            }
            if (!k(virtualChildCount)) {
                return;
            }
            View childAt2 = getChildAt(virtualChildCount - 1);
            f(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.E : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((a) childAt2.getLayoutParams())).bottomMargin);
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean b10 = n1.b(this);
        while (i13 < virtualChildCount2) {
            View childAt3 = getChildAt(i13);
            if (childAt3 != null && childAt3.getVisibility() != 8 && k(i13)) {
                a aVar = (a) childAt3.getLayoutParams();
                g(canvas, b10 ? childAt3.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.D);
            }
            i13++;
        }
        if (!k(virtualChildCount2)) {
            return;
        }
        View childAt4 = getChildAt(virtualChildCount2 - 1);
        if (childAt4 == null) {
            if (b10) {
                i10 = getPaddingLeft();
                g(canvas, i10);
            }
            i12 = getWidth();
            i11 = getPaddingRight();
            i10 = (i12 - i11) - this.D;
            g(canvas, i10);
        }
        a aVar2 = (a) childAt4.getLayoutParams();
        if (!b10) {
            i10 = childAt4.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
            g(canvas, i10);
        }
        i12 = childAt4.getLeft();
        i11 = ((LinearLayout.LayoutParams) aVar2).leftMargin;
        i10 = (i12 - i11) - this.D;
        g(canvas, i10);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0197  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.q0.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0679 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x07d2  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x086a  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0892  */
    /* JADX WARN: Removed duplicated region for block: B:423:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r35, int r36) {
        /*
            Method dump skipped, instructions count: 2255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.q0.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z10) {
        this.f988s = z10;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.f989t = i10;
            return;
        }
        StringBuilder c10 = androidx.activity.result.a.c("base aligned child index out of range (0, ");
        c10.append(getChildCount());
        c10.append(")");
        throw new IllegalArgumentException(c10.toString());
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.C) {
            return;
        }
        this.C = drawable;
        boolean z10 = false;
        if (drawable != null) {
            this.D = drawable.getIntrinsicWidth();
            this.E = drawable.getIntrinsicHeight();
        } else {
            this.D = 0;
            this.E = 0;
        }
        if (drawable == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.G = i10;
    }

    public void setGravity(int i10) {
        if (this.f992w != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f992w = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.f992w;
        if ((8388615 & i12) != i11) {
            this.f992w = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f994z = z10;
    }

    public void setOrientation(int i10) {
        if (this.f991v != i10) {
            this.f991v = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.F) {
            requestLayout();
        }
        this.F = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.f992w;
        if ((i12 & 112) != i11) {
            this.f992w = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.y = Math.max(0.0f, f10);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
