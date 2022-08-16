package com.google.android.material.floatingactionbutton;

import a6.m;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.l;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.d;
import com.raouf.routerchef.R;
import e5.g;
import e5.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;
import u5.f;
import u5.t;

/* loaded from: classes.dex */
public final class FloatingActionButton extends t implements s5.a, m, CoordinatorLayout.b {
    public int A;
    public int B;
    public boolean C;
    public t5.c D;

    /* renamed from: t */
    public ColorStateList f3242t;

    /* renamed from: u */
    public PorterDuff.Mode f3243u;

    /* renamed from: v */
    public ColorStateList f3244v;

    /* renamed from: w */
    public PorterDuff.Mode f3245w;

    /* renamed from: x */
    public ColorStateList f3246x;
    public int y;

    /* renamed from: z */
    public int f3247z;

    /* loaded from: classes.dex */
    public static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a */
        public Rect f3248a;

        /* renamed from: b */
        public boolean f3249b;

        public BaseBehavior() {
            this.f3249b = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h6.a.f5105z);
            this.f3249b = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean a(View view) {
            ((FloatingActionButton) view).getLeft();
            throw null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void c(CoordinatorLayout.f fVar) {
            if (fVar.f1249h == 0) {
                fVar.f1249h = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                t(coordinatorLayout, (AppBarLayout) view2, floatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).f1242a instanceof BottomSheetBehavior : false) {
                    u(view2, floatingActionButton);
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList arrayList = (ArrayList) coordinatorLayout.d(floatingActionButton);
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view2 = (View) arrayList.get(i11);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).f1242a instanceof BottomSheetBehavior : false) && u(view2, floatingActionButton)) {
                        break;
                    }
                } else if (t(coordinatorLayout, (AppBarLayout) view2, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.r(floatingActionButton, i10);
            return true;
        }

        public final boolean s(View view, FloatingActionButton floatingActionButton) {
            return this.f3249b && ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).f1247f == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        public final boolean t(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!s(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f3248a == null) {
                this.f3248a = new Rect();
            }
            Rect rect = this.f3248a;
            f.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.i(null, false);
                return true;
            }
            floatingActionButton.m(null, false);
            return true;
        }

        public final boolean u(View view, FloatingActionButton floatingActionButton) {
            if (!s(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.i(null, false);
                return true;
            }
            floatingActionButton.m(null, false);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b() {
        }
    }

    /* loaded from: classes.dex */
    public class b implements z5.b {
        public b() {
            FloatingActionButton.this = r1;
        }
    }

    /* loaded from: classes.dex */
    public class c<T extends FloatingActionButton> implements d.f {

        /* renamed from: a */
        public final j<T> f3251a = null;

        public c() {
            FloatingActionButton.this = r1;
        }

        @Override // com.google.android.material.floatingactionbutton.d.f
        public final void a() {
            this.f3251a.a();
        }

        @Override // com.google.android.material.floatingactionbutton.d.f
        public final void b() {
            this.f3251a.b();
        }

        public final boolean equals(Object obj) {
            return (obj instanceof c) && ((c) obj).f3251a.equals(this.f3251a);
        }

        public final int hashCode() {
            return this.f3251a.hashCode();
        }
    }

    private d getImpl() {
        if (this.D == null) {
            this.D = new t5.c(this, new b());
        }
        return this.D;
    }

    @Override // s5.a
    public final boolean a() {
        throw null;
    }

    public final void d() {
        d impl = getImpl();
        if (impl.p == null) {
            impl.p = new ArrayList<>();
        }
        impl.p.add(null);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().k(getDrawableState());
    }

    public final void e(Animator.AnimatorListener animatorListener) {
        d impl = getImpl();
        if (impl.f3277o == null) {
            impl.f3277o = new ArrayList<>();
        }
        impl.f3277o.add(animatorListener);
    }

    public final void f() {
        d impl = getImpl();
        c cVar = new c();
        if (impl.f3278q == null) {
            impl.f3278q = new ArrayList<>();
        }
        impl.f3278q.add(cVar);
    }

    @Deprecated
    public final void g(Rect rect) {
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        if (!z.g.c(this)) {
            return;
        }
        rect.set(0, 0, getWidth(), getHeight());
        throw null;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f3242t;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f3243u;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().e();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().f3267e;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f3268f;
    }

    public Drawable getContentBackground() {
        Objects.requireNonNull(getImpl());
        return null;
    }

    public int getCustomSize() {
        return this.f3247z;
    }

    public int getExpandedComponentIdHint() {
        throw null;
    }

    public g getHideMotionSpec() {
        return getImpl().f3272j;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f3246x;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f3246x;
    }

    public a6.j getShapeAppearanceModel() {
        a6.j jVar = getImpl().f3263a;
        Objects.requireNonNull(jVar);
        return jVar;
    }

    public g getShowMotionSpec() {
        return getImpl().f3271i;
    }

    public int getSize() {
        return this.y;
    }

    public int getSizeDimension() {
        return h(this.y);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f3244v;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f3245w;
    }

    public boolean getUseCompatPadding() {
        return this.C;
    }

    public final int h(int i10) {
        int i11 = this.f3247z;
        if (i11 != 0) {
            return i11;
        }
        Resources resources = getResources();
        if (i10 != -1) {
            return resources.getDimensionPixelSize(i10 != 1 ? R.dimen.design_fab_size_normal : R.dimen.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? h(1) : h(0);
    }

    public final void i(a aVar, boolean z10) {
        d impl = getImpl();
        com.google.android.material.floatingactionbutton.a aVar2 = aVar == null ? null : new com.google.android.material.floatingactionbutton.a(this, aVar);
        if (impl.g()) {
            return;
        }
        Animator animator = impl.f3270h;
        if (animator != null) {
            animator.cancel();
        }
        if (!impl.r()) {
            impl.f3279r.b(z10 ? 8 : 4, z10);
            if (aVar2 == null) {
                return;
            }
            aVar2.f3253a.a(aVar2.f3254b);
            return;
        }
        g gVar = impl.f3272j;
        AnimatorSet b10 = gVar != null ? impl.b(gVar, 0.0f, 0.0f, 0.0f) : impl.c(0.0f, 0.4f, 0.4f);
        b10.addListener(new com.google.android.material.floatingactionbutton.b(impl, z10, aVar2));
        ArrayList<Animator.AnimatorListener> arrayList = impl.p;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                b10.addListener(it.next());
            }
        }
        b10.start();
    }

    public final boolean j() {
        return getImpl().g();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().i();
    }

    public final boolean k() {
        return getImpl().h();
    }

    public final void l() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f3244v;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f3245w;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(l.c(colorForState, mode));
    }

    public final void m(a aVar, boolean z10) {
        d impl = getImpl();
        com.google.android.material.floatingactionbutton.a aVar2 = aVar == null ? null : new com.google.android.material.floatingactionbutton.a(this, aVar);
        if (impl.h()) {
            return;
        }
        Animator animator = impl.f3270h;
        if (animator != null) {
            animator.cancel();
        }
        boolean z11 = impl.f3271i == null;
        if (!impl.r()) {
            impl.f3279r.b(0, z10);
            impl.f3279r.setAlpha(1.0f);
            impl.f3279r.setScaleY(1.0f);
            impl.f3279r.setScaleX(1.0f);
            impl.o(1.0f);
            if (aVar2 == null) {
                return;
            }
            aVar2.f3253a.b();
            return;
        }
        if (impl.f3279r.getVisibility() != 0) {
            float f10 = 0.0f;
            impl.f3279r.setAlpha(0.0f);
            impl.f3279r.setScaleY(z11 ? 0.4f : 0.0f);
            impl.f3279r.setScaleX(z11 ? 0.4f : 0.0f);
            if (z11) {
                f10 = 0.4f;
            }
            impl.o(f10);
        }
        g gVar = impl.f3271i;
        AnimatorSet b10 = gVar != null ? impl.b(gVar, 1.0f, 1.0f, 1.0f) : impl.c(1.0f, 1.0f, 1.0f);
        b10.addListener(new com.google.android.material.floatingactionbutton.c(impl, z10, aVar2));
        ArrayList<Animator.AnimatorListener> arrayList = impl.f3277o;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                b10.addListener(it.next());
            }
        }
        b10.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d impl = getImpl();
        Objects.requireNonNull(impl);
        if (!(impl instanceof t5.c)) {
            ViewTreeObserver viewTreeObserver = impl.f3279r.getViewTreeObserver();
            if (impl.f3285x == null) {
                impl.f3285x = new t5.b(impl);
            }
            viewTreeObserver.addOnPreDrawListener(impl.f3285x);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.f3279r.getViewTreeObserver();
        t5.b bVar = impl.f3285x;
        if (bVar != null) {
            viewTreeObserver.removeOnPreDrawListener(bVar);
            impl.f3285x = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.A = (getSizeDimension() - this.B) / 2;
        getImpl().t();
        throw null;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c6.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c6.a aVar = (c6.a) parcelable;
        super.onRestoreInstanceState(aVar.f17592s);
        Objects.requireNonNull(aVar.f2813u.getOrDefault("expandableWidgetHelper", null));
        throw null;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        if (super.onSaveInstanceState() == null) {
            new Bundle();
        }
        throw null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            g(null);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f3242t != colorStateList) {
            this.f3242t = colorStateList;
            Objects.requireNonNull(getImpl());
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f3243u != mode) {
            this.f3243u = mode;
            Objects.requireNonNull(getImpl());
        }
    }

    public void setCompatElevation(float f10) {
        d impl = getImpl();
        if (impl.f3266d != f10) {
            impl.f3266d = f10;
            impl.l(f10, impl.f3267e, impl.f3268f);
        }
    }

    public void setCompatElevationResource(int i10) {
        setCompatElevation(getResources().getDimension(i10));
    }

    public void setCompatHoveredFocusedTranslationZ(float f10) {
        d impl = getImpl();
        if (impl.f3267e != f10) {
            impl.f3267e = f10;
            impl.l(impl.f3266d, f10, impl.f3268f);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i10) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i10));
    }

    public void setCompatPressedTranslationZ(float f10) {
        d impl = getImpl();
        if (impl.f3268f != f10) {
            impl.f3268f = f10;
            impl.l(impl.f3266d, impl.f3267e, f10);
        }
    }

    public void setCompatPressedTranslationZResource(int i10) {
        setCompatPressedTranslationZ(getResources().getDimension(i10));
    }

    public void setCustomSize(int i10) {
        if (i10 >= 0) {
            if (i10 == this.f3247z) {
                return;
            }
            this.f3247z = i10;
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        Objects.requireNonNull(getImpl());
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        if (z10 != getImpl().f3264b) {
            getImpl().f3264b = z10;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i10) {
        throw null;
    }

    public void setHideMotionSpec(g gVar) {
        getImpl().f3272j = gVar;
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(g.a(getContext(), i10));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            d impl = getImpl();
            impl.o(impl.f3274l);
            if (this.f3244v == null) {
                return;
            }
            l();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        throw null;
    }

    public void setMaxImageSize(int i10) {
        this.B = i10;
        d impl = getImpl();
        if (impl.f3275m != i10) {
            impl.f3275m = i10;
            impl.o(impl.f3274l);
        }
    }

    public void setRippleColor(int i10) {
        setRippleColor(ColorStateList.valueOf(i10));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f3246x != colorStateList) {
            this.f3246x = colorStateList;
            getImpl().p();
        }
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        super.setScaleX(f10);
        getImpl().m();
    }

    @Override // android.view.View
    public void setScaleY(float f10) {
        super.setScaleY(f10);
        getImpl().m();
    }

    public void setShadowPaddingEnabled(boolean z10) {
        d impl = getImpl();
        impl.f3265c = z10;
        impl.t();
        throw null;
    }

    @Override // a6.m
    public void setShapeAppearanceModel(a6.j jVar) {
        getImpl().f3263a = jVar;
    }

    public void setShowMotionSpec(g gVar) {
        getImpl().f3271i = gVar;
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(g.a(getContext(), i10));
    }

    public void setSize(int i10) {
        this.f3247z = 0;
        if (i10 != this.y) {
            this.y = i10;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f3244v != colorStateList) {
            this.f3244v = colorStateList;
            l();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f3245w != mode) {
            this.f3245w = mode;
            l();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        getImpl().n();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        getImpl().n();
    }

    @Override // android.view.View
    public void setTranslationZ(float f10) {
        super.setTranslationZ(f10);
        getImpl().n();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.C != z10) {
            this.C = z10;
            getImpl().j();
        }
    }

    @Override // u5.t, android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }
}
