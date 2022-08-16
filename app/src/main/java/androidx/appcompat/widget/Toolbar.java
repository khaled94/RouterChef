package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.widget.ActionMenuView;
import com.raouf.routerchef.R;
import e.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import m0.f0;
import m0.h;
import m0.i;
import m0.k;
import m0.z;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements h {
    public View A;
    public Context B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public x0 L;
    public int M;
    public int N;
    public int O;
    public CharSequence P;
    public CharSequence Q;
    public ColorStateList R;
    public ColorStateList S;
    public boolean T;
    public boolean U;
    public final ArrayList<View> V;
    public final ArrayList<View> W;

    /* renamed from: a0 */
    public final int[] f732a0;

    /* renamed from: b0 */
    public final i f733b0;

    /* renamed from: c0 */
    public ArrayList<MenuItem> f734c0;

    /* renamed from: d0 */
    public f f735d0;

    /* renamed from: e0 */
    public final a f736e0;

    /* renamed from: f0 */
    public i1 f737f0;

    /* renamed from: g0 */
    public androidx.appcompat.widget.c f738g0;

    /* renamed from: h0 */
    public d f739h0;

    /* renamed from: i0 */
    public boolean f740i0;

    /* renamed from: j0 */
    public final b f741j0;

    /* renamed from: s */
    public ActionMenuView f742s;

    /* renamed from: t */
    public h0 f743t;

    /* renamed from: u */
    public h0 f744u;

    /* renamed from: v */
    public q f745v;

    /* renamed from: w */
    public s f746w;

    /* renamed from: x */
    public Drawable f747x;
    public CharSequence y;

    /* renamed from: z */
    public q f748z;

    /* loaded from: classes.dex */
    public class a implements ActionMenuView.e {
        public a() {
            Toolbar.this = r1;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
            Toolbar.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Toolbar.this.x();
        }
    }

    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
            Toolbar.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            d dVar = Toolbar.this.f739h0;
            androidx.appcompat.view.menu.g gVar = dVar == null ? null : dVar.f753t;
            if (gVar != null) {
                gVar.collapseActionView();
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements androidx.appcompat.view.menu.i {

        /* renamed from: s */
        public androidx.appcompat.view.menu.e f752s;

        /* renamed from: t */
        public androidx.appcompat.view.menu.g f753t;

        public d() {
            Toolbar.this = r1;
        }

        @Override // androidx.appcompat.view.menu.i
        public final void a(androidx.appcompat.view.menu.e eVar, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.i
        public final boolean c(androidx.appcompat.view.menu.g gVar) {
            View view = Toolbar.this.A;
            if (view instanceof j.b) {
                ((j.b) view).d();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.A);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f748z);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.A = null;
            int size = toolbar3.W.size();
            while (true) {
                size--;
                if (size < 0) {
                    toolbar3.W.clear();
                    this.f753t = null;
                    Toolbar.this.requestLayout();
                    gVar.C = false;
                    gVar.f590n.r(false);
                    return true;
                }
                toolbar3.addView(toolbar3.W.get(size));
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public final void e(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.f752s;
            if (eVar2 != null && (gVar = this.f753t) != null) {
                eVar2.e(gVar);
            }
            this.f752s = eVar;
        }

        @Override // androidx.appcompat.view.menu.i
        public final void f() {
            if (this.f753t != null) {
                androidx.appcompat.view.menu.e eVar = this.f752s;
                boolean z10 = false;
                if (eVar != null) {
                    int size = eVar.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            break;
                        } else if (this.f752s.getItem(i10) == this.f753t) {
                            z10 = true;
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                if (z10) {
                    return;
                }
                c(this.f753t);
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public final boolean h(l lVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.i
        public final boolean i() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.i
        public final boolean k(androidx.appcompat.view.menu.g gVar) {
            Toolbar.this.c();
            ViewParent parent = Toolbar.this.f748z.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f748z);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f748z);
            }
            Toolbar.this.A = gVar.getActionView();
            this.f753t = gVar;
            ViewParent parent2 = Toolbar.this.A.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.A);
                }
                Objects.requireNonNull(Toolbar.this);
                e eVar = new e();
                Toolbar toolbar4 = Toolbar.this;
                eVar.f4176a = 8388611 | (toolbar4.F & 112);
                eVar.f755b = 2;
                toolbar4.A.setLayoutParams(eVar);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.A);
            }
            Toolbar toolbar6 = Toolbar.this;
            int childCount = toolbar6.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar6.getChildAt(childCount);
                if (((e) childAt.getLayoutParams()).f755b != 2 && childAt != toolbar6.f742s) {
                    toolbar6.removeViewAt(childCount);
                    toolbar6.W.add(childAt);
                }
            }
            Toolbar.this.requestLayout();
            gVar.C = true;
            gVar.f590n.r(false);
            View view = Toolbar.this.A;
            if (view instanceof j.b) {
                ((j.b) view).c();
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class e extends a.C0061a {

        /* renamed from: b */
        public int f755b;

        public e() {
            this.f755b = 0;
            this.f4176a = 8388627;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f755b = 0;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f755b = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f755b = 0;
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public e(e eVar) {
            super((a.C0061a) eVar);
            this.f755b = 0;
            this.f755b = eVar.f755b;
        }

        public e(a.C0061a c0061a) {
            super(c0061a);
            this.f755b = 0;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        boolean a();
    }

    /* loaded from: classes.dex */
    public static class g extends s0.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: u */
        public int f756u;

        /* renamed from: v */
        public boolean f757v;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<g> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new g[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f756u = parcel.readInt();
            this.f757v = parcel.readInt() != 0;
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // s0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f17592s, i10);
            parcel.writeInt(this.f756u);
            parcel.writeInt(this.f757v ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.O = 8388627;
        this.V = new ArrayList<>();
        this.W = new ArrayList<>();
        this.f732a0 = new int[2];
        this.f733b0 = new i(new g1(this, 0));
        this.f734c0 = new ArrayList<>();
        this.f736e0 = new a();
        this.f741j0 = new b();
        Context context2 = getContext();
        int[] iArr = a6.f.Q;
        f1 q10 = f1.q(context2, attributeSet, iArr, R.attr.toolbarStyle);
        z.o(this, context, iArr, attributeSet, q10.f848b, R.attr.toolbarStyle);
        this.D = q10.l(28, 0);
        this.E = q10.l(19, 0);
        this.O = q10.f848b.getInteger(0, this.O);
        this.F = q10.f848b.getInteger(2, 48);
        int e10 = q10.e(22, 0);
        e10 = q10.o(27) ? q10.e(27, e10) : e10;
        this.K = e10;
        this.J = e10;
        this.I = e10;
        this.H = e10;
        int e11 = q10.e(25, -1);
        if (e11 >= 0) {
            this.H = e11;
        }
        int e12 = q10.e(24, -1);
        if (e12 >= 0) {
            this.I = e12;
        }
        int e13 = q10.e(26, -1);
        if (e13 >= 0) {
            this.J = e13;
        }
        int e14 = q10.e(23, -1);
        if (e14 >= 0) {
            this.K = e14;
        }
        this.G = q10.f(13, -1);
        int e15 = q10.e(9, Integer.MIN_VALUE);
        int e16 = q10.e(5, Integer.MIN_VALUE);
        int f10 = q10.f(7, 0);
        int f11 = q10.f(8, 0);
        d();
        x0 x0Var = this.L;
        x0Var.f1043h = false;
        if (f10 != Integer.MIN_VALUE) {
            x0Var.f1040e = f10;
            x0Var.f1036a = f10;
        }
        if (f11 != Integer.MIN_VALUE) {
            x0Var.f1041f = f11;
            x0Var.f1037b = f11;
        }
        if (e15 != Integer.MIN_VALUE || e16 != Integer.MIN_VALUE) {
            x0Var.a(e15, e16);
        }
        this.M = q10.e(10, Integer.MIN_VALUE);
        this.N = q10.e(6, Integer.MIN_VALUE);
        this.f747x = q10.g(4);
        this.y = q10.n(3);
        CharSequence n10 = q10.n(21);
        if (!TextUtils.isEmpty(n10)) {
            setTitle(n10);
        }
        CharSequence n11 = q10.n(18);
        if (!TextUtils.isEmpty(n11)) {
            setSubtitle(n11);
        }
        this.B = getContext();
        setPopupTheme(q10.l(17, 0));
        Drawable g10 = q10.g(16);
        if (g10 != null) {
            setNavigationIcon(g10);
        }
        CharSequence n12 = q10.n(15);
        if (!TextUtils.isEmpty(n12)) {
            setNavigationContentDescription(n12);
        }
        Drawable g11 = q10.g(11);
        if (g11 != null) {
            setLogo(g11);
        }
        CharSequence n13 = q10.n(12);
        if (!TextUtils.isEmpty(n13)) {
            setLogoDescription(n13);
        }
        if (q10.o(29)) {
            setTitleTextColor(q10.c(29));
        }
        if (q10.o(20)) {
            setSubtitleTextColor(q10.c(20));
        }
        if (q10.o(14)) {
            getMenuInflater().inflate(q10.l(14, 0), getMenu());
        }
        q10.r();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new j.f(getContext());
    }

    @Override // m0.h
    public final void B(k kVar) {
        this.f733b0.c(kVar);
    }

    public final void a(List<View> list, int i10) {
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        boolean z10 = z.e.d(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, z.e.d(this));
        list.clear();
        if (!z10) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f755b == 0 && w(childAt) && k(eVar.f4176a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f755b == 0 && w(childAt2) && k(eVar2.f4176a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    public final void b(View view, boolean z10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        e generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (e) layoutParams;
        generateDefaultLayoutParams.f755b = 1;
        if (!z10 || this.A == null) {
            addView(view, generateDefaultLayoutParams);
            return;
        }
        view.setLayoutParams(generateDefaultLayoutParams);
        this.W.add(view);
    }

    public final void c() {
        if (this.f748z == null) {
            q qVar = new q(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f748z = qVar;
            qVar.setImageDrawable(this.f747x);
            this.f748z.setContentDescription(this.y);
            e eVar = new e();
            eVar.f4176a = 8388611 | (this.F & 112);
            eVar.f755b = 2;
            this.f748z.setLayoutParams(eVar);
            this.f748z.setOnClickListener(new c());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public final void d() {
        if (this.L == null) {
            this.L = new x0();
        }
    }

    @Override // m0.h
    public final void e(k kVar) {
        i iVar = this.f733b0;
        iVar.f5878b.add(kVar);
        iVar.f5877a.run();
    }

    public final void f() {
        g();
        ActionMenuView actionMenuView = this.f742s;
        if (actionMenuView.H == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) actionMenuView.getMenu();
            if (this.f739h0 == null) {
                this.f739h0 = new d();
            }
            this.f742s.setExpandedActionViewsExclusive(true);
            eVar.c(this.f739h0, this.B);
        }
    }

    public final void g() {
        if (this.f742s == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f742s = actionMenuView;
            actionMenuView.setPopupTheme(this.C);
            this.f742s.setOnMenuItemClickListener(this.f736e0);
            ActionMenuView actionMenuView2 = this.f742s;
            actionMenuView2.M = null;
            actionMenuView2.N = null;
            e eVar = new e();
            eVar.f4176a = 8388613 | (this.F & 112);
            this.f742s.setLayoutParams(eVar);
            b(this.f742s, false);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public CharSequence getCollapseContentDescription() {
        q qVar = this.f748z;
        if (qVar != null) {
            return qVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        q qVar = this.f748z;
        if (qVar != null) {
            return qVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        x0 x0Var = this.L;
        if (x0Var != null) {
            return x0Var.f1042g ? x0Var.f1036a : x0Var.f1037b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.N;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        x0 x0Var = this.L;
        if (x0Var != null) {
            return x0Var.f1036a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        x0 x0Var = this.L;
        if (x0Var != null) {
            return x0Var.f1037b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        x0 x0Var = this.L;
        if (x0Var != null) {
            return x0Var.f1042g ? x0Var.f1037b : x0Var.f1036a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.M;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.e eVar;
        ActionMenuView actionMenuView = this.f742s;
        return actionMenuView != null && (eVar = actionMenuView.H) != null && eVar.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.N, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        return z.e.d(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        return z.e.d(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.M, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        s sVar = this.f746w;
        if (sVar != null) {
            return sVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        s sVar = this.f746w;
        if (sVar != null) {
            return sVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        f();
        return this.f742s.getMenu();
    }

    public View getNavButtonView() {
        return this.f745v;
    }

    public CharSequence getNavigationContentDescription() {
        q qVar = this.f745v;
        if (qVar != null) {
            return qVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        q qVar = this.f745v;
        if (qVar != null) {
            return qVar.getDrawable();
        }
        return null;
    }

    public androidx.appcompat.widget.c getOuterActionMenuPresenter() {
        return this.f738g0;
    }

    public Drawable getOverflowIcon() {
        f();
        return this.f742s.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.B;
    }

    public int getPopupTheme() {
        return this.C;
    }

    public CharSequence getSubtitle() {
        return this.Q;
    }

    public final TextView getSubtitleTextView() {
        return this.f744u;
    }

    public CharSequence getTitle() {
        return this.P;
    }

    public int getTitleMarginBottom() {
        return this.K;
    }

    public int getTitleMarginEnd() {
        return this.I;
    }

    public int getTitleMarginStart() {
        return this.H;
    }

    public int getTitleMarginTop() {
        return this.J;
    }

    public final TextView getTitleTextView() {
        return this.f743t;
    }

    public l0 getWrapper() {
        if (this.f737f0 == null) {
            this.f737f0 = new i1(this);
        }
        return this.f737f0;
    }

    public final void h() {
        if (this.f745v == null) {
            this.f745v = new q(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            e eVar = new e();
            eVar.f4176a = 8388611 | (this.F & 112);
            this.f745v.setLayoutParams(eVar);
        }
    }

    /* renamed from: i */
    public final e generateDefaultLayoutParams() {
        return new e();
    }

    /* renamed from: j */
    public final e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof a.C0061a ? new e((a.C0061a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public final int k(int i10) {
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        int d5 = z.e.d(this);
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, d5) & 7;
        return (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) ? absoluteGravity : d5 == 1 ? 5 : 3;
    }

    public final int l(View view, int i10) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int i12 = eVar.f4176a & 112;
        if (i12 != 16 && i12 != 48 && i12 != 80) {
            i12 = this.O & 112;
        }
        if (i12 != 48) {
            if (i12 == 80) {
                return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - i11;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int height = getHeight();
            int i13 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
            int i14 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
            if (i13 < i14) {
                i13 = i14;
            } else {
                int i15 = (((height - paddingBottom) - measuredHeight) - i13) - paddingTop;
                int i16 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                if (i15 < i16) {
                    i13 = Math.max(0, i13 - (i16 - i15));
                }
            }
            return paddingTop + i13;
        }
        return getPaddingTop() - i11;
    }

    public final int m(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return m0.g.b(marginLayoutParams) + m0.g.c(marginLayoutParams);
    }

    public final int n(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void o(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f741j0);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.U = false;
        }
        if (!this.U) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.U = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.U = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x028a A[LOOP:0: B:106:0x0288->B:107:0x028a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02ac A[LOOP:1: B:109:0x02aa->B:110:0x02ac, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02d1 A[LOOP:2: B:112:0x02cf->B:113:0x02d1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0326 A[LOOP:3: B:120:0x0324->B:121:0x0326, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0213  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r21, int r22, int r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 827
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0284  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.f17592s);
        ActionMenuView actionMenuView = this.f742s;
        androidx.appcompat.view.menu.e eVar = actionMenuView != null ? actionMenuView.H : null;
        int i10 = gVar.f756u;
        if (i10 != 0 && this.f739h0 != null && eVar != null && (findItem = eVar.findItem(i10)) != null) {
            findItem.expandActionView();
        }
        if (!gVar.f757v) {
            return;
        }
        removeCallbacks(this.f741j0);
        post(this.f741j0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
        if (r1 != Integer.MIN_VALUE) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
        if (r1 != Integer.MIN_VALUE) goto L23;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onRtlPropertiesChanged(int r3) {
        /*
            r2 = this;
            super.onRtlPropertiesChanged(r3)
            r2.d()
            androidx.appcompat.widget.x0 r0 = r2.L
            r1 = 1
            if (r3 != r1) goto Lc
            goto Ld
        Lc:
            r1 = 0
        Ld:
            boolean r3 = r0.f1042g
            if (r1 != r3) goto L12
            goto L40
        L12:
            r0.f1042g = r1
            boolean r3 = r0.f1043h
            if (r3 == 0) goto L38
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L2a
            int r1 = r0.f1039d
            if (r1 == r3) goto L21
            goto L23
        L21:
            int r1 = r0.f1040e
        L23:
            r0.f1036a = r1
            int r1 = r0.f1038c
            if (r1 == r3) goto L3c
            goto L3e
        L2a:
            int r1 = r0.f1038c
            if (r1 == r3) goto L2f
            goto L31
        L2f:
            int r1 = r0.f1040e
        L31:
            r0.f1036a = r1
            int r1 = r0.f1039d
            if (r1 == r3) goto L3c
            goto L3e
        L38:
            int r3 = r0.f1040e
            r0.f1036a = r3
        L3c:
            int r1 = r0.f1041f
        L3e:
            r0.f1037b = r1
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onRtlPropertiesChanged(int):void");
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.g gVar;
        g gVar2 = new g(super.onSaveInstanceState());
        d dVar = this.f739h0;
        if (dVar != null && (gVar = dVar.f753t) != null) {
            gVar2.f756u = gVar.f577a;
        }
        gVar2.f757v = r();
        return gVar2;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.T = false;
        }
        if (!this.T) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.T = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.T = false;
        }
        return true;
    }

    public final void p() {
        Iterator<MenuItem> it = this.f734c0.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.f733b0.a(getMenu(), getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f734c0 = currentMenuItems2;
    }

    public final boolean q(View view) {
        return view.getParent() == this || this.W.contains(view);
    }

    public final boolean r() {
        ActionMenuView actionMenuView = this.f742s;
        if (actionMenuView != null) {
            androidx.appcompat.widget.c cVar = actionMenuView.L;
            if (cVar != null && cVar.l()) {
                return true;
            }
        }
        return false;
    }

    public final int s(View view, int i10, int[] iArr, int i11) {
        e eVar = (e) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - iArr[0];
        int max = Math.max(0, i12) + i10;
        iArr[0] = Math.max(0, -i12);
        int l10 = l(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, l10, max + measuredWidth, view.getMeasuredHeight() + l10);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin + max;
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        q qVar = this.f748z;
        if (qVar != null) {
            qVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(f.a.b(getContext(), i10));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f748z.setImageDrawable(drawable);
            return;
        }
        q qVar = this.f748z;
        if (qVar == null) {
            return;
        }
        qVar.setImageDrawable(this.f747x);
    }

    public void setCollapsible(boolean z10) {
        this.f740i0 = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.N) {
            this.N = i10;
            if (getNavigationIcon() == null) {
                return;
            }
            requestLayout();
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.M) {
            this.M = i10;
            if (getNavigationIcon() == null) {
                return;
            }
            requestLayout();
        }
    }

    public void setLogo(int i10) {
        setLogo(f.a.b(getContext(), i10));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f746w == null) {
                this.f746w = new s(getContext(), null, 0);
            }
            if (!q(this.f746w)) {
                b(this.f746w, true);
            }
        } else {
            s sVar = this.f746w;
            if (sVar != null && q(sVar)) {
                removeView(this.f746w);
                this.W.remove(this.f746w);
            }
        }
        s sVar2 = this.f746w;
        if (sVar2 != null) {
            sVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f746w == null) {
            this.f746w = new s(getContext(), null, 0);
        }
        s sVar = this.f746w;
        if (sVar != null) {
            sVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            h();
        }
        q qVar = this.f745v;
        if (qVar != null) {
            qVar.setContentDescription(charSequence);
            j1.a(this.f745v, charSequence);
        }
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(f.a.b(getContext(), i10));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            h();
            if (!q(this.f745v)) {
                b(this.f745v, true);
            }
        } else {
            q qVar = this.f745v;
            if (qVar != null && q(qVar)) {
                removeView(this.f745v);
                this.W.remove(this.f745v);
            }
        }
        q qVar2 = this.f745v;
        if (qVar2 != null) {
            qVar2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        h();
        this.f745v.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.f735d0 = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        f();
        this.f742s.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.C != i10) {
            this.C = i10;
            if (i10 == 0) {
                this.B = getContext();
            } else {
                this.B = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f744u == null) {
                Context context = getContext();
                h0 h0Var = new h0(context, null);
                this.f744u = h0Var;
                h0Var.setSingleLine();
                this.f744u.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.E;
                if (i10 != 0) {
                    this.f744u.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.S;
                if (colorStateList != null) {
                    this.f744u.setTextColor(colorStateList);
                }
            }
            if (!q(this.f744u)) {
                b(this.f744u, true);
            }
        } else {
            h0 h0Var2 = this.f744u;
            if (h0Var2 != null && q(h0Var2)) {
                removeView(this.f744u);
                this.W.remove(this.f744u);
            }
        }
        h0 h0Var3 = this.f744u;
        if (h0Var3 != null) {
            h0Var3.setText(charSequence);
        }
        this.Q = charSequence;
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.S = colorStateList;
        h0 h0Var = this.f744u;
        if (h0Var != null) {
            h0Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f743t == null) {
                Context context = getContext();
                h0 h0Var = new h0(context, null);
                this.f743t = h0Var;
                h0Var.setSingleLine();
                this.f743t.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.D;
                if (i10 != 0) {
                    this.f743t.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.R;
                if (colorStateList != null) {
                    this.f743t.setTextColor(colorStateList);
                }
            }
            if (!q(this.f743t)) {
                b(this.f743t, true);
            }
        } else {
            h0 h0Var2 = this.f743t;
            if (h0Var2 != null && q(h0Var2)) {
                removeView(this.f743t);
                this.W.remove(this.f743t);
            }
        }
        h0 h0Var3 = this.f743t;
        if (h0Var3 != null) {
            h0Var3.setText(charSequence);
        }
        this.P = charSequence;
    }

    public void setTitleMarginBottom(int i10) {
        this.K = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.I = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.H = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.J = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.R = colorStateList;
        h0 h0Var = this.f743t;
        if (h0Var != null) {
            h0Var.setTextColor(colorStateList);
        }
    }

    public final int t(View view, int i10, int[] iArr, int i11) {
        e eVar = (e) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - iArr[1];
        int max = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int l10 = l(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, l10, max, view.getMeasuredHeight() + l10);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    public final int u(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i15) + Math.max(0, i14);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + max + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void v(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i13 >= 0) {
            if (mode != 0) {
                i13 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i13);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean w(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final boolean x() {
        ActionMenuView actionMenuView = this.f742s;
        if (actionMenuView != null) {
            androidx.appcompat.widget.c cVar = actionMenuView.L;
            if (cVar != null && cVar.m()) {
                return true;
            }
        }
        return false;
    }
}
