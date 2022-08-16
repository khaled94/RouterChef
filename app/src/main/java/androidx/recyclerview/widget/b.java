package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    public final AbstractC0025b f2081a;

    /* renamed from: b */
    public final a f2082b = new a();

    /* renamed from: c */
    public final List<View> f2083c = new ArrayList();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public long f2084a = 0;

        /* renamed from: b */
        public a f2085b;

        public final void a(int i10) {
            if (i10 < 64) {
                this.f2084a &= ~(1 << i10);
                return;
            }
            a aVar = this.f2085b;
            if (aVar == null) {
                return;
            }
            aVar.a(i10 - 64);
        }

        public final int b(int i10) {
            long j3;
            a aVar = this.f2085b;
            if (aVar == null) {
                if (i10 >= 64) {
                    j3 = this.f2084a;
                    return Long.bitCount(j3);
                }
            } else if (i10 >= 64) {
                return Long.bitCount(this.f2084a) + aVar.b(i10 - 64);
            }
            j3 = this.f2084a & ((1 << i10) - 1);
            return Long.bitCount(j3);
        }

        public final void c() {
            if (this.f2085b == null) {
                this.f2085b = new a();
            }
        }

        public final boolean d(int i10) {
            if (i10 < 64) {
                return (this.f2084a & (1 << i10)) != 0;
            }
            c();
            return this.f2085b.d(i10 - 64);
        }

        public final void e(int i10, boolean z10) {
            if (i10 >= 64) {
                c();
                this.f2085b.e(i10 - 64, z10);
                return;
            }
            long j3 = this.f2084a;
            boolean z11 = (Long.MIN_VALUE & j3) != 0;
            long j10 = (1 << i10) - 1;
            this.f2084a = ((j3 & (~j10)) << 1) | (j3 & j10);
            if (z10) {
                h(i10);
            } else {
                a(i10);
            }
            if (!z11 && this.f2085b == null) {
                return;
            }
            c();
            this.f2085b.e(0, z11);
        }

        public final boolean f(int i10) {
            if (i10 >= 64) {
                c();
                return this.f2085b.f(i10 - 64);
            }
            long j3 = 1 << i10;
            long j10 = this.f2084a;
            boolean z10 = (j10 & j3) != 0;
            long j11 = j10 & (~j3);
            this.f2084a = j11;
            long j12 = j3 - 1;
            this.f2084a = (j11 & j12) | Long.rotateRight((~j12) & j11, 1);
            a aVar = this.f2085b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f2085b.f(0);
            }
            return z10;
        }

        public final void g() {
            this.f2084a = 0L;
            a aVar = this.f2085b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public final void h(int i10) {
            if (i10 < 64) {
                this.f2084a |= 1 << i10;
                return;
            }
            c();
            this.f2085b.h(i10 - 64);
        }

        public final String toString() {
            if (this.f2085b == null) {
                return Long.toBinaryString(this.f2084a);
            }
            return this.f2085b.toString() + "xx" + Long.toBinaryString(this.f2084a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.b$b */
    /* loaded from: classes.dex */
    public interface AbstractC0025b {
    }

    public b(AbstractC0025b abstractC0025b) {
        this.f2081a = abstractC0025b;
    }

    public final void a(View view, int i10, boolean z10) {
        int b10 = i10 < 0 ? ((v) this.f2081a).b() : f(i10);
        this.f2082b.e(b10, z10);
        if (z10) {
            i(view);
        }
        v vVar = (v) this.f2081a;
        vVar.f2216a.addView(view, b10);
        Objects.requireNonNull(vVar.f2216a);
        RecyclerView.K(view);
    }

    public final void b(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int b10 = i10 < 0 ? ((v) this.f2081a).b() : f(i10);
        this.f2082b.e(b10, z10);
        if (z10) {
            i(view);
        }
        v vVar = (v) this.f2081a;
        Objects.requireNonNull(vVar);
        RecyclerView.a0 K = RecyclerView.K(view);
        if (K != null) {
            if (!K.o() && !K.u()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called attach on a child which is not detached: ");
                sb.append(K);
                throw new IllegalArgumentException(androidx.activity.result.a.b(vVar.f2216a, sb));
            }
            K.f1933j &= -257;
        }
        vVar.f2216a.attachViewToParent(view, b10, layoutParams);
    }

    public final void c(int i10) {
        RecyclerView.a0 K;
        int f10 = f(i10);
        this.f2082b.f(f10);
        v vVar = (v) this.f2081a;
        View a10 = vVar.a(f10);
        if (a10 != null && (K = RecyclerView.K(a10)) != null) {
            if (K.o() && !K.u()) {
                StringBuilder sb = new StringBuilder();
                sb.append("called detach on an already detached child ");
                sb.append(K);
                throw new IllegalArgumentException(androidx.activity.result.a.b(vVar.f2216a, sb));
            }
            K.b(256);
        }
        vVar.f2216a.detachViewFromParent(f10);
    }

    public final View d(int i10) {
        return ((v) this.f2081a).a(f(i10));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    public final int e() {
        return ((v) this.f2081a).b() - this.f2083c.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r4.f2082b.d(r2) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(int r5) {
        /*
            r4 = this;
            r0 = -1
            if (r5 >= 0) goto L4
            return r0
        L4:
            androidx.recyclerview.widget.b$b r1 = r4.f2081a
            androidx.recyclerview.widget.v r1 = (androidx.recyclerview.widget.v) r1
            int r1 = r1.b()
            r2 = r5
        Ld:
            if (r2 >= r1) goto L29
            androidx.recyclerview.widget.b$a r3 = r4.f2082b
            int r3 = r3.b(r2)
            int r3 = r2 - r3
            int r3 = r5 - r3
            if (r3 != 0) goto L27
        L1b:
            androidx.recyclerview.widget.b$a r5 = r4.f2082b
            boolean r5 = r5.d(r2)
            if (r5 == 0) goto L26
            int r2 = r2 + 1
            goto L1b
        L26:
            return r2
        L27:
            int r2 = r2 + r3
            goto Ld
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.b.f(int):int");
    }

    public final View g(int i10) {
        return ((v) this.f2081a).a(i10);
    }

    public final int h() {
        return ((v) this.f2081a).b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    public final void i(View view) {
        this.f2083c.add(view);
        v vVar = (v) this.f2081a;
        Objects.requireNonNull(vVar);
        RecyclerView.a0 K = RecyclerView.K(view);
        if (K != null) {
            RecyclerView recyclerView = vVar.f2216a;
            int i10 = K.f1939q;
            if (i10 == -1) {
                View view2 = K.f1924a;
                WeakHashMap<View, f0> weakHashMap = z.f5921a;
                i10 = z.d.c(view2);
            }
            K.p = i10;
            recyclerView.g0(K, 4);
        }
    }

    public final int j(View view) {
        int c10 = ((v) this.f2081a).c(view);
        if (c10 != -1 && !this.f2082b.d(c10)) {
            return c10 - this.f2082b.b(c10);
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    public final boolean k(View view) {
        return this.f2083c.contains(view);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    public final boolean l(View view) {
        if (this.f2083c.remove(view)) {
            v vVar = (v) this.f2081a;
            Objects.requireNonNull(vVar);
            RecyclerView.a0 K = RecyclerView.K(view);
            if (K == null) {
                return true;
            }
            vVar.f2216a.g0(K, K.p);
            K.p = 0;
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    public final String toString() {
        return this.f2082b.toString() + ", hidden list:" + this.f2083c.size();
    }
}
