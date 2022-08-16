package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.i;
import com.raouf.routerchef.R;
import e.s;
import j.g;
import java.util.WeakHashMap;
import m0.f0;
import m0.l0;
import m0.n;
import m0.o;
import m0.p;
import m0.z;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements k0, n, o {
    public static final int[] T = {R.attr.actionBarSize, 16842841};
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public int E;
    public l0 I;
    public l0 J;
    public l0 K;
    public l0 L;
    public d M;
    public OverScroller N;
    public ViewPropertyAnimator O;

    /* renamed from: s */
    public int f632s;

    /* renamed from: u */
    public ContentFrameLayout f634u;

    /* renamed from: v */
    public ActionBarContainer f635v;

    /* renamed from: w */
    public l0 f636w;

    /* renamed from: x */
    public Drawable f637x;
    public boolean y;

    /* renamed from: z */
    public boolean f638z;

    /* renamed from: t */
    public int f633t = 0;
    public final Rect F = new Rect();
    public final Rect G = new Rect();
    public final Rect H = new Rect();
    public final a P = new a();
    public final b Q = new b();
    public final c R = new c();
    public final p S = new p(this);

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        public a() {
            ActionBarOverlayLayout.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.O = null;
            actionBarOverlayLayout.C = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.O = null;
            actionBarOverlayLayout.C = false;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
            ActionBarOverlayLayout.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout.this.q();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.O = actionBarOverlayLayout.f635v.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.P);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
            ActionBarOverlayLayout.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionBarOverlayLayout.this.q();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.O = actionBarOverlayLayout.f635v.animate().translationY(-ActionBarOverlayLayout.this.f635v.getHeight()).setListener(ActionBarOverlayLayout.this.P);
        }
    }

    /* loaded from: classes.dex */
    public interface d {
    }

    /* loaded from: classes.dex */
    public static class e extends ViewGroup.MarginLayoutParams {
        public e() {
            super(-1, -1);
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        l0 l0Var = l0.f5880b;
        this.I = l0Var;
        this.J = l0Var;
        this.K = l0Var;
        this.L = l0Var;
        r(context);
    }

    @Override // androidx.appcompat.widget.k0
    public final void a(Menu menu, i.a aVar) {
        s();
        this.f636w.a(menu, aVar);
    }

    @Override // androidx.appcompat.widget.k0
    public final boolean b() {
        s();
        return this.f636w.b();
    }

    @Override // androidx.appcompat.widget.k0
    public final void c() {
        s();
        this.f636w.c();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.k0
    public final boolean d() {
        s();
        return this.f636w.d();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        if (this.f637x == null || this.y) {
            return;
        }
        if (this.f635v.getVisibility() == 0) {
            i10 = (int) (this.f635v.getTranslationY() + this.f635v.getBottom() + 0.5f);
        } else {
            i10 = 0;
        }
        this.f637x.setBounds(0, i10, getWidth(), this.f637x.getIntrinsicHeight() + i10);
        this.f637x.draw(canvas);
    }

    @Override // androidx.appcompat.widget.k0
    public final boolean e() {
        s();
        return this.f636w.e();
    }

    @Override // androidx.appcompat.widget.k0
    public final boolean f() {
        s();
        return this.f636w.f();
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.k0
    public final boolean g() {
        s();
        return this.f636w.g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f635v;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        p pVar = this.S;
        return pVar.f5916b | pVar.f5915a;
    }

    public CharSequence getTitle() {
        s();
        return this.f636w.getTitle();
    }

    @Override // m0.n
    public final void h(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // m0.n
    public final void i(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // m0.n
    public final void j(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // androidx.appcompat.widget.k0
    public final void k(int i10) {
        s();
        if (i10 == 2) {
            this.f636w.r();
        } else if (i10 == 5) {
            this.f636w.s();
        } else if (i10 != 109) {
        } else {
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.k0
    public final void l() {
        s();
        this.f636w.h();
    }

    @Override // m0.o
    public final void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // m0.n
    public final void n(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // m0.n
    public final boolean o(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        s();
        l0 l10 = l0.l(windowInsets, this);
        boolean p = p(this.f635v, new Rect(l10.d(), l10.f(), l10.e(), l10.c()), false);
        Rect rect = this.F;
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        z.i.b(this, l10, rect);
        Rect rect2 = this.F;
        l0 l11 = l10.f5881a.l(rect2.left, rect2.top, rect2.right, rect2.bottom);
        this.I = l11;
        boolean z10 = true;
        if (!this.J.equals(l11)) {
            this.J = this.I;
            p = true;
        }
        if (!this.G.equals(this.F)) {
            this.G.set(this.F);
        } else {
            z10 = p;
        }
        if (z10) {
            requestLayout();
        }
        return l10.f5881a.a().f5881a.c().f5881a.b().k();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        r(getContext());
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        z.h.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        l0 l0Var;
        s();
        measureChildWithMargins(this.f635v, i10, 0, i11, 0);
        e eVar = (e) this.f635v.getLayoutParams();
        int max = Math.max(0, this.f635v.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.f635v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f635v.getMeasuredState());
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        boolean z10 = (z.d.g(this) & 256) != 0;
        if (z10) {
            i12 = this.f632s;
            if (this.A && this.f635v.getTabContainer() != null) {
                i12 += this.f632s;
            }
        } else {
            i12 = this.f635v.getVisibility() != 8 ? this.f635v.getMeasuredHeight() : 0;
        }
        this.H.set(this.F);
        l0 l0Var2 = this.I;
        this.K = l0Var2;
        if (!this.f638z && !z10) {
            Rect rect = this.H;
            rect.top += i12;
            rect.bottom += 0;
            l0Var = l0Var2.f5881a.l(0, i12, 0, 0);
        } else {
            e0.b b10 = e0.b.b(l0Var2.d(), this.K.f() + i12, this.K.e(), this.K.c() + 0);
            l0 l0Var3 = this.K;
            int i13 = Build.VERSION.SDK_INT;
            l0.e dVar = i13 >= 30 ? new l0.d(l0Var3) : i13 >= 29 ? new l0.c(l0Var3) : new l0.b(l0Var3);
            dVar.d(b10);
            l0Var = dVar.b();
        }
        this.K = l0Var;
        p(this.f634u, this.H, true);
        if (!this.L.equals(this.K)) {
            l0 l0Var4 = this.K;
            this.L = l0Var4;
            z.c(this.f634u, l0Var4);
        }
        measureChildWithMargins(this.f634u, i10, 0, i11, 0);
        e eVar2 = (e) this.f634u.getLayoutParams();
        int max3 = Math.max(max, this.f634u.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.f634u.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f634u.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i10, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i11, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        boolean z11 = false;
        if (!this.B || !z10) {
            return false;
        }
        this.N.fling(0, 0, 0, (int) f11, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.N.getFinalY() > this.f635v.getHeight()) {
            z11 = true;
        }
        if (z11) {
            q();
            this.R.run();
        } else {
            q();
            this.Q.run();
        }
        this.C = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.D + i11;
        this.D = i14;
        setActionBarHideOffset(i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        s sVar;
        g gVar;
        this.S.a(i10, 0);
        this.D = getActionBarHideOffset();
        q();
        d dVar = this.M;
        if (dVar == null || (gVar = (sVar = (s) dVar).f4297u) == null) {
            return;
        }
        gVar.a();
        sVar.f4297u = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f635v.getVisibility() != 0) {
            return false;
        }
        return this.B;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.B || this.C) {
            return;
        }
        if (this.D <= this.f635v.getHeight()) {
            q();
            postDelayed(this.Q, 600L);
            return;
        }
        q();
        postDelayed(this.R, 600L);
    }

    @Override // android.view.View
    @Deprecated
    public final void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        s();
        int i11 = this.E ^ i10;
        this.E = i10;
        boolean z10 = (i10 & 4) == 0;
        boolean z11 = (i10 & 256) != 0;
        d dVar = this.M;
        if (dVar != null) {
            ((s) dVar).p = !z11;
            if (!z10 && z11) {
                s sVar = (s) dVar;
                if (!sVar.f4294r) {
                    sVar.f4294r = true;
                    sVar.j(true);
                }
            } else {
                s sVar2 = (s) dVar;
                if (sVar2.f4294r) {
                    sVar2.f4294r = false;
                    sVar2.j(true);
                }
            }
        }
        if ((i11 & 256) == 0 || this.M == null) {
            return;
        }
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        z.h.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f633t = i10;
        d dVar = this.M;
        if (dVar != null) {
            ((s) dVar).f4292o = i10;
        }
    }

    public final boolean p(View view, Rect rect, boolean z10) {
        boolean z11;
        e eVar = (e) view.getLayoutParams();
        int i10 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
        int i11 = rect.left;
        if (i10 != i11) {
            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i11;
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        int i13 = rect.top;
        if (i12 != i13) {
            ((ViewGroup.MarginLayoutParams) eVar).topMargin = i13;
            z11 = true;
        }
        int i14 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
        int i15 = rect.right;
        if (i14 != i15) {
            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i15;
            z11 = true;
        }
        if (z10) {
            int i16 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i17 = rect.bottom;
            if (i16 != i17) {
                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i17;
                return true;
            }
        }
        return z11;
    }

    public final void q() {
        removeCallbacks(this.Q);
        removeCallbacks(this.R);
        ViewPropertyAnimator viewPropertyAnimator = this.O;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void r(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(T);
        boolean z10 = false;
        this.f632s = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f637x = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z10 = true;
        }
        this.y = z10;
        this.N = new OverScroller(context);
    }

    public final void s() {
        l0 l0Var;
        if (this.f634u == null) {
            this.f634u = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f635v = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof l0) {
                l0Var = (l0) findViewById;
            } else if (!(findViewById instanceof Toolbar)) {
                StringBuilder c10 = androidx.activity.result.a.c("Can't make a decor toolbar out of ");
                c10.append(findViewById.getClass().getSimpleName());
                throw new IllegalStateException(c10.toString());
            } else {
                l0Var = ((Toolbar) findViewById).getWrapper();
            }
            this.f636w = l0Var;
        }
    }

    public void setActionBarHideOffset(int i10) {
        q();
        this.f635v.setTranslationY(-Math.max(0, Math.min(i10, this.f635v.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.M = dVar;
        if (getWindowToken() != null) {
            ((s) this.M).f4292o = this.f633t;
            int i10 = this.E;
            if (i10 == 0) {
                return;
            }
            onWindowSystemUiVisibilityChanged(i10);
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            z.h.c(this);
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.A = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.B) {
            this.B = z10;
            if (z10) {
                return;
            }
            q();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i10) {
        s();
        this.f636w.setIcon(i10);
    }

    public void setIcon(Drawable drawable) {
        s();
        this.f636w.setIcon(drawable);
    }

    public void setLogo(int i10) {
        s();
        this.f636w.o(i10);
    }

    public void setOverlayMode(boolean z10) {
        this.f638z = z10;
        this.y = z10 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // androidx.appcompat.widget.k0
    public void setWindowCallback(Window.Callback callback) {
        s();
        this.f636w.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.k0
    public void setWindowTitle(CharSequence charSequence) {
        s();
        this.f636w.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
