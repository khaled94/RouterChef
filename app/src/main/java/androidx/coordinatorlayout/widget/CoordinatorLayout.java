package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import c0.a;
import com.raouf.routerchef.R;
import f0.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import m0.f0;
import m0.l0;
import m0.n;
import m0.o;
import m0.p;
import m0.q;
import m0.z;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements n, o {
    public static final String L;
    public static final Class<?>[] M;
    public static final ThreadLocal<Map<String, Constructor<c>>> N;
    public static final Comparator<View> O;
    public static final l0.e P;
    public int[] A;
    public View B;
    public View C;
    public g D;
    public boolean E;
    public l0 F;
    public boolean G;
    public Drawable H;
    public ViewGroup.OnHierarchyChangeListener I;
    public a J;
    public boolean y;

    /* renamed from: z */
    public boolean f1239z;

    /* renamed from: s */
    public final List<View> f1233s = new ArrayList();

    /* renamed from: t */
    public final z.a f1234t = new z.a();

    /* renamed from: u */
    public final List<View> f1235u = new ArrayList();

    /* renamed from: v */
    public final List<View> f1236v = new ArrayList();

    /* renamed from: w */
    public final int[] f1237w = new int[2];

    /* renamed from: x */
    public final int[] f1238x = new int[2];
    public final p K = new p(this);

    /* loaded from: classes.dex */
    public class a implements q {
        public a() {
            CoordinatorLayout.this = r1;
        }

        @Override // m0.q
        public final l0 a(View view, l0 l0Var) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!l0.b.a(coordinatorLayout.F, l0Var)) {
                coordinatorLayout.F = l0Var;
                boolean z10 = true;
                boolean z11 = l0Var.f() > 0;
                coordinatorLayout.G = z11;
                if (z11 || coordinatorLayout.getBackground() != null) {
                    z10 = false;
                }
                coordinatorLayout.setWillNotDraw(z10);
                if (!l0Var.h()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = coordinatorLayout.getChildAt(i10);
                        WeakHashMap<View, f0> weakHashMap = z.f5921a;
                        if (z.d.b(childAt) && ((f) childAt.getLayoutParams()).f1242a != null && l0Var.h()) {
                            break;
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return l0Var;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        c getBehavior();
    }

    /* loaded from: classes.dex */
    public static abstract class c<V extends View> {
        public c() {
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public boolean a(View view) {
            return false;
        }

        public boolean b(View view, View view2) {
            return false;
        }

        public void c(f fVar) {
        }

        public boolean d(CoordinatorLayout coordinatorLayout, V v10, View view) {
            return false;
        }

        public void e(CoordinatorLayout coordinatorLayout, View view) {
        }

        public void f() {
        }

        public boolean g(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
            return false;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, V v10, int i10) {
            return false;
        }

        public boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
            return false;
        }

        public boolean j(View view) {
            return false;
        }

        public void k(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr, int i12) {
        }

        public void l(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
            iArr[0] = iArr[0] + i11;
            iArr[1] = iArr[1] + i12;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, V v10, Rect rect, boolean z10) {
            return false;
        }

        public void n(View view, Parcelable parcelable) {
        }

        public Parcelable o(View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11) {
            return false;
        }

        public void q(CoordinatorLayout coordinatorLayout, V v10, View view, int i10) {
        }

        public boolean r(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
            return false;
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* loaded from: classes.dex */
    public @interface d {
        Class<? extends c> value();
    }

    /* loaded from: classes.dex */
    public class e implements ViewGroup.OnHierarchyChangeListener {
        public e() {
            CoordinatorLayout.this = r1;
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.I;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.q(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.I;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class f extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public c f1242a;

        /* renamed from: b */
        public boolean f1243b;

        /* renamed from: c */
        public int f1244c;

        /* renamed from: d */
        public int f1245d;

        /* renamed from: e */
        public int f1246e;

        /* renamed from: f */
        public int f1247f;

        /* renamed from: g */
        public int f1248g;

        /* renamed from: h */
        public int f1249h;

        /* renamed from: i */
        public int f1250i;

        /* renamed from: j */
        public int f1251j;

        /* renamed from: k */
        public View f1252k;

        /* renamed from: l */
        public View f1253l;

        /* renamed from: m */
        public boolean f1254m;

        /* renamed from: n */
        public boolean f1255n;

        /* renamed from: o */
        public boolean f1256o;
        public boolean p;

        /* renamed from: q */
        public final Rect f1257q;

        public f() {
            super(-2, -2);
            this.f1243b = false;
            this.f1244c = 0;
            this.f1245d = 0;
            this.f1246e = -1;
            this.f1247f = -1;
            this.f1248g = 0;
            this.f1249h = 0;
            this.f1257q = new Rect();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            c cVar;
            this.f1243b = false;
            this.f1244c = 0;
            this.f1245d = 0;
            this.f1246e = -1;
            this.f1247f = -1;
            this.f1248g = 0;
            this.f1249h = 0;
            this.f1257q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.b.f3663t);
            this.f1244c = obtainStyledAttributes.getInteger(0, 0);
            this.f1247f = obtainStyledAttributes.getResourceId(1, -1);
            this.f1245d = obtainStyledAttributes.getInteger(2, 0);
            this.f1246e = obtainStyledAttributes.getInteger(6, -1);
            this.f1248g = obtainStyledAttributes.getInt(5, 0);
            this.f1249h = obtainStyledAttributes.getInt(4, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(3);
            this.f1243b = hasValue;
            if (hasValue) {
                String string = obtainStyledAttributes.getString(3);
                String str = CoordinatorLayout.L;
                if (TextUtils.isEmpty(string)) {
                    cVar = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.L;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<c>>> threadLocal = CoordinatorLayout.N;
                        Map<String, Constructor<c>> map = threadLocal.get();
                        if (map == null) {
                            map = new HashMap<>();
                            threadLocal.set(map);
                        }
                        Constructor<c> constructor = map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.M);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        cVar = constructor.newInstance(context, attributeSet);
                    } catch (Exception e10) {
                        throw new RuntimeException(d7.a.c("Could not inflate Behavior subclass ", string), e10);
                    }
                }
                this.f1242a = cVar;
            }
            obtainStyledAttributes.recycle();
            c cVar2 = this.f1242a;
            if (cVar2 != null) {
                cVar2.c(this);
            }
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1243b = false;
            this.f1244c = 0;
            this.f1245d = 0;
            this.f1246e = -1;
            this.f1247f = -1;
            this.f1248g = 0;
            this.f1249h = 0;
            this.f1257q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1243b = false;
            this.f1244c = 0;
            this.f1245d = 0;
            this.f1246e = -1;
            this.f1247f = -1;
            this.f1248g = 0;
            this.f1249h = 0;
            this.f1257q = new Rect();
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f1243b = false;
            this.f1244c = 0;
            this.f1245d = 0;
            this.f1246e = -1;
            this.f1247f = -1;
            this.f1248g = 0;
            this.f1249h = 0;
            this.f1257q = new Rect();
        }

        public final boolean a(int i10) {
            if (i10 != 0) {
                if (i10 == 1) {
                    return this.f1256o;
                }
                return false;
            }
            return this.f1255n;
        }

        public final void b(c cVar) {
            c cVar2 = this.f1242a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.f();
                }
                this.f1242a = cVar;
                this.f1243b = true;
                if (cVar == null) {
                    return;
                }
                cVar.c(this);
            }
        }

        public final void c(int i10, boolean z10) {
            if (i10 == 0) {
                this.f1255n = z10;
            } else if (i10 != 1) {
            } else {
                this.f1256o = z10;
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements ViewTreeObserver.OnPreDrawListener {
        public g() {
            CoordinatorLayout.this = r1;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            CoordinatorLayout.this.q(0);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class h extends s0.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: u */
        public SparseArray<Parcelable> f1259u;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<h> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new h[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f1259u = new SparseArray<>(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                this.f1259u.append(iArr[i10], readParcelableArray[i10]);
            }
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // s0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f17592s, i10);
            SparseArray<Parcelable> sparseArray = this.f1259u;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = this.f1259u.keyAt(i11);
                parcelableArr[i11] = this.f1259u.valueAt(i11);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }
    }

    /* loaded from: classes.dex */
    public static class i implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            float m10 = z.i.m(view);
            float m11 = z.i.m(view2);
            if (m10 > m11) {
                return -1;
            }
            return m10 < m11 ? 1 : 0;
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        L = r02 != null ? r02.getName() : null;
        O = new i();
        M = new Class[]{Context.class, AttributeSet.class};
        N = new ThreadLocal<>();
        P = new l0.f();
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        int[] iArr = d.b.f3662s;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.A = resources.getIntArray(resourceId);
            float f10 = resources.getDisplayMetrics().density;
            int length = this.A.length;
            for (int i10 = 0; i10 < length; i10++) {
                int[] iArr2 = this.A;
                iArr2[i10] = (int) (iArr2[i10] * f10);
            }
        }
        this.H = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        y();
        super.setOnHierarchyChangeListener(new e());
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        if (z.d.c(this) == 0) {
            z.d.s(this, 1);
        }
    }

    public static Rect a() {
        Rect rect = (Rect) P.a();
        return rect == null ? new Rect() : rect;
    }

    public final void b(f fVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(max, max2, i10 + max, i11 + max2);
    }

    public final void c(View view, boolean z10, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z10) {
            f(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    public final List<View> d(View view) {
        z.a aVar = this.f1234t;
        int i10 = ((r.g) aVar.f20886t).f17201u;
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < i10; i11++) {
            ArrayList arrayList2 = (ArrayList) ((r.g) aVar.f20886t).k(i11);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(((r.g) aVar.f20886t).h(i11));
            }
        }
        this.f1236v.clear();
        if (arrayList != null) {
            this.f1236v.addAll(arrayList);
        }
        return this.f1236v;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        c cVar = ((f) view.getLayoutParams()).f1242a;
        if (cVar != null) {
            Objects.requireNonNull(cVar);
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.H;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z10 = false | drawable.setState(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    public final List<View> e(View view) {
        List list = (List) ((r.g) this.f1234t.f20886t).getOrDefault(view, null);
        this.f1236v.clear();
        if (list != null) {
            this.f1236v.addAll(list);
        }
        return this.f1236v;
    }

    public final void f(View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = z.b.f20889a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = z.b.f20889a;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        z.b.a(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = z.b.f20890b;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final void g(int i10, Rect rect, Rect rect2, f fVar, int i11, int i12) {
        int i13;
        int i14 = fVar.f1244c;
        if (i14 == 0) {
            i14 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i14, i10);
        int i15 = fVar.f1245d;
        if ((i15 & 7) == 0) {
            i15 |= 8388611;
        }
        if ((i15 & 112) == 0) {
            i15 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i15, i10);
        int i16 = absoluteGravity & 7;
        int i17 = absoluteGravity & 112;
        int i18 = absoluteGravity2 & 7;
        int i19 = absoluteGravity2 & 112;
        if (i18 != 1) {
            i13 = i18 != 5 ? rect.left : rect.right;
        } else {
            i13 = rect.left + (rect.width() / 2);
        }
        int height = i19 != 16 ? i19 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i16 == 1) {
            i13 -= i11 / 2;
        } else if (i16 != 5) {
            i13 -= i11;
        }
        if (i17 == 16) {
            height -= i12 / 2;
        } else if (i17 != 80) {
            height -= i12;
        }
        rect2.set(i13, height, i11 + i13, i12 + height);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        u();
        return Collections.unmodifiableList(this.f1233s);
    }

    public final l0 getLastWindowInsets() {
        return this.F;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        p pVar = this.K;
        return pVar.f5916b | pVar.f5915a;
    }

    public Drawable getStatusBarBackground() {
        return this.H;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // m0.n
    public final void h(View view, View view2, int i10, int i11) {
        this.K.a(i10, i11);
        this.C = view2;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            Objects.requireNonNull((f) getChildAt(i12).getLayoutParams());
        }
    }

    @Override // m0.n
    public final void i(View view, int i10) {
        p pVar = this.K;
        if (i10 == 1) {
            pVar.f5916b = 0;
        } else {
            pVar.f5915a = 0;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.a(i10)) {
                c cVar = fVar.f1242a;
                if (cVar != null) {
                    cVar.q(this, childAt, view, i10);
                }
                fVar.c(i10, false);
                fVar.p = false;
            }
        }
        this.C = null;
    }

    @Override // m0.n
    public final void j(View view, int i10, int i11, int[] iArr, int i12) {
        c cVar;
        int childCount = getChildCount();
        boolean z10 = false;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i12) && (cVar = fVar.f1242a) != null) {
                    int[] iArr2 = this.f1237w;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.k(this, childAt, view, i10, i11, iArr2, i12);
                    int[] iArr3 = this.f1237w;
                    i13 = i10 > 0 ? Math.max(i13, iArr3[0]) : Math.min(i13, iArr3[0]);
                    int[] iArr4 = this.f1237w;
                    i14 = i11 > 0 ? Math.max(i14, iArr4[1]) : Math.min(i14, iArr4[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = i13;
        iArr[1] = i14;
        if (z10) {
            q(1);
        }
    }

    public final int k(int i10) {
        StringBuilder sb;
        int[] iArr = this.A;
        if (iArr == null) {
            sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i10);
        } else if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        } else {
            sb = new StringBuilder();
            sb.append("Keyline index ");
            sb.append(i10);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e("CoordinatorLayout", sb.toString());
        return 0;
    }

    public final f l(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f1243b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.b(behavior);
            } else {
                d dVar = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    dVar = (d) cls.getAnnotation(d.class);
                    if (dVar != null) {
                        break;
                    }
                }
                if (dVar != null) {
                    try {
                        fVar.b(dVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e10) {
                        StringBuilder c10 = androidx.activity.result.a.c("Default behavior class ");
                        c10.append(dVar.value().getName());
                        c10.append(" could not be instantiated. Did you forget a default constructor?");
                        Log.e("CoordinatorLayout", c10.toString(), e10);
                    }
                }
            }
            fVar.f1243b = true;
        }
        return fVar;
    }

    @Override // m0.o
    public final void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        c cVar;
        int childCount = getChildCount();
        boolean z10 = false;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(i14) && (cVar = fVar.f1242a) != null) {
                    int[] iArr2 = this.f1237w;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVar.l(this, childAt, i11, i12, i13, iArr2);
                    int[] iArr3 = this.f1237w;
                    i15 = i12 > 0 ? Math.max(i15, iArr3[0]) : Math.min(i15, iArr3[0]);
                    int[] iArr4 = this.f1237w;
                    i16 = i13 > 0 ? Math.max(i16, iArr4[1]) : Math.min(i16, iArr4[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i15;
        iArr[1] = iArr[1] + i16;
        if (z10) {
            q(1);
        }
    }

    @Override // m0.n
    public final void n(View view, int i10, int i11, int i12, int i13, int i14) {
        m(view, i10, i11, i12, i13, 0, this.f1238x);
    }

    @Override // m0.n
    public final boolean o(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVar = fVar.f1242a;
                if (cVar != null) {
                    boolean p = cVar.p(this, childAt, view, i10, i11);
                    z10 |= p;
                    fVar.c(i11, p);
                } else {
                    fVar.c(i11, false);
                }
            }
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v(false);
        if (this.E) {
            if (this.D == null) {
                this.D = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.D);
        }
        if (this.F == null) {
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            if (z.d.b(this)) {
                z.h.c(this);
            }
        }
        this.f1239z = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v(false);
        if (this.E && this.D != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.D);
        }
        View view = this.C;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f1239z = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.G || this.H == null) {
            return;
        }
        l0 l0Var = this.F;
        int f10 = l0Var != null ? l0Var.f() : 0;
        if (f10 <= 0) {
            return;
        }
        this.H.setBounds(0, 0, getWidth(), f10);
        this.H.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            v(true);
        }
        boolean t10 = t(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            v(true);
        }
        return t10;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        c cVar;
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        int d5 = z.e.d(this);
        int size = this.f1233s.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) this.f1233s.get(i14);
            if (view.getVisibility() != 8 && ((cVar = ((f) view.getLayoutParams()).f1242a) == null || !cVar.h(this, view, d5))) {
                r(view, d5);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0190, code lost:
        if (r0.i(r30, r19, r24, r20, r25) == false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0193  */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                ((f) childAt.getLayoutParams()).a(0);
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        c cVar;
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.a(0) && (cVar = fVar.f1242a) != null) {
                    z10 |= cVar.j(view);
                }
            }
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        j(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        m(view, i10, i11, i12, i13, 0, this.f1238x);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        h(view, view2, i10, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.f17592s);
        SparseArray<Parcelable> sparseArray = hVar.f1259u;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id = childAt.getId();
            c cVar = l(childAt).f1242a;
            if (id != -1 && cVar != null && (parcelable2 = sparseArray.get(id)) != null) {
                cVar.n(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable o10;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id = childAt.getId();
            c cVar = ((f) childAt.getLayoutParams()).f1242a;
            if (id != -1 && cVar != null && (o10 = cVar.o(childAt)) != null) {
                sparseArray.append(id, o10);
            }
        }
        hVar.f1259u = sparseArray;
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return o(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        i(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r3 != false) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.B
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.t(r1, r4)
            if (r3 == 0) goto L29
            goto L16
        L15:
            r3 = r5
        L16:
            android.view.View r6 = r0.B
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$f r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f1242a
            if (r6 == 0) goto L29
            android.view.View r7 = r0.B
            boolean r6 = r6.r(r0, r7, r1)
            goto L2a
        L29:
            r6 = r5
        L2a:
            android.view.View r7 = r0.B
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L52
            r1 = 3
            if (r2 != r1) goto L55
        L52:
            r0.v(r5)
        L55:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean p(View view, int i10, int i11) {
        Rect a10 = a();
        f(view, a10);
        try {
            return a10.contains(i10, i11);
        } finally {
            a10.setEmpty();
            P.b(a10);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    public final void q(int i10) {
        int i11;
        Rect rect;
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        int width;
        int i13;
        int i14;
        int i15;
        int height;
        int i16;
        int i17;
        int i18;
        Rect rect2;
        int i19;
        int i20;
        int i21;
        f fVar;
        c cVar;
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        int d5 = z.e.d(this);
        int size = this.f1233s.size();
        Rect a10 = a();
        Rect a11 = a();
        Rect a12 = a();
        int i22 = 0;
        int i23 = i10;
        while (i22 < size) {
            View view = (View) this.f1233s.get(i22);
            f fVar2 = (f) view.getLayoutParams();
            if (i23 == 0 && view.getVisibility() == 8) {
                i12 = size;
                rect = a12;
                i11 = i22;
            } else {
                int i24 = 0;
                while (i24 < i22) {
                    if (fVar2.f1253l == ((View) this.f1233s.get(i24))) {
                        f fVar3 = (f) view.getLayoutParams();
                        if (fVar3.f1252k != null) {
                            Rect a13 = a();
                            Rect a14 = a();
                            Rect a15 = a();
                            f(fVar3.f1252k, a13);
                            c(view, false, a14);
                            int measuredWidth = view.getMeasuredWidth();
                            i21 = size;
                            int measuredHeight = view.getMeasuredHeight();
                            i20 = i22;
                            i19 = i24;
                            rect2 = a12;
                            fVar = fVar2;
                            g(d5, a13, a15, fVar3, measuredWidth, measuredHeight);
                            boolean z13 = (a15.left == a14.left && a15.top == a14.top) ? false : true;
                            b(fVar3, a15, measuredWidth, measuredHeight);
                            int i25 = a15.left - a14.left;
                            int i26 = a15.top - a14.top;
                            if (i25 != 0) {
                                WeakHashMap<View, f0> weakHashMap2 = z.f5921a;
                                view.offsetLeftAndRight(i25);
                            }
                            if (i26 != 0) {
                                WeakHashMap<View, f0> weakHashMap3 = z.f5921a;
                                view.offsetTopAndBottom(i26);
                            }
                            if (z13 && (cVar = fVar3.f1242a) != null) {
                                cVar.d(this, view, fVar3.f1252k);
                            }
                            a13.setEmpty();
                            l0.e eVar = P;
                            eVar.b(a13);
                            a14.setEmpty();
                            eVar.b(a14);
                            a15.setEmpty();
                            eVar.b(a15);
                            i24 = i19 + 1;
                            fVar2 = fVar;
                            size = i21;
                            i22 = i20;
                            a12 = rect2;
                        }
                    }
                    i19 = i24;
                    i21 = size;
                    rect2 = a12;
                    i20 = i22;
                    fVar = fVar2;
                    i24 = i19 + 1;
                    fVar2 = fVar;
                    size = i21;
                    i22 = i20;
                    a12 = rect2;
                }
                int i27 = size;
                Rect rect3 = a12;
                i11 = i22;
                f fVar4 = fVar2;
                c(view, true, a11);
                if (fVar4.f1248g != 0 && !a11.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(fVar4.f1248g, d5);
                    int i28 = absoluteGravity & 112;
                    if (i28 == 48) {
                        a10.top = Math.max(a10.top, a11.bottom);
                    } else if (i28 == 80) {
                        a10.bottom = Math.max(a10.bottom, getHeight() - a11.top);
                    }
                    int i29 = absoluteGravity & 7;
                    if (i29 == 3) {
                        a10.left = Math.max(a10.left, a11.right);
                    } else if (i29 == 5) {
                        a10.right = Math.max(a10.right, getWidth() - a11.left);
                    }
                }
                if (fVar4.f1249h != 0 && view.getVisibility() == 0) {
                    WeakHashMap<View, f0> weakHashMap4 = z.f5921a;
                    if (z.g.c(view) && view.getWidth() > 0 && view.getHeight() > 0) {
                        f fVar5 = (f) view.getLayoutParams();
                        c cVar2 = fVar5.f1242a;
                        Rect a16 = a();
                        Rect a17 = a();
                        a17.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (cVar2 == null || !cVar2.a(view)) {
                            a16.set(a17);
                        } else if (!a17.contains(a16)) {
                            StringBuilder c10 = androidx.activity.result.a.c("Rect should be within the child's bounds. Rect:");
                            c10.append(a16.toShortString());
                            c10.append(" | Bounds:");
                            c10.append(a17.toShortString());
                            throw new IllegalArgumentException(c10.toString());
                        }
                        a17.setEmpty();
                        l0.e eVar2 = P;
                        eVar2.b(a17);
                        if (!a16.isEmpty()) {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(fVar5.f1249h, d5);
                            if ((absoluteGravity2 & 48) != 48 || (i17 = (a16.top - ((ViewGroup.MarginLayoutParams) fVar5).topMargin) - fVar5.f1251j) >= (i18 = a10.top)) {
                                z11 = false;
                            } else {
                                x(view, i18 - i17);
                                z11 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - a16.bottom) - ((ViewGroup.MarginLayoutParams) fVar5).bottomMargin) + fVar5.f1251j) < (i16 = a10.bottom)) {
                                x(view, height - i16);
                                z11 = true;
                            }
                            if (!z11) {
                                x(view, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i14 = (a16.left - ((ViewGroup.MarginLayoutParams) fVar5).leftMargin) - fVar5.f1250i) >= (i15 = a10.left)) {
                                z12 = false;
                            } else {
                                w(view, i15 - i14);
                                z12 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - a16.right) - ((ViewGroup.MarginLayoutParams) fVar5).rightMargin) + fVar5.f1250i) < (i13 = a10.right)) {
                                w(view, width - i13);
                                z12 = true;
                            }
                            if (!z12) {
                                w(view, 0);
                            }
                        }
                        a16.setEmpty();
                        eVar2.b(a16);
                    }
                }
                if (i10 != 2) {
                    rect = rect3;
                    rect.set(((f) view.getLayoutParams()).f1257q);
                    if (rect.equals(a11)) {
                        i12 = i27;
                        i23 = i10;
                    } else {
                        ((f) view.getLayoutParams()).f1257q.set(a11);
                    }
                } else {
                    rect = rect3;
                }
                i12 = i27;
                for (int i30 = i11 + 1; i30 < i12; i30++) {
                    View view2 = (View) this.f1233s.get(i30);
                    f fVar6 = (f) view2.getLayoutParams();
                    c cVar3 = fVar6.f1242a;
                    if (cVar3 != null && cVar3.b(view2, view)) {
                        if (i10 != 0 || !fVar6.p) {
                            if (i10 != 2) {
                                z10 = cVar3.d(this, view2, view);
                            } else {
                                cVar3.e(this, view);
                                z10 = true;
                            }
                            if (i10 == 1) {
                                fVar6.p = z10;
                            }
                        } else {
                            fVar6.p = false;
                        }
                    }
                }
                i23 = i10;
            }
            i22 = i11 + 1;
            size = i12;
            a12 = rect;
        }
        Rect rect4 = a12;
        a10.setEmpty();
        l0.e eVar3 = P;
        eVar3.b(a10);
        a11.setEmpty();
        eVar3.b(a11);
        rect4.setEmpty();
        eVar3.b(rect4);
    }

    public final void r(View view, int i10) {
        Rect a10;
        Rect a11;
        l0.e eVar;
        f fVar = (f) view.getLayoutParams();
        View view2 = fVar.f1252k;
        int i11 = 0;
        if (!(view2 == null && fVar.f1247f != -1)) {
            if (view2 != null) {
                a10 = a();
                a11 = a();
                try {
                    f(view2, a10);
                    f fVar2 = (f) view.getLayoutParams();
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    g(i10, a10, a11, fVar2, measuredWidth, measuredHeight);
                    b(fVar2, a11, measuredWidth, measuredHeight);
                    view.layout(a11.left, a11.top, a11.right, a11.bottom);
                    return;
                } finally {
                    a10.setEmpty();
                    eVar = P;
                    eVar.b(a10);
                    a11.setEmpty();
                    eVar.b(a11);
                }
            }
            int i12 = fVar.f1246e;
            if (i12 >= 0) {
                f fVar3 = (f) view.getLayoutParams();
                int i13 = fVar3.f1244c;
                if (i13 == 0) {
                    i13 = 8388661;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i13, i10);
                int i14 = absoluteGravity & 7;
                int i15 = absoluteGravity & 112;
                int width = getWidth();
                int height = getHeight();
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                if (i10 == 1) {
                    i12 = width - i12;
                }
                int k10 = k(i12) - measuredWidth2;
                if (i14 == 1) {
                    k10 += measuredWidth2 / 2;
                } else if (i14 == 5) {
                    k10 += measuredWidth2;
                }
                if (i15 == 16) {
                    i11 = 0 + (measuredHeight2 / 2);
                } else if (i15 == 80) {
                    i11 = measuredHeight2 + 0;
                }
                int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar3).leftMargin, Math.min(k10, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) fVar3).rightMargin));
                int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar3).topMargin, Math.min(i11, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) fVar3).bottomMargin));
                view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                return;
            }
            f fVar4 = (f) view.getLayoutParams();
            a10 = a();
            a10.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar4).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar4).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar4).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar4).bottomMargin);
            if (this.F != null) {
                WeakHashMap<View, f0> weakHashMap = z.f5921a;
                if (z.d.b(this) && !z.d.b(view)) {
                    a10.left = this.F.d() + a10.left;
                    a10.top = this.F.f() + a10.top;
                    a10.right -= this.F.e();
                    a10.bottom -= this.F.c();
                }
            }
            a11 = a();
            int i16 = fVar4.f1244c;
            if ((i16 & 7) == 0) {
                i16 |= 8388611;
            }
            if ((i16 & 112) == 0) {
                i16 |= 48;
            }
            m0.e.b(i16, view.getMeasuredWidth(), view.getMeasuredHeight(), a10, a11, i10);
            view.layout(a11.left, a11.top, a11.right, a11.bottom);
            return;
        }
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        c cVar = ((f) view.getLayoutParams()).f1242a;
        if (cVar == null || !cVar.m(this, view, rect, z10)) {
            return super.requestChildRectangleOnScreen(view, rect, z10);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (!z10 || this.y) {
            return;
        }
        v(false);
        this.y = true;
    }

    public final void s(View view, int i10, int i11, int i12) {
        measureChildWithMargins(view, i10, i11, i12, 0);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        y();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.I = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.H;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.H = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.H.setState(getDrawableState());
                }
                Drawable drawable4 = this.H;
                WeakHashMap<View, f0> weakHashMap = z.f5921a;
                a.c.b(drawable4, z.e.d(this));
                this.H.setVisible(getVisibility() == 0, false);
                this.H.setCallback(this);
            }
            WeakHashMap<View, f0> weakHashMap2 = z.f5921a;
            z.d.k(this);
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            Context context = getContext();
            Object obj = c0.a.f2602a;
            drawable = a.b.b(context, i10);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.H;
        if (drawable == null || drawable.isVisible() == z10) {
            return;
        }
        this.H.setVisible(z10, false);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List, java.util.List<android.view.View>, java.util.ArrayList] */
    public final boolean t(MotionEvent motionEvent, int i10) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        ?? r42 = this.f1235u;
        r42.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i11 = childCount - 1; i11 >= 0; i11--) {
            r42.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i11) : i11));
        }
        Comparator<View> comparator = O;
        if (comparator != null) {
            Collections.sort(r42, comparator);
        }
        int size = r42.size();
        MotionEvent motionEvent2 = null;
        boolean z11 = false;
        boolean z12 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) r42.get(i12);
            f fVar = (f) view.getLayoutParams();
            c cVar = fVar.f1242a;
            if (!(z11 || z12) || actionMasked == 0) {
                if (!z11 && cVar != null) {
                    if (i10 == 0) {
                        z11 = cVar.g(this, view, motionEvent);
                    } else if (i10 == 1) {
                        z11 = cVar.r(this, view, motionEvent);
                    }
                    if (z11) {
                        this.B = view;
                    }
                }
                if (fVar.f1242a == null) {
                    fVar.f1254m = false;
                }
                boolean z13 = fVar.f1254m;
                if (z13) {
                    z10 = true;
                } else {
                    z10 = z13 | false;
                    fVar.f1254m = z10;
                }
                z12 = z10 && !z13;
                if (z10 && !z12) {
                    break;
                }
            } else if (cVar != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i10 == 0) {
                    cVar.g(this, view, motionEvent2);
                } else if (i10 == 1) {
                    cVar.r(this, view, motionEvent2);
                }
            }
        }
        r42.clear();
        return z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
        if (r5 != false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0184 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011f  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u() {
        /*
            Method dump skipped, instructions count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.u():void");
    }

    public final void v(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            c cVar = ((f) childAt.getLayoutParams()).f1242a;
            if (cVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z10) {
                    cVar.g(this, childAt, obtain);
                } else {
                    cVar.r(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((f) getChildAt(i11).getLayoutParams()).f1254m = false;
        }
        this.B = null;
        this.y = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.H;
    }

    public final void w(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f1250i;
        if (i11 != i10) {
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            view.offsetLeftAndRight(i10 - i11);
            fVar.f1250i = i10;
        }
    }

    public final void x(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f1251j;
        if (i11 != i10) {
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            view.offsetTopAndBottom(i10 - i11);
            fVar.f1251j = i10;
        }
    }

    public final void y() {
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        if (z.d.b(this)) {
            if (this.J == null) {
                this.J = new a();
            }
            z.i.u(this, this.J);
            setSystemUiVisibility(1280);
            return;
        }
        z.i.u(this, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f ? new f((f) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }
}
