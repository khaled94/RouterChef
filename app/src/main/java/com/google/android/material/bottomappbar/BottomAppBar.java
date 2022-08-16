package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.raouf.routerchef.R;
import f0.a;
import h5.b;
import h5.c;
import h5.d;
import h5.f;
import h5.g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;
import u5.s;

/* loaded from: classes.dex */
public final class BottomAppBar extends Toolbar implements CoordinatorLayout.b {

    /* renamed from: t0 */
    public static final /* synthetic */ int f3028t0 = 0;

    /* renamed from: k0 */
    public Integer f3029k0;

    /* renamed from: l0 */
    public Animator f3030l0;

    /* renamed from: m0 */
    public Animator f3031m0;

    /* renamed from: n0 */
    public int f3032n0;

    /* renamed from: o0 */
    public int f3033o0;

    /* renamed from: p0 */
    public boolean f3034p0;

    /* renamed from: q0 */
    public int f3035q0;

    /* renamed from: r0 */
    public boolean f3036r0;

    /* renamed from: s0 */
    public Behavior f3037s0;

    /* loaded from: classes.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: f */
        public WeakReference<BottomAppBar> f3039f;

        /* renamed from: g */
        public int f3040g;

        /* renamed from: h */
        public final a f3041h = new a();

        /* renamed from: e */
        public final Rect f3038e = new Rect();

        /* loaded from: classes.dex */
        public class a implements View.OnLayoutChangeListener {
            public a() {
                Behavior.this = r1;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                if (Behavior.this.f3039f.get() != null && (view instanceof FloatingActionButton)) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    Behavior.this.f3038e.set(0, 0, floatingActionButton.getMeasuredWidth(), floatingActionButton.getMeasuredHeight());
                    throw null;
                }
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
            BottomAppBar bottomAppBar = (BottomAppBar) view;
            this.f3039f = new WeakReference<>(bottomAppBar);
            int i11 = BottomAppBar.f3028t0;
            View z10 = bottomAppBar.z();
            if (z10 != null) {
                WeakHashMap<View, f0> weakHashMap = z.f5921a;
                if (!z.g.c(z10)) {
                    CoordinatorLayout.f fVar = (CoordinatorLayout.f) z10.getLayoutParams();
                    fVar.f1245d = 49;
                    this.f3040g = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                    if (z10 instanceof FloatingActionButton) {
                        FloatingActionButton floatingActionButton = (FloatingActionButton) z10;
                        if (floatingActionButton.getShowMotionSpec() == null) {
                            floatingActionButton.setShowMotionSpecResource(R.animator.mtrl_fab_show_motion_spec);
                        }
                        if (floatingActionButton.getHideMotionSpec() == null) {
                            floatingActionButton.setHideMotionSpecResource(R.animator.mtrl_fab_hide_motion_spec);
                        }
                        floatingActionButton.addOnLayoutChangeListener(this.f3041h);
                        floatingActionButton.d();
                        floatingActionButton.e(new f(bottomAppBar));
                        floatingActionButton.f();
                    }
                    bottomAppBar.E();
                    throw null;
                }
            }
            coordinatorLayout.r(bottomAppBar, i10);
            this.f3010a = bottomAppBar.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) bottomAppBar.getLayoutParams()).bottomMargin;
            return false;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11) {
            if (((BottomAppBar) view).getHideOnScroll()) {
                if (i10 == 2) {
                    return true;
                }
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class a extends s0.a {
        public static final Parcelable.Creator<a> CREATOR = new C0042a();

        /* renamed from: u */
        public int f3043u;

        /* renamed from: v */
        public boolean f3044v;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a$a */
        /* loaded from: classes.dex */
        public class C0042a implements Parcelable.ClassLoaderCreator<a> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new a(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new a[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3043u = parcel.readInt();
            this.f3044v = parcel.readInt() != 0;
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // s0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f17592s, i10);
            parcel.writeInt(this.f3043u);
            parcel.writeInt(this.f3044v ? 1 : 0);
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    private int getBottomInset() {
        return 0;
    }

    private float getFabTranslationX() {
        return C(this.f3032n0);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().Z;
    }

    private int getLeftInset() {
        return 0;
    }

    private int getRightInset() {
        return 0;
    }

    private g getTopEdgeTreatment() {
        throw null;
    }

    public final int A(ActionMenuView actionMenuView, int i10, boolean z10) {
        if (i10 != 1 || !z10) {
            return 0;
        }
        boolean a10 = s.a(this);
        int measuredWidth = a10 ? getMeasuredWidth() : 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if ((childAt.getLayoutParams() instanceof Toolbar.e) && (((Toolbar.e) childAt.getLayoutParams()).f4176a & 8388615) == 8388611) {
                measuredWidth = a10 ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        return measuredWidth - ((a10 ? actionMenuView.getRight() : actionMenuView.getLeft()) + 0);
    }

    public final float C(int i10) {
        boolean a10 = s.a(this);
        int i11 = 1;
        if (i10 == 1) {
            int measuredWidth = (getMeasuredWidth() / 2) + 0;
            if (a10) {
                i11 = -1;
            }
            return measuredWidth * i11;
        }
        return 0.0f;
    }

    public final boolean D() {
        FloatingActionButton y = y();
        return y != null && y.k();
    }

    public final void E() {
        getTopEdgeTreatment().f5097a0 = getFabTranslationX();
        z();
        if (this.f3036r0) {
            D();
        }
        throw null;
    }

    public ColorStateList getBackgroundTint() {
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Behavior getBehavior() {
        if (this.f3037s0 == null) {
            this.f3037s0 = new Behavior();
        }
        return this.f3037s0;
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().Z;
    }

    public int getFabAlignmentMode() {
        return this.f3032n0;
    }

    public int getFabAnimationMode() {
        return this.f3033o0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().Y;
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().X;
    }

    public boolean getHideOnScroll() {
        return this.f3034p0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        n.a.b(this, null);
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            Animator animator = this.f3031m0;
            if (animator != null) {
                animator.cancel();
            }
            Animator animator2 = this.f3030l0;
            if (animator2 != null) {
                animator2.cancel();
            }
            E();
            throw null;
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.f3031m0 != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (!D()) {
            i14 = A(actionMenuView, 0, false);
        } else {
            i14 = A(actionMenuView, this.f3032n0, this.f3036r0);
        }
        actionMenuView.setTranslationX(i14);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f17592s);
        this.f3032n0 = aVar.f3043u;
        this.f3036r0 = aVar.f3044v;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f3043u = this.f3032n0;
        aVar.f3044v = this.f3036r0;
        return aVar;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        a.b.h(null, colorStateList);
    }

    public void setCradleVerticalOffset(float f10) {
        if (f10 != getCradleVerticalOffset()) {
            g topEdgeTreatment = getTopEdgeTreatment();
            Objects.requireNonNull(topEdgeTreatment);
            if (f10 >= 0.0f) {
                topEdgeTreatment.Z = f10;
                throw null;
            }
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        throw null;
    }

    public void setFabAlignmentMode(int i10) {
        int i11;
        this.f3035q0 = 0;
        boolean z10 = this.f3036r0;
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        if (!z.g.c(this)) {
            int i12 = this.f3035q0;
            if (i12 != 0) {
                this.f3035q0 = 0;
                getMenu().clear();
                o(i12);
            }
        } else {
            Animator animator = this.f3031m0;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!D()) {
                z10 = false;
                i11 = 0;
            } else {
                i11 = i10;
            }
            ActionMenuView actionMenuView = getActionMenuView();
            if (actionMenuView != null) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
                if (Math.abs(actionMenuView.getTranslationX() - A(actionMenuView, i11, z10)) > 1.0f) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
                    ofFloat2.addListener(new d(this, actionMenuView, i11, z10));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.setDuration(150L);
                    animatorSet.playSequentially(ofFloat2, ofFloat);
                    arrayList.add(animatorSet);
                } else if (actionMenuView.getAlpha() < 1.0f) {
                    arrayList.add(ofFloat);
                }
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(arrayList);
            this.f3031m0 = animatorSet2;
            animatorSet2.addListener(new c(this));
            this.f3031m0.start();
        }
        if (this.f3032n0 != i10 && z.g.c(this)) {
            Animator animator2 = this.f3030l0;
            if (animator2 != null) {
                animator2.cancel();
            }
            ArrayList arrayList2 = new ArrayList();
            if (this.f3033o0 == 1) {
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(y(), "translationX", C(i10));
                ofFloat3.setDuration(300L);
                arrayList2.add(ofFloat3);
            } else {
                FloatingActionButton y = y();
                if (y != null && !y.j()) {
                    y.i(new b(this, i10), true);
                }
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(arrayList2);
            this.f3030l0 = animatorSet3;
            animatorSet3.addListener(new h5.a(this));
            this.f3030l0.start();
        }
        this.f3032n0 = i10;
    }

    public void setFabAnimationMode(int i10) {
        this.f3033o0 = i10;
    }

    public void setFabCornerSize(float f10) {
        if (f10 == getTopEdgeTreatment().f5098b0) {
            return;
        }
        getTopEdgeTreatment().f5098b0 = f10;
        throw null;
    }

    public void setFabCradleMargin(float f10) {
        if (f10 == getFabCradleMargin()) {
            return;
        }
        getTopEdgeTreatment().Y = f10;
        throw null;
    }

    public void setFabCradleRoundedCornerRadius(float f10) {
        if (f10 == getFabCradleRoundedCornerRadius()) {
            return;
        }
        getTopEdgeTreatment().X = f10;
        throw null;
    }

    public void setHideOnScroll(boolean z10) {
        this.f3034p0 = z10;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f3029k0 != null) {
            drawable = drawable.mutate();
            a.b.g(drawable, this.f3029k0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i10) {
        this.f3029k0 = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public final FloatingActionButton y() {
        View z10 = z();
        if (z10 instanceof FloatingActionButton) {
            return (FloatingActionButton) z10;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View z() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.e(r4)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L2e
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L1a
        L2e:
            return r2
        L2f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.z():android.view.View");
    }
}
