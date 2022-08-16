package com.google.android.material.bottomsheet;

import a6.g;
import a6.j;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.e0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.raouf.routerchef.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;
import n0.f;
import t0.c;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public int A;
    public int B;
    public int C;
    public float D;
    public int E;
    public float F;
    public boolean G;
    public boolean H;
    public boolean I;
    public int J;
    public t0.c K;
    public boolean L;
    public int M;
    public boolean N;
    public int O;
    public int P;
    public int Q;
    public WeakReference<V> R;
    public WeakReference<View> S;
    public final ArrayList<c> T;
    public VelocityTracker U;
    public int V;
    public int W;
    public boolean X;
    public Map<View, Integer> Y;
    public int Z;

    /* renamed from: a */
    public int f3045a;

    /* renamed from: a0 */
    public final b f3046a0;

    /* renamed from: b */
    public boolean f3047b;

    /* renamed from: c */
    public float f3048c;

    /* renamed from: d */
    public int f3049d;

    /* renamed from: e */
    public boolean f3050e;

    /* renamed from: f */
    public int f3051f;

    /* renamed from: g */
    public int f3052g;

    /* renamed from: h */
    public g f3053h;

    /* renamed from: i */
    public ColorStateList f3054i;

    /* renamed from: j */
    public int f3055j;

    /* renamed from: k */
    public int f3056k;

    /* renamed from: l */
    public int f3057l;

    /* renamed from: m */
    public boolean f3058m;

    /* renamed from: n */
    public boolean f3059n;

    /* renamed from: o */
    public boolean f3060o;
    public boolean p;

    /* renamed from: q */
    public boolean f3061q;

    /* renamed from: r */
    public boolean f3062r;

    /* renamed from: s */
    public boolean f3063s;

    /* renamed from: t */
    public boolean f3064t;

    /* renamed from: u */
    public int f3065u;

    /* renamed from: v */
    public int f3066v;

    /* renamed from: w */
    public j f3067w;

    /* renamed from: x */
    public boolean f3068x;
    public final BottomSheetBehavior<V>.e y;

    /* renamed from: z */
    public ValueAnimator f3069z;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: s */
        public final /* synthetic */ View f3070s;

        /* renamed from: t */
        public final /* synthetic */ int f3071t;

        public a(View view, int i10) {
            BottomSheetBehavior.this = r1;
            this.f3070s = view;
            this.f3071t = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BottomSheetBehavior.this.E(this.f3070s, this.f3071t, false);
        }
    }

    /* loaded from: classes.dex */
    public class b extends c.AbstractC0115c {
        public b() {
            BottomSheetBehavior.this = r1;
        }

        @Override // t0.c.AbstractC0115c
        public final int a(View view, int i10) {
            return view.getLeft();
        }

        @Override // t0.c.AbstractC0115c
        public final int b(View view, int i10) {
            int x10 = BottomSheetBehavior.this.x();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return c4.a.b(i10, x10, bottomSheetBehavior.G ? bottomSheetBehavior.Q : bottomSheetBehavior.E);
        }

        @Override // t0.c.AbstractC0115c
        public final int d() {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.G ? bottomSheetBehavior.Q : bottomSheetBehavior.E;
        }

        @Override // t0.c.AbstractC0115c
        public final void f(int i10) {
            if (i10 == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (!bottomSheetBehavior.I) {
                    return;
                }
                bottomSheetBehavior.C(1);
            }
        }

        @Override // t0.c.AbstractC0115c
        public final void g(View view, int i10, int i11) {
            BottomSheetBehavior.this.u(i11);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
            if (java.lang.Math.abs(r8.getTop() - com.google.android.material.bottomsheet.BottomSheetBehavior.this.x()) < java.lang.Math.abs(r8.getTop() - com.google.android.material.bottomsheet.BottomSheetBehavior.this.C)) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00b2, code lost:
            if (java.lang.Math.abs(r9 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.C) < java.lang.Math.abs(r9 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.E)) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00d6, code lost:
            if (java.lang.Math.abs(r9 - r10.B) < java.lang.Math.abs(r9 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.E)) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00e6, code lost:
            if (r9 < java.lang.Math.abs(r9 - r10.E)) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00f9, code lost:
            if (java.lang.Math.abs(r9 - r0) < java.lang.Math.abs(r9 - com.google.android.material.bottomsheet.BottomSheetBehavior.this.E)) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
            if (r9 > com.google.android.material.bottomsheet.BottomSheetBehavior.this.C) goto L36;
         */
        @Override // t0.c.AbstractC0115c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void h(android.view.View r8, float r9, float r10) {
            /*
                Method dump skipped, instructions count: 261
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.b.h(android.view.View, float, float):void");
        }

        @Override // t0.c.AbstractC0115c
        public final boolean i(View view, int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.J;
            if (i11 != 1 && !bottomSheetBehavior.X) {
                if (i11 == 3 && bottomSheetBehavior.V == i10) {
                    WeakReference<View> weakReference = bottomSheetBehavior.S;
                    View view2 = weakReference != null ? weakReference.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                System.currentTimeMillis();
                WeakReference<V> weakReference2 = BottomSheetBehavior.this.R;
                return weakReference2 != null && weakReference2.get() == view;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
        public abstract void a();

        public abstract void b();
    }

    /* loaded from: classes.dex */
    public static class d extends s0.a {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: u */
        public final int f3074u;

        /* renamed from: v */
        public int f3075v;

        /* renamed from: w */
        public boolean f3076w;

        /* renamed from: x */
        public boolean f3077x;
        public boolean y;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<d> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new d(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new d[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }
        }

        public d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3074u = parcel.readInt();
            this.f3075v = parcel.readInt();
            boolean z10 = false;
            this.f3076w = parcel.readInt() == 1;
            this.f3077x = parcel.readInt() == 1;
            this.y = parcel.readInt() == 1 ? true : z10;
        }

        public d(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f3074u = bottomSheetBehavior.J;
            this.f3075v = bottomSheetBehavior.f3049d;
            this.f3076w = bottomSheetBehavior.f3047b;
            this.f3077x = bottomSheetBehavior.G;
            this.y = bottomSheetBehavior.H;
        }

        @Override // s0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f17592s, i10);
            parcel.writeInt(this.f3074u);
            parcel.writeInt(this.f3075v);
            parcel.writeInt(this.f3076w ? 1 : 0);
            parcel.writeInt(this.f3077x ? 1 : 0);
            parcel.writeInt(this.y ? 1 : 0);
        }
    }

    /* loaded from: classes.dex */
    public class e {

        /* renamed from: a */
        public int f3078a;

        /* renamed from: b */
        public boolean f3079b;

        /* renamed from: c */
        public final a f3080c = new a();

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
                e.this = r1;
            }

            @Override // java.lang.Runnable
            public final void run() {
                e eVar = e.this;
                eVar.f3079b = false;
                t0.c cVar = BottomSheetBehavior.this.K;
                if (cVar != null && cVar.h()) {
                    e eVar2 = e.this;
                    eVar2.a(eVar2.f3078a);
                    return;
                }
                e eVar3 = e.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.J != 2) {
                    return;
                }
                bottomSheetBehavior.C(eVar3.f3078a);
            }
        }

        public e() {
            BottomSheetBehavior.this = r1;
        }

        public final void a(int i10) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.R;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f3078a = i10;
            if (this.f3079b) {
                return;
            }
            a aVar = this.f3080c;
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            z.d.m(BottomSheetBehavior.this.R.get(), aVar);
            this.f3079b = true;
        }
    }

    public BottomSheetBehavior() {
        this.f3045a = 0;
        this.f3047b = true;
        this.f3055j = -1;
        this.f3056k = -1;
        this.y = new e();
        this.D = 0.5f;
        this.F = -1.0f;
        this.I = true;
        this.J = 4;
        this.T = new ArrayList<>();
        this.Z = -1;
        this.f3046a0 = new b();
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i10;
        int i11;
        this.f3045a = 0;
        this.f3047b = true;
        this.f3055j = -1;
        this.f3056k = -1;
        this.y = new e();
        this.D = 0.5f;
        this.F = -1.0f;
        this.I = true;
        this.J = 4;
        this.T = new ArrayList<>();
        this.Z = -1;
        this.f3046a0 = new b();
        this.f3052g = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h6.a.f5100t);
        int i12 = 3;
        if (obtainStyledAttributes.hasValue(3)) {
            this.f3054i = x5.c.a(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(20)) {
            this.f3067w = new j(j.b(context, attributeSet, R.attr.bottomSheetStyle, 2131952433));
        }
        if (this.f3067w != null) {
            g gVar = new g(this.f3067w);
            this.f3053h = gVar;
            gVar.m(context);
            ColorStateList colorStateList = this.f3054i;
            if (colorStateList != null) {
                this.f3053h.o(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f3053h.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f3069z = ofFloat;
        ofFloat.setDuration(500L);
        this.f3069z.addUpdateListener(new i5.a(this));
        this.F = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f3055j = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f3056k = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue == null || (i11 = peekValue.data) != -1) {
            A(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        } else {
            A(i11);
        }
        boolean z10 = obtainStyledAttributes.getBoolean(8, false);
        if (this.G != z10) {
            this.G = z10;
            if (!z10 && this.J == 5) {
                B(4);
            }
            F();
        }
        this.f3058m = obtainStyledAttributes.getBoolean(12, false);
        boolean z11 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f3047b != z11) {
            this.f3047b = z11;
            if (this.R != null) {
                s();
            }
            C((!this.f3047b || this.J != 6) ? this.J : i12);
            F();
        }
        this.H = obtainStyledAttributes.getBoolean(11, false);
        this.I = obtainStyledAttributes.getBoolean(4, true);
        this.f3045a = obtainStyledAttributes.getInt(10, 0);
        float f10 = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f10 > 0.0f && f10 < 1.0f) {
            this.D = f10;
            if (this.R != null) {
                this.C = (int) ((1.0f - f10) * this.Q);
            }
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
            if (peekValue2 == null || peekValue2.type != 16) {
                i10 = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
                if (i10 < 0) {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                i10 = peekValue2.data;
                if (i10 < 0) {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.A = i10;
            this.f3059n = obtainStyledAttributes.getBoolean(16, false);
            this.f3060o = obtainStyledAttributes.getBoolean(17, false);
            this.p = obtainStyledAttributes.getBoolean(18, false);
            this.f3061q = obtainStyledAttributes.getBoolean(19, true);
            this.f3062r = obtainStyledAttributes.getBoolean(13, false);
            this.f3063s = obtainStyledAttributes.getBoolean(14, false);
            this.f3064t = obtainStyledAttributes.getBoolean(15, false);
            obtainStyledAttributes.recycle();
            this.f3048c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    public final void A(int i10) {
        boolean z10 = true;
        if (i10 == -1) {
            if (!this.f3050e) {
                this.f3050e = true;
            }
            z10 = false;
        } else {
            if (this.f3050e || this.f3049d != i10) {
                this.f3050e = false;
                this.f3049d = Math.max(0, i10);
            }
            z10 = false;
        }
        if (z10) {
            I();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
        if (m0.z.g.b(r4) != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(int r4) {
        /*
            r3 = this;
            r0 = 1
            if (r4 == r0) goto L74
            r1 = 2
            if (r4 != r1) goto L8
            goto L74
        L8:
            boolean r1 = r3.G
            if (r1 != 0) goto L26
            r1 = 5
            if (r4 != r1) goto L26
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot set state: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "BottomSheetBehavior"
            android.util.Log.w(r0, r4)
            return
        L26:
            r1 = 6
            if (r4 != r1) goto L37
            boolean r1 = r3.f3047b
            if (r1 == 0) goto L37
            int r1 = r3.y(r4)
            int r2 = r3.B
            if (r1 > r2) goto L37
            r1 = 3
            goto L38
        L37:
            r1 = r4
        L38:
            java.lang.ref.WeakReference<V extends android.view.View> r2 = r3.R
            if (r2 == 0) goto L70
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L43
            goto L70
        L43:
            java.lang.ref.WeakReference<V extends android.view.View> r4 = r3.R
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            com.google.android.material.bottomsheet.BottomSheetBehavior$a r2 = new com.google.android.material.bottomsheet.BottomSheetBehavior$a
            r2.<init>(r4, r1)
            android.view.ViewParent r1 = r4.getParent()
            if (r1 == 0) goto L65
            boolean r1 = r1.isLayoutRequested()
            if (r1 == 0) goto L65
            java.util.WeakHashMap<android.view.View, m0.f0> r1 = m0.z.f5921a
            boolean r1 = m0.z.g.b(r4)
            if (r1 == 0) goto L65
            goto L66
        L65:
            r0 = 0
        L66:
            if (r0 == 0) goto L6c
            r4.post(r2)
            goto L73
        L6c:
            r2.run()
            goto L73
        L70:
            r3.C(r4)
        L73:
            return
        L74:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "STATE_"
            java.lang.StringBuilder r2 = androidx.activity.result.a.c(r2)
            if (r4 != r0) goto L81
            java.lang.String r4 = "DRAGGING"
            goto L83
        L81:
            java.lang.String r4 = "SETTLING"
        L83:
            java.lang.String r0 = " should not be set externally."
            java.lang.String r4 = s.b.b(r2, r4, r0)
            r1.<init>(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.B(int):void");
    }

    public final void C(int i10) {
        if (this.J == i10) {
            return;
        }
        this.J = i10;
        WeakReference<V> weakReference = this.R;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        if (i10 == 3) {
            H(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            H(false);
        }
        G(i10);
        for (int i11 = 0; i11 < this.T.size(); i11++) {
            this.T.get(i11).b();
        }
        F();
    }

    public final boolean D(View view, float f10) {
        if (this.H) {
            return true;
        }
        if (view.getTop() < this.E) {
            return false;
        }
        return Math.abs(((f10 * 0.1f) + ((float) view.getTop())) - ((float) this.E)) / ((float) t()) > 0.5f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
        if (r4 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r1.s(r4.getLeft(), r0) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E(android.view.View r4, int r5, boolean r6) {
        /*
            r3 = this;
            int r0 = r3.y(r5)
            t0.c r1 = r3.K
            r2 = 0
            if (r1 == 0) goto L33
            if (r6 == 0) goto L16
            int r4 = r4.getLeft()
            boolean r4 = r1.s(r4, r0)
            if (r4 == 0) goto L33
            goto L32
        L16:
            int r6 = r4.getLeft()
            r1.f18444r = r4
            r4 = -1
            r1.f18430c = r4
            boolean r4 = r1.k(r6, r0, r2, r2)
            if (r4 != 0) goto L30
            int r6 = r1.f18428a
            if (r6 != 0) goto L30
            android.view.View r6 = r1.f18444r
            if (r6 == 0) goto L30
            r6 = 0
            r1.f18444r = r6
        L30:
            if (r4 == 0) goto L33
        L32:
            r2 = 1
        L33:
            if (r2 == 0) goto L42
            r4 = 2
            r3.C(r4)
            r3.G(r5)
            com.google.android.material.bottomsheet.BottomSheetBehavior<V>$e r4 = r3.y
            r4.a(r5)
            goto L45
        L42:
            r3.C(r5)
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.E(android.view.View, int, boolean):void");
    }

    public final void F() {
        V v10;
        f.a aVar;
        int i10;
        WeakReference<V> weakReference = this.R;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        z.m(524288, v10);
        z.j(v10, 0);
        z.m(262144, v10);
        z.j(v10, 0);
        z.m(1048576, v10);
        z.j(v10, 0);
        int i11 = this.Z;
        if (i11 != -1) {
            z.m(i11, v10);
            z.j(v10, 0);
        }
        int i12 = 6;
        if (!this.f3047b && this.J != 6) {
            String string = v10.getResources().getString(R.string.bottomsheet_action_expand_halfway);
            i5.c cVar = new i5.c(this, 6);
            List<f.a> h10 = z.h(v10);
            int i13 = 0;
            while (true) {
                if (i13 >= h10.size()) {
                    int i14 = 0;
                    int i15 = -1;
                    while (true) {
                        int[] iArr = z.f5924d;
                        if (i14 >= iArr.length || i15 != -1) {
                            break;
                        }
                        int i16 = iArr[i14];
                        boolean z10 = true;
                        for (int i17 = 0; i17 < h10.size(); i17++) {
                            z10 &= h10.get(i17).a() != i16;
                        }
                        if (z10) {
                            i15 = i16;
                        }
                        i14++;
                    }
                    i10 = i15;
                } else if (TextUtils.equals(string, h10.get(i13).b())) {
                    i10 = h10.get(i13).a();
                    break;
                } else {
                    i13++;
                }
            }
            if (i10 != -1) {
                z.a(v10, new f.a(null, i10, string, cVar, null));
            }
            this.Z = i10;
        }
        if (this.G && this.J != 5) {
            z(v10, f.a.f16409j, 5);
        }
        int i18 = this.J;
        if (i18 == 3) {
            if (this.f3047b) {
                i12 = 4;
            }
            aVar = f.a.f16408i;
        } else if (i18 != 4) {
            if (i18 != 6) {
                return;
            }
            z(v10, f.a.f16408i, 4);
            z(v10, f.a.f16407h, 3);
            return;
        } else {
            if (this.f3047b) {
                i12 = 3;
            }
            aVar = f.a.f16407h;
        }
        z(v10, aVar, i12);
    }

    public final void G(int i10) {
        ValueAnimator valueAnimator;
        if (i10 == 2) {
            return;
        }
        boolean z10 = i10 == 3;
        if (this.f3068x == z10) {
            return;
        }
        this.f3068x = z10;
        if (this.f3053h == null || (valueAnimator = this.f3069z) == null) {
            return;
        }
        if (valueAnimator.isRunning()) {
            this.f3069z.reverse();
            return;
        }
        float f10 = z10 ? 0.0f : 1.0f;
        this.f3069z.setFloatValues(1.0f - f10, f10);
        this.f3069z.start();
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Map<android.view.View, java.lang.Integer>, java.util.HashMap] */
    public final void H(boolean z10) {
        WeakReference<V> weakReference = this.R;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
        int childCount = coordinatorLayout.getChildCount();
        if (z10) {
            if (this.Y != null) {
                return;
            }
            this.Y = new HashMap(childCount);
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = coordinatorLayout.getChildAt(i10);
            if (childAt != this.R.get() && z10) {
                this.Y.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
            }
        }
        if (z10) {
            return;
        }
        this.Y = null;
    }

    public final void I() {
        V v10;
        if (this.R != null) {
            s();
            if (this.J != 4 || (v10 = this.R.get()) == null) {
                return;
            }
            v10.requestLayout();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void c(CoordinatorLayout.f fVar) {
        this.R = null;
        this.K = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void f() {
        this.R = null;
        this.K = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean g(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        t0.c cVar;
        if (v10.isShown() && this.I) {
            int actionMasked = motionEvent.getActionMasked();
            View view = null;
            if (actionMasked == 0) {
                this.V = -1;
                VelocityTracker velocityTracker = this.U;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.U = null;
                }
            }
            if (this.U == null) {
                this.U = VelocityTracker.obtain();
            }
            this.U.addMovement(motionEvent);
            if (actionMasked == 0) {
                int x10 = (int) motionEvent.getX();
                this.W = (int) motionEvent.getY();
                if (this.J != 2) {
                    WeakReference<View> weakReference = this.S;
                    View view2 = weakReference != null ? weakReference.get() : null;
                    if (view2 != null && coordinatorLayout.p(view2, x10, this.W)) {
                        this.V = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.X = true;
                    }
                }
                this.L = this.V == -1 && !coordinatorLayout.p(v10, x10, this.W);
            } else if (actionMasked == 1 || actionMasked == 3) {
                this.X = false;
                this.V = -1;
                if (this.L) {
                    this.L = false;
                    return false;
                }
            }
            if (!this.L && (cVar = this.K) != null && cVar.t(motionEvent)) {
                return true;
            }
            WeakReference<View> weakReference2 = this.S;
            if (weakReference2 != null) {
                view = weakReference2.get();
            }
            return actionMasked == 2 && view != null && !this.L && this.J != 1 && !coordinatorLayout.p(view, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.K != null && Math.abs(((float) this.W) - motionEvent.getY()) > ((float) this.K.f18429b);
        }
        this.L = true;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0162 A[LOOP:0: B:83:0x015a->B:85:0x0162, LOOP_END] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(androidx.coordinatorlayout.widget.CoordinatorLayout r11, V r12, int r13) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.h(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(w(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f3055j, marginLayoutParams.width), w(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, this.f3056k, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean j(View view) {
        WeakReference<View> weakReference = this.S;
        return (weakReference == null || view != weakReference.get() || this.J == 3) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void k(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr, int i12) {
        int i13;
        if (i12 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.S;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v10.getTop();
        int i14 = top - i11;
        if (i11 > 0) {
            if (i14 < x()) {
                iArr[1] = top - x();
                WeakHashMap<View, f0> weakHashMap = z.f5921a;
                v10.offsetTopAndBottom(-iArr[1]);
                i13 = 3;
                C(i13);
            } else if (!this.I) {
                return;
            } else {
                iArr[1] = i11;
                int i15 = -i11;
                WeakHashMap<View, f0> weakHashMap2 = z.f5921a;
                v10.offsetTopAndBottom(i15);
                C(1);
            }
        } else if (i11 < 0 && !view.canScrollVertically(-1)) {
            int i16 = this.E;
            if (i14 > i16 && !this.G) {
                iArr[1] = top - i16;
                WeakHashMap<View, f0> weakHashMap3 = z.f5921a;
                v10.offsetTopAndBottom(-iArr[1]);
                i13 = 4;
                C(i13);
            } else if (!this.I) {
                return;
            } else {
                iArr[1] = i11;
                int i152 = -i11;
                WeakHashMap<View, f0> weakHashMap22 = z.f5921a;
                v10.offsetTopAndBottom(i152);
                C(1);
            }
        }
        u(v10.getTop());
        this.M = i11;
        this.N = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void l(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void n(View view, Parcelable parcelable) {
        d dVar = (d) parcelable;
        int i10 = this.f3045a;
        if (i10 != 0) {
            if (i10 == -1 || (i10 & 1) == 1) {
                this.f3049d = dVar.f3075v;
            }
            if (i10 == -1 || (i10 & 2) == 2) {
                this.f3047b = dVar.f3076w;
            }
            if (i10 == -1 || (i10 & 4) == 4) {
                this.G = dVar.f3077x;
            }
            if (i10 == -1 || (i10 & 8) == 8) {
                this.H = dVar.y;
            }
        }
        int i11 = dVar.f3074u;
        if (i11 == 1 || i11 == 2) {
            this.J = 4;
        } else {
            this.J = i11;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final Parcelable o(View view) {
        return new d((Parcelable) View.BaseSavedState.EMPTY_STATE, (BottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11) {
        this.M = 0;
        this.N = false;
        return (i10 & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
        if (r5.getTop() <= r3.C) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
        if (java.lang.Math.abs(r4 - r3.B) < java.lang.Math.abs(r4 - r3.E)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
        if (r4 < java.lang.Math.abs(r4 - r3.E)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0090, code lost:
        if (java.lang.Math.abs(r4 - r1) < java.lang.Math.abs(r4 - r3.E)) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ab, code lost:
        if (java.lang.Math.abs(r4 - r3.C) < java.lang.Math.abs(r4 - r3.E)) goto L43;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(androidx.coordinatorlayout.widget.CoordinatorLayout r4, V r5, android.view.View r6, int r7) {
        /*
            r3 = this;
            int r4 = r5.getTop()
            int r7 = r3.x()
            r0 = 3
            if (r4 != r7) goto Lf
            r3.C(r0)
            return
        Lf:
            java.lang.ref.WeakReference<android.view.View> r4 = r3.S
            if (r4 == 0) goto Lb6
            java.lang.Object r4 = r4.get()
            if (r6 != r4) goto Lb6
            boolean r4 = r3.N
            if (r4 != 0) goto L1f
            goto Lb6
        L1f:
            int r4 = r3.M
            r6 = 4
            r7 = 6
            if (r4 <= 0) goto L35
            boolean r4 = r3.f3047b
            if (r4 == 0) goto L2b
            goto Lb0
        L2b:
            int r4 = r5.getTop()
            int r6 = r3.C
            if (r4 <= r6) goto Lb0
            goto Lad
        L35:
            boolean r4 = r3.G
            if (r4 == 0) goto L56
            android.view.VelocityTracker r4 = r3.U
            if (r4 != 0) goto L3f
            r4 = 0
            goto L4e
        L3f:
            r1 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.f3048c
            r4.computeCurrentVelocity(r1, r2)
            android.view.VelocityTracker r4 = r3.U
            int r1 = r3.V
            float r4 = r4.getYVelocity(r1)
        L4e:
            boolean r4 = r3.D(r5, r4)
            if (r4 == 0) goto L56
            r0 = 5
            goto Lb0
        L56:
            int r4 = r3.M
            if (r4 != 0) goto L93
            int r4 = r5.getTop()
            boolean r1 = r3.f3047b
            if (r1 == 0) goto L74
            int r7 = r3.B
            int r7 = r4 - r7
            int r7 = java.lang.Math.abs(r7)
            int r1 = r3.E
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r7 >= r4) goto Laf
            goto Lb0
        L74:
            int r1 = r3.C
            if (r4 >= r1) goto L83
            int r6 = r3.E
            int r6 = r4 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r4 >= r6) goto Lad
            goto Lb0
        L83:
            int r0 = r4 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r3.E
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r0 >= r4) goto Laf
            goto Lad
        L93:
            boolean r4 = r3.f3047b
            if (r4 == 0) goto L98
            goto Laf
        L98:
            int r4 = r5.getTop()
            int r0 = r3.C
            int r0 = r4 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r3.E
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r0 >= r4) goto Laf
        Lad:
            r0 = r7
            goto Lb0
        Laf:
            r0 = r6
        Lb0:
            r4 = 0
            r3.E(r5, r0, r4)
            r3.N = r4
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.q(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean r(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean z10 = false;
        if (!v10.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i10 = this.J;
        if (i10 == 1 && actionMasked == 0) {
            return true;
        }
        t0.c cVar = this.K;
        if (cVar != null && (this.I || i10 == 1)) {
            cVar.m(motionEvent);
        }
        if (actionMasked == 0) {
            this.V = -1;
            VelocityTracker velocityTracker = this.U;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.U = null;
            }
        }
        if (this.U == null) {
            this.U = VelocityTracker.obtain();
        }
        this.U.addMovement(motionEvent);
        if (this.K != null && (this.I || this.J == 1)) {
            z10 = true;
        }
        if (z10 && actionMasked == 2 && !this.L) {
            float abs = Math.abs(this.W - motionEvent.getY());
            t0.c cVar2 = this.K;
            if (abs > cVar2.f18429b) {
                cVar2.b(v10, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.L;
    }

    public final void s() {
        int t10 = t();
        if (this.f3047b) {
            this.E = Math.max(this.Q - t10, this.B);
        } else {
            this.E = this.Q - t10;
        }
    }

    public final int t() {
        int i10;
        return this.f3050e ? Math.min(Math.max(this.f3051f, this.Q - ((this.P * 9) / 16)), this.O) + this.f3065u : (this.f3058m || this.f3059n || (i10 = this.f3057l) <= 0) ? this.f3049d + this.f3065u : Math.max(this.f3049d, i10 + this.f3052g);
    }

    public final void u(int i10) {
        if (this.R.get() == null || this.T.isEmpty()) {
            return;
        }
        int i11 = this.E;
        if (i10 <= i11 && i11 != x()) {
            x();
        }
        for (int i12 = 0; i12 < this.T.size(); i12++) {
            this.T.get(i12).a();
        }
    }

    public final View v(View view) {
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        if (z.i.p(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View v10 = v(viewGroup.getChildAt(i10));
            if (v10 != null) {
                return v10;
            }
        }
        return null;
    }

    public final int w(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
        }
        if (size != 0) {
            i12 = Math.min(size, i12);
        }
        return View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
    }

    public final int x() {
        if (this.f3047b) {
            return this.B;
        }
        return Math.max(this.A, this.f3061q ? 0 : this.f3066v);
    }

    public final int y(int i10) {
        if (i10 != 3) {
            if (i10 == 4) {
                return this.E;
            }
            if (i10 == 5) {
                return this.Q;
            }
            if (i10 != 6) {
                throw new IllegalArgumentException(e0.a("Invalid state to get top offset: ", i10));
            }
            return this.C;
        }
        return x();
    }

    public final void z(V v10, f.a aVar, int i10) {
        z.n(v10, aVar, new i5.c(this, i10));
    }
}
