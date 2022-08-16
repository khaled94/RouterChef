package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.e0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import java.util.Objects;
import n0.f;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public int[] I;
    public View[] J;
    public boolean G = false;
    public int H = -1;
    public final SparseIntArray K = new SparseIntArray();
    public final SparseIntArray L = new SparseIntArray();
    public a M = new a();
    public final Rect N = new Rect();

    /* loaded from: classes.dex */
    public static final class a extends c {
    }

    /* loaded from: classes.dex */
    public static class b extends RecyclerView.n {

        /* renamed from: e */
        public int f1854e = -1;

        /* renamed from: f */
        public int f1855f = 0;

        public b(int i10, int i11) {
            super(i10, i11);
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a */
        public final SparseIntArray f1856a = new SparseIntArray();

        /* renamed from: b */
        public final SparseIntArray f1857b = new SparseIntArray();

        public final int a(int i10, int i11) {
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                i12++;
                if (i12 == i11) {
                    i13++;
                    i12 = 0;
                } else if (i12 > i11) {
                    i13++;
                    i12 = 1;
                }
            }
            return i12 + 1 > i11 ? i13 + 1 : i13;
        }

        public final void b() {
            this.f1857b.clear();
        }

        public final void c() {
            this.f1856a.clear();
        }
    }

    public GridLayoutManager(Context context, int i10) {
        super(1);
        v1(i10);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        v1(RecyclerView.m.O(context, attributeSet, i10, i11).f1973b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final boolean H0() {
        return this.B == null && !this.G;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void J0(RecyclerView.x xVar, LinearLayoutManager.c cVar, RecyclerView.m.c cVar2) {
        int i10 = this.H;
        for (int i11 = 0; i11 < this.H && cVar.b(xVar) && i10 > 0; i11++) {
            ((m.b) cVar2).a(cVar.f1878d, Math.max(0, cVar.f1881g));
            Objects.requireNonNull(this.M);
            i10--;
            cVar.f1878d += cVar.f1879e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int P(RecyclerView.s sVar, RecyclerView.x xVar) {
        if (this.f1858r == 0) {
            return this.H;
        }
        if (xVar.b() >= 1) {
            return q1(sVar, xVar, xVar.b() - 1) + 1;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View W0(RecyclerView.s sVar, RecyclerView.x xVar, int i10, int i11, int i12) {
        O0();
        int k10 = this.f1860t.k();
        int g10 = this.f1860t.g();
        int i13 = i11 > i10 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View w10 = w(i10);
            int N = N(w10);
            if (N >= 0 && N < i12 && r1(sVar, xVar, N) == 0) {
                if (((RecyclerView.n) w10.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = w10;
                    }
                } else if (this.f1860t.e(w10) < g10 && this.f1860t.b(w10) >= k10) {
                    return w10;
                } else {
                    if (view == null) {
                        view = w10;
                    }
                }
            }
            i10 += i13;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00cb, code lost:
        if (r13 == (r2 > r15)) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00fb, code lost:
        if (r13 == (r2 > r9)) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0107  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View X(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.s r25, androidx.recyclerview.widget.RecyclerView.x r26) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.X(android.view.View, int, androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void a0(RecyclerView.s sVar, RecyclerView.x xVar, View view, f fVar) {
        int i10;
        int i11;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            Z(view, fVar);
            return;
        }
        b bVar = (b) layoutParams;
        int q12 = q1(sVar, xVar, bVar.a());
        int i12 = 1;
        if (this.f1858r == 0) {
            int i13 = bVar.f1854e;
            int i14 = bVar.f1855f;
            i10 = q12;
            q12 = i13;
            i11 = 1;
            i12 = i14;
        } else {
            i10 = bVar.f1854e;
            i11 = bVar.f1855f;
        }
        fVar.p(f.c.a(q12, i12, i10, i11, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void b0(int i10, int i11) {
        this.M.c();
        this.M.b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void c0() {
        this.M.c();
        this.M.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009f, code lost:
        r22.f1872b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a1, code lost:
        return;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c1(androidx.recyclerview.widget.RecyclerView.s r19, androidx.recyclerview.widget.RecyclerView.x r20, androidx.recyclerview.widget.LinearLayoutManager.c r21, androidx.recyclerview.widget.LinearLayoutManager.b r22) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.c1(androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void d0(int i10, int i11) {
        this.M.c();
        this.M.b();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void d1(RecyclerView.s sVar, RecyclerView.x xVar, LinearLayoutManager.a aVar, int i10) {
        w1();
        if (xVar.b() > 0 && !xVar.f2017g) {
            boolean z10 = i10 == 1;
            int r12 = r1(sVar, xVar, aVar.f1867b);
            if (z10) {
                while (r12 > 0) {
                    int i11 = aVar.f1867b;
                    if (i11 <= 0) {
                        break;
                    }
                    int i12 = i11 - 1;
                    aVar.f1867b = i12;
                    r12 = r1(sVar, xVar, i12);
                }
            } else {
                int b10 = xVar.b() - 1;
                int i13 = aVar.f1867b;
                while (i13 < b10) {
                    int i14 = i13 + 1;
                    int r13 = r1(sVar, xVar, i14);
                    if (r13 <= r12) {
                        break;
                    }
                    i13 = i14;
                    r12 = r13;
                }
                aVar.f1867b = i13;
            }
        }
        o1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void e0(int i10, int i11) {
        this.M.c();
        this.M.b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void f0(int i10, int i11) {
        this.M.c();
        this.M.b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean g(RecyclerView.n nVar) {
        return nVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final void g0(RecyclerView.s sVar, RecyclerView.x xVar) {
        if (xVar.f2017g) {
            int x10 = x();
            for (int i10 = 0; i10 < x10; i10++) {
                b bVar = (b) w(i10).getLayoutParams();
                int a10 = bVar.a();
                this.K.put(a10, bVar.f1855f);
                this.L.put(a10, bVar.f1854e);
            }
        }
        super.g0(sVar, xVar);
        this.K.clear();
        this.L.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final void h0() {
        this.B = null;
        this.f1865z = -1;
        this.A = Integer.MIN_VALUE;
        this.C.d();
        this.G = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void j1(boolean z10) {
        if (!z10) {
            d(null);
            if (!this.f1864x) {
                return;
            }
            this.f1864x = false;
            s0();
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int l(RecyclerView.x xVar) {
        return L0(xVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int m(RecyclerView.x xVar) {
        return M0(xVar);
    }

    public final void n1(int i10) {
        int i11;
        int[] iArr = this.I;
        int i12 = this.H;
        if (iArr == null || iArr.length != i12 + 1 || iArr[iArr.length - 1] != i10) {
            iArr = new int[i12 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i10 / i12;
        int i15 = i10 % i12;
        int i16 = 0;
        for (int i17 = 1; i17 <= i12; i17++) {
            i13 += i15;
            if (i13 <= 0 || i12 - i13 >= i15) {
                i11 = i14;
            } else {
                i11 = i14 + 1;
                i13 -= i12;
            }
            i16 += i11;
            iArr[i17] = i16;
        }
        this.I = iArr;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int o(RecyclerView.x xVar) {
        return L0(xVar);
    }

    public final void o1() {
        View[] viewArr = this.J;
        if (viewArr == null || viewArr.length != this.H) {
            this.J = new View[this.H];
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int p(RecyclerView.x xVar) {
        return M0(xVar);
    }

    public final int p1(int i10, int i11) {
        if (this.f1858r != 1 || !b1()) {
            int[] iArr = this.I;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.I;
        int i12 = this.H;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    public final int q1(RecyclerView.s sVar, RecyclerView.x xVar, int i10) {
        if (!xVar.f2017g) {
            return this.M.a(i10, this.H);
        }
        int c10 = sVar.c(i10);
        if (c10 != -1) {
            return this.M.a(c10, this.H);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i10);
        return 0;
    }

    public final int r1(RecyclerView.s sVar, RecyclerView.x xVar, int i10) {
        if (!xVar.f2017g) {
            a aVar = this.M;
            int i11 = this.H;
            Objects.requireNonNull(aVar);
            return i10 % i11;
        }
        int i12 = this.L.get(i10, -1);
        if (i12 != -1) {
            return i12;
        }
        int c10 = sVar.c(i10);
        if (c10 != -1) {
            a aVar2 = this.M;
            int i13 = this.H;
            Objects.requireNonNull(aVar2);
            return c10 % i13;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 0;
    }

    public final int s1(RecyclerView.s sVar, RecyclerView.x xVar, int i10) {
        if (!xVar.f2017g) {
            Objects.requireNonNull(this.M);
            return 1;
        }
        int i11 = this.K.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        if (sVar.c(i10) != -1) {
            Objects.requireNonNull(this.M);
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i10);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n t() {
        return this.f1858r == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int t0(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        w1();
        o1();
        if (this.f1858r == 1) {
            return 0;
        }
        return h1(i10, sVar, xVar);
    }

    public final void t1(View view, int i10, boolean z10) {
        int i11;
        int i12;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f1977b;
        int i13 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i14 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int p12 = p1(bVar.f1854e, bVar.f1855f);
        if (this.f1858r == 1) {
            i11 = RecyclerView.m.y(p12, i10, i14, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            i12 = RecyclerView.m.y(this.f1860t.l(), this.f1968o, i13, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int y = RecyclerView.m.y(p12, i10, i13, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int y3 = RecyclerView.m.y(this.f1860t.l(), this.f1967n, i14, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            i12 = y;
            i11 = y3;
        }
        u1(view, i11, i12, z10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n u(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    public final void u1(View view, int i10, int i11, boolean z10) {
        RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
        if (z10 ? E0(view, i10, i11, nVar) : C0(view, i10, i11, nVar)) {
            view.measure(i10, i11);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n v(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public final int v0(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        w1();
        o1();
        if (this.f1858r == 0) {
            return 0;
        }
        return h1(i10, sVar, xVar);
    }

    public final void v1(int i10) {
        if (i10 == this.H) {
            return;
        }
        this.G = true;
        if (i10 < 1) {
            throw new IllegalArgumentException(e0.a("Span count should be at least 1. Provided ", i10));
        }
        this.H = i10;
        this.M.c();
        s0();
    }

    public final void w1() {
        int i10;
        int i11;
        if (this.f1858r == 1) {
            i11 = this.p - L();
            i10 = K();
        } else {
            i11 = this.f1969q - J();
            i10 = M();
        }
        n1(i11 - i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int z(RecyclerView.s sVar, RecyclerView.x xVar) {
        if (this.f1858r == 1) {
            return this.H;
        }
        if (xVar.b() >= 1) {
            return q1(sVar, xVar, xVar.b() - 1) + 1;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void z0(Rect rect, int i10, int i11) {
        int i12;
        int i13;
        if (this.I == null) {
            super.z0(rect, i10, i11);
        }
        int L = L() + K();
        int J = J() + M();
        if (this.f1858r == 1) {
            i13 = RecyclerView.m.h(i11, rect.height() + J, H());
            int[] iArr = this.I;
            i12 = RecyclerView.m.h(i10, iArr[iArr.length - 1] + L, I());
        } else {
            i12 = RecyclerView.m.h(i10, rect.width() + L, I());
            int[] iArr2 = this.I;
            i13 = RecyclerView.m.h(i11, iArr2[iArr2.length - 1] + J, H());
        }
        y0(i12, i13);
    }
}
