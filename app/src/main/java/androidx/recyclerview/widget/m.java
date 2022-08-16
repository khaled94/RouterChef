package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import i0.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: w */
    public static final ThreadLocal<m> f2178w = new ThreadLocal<>();

    /* renamed from: x */
    public static Comparator<c> f2179x = new a();

    /* renamed from: t */
    public long f2181t;

    /* renamed from: u */
    public long f2182u;

    /* renamed from: s */
    public ArrayList<RecyclerView> f2180s = new ArrayList<>();

    /* renamed from: v */
    public ArrayList<c> f2183v = new ArrayList<>();

    /* loaded from: classes.dex */
    public static class a implements Comparator<c> {
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
            if (r0 == null) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0023, code lost:
            if (r0 != false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
            return 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
            return -1;
         */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int compare(androidx.recyclerview.widget.m.c r7, androidx.recyclerview.widget.m.c r8) {
            /*
                r6 = this;
                androidx.recyclerview.widget.m$c r7 = (androidx.recyclerview.widget.m.c) r7
                androidx.recyclerview.widget.m$c r8 = (androidx.recyclerview.widget.m.c) r8
                androidx.recyclerview.widget.RecyclerView r0 = r7.f2191d
                r1 = 0
                r2 = 1
                if (r0 != 0) goto Lc
                r3 = r2
                goto Ld
            Lc:
                r3 = r1
            Ld:
                androidx.recyclerview.widget.RecyclerView r4 = r8.f2191d
                if (r4 != 0) goto L13
                r4 = r2
                goto L14
            L13:
                r4 = r1
            L14:
                r5 = -1
                if (r3 == r4) goto L1d
                if (r0 != 0) goto L1b
            L19:
                r1 = r2
                goto L37
            L1b:
                r1 = r5
                goto L37
            L1d:
                boolean r0 = r7.f2188a
                boolean r3 = r8.f2188a
                if (r0 == r3) goto L26
                if (r0 == 0) goto L19
                goto L1b
            L26:
                int r0 = r8.f2189b
                int r2 = r7.f2189b
                int r0 = r0 - r2
                if (r0 == 0) goto L2f
                r1 = r0
                goto L37
            L2f:
                int r7 = r7.f2190c
                int r8 = r8.f2190c
                int r7 = r7 - r8
                if (r7 == 0) goto L37
                r1 = r7
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.m.a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* loaded from: classes.dex */
    public static class b implements RecyclerView.m.c {

        /* renamed from: a */
        public int f2184a;

        /* renamed from: b */
        public int f2185b;

        /* renamed from: c */
        public int[] f2186c;

        /* renamed from: d */
        public int f2187d;

        public final void a(int i10, int i11) {
            if (i10 >= 0) {
                if (i11 < 0) {
                    throw new IllegalArgumentException("Pixel distance must be non-negative");
                }
                int i12 = this.f2187d * 2;
                int[] iArr = this.f2186c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f2186c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i12 >= iArr.length) {
                    int[] iArr3 = new int[i12 * 2];
                    this.f2186c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f2186c;
                iArr4[i12] = i10;
                iArr4[i12 + 1] = i11;
                this.f2187d++;
                return;
            }
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }

        public final void b(RecyclerView recyclerView, boolean z10) {
            this.f2187d = 0;
            int[] iArr = this.f2186c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.m mVar = recyclerView.E;
            if (recyclerView.D == null || mVar == null || !mVar.f1964k) {
                return;
            }
            if (z10) {
                if (!recyclerView.f1914v.g()) {
                    mVar.j(recyclerView.D.a(), this);
                }
            } else if (!recyclerView.M()) {
                mVar.i(this.f2184a, this.f2185b, recyclerView.x0, this);
            }
            int i10 = this.f2187d;
            if (i10 <= mVar.f1965l) {
                return;
            }
            mVar.f1965l = i10;
            mVar.f1966m = z10;
            recyclerView.f1910t.l();
        }

        public final boolean c(int i10) {
            if (this.f2186c != null) {
                int i11 = this.f2187d * 2;
                for (int i12 = 0; i12 < i11; i12 += 2) {
                    if (this.f2186c[i12] == i10) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public boolean f2188a;

        /* renamed from: b */
        public int f2189b;

        /* renamed from: c */
        public int f2190c;

        /* renamed from: d */
        public RecyclerView f2191d;

        /* renamed from: e */
        public int f2192e;
    }

    public final void a(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow() && this.f2181t == 0) {
            this.f2181t = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        b bVar = recyclerView.f1917w0;
        bVar.f2184a = i10;
        bVar.f2185b = i11;
    }

    public final void b(long j3) {
        c cVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        c cVar2;
        int size = this.f2180s.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView3 = this.f2180s.get(i11);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.f1917w0.b(recyclerView3, false);
                i10 += recyclerView3.f1917w0.f2187d;
            }
        }
        this.f2183v.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView4 = this.f2180s.get(i13);
            if (recyclerView4.getWindowVisibility() == 0) {
                b bVar = recyclerView4.f1917w0;
                int abs = Math.abs(bVar.f2185b) + Math.abs(bVar.f2184a);
                for (int i14 = 0; i14 < bVar.f2187d * 2; i14 += 2) {
                    if (i12 >= this.f2183v.size()) {
                        cVar2 = new c();
                        this.f2183v.add(cVar2);
                    } else {
                        cVar2 = this.f2183v.get(i12);
                    }
                    int[] iArr = bVar.f2186c;
                    int i15 = iArr[i14 + 1];
                    cVar2.f2188a = i15 <= abs;
                    cVar2.f2189b = abs;
                    cVar2.f2190c = i15;
                    cVar2.f2191d = recyclerView4;
                    cVar2.f2192e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(this.f2183v, f2179x);
        for (int i16 = 0; i16 < this.f2183v.size() && (recyclerView = (cVar = this.f2183v.get(i16)).f2191d) != null; i16++) {
            RecyclerView.a0 c10 = c(recyclerView, cVar.f2192e, cVar.f2188a ? Long.MAX_VALUE : j3);
            if (c10 != null && c10.f1925b != null && c10.j() && !c10.k() && (recyclerView2 = c10.f1925b.get()) != null) {
                if (recyclerView2.T && recyclerView2.f1916w.h() != 0) {
                    recyclerView2.a0();
                }
                b bVar2 = recyclerView2.f1917w0;
                bVar2.b(recyclerView2, true);
                if (bVar2.f2187d != 0) {
                    try {
                        int i17 = j.f5171a;
                        j.a.a("RV Nested Prefetch");
                        RecyclerView.x xVar = recyclerView2.x0;
                        RecyclerView.e eVar = recyclerView2.D;
                        xVar.f2014d = 1;
                        xVar.f2015e = eVar.a();
                        xVar.f2017g = false;
                        xVar.f2018h = false;
                        xVar.f2019i = false;
                        for (int i18 = 0; i18 < bVar2.f2187d * 2; i18 += 2) {
                            c(recyclerView2, bVar2.f2186c[i18], j3);
                        }
                        j.a.b();
                    } catch (Throwable th) {
                        int i19 = j.f5171a;
                        j.a.b();
                        throw th;
                    }
                } else {
                    continue;
                }
            }
            cVar.f2188a = false;
            cVar.f2189b = 0;
            cVar.f2190c = 0;
            cVar.f2191d = null;
            cVar.f2192e = 0;
        }
    }

    public final RecyclerView.a0 c(RecyclerView recyclerView, int i10, long j3) {
        boolean z10;
        int h10 = recyclerView.f1916w.h();
        int i11 = 0;
        while (true) {
            if (i11 >= h10) {
                z10 = false;
                break;
            }
            RecyclerView.a0 K = RecyclerView.K(recyclerView.f1916w.g(i11));
            if (K.f1926c == i10 && !K.k()) {
                z10 = true;
                break;
            }
            i11++;
        }
        if (z10) {
            return null;
        }
        RecyclerView.s sVar = recyclerView.f1910t;
        try {
            recyclerView.T();
            RecyclerView.a0 j10 = sVar.j(i10, j3);
            if (j10 != null) {
                if (!j10.j() || j10.k()) {
                    sVar.a(j10, false);
                } else {
                    sVar.g(j10.f1924a);
                }
            }
            return j10;
        } finally {
            recyclerView.U(false);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i10 = j.f5171a;
            j.a.a("RV Prefetch");
            if (this.f2180s.isEmpty()) {
                this.f2181t = 0L;
                j.a.b();
                return;
            }
            int size = this.f2180s.size();
            long j3 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                RecyclerView recyclerView = this.f2180s.get(i11);
                if (recyclerView.getWindowVisibility() == 0) {
                    j3 = Math.max(recyclerView.getDrawingTime(), j3);
                }
            }
            if (j3 == 0) {
                this.f2181t = 0L;
                j.a.b();
                return;
            }
            b(TimeUnit.MILLISECONDS.toNanos(j3) + this.f2182u);
            this.f2181t = 0L;
            j.a.b();
        } catch (Throwable th) {
            this.f2181t = 0L;
            int i12 = j.f5171a;
            j.a.b();
            throw th;
        }
    }
}
