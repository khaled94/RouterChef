package androidx.core.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.appcompat.app.AlertController;
import com.raouf.routerchef.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m0.f0;
import m0.l;
import m0.m;
import m0.o;
import m0.p;
import m0.z;
import n0.f;
import n0.h;
import q0.e;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements o, l {
    public static final a S = new a();
    public static final int[] T = {16843130};
    public VelocityTracker C;
    public boolean D;
    public int F;
    public int G;
    public int H;
    public int L;
    public int M;
    public d N;
    public final p O;
    public final m P;
    public float Q;
    public c R;

    /* renamed from: s */
    public long f1277s;

    /* renamed from: u */
    public OverScroller f1279u;

    /* renamed from: v */
    public EdgeEffect f1280v;

    /* renamed from: w */
    public EdgeEffect f1281w;

    /* renamed from: x */
    public int f1282x;

    /* renamed from: t */
    public final Rect f1278t = new Rect();
    public boolean y = true;

    /* renamed from: z */
    public boolean f1283z = false;
    public View A = null;
    public boolean B = false;
    public boolean E = true;
    public int I = -1;
    public final int[] J = new int[2];
    public final int[] K = new int[2];

    /* loaded from: classes.dex */
    public static class a extends m0.a {
        @Override // m0.a
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            super.c(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            h.c(accessibilityEvent, nestedScrollView.getScrollX());
            h.d(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // m0.a
        public final void d(View view, f fVar) {
            int scrollRange;
            this.f5847a.onInitializeAccessibilityNodeInfo(view, fVar.f16401a);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            fVar.n(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            fVar.v(true);
            if (nestedScrollView.getScrollY() > 0) {
                fVar.b(f.a.f16406g);
                fVar.b(f.a.f16410k);
            }
            if (nestedScrollView.getScrollY() >= scrollRange) {
                return;
            }
            fVar.b(f.a.f16405f);
            fVar.b(f.a.f16411l);
        }

        @Override // m0.a
        public final boolean g(View view, int i10, Bundle bundle) {
            int min;
            if (super.g(view, i10, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i10 != 4096) {
                if (i10 == 8192 || i10 == 16908344) {
                    min = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (min == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.z(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), true);
                    return true;
                } else if (i10 != 16908346) {
                    return false;
                }
            }
            min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.z(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), true);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* loaded from: classes.dex */
    public interface c {
    }

    /* loaded from: classes.dex */
    public static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: s */
        public int f1284s;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d(Parcel parcel) {
            super(parcel);
            this.f1284s = parcel.readInt();
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder c10 = androidx.activity.result.a.c("HorizontalScrollView.SavedState{");
            c10.append(Integer.toHexString(System.identityHashCode(this)));
            c10.append(" scrollPosition=");
            c10.append(this.f1284s);
            c10.append("}");
            return c10.toString();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f1284s);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.nestedScrollViewStyle);
        int i10 = Build.VERSION.SDK_INT;
        this.f1280v = i10 >= 31 ? e.b.a(context, attributeSet) : new EdgeEffect(context);
        this.f1281w = i10 >= 31 ? e.b.a(context, attributeSet) : new EdgeEffect(context);
        this.f1279u = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.F = viewConfiguration.getScaledTouchSlop();
        this.G = viewConfiguration.getScaledMinimumFlingVelocity();
        this.H = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, T, R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.O = new p(this);
        this.P = new m(this);
        setNestedScrollingEnabled(true);
        z.p(this, S);
    }

    public static int c(int i10, int i11, int i12) {
        if (i11 >= i12 || i10 < 0) {
            return 0;
        }
        return i11 + i10 > i12 ? i12 - i11 : i10;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.Q == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.Q = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.Q;
    }

    public static boolean q(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && q((View) parent, view2);
    }

    public final boolean A(int i10, int i11) {
        return this.P.h(i10, i11);
    }

    public final boolean B(MotionEvent motionEvent) {
        boolean z10;
        if (e.a(this.f1280v) != 0.0f) {
            e.b(this.f1280v, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        } else {
            z10 = false;
        }
        if (e.a(this.f1281w) != 0.0f) {
            e.b(this.f1281w, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z10;
    }

    public final void C(int i10) {
        this.P.i(i10);
    }

    public final void a() {
        this.f1279u.abortAnimation();
        C(1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10) {
        if (getChildCount() <= 0) {
            super.addView(view, i10);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public final boolean b(int i10) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !r(findNextFocus, maxScrollAmount, getHeight())) {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            f(maxScrollAmount);
        } else {
            findNextFocus.getDrawingRect(this.f1278t);
            offsetDescendantRectToMyCoords(findNextFocus, this.f1278t);
            f(d(this.f1278t));
            findNextFocus.requestFocus(i10);
        }
        if (findFocus != null && findFocus.isFocused() && (!r(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public final void computeScroll() {
        EdgeEffect edgeEffect;
        if (this.f1279u.isFinished()) {
            return;
        }
        this.f1279u.computeScrollOffset();
        int currY = this.f1279u.getCurrY();
        int i10 = currY - this.M;
        this.M = currY;
        int[] iArr = this.K;
        boolean z10 = false;
        iArr[1] = 0;
        e(0, i10, iArr, null, 1);
        int i11 = i10 - this.K[1];
        int scrollRange = getScrollRange();
        if (i11 != 0) {
            int scrollY = getScrollY();
            u(i11, getScrollX(), scrollY, scrollRange);
            int scrollY2 = getScrollY() - scrollY;
            int i12 = i11 - scrollY2;
            int[] iArr2 = this.K;
            iArr2[1] = 0;
            this.P.e(0, scrollY2, 0, i12, this.J, 1, iArr2);
            i11 = i12 - this.K[1];
        }
        if (i11 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z10 = true;
            }
            if (z10) {
                if (i11 < 0) {
                    if (this.f1280v.isFinished()) {
                        edgeEffect = this.f1280v;
                        edgeEffect.onAbsorb((int) this.f1279u.getCurrVelocity());
                    }
                } else if (this.f1281w.isFinished()) {
                    edgeEffect = this.f1281w;
                    edgeEffect.onAbsorb((int) this.f1279u.getCurrVelocity());
                }
            }
            a();
        }
        if (!this.f1279u.isFinished()) {
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            z.d.k(this);
            return;
        }
        C(1);
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    public final int d(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i11 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i10 - verticalFadingEdgeLength : i10;
        int i12 = rect.bottom;
        if (i12 > i11 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i11) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i10);
        } else if (rect.top >= scrollY || i12 >= i11) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i11 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || g(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.P.a(f10, f11, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return this.P.b(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return e(i10, i11, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.P.e(i10, i11, i12, i13, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i11 = 0;
        if (!this.f1280v.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i10 = getPaddingLeft() + 0;
            } else {
                i10 = 0;
            }
            if (b.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i10, min);
            this.f1280v.setSize(width, height);
            if (this.f1280v.draw(canvas)) {
                WeakHashMap<View, f0> weakHashMap = z.f5921a;
                z.d.k(this);
            }
            canvas.restoreToCount(save);
        }
        if (!this.f1281w.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (b.a(this)) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i11 = 0 + getPaddingLeft();
            }
            if (b.a(this)) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate(i11 - width2, max);
            canvas.rotate(180.0f, width2, 0.0f);
            this.f1281w.setSize(width2, height2);
            if (this.f1281w.draw(canvas)) {
                WeakHashMap<View, f0> weakHashMap2 = z.f5921a;
                z.d.k(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    public final boolean e(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return this.P.c(i10, i11, iArr, iArr2, i12);
    }

    public final void f(int i10) {
        if (i10 != 0) {
            if (this.E) {
                z(0, i10, false);
            } else {
                scrollBy(0, i10);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.g(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom >= verticalFadingEdgeLength) {
            return 1.0f;
        }
        return bottom / verticalFadingEdgeLength;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        p pVar = this.O;
        return pVar.f5916b | pVar.f5915a;
    }

    public int getScrollRange() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
        }
        return 0;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY >= verticalFadingEdgeLength) {
            return 1.0f;
        }
        return scrollY / verticalFadingEdgeLength;
    }

    @Override // m0.n
    public final void h(View view, View view2, int i10, int i11) {
        this.O.a(i10, i11);
        A(2, i11);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return p(0);
    }

    @Override // m0.n
    public final void i(View view, int i10) {
        p pVar = this.O;
        if (i10 == 1) {
            pVar.f5916b = 0;
        } else {
            pVar.f5915a = 0;
        }
        C(i10);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.P.f5913d;
    }

    @Override // m0.n
    public final void j(View view, int i10, int i11, int[] iArr, int i12) {
        e(i10, i11, iArr, null, i12);
    }

    public final void k(int i10) {
        if (getChildCount() > 0) {
            this.f1279u.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            w(true);
        }
    }

    public final boolean l(int i10) {
        int childCount;
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f1278t;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f1278t.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            Rect rect2 = this.f1278t;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f1278t;
        return x(i10, rect3.top, rect3.bottom);
    }

    @Override // m0.o
    public final void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        s(i13, i14, iArr);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // m0.n
    public final void n(View view, int i10, int i11, int i12, int i13, int i14) {
        s(i13, i14, null);
    }

    @Override // m0.n
    public final boolean o(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1283z = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getAction()
            r1 = 0
            r2 = 8
            if (r0 != r2) goto Lc2
            boolean r0 = r8.B
            if (r0 != 0) goto Lc2
            r0 = 2
            boolean r0 = b7.c.d(r9, r0)
            r2 = 0
            if (r0 == 0) goto L1c
            r0 = 9
        L17:
            float r0 = r9.getAxisValue(r0)
            goto L28
        L1c:
            r0 = 4194304(0x400000, float:5.877472E-39)
            boolean r0 = b7.c.d(r9, r0)
            if (r0 == 0) goto L27
            r0 = 26
            goto L17
        L27:
            r0 = r2
        L28:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto Lc2
            float r2 = r8.getVerticalScrollFactorCompat()
            float r0 = r0 * r2
            int r0 = (int) r0
            int r2 = r8.getScrollRange()
            int r3 = r8.getScrollY()
            int r0 = r3 - r0
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 8194(0x2002, float:1.1482E-41)
            r6 = 1
            if (r0 >= 0) goto L7b
            int r2 = r8.getOverScrollMode()
            if (r2 == 0) goto L54
            if (r2 != r6) goto L52
            int r2 = r8.getScrollRange()
            if (r2 <= 0) goto L52
            goto L54
        L52:
            r2 = r1
            goto L55
        L54:
            r2 = r6
        L55:
            if (r2 == 0) goto L5f
            boolean r9 = b7.c.d(r9, r5)
            if (r9 != 0) goto L5f
            r9 = r6
            goto L60
        L5f:
            r9 = r1
        L60:
            if (r9 == 0) goto L79
            android.widget.EdgeEffect r9 = r8.f1280v
            float r0 = (float) r0
            float r0 = -r0
            int r2 = r8.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            q0.e.b(r9, r0, r4)
            android.widget.EdgeEffect r9 = r8.f1280v
            r9.onRelease()
            r8.invalidate()
            r9 = r6
            goto Lb7
        L79:
            r9 = r1
            goto Lb7
        L7b:
            if (r0 <= r2) goto Lb5
            int r7 = r8.getOverScrollMode()
            if (r7 == 0) goto L8e
            if (r7 != r6) goto L8c
            int r7 = r8.getScrollRange()
            if (r7 <= 0) goto L8c
            goto L8e
        L8c:
            r7 = r1
            goto L8f
        L8e:
            r7 = r6
        L8f:
            if (r7 == 0) goto L99
            boolean r9 = b7.c.d(r9, r5)
            if (r9 != 0) goto L99
            r9 = r6
            goto L9a
        L99:
            r9 = r1
        L9a:
            if (r9 == 0) goto Lb2
            android.widget.EdgeEffect r9 = r8.f1281w
            int r0 = r0 - r2
            float r0 = (float) r0
            int r1 = r8.getHeight()
            float r1 = (float) r1
            float r0 = r0 / r1
            q0.e.b(r9, r0, r4)
            android.widget.EdgeEffect r9 = r8.f1281w
            r9.onRelease()
            r8.invalidate()
            r1 = r6
        Lb2:
            r9 = r1
            r1 = r2
            goto Lb7
        Lb5:
            r9 = r1
            r1 = r0
        Lb7:
            if (r1 == r3) goto Lc1
            int r9 = r8.getScrollX()
            super.scrollTo(r9, r1)
            return r6
        Lc1:
            return r9
        Lc2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fa  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = 0;
        this.y = false;
        View view = this.A;
        if (view != null && q(view, this)) {
            y(this.A);
        }
        this.A = null;
        if (!this.f1283z) {
            if (this.N != null) {
                scrollTo(getScrollX(), this.N.f1284s);
                this.N = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i14 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int c10 = c(scrollY, paddingTop, i14);
            if (c10 != scrollY) {
                scrollTo(getScrollX(), c10);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1283z = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.D && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight >= measuredHeight2) {
                return;
            }
            childAt.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!z10) {
            dispatchNestedFling(0.0f, f11, true);
            k((int) f11);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        e(i10, i11, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        s(i13, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.O.a(i10, 0);
        A(2, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        View findNextFocus = rect == null ? focusFinder.findNextFocus(this, null, i10) : focusFinder.findNextFocusFromRect(this, rect, i10);
        if (findNextFocus != null && !(true ^ r(findNextFocus, 0, getHeight()))) {
            return findNextFocus.requestFocus(i10, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.N = dVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f1284s = getScrollY();
        return dVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        c cVar = this.R;
        if (cVar != null) {
            e.b bVar = (e.b) cVar;
            AlertController.c(this, bVar.f4177a, bVar.f4178b);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !r(findFocus, 0, i13)) {
            return;
        }
        findFocus.getDrawingRect(this.f1278t);
        offsetDescendantRectToMyCoords(findFocus, this.f1278t);
        f(d(this.f1278t));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return (i10 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.O.f5915a = 0;
        C(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0280, code lost:
        if (r23.f1279u.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0282, code lost:
        r0 = m0.z.f5921a;
        m0.z.d.k(r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
        if (r23.f1279u.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L109;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0218  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean p(int i10) {
        return this.P.g(i10);
    }

    public final boolean r(View view, int i10, int i11) {
        view.getDrawingRect(this.f1278t);
        offsetDescendantRectToMyCoords(view, this.f1278t);
        return this.f1278t.bottom + i10 >= getScrollY() && this.f1278t.top - i10 <= getScrollY() + i11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.y) {
            y(view2);
        } else {
            this.A = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int d5 = d(rect);
        boolean z11 = d5 != 0;
        if (z11) {
            if (z10) {
                scrollBy(0, d5);
            } else {
                z(0, d5, false);
            }
        }
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        if (z10) {
            v();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.y = true;
        super.requestLayout();
    }

    public final void s(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.P.d(scrollY2, i10 - scrollY2, i11, iArr);
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int c10 = c(i10, (getWidth() - getPaddingLeft()) - getPaddingRight(), childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
            int c11 = c(i11, (getHeight() - getPaddingTop()) - getPaddingBottom(), childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
            if (c10 == getScrollX() && c11 == getScrollY()) {
                return;
            }
            super.scrollTo(c10, c11);
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.D) {
            this.D = z10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        m mVar = this.P;
        if (mVar.f5913d) {
            View view = mVar.f5912c;
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            z.i.z(view);
        }
        mVar.f5913d = z10;
    }

    public void setOnScrollChangeListener(c cVar) {
        this.R = cVar;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.E = z10;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return A(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        C(0);
    }

    public final void t(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.I) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f1282x = (int) motionEvent.getY(i10);
            this.I = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.C;
            if (velocityTracker == null) {
                return;
            }
            velocityTracker.clear();
        }
    }

    public final boolean u(int i10, int i11, int i12, int i13) {
        boolean z10;
        boolean z11;
        getOverScrollMode();
        computeHorizontalScrollRange();
        computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        computeVerticalScrollExtent();
        int i14 = i11 + 0;
        int i15 = i12 + i10;
        int i16 = i13 + 0;
        if (i14 <= 0 && i14 >= 0) {
            z10 = false;
        } else {
            i14 = 0;
            z10 = true;
        }
        if (i15 > i16) {
            i15 = i16;
        } else if (i15 >= 0) {
            z11 = false;
            if (z11 && !p(1)) {
                this.f1279u.springBack(i14, i15, 0, 0, 0, getScrollRange());
            }
            onOverScrolled(i14, i15, z10, z11);
            return z10 || z11;
        } else {
            i15 = 0;
        }
        z11 = true;
        if (z11) {
            this.f1279u.springBack(i14, i15, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i14, i15, z10, z11);
        if (z10) {
            return true;
        }
    }

    public final void v() {
        VelocityTracker velocityTracker = this.C;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.C = null;
        }
    }

    public final void w(boolean z10) {
        if (z10) {
            A(2, 1);
        } else {
            C(1);
        }
        this.M = getScrollY();
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        z.d.k(this);
    }

    public final boolean x(int i10, int i11, int i12) {
        boolean z10;
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = height + scrollY;
        boolean z11 = i10 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z12 = false;
        for (int i14 = 0; i14 < size; i14++) {
            View view2 = focusables.get(i14);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i11 < bottom && top < i12) {
                boolean z13 = i11 < top && bottom < i12;
                if (view == null) {
                    view = view2;
                    z12 = z13;
                } else {
                    boolean z14 = (z11 && top < view.getTop()) || (!z11 && bottom > view.getBottom());
                    if (z12) {
                        if (z13) {
                            if (!z14) {
                            }
                            view = view2;
                        }
                    } else if (z13) {
                        view = view2;
                        z12 = true;
                    } else {
                        if (!z14) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i11 < scrollY || i12 > i13) {
            f(z11 ? i11 - scrollY : i12 - i13);
            z10 = true;
        } else {
            z10 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i10);
        }
        return z10;
    }

    public final void y(View view) {
        view.getDrawingRect(this.f1278t);
        offsetDescendantRectToMyCoords(view, this.f1278t);
        int d5 = d(this.f1278t);
        if (d5 != 0) {
            scrollBy(0, d5);
        }
    }

    public final void z(int i10, int i11, boolean z10) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f1277s > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int scrollY = getScrollY();
            OverScroller overScroller = this.f1279u;
            int scrollX = getScrollX();
            overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom())))) - scrollY, 250);
            w(z10);
        } else {
            if (!this.f1279u.isFinished()) {
                a();
            }
            scrollBy(i10, i11);
        }
        this.f1277s = AnimationUtils.currentAnimationTimeMillis();
    }
}
