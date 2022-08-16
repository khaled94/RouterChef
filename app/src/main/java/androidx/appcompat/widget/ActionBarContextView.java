package androidx.appcompat.widget;

import a6.f;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.c;
import com.raouf.routerchef.R;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;

/* loaded from: classes.dex */
public class ActionBarContextView extends androidx.appcompat.widget.a {
    public CharSequence A;
    public CharSequence B;
    public View C;
    public View D;
    public View E;
    public LinearLayout F;
    public TextView G;
    public TextView H;
    public int I;
    public int J;
    public boolean K;
    public int L;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: s */
        public final /* synthetic */ j.a f631s;

        public a(j.a aVar) {
            this.f631s = aVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f631s.c();
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.f187v, R.attr.actionModeStyle, 0);
        Drawable drawable = (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : f.a.b(context, resourceId);
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        z.d.q(this, drawable);
        this.I = obtainStyledAttributes.getResourceId(5, 0);
        this.J = obtainStyledAttributes.getResourceId(4, 0);
        this.f767w = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.L = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(j.a r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.C
            r1 = 0
            if (r0 != 0) goto L16
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r2 = r5.L
            android.view.View r0 = r0.inflate(r2, r5, r1)
            r5.C = r0
            goto L1e
        L16:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L21
            android.view.View r0 = r5.C
        L1e:
            r5.addView(r0)
        L21:
            android.view.View r0 = r5.C
            r2 = 2131361899(0x7f0a006b, float:1.8343563E38)
            android.view.View r0 = r0.findViewById(r2)
            r5.D = r0
            androidx.appcompat.widget.ActionBarContextView$a r2 = new androidx.appcompat.widget.ActionBarContextView$a
            r2.<init>(r6)
            r0.setOnClickListener(r2)
            android.view.Menu r6 = r6.e()
            androidx.appcompat.view.menu.e r6 = (androidx.appcompat.view.menu.e) r6
            androidx.appcompat.widget.c r0 = r5.f766v
            if (r0 == 0) goto L41
            r0.b()
        L41:
            androidx.appcompat.widget.c r0 = new androidx.appcompat.widget.c
            android.content.Context r2 = r5.getContext()
            r0.<init>(r2)
            r5.f766v = r0
            r2 = 1
            r0.D = r2
            r0.E = r2
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r2 = -2
            r3 = -1
            r0.<init>(r2, r3)
            androidx.appcompat.widget.c r2 = r5.f766v
            android.content.Context r3 = r5.f764t
            r6.c(r2, r3)
            androidx.appcompat.widget.c r6 = r5.f766v
            androidx.appcompat.view.menu.j r2 = r6.f520z
            if (r2 != 0) goto L79
            android.view.LayoutInflater r3 = r6.f517v
            int r4 = r6.f519x
            android.view.View r1 = r3.inflate(r4, r5, r1)
            androidx.appcompat.view.menu.j r1 = (androidx.appcompat.view.menu.j) r1
            r6.f520z = r1
            androidx.appcompat.view.menu.e r3 = r6.f516u
            r1.b(r3)
            r6.f()
        L79:
            androidx.appcompat.view.menu.j r1 = r6.f520z
            if (r2 == r1) goto L83
            r2 = r1
            androidx.appcompat.widget.ActionMenuView r2 = (androidx.appcompat.widget.ActionMenuView) r2
            r2.setPresenter(r6)
        L83:
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            r5.f765u = r1
            r6 = 0
            java.util.WeakHashMap<android.view.View, m0.f0> r2 = m0.z.f5921a
            m0.z.d.q(r1, r6)
            androidx.appcompat.widget.ActionMenuView r6 = r5.f765u
            r5.addView(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContextView.f(j.a):void");
    }

    public final void g() {
        if (this.F == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.F = linearLayout;
            this.G = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.H = (TextView) this.F.findViewById(R.id.action_bar_subtitle);
            if (this.I != 0) {
                this.G.setTextAppearance(getContext(), this.I);
            }
            if (this.J != 0) {
                this.H.setTextAppearance(getContext(), this.J);
            }
        }
        this.G.setText(this.A);
        this.H.setText(this.B);
        boolean z10 = !TextUtils.isEmpty(this.A);
        boolean z11 = !TextUtils.isEmpty(this.B);
        int i10 = 0;
        this.H.setVisibility(z11 ? 0 : 8);
        LinearLayout linearLayout2 = this.F;
        if (!z10 && !z11) {
            i10 = 8;
        }
        linearLayout2.setVisibility(i10);
        if (this.F.getParent() == null) {
            addView(this.F);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.B;
    }

    public CharSequence getTitle() {
        return this.A;
    }

    public final void h() {
        removeAllViews();
        this.E = null;
        this.f765u = null;
        this.f766v = null;
        View view = this.D;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f766v;
        if (cVar != null) {
            cVar.g();
            c.a aVar = this.f766v.L;
            if (aVar == null || !aVar.b()) {
                return;
            }
            aVar.f611j.dismiss();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean b10 = n1.b(this);
        int paddingRight = b10 ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.C;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.C.getLayoutParams();
            int i14 = b10 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = b10 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i16 = b10 ? paddingRight - i14 : paddingRight + i14;
            int d5 = i16 + d(this.C, i16, paddingTop, paddingTop2, b10);
            paddingRight = b10 ? d5 - i15 : d5 + i15;
        }
        int i17 = paddingRight;
        LinearLayout linearLayout = this.F;
        if (linearLayout != null && this.E == null && linearLayout.getVisibility() != 8) {
            i17 += d(this.F, i17, paddingTop, paddingTop2, b10);
        }
        int i18 = i17;
        View view2 = this.E;
        if (view2 != null) {
            d(view2, i18, paddingTop, paddingTop2, b10);
        }
        int paddingLeft = b10 ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f765u;
        if (actionMenuView != null) {
            d(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b10);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = 1073741824;
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i11) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        } else {
            int size = View.MeasureSpec.getSize(i10);
            int i13 = this.f767w;
            if (i13 <= 0) {
                i13 = View.MeasureSpec.getSize(i11);
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i14 = i13 - paddingBottom;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE);
            View view = this.C;
            if (view != null) {
                int c10 = c(view, paddingLeft, makeMeasureSpec);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.C.getLayoutParams();
                paddingLeft = c10 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f765u;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = c(this.f765u, paddingLeft, makeMeasureSpec);
            }
            LinearLayout linearLayout = this.F;
            if (linearLayout != null && this.E == null) {
                if (this.K) {
                    this.F.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.F.getMeasuredWidth();
                    boolean z10 = measuredWidth <= paddingLeft;
                    if (z10) {
                        paddingLeft -= measuredWidth;
                    }
                    this.F.setVisibility(z10 ? 0 : 8);
                } else {
                    paddingLeft = c(linearLayout, paddingLeft, makeMeasureSpec);
                }
            }
            View view2 = this.E;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i15 = layoutParams.width;
                int i16 = i15 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i15 >= 0) {
                    paddingLeft = Math.min(i15, paddingLeft);
                }
                int i17 = layoutParams.height;
                if (i17 == -2) {
                    i12 = Integer.MIN_VALUE;
                }
                if (i17 >= 0) {
                    i14 = Math.min(i17, i14);
                }
                this.E.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i16), View.MeasureSpec.makeMeasureSpec(i14, i12));
            }
            if (this.f767w <= 0) {
                int childCount = getChildCount();
                i13 = 0;
                for (int i18 = 0; i18 < childCount; i18++) {
                    int measuredHeight = getChildAt(i18).getMeasuredHeight() + paddingBottom;
                    if (measuredHeight > i13) {
                        i13 = measuredHeight;
                    }
                }
            }
            setMeasuredDimension(size, i13);
        }
    }

    @Override // androidx.appcompat.widget.a
    public void setContentHeight(int i10) {
        this.f767w = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.E;
        if (view2 != null) {
            removeView(view2);
        }
        this.E = view;
        if (view != null && (linearLayout = this.F) != null) {
            removeView(linearLayout);
            this.F = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.B = charSequence;
        g();
    }

    public void setTitle(CharSequence charSequence) {
        this.A = charSequence;
        g();
        z.q(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.K) {
            requestLayout();
        }
        this.K = z10;
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
