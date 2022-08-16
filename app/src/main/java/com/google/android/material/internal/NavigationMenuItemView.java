package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.j1;
import androidx.appcompat.widget.q0;
import com.raouf.routerchef.R;
import d0.g;
import f0.a;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;
import n0.f;
import q0.k;
import u5.h;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends h implements j.a {

    /* renamed from: a0 */
    public static final int[] f3306a0 = {16842912};
    public int N;
    public boolean O;
    public boolean P;
    public final CheckedTextView Q;
    public FrameLayout R;
    public g S;
    public ColorStateList T;
    public boolean U;
    public Drawable V;
    public final a W;

    /* loaded from: classes.dex */
    public class a extends m0.a {
        public a() {
            NavigationMenuItemView.this = r1;
        }

        @Override // m0.a
        public final void d(View view, f fVar) {
            this.f5847a.onInitializeAccessibilityNodeInfo(view, fVar.f16401a);
            fVar.m(NavigationMenuItemView.this.P);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, 0);
        a aVar = new a();
        this.W = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.Q = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        z.p(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.R == null) {
                this.R = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.R.removeAllViews();
            this.R.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public final void e(g gVar) {
        q0.a aVar;
        int i10;
        StateListDrawable stateListDrawable;
        this.S = gVar;
        int i11 = gVar.f577a;
        if (i11 > 0) {
            setId(i11);
        }
        setVisibility(gVar.isVisible() ? 0 : 8);
        boolean z10 = true;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f3306a0, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            z.d.q(this, stateListDrawable);
        }
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setTitle(gVar.f581e);
        setIcon(gVar.getIcon());
        setActionView(gVar.getActionView());
        setContentDescription(gVar.f592q);
        j1.a(this, gVar.f593r);
        g gVar2 = this.S;
        if (gVar2.f581e != null || gVar2.getIcon() != null || this.S.getActionView() == null) {
            z10 = false;
        }
        if (z10) {
            this.Q.setVisibility(8);
            FrameLayout frameLayout = this.R;
            if (frameLayout == null) {
                return;
            }
            aVar = (q0.a) frameLayout.getLayoutParams();
            i10 = -1;
        } else {
            this.Q.setVisibility(0);
            FrameLayout frameLayout2 = this.R;
            if (frameLayout2 == null) {
                return;
            }
            aVar = (q0.a) frameLayout2.getLayoutParams();
            i10 = -2;
        }
        ((LinearLayout.LayoutParams) aVar).width = i10;
        this.R.setLayoutParams(aVar);
    }

    @Override // androidx.appcompat.view.menu.j.a
    public g getItemData() {
        return this.S;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        g gVar = this.S;
        if (gVar != null && gVar.isCheckable() && this.S.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f3306a0);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.P != z10) {
            this.P = z10;
            this.W.h(this.Q, 2048);
        }
    }

    public void setChecked(boolean z10) {
        refreshDrawableState();
        this.Q.setChecked(z10);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.U) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                a.b.h(drawable, this.T);
            }
            int i10 = this.N;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.O) {
            if (this.V == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal<TypedValue> threadLocal = d0.g.f3704a;
                Drawable a10 = g.a.a(resources, R.drawable.navigation_empty_icon, theme);
                this.V = a10;
                if (a10 != null) {
                    int i11 = this.N;
                    a10.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.V;
        }
        k.b.e(this.Q, drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.Q.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.N = i10;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.T = colorStateList;
        this.U = colorStateList != null;
        androidx.appcompat.view.menu.g gVar = this.S;
        if (gVar != null) {
            setIcon(gVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.Q.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.O = z10;
    }

    public void setTextAppearance(int i10) {
        this.Q.setTextAppearance(i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.Q.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.Q.setText(charSequence);
    }
}
