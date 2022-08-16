package com.google.android.material.appbar;

import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.raouf.routerchef.R;
import f0.a;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.WeakHashMap;
import m0.f0;
import m0.l;
import m0.z;
import n0.f;
import r.g;

/* loaded from: classes.dex */
public final class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {
    public boolean A;
    public boolean B;
    public int C;
    public WeakReference<View> D;
    public ValueAnimator E;
    public int[] F;
    public Drawable G;
    public Behavior H;

    /* renamed from: s */
    public int f2971s;

    /* renamed from: t */
    public int f2972t;

    /* renamed from: u */
    public int f2973u;

    /* renamed from: v */
    public int f2974v;

    /* renamed from: w */
    public boolean f2975w;

    /* renamed from: x */
    public int f2976x;
    public boolean y;

    /* renamed from: z */
    public boolean f2977z;

    /* loaded from: classes.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends f5.b<T> {

        /* renamed from: j */
        public int f2978j;

        /* renamed from: k */
        public int f2979k;

        /* renamed from: l */
        public ValueAnimator f2980l;

        /* renamed from: m */
        public b f2981m;

        /* renamed from: n */
        public WeakReference<View> f2982n;

        /* renamed from: o */
        public boolean f2983o;

        /* loaded from: classes.dex */
        public class a extends m0.a {
            public a() {
                BaseBehavior.this = r1;
            }

            @Override // m0.a
            public final void d(View view, f fVar) {
                this.f5847a.onInitializeAccessibilityNodeInfo(view, fVar.f16401a);
                fVar.v(BaseBehavior.this.f2983o);
                fVar.n(ScrollView.class.getName());
            }
        }

        /* loaded from: classes.dex */
        public static class b extends s0.a {
            public static final Parcelable.Creator<b> CREATOR = new a();

            /* renamed from: u */
            public boolean f2985u;

            /* renamed from: v */
            public boolean f2986v;

            /* renamed from: w */
            public int f2987w;

            /* renamed from: x */
            public float f2988x;
            public boolean y;

            /* loaded from: classes.dex */
            public class a implements Parcelable.ClassLoaderCreator<b> {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    return new b(parcel, null);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i10) {
                    return new b[i10];
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                public final b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new b(parcel, classLoader);
                }
            }

            public b(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                boolean z10 = true;
                this.f2985u = parcel.readByte() != 0;
                this.f2986v = parcel.readByte() != 0;
                this.f2987w = parcel.readInt();
                this.f2988x = parcel.readFloat();
                this.y = parcel.readByte() == 0 ? false : z10;
            }

            public b(Parcelable parcelable) {
                super(parcelable);
            }

            @Override // s0.a, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                parcel.writeParcelable(this.f17592s, i10);
                parcel.writeByte(this.f2985u ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f2986v ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f2987w);
                parcel.writeFloat(this.f2988x);
                parcel.writeByte(this.y ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public static boolean E(int i10, int i11) {
            return (i10 & i11) == i11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // f5.b
        public final int C(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
            int i13;
            List list;
            int i14;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int y = y();
            int i15 = 0;
            if (i11 == 0 || y < i11 || y > i12) {
                this.f2978j = 0;
            } else {
                int b10 = c4.a.b(i10, i11, i12);
                if (y != b10) {
                    if (appBarLayout.f2975w) {
                        int abs = Math.abs(b10);
                        int childCount = appBarLayout.getChildCount();
                        int i16 = 0;
                        while (true) {
                            if (i16 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i16);
                            c cVar = (c) childAt.getLayoutParams();
                            Interpolator interpolator = cVar.f2993c;
                            if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                                i16++;
                            } else if (interpolator != null) {
                                int i17 = cVar.f2991a;
                                if ((i17 & 1) != 0) {
                                    i14 = childAt.getHeight() + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + 0;
                                    if ((i17 & 2) != 0) {
                                        WeakHashMap<View, f0> weakHashMap = z.f5921a;
                                        i14 -= z.d.d(childAt);
                                    }
                                } else {
                                    i14 = 0;
                                }
                                WeakHashMap<View, f0> weakHashMap2 = z.f5921a;
                                if (z.d.b(childAt)) {
                                    i14 -= appBarLayout.getTopInset();
                                }
                                if (i14 > 0) {
                                    float f10 = i14;
                                    i13 = (childAt.getTop() + Math.round(interpolator.getInterpolation((abs - childAt.getTop()) / f10) * f10)) * Integer.signum(b10);
                                }
                            }
                        }
                    }
                    i13 = b10;
                    boolean u10 = u(i13);
                    int i18 = y - b10;
                    this.f2978j = b10 - i13;
                    if (u10) {
                        for (int i19 = 0; i19 < appBarLayout.getChildCount(); i19++) {
                            c cVar2 = (c) appBarLayout.getChildAt(i19).getLayoutParams();
                            a aVar = cVar2.f2992b;
                            if (aVar != null && (cVar2.f2991a & 1) != 0) {
                                View childAt2 = appBarLayout.getChildAt(i19);
                                b bVar = (b) aVar;
                                Rect rect = bVar.f2989a;
                                childAt2.getDrawingRect(rect);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect);
                                rect.offset(0, -appBarLayout.getTopInset());
                                float abs2 = bVar.f2989a.top - Math.abs(s());
                                float f11 = 0.0f;
                                if (abs2 <= 0.0f) {
                                    float abs3 = Math.abs(abs2 / bVar.f2989a.height());
                                    if (abs3 >= 0.0f) {
                                        f11 = abs3 > 1.0f ? 1.0f : abs3;
                                    }
                                    float f12 = 1.0f - f11;
                                    float height = (-abs2) - ((bVar.f2989a.height() * 0.3f) * (1.0f - (f12 * f12)));
                                    childAt2.setTranslationY(height);
                                    childAt2.getDrawingRect(bVar.f2990b);
                                    bVar.f2990b.offset(0, (int) (-height));
                                    Rect rect2 = bVar.f2990b;
                                    WeakHashMap<View, f0> weakHashMap3 = z.f5921a;
                                    z.f.c(childAt2, rect2);
                                } else {
                                    WeakHashMap<View, f0> weakHashMap4 = z.f5921a;
                                    z.f.c(childAt2, null);
                                    childAt2.setTranslationY(0.0f);
                                }
                            }
                        }
                    }
                    if (!u10 && appBarLayout.f2975w && (list = (List) ((g) coordinatorLayout.f1234t.f20886t).getOrDefault(appBarLayout, null)) != null && !list.isEmpty()) {
                        while (i15 < list.size()) {
                            View view2 = (View) list.get(i15);
                            CoordinatorLayout.c cVar3 = ((CoordinatorLayout.f) view2.getLayoutParams()).f1242a;
                            if (cVar3 != null) {
                                cVar3.d(coordinatorLayout, view2, appBarLayout);
                            }
                            i15++;
                        }
                    }
                    appBarLayout.f2971s = s();
                    if (!appBarLayout.willNotDraw()) {
                        WeakHashMap<View, f0> weakHashMap5 = z.f5921a;
                        z.d.k(appBarLayout);
                    }
                    K(coordinatorLayout, appBarLayout, b10, b10 < y ? -1 : 1, false);
                    i15 = i18;
                }
            }
            J(coordinatorLayout, appBarLayout);
            return i15;
        }

        public final void D(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i10) {
            int abs = Math.abs(y() - i10);
            float abs2 = Math.abs(0.0f);
            int round = abs2 > 0.0f ? Math.round((abs / abs2) * 1000.0f) * 3 : (int) (((abs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            int y = y();
            if (y == i10) {
                ValueAnimator valueAnimator = this.f2980l;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f2980l.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f2980l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f2980l = valueAnimator3;
                valueAnimator3.setInterpolator(e5.a.f4412e);
                this.f2980l.addUpdateListener(new com.google.android.material.appbar.a(this, coordinatorLayout, appBarLayout));
            } else {
                valueAnimator2.cancel();
            }
            this.f2980l.setDuration(Math.min(round, 600));
            this.f2980l.setIntValues(y, i10);
            this.f2980l.start();
        }

        public final View F(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof l) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public final void G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int[] iArr) {
            int i11;
            int i12;
            if (i10 != 0) {
                if (i10 < 0) {
                    i12 = -appBarLayout.getTotalScrollRange();
                    i11 = appBarLayout.getDownNestedPreScrollRange() + i12;
                } else {
                    i12 = -appBarLayout.getUpNestedPreScrollRange();
                    i11 = 0;
                }
                int i13 = i12;
                int i14 = i11;
                if (i13 != i14) {
                    iArr[1] = A(coordinatorLayout, appBarLayout, i10, i13, i14);
                }
            }
            if (appBarLayout.B) {
                appBarLayout.c(appBarLayout.d(view));
            }
        }

        public final b H(Parcelable parcelable, T t10) {
            int s10 = s();
            int childCount = t10.getChildCount();
            boolean z10 = false;
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = t10.getChildAt(i10);
                int bottom = childAt.getBottom() + s10;
                if (childAt.getTop() + s10 <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = s0.a.f17591t;
                    }
                    b bVar = new b(parcelable);
                    boolean z11 = s10 == 0;
                    bVar.f2986v = z11;
                    bVar.f2985u = !z11 && (-s10) >= t10.getTotalScrollRange();
                    bVar.f2987w = i10;
                    WeakHashMap<View, f0> weakHashMap = z.f5921a;
                    if (bottom == t10.getTopInset() + z.d.d(childAt)) {
                        z10 = true;
                    }
                    bVar.y = z10;
                    bVar.f2988x = bottom / childAt.getHeight();
                    return bVar;
                }
            }
            return null;
        }

        public final void I(CoordinatorLayout coordinatorLayout, T t10) {
            int paddingTop = t10.getPaddingTop() + t10.getTopInset();
            int y = y() - paddingTop;
            int childCount = t10.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    i10 = -1;
                    break;
                }
                View childAt = t10.getChildAt(i10);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                c cVar = (c) childAt.getLayoutParams();
                if (E(cVar.f2991a, 32)) {
                    top -= ((LinearLayout.LayoutParams) cVar).topMargin;
                    bottom += ((LinearLayout.LayoutParams) cVar).bottomMargin;
                }
                int i11 = -y;
                if (top <= i11 && bottom >= i11) {
                    break;
                }
                i10++;
            }
            if (i10 >= 0) {
                View childAt2 = t10.getChildAt(i10);
                c cVar2 = (c) childAt2.getLayoutParams();
                int i12 = cVar2.f2991a;
                if ((i12 & 17) != 17) {
                    return;
                }
                int i13 = -childAt2.getTop();
                int i14 = -childAt2.getBottom();
                if (i10 == 0) {
                    WeakHashMap<View, f0> weakHashMap = z.f5921a;
                    if (z.d.b(t10) && z.d.b(childAt2)) {
                        i13 -= t10.getTopInset();
                    }
                }
                if (E(i12, 2)) {
                    WeakHashMap<View, f0> weakHashMap2 = z.f5921a;
                    i14 += z.d.d(childAt2);
                } else if (E(i12, 5)) {
                    WeakHashMap<View, f0> weakHashMap3 = z.f5921a;
                    int d5 = z.d.d(childAt2) + i14;
                    if (y < d5) {
                        i13 = d5;
                    } else {
                        i14 = d5;
                    }
                }
                if (E(i12, 32)) {
                    i13 += ((LinearLayout.LayoutParams) cVar2).topMargin;
                    i14 -= ((LinearLayout.LayoutParams) cVar2).bottomMargin;
                }
                if (y < (i14 + i13) / 2) {
                    i13 = i14;
                }
                D(coordinatorLayout, t10, c4.a.b(i13 + paddingTop, -t10.getTotalScrollRange(), 0));
            }
        }

        public final void J(CoordinatorLayout coordinatorLayout, T t10) {
            View view;
            boolean z10;
            boolean z11;
            z.m(f.a.f16405f.a(), coordinatorLayout);
            boolean z12 = false;
            z.j(coordinatorLayout, 0);
            z.m(f.a.f16406g.a(), coordinatorLayout);
            z.j(coordinatorLayout, 0);
            if (t10.getTotalScrollRange() == 0) {
                return;
            }
            int childCount = coordinatorLayout.getChildCount();
            int i10 = 0;
            while (true) {
                view = null;
                if (i10 >= childCount) {
                    break;
                }
                view = coordinatorLayout.getChildAt(i10);
                if (((CoordinatorLayout.f) view.getLayoutParams()).f1242a instanceof ScrollingViewBehavior) {
                    break;
                }
                i10++;
            }
            View view2 = view;
            if (view2 == null) {
                return;
            }
            int childCount2 = t10.getChildCount();
            int i11 = 0;
            while (true) {
                z10 = true;
                if (i11 >= childCount2) {
                    z11 = false;
                    break;
                } else if (((c) t10.getChildAt(i11).getLayoutParams()).f2991a != 0) {
                    z11 = true;
                    break;
                } else {
                    i11++;
                }
            }
            if (!z11) {
                return;
            }
            if (!(z.f(coordinatorLayout) != null)) {
                z.p(coordinatorLayout, new a());
            }
            if (y() != (-t10.getTotalScrollRange())) {
                z.n(coordinatorLayout, f.a.f16405f, new com.google.android.material.appbar.c(t10, false));
                z12 = true;
            }
            if (y() != 0) {
                if (view2.canScrollVertically(-1)) {
                    int i12 = -t10.getDownNestedPreScrollRange();
                    if (i12 != 0) {
                        z.n(coordinatorLayout, f.a.f16406g, new com.google.android.material.appbar.b(this, coordinatorLayout, t10, view2, i12));
                    }
                } else {
                    z.n(coordinatorLayout, f.a.f16406g, new com.google.android.material.appbar.c(t10, true));
                }
                this.f2983o = z10;
            }
            z10 = z12;
            this.f2983o = z10;
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void K(androidx.coordinatorlayout.widget.CoordinatorLayout r7, T r8, int r9, int r10, boolean r11) {
            /*
                r6 = this;
                int r0 = java.lang.Math.abs(r9)
                int r1 = r8.getChildCount()
                r2 = 0
                r3 = r2
            La:
                if (r3 >= r1) goto L20
                android.view.View r4 = r8.getChildAt(r3)
                int r5 = r4.getTop()
                if (r0 < r5) goto L1d
                int r5 = r4.getBottom()
                if (r0 > r5) goto L1d
                goto L21
            L1d:
                int r3 = r3 + 1
                goto La
            L20:
                r4 = 0
            L21:
                r0 = 1
                if (r4 == 0) goto L4b
                android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$c r1 = (com.google.android.material.appbar.AppBarLayout.c) r1
                int r1 = r1.f2991a
                r3 = r1 & 1
                if (r3 == 0) goto L4b
                java.util.WeakHashMap<android.view.View, m0.f0> r3 = m0.z.f5921a
                int r3 = m0.z.d.d(r4)
                if (r10 <= 0) goto L4d
                r10 = r1 & 12
                if (r10 == 0) goto L4d
                int r9 = -r9
                int r10 = r4.getBottom()
                int r10 = r10 - r3
                int r1 = r8.getTopInset()
                int r10 = r10 - r1
                if (r9 < r10) goto L4b
            L49:
                r9 = r0
                goto L5f
            L4b:
                r9 = r2
                goto L5f
            L4d:
                r10 = r1 & 2
                if (r10 == 0) goto L4b
                int r9 = -r9
                int r10 = r4.getBottom()
                int r10 = r10 - r3
                int r1 = r8.getTopInset()
                int r10 = r10 - r1
                if (r9 < r10) goto L4b
                goto L49
            L5f:
                boolean r10 = r8.B
                if (r10 == 0) goto L6b
                android.view.View r9 = r6.F(r7)
                boolean r9 = r8.d(r9)
            L6b:
                boolean r9 = r8.c(r9)
                if (r11 != 0) goto L9f
                if (r9 == 0) goto La2
                java.util.List r7 = r7.e(r8)
                java.util.ArrayList r7 = (java.util.ArrayList) r7
                int r9 = r7.size()
                r10 = r2
            L7e:
                if (r10 >= r9) goto L9d
                java.lang.Object r11 = r7.get(r10)
                android.view.View r11 = (android.view.View) r11
                android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$f r11 = (androidx.coordinatorlayout.widget.CoordinatorLayout.f) r11
                androidx.coordinatorlayout.widget.CoordinatorLayout$c r11 = r11.f1242a
                boolean r1 = r11 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r1 == 0) goto L9a
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r11 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r11
                int r7 = r11.f4542f
                if (r7 == 0) goto L9d
                r2 = r0
                goto L9d
            L9a:
                int r10 = r10 + 1
                goto L7e
            L9d:
                if (r2 == 0) goto La2
            L9f:
                r8.jumpDrawablesToCurrentState()
            La2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.K(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // f5.d, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
            int i11;
            int i12;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.h(coordinatorLayout, appBarLayout, i10);
            int pendingAction = appBarLayout.getPendingAction();
            b bVar = this.f2981m;
            if (bVar == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z10 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        i11 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z10) {
                            D(coordinatorLayout, appBarLayout, i11);
                        }
                        B(coordinatorLayout, appBarLayout, i11);
                    } else if ((pendingAction & 1) != 0) {
                        if (z10) {
                            D(coordinatorLayout, appBarLayout, 0);
                        }
                        B(coordinatorLayout, appBarLayout, 0);
                    }
                }
            } else if (bVar.f2985u) {
                i11 = -appBarLayout.getTotalScrollRange();
                B(coordinatorLayout, appBarLayout, i11);
            } else {
                if (!bVar.f2986v) {
                    View childAt = appBarLayout.getChildAt(bVar.f2987w);
                    int i13 = -childAt.getBottom();
                    if (this.f2981m.y) {
                        WeakHashMap<View, f0> weakHashMap = z.f5921a;
                        i12 = appBarLayout.getTopInset() + z.d.d(childAt) + i13;
                    } else {
                        i12 = Math.round(childAt.getHeight() * this.f2981m.f2988x) + i13;
                    }
                    B(coordinatorLayout, appBarLayout, i12);
                }
                B(coordinatorLayout, appBarLayout, 0);
            }
            appBarLayout.f2976x = 0;
            this.f2981m = null;
            u(c4.a.b(s(), -appBarLayout.getTotalScrollRange(), 0));
            K(coordinatorLayout, appBarLayout, s(), 0, true);
            appBarLayout.f2971s = s();
            if (!appBarLayout.willNotDraw()) {
                WeakHashMap<View, f0> weakHashMap2 = z.f5921a;
                z.d.k(appBarLayout);
            }
            J(coordinatorLayout, appBarLayout);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) appBarLayout.getLayoutParams())).height == -2) {
                coordinatorLayout.s(appBarLayout, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0));
                return true;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final /* bridge */ /* synthetic */ void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
            G(coordinatorLayout, (AppBarLayout) view, view2, i11, iArr);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void l(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i12 < 0) {
                iArr[1] = A(coordinatorLayout, appBarLayout, i12, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i12 == 0) {
                J(coordinatorLayout, appBarLayout);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void n(View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (parcelable instanceof b) {
                this.f2981m = (b) parcelable;
            } else {
                this.f2981m = null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final Parcelable o(View view) {
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            b H = H(absSavedState, (AppBarLayout) view);
            return H == null ? absSavedState : H;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
            if (((r4.getTotalScrollRange() != 0) && r3.getHeight() - r5.getHeight() <= r4.getHeight()) != false) goto L17;
         */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean p(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6, int r7) {
            /*
                r2 = this;
                com.google.android.material.appbar.AppBarLayout r4 = (com.google.android.material.appbar.AppBarLayout) r4
                r6 = r6 & 2
                r0 = 1
                r1 = 0
                if (r6 == 0) goto L2c
                boolean r6 = r4.B
                if (r6 != 0) goto L2d
                int r6 = r4.getTotalScrollRange()
                if (r6 == 0) goto L14
                r6 = r0
                goto L15
            L14:
                r6 = r1
            L15:
                if (r6 == 0) goto L28
                int r3 = r3.getHeight()
                int r5 = r5.getHeight()
                int r3 = r3 - r5
                int r4 = r4.getHeight()
                if (r3 > r4) goto L28
                r3 = r0
                goto L29
            L28:
                r3 = r1
            L29:
                if (r3 == 0) goto L2c
                goto L2d
            L2c:
                r0 = r1
            L2d:
                if (r0 == 0) goto L36
                android.animation.ValueAnimator r3 = r2.f2980l
                if (r3 == 0) goto L36
                r3.cancel()
            L36:
                r3 = 0
                r2.f2982n = r3
                r2.f2979k = r7
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.p(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int, int):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f2979k == 0 || i10 == 1) {
                I(coordinatorLayout, appBarLayout);
                if (appBarLayout.B) {
                    appBarLayout.c(appBarLayout.d(view2));
                }
            }
            this.f2982n = new WeakReference<>(view2);
        }

        @Override // f5.b
        public final boolean v(View view) {
            View view2;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            WeakReference<View> weakReference = this.f2982n;
            return weakReference == null || ((view2 = weakReference.get()) != null && view2.isShown() && !view2.canScrollVertically(-1));
        }

        @Override // f5.b
        public final int w(View view) {
            return -((AppBarLayout) view).getDownNestedScrollRange();
        }

        @Override // f5.b
        public final int x(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        @Override // f5.b
        public final int y() {
            return s() + this.f2978j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // f5.b
        public final void z(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            I(coordinatorLayout, appBarLayout);
            if (appBarLayout.B) {
                appBarLayout.c(appBarLayout.d(F(coordinatorLayout)));
            }
        }
    }

    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes.dex */
    public static class ScrollingViewBehavior extends f5.c {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h6.a.O);
            this.f4542f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean b(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            int i10;
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) view2.getLayoutParams()).f1242a;
            if (cVar instanceof BaseBehavior) {
                int bottom = (view2.getBottom() - view.getTop()) + ((BaseBehavior) cVar).f2978j + this.f4541e;
                if (this.f4542f == 0) {
                    i10 = 0;
                } else {
                    float w10 = w(view2);
                    int i11 = this.f4542f;
                    i10 = c4.a.b((int) (w10 * i11), 0, i11);
                }
                int i12 = bottom - i10;
                WeakHashMap<View, f0> weakHashMap = z.f5921a;
                view.offsetTopAndBottom(i12);
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.B) {
                    appBarLayout.c(appBarLayout.d(view));
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final void e(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                z.m(f.a.f16405f.a(), coordinatorLayout);
                z.j(coordinatorLayout, 0);
                z.m(f.a.f16406g.a(), coordinatorLayout);
                z.j(coordinatorLayout, 0);
                z.p(coordinatorLayout, null);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean m(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            AppBarLayout v10 = v(coordinatorLayout.d(view));
            int i10 = 0;
            if (v10 != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f4539c;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    if (!z10) {
                        i10 = 4;
                    }
                    v10.f2976x = 2 | i10 | 8;
                    v10.requestLayout();
                    return true;
                }
            }
            return false;
        }

        @Override // f5.c
        public final float w(View view) {
            int i10;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                CoordinatorLayout.c cVar = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).f1242a;
                int y = cVar instanceof BaseBehavior ? ((BaseBehavior) cVar).y() : 0;
                if ((downNestedPreScrollRange == 0 || totalScrollRange + y > downNestedPreScrollRange) && (i10 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (y / i10) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // f5.c
        public final int x(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : view.getMeasuredHeight();
        }

        /* renamed from: y */
        public final AppBarLayout v(List<View> list) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = list.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a {
    }

    /* loaded from: classes.dex */
    public static class b extends a {

        /* renamed from: a */
        public final Rect f2989a = new Rect();

        /* renamed from: b */
        public final Rect f2990b = new Rect();
    }

    /* loaded from: classes.dex */
    public static class c extends LinearLayout.LayoutParams {

        /* renamed from: a */
        public int f2991a;

        /* renamed from: b */
        public a f2992b;

        /* renamed from: c */
        public Interpolator f2993c;

        public c() {
            super(-1, -2);
            this.f2991a = 1;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2991a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h6.a.f5099s);
            this.f2991a = obtainStyledAttributes.getInt(1, 0);
            this.f2992b = obtainStyledAttributes.getInt(0, 0) != 1 ? null : new b();
            if (obtainStyledAttributes.hasValue(2)) {
                this.f2993c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2991a = 1;
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2991a = 1;
        }

        public c(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2991a = 1;
        }
    }

    /* renamed from: a */
    public final c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new c((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    public final void b() {
        Behavior behavior = this.H;
        BaseBehavior.b H = (behavior == null || this.f2972t == -1 || this.f2976x != 0) ? null : behavior.H(s0.a.f17591t, this);
        this.f2972t = -1;
        this.f2973u = -1;
        this.f2974v = -1;
        if (H != null) {
            Behavior behavior2 = this.H;
            if (behavior2.f2981m != null) {
                return;
            }
            behavior2.f2981m = H;
        }
    }

    public final boolean c(boolean z10) {
        if (!(!this.y) || this.A == z10) {
            return false;
        }
        this.A = z10;
        refreshDrawableState();
        if (!this.B || !(getBackground() instanceof a6.g)) {
            return true;
        }
        a6.g gVar = (a6.g) getBackground();
        float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
        float f10 = z10 ? 0.0f : dimension;
        if (!z10) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.E;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, dimension);
        this.E = ofFloat;
        ofFloat.setDuration(getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
        this.E.setInterpolator(e5.a.f4408a);
        this.E.addUpdateListener(new f5.a(this, gVar));
        this.E.start();
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    public final boolean d(View view) {
        int i10;
        View view2 = null;
        if (this.D == null && (i10 = this.C) != -1) {
            View findViewById = view != null ? view.findViewById(i10) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.C);
            }
            if (findViewById != null) {
                this.D = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.D;
        if (weakReference != null) {
            view2 = weakReference.get();
        }
        if (view2 != null) {
            view = view2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.G != null && getTopInset() > 0) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.f2971s);
            this.G.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.G;
        if (drawable == null || !drawable.isStateful() || !drawable.setState(drawableState)) {
            return;
        }
        invalidateDrawable(drawable);
    }

    public final boolean e() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() == 8) {
                return false;
            }
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            return !z.d.b(childAt);
        }
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.H = behavior;
        return behavior;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int getDownNestedPreScrollRange() {
        /*
            r9 = this;
            int r0 = r9.f2973u
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            int r0 = r9.getChildCount()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = r1
        Le:
            if (r0 < 0) goto L60
            android.view.View r3 = r9.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$c r4 = (com.google.android.material.appbar.AppBarLayout.c) r4
            int r5 = r3.getMeasuredHeight()
            int r6 = r4.f2991a
            r7 = r6 & 5
            r8 = 5
            if (r7 != r8) goto L5a
            int r7 = r4.topMargin
            int r4 = r4.bottomMargin
            int r7 = r7 + r4
            r4 = r6 & 8
            if (r4 == 0) goto L36
            java.util.WeakHashMap<android.view.View, m0.f0> r4 = m0.z.f5921a
            int r4 = m0.z.d.d(r3)
        L34:
            int r4 = r4 + r7
            goto L45
        L36:
            r4 = r6 & 2
            if (r4 == 0) goto L43
            java.util.WeakHashMap<android.view.View, m0.f0> r4 = m0.z.f5921a
            int r4 = m0.z.d.d(r3)
            int r4 = r5 - r4
            goto L34
        L43:
            int r4 = r7 + r5
        L45:
            if (r0 != 0) goto L58
            java.util.WeakHashMap<android.view.View, m0.f0> r6 = m0.z.f5921a
            boolean r3 = m0.z.d.b(r3)
            if (r3 == 0) goto L58
            int r3 = r9.getTopInset()
            int r5 = r5 - r3
            int r4 = java.lang.Math.min(r4, r5)
        L58:
            int r2 = r2 + r4
            goto L5d
        L5a:
            if (r2 <= 0) goto L5d
            goto L60
        L5d:
            int r0 = r0 + (-1)
            goto Le
        L60:
            int r0 = java.lang.Math.max(r1, r2)
            r9.f2973u = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.getDownNestedPreScrollRange():int");
    }

    public int getDownNestedScrollRange() {
        int i10 = this.f2974v;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            c cVar = (c) childAt.getLayoutParams();
            int measuredHeight = ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + childAt.getMeasuredHeight();
            int i13 = cVar.f2991a;
            if ((i13 & 1) == 0) {
                break;
            }
            i12 += measuredHeight;
            if ((i13 & 2) != 0) {
                WeakHashMap<View, f0> weakHashMap = z.f5921a;
                i12 -= z.d.d(childAt);
                break;
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f2974v = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.C;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        int d5 = z.d.d(this);
        if (d5 == 0) {
            int childCount = getChildCount();
            d5 = childCount >= 1 ? z.d.d(getChildAt(childCount - 1)) : 0;
            if (d5 == 0) {
                return getHeight() / 3;
            }
        }
        return (d5 * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f2976x;
    }

    public Drawable getStatusBarForeground() {
        return this.G;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f2972t;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            c cVar = (c) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i13 = cVar.f2991a;
            if ((i13 & 1) == 0) {
                break;
            }
            int i14 = measuredHeight + ((LinearLayout.LayoutParams) cVar).topMargin + ((LinearLayout.LayoutParams) cVar).bottomMargin + i12;
            if (i11 == 0) {
                WeakHashMap<View, f0> weakHashMap = z.f5921a;
                if (z.d.b(childAt)) {
                    i14 -= getTopInset();
                }
            }
            i12 = i14;
            if ((i13 & 2) != 0) {
                WeakHashMap<View, f0> weakHashMap2 = z.f5921a;
                i12 -= z.d.d(childAt);
                break;
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f2972t = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof a6.g) {
            n.a.b(this, (a6.g) background);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        if (this.F == null) {
            this.F = new int[4];
        }
        int[] iArr = this.F;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z10 = this.f2977z;
        iArr[0] = z10 ? R.attr.state_liftable : -2130969565;
        iArr[1] = (!z10 || !this.A) ? -2130969566 : R.attr.state_lifted;
        iArr[2] = z10 ? R.attr.state_collapsible : -2130969563;
        iArr[3] = (!z10 || !this.A) ? -2130969562 : R.attr.state_collapsed;
        return View.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.D;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.D = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        super.onLayout(z10, i10, i11, i12, i13);
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        boolean z12 = true;
        if (z.d.b(this) && e()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                getChildAt(childCount).offsetTopAndBottom(topInset);
            }
        }
        b();
        this.f2975w = false;
        int childCount2 = getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount2) {
                break;
            } else if (((c) getChildAt(i14).getLayoutParams()).f2993c != null) {
                this.f2975w = true;
                break;
            } else {
                i14++;
            }
        }
        Drawable drawable = this.G;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.y) {
            if (!this.B) {
                int childCount3 = getChildCount();
                int i15 = 0;
                while (true) {
                    if (i15 >= childCount3) {
                        z11 = false;
                        break;
                    }
                    int i16 = ((c) getChildAt(i15).getLayoutParams()).f2991a;
                    if ((i16 & 1) == 1 && (i16 & 10) != 0) {
                        z11 = true;
                        break;
                    }
                    i15++;
                }
                if (!z11) {
                    z12 = false;
                }
            }
            if (this.f2977z == z12) {
                return;
            }
            this.f2977z = z12;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824) {
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            if (z.d.b(this) && e()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = c4.a.b(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i11));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        b();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        Drawable background = getBackground();
        if (background instanceof a6.g) {
            ((a6.g) background).n(f10);
        }
    }

    public void setExpanded(boolean z10) {
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        boolean c10 = z.g.c(this);
        int i10 = z10 ? 1 : 2;
        int i11 = 0;
        if (c10) {
            i11 = 4;
        }
        this.f2976x = i10 | i11 | 8;
        requestLayout();
    }

    public void setLiftOnScroll(boolean z10) {
        this.B = z10;
    }

    public void setLiftOnScrollTargetViewId(int i10) {
        this.C = i10;
        WeakReference<View> weakReference = this.D;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.D = null;
    }

    public void setLiftableOverrideEnabled(boolean z10) {
        this.y = z10;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (i10 == 1) {
            super.setOrientation(i10);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.G;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.G = drawable3;
            boolean z10 = false;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.G.setState(getDrawableState());
                }
                Drawable drawable4 = this.G;
                WeakHashMap<View, f0> weakHashMap = z.f5921a;
                a.c.b(drawable4, z.e.d(this));
                this.G.setVisible(getVisibility() == 0, false);
                this.G.setCallback(this);
            }
            if (this.G != null && getTopInset() > 0) {
                z10 = true;
            }
            setWillNotDraw(true ^ z10);
            WeakHashMap<View, f0> weakHashMap2 = z.f5921a;
            z.d.k(this);
        }
    }

    public void setStatusBarForegroundColor(int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(int i10) {
        setStatusBarForeground(f.a.b(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f10) {
        int integer = getResources().getInteger(R.integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j3 = integer;
        stateListAnimator.addState(new int[]{16842910, R.attr.state_liftable, -2130969566}, ObjectAnimator.ofFloat(this, "elevation", 0.0f).setDuration(j3));
        stateListAnimator.addState(new int[]{16842910}, ObjectAnimator.ofFloat(this, "elevation", f10).setDuration(j3));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(this, "elevation", 0.0f).setDuration(0L));
        setStateListAnimator(stateListAnimator);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.G;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.G;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: generateDefaultLayoutParams */
    public final LinearLayout.LayoutParams mo11generateDefaultLayoutParams() {
        return new c();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: generateLayoutParams */
    public final LinearLayout.LayoutParams mo12generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }
}
