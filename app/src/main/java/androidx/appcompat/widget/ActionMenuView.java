package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.c;
import androidx.appcompat.widget.q0;

/* loaded from: classes.dex */
public class ActionMenuView extends q0 implements e.b, j {
    public androidx.appcompat.view.menu.e H;
    public Context I;
    public int J = 0;
    public boolean K;
    public androidx.appcompat.widget.c L;
    public i.a M;
    public e.a N;
    public boolean O;
    public int P;
    public int Q;
    public int R;
    public e S;

    /* loaded from: classes.dex */
    public interface a {
        boolean a();

        boolean b();
    }

    /* loaded from: classes.dex */
    public static class b implements i.a {
        @Override // androidx.appcompat.view.menu.i.a
        public final void a(androidx.appcompat.view.menu.e eVar, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public final boolean b(androidx.appcompat.view.menu.e eVar) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class c extends q0.a {
        @ViewDebug.ExportedProperty

        /* renamed from: a */
        public boolean f642a;
        @ViewDebug.ExportedProperty

        /* renamed from: b */
        public int f643b;
        @ViewDebug.ExportedProperty

        /* renamed from: c */
        public int f644c;
        @ViewDebug.ExportedProperty

        /* renamed from: d */
        public boolean f645d;
        @ViewDebug.ExportedProperty

        /* renamed from: e */
        public boolean f646e;

        /* renamed from: f */
        public boolean f647f;

        public c() {
            super(-2, -2);
            this.f642a = false;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f642a = cVar.f642a;
        }
    }

    /* loaded from: classes.dex */
    public class d implements e.a {
        public d() {
            ActionMenuView.this = r1;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public final boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            boolean z10;
            e eVar2 = ActionMenuView.this.S;
            if (eVar2 != null) {
                Toolbar.a aVar = (Toolbar.a) eVar2;
                if (Toolbar.this.f733b0.b(menuItem)) {
                    z10 = true;
                } else {
                    Toolbar.f fVar = Toolbar.this.f735d0;
                    z10 = fVar != null ? fVar.a() : false;
                }
                if (z10) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public final void b(androidx.appcompat.view.menu.e eVar) {
            e.a aVar = ActionMenuView.this.N;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface e {
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.Q = (int) (56.0f * f10);
        this.R = (int) (f10 * 4.0f);
        this.I = context;
    }

    public static int o(View view, int i10, int i11, int i12, int i13) {
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i12) - i13, View.MeasureSpec.getMode(i12));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z10 = false;
        boolean z11 = actionMenuItemView != null && actionMenuItemView.c();
        int i14 = 2;
        if (i11 <= 0 || (z11 && i11 < 2)) {
            i14 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i11 * i10, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i15 = measuredWidth / i10;
            if (measuredWidth % i10 != 0) {
                i15++;
            }
            if (!z11 || i15 >= 2) {
                i14 = i15;
            }
        }
        if (!cVar.f642a && z11) {
            z10 = true;
        }
        cVar.f645d = z10;
        cVar.f643b = i14;
        view.measure(View.MeasureSpec.makeMeasureSpec(i10 * i14, 1073741824), makeMeasureSpec);
        return i14;
    }

    @Override // androidx.appcompat.view.menu.e.b
    public final boolean a(g gVar) {
        return this.H.t(gVar, null, 0);
    }

    @Override // androidx.appcompat.view.menu.j
    public final void b(androidx.appcompat.view.menu.e eVar) {
        this.H = eVar;
    }

    @Override // androidx.appcompat.widget.q0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.q0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.H == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
            this.H = eVar;
            eVar.y(new d());
            androidx.appcompat.widget.c cVar = new androidx.appcompat.widget.c(context);
            this.L = cVar;
            cVar.D = true;
            cVar.E = true;
            i.a aVar = this.M;
            if (aVar == null) {
                aVar = new b();
            }
            cVar.f518w = aVar;
            this.H.c(cVar, this.I);
            androidx.appcompat.widget.c cVar2 = this.L;
            cVar2.f520z = this;
            this.H = cVar2.f516u;
        }
        return this.H;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        androidx.appcompat.widget.c cVar = this.L;
        c.d dVar = cVar.A;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (!cVar.C) {
            return null;
        }
        return cVar.B;
    }

    public int getPopupTheme() {
        return this.J;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.widget.q0
    public final q0.a i(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* renamed from: l */
    public final c h() {
        c cVar = new c();
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    /* renamed from: m */
    public final c j(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
            if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
                ((LinearLayout.LayoutParams) cVar).gravity = 16;
            }
            return cVar;
        }
        return h();
    }

    public final boolean n(int i10) {
        boolean z10 = false;
        if (i10 == 0) {
            return false;
        }
        View childAt = getChildAt(i10 - 1);
        View childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof a)) {
            z10 = false | ((a) childAt).a();
        }
        return (i10 <= 0 || !(childAt2 instanceof a)) ? z10 : z10 | ((a) childAt2).b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.c cVar = this.L;
        if (cVar != null) {
            cVar.f();
            if (!this.L.l()) {
                return;
            }
            this.L.g();
            this.L.m();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.c cVar = this.L;
        if (cVar != null) {
            cVar.b();
        }
    }

    @Override // androidx.appcompat.widget.q0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        if (!this.O) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i16 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i17 = i12 - i10;
        int paddingRight = (i17 - getPaddingRight()) - getPaddingLeft();
        boolean b10 = n1.b(this);
        int i18 = 0;
        int i19 = 0;
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f642a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (n(i20)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b10) {
                        i14 = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        i15 = i14 + measuredWidth;
                    } else {
                        i15 = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        i14 = i15 - measuredWidth;
                    }
                    int i21 = i16 - (measuredHeight / 2);
                    childAt.layout(i14, i21, i15, measuredHeight + i21);
                    paddingRight -= measuredWidth;
                    i18 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    n(i20);
                    i19++;
                }
            }
        }
        if (childCount == 1 && i18 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i22 = (i17 / 2) - (measuredWidth2 / 2);
            int i23 = i16 - (measuredHeight2 / 2);
            childAt2.layout(i22, i23, measuredWidth2 + i22, measuredHeight2 + i23);
            return;
        }
        int i24 = i19 - (i18 ^ 1);
        int i25 = 0;
        int max = Math.max(0, i24 > 0 ? paddingRight / i24 : 0);
        if (b10) {
            int width = getWidth() - getPaddingRight();
            while (i25 < childCount) {
                View childAt3 = getChildAt(i25);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f642a) {
                    int i26 = width - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i27 = i16 - (measuredHeight3 / 2);
                    childAt3.layout(i26 - measuredWidth3, i27, i26, measuredHeight3 + i27);
                    width = i26 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + max);
                }
                i25++;
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        while (i25 < childCount) {
            View childAt4 = getChildAt(i25);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f642a) {
                int i28 = paddingLeft + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i29 = i16 - (measuredHeight4 / 2);
                childAt4.layout(i28, i29, i28 + measuredWidth4, measuredHeight4 + i29);
                paddingLeft = androidx.appcompat.widget.d.a(measuredWidth4, ((LinearLayout.LayoutParams) cVar3).rightMargin, max, i28);
            }
            i25++;
        }
    }

    /* JADX WARN: Type inference failed for: r3v33, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40 */
    @Override // androidx.appcompat.widget.q0, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean z10;
        int i13;
        int i14;
        boolean z11;
        int i15;
        ?? r32;
        androidx.appcompat.view.menu.e eVar;
        boolean z12 = this.O;
        boolean z13 = View.MeasureSpec.getMode(i10) == 1073741824;
        this.O = z13;
        if (z12 != z13) {
            this.P = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.O && (eVar = this.H) != null && size != this.P) {
            this.P = size;
            eVar.r(true);
        }
        int childCount = getChildCount();
        if (!this.O || childCount <= 0) {
            for (int i16 = 0; i16 < childCount; i16++) {
                c cVar = (c) getChildAt(i16).getLayoutParams();
                ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
                ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
            }
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(i11);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
        int i17 = size2 - paddingRight;
        int i18 = this.Q;
        int i19 = i17 / i18;
        int i20 = i17 % i18;
        if (i19 == 0) {
            setMeasuredDimension(i17, 0);
            return;
        }
        int i21 = (i20 / i19) + i18;
        int childCount2 = getChildCount();
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        boolean z14 = false;
        long j3 = 0;
        while (i26 < childCount2) {
            View childAt = getChildAt(i26);
            int i27 = size3;
            int i28 = i17;
            if (childAt.getVisibility() != 8) {
                boolean z15 = childAt instanceof ActionMenuItemView;
                int i29 = i22 + 1;
                if (z15) {
                    int i30 = this.R;
                    i15 = i29;
                    r32 = 0;
                    childAt.setPadding(i30, 0, i30, 0);
                } else {
                    i15 = i29;
                    r32 = 0;
                }
                c cVar2 = (c) childAt.getLayoutParams();
                cVar2.f647f = r32;
                int i31 = r32 == true ? 1 : 0;
                int i32 = r32 == true ? 1 : 0;
                cVar2.f644c = i31;
                cVar2.f643b = r32;
                cVar2.f645d = r32;
                ((LinearLayout.LayoutParams) cVar2).leftMargin = r32;
                ((LinearLayout.LayoutParams) cVar2).rightMargin = r32;
                cVar2.f646e = z15 && ((ActionMenuItemView) childAt).c();
                int o10 = o(childAt, i21, cVar2.f642a ? 1 : i19, childMeasureSpec, paddingBottom);
                i24 = Math.max(i24, o10);
                if (cVar2.f645d) {
                    i25++;
                }
                if (cVar2.f642a) {
                    z14 = true;
                }
                i19 -= o10;
                i23 = Math.max(i23, childAt.getMeasuredHeight());
                if (o10 == 1) {
                    j3 |= 1 << i26;
                }
                i22 = i15;
            }
            i26++;
            size3 = i27;
            i17 = i28;
        }
        int i33 = i17;
        int i34 = size3;
        boolean z16 = z14 && i22 == 2;
        boolean z17 = false;
        while (i25 > 0 && i19 > 0) {
            int i35 = Integer.MAX_VALUE;
            int i36 = 0;
            int i37 = 0;
            long j10 = 0;
            while (i36 < childCount2) {
                int i38 = i23;
                c cVar3 = (c) getChildAt(i36).getLayoutParams();
                boolean z18 = z17;
                if (cVar3.f645d) {
                    int i39 = cVar3.f643b;
                    if (i39 < i35) {
                        j10 = 1 << i36;
                        i35 = i39;
                        i37 = 1;
                    } else if (i39 == i35) {
                        i37++;
                        j10 |= 1 << i36;
                    }
                }
                i36++;
                z17 = z18;
                i23 = i38;
            }
            i12 = i23;
            z10 = z17;
            j3 |= j10;
            if (i37 > i19) {
                break;
            }
            int i40 = i35 + 1;
            int i41 = 0;
            while (i41 < childCount2) {
                View childAt2 = getChildAt(i41);
                c cVar4 = (c) childAt2.getLayoutParams();
                int i42 = i25;
                long j11 = 1 << i41;
                if ((j10 & j11) == 0) {
                    if (cVar4.f643b == i40) {
                        j3 |= j11;
                    }
                    z11 = z16;
                } else {
                    if (!z16 || !cVar4.f646e || i19 != 1) {
                        z11 = z16;
                    } else {
                        int i43 = this.R;
                        z11 = z16;
                        childAt2.setPadding(i43 + i21, 0, i43, 0);
                    }
                    cVar4.f643b++;
                    cVar4.f647f = true;
                    i19--;
                }
                i41++;
                i25 = i42;
                z16 = z11;
            }
            i23 = i12;
            z17 = true;
        }
        i12 = i23;
        z10 = z17;
        boolean z19 = !z14 && i22 == 1;
        if (i19 > 0 && j3 != 0 && (i19 < i22 - 1 || z19 || i24 > 1)) {
            float bitCount = Long.bitCount(j3);
            if (!z19) {
                if ((j3 & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).f646e) {
                    bitCount -= 0.5f;
                }
                int i44 = childCount2 - 1;
                if ((j3 & (1 << i44)) != 0 && !((c) getChildAt(i44).getLayoutParams()).f646e) {
                    bitCount -= 0.5f;
                }
            }
            int i45 = bitCount > 0.0f ? (int) ((i19 * i21) / bitCount) : 0;
            for (int i46 = 0; i46 < childCount2; i46++) {
                if ((j3 & (1 << i46)) != 0) {
                    View childAt3 = getChildAt(i46);
                    c cVar5 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar5.f644c = i45;
                        cVar5.f647f = true;
                        if (i46 == 0 && !cVar5.f646e) {
                            ((LinearLayout.LayoutParams) cVar5).leftMargin = (-i45) / 2;
                        }
                        z10 = true;
                    } else if (cVar5.f642a) {
                        cVar5.f644c = i45;
                        cVar5.f647f = true;
                        ((LinearLayout.LayoutParams) cVar5).rightMargin = (-i45) / 2;
                        z10 = true;
                    } else {
                        if (i46 != 0) {
                            ((LinearLayout.LayoutParams) cVar5).leftMargin = i45 / 2;
                        }
                        if (i46 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) cVar5).rightMargin = i45 / 2;
                        }
                    }
                }
            }
        }
        if (z10) {
            for (int i47 = 0; i47 < childCount2; i47++) {
                View childAt4 = getChildAt(i47);
                c cVar6 = (c) childAt4.getLayoutParams();
                if (cVar6.f647f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar6.f643b * i21) + cVar6.f644c, 1073741824), childMeasureSpec);
                }
            }
        }
        if (mode != 1073741824) {
            i14 = i33;
            i13 = i12;
        } else {
            i13 = i34;
            i14 = i33;
        }
        setMeasuredDimension(i14, i13);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.L.I = z10;
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.S = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        androidx.appcompat.widget.c cVar = this.L;
        c.d dVar = cVar.A;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        cVar.C = true;
        cVar.B = drawable;
    }

    public void setOverflowReserved(boolean z10) {
        this.K = z10;
    }

    public void setPopupTheme(int i10) {
        if (this.J != i10) {
            this.J = i10;
            if (i10 == 0) {
                this.I = getContext();
            } else {
                this.I = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(androidx.appcompat.widget.c cVar) {
        this.L = cVar;
        cVar.f520z = this;
        this.H = cVar.f516u;
    }
}
