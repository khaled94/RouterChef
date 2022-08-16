package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import e5.g;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;
import u5.f;

/* loaded from: classes.dex */
public final class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {
    public static final /* synthetic */ int L = 0;
    public boolean K;

    /* loaded from: classes.dex */
    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a */
        public Rect f3239a;

        /* renamed from: b */
        public boolean f3240b;

        /* renamed from: c */
        public boolean f3241c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f3240b = false;
            this.f3241c = true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h6.a.y);
            this.f3240b = obtainStyledAttributes.getBoolean(0, false);
            this.f3241c = obtainStyledAttributes.getBoolean(1, true);
            obtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final /* bridge */ /* synthetic */ boolean a(View view) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void c(CoordinatorLayout.f fVar) {
            if (fVar.f1249h == 0) {
                fVar.f1249h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                t(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).f1242a instanceof BottomSheetBehavior : false) {
                    u(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            ArrayList arrayList = (ArrayList) coordinatorLayout.d(extendedFloatingActionButton);
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view2 = (View) arrayList.get(i11);
                if (view2 instanceof AppBarLayout) {
                    t(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
                } else {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).f1242a instanceof BottomSheetBehavior : false) {
                        u(view2, extendedFloatingActionButton);
                    }
                }
            }
            coordinatorLayout.r(extendedFloatingActionButton, i10);
            return true;
        }

        public final boolean s(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f3240b || this.f3241c) && ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams()).f1247f == view.getId();
        }

        public final boolean t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!s(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f3239a == null) {
                this.f3239a = new Rect();
            }
            Rect rect = this.f3239a;
            f.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                int i10 = ExtendedFloatingActionButton.L;
                throw null;
            }
            int i11 = ExtendedFloatingActionButton.L;
            throw null;
        }

        public final boolean u(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!s(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                int i10 = ExtendedFloatingActionButton.L;
                throw null;
            }
            int i11 = ExtendedFloatingActionButton.L;
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public class a extends Property<View, Float> {
        public a() {
            super(Float.class, "width");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        public final void set(View view, Float f10) {
            View view2 = view;
            view2.getLayoutParams().width = f10.intValue();
            view2.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public class b extends Property<View, Float> {
        public b() {
            super(Float.class, "height");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        public final void set(View view, Float f10) {
            View view2 = view;
            view2.getLayoutParams().height = f10.intValue();
            view2.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public class c extends Property<View, Float> {
        public c() {
            super(Float.class, "paddingStart");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            return Float.valueOf(z.e.f(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f10) {
            View view2 = view;
            int intValue = f10.intValue();
            int paddingTop = view2.getPaddingTop();
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            z.e.k(view2, intValue, paddingTop, z.e.e(view2), view2.getPaddingBottom());
        }
    }

    /* loaded from: classes.dex */
    public class d extends Property<View, Float> {
        public d() {
            super(Float.class, "paddingEnd");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            return Float.valueOf(z.e.e(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f10) {
            View view2 = view;
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            z.e.k(view2, z.e.f(view2), view2.getPaddingTop(), f10.intValue(), view2.getPaddingBottom());
        }
    }

    static {
        new a();
        new b();
        new c();
        new d();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return null;
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public int getCollapsedSize() {
        return 0;
    }

    public g getExtendMotionSpec() {
        throw null;
    }

    public g getHideMotionSpec() {
        throw null;
    }

    public g getShowMotionSpec() {
        throw null;
    }

    public g getShrinkMotionSpec() {
        throw null;
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void setAnimateShowBeforeLayout(boolean z10) {
        this.K = z10;
    }

    public void setExtendMotionSpec(g gVar) {
        throw null;
    }

    public void setExtendMotionSpecResource(int i10) {
        setExtendMotionSpec(g.a(getContext(), i10));
    }

    public void setExtended(boolean z10) {
        if (!z10) {
            return;
        }
        throw null;
    }

    public void setHideMotionSpec(g gVar) {
        throw null;
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(g.a(getContext(), i10));
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(i10, i11, i12, i13);
    }

    public void setShowMotionSpec(g gVar) {
        throw null;
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(g.a(getContext(), i10));
    }

    public void setShrinkMotionSpec(g gVar) {
        throw null;
    }

    public void setShrinkMotionSpecResource(int i10) {
        setShrinkMotionSpec(g.a(getContext(), i10));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i10) {
        super.setTextColor(i10);
        getTextColors();
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        getTextColors();
    }
}
