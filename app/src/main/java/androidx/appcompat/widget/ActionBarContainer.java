package androidx.appcompat.widget;

import a6.f;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.raouf.routerchef.R;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {
    public boolean A;
    public int B;

    /* renamed from: s */
    public boolean f624s;

    /* renamed from: t */
    public y0 f625t;

    /* renamed from: u */
    public View f626u;

    /* renamed from: v */
    public View f627v;

    /* renamed from: w */
    public Drawable f628w;

    /* renamed from: x */
    public Drawable f629x;
    public Drawable y;

    /* renamed from: z */
    public boolean f630z;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b bVar = new b(this);
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        z.d.q(this, bVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.f184s);
        boolean z10 = false;
        this.f628w = obtainStyledAttributes.getDrawable(0);
        this.f629x = obtainStyledAttributes.getDrawable(2);
        this.B = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f630z = true;
            this.y = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f630z ? !(this.f628w != null || this.f629x != null) : this.y == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
    }

    public final int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f628w;
        if (drawable != null && drawable.isStateful()) {
            this.f628w.setState(getDrawableState());
        }
        Drawable drawable2 = this.f629x;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f629x.setState(getDrawableState());
        }
        Drawable drawable3 = this.y;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.y.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f625t;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f628w;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f629x;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.y;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f626u = findViewById(R.id.action_bar);
        this.f627v = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f624s || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Drawable drawable;
        int i14;
        int i15;
        Drawable drawable2;
        View view;
        int i16;
        super.onLayout(z10, i10, i11, i12, i13);
        y0 y0Var = this.f625t;
        boolean z11 = true;
        boolean z12 = false;
        boolean z13 = (y0Var == null || y0Var.getVisibility() == 8) ? false : true;
        if (y0Var != null && y0Var.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            int i17 = ((FrameLayout.LayoutParams) y0Var.getLayoutParams()).bottomMargin;
            y0Var.layout(i10, (measuredHeight - y0Var.getMeasuredHeight()) - i17, i12, measuredHeight - i17);
        }
        if (this.f630z) {
            Drawable drawable3 = this.y;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            z11 = z12;
        } else {
            if (this.f628w != null) {
                if (this.f626u.getVisibility() == 0) {
                    drawable2 = this.f628w;
                    i15 = this.f626u.getLeft();
                    i14 = this.f626u.getTop();
                    i16 = this.f626u.getRight();
                    view = this.f626u;
                } else {
                    View view2 = this.f627v;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f628w.setBounds(0, 0, 0, 0);
                        z12 = true;
                    } else {
                        drawable2 = this.f628w;
                        i15 = this.f627v.getLeft();
                        i14 = this.f627v.getTop();
                        i16 = this.f627v.getRight();
                        view = this.f627v;
                    }
                }
                drawable2.setBounds(i15, i14, i16, view.getBottom());
                z12 = true;
            }
            this.A = z13;
            if (z13 && (drawable = this.f629x) != null) {
                drawable.setBounds(y0Var.getLeft(), y0Var.getTop(), y0Var.getRight(), y0Var.getBottom());
            }
            z11 = z12;
        }
        if (z11) {
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            android.view.View r0 = r3.f626u
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L1c
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            if (r0 != r1) goto L1c
            int r0 = r3.B
            if (r0 < 0) goto L1c
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            int r5 = java.lang.Math.min(r0, r5)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r1)
        L1c:
            super.onMeasure(r4, r5)
            android.view.View r4 = r3.f626u
            if (r4 != 0) goto L24
            return
        L24:
            int r4 = android.view.View.MeasureSpec.getMode(r5)
            androidx.appcompat.widget.y0 r0 = r3.f625t
            if (r0 == 0) goto L6f
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L6f
            r0 = 1073741824(0x40000000, float:2.0)
            if (r4 == r0) goto L6f
            android.view.View r0 = r3.f626u
            boolean r0 = r3.b(r0)
            if (r0 != 0) goto L43
            android.view.View r0 = r3.f626u
            goto L4d
        L43:
            android.view.View r0 = r3.f627v
            boolean r0 = r3.b(r0)
            if (r0 != 0) goto L52
            android.view.View r0 = r3.f627v
        L4d:
            int r0 = r3.a(r0)
            goto L53
        L52:
            r0 = 0
        L53:
            if (r4 != r1) goto L5a
            int r4 = android.view.View.MeasureSpec.getSize(r5)
            goto L5d
        L5a:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L5d:
            int r5 = r3.getMeasuredWidth()
            androidx.appcompat.widget.y0 r1 = r3.f625t
            int r1 = r3.a(r1)
            int r1 = r1 + r0
            int r4 = java.lang.Math.min(r1, r4)
            r3.setMeasuredDimension(r5, r4)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f628w;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f628w);
        }
        this.f628w = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f626u;
            if (view != null) {
                this.f628w.setBounds(view.getLeft(), this.f626u.getTop(), this.f626u.getRight(), this.f626u.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.f630z ? this.f628w != null || this.f629x != null : this.y != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.y;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.y);
        }
        this.y = drawable;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f630z && (drawable2 = this.y) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f630z ? !(this.f628w != null || this.f629x != null) : this.y == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f629x;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f629x);
        }
        this.f629x = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.A && (drawable2 = this.f629x) != null) {
                drawable2.setBounds(this.f625t.getLeft(), this.f625t.getTop(), this.f625t.getRight(), this.f625t.getBottom());
            }
        }
        boolean z10 = true;
        if (!this.f630z ? this.f628w != null || this.f629x != null : this.y != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(y0 y0Var) {
        y0 y0Var2 = this.f625t;
        if (y0Var2 != null) {
            removeView(y0Var2);
        }
        this.f625t = y0Var;
        if (y0Var != null) {
            addView(y0Var);
            ViewGroup.LayoutParams layoutParams = y0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            y0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z10) {
        this.f624s = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f628w;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f629x;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.y;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f628w && !this.f630z) || (drawable == this.f629x && this.A) || ((drawable == this.y && this.f630z) || super.verifyDrawable(drawable));
    }
}
