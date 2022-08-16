package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Objects;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;
import n0.f;
import t0.c;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a */
    public c f3015a;

    /* renamed from: b */
    public boolean f3016b;

    /* renamed from: c */
    public int f3017c = 2;

    /* renamed from: d */
    public float f3018d = 0.5f;

    /* renamed from: e */
    public float f3019e = 0.0f;

    /* renamed from: f */
    public float f3020f = 0.5f;

    /* renamed from: g */
    public final a f3021g = new a();

    /* loaded from: classes.dex */
    public class a extends c.AbstractC0115c {

        /* renamed from: a */
        public int f3022a;

        /* renamed from: b */
        public int f3023b = -1;

        public a() {
            SwipeDismissBehavior.this = r1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
            if (r0 != false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
            r0 = r3.f3022a;
            r4 = r4.getWidth() + r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
            r0 = r3.f3022a - r4.getWidth();
            r4 = r3.f3022a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
            if (r0 != false) goto L12;
         */
        @Override // t0.c.AbstractC0115c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int a(android.view.View r4, int r5) {
            /*
                r3 = this;
                java.util.WeakHashMap<android.view.View, m0.f0> r0 = m0.z.f5921a
                int r0 = m0.z.e.d(r4)
                r1 = 1
                if (r0 != r1) goto Lb
                r0 = r1
                goto Lc
            Lb:
                r0 = 0
            Lc:
                com.google.android.material.behavior.SwipeDismissBehavior r2 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r2 = r2.f3017c
                if (r2 != 0) goto L15
                if (r0 == 0) goto L19
                goto L21
            L15:
                if (r2 != r1) goto L2b
                if (r0 == 0) goto L21
            L19:
                int r0 = r3.f3022a
                int r4 = r4.getWidth()
                int r4 = r4 + r0
                goto L39
            L21:
                int r0 = r3.f3022a
                int r4 = r4.getWidth()
                int r0 = r0 - r4
                int r4 = r3.f3022a
                goto L39
            L2b:
                int r0 = r3.f3022a
                int r1 = r4.getWidth()
                int r0 = r0 - r1
                int r1 = r3.f3022a
                int r4 = r4.getWidth()
                int r4 = r4 + r1
            L39:
                int r5 = java.lang.Math.max(r0, r5)
                int r4 = java.lang.Math.min(r5, r4)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.a(android.view.View, int):int");
        }

        @Override // t0.c.AbstractC0115c
        public final int b(View view, int i10) {
            return view.getTop();
        }

        @Override // t0.c.AbstractC0115c
        public final int c(View view) {
            return view.getWidth();
        }

        @Override // t0.c.AbstractC0115c
        public final void e(View view, int i10) {
            this.f3023b = i10;
            this.f3022a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // t0.c.AbstractC0115c
        public final void f(int i10) {
            Objects.requireNonNull(SwipeDismissBehavior.this);
        }

        @Override // t0.c.AbstractC0115c
        public final void g(View view, int i10, int i11) {
            float width = (view.getWidth() * SwipeDismissBehavior.this.f3019e) + this.f3022a;
            float width2 = (view.getWidth() * SwipeDismissBehavior.this.f3020f) + this.f3022a;
            float f10 = i10;
            if (f10 <= width) {
                view.setAlpha(1.0f);
            } else if (f10 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.t(1.0f - ((f10 - width) / (width2 - width))));
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
            if (java.lang.Math.abs(r8.getLeft() - r7.f3022a) >= java.lang.Math.round(r8.getWidth() * com.google.android.material.behavior.SwipeDismissBehavior.this.f3018d)) goto L22;
         */
        @Override // t0.c.AbstractC0115c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void h(android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                r10 = -1
                r7.f3023b = r10
                int r10 = r8.getWidth()
                r0 = 0
                int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L39
                java.util.WeakHashMap<android.view.View, m0.f0> r4 = m0.z.f5921a
                int r4 = m0.z.e.d(r8)
                if (r4 != r2) goto L18
                r4 = r2
                goto L19
            L18:
                r4 = r3
            L19:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r5 = r5.f3017c
                r6 = 2
                if (r5 != r6) goto L21
                goto L54
            L21:
                if (r5 != 0) goto L2d
                if (r4 == 0) goto L2a
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 >= 0) goto L56
                goto L54
            L2a:
                if (r1 <= 0) goto L56
                goto L54
            L2d:
                if (r5 != r2) goto L56
                if (r4 == 0) goto L34
                if (r1 <= 0) goto L56
                goto L54
            L34:
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 >= 0) goto L56
                goto L54
            L39:
                int r9 = r8.getLeft()
                int r0 = r7.f3022a
                int r9 = r9 - r0
                int r0 = r8.getWidth()
                float r0 = (float) r0
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r1 = r1.f3018d
                float r0 = r0 * r1
                int r0 = java.lang.Math.round(r0)
                int r9 = java.lang.Math.abs(r9)
                if (r9 < r0) goto L56
            L54:
                r9 = r2
                goto L57
            L56:
                r9 = r3
            L57:
                if (r9 == 0) goto L65
                int r9 = r8.getLeft()
                int r0 = r7.f3022a
                if (r9 >= r0) goto L63
                int r0 = r0 - r10
                goto L68
            L63:
                int r0 = r0 + r10
                goto L68
            L65:
                int r0 = r7.f3022a
                r2 = r3
            L68:
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                t0.c r9 = r9.f3015a
                int r10 = r8.getTop()
                boolean r9 = r9.s(r0, r10)
                if (r9 == 0) goto L83
                com.google.android.material.behavior.SwipeDismissBehavior$b r9 = new com.google.android.material.behavior.SwipeDismissBehavior$b
                com.google.android.material.behavior.SwipeDismissBehavior r10 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r9.<init>(r8, r2)
                java.util.WeakHashMap<android.view.View, m0.f0> r10 = m0.z.f5921a
                m0.z.d.m(r8, r9)
                goto L8a
            L83:
                if (r2 == 0) goto L8a
                com.google.android.material.behavior.SwipeDismissBehavior r8 = com.google.android.material.behavior.SwipeDismissBehavior.this
                java.util.Objects.requireNonNull(r8)
            L8a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.h(android.view.View, float, float):void");
        }

        @Override // t0.c.AbstractC0115c
        public final boolean i(View view, int i10) {
            int i11 = this.f3023b;
            return (i11 == -1 || i11 == i10) && SwipeDismissBehavior.this.s(view);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: s */
        public final View f3025s;

        /* renamed from: t */
        public final boolean f3026t;

        public b(View view, boolean z10) {
            SwipeDismissBehavior.this = r1;
            this.f3025s = view;
            this.f3026t = z10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c cVar = SwipeDismissBehavior.this.f3015a;
            if (cVar != null && cVar.h()) {
                View view = this.f3025s;
                WeakHashMap<View, f0> weakHashMap = z.f5921a;
                z.d.m(view, this);
            } else if (!this.f3026t) {
            } else {
                Objects.requireNonNull(SwipeDismissBehavior.this);
            }
        }
    }

    public static float t(float f10) {
        return Math.min(Math.max(0.0f, f10), 1.0f);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean g(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean z10 = this.f3016b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z10 = coordinatorLayout.p(v10, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f3016b = z10;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f3016b = false;
        }
        if (z10) {
            if (this.f3015a == null) {
                this.f3015a = new c(coordinatorLayout.getContext(), coordinatorLayout, this.f3021g);
            }
            return this.f3015a.t(motionEvent);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean h(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        WeakHashMap<View, f0> weakHashMap = z.f5921a;
        if (z.d.c(v10) == 0) {
            z.d.s(v10, 1);
            z.m(1048576, v10);
            z.j(v10, 0);
            if (s(v10)) {
                z.n(v10, f.a.f16409j, new g5.a(this));
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean r(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        c cVar = this.f3015a;
        if (cVar != null) {
            cVar.m(motionEvent);
            return true;
        }
        return false;
    }

    public boolean s(View view) {
        return true;
    }
}
