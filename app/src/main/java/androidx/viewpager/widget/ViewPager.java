package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Scroller;
import android.widget.TextView;
import c0.a;
import com.raouf.routerchef.R;
import g8.l;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;

/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {

    /* renamed from: p0 */
    public static final int[] f2232p0 = {16842931};

    /* renamed from: q0 */
    public static final Comparator<e> f2233q0 = new a();

    /* renamed from: r0 */
    public static final b f2234r0 = new b();
    public Scroller A;
    public boolean B;
    public i C;
    public int D;
    public Drawable E;
    public int F;
    public int G;
    public int J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean O;
    public boolean P;
    public int Q;
    public int R;
    public int S;
    public float T;
    public float U;
    public float V;
    public float W;

    /* renamed from: b0 */
    public VelocityTracker f2236b0;

    /* renamed from: c0 */
    public int f2237c0;

    /* renamed from: d0 */
    public int f2238d0;

    /* renamed from: e0 */
    public int f2239e0;

    /* renamed from: f0 */
    public int f2240f0;

    /* renamed from: g0 */
    public EdgeEffect f2241g0;

    /* renamed from: h0 */
    public EdgeEffect f2242h0;

    /* renamed from: j0 */
    public boolean f2244j0;

    /* renamed from: k0 */
    public int f2245k0;

    /* renamed from: l0 */
    public List<h> f2246l0;

    /* renamed from: m0 */
    public h f2247m0;

    /* renamed from: s */
    public int f2250s;

    /* renamed from: w */
    public s1.a f2254w;

    /* renamed from: x */
    public int f2255x;

    /* renamed from: t */
    public final ArrayList<e> f2251t = new ArrayList<>();

    /* renamed from: u */
    public final e f2252u = new e();

    /* renamed from: v */
    public final Rect f2253v = new Rect();
    public int y = -1;

    /* renamed from: z */
    public Parcelable f2256z = null;
    public float H = -3.4028235E38f;
    public float I = Float.MAX_VALUE;
    public int N = 1;

    /* renamed from: a0 */
    public int f2235a0 = -1;

    /* renamed from: i0 */
    public boolean f2243i0 = true;

    /* renamed from: n0 */
    public final c f2248n0 = new c();

    /* renamed from: o0 */
    public int f2249o0 = 0;

    /* loaded from: classes.dex */
    public static class a implements Comparator<e> {
        @Override // java.util.Comparator
        public final int compare(e eVar, e eVar2) {
            return eVar.f2259b - eVar2.f2259b;
        }
    }

    /* loaded from: classes.dex */
    public static class b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
            ViewPager.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.q();
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface d {
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a */
        public View f2258a;

        /* renamed from: b */
        public int f2259b;

        /* renamed from: c */
        public boolean f2260c;

        /* renamed from: d */
        public float f2261d;

        /* renamed from: e */
        public float f2262e;
    }

    /* loaded from: classes.dex */
    public static class f extends ViewGroup.LayoutParams {

        /* renamed from: a */
        public boolean f2263a;

        /* renamed from: b */
        public int f2264b;

        /* renamed from: c */
        public float f2265c = 0.0f;

        /* renamed from: d */
        public boolean f2266d;

        /* renamed from: e */
        public int f2267e;

        public f() {
            super(-1, -1);
        }

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f2232p0);
            this.f2264b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public class g extends m0.a {
        public g() {
            ViewPager.this = r1;
        }

        @Override // m0.a
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            s1.a aVar;
            super.c(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            s1.a aVar2 = ViewPager.this.f2254w;
            boolean z10 = true;
            if (aVar2 == null || ((l) aVar2).f4951c.length <= 1) {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            if (accessibilityEvent.getEventType() != 4096 || (aVar = ViewPager.this.f2254w) == null) {
                return;
            }
            accessibilityEvent.setItemCount(((l) aVar).f4951c.length);
            accessibilityEvent.setFromIndex(ViewPager.this.f2255x);
            accessibilityEvent.setToIndex(ViewPager.this.f2255x);
        }

        @Override // m0.a
        public final void d(View view, n0.f fVar) {
            this.f5847a.onInitializeAccessibilityNodeInfo(view, fVar.f16401a);
            fVar.n(ViewPager.class.getName());
            s1.a aVar = ViewPager.this.f2254w;
            fVar.v(aVar != null && ((l) aVar).f4951c.length > 1);
            if (ViewPager.this.canScrollHorizontally(1)) {
                fVar.a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                fVar.a(8192);
            }
        }

        @Override // m0.a
        public final boolean g(View view, int i10, Bundle bundle) {
            ViewPager viewPager;
            int i11;
            if (super.g(view, i10, bundle)) {
                return true;
            }
            if (i10 != 4096) {
                if (i10 != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                viewPager = ViewPager.this;
                i11 = viewPager.f2255x - 1;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                viewPager = ViewPager.this;
                i11 = viewPager.f2255x + 1;
            }
            viewPager.setCurrentItem(i11);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public interface h {
        void a();

        void b();

        void c(int i10);
    }

    /* loaded from: classes.dex */
    public class i extends DataSetObserver {
        public i() {
            ViewPager.this = r1;
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            ViewPager.this.e();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            ViewPager.this.e();
        }
    }

    /* loaded from: classes.dex */
    public static class j extends s0.a {
        public static final Parcelable.Creator<j> CREATOR = new a();

        /* renamed from: u */
        public int f2270u;

        /* renamed from: v */
        public Parcelable f2271v;

        /* renamed from: w */
        public ClassLoader f2272w;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<j> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new j(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new j[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final j createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new j(parcel, classLoader);
            }
        }

        public j(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? j.class.getClassLoader() : classLoader;
            this.f2270u = parcel.readInt();
            this.f2271v = parcel.readParcelable(classLoader);
            this.f2272w = classLoader;
        }

        public j(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder c10 = androidx.activity.result.a.c("FragmentPager.SavedState{");
            c10.append(Integer.toHexString(System.identityHashCode(this)));
            c10.append(" position=");
            c10.append(this.f2270u);
            c10.append("}");
            return c10.toString();
        }

        @Override // s0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f17592s, i10);
            parcel.writeInt(this.f2270u);
            parcel.writeParcelable(this.f2271v, i10);
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.A = new Scroller(context2, f2234r0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f10 = context2.getResources().getDisplayMetrics().density;
        this.S = viewConfiguration.getScaledPagingTouchSlop();
        this.f2237c0 = (int) (400.0f * f10);
        this.f2238d0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f2241g0 = new EdgeEffect(context2);
        this.f2242h0 = new EdgeEffect(context2);
        this.f2239e0 = (int) (25.0f * f10);
        this.f2240f0 = (int) (2.0f * f10);
        this.Q = (int) (f10 * 16.0f);
        z.p(this, new g());
        if (z.d.c(this) == 0) {
            z.d.s(this, 1);
        }
        z.i.u(this, new s1.b(this));
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.L != z10) {
            this.L = z10;
        }
    }

    public final e a(int i10, int i11) {
        e eVar = new e();
        eVar.f2259b = i10;
        l lVar = (l) this.f2254w;
        View inflate = ((LayoutInflater) lVar.f4949a.getSystemService("layout_inflater")).inflate(R.layout.slider_layout, (ViewGroup) this, false);
        ((ImageView) inflate.findViewById(R.id.titleImage)).setImageResource(lVar.f4950b[i10]);
        ((TextView) inflate.findViewById(R.id.textTitle)).setText(lVar.f4951c[i10]);
        ((TextView) inflate.findViewById(R.id.textDescription)).setText(lVar.f4952d[i10]);
        addView(inflate);
        eVar.f2258a = inflate;
        Objects.requireNonNull(this.f2254w);
        eVar.f2261d = 1.0f;
        if (i11 < 0 || i11 >= this.f2251t.size()) {
            this.f2251t.add(eVar);
        } else {
            this.f2251t.add(i11, eVar);
        }
        return eVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        e h10;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (h10 = h(childAt)) != null && h10.f2259b == this.f2255x) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList<View> arrayList) {
        e h10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (h10 = h(childAt)) != null && h10.f2259b == this.f2255x) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        f fVar = (f) layoutParams;
        boolean z10 = fVar.f2263a | (view.getClass().getAnnotation(d.class) != null);
        fVar.f2263a = z10;
        if (!this.K) {
            super.addView(view, i10, layoutParams);
        } else if (z10) {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        } else {
            fVar.f2266d = true;
            addViewInLayout(view, i10, layoutParams);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto La
            goto L63
        La:
            if (r0 == 0) goto L64
            android.view.ViewParent r4 = r0.getParent()
        L10:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L1d
            if (r4 != r6) goto L18
            r4 = r1
            goto L1e
        L18:
            android.view.ViewParent r4 = r4.getParent()
            goto L10
        L1d:
            r4 = r2
        L1e:
            if (r4 != 0) goto L64
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
        L34:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L4d
            java.lang.String r5 = " => "
            r4.append(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
            goto L34
        L4d:
            java.lang.String r0 = "arrowScroll tried to find focus based on non-child current focused view "
            java.lang.StringBuilder r0 = androidx.activity.result.a.c(r0)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "ViewPager"
            android.util.Log.e(r4, r0)
        L63:
            r0 = r3
        L64:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto Lb0
            if (r3 == r0) goto Lb0
            if (r7 != r5) goto L8f
            android.graphics.Rect r1 = r6.f2253v
            android.graphics.Rect r1 = r6.g(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f2253v
            android.graphics.Rect r2 = r6.g(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto Laa
            if (r1 < r2) goto Laa
            boolean r0 = r6.m()
            goto Lae
        L8f:
            if (r7 != r4) goto Lc3
            android.graphics.Rect r1 = r6.f2253v
            android.graphics.Rect r1 = r6.g(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f2253v
            android.graphics.Rect r2 = r6.g(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto Laa
            if (r1 > r2) goto Laa
            boolean r0 = r6.n()
            goto Lae
        Laa:
            boolean r0 = r3.requestFocus()
        Lae:
            r2 = r0
            goto Lc3
        Lb0:
            if (r7 == r5) goto Lbf
            if (r7 != r1) goto Lb5
            goto Lbf
        Lb5:
            if (r7 == r4) goto Lba
            r0 = 2
            if (r7 != r0) goto Lc3
        Lba:
            boolean r2 = r6.n()
            goto Lc3
        Lbf:
            boolean r2 = r6.m()
        Lc3:
            if (r2 == 0) goto Lcc
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        Lcc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.b(int):boolean");
    }

    public final boolean c(View view, boolean z10, int i10, int i11, int i12) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && c(childAt, true, i10, i14 - childAt.getLeft(), i13 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z10 && view.canScrollHorizontally(-i10);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i10) {
        if (this.f2254w == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i10 < 0 ? scrollX > ((int) (((float) clientWidth) * this.H)) : i10 > 0 && scrollX < ((int) (((float) clientWidth) * this.I));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.B = true;
        if (!this.A.isFinished() && this.A.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.A.getCurrX();
            int currY = this.A.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!o(currX)) {
                    this.A.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            z.d.k(this);
            return;
        }
        d(true);
    }

    public final void d(boolean z10) {
        boolean z11 = this.f2249o0 == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.A.isFinished()) {
                this.A.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.A.getCurrX();
                int currY = this.A.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        o(currX);
                    }
                }
            }
        }
        this.M = false;
        for (int i10 = 0; i10 < this.f2251t.size(); i10++) {
            e eVar = this.f2251t.get(i10);
            if (eVar.f2260c) {
                eVar.f2260c = false;
                z11 = true;
            }
        }
        if (z11) {
            if (z10) {
                c cVar = this.f2248n0;
                WeakHashMap<View, f0> weakHashMap = z.f5921a;
                z.d.m(this, cVar);
                return;
            }
            this.f2248n0.run();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L59
            int r0 = r6.getAction()
            if (r0 != 0) goto L56
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L44
            r3 = 22
            if (r0 == r3) goto L36
            r3 = 61
            if (r0 == r3) goto L20
            goto L56
        L20:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L2b
            boolean r6 = r5.b(r4)
            goto L57
        L2b:
            boolean r6 = r6.hasModifiers(r2)
            if (r6 == 0) goto L56
            boolean r6 = r5.b(r2)
            goto L57
        L36:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L41
            boolean r6 = r5.n()
            goto L57
        L41:
            r6 = 66
            goto L51
        L44:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L4f
            boolean r6 = r5.m()
            goto L57
        L4f:
            r6 = 17
        L51:
            boolean r6 = r5.b(r6)
            goto L57
        L56:
            r6 = r1
        L57:
            if (r6 == 0) goto L5a
        L59:
            r1 = r2
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        e h10;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (h10 = h(childAt)) != null && h10.f2259b == this.f2255x && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        s1.a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z10 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f2254w) != null && ((l) aVar).f4951c.length > 1)) {
            if (!this.f2241g0.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.H * width);
                this.f2241g0.setSize(height, width);
                z10 = false | this.f2241g0.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.f2242h0.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.I + 1.0f)) * width2);
                this.f2242h0.setSize(height2, width2);
                z10 |= this.f2242h0.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.f2241g0.finish();
            this.f2242h0.finish();
        }
        if (z10) {
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            z.d.k(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.E;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final void e() {
        int length = ((l) this.f2254w).f4951c.length;
        this.f2250s = length;
        boolean z10 = this.f2251t.size() < (this.N * 2) + 1 && this.f2251t.size() < length;
        int i10 = this.f2255x;
        for (int i11 = 0; i11 < this.f2251t.size(); i11++) {
            s1.a aVar = this.f2254w;
            View view = this.f2251t.get(i11).f2258a;
            Objects.requireNonNull(aVar);
        }
        Collections.sort(this.f2251t, f2233q0);
        if (z10) {
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                f fVar = (f) getChildAt(i12).getLayoutParams();
                if (!fVar.f2263a) {
                    fVar.f2265c = 0.0f;
                }
            }
            x(i10, false, true, 0);
            requestLayout();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<androidx.viewpager.widget.ViewPager$h>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List<androidx.viewpager.widget.ViewPager$h>, java.util.ArrayList] */
    public final void f(int i10) {
        h hVar = this.f2247m0;
        if (hVar != null) {
            hVar.c(i10);
        }
        ?? r02 = this.f2246l0;
        if (r02 != 0) {
            int size = r02.size();
            for (int i11 = 0; i11 < size; i11++) {
                h hVar2 = (h) this.f2246l0.get(i11);
                if (hVar2 != null) {
                    hVar2.c(i10);
                }
            }
        }
    }

    public final Rect g(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        while (true) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup) || parent == this) {
                break;
            }
            view = (ViewGroup) parent;
            rect.left = view.getLeft() + rect.left;
            rect.right = view.getRight() + rect.right;
            rect.top = view.getTop() + rect.top;
            rect.bottom = view.getBottom() + rect.bottom;
        }
        return rect;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public s1.a getAdapter() {
        return this.f2254w;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        throw null;
    }

    public int getCurrentItem() {
        return this.f2255x;
    }

    public int getOffscreenPageLimit() {
        return this.N;
    }

    public int getPageMargin() {
        return this.D;
    }

    public final e h(View view) {
        for (int i10 = 0; i10 < this.f2251t.size(); i10++) {
            e eVar = this.f2251t.get(i10);
            s1.a aVar = this.f2254w;
            View view2 = eVar.f2258a;
            Objects.requireNonNull((l) aVar);
            if (view == ((LinearLayout) view2)) {
                return eVar;
            }
        }
        return null;
    }

    public final e i() {
        int i10;
        int clientWidth = getClientWidth();
        float f10 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f11 = clientWidth > 0 ? this.D / clientWidth : 0.0f;
        e eVar = null;
        int i11 = 0;
        int i12 = -1;
        boolean z10 = true;
        float f12 = 0.0f;
        while (i11 < this.f2251t.size()) {
            e eVar2 = this.f2251t.get(i11);
            if (!z10 && eVar2.f2259b != (i10 = i12 + 1)) {
                eVar2 = this.f2252u;
                eVar2.f2262e = f10 + f12 + f11;
                eVar2.f2259b = i10;
                Objects.requireNonNull(this.f2254w);
                eVar2.f2261d = 1.0f;
                i11--;
            }
            f10 = eVar2.f2262e;
            float f13 = eVar2.f2261d + f10 + f11;
            if (!z10 && scrollX < f10) {
                return eVar;
            }
            if (scrollX < f13 || i11 == this.f2251t.size() - 1) {
                return eVar2;
            }
            i12 = eVar2.f2259b;
            f12 = eVar2.f2261d;
            i11++;
            z10 = false;
            eVar = eVar2;
        }
        return eVar;
    }

    public final e j(int i10) {
        for (int i11 = 0; i11 < this.f2251t.size(); i11++) {
            e eVar = this.f2251t.get(i11);
            if (eVar.f2259b == i10) {
                return eVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<androidx.viewpager.widget.ViewPager$h>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.List<androidx.viewpager.widget.ViewPager$h>, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(int r10, float r11, int r12) {
        /*
            r9 = this;
            int r10 = r9.f2245k0
            r11 = 1
            r12 = 0
            if (r10 <= 0) goto L6b
            int r10 = r9.getScrollX()
            int r0 = r9.getPaddingLeft()
            int r1 = r9.getPaddingRight()
            int r2 = r9.getWidth()
            int r3 = r9.getChildCount()
            r4 = r12
        L1b:
            if (r4 >= r3) goto L6b
            android.view.View r5 = r9.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            androidx.viewpager.widget.ViewPager$f r6 = (androidx.viewpager.widget.ViewPager.f) r6
            boolean r7 = r6.f2263a
            if (r7 != 0) goto L2c
            goto L68
        L2c:
            int r6 = r6.f2264b
            r6 = r6 & 7
            if (r6 == r11) goto L4d
            r7 = 3
            if (r6 == r7) goto L47
            r7 = 5
            if (r6 == r7) goto L3a
            r6 = r0
            goto L5c
        L3a:
            int r6 = r2 - r1
            int r7 = r5.getMeasuredWidth()
            int r6 = r6 - r7
            int r7 = r5.getMeasuredWidth()
            int r1 = r1 + r7
            goto L59
        L47:
            int r6 = r5.getWidth()
            int r6 = r6 + r0
            goto L5c
        L4d:
            int r6 = r5.getMeasuredWidth()
            int r6 = r2 - r6
            int r6 = r6 / 2
            int r6 = java.lang.Math.max(r6, r0)
        L59:
            r8 = r6
            r6 = r0
            r0 = r8
        L5c:
            int r0 = r0 + r10
            int r7 = r5.getLeft()
            int r0 = r0 - r7
            if (r0 == 0) goto L67
            r5.offsetLeftAndRight(r0)
        L67:
            r0 = r6
        L68:
            int r4 = r4 + 1
            goto L1b
        L6b:
            androidx.viewpager.widget.ViewPager$h r10 = r9.f2247m0
            if (r10 == 0) goto L72
            r10.b()
        L72:
            java.util.List<androidx.viewpager.widget.ViewPager$h> r10 = r9.f2246l0
            if (r10 == 0) goto L8c
            int r10 = r10.size()
        L7a:
            if (r12 >= r10) goto L8c
            java.util.List<androidx.viewpager.widget.ViewPager$h> r0 = r9.f2246l0
            java.lang.Object r0 = r0.get(r12)
            androidx.viewpager.widget.ViewPager$h r0 = (androidx.viewpager.widget.ViewPager.h) r0
            if (r0 == 0) goto L89
            r0.b()
        L89:
            int r12 = r12 + 1
            goto L7a
        L8c:
            r9.f2244j0 = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.k(int, float, int):void");
    }

    public final void l(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2235a0) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.T = motionEvent.getX(i10);
            this.f2235a0 = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f2236b0;
            if (velocityTracker == null) {
                return;
            }
            velocityTracker.clear();
        }
    }

    public final boolean m() {
        int i10 = this.f2255x;
        if (i10 > 0) {
            w(i10 - 1);
            return true;
        }
        return false;
    }

    public final boolean n() {
        int i10;
        s1.a aVar = this.f2254w;
        if (aVar == null || (i10 = this.f2255x) >= ((l) aVar).f4951c.length - 1) {
            return false;
        }
        w(i10 + 1);
        return true;
    }

    public final boolean o(int i10) {
        if (this.f2251t.size() == 0) {
            if (this.f2243i0) {
                return false;
            }
            this.f2244j0 = false;
            k(0, 0.0f, 0);
            if (!this.f2244j0) {
                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
            return false;
        }
        e i11 = i();
        int clientWidth = getClientWidth();
        int i12 = this.D;
        int i13 = clientWidth + i12;
        float f10 = clientWidth;
        int i14 = i11.f2259b;
        float f11 = ((i10 / f10) - i11.f2262e) / (i11.f2261d + (i12 / f10));
        this.f2244j0 = false;
        k(i14, f11, (int) (i13 * f11));
        if (!this.f2244j0) {
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2243i0 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f2248n0);
        Scroller scroller = this.A;
        if (scroller != null && !scroller.isFinished()) {
            this.A.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int i10;
        float f10;
        float f11;
        super.onDraw(canvas);
        if (this.D <= 0 || this.E == null || this.f2251t.size() <= 0 || this.f2254w == null) {
            return;
        }
        int scrollX = getScrollX();
        float width2 = getWidth();
        float f12 = this.D / width2;
        int i11 = 0;
        e eVar = this.f2251t.get(0);
        float f13 = eVar.f2262e;
        int size = this.f2251t.size();
        int i12 = eVar.f2259b;
        int i13 = this.f2251t.get(size - 1).f2259b;
        while (i12 < i13) {
            while (true) {
                i10 = eVar.f2259b;
                if (i12 <= i10 || i11 >= size) {
                    break;
                }
                i11++;
                eVar = this.f2251t.get(i11);
            }
            if (i12 == i10) {
                float f14 = eVar.f2262e;
                float f15 = eVar.f2261d;
                f10 = (f14 + f15) * width2;
                f13 = f14 + f15 + f12;
            } else {
                Objects.requireNonNull(this.f2254w);
                f10 = (f13 + 1.0f) * width2;
                f13 = 1.0f + f12 + f13;
            }
            if (this.D + f10 > scrollX) {
                f11 = f12;
                this.E.setBounds(Math.round(f10), this.F, Math.round(this.D + f10), this.G);
                this.E.draw(canvas);
            } else {
                f11 = f12;
            }
            if (f10 > scrollX + width) {
                return;
            }
            i12++;
            f12 = f11;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            u();
            return false;
        }
        if (action != 0) {
            if (this.O) {
                return true;
            }
            if (this.P) {
                return false;
            }
        }
        if (action == 0) {
            float x10 = motionEvent.getX();
            this.V = x10;
            this.T = x10;
            float y = motionEvent.getY();
            this.W = y;
            this.U = y;
            this.f2235a0 = motionEvent.getPointerId(0);
            this.P = false;
            this.B = true;
            this.A.computeScrollOffset();
            if (this.f2249o0 != 2 || Math.abs(this.A.getFinalX() - this.A.getCurrX()) <= this.f2240f0) {
                d(false);
                this.O = false;
            } else {
                this.A.abortAnimation();
                this.M = false;
                q();
                this.O = true;
                t();
                setScrollState(1);
            }
        } else if (action == 2) {
            int i10 = this.f2235a0;
            if (i10 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i10);
                float x11 = motionEvent.getX(findPointerIndex);
                float f10 = x11 - this.T;
                float abs = Math.abs(f10);
                float y3 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y3 - this.W);
                int i11 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                if (i11 != 0) {
                    float f11 = this.T;
                    if (!((f11 < ((float) this.R) && i11 > 0) || (f11 > ((float) (getWidth() - this.R)) && f10 < 0.0f)) && c(this, false, (int) f10, (int) x11, (int) y3)) {
                        this.T = x11;
                        this.U = y3;
                        this.P = true;
                        return false;
                    }
                }
                float f12 = this.S;
                if (abs > f12 && abs * 0.5f > abs2) {
                    this.O = true;
                    t();
                    setScrollState(1);
                    float f13 = this.V;
                    float f14 = this.S;
                    this.T = i11 > 0 ? f13 + f14 : f13 - f14;
                    this.U = y3;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > f12) {
                    this.P = true;
                }
                if (this.O && p(x11)) {
                    WeakHashMap<View, f0> weakHashMap = z.f5921a;
                    z.d.k(this);
                }
            }
        } else if (action == 6) {
            l(motionEvent);
        }
        if (this.f2236b0 == null) {
            this.f2236b0 = VelocityTracker.obtain();
        }
        this.f2236b0.addMovement(motionEvent);
        return this.O;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        f fVar;
        f fVar2;
        int i12;
        setMeasuredDimension(View.getDefaultSize(0, i10), View.getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.R = Math.min(measuredWidth / 10, this.Q);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            boolean z10 = true;
            int i14 = 1073741824;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8 && (fVar2 = (f) childAt.getLayoutParams()) != null && fVar2.f2263a) {
                int i15 = fVar2.f2264b;
                int i16 = i15 & 7;
                int i17 = i15 & 112;
                boolean z11 = i17 == 48 || i17 == 80;
                if (i16 != 3 && i16 != 5) {
                    z10 = false;
                }
                int i18 = Integer.MIN_VALUE;
                if (z11) {
                    i12 = Integer.MIN_VALUE;
                    i18 = 1073741824;
                } else {
                    i12 = z10 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i19 = ((ViewGroup.LayoutParams) fVar2).width;
                if (i19 != -2) {
                    if (i19 == -1) {
                        i19 = paddingLeft;
                    }
                    i18 = 1073741824;
                } else {
                    i19 = paddingLeft;
                }
                int i20 = ((ViewGroup.LayoutParams) fVar2).height;
                if (i20 == -2) {
                    i20 = measuredHeight;
                    i14 = i12;
                } else if (i20 == -1) {
                    i20 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19, i18), View.MeasureSpec.makeMeasureSpec(i20, i14));
                if (z11) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z10) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i13++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.J = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.K = true;
        q();
        this.K = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((fVar = (f) childAt2.getLayoutParams()) == null || !fVar.f2263a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * fVar.f2265c), 1073741824), this.J);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        e h10;
        int childCount = getChildCount();
        int i13 = -1;
        if ((i10 & 2) != 0) {
            i13 = childCount;
            i12 = 0;
            i11 = 1;
        } else {
            i12 = childCount - 1;
            i11 = -1;
        }
        while (i12 != i13) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() == 0 && (h10 = h(childAt)) != null && h10.f2259b == this.f2255x && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i12 += i11;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.f17592s);
        if (this.f2254w != null) {
            x(jVar.f2270u, false, true, 0);
            return;
        }
        this.y = jVar.f2270u;
        this.f2256z = jVar.f2271v;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        j jVar = new j(super.onSaveInstanceState());
        jVar.f2270u = this.f2255x;
        s1.a aVar = this.f2254w;
        if (aVar != null) {
            Objects.requireNonNull(aVar);
            jVar.f2271v = null;
        }
        return jVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.D;
            s(i10, i12, i14, i14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0197  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean p(float f10) {
        boolean z10;
        boolean z11;
        float f11 = this.T - f10;
        this.T = f10;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.H * clientWidth;
        float f13 = this.I * clientWidth;
        boolean z12 = false;
        e eVar = this.f2251t.get(0);
        ArrayList<e> arrayList = this.f2251t;
        e eVar2 = arrayList.get(arrayList.size() - 1);
        if (eVar.f2259b != 0) {
            f12 = eVar.f2262e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (eVar2.f2259b != ((l) this.f2254w).f4951c.length - 1) {
            f13 = eVar2.f2262e * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f12) {
            if (z10) {
                this.f2241g0.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z12 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z11) {
                this.f2242h0.onPull(Math.abs(scrollX - f13) / clientWidth);
                z12 = true;
            }
            scrollX = f13;
        }
        int i10 = (int) scrollX;
        this.T = (scrollX - i10) + this.T;
        scrollTo(i10, getScrollY());
        o(i10);
        return z12;
    }

    public final void q() {
        r(this.f2255x);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        if (r5 == r6) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b6, code lost:
        if (r6 >= 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c4, code lost:
        if (r6 >= 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d2, code lost:
        if (r6 >= 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d4, code lost:
        r7 = r14.f2251t.get(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00dd, code lost:
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0131, code lost:
        if (r9 < r14.f2251t.size()) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0145, code lost:
        if (r9 < r14.f2251t.size()) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0157, code lost:
        if (r9 < r14.f2251t.size()) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0159, code lost:
        r7 = r14.f2251t.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0162, code lost:
        r7 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(int r15) {
        /*
            Method dump skipped, instructions count: 863
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.r(int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.K) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final void s(int i10, int i11, int i12, int i13) {
        int min;
        if (i11 <= 0 || this.f2251t.isEmpty()) {
            e j3 = j(this.f2255x);
            min = (int) ((j3 != null ? Math.min(j3.f2262e, this.I) : 0.0f) * ((i10 - getPaddingLeft()) - getPaddingRight()));
            if (min == getScrollX()) {
                return;
            }
            d(false);
        } else if (!this.A.isFinished()) {
            this.A.setFinalX(getCurrentItem() * getClientWidth());
            return;
        } else {
            min = (int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12));
        }
        scrollTo(min, getScrollY());
    }

    public void setAdapter(s1.a aVar) {
        s1.a aVar2 = this.f2254w;
        if (aVar2 != null) {
            synchronized (aVar2) {
            }
            Objects.requireNonNull(this.f2254w);
            for (int i10 = 0; i10 < this.f2251t.size(); i10++) {
                e eVar = this.f2251t.get(i10);
                s1.a aVar3 = this.f2254w;
                int i11 = eVar.f2259b;
                aVar3.a(this, eVar.f2258a);
            }
            Objects.requireNonNull(this.f2254w);
            this.f2251t.clear();
            int i12 = 0;
            while (i12 < getChildCount()) {
                if (!((f) getChildAt(i12).getLayoutParams()).f2263a) {
                    removeViewAt(i12);
                    i12--;
                }
                i12++;
            }
            this.f2255x = 0;
            scrollTo(0, 0);
        }
        this.f2254w = aVar;
        this.f2250s = 0;
        if (aVar != null) {
            if (this.C == null) {
                this.C = new i();
            }
            synchronized (this.f2254w) {
            }
            this.M = false;
            boolean z10 = this.f2243i0;
            this.f2243i0 = true;
            s1.a aVar4 = this.f2254w;
            this.f2250s = ((l) aVar4).f4951c.length;
            if (this.y >= 0) {
                Objects.requireNonNull(aVar4);
                x(this.y, false, true, 0);
                this.y = -1;
                this.f2256z = null;
            } else if (!z10) {
                q();
            } else {
                requestLayout();
            }
        }
    }

    public void setCurrentItem(int i10) {
        this.M = false;
        x(i10, !this.f2243i0, false, 0);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i10 + " too small; defaulting to 1");
            i10 = 1;
        }
        if (i10 != this.N) {
            this.N = i10;
            q();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(h hVar) {
        this.f2247m0 = hVar;
    }

    public void setPageMargin(int i10) {
        int i11 = this.D;
        this.D = i10;
        int width = getWidth();
        s(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(int i10) {
        Context context = getContext();
        Object obj = c0.a.f2602a;
        setPageMarginDrawable(a.b.b(context, i10));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.E = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<androidx.viewpager.widget.ViewPager$h>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List<androidx.viewpager.widget.ViewPager$h>, java.util.ArrayList] */
    public void setScrollState(int i10) {
        if (this.f2249o0 == i10) {
            return;
        }
        this.f2249o0 = i10;
        h hVar = this.f2247m0;
        if (hVar != null) {
            hVar.a();
        }
        ?? r32 = this.f2246l0;
        if (r32 == 0) {
            return;
        }
        int size = r32.size();
        for (int i11 = 0; i11 < size; i11++) {
            h hVar2 = (h) this.f2246l0.get(i11);
            if (hVar2 != null) {
                hVar2.a();
            }
        }
    }

    public final void t() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public final boolean u() {
        this.f2235a0 = -1;
        this.O = false;
        this.P = false;
        VelocityTracker velocityTracker = this.f2236b0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2236b0 = null;
        }
        this.f2241g0.onRelease();
        this.f2242h0.onRelease();
        return this.f2241g0.isFinished() || this.f2242h0.isFinished();
    }

    public final void v(int i10, boolean z10, int i11, boolean z11) {
        int i12;
        int i13;
        e j3 = j(i10);
        int max = j3 != null ? (int) (Math.max(this.H, Math.min(j3.f2262e, this.I)) * getClientWidth()) : 0;
        if (!z10) {
            if (z11) {
                f(i10);
            }
            d(false);
            scrollTo(max, 0);
            o(max);
            return;
        }
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
        } else {
            Scroller scroller = this.A;
            if (scroller != null && !scroller.isFinished()) {
                i12 = this.B ? this.A.getCurrX() : this.A.getStartX();
                this.A.abortAnimation();
                setScrollingCacheEnabled(false);
            } else {
                i12 = getScrollX();
            }
            int i14 = i12;
            int scrollY = getScrollY();
            int i15 = max - i14;
            int i16 = 0 - scrollY;
            if (i15 == 0 && i16 == 0) {
                d(false);
                q();
                setScrollState(0);
            } else {
                setScrollingCacheEnabled(true);
                setScrollState(2);
                int clientWidth = getClientWidth();
                int i17 = clientWidth / 2;
                float f10 = clientWidth;
                float f11 = i17;
                float sin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i15) * 1.0f) / f10) - 0.5f) * 0.47123894f)) * f11) + f11;
                int abs = Math.abs(i11);
                if (abs > 0) {
                    i13 = Math.round(Math.abs(sin / abs) * 1000.0f) * 4;
                } else {
                    Objects.requireNonNull(this.f2254w);
                    i13 = (int) (((Math.abs(i15) / ((f10 * 1.0f) + this.D)) + 1.0f) * 100.0f);
                }
                int min = Math.min(i13, 600);
                this.B = false;
                this.A.startScroll(i14, scrollY, i15, i16, min);
                WeakHashMap<View, f0> weakHashMap = z.f5921a;
                z.d.k(this);
            }
        }
        if (!z11) {
            return;
        }
        f(i10);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.E;
    }

    public final void w(int i10) {
        this.M = false;
        x(i10, true, false, 0);
    }

    public final void x(int i10, boolean z10, boolean z11, int i11) {
        s1.a aVar = this.f2254w;
        boolean z12 = false;
        if (aVar == null || ((l) aVar).f4951c.length <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z11 || this.f2255x != i10 || this.f2251t.size() == 0) {
            if (i10 < 0) {
                i10 = 0;
            } else {
                s1.a aVar2 = this.f2254w;
                if (i10 >= ((l) aVar2).f4951c.length) {
                    i10 = ((l) aVar2).f4951c.length - 1;
                }
            }
            int i12 = this.N;
            int i13 = this.f2255x;
            if (i10 > i13 + i12 || i10 < i13 - i12) {
                for (int i14 = 0; i14 < this.f2251t.size(); i14++) {
                    this.f2251t.get(i14).f2260c = true;
                }
            }
            if (this.f2255x != i10) {
                z12 = true;
            }
            if (!this.f2243i0) {
                r(i10);
                v(i10, z10, i11, z12);
                return;
            }
            this.f2255x = i10;
            if (z12) {
                f(i10);
            }
            requestLayout();
        } else {
            setScrollingCacheEnabled(false);
        }
    }
}
