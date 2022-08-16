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
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.Objects;
import n0.f;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.m implements RecyclerView.w.b {
    public BitSet A;
    public boolean F;
    public boolean G;
    public e H;
    public int[] L;

    /* renamed from: r */
    public int f2031r;

    /* renamed from: s */
    public f[] f2032s;

    /* renamed from: t */
    public s f2033t;

    /* renamed from: u */
    public s f2034u;

    /* renamed from: v */
    public int f2035v;

    /* renamed from: w */
    public int f2036w;

    /* renamed from: x */
    public final n f2037x;
    public boolean y;

    /* renamed from: z */
    public boolean f2038z = false;
    public int B = -1;
    public int C = Integer.MIN_VALUE;
    public d D = new d();
    public int E = 2;
    public final Rect I = new Rect();
    public final b J = new b();
    public boolean K = true;
    public final a M = new a();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            StaggeredGridLayoutManager.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            StaggeredGridLayoutManager.this.J0();
        }
    }

    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a */
        public int f2040a;

        /* renamed from: b */
        public int f2041b;

        /* renamed from: c */
        public boolean f2042c;

        /* renamed from: d */
        public boolean f2043d;

        /* renamed from: e */
        public boolean f2044e;

        /* renamed from: f */
        public int[] f2045f;

        public b() {
            StaggeredGridLayoutManager.this = r1;
            b();
        }

        public final void a() {
            this.f2041b = this.f2042c ? StaggeredGridLayoutManager.this.f2033t.g() : StaggeredGridLayoutManager.this.f2033t.k();
        }

        public final void b() {
            this.f2040a = -1;
            this.f2041b = Integer.MIN_VALUE;
            this.f2042c = false;
            this.f2043d = false;
            this.f2044e = false;
            int[] iArr = this.f2045f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends RecyclerView.n {

        /* renamed from: e */
        public f f2047e;

        public c(int i10, int i11) {
            super(i10, i11);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        public int[] f2048a;

        /* renamed from: b */
        public List<a> f2049b;

        @SuppressLint({"BanParcelableUsage"})
        /* loaded from: classes.dex */
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0023a();

            /* renamed from: s */
            public int f2050s;

            /* renamed from: t */
            public int f2051t;

            /* renamed from: u */
            public int[] f2052u;

            /* renamed from: v */
            public boolean f2053v;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a */
            /* loaded from: classes.dex */
            public static class C0023a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                public final a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public final a[] newArray(int i10) {
                    return new a[i10];
                }
            }

            public a() {
            }

            public a(Parcel parcel) {
                this.f2050s = parcel.readInt();
                this.f2051t = parcel.readInt();
                this.f2053v = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f2052u = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                StringBuilder c10 = androidx.activity.result.a.c("FullSpanItem{mPosition=");
                c10.append(this.f2050s);
                c10.append(", mGapDir=");
                c10.append(this.f2051t);
                c10.append(", mHasUnwantedGapAfter=");
                c10.append(this.f2053v);
                c10.append(", mGapPerSpan=");
                c10.append(Arrays.toString(this.f2052u));
                c10.append('}');
                return c10.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f2050s);
                parcel.writeInt(this.f2051t);
                parcel.writeInt(this.f2053v ? 1 : 0);
                int[] iArr = this.f2052u;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f2052u);
            }
        }

        public final void a() {
            int[] iArr = this.f2048a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f2049b = null;
        }

        public final void b(int i10) {
            int[] iArr = this.f2048a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i10, 10) + 1];
                this.f2048a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 < iArr.length) {
            } else {
                int length = iArr.length;
                while (length <= i10) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f2048a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f2048a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public final a c(int i10) {
            List<a> list = this.f2049b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f2049b.get(size);
                if (aVar.f2050s == i10) {
                    return aVar;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int d(int r5) {
            /*
                r4 = this;
                int[] r0 = r4.f2048a
                r1 = -1
                if (r0 != 0) goto L6
                return r1
            L6:
                int r0 = r0.length
                if (r5 < r0) goto La
                return r1
            La:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f2049b
                if (r0 != 0) goto L10
            Le:
                r0 = r1
                goto L46
            L10:
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = r4.c(r5)
                if (r0 == 0) goto L1b
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r2 = r4.f2049b
                r2.remove(r0)
            L1b:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f2049b
                int r0 = r0.size()
                r2 = 0
            L22:
                if (r2 >= r0) goto L34
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r4.f2049b
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r3
                int r3 = r3.f2050s
                if (r3 < r5) goto L31
                goto L35
            L31:
                int r2 = r2 + 1
                goto L22
            L34:
                r2 = r1
            L35:
                if (r2 == r1) goto Le
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f2049b
                java.lang.Object r0 = r0.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r0
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r4.f2049b
                r3.remove(r2)
                int r0 = r0.f2050s
            L46:
                if (r0 != r1) goto L52
                int[] r0 = r4.f2048a
                int r2 = r0.length
                java.util.Arrays.fill(r0, r5, r2, r1)
                int[] r5 = r4.f2048a
                int r5 = r5.length
                return r5
            L52:
                int[] r2 = r4.f2048a
                int r0 = r0 + 1
                java.util.Arrays.fill(r2, r5, r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.d.d(int):int");
        }

        public final void e(int i10, int i11) {
            int[] iArr = this.f2048a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            b(i12);
            int[] iArr2 = this.f2048a;
            System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
            Arrays.fill(this.f2048a, i10, i12, -1);
            List<a> list = this.f2049b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f2049b.get(size);
                int i13 = aVar.f2050s;
                if (i13 >= i10) {
                    aVar.f2050s = i13 + i11;
                }
            }
        }

        public final void f(int i10, int i11) {
            int[] iArr = this.f2048a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            b(i12);
            int[] iArr2 = this.f2048a;
            System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
            int[] iArr3 = this.f2048a;
            Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
            List<a> list = this.f2049b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f2049b.get(size);
                int i13 = aVar.f2050s;
                if (i13 >= i10) {
                    if (i13 < i12) {
                        this.f2049b.remove(size);
                    } else {
                        aVar.f2050s = i13 - i11;
                    }
                }
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();
        public boolean A;
        public boolean B;

        /* renamed from: s */
        public int f2054s;

        /* renamed from: t */
        public int f2055t;

        /* renamed from: u */
        public int f2056u;

        /* renamed from: v */
        public int[] f2057v;

        /* renamed from: w */
        public int f2058w;

        /* renamed from: x */
        public int[] f2059x;
        public List<d.a> y;

        /* renamed from: z */
        public boolean f2060z;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public final e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final e[] newArray(int i10) {
                return new e[i10];
            }
        }

        public e() {
        }

        public e(Parcel parcel) {
            this.f2054s = parcel.readInt();
            this.f2055t = parcel.readInt();
            int readInt = parcel.readInt();
            this.f2056u = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f2057v = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f2058w = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f2059x = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z10 = false;
            this.f2060z = parcel.readInt() == 1;
            this.A = parcel.readInt() == 1;
            this.B = parcel.readInt() == 1 ? true : z10;
            this.y = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f2056u = eVar.f2056u;
            this.f2054s = eVar.f2054s;
            this.f2055t = eVar.f2055t;
            this.f2057v = eVar.f2057v;
            this.f2058w = eVar.f2058w;
            this.f2059x = eVar.f2059x;
            this.f2060z = eVar.f2060z;
            this.A = eVar.A;
            this.B = eVar.B;
            this.y = eVar.y;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f2054s);
            parcel.writeInt(this.f2055t);
            parcel.writeInt(this.f2056u);
            if (this.f2056u > 0) {
                parcel.writeIntArray(this.f2057v);
            }
            parcel.writeInt(this.f2058w);
            if (this.f2058w > 0) {
                parcel.writeIntArray(this.f2059x);
            }
            parcel.writeInt(this.f2060z ? 1 : 0);
            parcel.writeInt(this.A ? 1 : 0);
            parcel.writeInt(this.B ? 1 : 0);
            parcel.writeList(this.y);
        }
    }

    /* loaded from: classes.dex */
    public class f {

        /* renamed from: a */
        public ArrayList<View> f2061a = new ArrayList<>();

        /* renamed from: b */
        public int f2062b = Integer.MIN_VALUE;

        /* renamed from: c */
        public int f2063c = Integer.MIN_VALUE;

        /* renamed from: d */
        public int f2064d = 0;

        /* renamed from: e */
        public final int f2065e;

        public f(int i10) {
            StaggeredGridLayoutManager.this = r1;
            this.f2065e = i10;
        }

        public final void a(View view) {
            c cVar = (c) view.getLayoutParams();
            cVar.f2047e = this;
            this.f2061a.add(view);
            this.f2063c = Integer.MIN_VALUE;
            if (this.f2061a.size() == 1) {
                this.f2062b = Integer.MIN_VALUE;
            }
            if (cVar.c() || cVar.b()) {
                this.f2064d = StaggeredGridLayoutManager.this.f2033t.c(view) + this.f2064d;
            }
        }

        public final void b() {
            ArrayList<View> arrayList = this.f2061a;
            View view = arrayList.get(arrayList.size() - 1);
            c j3 = j(view);
            this.f2063c = StaggeredGridLayoutManager.this.f2033t.b(view);
            Objects.requireNonNull(j3);
        }

        public final void c() {
            View view = this.f2061a.get(0);
            c j3 = j(view);
            this.f2062b = StaggeredGridLayoutManager.this.f2033t.e(view);
            Objects.requireNonNull(j3);
        }

        public final void d() {
            this.f2061a.clear();
            this.f2062b = Integer.MIN_VALUE;
            this.f2063c = Integer.MIN_VALUE;
            this.f2064d = 0;
        }

        public final int e() {
            int i10;
            int i11;
            if (StaggeredGridLayoutManager.this.y) {
                i11 = this.f2061a.size() - 1;
                i10 = -1;
            } else {
                i11 = 0;
                i10 = this.f2061a.size();
            }
            return g(i11, i10);
        }

        public final int f() {
            int i10;
            int i11;
            if (StaggeredGridLayoutManager.this.y) {
                i11 = 0;
                i10 = this.f2061a.size();
            } else {
                i11 = this.f2061a.size() - 1;
                i10 = -1;
            }
            return g(i11, i10);
        }

        public final int g(int i10, int i11) {
            int k10 = StaggeredGridLayoutManager.this.f2033t.k();
            int g10 = StaggeredGridLayoutManager.this.f2033t.g();
            int i12 = i11 > i10 ? 1 : -1;
            while (i10 != i11) {
                View view = this.f2061a.get(i10);
                int e10 = StaggeredGridLayoutManager.this.f2033t.e(view);
                int b10 = StaggeredGridLayoutManager.this.f2033t.b(view);
                boolean z10 = false;
                boolean z11 = e10 <= g10;
                if (b10 >= k10) {
                    z10 = true;
                }
                if (z11 && z10 && (e10 < k10 || b10 > g10)) {
                    return StaggeredGridLayoutManager.this.N(view);
                }
                i10 += i12;
            }
            return -1;
        }

        public final int h(int i10) {
            int i11 = this.f2063c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f2061a.size() == 0) {
                return i10;
            }
            b();
            return this.f2063c;
        }

        public final View i(int i10, int i11) {
            View view = null;
            if (i11 != -1) {
                int size = this.f2061a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f2061a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.y && staggeredGridLayoutManager.N(view2) >= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.y && staggeredGridLayoutManager2.N(view2) <= i10) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f2061a.size();
                int i12 = 0;
                while (i12 < size2) {
                    View view3 = this.f2061a.get(i12);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.y && staggeredGridLayoutManager3.N(view3) <= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.y && staggeredGridLayoutManager4.N(view3) >= i10) || !view3.hasFocusable()) {
                        break;
                    }
                    i12++;
                    view = view3;
                }
            }
            return view;
        }

        public final c j(View view) {
            return (c) view.getLayoutParams();
        }

        public final int k(int i10) {
            int i11 = this.f2062b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f2061a.size() == 0) {
                return i10;
            }
            c();
            return this.f2062b;
        }

        public final void l() {
            int size = this.f2061a.size();
            View remove = this.f2061a.remove(size - 1);
            c j3 = j(remove);
            j3.f2047e = null;
            if (j3.c() || j3.b()) {
                this.f2064d -= StaggeredGridLayoutManager.this.f2033t.c(remove);
            }
            if (size == 1) {
                this.f2062b = Integer.MIN_VALUE;
            }
            this.f2063c = Integer.MIN_VALUE;
        }

        public final void m() {
            View remove = this.f2061a.remove(0);
            c j3 = j(remove);
            j3.f2047e = null;
            if (this.f2061a.size() == 0) {
                this.f2063c = Integer.MIN_VALUE;
            }
            if (j3.c() || j3.b()) {
                this.f2064d -= StaggeredGridLayoutManager.this.f2033t.c(remove);
            }
            this.f2062b = Integer.MIN_VALUE;
        }

        public final void n(View view) {
            c cVar = (c) view.getLayoutParams();
            cVar.f2047e = this;
            this.f2061a.add(0, view);
            this.f2062b = Integer.MIN_VALUE;
            if (this.f2061a.size() == 1) {
                this.f2063c = Integer.MIN_VALUE;
            }
            if (cVar.c() || cVar.b()) {
                this.f2064d = StaggeredGridLayoutManager.this.f2033t.c(view) + this.f2064d;
            }
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f2031r = -1;
        this.y = false;
        RecyclerView.m.d O = RecyclerView.m.O(context, attributeSet, i10, i11);
        int i12 = O.f1972a;
        if (i12 != 0 && i12 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        d(null);
        if (i12 != this.f2035v) {
            this.f2035v = i12;
            s sVar = this.f2033t;
            this.f2033t = this.f2034u;
            this.f2034u = sVar;
            s0();
        }
        int i13 = O.f1973b;
        d(null);
        if (i13 != this.f2031r) {
            this.D.a();
            s0();
            this.f2031r = i13;
            this.A = new BitSet(this.f2031r);
            this.f2032s = new f[this.f2031r];
            for (int i14 = 0; i14 < this.f2031r; i14++) {
                this.f2032s[i14] = new f(i14);
            }
            s0();
        }
        boolean z10 = O.f1974c;
        d(null);
        e eVar = this.H;
        if (eVar != null && eVar.f2060z != z10) {
            eVar.f2060z = z10;
        }
        this.y = z10;
        s0();
        this.f2037x = new n();
        this.f2033t = s.a(this, this.f2035v);
        this.f2034u = s.a(this, 1 - this.f2035v);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void F0(RecyclerView recyclerView, int i10) {
        o oVar = new o(recyclerView.getContext());
        oVar.f1996a = i10;
        G0(oVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean H0() {
        return this.H == null;
    }

    public final int I0(int i10) {
        if (x() == 0) {
            return this.f2038z ? 1 : -1;
        }
        return (i10 < S0()) != this.f2038z ? -1 : 1;
    }

    public final boolean J0() {
        int i10;
        if (x() != 0 && this.E != 0 && this.f1962i) {
            if (this.f2038z) {
                i10 = T0();
                S0();
            } else {
                i10 = S0();
                T0();
            }
            if (i10 == 0 && X0() != null) {
                this.D.a();
                this.f1961h = true;
                s0();
                return true;
            }
        }
        return false;
    }

    public final int K0(RecyclerView.x xVar) {
        if (x() == 0) {
            return 0;
        }
        return y.a(xVar, this.f2033t, P0(!this.K), O0(!this.K), this, this.K);
    }

    public final int L0(RecyclerView.x xVar) {
        if (x() == 0) {
            return 0;
        }
        return y.b(xVar, this.f2033t, P0(!this.K), O0(!this.K), this, this.K, this.f2038z);
    }

    public final int M0(RecyclerView.x xVar) {
        if (x() == 0) {
            return 0;
        }
        return y.c(xVar, this.f2033t, P0(!this.K), O0(!this.K), this, this.K);
    }

    public final int N0(RecyclerView.s sVar, n nVar, RecyclerView.x xVar) {
        int i10;
        f fVar;
        boolean z10;
        boolean z11;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23 = 0;
        this.A.set(0, this.f2031r, true);
        if (this.f2037x.f2201i) {
            i10 = nVar.f2197e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i10 = nVar.f2197e == 1 ? nVar.f2199g + nVar.f2194b : nVar.f2198f - nVar.f2194b;
        }
        j1(nVar.f2197e, i10);
        int g10 = this.f2038z ? this.f2033t.g() : this.f2033t.k();
        Object[] objArr = null;
        while (true) {
            int i24 = nVar.f2195c;
            int i25 = -1;
            if (((i24 < 0 || i24 >= xVar.b()) ? i23 : 1) == 0 || (!this.f2037x.f2201i && this.A.isEmpty())) {
                break;
            }
            View view = sVar.j(nVar.f2195c, Long.MAX_VALUE).f1924a;
            nVar.f2195c += nVar.f2196d;
            c cVar = (c) view.getLayoutParams();
            int a10 = cVar.a();
            int[] iArr = this.D.f2048a;
            int i26 = (iArr == null || a10 >= iArr.length) ? -1 : iArr[a10];
            if ((i26 == -1 ? 1 : i23) != 0) {
                if (b1(nVar.f2197e)) {
                    i21 = this.f2031r - 1;
                    i22 = -1;
                } else {
                    i25 = this.f2031r;
                    i21 = i23;
                    i22 = 1;
                }
                f fVar2 = null;
                if (nVar.f2197e == 1) {
                    int k10 = this.f2033t.k();
                    int i27 = Integer.MAX_VALUE;
                    while (i21 != i25) {
                        f fVar3 = this.f2032s[i21];
                        int h10 = fVar3.h(k10);
                        if (h10 < i27) {
                            i27 = h10;
                            fVar2 = fVar3;
                        }
                        i21 += i22;
                    }
                } else {
                    int g11 = this.f2033t.g();
                    int i28 = Integer.MIN_VALUE;
                    while (i21 != i25) {
                        f fVar4 = this.f2032s[i21];
                        int k11 = fVar4.k(g11);
                        if (k11 > i28) {
                            fVar2 = fVar4;
                            i28 = k11;
                        }
                        i21 += i22;
                    }
                }
                fVar = fVar2;
                d dVar = this.D;
                dVar.b(a10);
                dVar.f2048a[a10] = fVar.f2065e;
            } else {
                fVar = this.f2032s[i26];
            }
            f fVar5 = fVar;
            cVar.f2047e = fVar5;
            if (nVar.f2197e == 1) {
                b(view);
                z10 = false;
            } else {
                z10 = false;
                c(view, 0, false);
            }
            if (this.f2035v == 1) {
                int i29 = this.f2036w;
                int i30 = this.f1967n;
                int i31 = ((ViewGroup.MarginLayoutParams) cVar).width;
                int i32 = z10 ? 1 : 0;
                int i33 = z10 ? 1 : 0;
                i11 = RecyclerView.m.y(i29, i30, i32, i31, z10);
                i12 = RecyclerView.m.y(this.f1969q, this.f1968o, J() + M(), ((ViewGroup.MarginLayoutParams) cVar).height, true);
                z11 = false;
            } else {
                i11 = RecyclerView.m.y(this.p, this.f1967n, L() + K(), ((ViewGroup.MarginLayoutParams) cVar).width, true);
                z11 = false;
                i12 = RecyclerView.m.y(this.f2036w, this.f1968o, 0, ((ViewGroup.MarginLayoutParams) cVar).height, false);
            }
            Z0(view, i11, i12, z11);
            if (nVar.f2197e == 1) {
                i14 = fVar5.h(g10);
                i13 = this.f2033t.c(view) + i14;
            } else {
                i13 = fVar5.k(g10);
                i14 = i13 - this.f2033t.c(view);
            }
            int i34 = nVar.f2197e;
            f fVar6 = cVar.f2047e;
            if (i34 == 1) {
                fVar6.a(view);
            } else {
                fVar6.n(view);
            }
            if (!Y0() || this.f2035v != 1) {
                i15 = this.f2034u.k() + (fVar5.f2065e * this.f2036w);
                i16 = this.f2034u.c(view) + i15;
            } else {
                i16 = this.f2034u.g() - (((this.f2031r - 1) - fVar5.f2065e) * this.f2036w);
                i15 = i16 - this.f2034u.c(view);
            }
            if (this.f2035v == 1) {
                i18 = i16;
                i17 = i13;
                i19 = i15;
                i15 = i14;
            } else {
                i17 = i16;
                i18 = i13;
                i19 = i14;
            }
            T(view, i19, i15, i18, i17);
            l1(fVar5, this.f2037x.f2197e, i10);
            d1(sVar, this.f2037x);
            if (!this.f2037x.f2200h || !view.hasFocusable()) {
                i20 = 0;
            } else {
                i20 = 0;
                this.A.set(fVar5.f2065e, false);
            }
            i23 = i20;
            objArr = 1;
        }
        int i35 = i23;
        if (objArr == null) {
            d1(sVar, this.f2037x);
        }
        int k12 = this.f2037x.f2197e == -1 ? this.f2033t.k() - V0(this.f2033t.k()) : U0(this.f2033t.g()) - this.f2033t.g();
        return k12 > 0 ? Math.min(nVar.f2194b, k12) : i35;
    }

    public final View O0(boolean z10) {
        int k10 = this.f2033t.k();
        int g10 = this.f2033t.g();
        View view = null;
        for (int x10 = x() - 1; x10 >= 0; x10--) {
            View w10 = w(x10);
            int e10 = this.f2033t.e(w10);
            int b10 = this.f2033t.b(w10);
            if (b10 > k10 && e10 < g10) {
                if (b10 <= g10 || !z10) {
                    return w10;
                }
                if (view == null) {
                    view = w10;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int P(RecyclerView.s sVar, RecyclerView.x xVar) {
        return this.f2035v == 0 ? this.f2031r : super.P(sVar, xVar);
    }

    public final View P0(boolean z10) {
        int k10 = this.f2033t.k();
        int g10 = this.f2033t.g();
        int x10 = x();
        View view = null;
        for (int i10 = 0; i10 < x10; i10++) {
            View w10 = w(i10);
            int e10 = this.f2033t.e(w10);
            if (this.f2033t.b(w10) > k10 && e10 < g10) {
                if (e10 >= k10 || !z10) {
                    return w10;
                }
                if (view == null) {
                    view = w10;
                }
            }
        }
        return view;
    }

    public final void Q0(RecyclerView.s sVar, RecyclerView.x xVar, boolean z10) {
        int g10;
        int U0 = U0(Integer.MIN_VALUE);
        if (U0 != Integer.MIN_VALUE && (g10 = this.f2033t.g() - U0) > 0) {
            int i10 = g10 - (-h1(-g10, sVar, xVar));
            if (!z10 || i10 <= 0) {
                return;
            }
            this.f2033t.p(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean R() {
        return this.E != 0;
    }

    public final void R0(RecyclerView.s sVar, RecyclerView.x xVar, boolean z10) {
        int k10;
        int V0 = V0(Integer.MAX_VALUE);
        if (V0 != Integer.MAX_VALUE && (k10 = V0 - this.f2033t.k()) > 0) {
            int h12 = k10 - h1(k10, sVar, xVar);
            if (!z10 || h12 <= 0) {
                return;
            }
            this.f2033t.p(-h12);
        }
    }

    public final int S0() {
        if (x() == 0) {
            return 0;
        }
        return N(w(0));
    }

    public final int T0() {
        int x10 = x();
        if (x10 == 0) {
            return 0;
        }
        return N(w(x10 - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void U(int i10) {
        super.U(i10);
        for (int i11 = 0; i11 < this.f2031r; i11++) {
            f fVar = this.f2032s[i11];
            int i12 = fVar.f2062b;
            if (i12 != Integer.MIN_VALUE) {
                fVar.f2062b = i12 + i10;
            }
            int i13 = fVar.f2063c;
            if (i13 != Integer.MIN_VALUE) {
                fVar.f2063c = i13 + i10;
            }
        }
    }

    public final int U0(int i10) {
        int h10 = this.f2032s[0].h(i10);
        for (int i11 = 1; i11 < this.f2031r; i11++) {
            int h11 = this.f2032s[i11].h(i10);
            if (h11 > h10) {
                h10 = h11;
            }
        }
        return h10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void V(int i10) {
        super.V(i10);
        for (int i11 = 0; i11 < this.f2031r; i11++) {
            f fVar = this.f2032s[i11];
            int i12 = fVar.f2062b;
            if (i12 != Integer.MIN_VALUE) {
                fVar.f2062b = i12 + i10;
            }
            int i13 = fVar.f2063c;
            if (i13 != Integer.MIN_VALUE) {
                fVar.f2063c = i13 + i10;
            }
        }
    }

    public final int V0(int i10) {
        int k10 = this.f2032s[0].k(i10);
        for (int i11 = 1; i11 < this.f2031r; i11++) {
            int k11 = this.f2032s[i11].k(i10);
            if (k11 < k10) {
                k10 = k11;
            }
        }
        return k10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void W(RecyclerView recyclerView) {
        a aVar = this.M;
        RecyclerView recyclerView2 = this.f1955b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(aVar);
        }
        for (int i10 = 0; i10 < this.f2031r; i10++) {
            this.f2032s[i10].d();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W0(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f2038z
            if (r0 == 0) goto L9
            int r0 = r6.T0()
            goto Ld
        L9:
            int r0 = r6.S0()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1a
            if (r7 >= r8) goto L16
            int r2 = r8 + 1
            goto L1c
        L16:
            int r2 = r7 + 1
            r3 = r8
            goto L1d
        L1a:
            int r2 = r7 + r8
        L1c:
            r3 = r7
        L1d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.D
            r4.d(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.D
            r9.f(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.D
            r7.e(r8, r4)
            goto L41
        L36:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.D
            r9.f(r7, r8)
            goto L41
        L3c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.D
            r9.e(r7, r8)
        L41:
            if (r2 > r0) goto L44
            return
        L44:
            boolean r7 = r6.f2038z
            if (r7 == 0) goto L4d
            int r7 = r6.S0()
            goto L51
        L4d:
            int r7 = r6.T0()
        L51:
            if (r3 > r7) goto L56
            r6.s0()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.W0(int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0038, code lost:
        if (r8.f2035v == 1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003d, code lost:
        if (r8.f2035v == 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004b, code lost:
        if (Y0() == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0057, code lost:
        if (Y0() == false) goto L38;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View X(android.view.View r9, int r10, androidx.recyclerview.widget.RecyclerView.s r11, androidx.recyclerview.widget.RecyclerView.x r12) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.X(android.view.View, int, androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x):android.view.View");
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b3, code lost:
        if (r10 == r11) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c5, code lost:
        if (r10 == r11) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c7, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c9, code lost:
        r10 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View X0() {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.X0():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void Y(AccessibilityEvent accessibilityEvent) {
        super.Y(accessibilityEvent);
        if (x() > 0) {
            View P0 = P0(false);
            View O0 = O0(false);
            if (P0 == null || O0 == null) {
                return;
            }
            int N = N(P0);
            int N2 = N(O0);
            if (N < N2) {
                accessibilityEvent.setFromIndex(N);
                accessibilityEvent.setToIndex(N2);
                return;
            }
            accessibilityEvent.setFromIndex(N2);
            accessibilityEvent.setToIndex(N);
        }
    }

    public final boolean Y0() {
        return G() == 1;
    }

    public final void Z0(View view, int i10, int i11, boolean z10) {
        Rect rect = this.I;
        RecyclerView recyclerView = this.f1955b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.L(view));
        }
        c cVar = (c) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect2 = this.I;
        int m12 = m1(i10, i12 + rect2.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect2.right);
        int i13 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect3 = this.I;
        int m13 = m1(i11, i13 + rect3.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect3.bottom);
        if (C0(view, m12, m13, cVar)) {
            view.measure(m12, m13);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.w.b
    public final PointF a(int i10) {
        int I0 = I0(i10);
        PointF pointF = new PointF();
        if (I0 == 0) {
            return null;
        }
        if (this.f2035v == 0) {
            pointF.x = I0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = I0;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void a0(RecyclerView.s sVar, RecyclerView.x xVar, View view, n0.f fVar) {
        int i10;
        int i11;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            Z(view, fVar);
            return;
        }
        c cVar = (c) layoutParams;
        int i12 = 1;
        int i13 = -1;
        if (this.f2035v == 0) {
            f fVar2 = cVar.f2047e;
            i11 = fVar2 == null ? -1 : fVar2.f2065e;
            i10 = -1;
        } else {
            f fVar3 = cVar.f2047e;
            i10 = fVar3 == null ? -1 : fVar3.f2065e;
            i11 = -1;
            i13 = 1;
            i12 = -1;
        }
        fVar.p(f.c.a(i11, i12, i10, i13, false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:236:0x03ee, code lost:
        if (J0() != false) goto L238;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a1(androidx.recyclerview.widget.RecyclerView.s r12, androidx.recyclerview.widget.RecyclerView.x r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 1040
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.a1(androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x, boolean):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void b0(int i10, int i11) {
        W0(i10, i11, 1);
    }

    public final boolean b1(int i10) {
        if (this.f2035v == 0) {
            return (i10 == -1) != this.f2038z;
        }
        return ((i10 == -1) == this.f2038z) == Y0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void c0() {
        this.D.a();
        s0();
    }

    public final void c1(int i10, RecyclerView.x xVar) {
        int i11;
        int i12;
        if (i10 > 0) {
            i12 = T0();
            i11 = 1;
        } else {
            i11 = -1;
            i12 = S0();
        }
        this.f2037x.f2193a = true;
        k1(i12, xVar);
        i1(i11);
        n nVar = this.f2037x;
        nVar.f2195c = i12 + nVar.f2196d;
        nVar.f2194b = Math.abs(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void d(String str) {
        if (this.H == null) {
            super.d(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void d0(int i10, int i11) {
        W0(i10, i11, 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0011, code lost:
        if (r6.f2197e == (-1)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d1(androidx.recyclerview.widget.RecyclerView.s r5, androidx.recyclerview.widget.n r6) {
        /*
            r4 = this;
            boolean r0 = r6.f2193a
            if (r0 == 0) goto L7c
            boolean r0 = r6.f2201i
            if (r0 == 0) goto La
            goto L7c
        La:
            int r0 = r6.f2194b
            r1 = -1
            if (r0 != 0) goto L1f
            int r0 = r6.f2197e
            if (r0 != r1) goto L19
        L13:
            int r6 = r6.f2199g
        L15:
            r4.e1(r5, r6)
            goto L7c
        L19:
            int r6 = r6.f2198f
        L1b:
            r4.f1(r5, r6)
            goto L7c
        L1f:
            int r0 = r6.f2197e
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L50
            int r0 = r6.f2198f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.f2032s
            r1 = r1[r2]
            int r1 = r1.k(r0)
        L2f:
            int r2 = r4.f2031r
            if (r3 >= r2) goto L41
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r4.f2032s
            r2 = r2[r3]
            int r2 = r2.k(r0)
            if (r2 <= r1) goto L3e
            r1 = r2
        L3e:
            int r3 = r3 + 1
            goto L2f
        L41:
            int r0 = r0 - r1
            if (r0 >= 0) goto L45
            goto L13
        L45:
            int r1 = r6.f2199g
            int r6 = r6.f2194b
            int r6 = java.lang.Math.min(r0, r6)
            int r6 = r1 - r6
            goto L15
        L50:
            int r0 = r6.f2199g
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.f2032s
            r1 = r1[r2]
            int r1 = r1.h(r0)
        L5a:
            int r2 = r4.f2031r
            if (r3 >= r2) goto L6c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r4.f2032s
            r2 = r2[r3]
            int r2 = r2.h(r0)
            if (r2 >= r1) goto L69
            r1 = r2
        L69:
            int r3 = r3 + 1
            goto L5a
        L6c:
            int r0 = r6.f2199g
            int r1 = r1 - r0
            if (r1 >= 0) goto L72
            goto L19
        L72:
            int r0 = r6.f2198f
            int r6 = r6.f2194b
            int r6 = java.lang.Math.min(r1, r6)
            int r6 = r6 + r0
            goto L1b
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.d1(androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.n):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean e() {
        return this.f2035v == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void e0(int i10, int i11) {
        W0(i10, i11, 2);
    }

    public final void e1(RecyclerView.s sVar, int i10) {
        for (int x10 = x() - 1; x10 >= 0; x10--) {
            View w10 = w(x10);
            if (this.f2033t.e(w10) < i10 || this.f2033t.o(w10) < i10) {
                return;
            }
            c cVar = (c) w10.getLayoutParams();
            Objects.requireNonNull(cVar);
            if (cVar.f2047e.f2061a.size() == 1) {
                return;
            }
            cVar.f2047e.l();
            o0(w10, sVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean f() {
        return this.f2035v == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void f0(int i10, int i11) {
        W0(i10, i11, 4);
    }

    public final void f1(RecyclerView.s sVar, int i10) {
        while (x() > 0) {
            View w10 = w(0);
            if (this.f2033t.b(w10) > i10 || this.f2033t.n(w10) > i10) {
                return;
            }
            c cVar = (c) w10.getLayoutParams();
            Objects.requireNonNull(cVar);
            if (cVar.f2047e.f2061a.size() == 1) {
                return;
            }
            cVar.f2047e.m();
            o0(w10, sVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final boolean g(RecyclerView.n nVar) {
        return nVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void g0(RecyclerView.s sVar, RecyclerView.x xVar) {
        a1(sVar, xVar, true);
    }

    public final void g1() {
        this.f2038z = (this.f2035v == 1 || !Y0()) ? this.y : !this.y;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void h0() {
        this.B = -1;
        this.C = Integer.MIN_VALUE;
        this.H = null;
        this.J.b();
    }

    public final int h1(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        if (x() == 0 || i10 == 0) {
            return 0;
        }
        c1(i10, xVar);
        int N0 = N0(sVar, this.f2037x, xVar);
        if (this.f2037x.f2194b >= N0) {
            i10 = i10 < 0 ? -N0 : N0;
        }
        this.f2033t.p(-i10);
        this.F = this.f2038z;
        n nVar = this.f2037x;
        nVar.f2194b = 0;
        d1(sVar, nVar);
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void i(int i10, int i11, RecyclerView.x xVar, RecyclerView.m.c cVar) {
        int i12;
        int i13;
        if (this.f2035v != 0) {
            i10 = i11;
        }
        if (x() == 0 || i10 == 0) {
            return;
        }
        c1(i10, xVar);
        int[] iArr = this.L;
        if (iArr == null || iArr.length < this.f2031r) {
            this.L = new int[this.f2031r];
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f2031r; i15++) {
            n nVar = this.f2037x;
            if (nVar.f2196d == -1) {
                i13 = nVar.f2198f;
                i12 = this.f2032s[i15].k(i13);
            } else {
                i13 = this.f2032s[i15].h(nVar.f2199g);
                i12 = this.f2037x.f2199g;
            }
            int i16 = i13 - i12;
            if (i16 >= 0) {
                this.L[i14] = i16;
                i14++;
            }
        }
        Arrays.sort(this.L, 0, i14);
        for (int i17 = 0; i17 < i14; i17++) {
            int i18 = this.f2037x.f2195c;
            if (!(i18 >= 0 && i18 < xVar.b())) {
                return;
            }
            ((m.b) cVar).a(this.f2037x.f2195c, this.L[i17]);
            n nVar2 = this.f2037x;
            nVar2.f2195c += nVar2.f2196d;
        }
    }

    public final void i1(int i10) {
        n nVar = this.f2037x;
        nVar.f2197e = i10;
        int i11 = 1;
        if (this.f2038z != (i10 == -1)) {
            i11 = -1;
        }
        nVar.f2196d = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void j0(Parcelable parcelable) {
        if (parcelable instanceof e) {
            this.H = (e) parcelable;
            s0();
        }
    }

    public final void j1(int i10, int i11) {
        for (int i12 = 0; i12 < this.f2031r; i12++) {
            if (!this.f2032s[i12].f2061a.isEmpty()) {
                l1(this.f2032s[i12], i10, i11);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int k(RecyclerView.x xVar) {
        return K0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final Parcelable k0() {
        int i10;
        int i11;
        int[] iArr;
        e eVar = this.H;
        if (eVar != null) {
            return new e(eVar);
        }
        e eVar2 = new e();
        eVar2.f2060z = this.y;
        eVar2.A = this.F;
        eVar2.B = this.G;
        d dVar = this.D;
        if (dVar == null || (iArr = dVar.f2048a) == null) {
            eVar2.f2058w = 0;
        } else {
            eVar2.f2059x = iArr;
            eVar2.f2058w = iArr.length;
            eVar2.y = dVar.f2049b;
        }
        int i12 = -1;
        if (x() > 0) {
            eVar2.f2054s = this.F ? T0() : S0();
            View O0 = this.f2038z ? O0(true) : P0(true);
            if (O0 != null) {
                i12 = N(O0);
            }
            eVar2.f2055t = i12;
            int i13 = this.f2031r;
            eVar2.f2056u = i13;
            eVar2.f2057v = new int[i13];
            for (int i14 = 0; i14 < this.f2031r; i14++) {
                if (this.F) {
                    i10 = this.f2032s[i14].h(Integer.MIN_VALUE);
                    if (i10 != Integer.MIN_VALUE) {
                        i11 = this.f2033t.g();
                        i10 -= i11;
                        eVar2.f2057v[i14] = i10;
                    } else {
                        eVar2.f2057v[i14] = i10;
                    }
                } else {
                    i10 = this.f2032s[i14].k(Integer.MIN_VALUE);
                    if (i10 != Integer.MIN_VALUE) {
                        i11 = this.f2033t.k();
                        i10 -= i11;
                        eVar2.f2057v[i14] = i10;
                    } else {
                        eVar2.f2057v[i14] = i10;
                    }
                }
            }
        } else {
            eVar2.f2054s = -1;
            eVar2.f2055t = -1;
            eVar2.f2056u = 0;
        }
        return eVar2;
    }

    public final void k1(int i10, RecyclerView.x xVar) {
        int i11;
        int i12;
        int i13;
        n nVar = this.f2037x;
        boolean z10 = false;
        nVar.f2194b = 0;
        nVar.f2195c = i10;
        RecyclerView.w wVar = this.f1960g;
        if (!(wVar != null && wVar.f2000e) || (i13 = xVar.f2011a) == -1) {
            i12 = 0;
            i11 = 0;
        } else {
            if (this.f2038z == (i13 < i10)) {
                i12 = this.f2033t.l();
                i11 = 0;
            } else {
                i11 = this.f2033t.l();
                i12 = 0;
            }
        }
        RecyclerView recyclerView = this.f1955b;
        if (recyclerView != null && recyclerView.y) {
            this.f2037x.f2198f = this.f2033t.k() - i11;
            this.f2037x.f2199g = this.f2033t.g() + i12;
        } else {
            this.f2037x.f2199g = this.f2033t.f() + i12;
            this.f2037x.f2198f = -i11;
        }
        n nVar2 = this.f2037x;
        nVar2.f2200h = false;
        nVar2.f2193a = true;
        if (this.f2033t.i() == 0 && this.f2033t.f() == 0) {
            z10 = true;
        }
        nVar2.f2201i = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int l(RecyclerView.x xVar) {
        return L0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void l0(int i10) {
        if (i10 == 0) {
            J0();
        }
    }

    public final void l1(f fVar, int i10, int i11) {
        int i12 = fVar.f2064d;
        if (i10 == -1) {
            int i13 = fVar.f2062b;
            if (i13 == Integer.MIN_VALUE) {
                fVar.c();
                i13 = fVar.f2062b;
            }
            if (i13 + i12 > i11) {
                return;
            }
        } else {
            int i14 = fVar.f2063c;
            if (i14 == Integer.MIN_VALUE) {
                fVar.b();
                i14 = fVar.f2063c;
            }
            if (i14 - i12 < i11) {
                return;
            }
        }
        this.A.set(fVar.f2065e, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int m(RecyclerView.x xVar) {
        return M0(xVar);
    }

    public final int m1(int i10, int i11, int i12) {
        if (i11 == 0 && i12 == 0) {
            return i10;
        }
        int mode = View.MeasureSpec.getMode(i10);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode) : i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int n(RecyclerView.x xVar) {
        return K0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int o(RecyclerView.x xVar) {
        return L0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int p(RecyclerView.x xVar) {
        return M0(xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n t() {
        return this.f2035v == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int t0(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        return h1(i10, sVar, xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n u(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void u0(int i10) {
        e eVar = this.H;
        if (eVar != null && eVar.f2054s != i10) {
            eVar.f2057v = null;
            eVar.f2056u = 0;
            eVar.f2054s = -1;
            eVar.f2055t = -1;
        }
        this.B = i10;
        this.C = Integer.MIN_VALUE;
        s0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final RecyclerView.n v(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int v0(int i10, RecyclerView.s sVar, RecyclerView.x xVar) {
        return h1(i10, sVar, xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final int z(RecyclerView.s sVar, RecyclerView.x xVar) {
        return this.f2035v == 1 ? this.f2031r : super.z(sVar, xVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public final void z0(Rect rect, int i10, int i11) {
        int i12;
        int i13;
        int L = L() + K();
        int J = J() + M();
        if (this.f2035v == 1) {
            i13 = RecyclerView.m.h(i11, rect.height() + J, H());
            i12 = RecyclerView.m.h(i10, (this.f2036w * this.f2031r) + L, I());
        } else {
            i12 = RecyclerView.m.h(i10, rect.width() + L, I());
            i13 = RecyclerView.m.h(i11, (this.f2036w * this.f2031r) + J, H());
        }
        y0(i12, i13);
    }
}
