package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.widget.e0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.m implements RecyclerView.w.b {
    public int A;
    public d B;
    public final a C;
    public final b D;
    public int E;
    public int[] F;

    /* renamed from: r */
    public int f1858r;

    /* renamed from: s */
    public c f1859s;

    /* renamed from: t */
    public s f1860t;

    /* renamed from: u */
    public boolean f1861u;

    /* renamed from: v */
    public boolean f1862v;

    /* renamed from: w */
    public boolean f1863w;

    /* renamed from: x */
    public boolean f1864x;
    public boolean y;

    /* renamed from: z */
    public int f1865z;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public s f1866a;

        /* renamed from: b */
        public int f1867b;

        /* renamed from: c */
        public int f1868c;

        /* renamed from: d */
        public boolean f1869d;

        /* renamed from: e */
        public boolean f1870e;

        public a() {
            d();
        }

        public final void a() {
            this.f1868c = this.f1869d ? this.f1866a.g() : this.f1866a.k();
        }

        public final void b(View view, int i10) {
            if (this.f1869d) {
                this.f1868c = this.f1866a.m() + this.f1866a.b(view);
            } else {
                this.f1868c = this.f1866a.e(view);
            }
            this.f1867b = i10;
        }

        public final void c(View view, int i10) {
            int i11;
            int m10 = this.f1866a.m();
            if (m10 >= 0) {
                b(view, i10);
                return;
            }
            this.f1867b = i10;
            if (this.f1869d) {
                int g10 = (this.f1866a.g() - m10) - this.f1866a.b(view);
                this.f1868c = this.f1866a.g() - g10;
                if (g10 <= 0) {
                    return;
                }
                int c10 = this.f1868c - this.f1866a.c(view);
                int k10 = this.f1866a.k();
                int min = c10 - (Math.min(this.f1866a.e(view) - k10, 0) + k10);
                if (min >= 0) {
                    return;
                }
                i11 = Math.min(g10, -min) + this.f1868c;
            } else {
                int e10 = this.f1866a.e(view);
                int k11 = e10 - this.f1866a.k();
                this.f1868c = e10;
                if (k11 <= 0) {
                    return;
                }
                int g11 = (this.f1866a.g() - Math.min(0, (this.f1866a.g() - m10) - this.f1866a.b(view))) - (this.f1866a.c(view) + e10);
                if (g11 >= 0) {
                    return;
                }
                i11 = this.f1868c - Math.min(k11, -g11);
            }
            this.f1868c = i11;
        }

        public final void d() {
            this.f1867b = -1;
            this.f1868c = Integer.MIN_VALUE;
            this.f1869d = false;
            this.f1870e = false;
        }

        public final String toString() {
            StringBuilder c10 = androidx.activity.result.a.c("AnchorInfo{mPosition=");
            c10.append(this.f1867b);
            c10.append(", mCoordinate=");
            c10.append(this.f1868c);
            c10.append(", mLayoutFromEnd=");
            c10.append(this.f1869d);
            c10.append(", mValid=");
            c10.append(this.f1870e);
            c10.append('}');
            return c10.toString();
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public int f1871a;

        /* renamed from: b */
        public boolean f1872b;

        /* renamed from: c */
        public boolean f1873c;

        /* renamed from: d */
        public boolean f1874d;
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: b */
        public int f1876b;

        /* renamed from: c */
        public int f1877c;

        /* renamed from: d */
        public int f1878d;

        /* renamed from: e */
        public int f1879e;

        /* renamed from: f */
        public int f1880f;

        /* renamed from: g */
        public int f1881g;

        /* renamed from: j */
        public int f1884j;

        /* renamed from: l */
        public boolean f1886l;

        /* renamed from: a */
        public boolean f1875a = true;

        /* renamed from: h */
        public int f1882h = 0;

        /* renamed from: i */
        public int f1883i = 0;

        /* renamed from: k */
        public List<RecyclerView.a0> f1885k = null;

        public final void a(View view) {
            int a10;
            int size = this.f1885k.size();
            View view2 = null;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = this.f1885k.get(i11).f1924a;
                RecyclerView.n nVar = (RecyclerView.n) view3.getLayoutParams();
                if (view3 != view && !nVar.c() && (a10 = (nVar.a() - this.f1878d) * this.f1879e) >= 0 && a10 < i10) {
                    view2 = view3;
                    if (a10 == 0) {
                        break;
                    }
                    i10 = a10;
                }
            }
            this.f1878d = view2 == null ? -1 : ((RecyclerView.n) view2.getLayoutParams()).a();
        }

        public final boolean b(RecyclerView.x xVar) {
            int i10 = this.f1878d;
            return i10 >= 0 && i10 < xVar.b();
        }

        public final View c(RecyclerView.s sVar) {
            List<RecyclerView.a0> list = this.f1885k;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    View view = this.f1885k.get(i10).f1924a;
                    RecyclerView.n nVar = (RecyclerView.n) view.getLayoutParams();
                    if (!nVar.c() && this.f1878d == nVar.a()) {
                        a(view);
                        return view;
                    }
                }
                return null;
            }
            View view2 = sVar.j(this.f1878d, Long.MAX_VALUE).f1924a;
            this.f1878d += this.f1879e;
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: s */
        public int f1887s;

        /* renamed from: t */
        public int f1888t;

        /* renamed from: u */
        public boolean f1889u;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d() {
        }

        public d(Parcel parcel) {
            this.f1887s = parcel.readInt();
            this.f1888t = parcel.readInt();
            this.f1889u = parcel.readInt() != 1 ? false : true;
        }

        public d(d dVar) {
            this.f1887s = dVar.f1887s;
            this.f1888t = dVar.f1888t;
            this.f1889u = dVar.f1889u;
        }

        public final boolean a() {
            return this.f1887s >= 0;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f1887s);
            parcel.writeInt(this.f1888t);
            parcel.writeInt(this.f1889u ? 1 : 0);
        }
    }

    public LinearLayoutManager(int i10) {
        this.f1858r = 1;
        this.f1862v = false;
        this.f1863w = false;
        this.f1864x = false;
        this.y = true;
        this.f1865z = -1;
        this.A = Integer.MIN_VALUE;
        this.B = null;
        this.C = new a();
        this.D = new b();
        this.E = 2;
        this.F = new int[2];
        i1(i10);
        d(null);
        if (!this.f1862v) {
            return;
        }
        this.f1862v = false;
        s0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean D0() {
        boolean z10;
        if (this.f1968o != 1073741824 && this.f1967n != 1073741824) {
            int x10 = x();
            int i10 = 0;
            while (true) {
                if (i10 >= x10) {
                    z10 = false;
                    break;
                }
                ViewGroup.LayoutParams layoutParams = w(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void F0(RecyclerView recyclerView, int i10) {
        o oVar = new o(recyclerView.getContext());
        oVar.f1996a = i10;
        G0(oVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean H0() {
        return this.B == null && this.f1861u == this.f1864x;
    }

    public void I0(RecyclerView.x xVar, int[] iArr) {
        int i10;
        int l10 = xVar.f2011a != -1 ? this.f1860t.l() : 0;
        if (this.f1859s.f1880f == -1) {
            i10 = 0;
        } else {
            i10 = l10;
            l10 = 0;
        }
        iArr[0] = l10;
        iArr[1] = i10;
    }

    public void J0(RecyclerView.x xVar, c cVar, RecyclerView.m.c cVar2) {
        int i10 = cVar.f1878d;
        if (i10 < 0 || i10 >= xVar.b()) {
            return;
        }
        ((m.b) cVar2).a(i10, Math.max(0, cVar.f1881g));
    }

    public final int K0(RecyclerView.x xVar) {
        if (x() == 0) {
            return 0;
        }
        O0();
        return y.a(xVar, this.f1860t, R0(!this.y), Q0(!this.y), this, this.y);
    }

    public final int L0(RecyclerView.x xVar) {
        if (x() == 0) {
            return 0;
        }
        O0();
        return y.b(xVar, this.f1860t, R0(!this.y), Q0(!this.y), this, this.y, this.f1863w);
    }

    public final int M0(RecyclerView.x xVar) {
        if (x() == 0) {
            return 0;
        }
        O0();
        return y.c(xVar, this.f1860t, R0(!this.y), Q0(!this.y), this, this.y);
    }

    public final int N0(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 17 ? i10 != 33 ? i10 != 66 ? (i10 == 130 && this.f1858r == 1) ? 1 : Integer.MIN_VALUE : this.f1858r == 0 ? 1 : Integer.MIN_VALUE : this.f1858r == 1 ? -1 : Integer.MIN_VALUE : this.f1858r == 0 ? -1 : Integer.MIN_VALUE : (this.f1858r != 1 && b1()) ? -1 : 1 : (this.f1858r != 1 && b1()) ? 1 : -1;
    }

    public final void O0() {
        if (this.f1859s == null) {
            this.f1859s = new c();
        }
    }

    public final int P0(RecyclerView.s sVar, c cVar, RecyclerView.x xVar, boolean z10) {
        int i10 = cVar.f1877c;
        int i11 = cVar.f1881g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                cVar.f1881g = i11 + i10;
            }
            e1(sVar, cVar);
        }
        int i12 = cVar.f1877c + cVar.f1882h;
        b bVar = this.D;
        while (true) {
            if ((!cVar.f1886l && i12 <= 0) || !cVar.b(xVar)) {
                break;
            }
            bVar.f1871a = 0;
            bVar.f1872b = false;
            bVar.f1873c = false;
            bVar.f1874d = false;
            c1(sVar, xVar, cVar, bVar);
            if (!bVar.f1872b) {
                int i13 = cVar.f1876b;
                int i14 = bVar.f1871a;
                cVar.f1876b = (cVar.f1880f * i14) + i13;
                if (!bVar.f1873c || cVar.f1885k != null || !xVar.f2017g) {
                    cVar.f1877c -= i14;
                    i12 -= i14;
                }
                int i15 = cVar.f1881g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + i14;
                    cVar.f1881g = i16;
                    int i17 = cVar.f1877c;
                    if (i17 < 0) {
                        cVar.f1881g = i16 + i17;
                    }
                    e1(sVar, cVar);
                }
                if (z10 && bVar.f1874d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - cVar.f1877c;
    }

    public final View Q0(boolean z10) {
        int i10;
        int i11 = -1;
        if (this.f1863w) {
            i10 = 0;
            i11 = x();
        } else {
            i10 = x() - 1;
        }
        return V0(i10, i11, z10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean R() {
        return true;
    }

    public final View R0(boolean z10) {
        int i10;
        int i11 = -1;
        if (this.f1863w) {
            i10 = x() - 1;
        } else {
            i10 = 0;
            i11 = x();
        }
        return V0(i10, i11, z10);
    }

    public final int S0() {
        View V0 = V0(0, x(), false);
        if (V0 == null) {
            return -1;
        }
        return N(V0);
    }

    public final int T0() {
        View V0 = V0(x() - 1, -1, false);
        if (V0 == null) {
            return -1;
        }
        return N(V0);
    }

    public final View U0(int i10, int i11) {
        int i12;
        int i13;
        O0();
        if ((i11 > i10 ? (char) 1 : i11 < i10 ? (char) 65535 : (char) 0) == 0) {
            return w(i10);
        }
        if (this.f1860t.e(w(i10)) < this.f1860t.k()) {
            i13 = 16644;
            i12 = 16388;
        } else {
            i13 = 4161;
            i12 = 4097;
        }
        return (this.f1858r == 0 ? this.f1958e : this.f1959f).a(i10, i11, i13, i12);
    }

    public final View V0(int i10, int i11, boolean z10) {
        O0();
        return (this.f1858r == 0 ? this.f1958e : this.f1959f).a(i10, i11, z10 ? 24579 : 320, 320);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void W(RecyclerView recyclerView) {
    }

    public View W0(RecyclerView.s sVar, RecyclerView.x xVar, int i10, int i11, int i12) {
        O0();
        int k10 = this.f1860t.k();
        int g10 = this.f1860t.g();
        int i13 = i11 > i10 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View w10 = w(i10);
            int N = N(w10);
            if (N >= 0 && N < i12) {
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

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public View X(View view, int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        int N0;
        View view2;
        g1();
        if (x() == 0 || (N0 = N0(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        O0();
        k1(N0, (int) (this.f1860t.l() * 0.33333334f), false, xVar);
        c cVar = this.f1859s;
        cVar.f1881g = Integer.MIN_VALUE;
        cVar.f1875a = false;
        P0(sVar, cVar, xVar, true);
        if (N0 == -1) {
            if (this.f1863w) {
                view2 = U0(x() - 1, -1);
            } else {
                view2 = U0(0, x());
            }
        } else if (this.f1863w) {
            view2 = U0(0, x());
        } else {
            view2 = U0(x() - 1, -1);
        }
        View a12 = N0 == -1 ? a1() : Z0();
        if (!a12.hasFocusable()) {
            return view2;
        }
        if (view2 != null) {
            return a12;
        }
        return null;
    }

    public final int X0(int i10, RecyclerView.s sVar, RecyclerView.x xVar, boolean z10) {
        int g10;
        int g11 = this.f1860t.g() - i10;
        if (g11 > 0) {
            int i11 = -h1(-g11, sVar, xVar);
            int i12 = i10 + i11;
            if (!z10 || (g10 = this.f1860t.g() - i12) <= 0) {
                return i11;
            }
            this.f1860t.p(g10);
            return g10 + i11;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void Y(AccessibilityEvent accessibilityEvent) {
        super.Y(accessibilityEvent);
        if (x() > 0) {
            accessibilityEvent.setFromIndex(S0());
            accessibilityEvent.setToIndex(T0());
        }
    }

    public final int Y0(int i10, RecyclerView.s sVar, RecyclerView.x xVar, boolean z10) {
        int k10;
        int k11 = i10 - this.f1860t.k();
        if (k11 > 0) {
            int i11 = -h1(k11, sVar, xVar);
            int i12 = i10 + i11;
            if (!z10 || (k10 = i12 - this.f1860t.k()) <= 0) {
                return i11;
            }
            this.f1860t.p(-k10);
            return i11 - k10;
        }
        return 0;
    }

    public final View Z0() {
        return w(this.f1863w ? 0 : x() - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.w.b
    public final PointF a(int i10) {
        if (x() == 0) {
            return null;
        }
        boolean z10 = false;
        int i11 = 1;
        if (i10 < N(w(0))) {
            z10 = true;
        }
        if (z10 != this.f1863w) {
            i11 = -1;
        }
        return this.f1858r == 0 ? new PointF(i11, 0.0f) : new PointF(0.0f, i11);
    }

    public final View a1() {
        return w(this.f1863w ? x() - 1 : 0);
    }

    public final boolean b1() {
        return G() == 1;
    }

    public void c1(RecyclerView.s sVar, RecyclerView.x xVar, c cVar, b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        View c10 = cVar.c(sVar);
        if (c10 == null) {
            bVar.f1872b = true;
            return;
        }
        RecyclerView.n nVar = (RecyclerView.n) c10.getLayoutParams();
        if (cVar.f1885k == null) {
            if (this.f1863w == (cVar.f1880f == -1)) {
                b(c10);
            } else {
                c(c10, 0, false);
            }
        } else {
            if (this.f1863w == (cVar.f1880f == -1)) {
                c(c10, -1, true);
            } else {
                c(c10, 0, true);
            }
        }
        RecyclerView.n nVar2 = (RecyclerView.n) c10.getLayoutParams();
        Rect L = this.f1955b.L(c10);
        int y = RecyclerView.m.y(this.p, this.f1967n, L() + K() + ((ViewGroup.MarginLayoutParams) nVar2).leftMargin + ((ViewGroup.MarginLayoutParams) nVar2).rightMargin + L.left + L.right + 0, ((ViewGroup.MarginLayoutParams) nVar2).width, e());
        int y3 = RecyclerView.m.y(this.f1969q, this.f1968o, J() + M() + ((ViewGroup.MarginLayoutParams) nVar2).topMargin + ((ViewGroup.MarginLayoutParams) nVar2).bottomMargin + L.top + L.bottom + 0, ((ViewGroup.MarginLayoutParams) nVar2).height, f());
        if (C0(c10, y, y3, nVar2)) {
            c10.measure(y, y3);
        }
        bVar.f1871a = this.f1860t.c(c10);
        if (this.f1858r == 1) {
            if (b1()) {
                i14 = this.p - L();
                i13 = i14 - this.f1860t.d(c10);
            } else {
                i13 = K();
                i14 = this.f1860t.d(c10) + i13;
            }
            int i15 = cVar.f1880f;
            int i16 = cVar.f1876b;
            if (i15 == -1) {
                i10 = i16;
                i11 = i14;
                i12 = i16 - bVar.f1871a;
            } else {
                i12 = i16;
                i11 = i14;
                i10 = bVar.f1871a + i16;
            }
        } else {
            int M = M();
            int d5 = this.f1860t.d(c10) + M;
            int i17 = cVar.f1880f;
            int i18 = cVar.f1876b;
            if (i17 == -1) {
                i11 = i18;
                i12 = M;
                i10 = d5;
                i13 = i18 - bVar.f1871a;
            } else {
                i12 = M;
                i11 = bVar.f1871a + i18;
                i10 = d5;
                i13 = i18;
            }
        }
        T(c10, i13, i12, i11, i10);
        if (nVar.c() || nVar.b()) {
            bVar.f1873c = true;
        }
        bVar.f1874d = c10.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void d(String str) {
        if (this.B == null) {
            super.d(str);
        }
    }

    public void d1(RecyclerView.s sVar, RecyclerView.x xVar, a aVar, int i10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean e() {
        return this.f1858r == 0;
    }

    public final void e1(RecyclerView.s sVar, c cVar) {
        if (!cVar.f1875a || cVar.f1886l) {
            return;
        }
        int i10 = cVar.f1881g;
        int i11 = cVar.f1883i;
        if (cVar.f1880f == -1) {
            int x10 = x();
            if (i10 < 0) {
                return;
            }
            int f10 = (this.f1860t.f() - i10) + i11;
            if (this.f1863w) {
                for (int i12 = 0; i12 < x10; i12++) {
                    View w10 = w(i12);
                    if (this.f1860t.e(w10) < f10 || this.f1860t.o(w10) < f10) {
                        f1(sVar, 0, i12);
                        return;
                    }
                }
                return;
            }
            int i13 = x10 - 1;
            for (int i14 = i13; i14 >= 0; i14--) {
                View w11 = w(i14);
                if (this.f1860t.e(w11) < f10 || this.f1860t.o(w11) < f10) {
                    f1(sVar, i13, i14);
                    return;
                }
            }
        } else if (i10 >= 0) {
            int i15 = i10 - i11;
            int x11 = x();
            if (!this.f1863w) {
                for (int i16 = 0; i16 < x11; i16++) {
                    View w12 = w(i16);
                    if (this.f1860t.b(w12) > i15 || this.f1860t.n(w12) > i15) {
                        f1(sVar, 0, i16);
                        return;
                    }
                }
                return;
            }
            int i17 = x11 - 1;
            for (int i18 = i17; i18 >= 0; i18--) {
                View w13 = w(i18);
                if (this.f1860t.b(w13) > i15 || this.f1860t.n(w13) > i15) {
                    f1(sVar, i17, i18);
                    return;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean f() {
        return this.f1858r == 1;
    }

    public final void f1(RecyclerView.s sVar, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                p0(i10, sVar);
                i10--;
            }
            return;
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            p0(i12, sVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0175  */
    @Override // androidx.recyclerview.widget.RecyclerView.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g0(androidx.recyclerview.widget.RecyclerView.s r17, androidx.recyclerview.widget.RecyclerView.x r18) {
        /*
            Method dump skipped, instructions count: 1151
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.g0(androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x):void");
    }

    public final void g1() {
        this.f1863w = (this.f1858r == 1 || !b1()) ? this.f1862v : !this.f1862v;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void h0() {
        this.B = null;
        this.f1865z = -1;
        this.A = Integer.MIN_VALUE;
        this.C.d();
    }

    public final int h1(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (x() == 0 || i10 == 0) {
            return 0;
        }
        O0();
        this.f1859s.f1875a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int abs = Math.abs(i10);
        k1(i11, abs, true, xVar);
        c cVar = this.f1859s;
        int P0 = P0(sVar, cVar, xVar, false) + cVar.f1881g;
        if (P0 < 0) {
            return 0;
        }
        if (abs > P0) {
            i10 = i11 * P0;
        }
        this.f1860t.p(-i10);
        this.f1859s.f1884j = i10;
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void i(int i10, int i11, RecyclerView.x xVar, RecyclerView.m.c cVar) {
        if (this.f1858r != 0) {
            i10 = i11;
        }
        if (x() == 0 || i10 == 0) {
            return;
        }
        O0();
        k1(i10 > 0 ? 1 : -1, Math.abs(i10), true, xVar);
        J0(xVar, this.f1859s, cVar);
    }

    public final void i1(int i10) {
        if (i10 == 0 || i10 == 1) {
            d(null);
            if (i10 == this.f1858r && this.f1860t != null) {
                return;
            }
            s a10 = s.a(this, i10);
            this.f1860t = a10;
            this.C.f1866a = a10;
            this.f1858r = i10;
            s0();
            return;
        }
        throw new IllegalArgumentException(e0.a("invalid orientation:", i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void j(int i10, RecyclerView.m.c cVar) {
        boolean z10;
        int i11;
        d dVar = this.B;
        int i12 = -1;
        if (dVar == null || !dVar.a()) {
            g1();
            z10 = this.f1863w;
            i11 = this.f1865z;
            if (i11 == -1) {
                i11 = z10 ? i10 - 1 : 0;
            }
        } else {
            d dVar2 = this.B;
            z10 = dVar2.f1889u;
            i11 = dVar2.f1887s;
        }
        if (!z10) {
            i12 = 1;
        }
        for (int i13 = 0; i13 < this.E && i11 >= 0 && i11 < i10; i13++) {
            ((m.b) cVar).a(i11, 0);
            i11 += i12;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void j0(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.B = (d) parcelable;
            s0();
        }
    }

    public void j1(boolean z10) {
        d(null);
        if (this.f1864x == z10) {
            return;
        }
        this.f1864x = z10;
        s0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int k(RecyclerView.x xVar) {
        return K0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final Parcelable k0() {
        d dVar = this.B;
        if (dVar != null) {
            return new d(dVar);
        }
        d dVar2 = new d();
        if (x() > 0) {
            O0();
            boolean z10 = this.f1861u ^ this.f1863w;
            dVar2.f1889u = z10;
            if (z10) {
                View Z0 = Z0();
                dVar2.f1888t = this.f1860t.g() - this.f1860t.b(Z0);
                dVar2.f1887s = N(Z0);
            } else {
                View a12 = a1();
                dVar2.f1887s = N(a12);
                dVar2.f1888t = this.f1860t.e(a12) - this.f1860t.k();
            }
        } else {
            dVar2.f1887s = -1;
        }
        return dVar2;
    }

    public final void k1(int i10, int i11, boolean z10, RecyclerView.x xVar) {
        int i12;
        int i13 = 1;
        boolean z11 = false;
        this.f1859s.f1886l = this.f1860t.i() == 0 && this.f1860t.f() == 0;
        this.f1859s.f1880f = i10;
        int[] iArr = this.F;
        iArr[0] = 0;
        iArr[1] = 0;
        I0(xVar, iArr);
        int max = Math.max(0, this.F[0]);
        int max2 = Math.max(0, this.F[1]);
        if (i10 == 1) {
            z11 = true;
        }
        c cVar = this.f1859s;
        int i14 = z11 ? max2 : max;
        cVar.f1882h = i14;
        if (!z11) {
            max = max2;
        }
        cVar.f1883i = max;
        if (z11) {
            cVar.f1882h = this.f1860t.h() + i14;
            View Z0 = Z0();
            c cVar2 = this.f1859s;
            if (this.f1863w) {
                i13 = -1;
            }
            cVar2.f1879e = i13;
            int N = N(Z0);
            c cVar3 = this.f1859s;
            cVar2.f1878d = N + cVar3.f1879e;
            cVar3.f1876b = this.f1860t.b(Z0);
            i12 = this.f1860t.b(Z0) - this.f1860t.g();
        } else {
            View a12 = a1();
            c cVar4 = this.f1859s;
            cVar4.f1882h = this.f1860t.k() + cVar4.f1882h;
            c cVar5 = this.f1859s;
            if (!this.f1863w) {
                i13 = -1;
            }
            cVar5.f1879e = i13;
            int N2 = N(a12);
            c cVar6 = this.f1859s;
            cVar5.f1878d = N2 + cVar6.f1879e;
            cVar6.f1876b = this.f1860t.e(a12);
            i12 = (-this.f1860t.e(a12)) + this.f1860t.k();
        }
        c cVar7 = this.f1859s;
        cVar7.f1877c = i11;
        if (z10) {
            cVar7.f1877c = i11 - i12;
        }
        cVar7.f1881g = i12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int l(RecyclerView.x xVar) {
        return L0(xVar);
    }

    public final void l1(int i10, int i11) {
        this.f1859s.f1877c = this.f1860t.g() - i11;
        c cVar = this.f1859s;
        cVar.f1879e = this.f1863w ? -1 : 1;
        cVar.f1878d = i10;
        cVar.f1880f = 1;
        cVar.f1876b = i11;
        cVar.f1881g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int m(RecyclerView.x xVar) {
        return M0(xVar);
    }

    public final void m1(int i10, int i11) {
        this.f1859s.f1877c = i11 - this.f1860t.k();
        c cVar = this.f1859s;
        cVar.f1878d = i10;
        cVar.f1879e = this.f1863w ? 1 : -1;
        cVar.f1880f = -1;
        cVar.f1876b = i11;
        cVar.f1881g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int n(RecyclerView.x xVar) {
        return K0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int o(RecyclerView.x xVar) {
        return L0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int p(RecyclerView.x xVar) {
        return M0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final View s(int i10) {
        int x10 = x();
        if (x10 == 0) {
            return null;
        }
        int N = i10 - N(w(0));
        if (N >= 0 && N < x10) {
            View w10 = w(N);
            if (N(w10) == i10) {
                return w10;
            }
        }
        return super.s(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public RecyclerView.n t() {
        return new RecyclerView.n(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int t0(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (this.f1858r == 1) {
            return 0;
        }
        return h1(i10, sVar, xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void u0(int i10) {
        this.f1865z = i10;
        this.A = Integer.MIN_VALUE;
        d dVar = this.B;
        if (dVar != null) {
            dVar.f1887s = -1;
        }
        s0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int v0(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (this.f1858r == 0) {
            return 0;
        }
        return h1(i10, sVar, xVar);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f1858r = 1;
        this.f1862v = false;
        this.f1863w = false;
        this.f1864x = false;
        this.y = true;
        this.f1865z = -1;
        this.A = Integer.MIN_VALUE;
        this.B = null;
        this.C = new a();
        this.D = new b();
        this.E = 2;
        this.F = new int[2];
        RecyclerView.m.d O = RecyclerView.m.O(context, attributeSet, i10, i11);
        i1(O.f1972a);
        boolean z10 = O.f1974c;
        d(null);
        if (z10 != this.f1862v) {
            this.f1862v = z10;
            s0();
        }
        j1(O.f1975d);
    }
}
