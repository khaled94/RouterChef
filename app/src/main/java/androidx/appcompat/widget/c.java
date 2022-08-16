package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.widget.ActionMenuView;
import com.raouf.routerchef.R;
import f0.a;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c extends androidx.appcompat.view.menu.a {
    public d A;
    public Drawable B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public int H;
    public boolean I;
    public e K;
    public a L;
    public RunnableC0008c M;
    public b N;
    public final SparseBooleanArray J = new SparseBooleanArray();
    public final f O = new f();

    /* loaded from: classes.dex */
    public class a extends h {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, l lVar, View view) {
            super(context, lVar, view, false, R.attr.actionOverflowMenuStyle, 0);
            c.this = r8;
            if (!lVar.A.g()) {
                View view2 = r8.A;
                this.f607f = view2 == null ? (View) r8.f520z : view2;
            }
            d(r8.O);
        }

        @Override // androidx.appcompat.view.menu.h
        public final void c() {
            c.this.L = null;
            super.c();
        }
    }

    /* loaded from: classes.dex */
    public class b extends ActionMenuItemView.b {
        public b() {
            c.this = r1;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c */
    /* loaded from: classes.dex */
    public class RunnableC0008c implements Runnable {

        /* renamed from: s */
        public e f789s;

        public RunnableC0008c(e eVar) {
            c.this = r1;
            this.f789s = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            e.a aVar;
            androidx.appcompat.view.menu.e eVar = c.this.f516u;
            if (eVar != null && (aVar = eVar.f555e) != null) {
                aVar.b(eVar);
            }
            View view = (View) c.this.f520z;
            if (view != null && view.getWindowToken() != null) {
                e eVar2 = this.f789s;
                boolean z10 = true;
                if (!eVar2.b()) {
                    if (eVar2.f607f == null) {
                        z10 = false;
                    } else {
                        eVar2.e(0, 0, false, false);
                    }
                }
                if (z10) {
                    c.this.K = this.f789s;
                }
            }
            c.this.M = null;
        }
    }

    /* loaded from: classes.dex */
    public class d extends s implements ActionMenuView.a {

        /* loaded from: classes.dex */
        public class a extends p0 {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(View view) {
                super(view);
                d.this = r1;
            }

            @Override // androidx.appcompat.widget.p0
            public final k.f b() {
                e eVar = c.this.K;
                if (eVar == null) {
                    return null;
                }
                return eVar.a();
            }

            @Override // androidx.appcompat.widget.p0
            public final boolean c() {
                c.this.m();
                return true;
            }

            @Override // androidx.appcompat.widget.p0
            public final boolean e() {
                c cVar = c.this;
                if (cVar.M != null) {
                    return false;
                }
                cVar.g();
                return true;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            c.this = r2;
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            j1.a(this, getContentDescription());
            setOnTouchListener(new a(this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public final boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public final boolean b() {
            return false;
        }

        @Override // android.view.View
        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.m();
            return true;
        }

        @Override // android.widget.ImageView
        public final boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                a.b.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* loaded from: classes.dex */
    public class e extends h {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view) {
            super(context, eVar, view, true, R.attr.actionOverflowMenuStyle, 0);
            c.this = r8;
            this.f608g = 8388613;
            d(r8.O);
        }

        @Override // androidx.appcompat.view.menu.h
        public final void c() {
            androidx.appcompat.view.menu.e eVar = c.this.f516u;
            if (eVar != null) {
                eVar.d(true);
            }
            c.this.K = null;
            super.c();
        }
    }

    /* loaded from: classes.dex */
    public class f implements i.a {
        public f() {
            c.this = r1;
        }

        @Override // androidx.appcompat.view.menu.i.a
        public final void a(androidx.appcompat.view.menu.e eVar, boolean z10) {
            if (eVar instanceof l) {
                eVar.l().d(false);
            }
            i.a aVar = c.this.f518w;
            if (aVar != null) {
                aVar.a(eVar, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.i.a
        public final boolean b(androidx.appcompat.view.menu.e eVar) {
            c cVar = c.this;
            if (eVar == cVar.f516u) {
                return false;
            }
            Objects.requireNonNull(((l) eVar).A);
            Objects.requireNonNull(cVar);
            i.a aVar = c.this.f518w;
            if (aVar == null) {
                return false;
            }
            return aVar.b(eVar);
        }
    }

    public c(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.i
    public final void a(androidx.appcompat.view.menu.e eVar, boolean z10) {
        b();
        i.a aVar = this.f518w;
        if (aVar != null) {
            aVar.a(eVar, z10);
        }
    }

    public final boolean b() {
        boolean z10;
        boolean g10 = g();
        a aVar = this.L;
        if (aVar != null) {
            if (aVar.b()) {
                aVar.f611j.dismiss();
            }
            z10 = true;
        } else {
            z10 = false;
        }
        return g10 | z10;
    }

    public final View d(g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        int i10 = 0;
        if (actionView == null || gVar.f()) {
            j.a aVar = view instanceof j.a ? (j.a) view : (j.a) this.f517v.inflate(this.y, viewGroup, false);
            aVar.e(gVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.f520z);
            if (this.N == null) {
                this.N = new b();
            }
            actionMenuItemView.setPopupCallback(this.N);
            actionView = (View) aVar;
        }
        if (gVar.C) {
            i10 = 8;
        }
        actionView.setVisibility(i10);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.j(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.i
    public final void e(Context context, androidx.appcompat.view.menu.e eVar) {
        this.f515t = context;
        LayoutInflater.from(context);
        this.f516u = eVar;
        Resources resources = context.getResources();
        if (!this.E) {
            this.D = true;
        }
        int i10 = 2;
        this.F = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i11 = configuration.screenWidthDp;
        int i12 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i11 > 600 || ((i11 > 960 && i12 > 720) || (i11 > 720 && i12 > 960))) {
            i10 = 5;
        } else if (i11 >= 500 || ((i11 > 640 && i12 > 480) || (i11 > 480 && i12 > 640))) {
            i10 = 4;
        } else if (i11 >= 360) {
            i10 = 3;
        }
        this.H = i10;
        int i13 = this.F;
        if (this.D) {
            if (this.A == null) {
                d dVar = new d(this.f514s);
                this.A = dVar;
                if (this.C) {
                    dVar.setImageDrawable(this.B);
                    this.B = null;
                    this.C = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.A.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i13 -= this.A.getMeasuredWidth();
        } else {
            this.A = null;
        }
        this.G = i13;
        float f10 = resources.getDisplayMetrics().density;
    }

    @Override // androidx.appcompat.view.menu.i
    public final void f() {
        int i10;
        boolean z10;
        ViewGroup viewGroup = (ViewGroup) this.f520z;
        ArrayList<g> arrayList = null;
        boolean z11 = false;
        if (viewGroup != null) {
            androidx.appcompat.view.menu.e eVar = this.f516u;
            if (eVar != null) {
                eVar.j();
                ArrayList<g> m10 = this.f516u.m();
                int size = m10.size();
                i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    g gVar = m10.get(i11);
                    if (gVar.g()) {
                        View childAt = viewGroup.getChildAt(i10);
                        g itemData = childAt instanceof j.a ? ((j.a) childAt).getItemData() : null;
                        View d5 = d(gVar, childAt, viewGroup);
                        if (gVar != itemData) {
                            d5.setPressed(false);
                            d5.jumpDrawablesToCurrentState();
                        }
                        if (d5 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) d5.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(d5);
                            }
                            ((ViewGroup) this.f520z).addView(d5, i10);
                        }
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            while (i10 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i10) == this.A) {
                    z10 = false;
                } else {
                    viewGroup.removeViewAt(i10);
                    z10 = true;
                }
                if (!z10) {
                    i10++;
                }
            }
        }
        ((View) this.f520z).requestLayout();
        androidx.appcompat.view.menu.e eVar2 = this.f516u;
        if (eVar2 != null) {
            eVar2.j();
            ArrayList<g> arrayList2 = eVar2.f559i;
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                m0.b bVar = arrayList2.get(i12).A;
            }
        }
        androidx.appcompat.view.menu.e eVar3 = this.f516u;
        if (eVar3 != null) {
            eVar3.j();
            arrayList = eVar3.f560j;
        }
        if (this.D && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z11 = !arrayList.get(0).C;
            } else if (size3 > 0) {
                z11 = true;
            }
        }
        d dVar = this.A;
        if (z11) {
            if (dVar == null) {
                this.A = new d(this.f514s);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.A.getParent();
            if (viewGroup3 != this.f520z) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.A);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f520z;
                d dVar2 = this.A;
                ActionMenuView.c h10 = actionMenuView.h();
                h10.f642a = true;
                actionMenuView.addView(dVar2, h10);
            }
        } else if (dVar != null) {
            ViewParent parent = dVar.getParent();
            j jVar = this.f520z;
            if (parent == jVar) {
                ((ViewGroup) jVar).removeView(this.A);
            }
        }
        ((ActionMenuView) this.f520z).setOverflowReserved(this.D);
    }

    public final boolean g() {
        j jVar;
        RunnableC0008c runnableC0008c = this.M;
        if (runnableC0008c != null && (jVar = this.f520z) != null) {
            ((View) jVar).removeCallbacks(runnableC0008c);
            this.M = null;
            return true;
        }
        e eVar = this.K;
        if (eVar == null) {
            return false;
        }
        if (eVar.b()) {
            eVar.f611j.dismiss();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008e  */
    @Override // androidx.appcompat.view.menu.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(androidx.appcompat.view.menu.l r9) {
        /*
            r8 = this;
            boolean r0 = r9.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = r9
        L9:
            androidx.appcompat.view.menu.e r2 = r0.f623z
            androidx.appcompat.view.menu.e r3 = r8.f516u
            if (r2 == r3) goto L13
            r0 = r2
            androidx.appcompat.view.menu.l r0 = (androidx.appcompat.view.menu.l) r0
            goto L9
        L13:
            androidx.appcompat.view.menu.g r0 = r0.A
            androidx.appcompat.view.menu.j r2 = r8.f520z
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r3 = 0
            if (r2 != 0) goto L1d
            goto L3a
        L1d:
            int r4 = r2.getChildCount()
            r5 = r1
        L22:
            if (r5 >= r4) goto L3a
            android.view.View r6 = r2.getChildAt(r5)
            boolean r7 = r6 instanceof androidx.appcompat.view.menu.j.a
            if (r7 == 0) goto L37
            r7 = r6
            androidx.appcompat.view.menu.j$a r7 = (androidx.appcompat.view.menu.j.a) r7
            androidx.appcompat.view.menu.g r7 = r7.getItemData()
            if (r7 != r0) goto L37
            r3 = r6
            goto L3a
        L37:
            int r5 = r5 + 1
            goto L22
        L3a:
            if (r3 != 0) goto L3d
            return r1
        L3d:
            androidx.appcompat.view.menu.g r0 = r9.A
            java.util.Objects.requireNonNull(r0)
            int r0 = r9.size()
            r2 = r1
        L47:
            r4 = 1
            if (r2 >= r0) goto L5f
            android.view.MenuItem r5 = r9.getItem(r2)
            boolean r6 = r5.isVisible()
            if (r6 == 0) goto L5c
            android.graphics.drawable.Drawable r5 = r5.getIcon()
            if (r5 == 0) goto L5c
            r0 = r4
            goto L60
        L5c:
            int r2 = r2 + 1
            goto L47
        L5f:
            r0 = r1
        L60:
            androidx.appcompat.widget.c$a r2 = new androidx.appcompat.widget.c$a
            android.content.Context r5 = r8.f515t
            r2.<init>(r5, r9, r3)
            r8.L = r2
            r2.f609h = r0
            k.d r2 = r2.f611j
            if (r2 == 0) goto L72
            r2.o(r0)
        L72:
            androidx.appcompat.widget.c$a r0 = r8.L
            boolean r2 = r0.b()
            if (r2 == 0) goto L7b
            goto L83
        L7b:
            android.view.View r2 = r0.f607f
            if (r2 != 0) goto L80
            goto L84
        L80:
            r0.e(r1, r1, r1, r1)
        L83:
            r1 = r4
        L84:
            if (r1 == 0) goto L8e
            androidx.appcompat.view.menu.i$a r0 = r8.f518w
            if (r0 == 0) goto L8d
            r0.b(r9)
        L8d:
            return r4
        L8e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "MenuPopupHelper cannot be used without an anchor"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.c.h(androidx.appcompat.view.menu.l):boolean");
    }

    @Override // androidx.appcompat.view.menu.i
    public final boolean i() {
        int i10;
        ArrayList<g> arrayList;
        int i11;
        boolean z10;
        androidx.appcompat.view.menu.e eVar = this.f516u;
        if (eVar != null) {
            arrayList = eVar.m();
            i10 = arrayList.size();
        } else {
            i10 = 0;
            arrayList = null;
        }
        int i12 = this.H;
        int i13 = this.G;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.f520z;
        int i14 = 0;
        boolean z11 = false;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i11 = 2;
            z10 = true;
            if (i14 >= i10) {
                break;
            }
            g gVar = arrayList.get(i14);
            int i17 = gVar.y;
            if ((i17 & 2) == 2) {
                i15++;
            } else if ((i17 & 1) == 1) {
                i16++;
            } else {
                z11 = true;
            }
            if (this.I && gVar.C) {
                i12 = 0;
            }
            i14++;
        }
        if (this.D && (z11 || i16 + i15 > i12)) {
            i12--;
        }
        int i18 = i12 - i15;
        SparseBooleanArray sparseBooleanArray = this.J;
        sparseBooleanArray.clear();
        int i19 = 0;
        int i20 = 0;
        while (i19 < i10) {
            g gVar2 = arrayList.get(i19);
            int i21 = gVar2.y;
            if ((i21 & 2) == i11 ? z10 : false) {
                View d5 = d(gVar2, null, viewGroup);
                d5.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = d5.getMeasuredWidth();
                i13 -= measuredWidth;
                if (i20 == 0) {
                    i20 = measuredWidth;
                }
                int i22 = gVar2.f578b;
                if (i22 != 0) {
                    sparseBooleanArray.put(i22, z10);
                }
                gVar2.k(z10);
            } else if ((i21 & 1) == z10 ? z10 : false) {
                int i23 = gVar2.f578b;
                boolean z12 = sparseBooleanArray.get(i23);
                boolean z13 = ((i18 > 0 || z12) && i13 > 0) ? z10 : false;
                if (z13) {
                    View d10 = d(gVar2, null, viewGroup);
                    d10.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = d10.getMeasuredWidth();
                    i13 -= measuredWidth2;
                    if (i20 == 0) {
                        i20 = measuredWidth2;
                    }
                    z13 &= i13 + i20 > 0;
                }
                if (z13 && i23 != 0) {
                    sparseBooleanArray.put(i23, true);
                } else if (z12) {
                    sparseBooleanArray.put(i23, false);
                    for (int i24 = 0; i24 < i19; i24++) {
                        g gVar3 = arrayList.get(i24);
                        if (gVar3.f578b == i23) {
                            if (gVar3.g()) {
                                i18++;
                            }
                            gVar3.k(false);
                        }
                    }
                }
                if (z13) {
                    i18--;
                }
                gVar2.k(z13);
            } else {
                gVar2.k(false);
                i19++;
                i11 = 2;
                z10 = true;
            }
            i19++;
            i11 = 2;
            z10 = true;
        }
        return z10;
    }

    public final boolean l() {
        e eVar = this.K;
        return eVar != null && eVar.b();
    }

    public final boolean m() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.D || l() || (eVar = this.f516u) == null || this.f520z == null || this.M != null) {
            return false;
        }
        eVar.j();
        if (eVar.f560j.isEmpty()) {
            return false;
        }
        RunnableC0008c runnableC0008c = new RunnableC0008c(new e(this.f515t, this.f516u, this.A));
        this.M = runnableC0008c;
        ((View) this.f520z).post(runnableC0008c);
        return true;
    }
}
