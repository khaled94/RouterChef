package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import java.util.WeakHashMap;
import n0.f;
import n0.g;

/* loaded from: classes.dex */
public class x extends m0.a {

    /* renamed from: d */
    public final RecyclerView f2218d;

    /* renamed from: e */
    public final a f2219e;

    /* loaded from: classes.dex */
    public static class a extends m0.a {

        /* renamed from: d */
        public final x f2220d;

        /* renamed from: e */
        public Map<View, m0.a> f2221e = new WeakHashMap();

        public a(x xVar) {
            this.f2220d = xVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<android.view.View, m0.a>, java.util.WeakHashMap] */
        @Override // m0.a
        public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
            m0.a aVar = (m0.a) this.f2221e.get(view);
            return aVar != null ? aVar.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<android.view.View, m0.a>, java.util.WeakHashMap] */
        @Override // m0.a
        public final g b(View view) {
            m0.a aVar = (m0.a) this.f2221e.get(view);
            return aVar != null ? aVar.b(view) : super.b(view);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<android.view.View, m0.a>, java.util.WeakHashMap] */
        @Override // m0.a
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            m0.a aVar = (m0.a) this.f2221e.get(view);
            if (aVar != null) {
                aVar.c(view, accessibilityEvent);
            } else {
                super.c(view, accessibilityEvent);
            }
        }

        /* JADX WARN: Type inference failed for: r0v9, types: [java.util.Map<android.view.View, m0.a>, java.util.WeakHashMap] */
        @Override // m0.a
        public final void d(View view, f fVar) {
            if (!this.f2220d.k() && this.f2220d.f2218d.getLayoutManager() != null) {
                this.f2220d.f2218d.getLayoutManager().Z(view, fVar);
                m0.a aVar = (m0.a) this.f2221e.get(view);
                if (aVar != null) {
                    aVar.d(view, fVar);
                    return;
                }
            }
            this.f5847a.onInitializeAccessibilityNodeInfo(view, fVar.f16401a);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<android.view.View, m0.a>, java.util.WeakHashMap] */
        @Override // m0.a
        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            m0.a aVar = (m0.a) this.f2221e.get(view);
            if (aVar != null) {
                aVar.e(view, accessibilityEvent);
            } else {
                super.e(view, accessibilityEvent);
            }
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<android.view.View, m0.a>, java.util.WeakHashMap] */
        @Override // m0.a
        public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            m0.a aVar = (m0.a) this.f2221e.get(viewGroup);
            return aVar != null ? aVar.f(viewGroup, view, accessibilityEvent) : super.f(viewGroup, view, accessibilityEvent);
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map<android.view.View, m0.a>, java.util.WeakHashMap] */
        @Override // m0.a
        public final boolean g(View view, int i10, Bundle bundle) {
            if (!this.f2220d.k() && this.f2220d.f2218d.getLayoutManager() != null) {
                m0.a aVar = (m0.a) this.f2221e.get(view);
                if (aVar != null) {
                    if (aVar.g(view, i10, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i10, bundle)) {
                    return true;
                }
                RecyclerView.s sVar = this.f2220d.f2218d.getLayoutManager().f1955b.f1910t;
                return false;
            }
            return super.g(view, i10, bundle);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<android.view.View, m0.a>, java.util.WeakHashMap] */
        @Override // m0.a
        public final void h(View view, int i10) {
            m0.a aVar = (m0.a) this.f2221e.get(view);
            if (aVar != null) {
                aVar.h(view, i10);
            } else {
                super.h(view, i10);
            }
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<android.view.View, m0.a>, java.util.WeakHashMap] */
        @Override // m0.a
        public final void i(View view, AccessibilityEvent accessibilityEvent) {
            m0.a aVar = (m0.a) this.f2221e.get(view);
            if (aVar != null) {
                aVar.i(view, accessibilityEvent);
            } else {
                super.i(view, accessibilityEvent);
            }
        }
    }

    public x(RecyclerView recyclerView) {
        this.f2218d = recyclerView;
        m0.a j3 = j();
        this.f2219e = (j3 == null || !(j3 instanceof a)) ? new a(this) : (a) j3;
    }

    @Override // m0.a
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || k()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        recyclerView.getLayoutManager().Y(accessibilityEvent);
    }

    @Override // m0.a
    public final void d(View view, f fVar) {
        this.f5847a.onInitializeAccessibilityNodeInfo(view, fVar.f16401a);
        if (k() || this.f2218d.getLayoutManager() == null) {
            return;
        }
        RecyclerView.m layoutManager = this.f2218d.getLayoutManager();
        RecyclerView recyclerView = layoutManager.f1955b;
        RecyclerView.s sVar = recyclerView.f1910t;
        RecyclerView.x xVar = recyclerView.x0;
        if (recyclerView.canScrollVertically(-1) || layoutManager.f1955b.canScrollHorizontally(-1)) {
            fVar.a(8192);
            fVar.v(true);
        }
        if (layoutManager.f1955b.canScrollVertically(1) || layoutManager.f1955b.canScrollHorizontally(1)) {
            fVar.a(4096);
            fVar.v(true);
        }
        fVar.o(f.b.a(layoutManager.P(sVar, xVar), layoutManager.z(sVar, xVar), 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0085 A[ADDED_TO_REGION] */
    @Override // m0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(android.view.View r4, int r5, android.os.Bundle r6) {
        /*
            r3 = this;
            boolean r4 = super.g(r4, r5, r6)
            r6 = 1
            if (r4 == 0) goto L8
            return r6
        L8:
            boolean r4 = r3.k()
            r0 = 0
            if (r4 != 0) goto L8f
            androidx.recyclerview.widget.RecyclerView r4 = r3.f2218d
            androidx.recyclerview.widget.RecyclerView$m r4 = r4.getLayoutManager()
            if (r4 == 0) goto L8f
            androidx.recyclerview.widget.RecyclerView r4 = r3.f2218d
            androidx.recyclerview.widget.RecyclerView$m r4 = r4.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r1 = r4.f1955b
            androidx.recyclerview.widget.RecyclerView$s r2 = r1.f1910t
            r2 = 4096(0x1000, float:5.74E-42)
            if (r5 == r2) goto L58
            r2 = 8192(0x2000, float:1.14794E-41)
            if (r5 == r2) goto L2c
            r5 = r0
            r1 = r5
            goto L83
        L2c:
            r5 = -1
            boolean r1 = r1.canScrollVertically(r5)
            if (r1 == 0) goto L41
            int r1 = r4.f1969q
            int r2 = r4.M()
            int r1 = r1 - r2
            int r2 = r4.J()
            int r1 = r1 - r2
            int r1 = -r1
            goto L42
        L41:
            r1 = r0
        L42:
            androidx.recyclerview.widget.RecyclerView r2 = r4.f1955b
            boolean r5 = r2.canScrollHorizontally(r5)
            if (r5 == 0) goto L82
            int r5 = r4.p
            int r2 = r4.K()
            int r5 = r5 - r2
            int r2 = r4.L()
            int r5 = r5 - r2
            int r5 = -r5
            goto L83
        L58:
            boolean r5 = r1.canScrollVertically(r6)
            if (r5 == 0) goto L6c
            int r5 = r4.f1969q
            int r1 = r4.M()
            int r5 = r5 - r1
            int r1 = r4.J()
            int r5 = r5 - r1
            r1 = r5
            goto L6d
        L6c:
            r1 = r0
        L6d:
            androidx.recyclerview.widget.RecyclerView r5 = r4.f1955b
            boolean r5 = r5.canScrollHorizontally(r6)
            if (r5 == 0) goto L82
            int r5 = r4.p
            int r2 = r4.K()
            int r5 = r5 - r2
            int r2 = r4.L()
            int r5 = r5 - r2
            goto L83
        L82:
            r5 = r0
        L83:
            if (r1 != 0) goto L89
            if (r5 != 0) goto L89
            r6 = r0
            goto L8e
        L89:
            androidx.recyclerview.widget.RecyclerView r4 = r4.f1955b
            r4.h0(r5, r1, r6)
        L8e:
            return r6
        L8f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.x.g(android.view.View, int, android.os.Bundle):boolean");
    }

    public m0.a j() {
        return this.f2219e;
    }

    public final boolean k() {
        return this.f2218d.M();
    }
}
