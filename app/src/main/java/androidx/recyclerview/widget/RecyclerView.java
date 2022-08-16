package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.b0;
import androidx.recyclerview.widget.c0;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.x;
import com.raouf.routerchef.R;
import i0.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import m0.f0;
import m0.z;
import n0.f;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements m0.l {
    public static final Class<?>[] P0;
    public final Rect A;
    public boolean A0;
    public final Rect B;
    public boolean B0;
    public final RectF C;
    public k C0;
    public e D;
    public boolean D0;
    public m E;
    public androidx.recyclerview.widget.x E0;
    public t F;
    public h F0;
    public final ArrayList<l> G;
    public final int[] G0;
    public final ArrayList<p> H;
    public m0.m H0;
    public p I;
    public final int[] I0;
    public boolean J;
    public final int[] J0;
    public boolean K;
    public final int[] K0;
    public boolean L;
    public final List<a0> L0;
    public int M;
    public b M0;
    public boolean N;
    public final d N0;
    public boolean O;
    public boolean P;
    public int Q;
    public boolean R;
    public final AccessibilityManager S;
    public boolean T;
    public boolean U;
    public int V;
    public int W;

    /* renamed from: a0 */
    public i f1890a0;

    /* renamed from: b0 */
    public EdgeEffect f1891b0;

    /* renamed from: c0 */
    public EdgeEffect f1892c0;

    /* renamed from: d0 */
    public EdgeEffect f1893d0;

    /* renamed from: e0 */
    public EdgeEffect f1894e0;

    /* renamed from: f0 */
    public j f1895f0;

    /* renamed from: g0 */
    public int f1896g0;

    /* renamed from: h0 */
    public int f1897h0;

    /* renamed from: i0 */
    public VelocityTracker f1898i0;

    /* renamed from: j0 */
    public int f1899j0;

    /* renamed from: k0 */
    public int f1900k0;

    /* renamed from: l0 */
    public int f1901l0;

    /* renamed from: m0 */
    public int f1902m0;

    /* renamed from: n0 */
    public int f1903n0;

    /* renamed from: o0 */
    public o f1904o0;

    /* renamed from: p0 */
    public final int f1905p0;

    /* renamed from: q0 */
    public final int f1906q0;

    /* renamed from: r0 */
    public float f1907r0;

    /* renamed from: s */
    public final u f1908s;

    /* renamed from: s0 */
    public float f1909s0;

    /* renamed from: t */
    public final s f1910t;

    /* renamed from: t0 */
    public boolean f1911t0;

    /* renamed from: u */
    public v f1912u;

    /* renamed from: u0 */
    public final z f1913u0;

    /* renamed from: v */
    public androidx.recyclerview.widget.a f1914v;

    /* renamed from: v0 */
    public androidx.recyclerview.widget.m f1915v0;

    /* renamed from: w */
    public androidx.recyclerview.widget.b f1916w;

    /* renamed from: w0 */
    public m.b f1917w0;

    /* renamed from: x */
    public final c0 f1918x;
    public final x x0;
    public boolean y;

    /* renamed from: y0 */
    public q f1919y0;

    /* renamed from: z */
    public final a f1920z;

    /* renamed from: z0 */
    public List<q> f1921z0;
    public static final int[] O0 = {16843830};
    public static final c Q0 = new c();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            RecyclerView.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.L || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.J) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.O) {
                recyclerView2.N = true;
            } else {
                recyclerView2.n();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a0 {

        /* renamed from: s */
        public static final List<Object> f1923s = Collections.emptyList();

        /* renamed from: a */
        public final View f1924a;

        /* renamed from: b */
        public WeakReference<RecyclerView> f1925b;

        /* renamed from: j */
        public int f1933j;

        /* renamed from: r */
        public RecyclerView f1940r;

        /* renamed from: c */
        public int f1926c = -1;

        /* renamed from: d */
        public int f1927d = -1;

        /* renamed from: e */
        public long f1928e = -1;

        /* renamed from: f */
        public int f1929f = -1;

        /* renamed from: g */
        public int f1930g = -1;

        /* renamed from: h */
        public a0 f1931h = null;

        /* renamed from: i */
        public a0 f1932i = null;

        /* renamed from: k */
        public List<Object> f1934k = null;

        /* renamed from: l */
        public List<Object> f1935l = null;

        /* renamed from: m */
        public int f1936m = 0;

        /* renamed from: n */
        public s f1937n = null;

        /* renamed from: o */
        public boolean f1938o = false;
        public int p = 0;

        /* renamed from: q */
        public int f1939q = -1;

        public a0(View view) {
            if (view != null) {
                this.f1924a = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List<java.lang.Object>, java.util.ArrayList] */
        public final void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.f1933j) != 0) {
            } else {
                if (this.f1934k == null) {
                    ArrayList arrayList = new ArrayList();
                    this.f1934k = arrayList;
                    this.f1935l = Collections.unmodifiableList(arrayList);
                }
                this.f1934k.add(obj);
            }
        }

        public final void b(int i10) {
            this.f1933j = i10 | this.f1933j;
        }

        public final void c() {
            this.f1927d = -1;
            this.f1930g = -1;
        }

        public final void d() {
            this.f1933j &= -33;
        }

        public final int e() {
            RecyclerView recyclerView = this.f1940r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.H(this);
        }

        public final int f() {
            int i10 = this.f1930g;
            return i10 == -1 ? this.f1926c : i10;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List<java.lang.Object>, java.util.ArrayList] */
        public final List<Object> g() {
            if ((this.f1933j & 1024) == 0) {
                ?? r02 = this.f1934k;
                return (r02 == 0 || r02.size() == 0) ? f1923s : this.f1935l;
            }
            return f1923s;
        }

        public final boolean h(int i10) {
            return (i10 & this.f1933j) != 0;
        }

        public final boolean i() {
            return (this.f1924a.getParent() == null || this.f1924a.getParent() == this.f1940r) ? false : true;
        }

        public final boolean j() {
            return (this.f1933j & 1) != 0;
        }

        public final boolean k() {
            return (this.f1933j & 4) != 0;
        }

        public final boolean l() {
            if ((this.f1933j & 16) == 0) {
                View view = this.f1924a;
                WeakHashMap<View, f0> weakHashMap = m0.z.f5921a;
                if (!z.d.i(view)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean m() {
            return (this.f1933j & 8) != 0;
        }

        public final boolean n() {
            return this.f1937n != null;
        }

        public final boolean o() {
            return (this.f1933j & 256) != 0;
        }

        public final boolean p() {
            return (this.f1933j & 2) != 0;
        }

        public final void q(int i10, boolean z10) {
            if (this.f1927d == -1) {
                this.f1927d = this.f1926c;
            }
            if (this.f1930g == -1) {
                this.f1930g = this.f1926c;
            }
            if (z10) {
                this.f1930g += i10;
            }
            this.f1926c += i10;
            if (this.f1924a.getLayoutParams() != null) {
                ((n) this.f1924a.getLayoutParams()).f1978c = true;
            }
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List<java.lang.Object>, java.util.ArrayList] */
        public final void r() {
            this.f1933j = 0;
            this.f1926c = -1;
            this.f1927d = -1;
            this.f1928e = -1L;
            this.f1930g = -1;
            this.f1936m = 0;
            this.f1931h = null;
            this.f1932i = null;
            ?? r22 = this.f1934k;
            if (r22 != 0) {
                r22.clear();
            }
            this.f1933j &= -1025;
            this.p = 0;
            this.f1939q = -1;
            RecyclerView.k(this);
        }

        public final void s(int i10, int i11) {
            this.f1933j = (i10 & i11) | (this.f1933j & (~i11));
        }

        public final void t(boolean z10) {
            int i10;
            int i11 = this.f1936m;
            int i12 = z10 ? i11 - 1 : i11 + 1;
            this.f1936m = i12;
            if (i12 < 0) {
                this.f1936m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z10 && i12 == 1) {
                i10 = this.f1933j | 16;
            } else if (!z10 || i12 != 0) {
                return;
            } else {
                i10 = this.f1933j & (-17);
            }
            this.f1933j = i10;
        }

        public final String toString() {
            StringBuilder c10 = androidx.fragment.app.a.c(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
            c10.append(Integer.toHexString(hashCode()));
            c10.append(" position=");
            c10.append(this.f1926c);
            c10.append(" id=");
            c10.append(this.f1928e);
            c10.append(", oldPos=");
            c10.append(this.f1927d);
            c10.append(", pLpos:");
            c10.append(this.f1930g);
            StringBuilder sb = new StringBuilder(c10.toString());
            if (n()) {
                sb.append(" scrap ");
                sb.append(this.f1938o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (k()) {
                sb.append(" invalid");
            }
            if (!j()) {
                sb.append(" unbound");
            }
            boolean z10 = true;
            if ((this.f1933j & 2) != 0) {
                sb.append(" update");
            }
            if (m()) {
                sb.append(" removed");
            }
            if (u()) {
                sb.append(" ignored");
            }
            if (o()) {
                sb.append(" tmpDetached");
            }
            if (!l()) {
                StringBuilder c11 = androidx.activity.result.a.c(" not recyclable(");
                c11.append(this.f1936m);
                c11.append(")");
                sb.append(c11.toString());
            }
            if ((this.f1933j & 512) == 0 && !k()) {
                z10 = false;
            }
            if (z10) {
                sb.append(" undefined adapter position");
            }
            if (this.f1924a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public final boolean u() {
            return (this.f1933j & 128) != 0;
        }

        public final void v() {
            this.f1937n.k(this);
        }

        public final boolean w() {
            return (this.f1933j & 32) != 0;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
            RecyclerView.this = r1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            j jVar = RecyclerView.this.f1895f0;
            if (jVar != null) {
                androidx.recyclerview.widget.k kVar = (androidx.recyclerview.widget.k) jVar;
                boolean z10 = !kVar.f2128h.isEmpty();
                boolean z11 = !kVar.f2130j.isEmpty();
                boolean z12 = !kVar.f2131k.isEmpty();
                boolean z13 = !kVar.f2129i.isEmpty();
                if (z10 || z11 || z13 || z12) {
                    Iterator<a0> it = kVar.f2128h.iterator();
                    while (it.hasNext()) {
                        a0 next = it.next();
                        View view = next.f1924a;
                        ViewPropertyAnimator animate = view.animate();
                        kVar.f2136q.add(next);
                        animate.setDuration(kVar.f1948d).alpha(0.0f).setListener(new androidx.recyclerview.widget.f(kVar, next, animate, view)).start();
                    }
                    kVar.f2128h.clear();
                    if (z11) {
                        ArrayList<k.b> arrayList = new ArrayList<>();
                        arrayList.addAll(kVar.f2130j);
                        kVar.f2133m.add(arrayList);
                        kVar.f2130j.clear();
                        androidx.recyclerview.widget.c cVar = new androidx.recyclerview.widget.c(kVar, arrayList);
                        if (z10) {
                            View view2 = arrayList.get(0).f2144a.f1924a;
                            long j3 = kVar.f1948d;
                            WeakHashMap<View, f0> weakHashMap = m0.z.f5921a;
                            z.d.n(view2, cVar, j3);
                        } else {
                            cVar.run();
                        }
                    }
                    if (z12) {
                        ArrayList<k.a> arrayList2 = new ArrayList<>();
                        arrayList2.addAll(kVar.f2131k);
                        kVar.f2134n.add(arrayList2);
                        kVar.f2131k.clear();
                        androidx.recyclerview.widget.d dVar = new androidx.recyclerview.widget.d(kVar, arrayList2);
                        if (z10) {
                            View view3 = arrayList2.get(0).f2138a.f1924a;
                            long j10 = kVar.f1948d;
                            WeakHashMap<View, f0> weakHashMap2 = m0.z.f5921a;
                            z.d.n(view3, dVar, j10);
                        } else {
                            dVar.run();
                        }
                    }
                    if (z13) {
                        ArrayList<a0> arrayList3 = new ArrayList<>();
                        arrayList3.addAll(kVar.f2129i);
                        kVar.f2132l.add(arrayList3);
                        kVar.f2129i.clear();
                        androidx.recyclerview.widget.e eVar = new androidx.recyclerview.widget.e(kVar, arrayList3);
                        if (z10 || z11 || z12) {
                            long j11 = 0;
                            long j12 = z10 ? kVar.f1948d : 0L;
                            long j13 = z11 ? kVar.f1949e : 0L;
                            if (z12) {
                                j11 = kVar.f1950f;
                            }
                            View view4 = arrayList3.get(0).f1924a;
                            WeakHashMap<View, f0> weakHashMap3 = m0.z.f5921a;
                            z.d.n(view4, eVar, Math.max(j13, j11) + j12);
                        } else {
                            eVar.run();
                        }
                    }
                }
            }
            RecyclerView.this.D0 = false;
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public class d {
        public d() {
            RecyclerView.this = r1;
        }

        public final void a(a0 a0Var, j.c cVar, j.c cVar2) {
            boolean z10;
            int i10;
            int i11;
            RecyclerView recyclerView = RecyclerView.this;
            Objects.requireNonNull(recyclerView);
            a0Var.t(false);
            androidx.recyclerview.widget.z zVar = (androidx.recyclerview.widget.z) recyclerView.f1895f0;
            Objects.requireNonNull(zVar);
            if (cVar == null || ((i10 = cVar.f1951a) == (i11 = cVar2.f1951a) && cVar.f1952b == cVar2.f1952b)) {
                androidx.recyclerview.widget.k kVar = (androidx.recyclerview.widget.k) zVar;
                kVar.m(a0Var);
                a0Var.f1924a.setAlpha(0.0f);
                kVar.f2129i.add(a0Var);
                z10 = true;
            } else {
                z10 = zVar.h(a0Var, i10, cVar.f1952b, i11, cVar2.f1952b);
            }
            if (z10) {
                recyclerView.W();
            }
        }

        public final void b(a0 a0Var, j.c cVar, j.c cVar2) {
            boolean z10;
            RecyclerView.this.f1910t.k(a0Var);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f(a0Var);
            a0Var.t(false);
            androidx.recyclerview.widget.z zVar = (androidx.recyclerview.widget.z) recyclerView.f1895f0;
            Objects.requireNonNull(zVar);
            int i10 = cVar.f1951a;
            int i11 = cVar.f1952b;
            View view = a0Var.f1924a;
            int left = cVar2 == null ? view.getLeft() : cVar2.f1951a;
            int top = cVar2 == null ? view.getTop() : cVar2.f1952b;
            if (a0Var.m() || (i10 == left && i11 == top)) {
                androidx.recyclerview.widget.k kVar = (androidx.recyclerview.widget.k) zVar;
                kVar.m(a0Var);
                kVar.f2128h.add(a0Var);
                z10 = true;
            } else {
                view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                z10 = zVar.h(a0Var, i10, i11, left, top);
            }
            if (z10) {
                recyclerView.W();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class e<VH extends a0> {

        /* renamed from: a */
        public final f f1943a = new f();

        /* renamed from: b */
        public boolean f1944b = false;

        public abstract int a();

        public long b(int i10) {
            return -1L;
        }

        public int c(int i10) {
            return 0;
        }

        public final void d() {
            this.f1943a.b();
        }

        public abstract void e(VH vh, int i10);

        public abstract VH f(ViewGroup viewGroup, int i10);

        public final void g(boolean z10) {
            if (!this.f1943a.a()) {
                this.f1944b = z10;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
    }

    /* loaded from: classes.dex */
    public static class f extends Observable<g> {
        public final boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public final void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public final void c(int i10, int i11, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).b(i10, i11, obj);
            }
        }

        public final void d(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).c(i10, i11);
            }
        }

        public final void e(int i10, int i11) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((g) ((Observable) this).mObservers.get(size)).d(i10, i11);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class g {
        public void a() {
        }

        public void b(int i10, int i11, Object obj) {
        }

        public void c(int i10, int i11) {
        }

        public void d(int i10, int i11) {
        }
    }

    /* loaded from: classes.dex */
    public interface h {
        int a();
    }

    /* loaded from: classes.dex */
    public static class i {
        public final EdgeEffect a(RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* loaded from: classes.dex */
    public static abstract class j {

        /* renamed from: a */
        public b f1945a = null;

        /* renamed from: b */
        public ArrayList<a> f1946b = new ArrayList<>();

        /* renamed from: c */
        public long f1947c = 120;

        /* renamed from: d */
        public long f1948d = 120;

        /* renamed from: e */
        public long f1949e = 250;

        /* renamed from: f */
        public long f1950f = 250;

        /* loaded from: classes.dex */
        public interface a {
            void a();
        }

        /* loaded from: classes.dex */
        public interface b {
        }

        /* loaded from: classes.dex */
        public static class c {

            /* renamed from: a */
            public int f1951a;

            /* renamed from: b */
            public int f1952b;

            public final c a(a0 a0Var) {
                View view = a0Var.f1924a;
                this.f1951a = view.getLeft();
                this.f1952b = view.getTop();
                view.getRight();
                view.getBottom();
                return this;
            }
        }

        public static int b(a0 a0Var) {
            int i10 = a0Var.f1933j & 14;
            if (a0Var.k()) {
                return 4;
            }
            if ((i10 & 4) != 0) {
                return i10;
            }
            int i11 = a0Var.f1927d;
            int e10 = a0Var.e();
            return (i11 == -1 || e10 == -1 || i11 == e10) ? i10 : i10 | 2048;
        }

        public abstract boolean a(a0 a0Var, a0 a0Var2, c cVar, c cVar2);

        public final void c(a0 a0Var) {
            b bVar = this.f1945a;
            if (bVar != null) {
                k kVar = (k) bVar;
                Objects.requireNonNull(kVar);
                boolean z10 = true;
                a0Var.t(true);
                if (a0Var.f1931h != null && a0Var.f1932i == null) {
                    a0Var.f1931h = null;
                }
                a0Var.f1932i = null;
                if ((a0Var.f1933j & 16) != 0) {
                    return;
                }
                RecyclerView recyclerView = RecyclerView.this;
                View view = a0Var.f1924a;
                recyclerView.i0();
                androidx.recyclerview.widget.b bVar2 = recyclerView.f1916w;
                int c10 = ((androidx.recyclerview.widget.v) bVar2.f2081a).c(view);
                if (c10 == -1) {
                    bVar2.l(view);
                } else if (bVar2.f2082b.d(c10)) {
                    bVar2.f2082b.f(c10);
                    bVar2.l(view);
                    ((androidx.recyclerview.widget.v) bVar2.f2081a).d(c10);
                } else {
                    z10 = false;
                }
                if (z10) {
                    a0 K = RecyclerView.K(view);
                    recyclerView.f1910t.k(K);
                    recyclerView.f1910t.h(K);
                }
                recyclerView.k0(!z10);
                if (z10 || !a0Var.o()) {
                    return;
                }
                RecyclerView.this.removeDetachedView(a0Var.f1924a, false);
            }
        }

        public final void d() {
            int size = this.f1946b.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f1946b.get(i10).a();
            }
            this.f1946b.clear();
        }

        public abstract void e(a0 a0Var);

        public abstract void f();

        public abstract boolean g();
    }

    /* loaded from: classes.dex */
    public class k implements j.b {
        public k() {
            RecyclerView.this = r1;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class l {
        public void d(Rect rect, View view, RecyclerView recyclerView) {
            ((n) view.getLayoutParams()).a();
            rect.set(0, 0, 0, 0);
        }

        public void e(Canvas canvas, RecyclerView recyclerView) {
        }

        public void f(Canvas canvas, RecyclerView recyclerView) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class m {

        /* renamed from: a */
        public androidx.recyclerview.widget.b f1954a;

        /* renamed from: b */
        public RecyclerView f1955b;

        /* renamed from: c */
        public final a f1956c;

        /* renamed from: d */
        public final b f1957d;

        /* renamed from: e */
        public b0 f1958e;

        /* renamed from: f */
        public b0 f1959f;

        /* renamed from: g */
        public w f1960g;

        /* renamed from: h */
        public boolean f1961h = false;

        /* renamed from: i */
        public boolean f1962i = false;

        /* renamed from: j */
        public boolean f1963j = true;

        /* renamed from: k */
        public boolean f1964k = true;

        /* renamed from: l */
        public int f1965l;

        /* renamed from: m */
        public boolean f1966m;

        /* renamed from: n */
        public int f1967n;

        /* renamed from: o */
        public int f1968o;
        public int p;

        /* renamed from: q */
        public int f1969q;

        /* loaded from: classes.dex */
        public class a implements b0.b {
            public a() {
                m.this = r1;
            }

            @Override // androidx.recyclerview.widget.b0.b
            public final int a() {
                m mVar = m.this;
                return mVar.p - mVar.L();
            }

            @Override // androidx.recyclerview.widget.b0.b
            public final int b(View view) {
                return m.this.C(view) - ((ViewGroup.MarginLayoutParams) ((n) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.b0.b
            public final View c(int i10) {
                return m.this.w(i10);
            }

            @Override // androidx.recyclerview.widget.b0.b
            public final int d() {
                return m.this.K();
            }

            @Override // androidx.recyclerview.widget.b0.b
            public final int e(View view) {
                return m.this.D(view) + ((ViewGroup.MarginLayoutParams) ((n) view.getLayoutParams())).rightMargin;
            }
        }

        /* loaded from: classes.dex */
        public class b implements b0.b {
            public b() {
                m.this = r1;
            }

            @Override // androidx.recyclerview.widget.b0.b
            public final int a() {
                m mVar = m.this;
                return mVar.f1969q - mVar.J();
            }

            @Override // androidx.recyclerview.widget.b0.b
            public final int b(View view) {
                return m.this.E(view) - ((ViewGroup.MarginLayoutParams) ((n) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.b0.b
            public final View c(int i10) {
                return m.this.w(i10);
            }

            @Override // androidx.recyclerview.widget.b0.b
            public final int d() {
                return m.this.M();
            }

            @Override // androidx.recyclerview.widget.b0.b
            public final int e(View view) {
                return m.this.A(view) + ((ViewGroup.MarginLayoutParams) ((n) view.getLayoutParams())).bottomMargin;
            }
        }

        /* loaded from: classes.dex */
        public interface c {
        }

        /* loaded from: classes.dex */
        public static class d {

            /* renamed from: a */
            public int f1972a;

            /* renamed from: b */
            public int f1973b;

            /* renamed from: c */
            public boolean f1974c;

            /* renamed from: d */
            public boolean f1975d;
        }

        public m() {
            a aVar = new a();
            this.f1956c = aVar;
            b bVar = new b();
            this.f1957d = bVar;
            this.f1958e = new b0(aVar);
            this.f1959f = new b0(bVar);
        }

        public static d O(Context context, AttributeSet attributeSet, int i10, int i11) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.lifecycle.f0.f1677t, i10, i11);
            dVar.f1972a = obtainStyledAttributes.getInt(0, 1);
            dVar.f1973b = obtainStyledAttributes.getInt(10, 1);
            dVar.f1974c = obtainStyledAttributes.getBoolean(9, false);
            dVar.f1975d = obtainStyledAttributes.getBoolean(11, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public static boolean S(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (i12 <= 0 || i10 == i12) {
                if (mode == Integer.MIN_VALUE) {
                    return size >= i10;
                } else if (mode == 0) {
                    return true;
                } else {
                    return mode == 1073741824 && size == i10;
                }
            }
            return false;
        }

        public static int h(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i11, i12) : size : Math.min(size, Math.max(i11, i12));
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
            if (r5 == 1073741824) goto L12;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int y(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1a
                if (r7 < 0) goto L11
                goto L1c
            L11:
                if (r7 != r1) goto L2f
                if (r5 == r2) goto L20
                if (r5 == 0) goto L2f
                if (r5 == r3) goto L20
                goto L2f
            L1a:
                if (r7 < 0) goto L1e
            L1c:
                r5 = r3
                goto L31
            L1e:
                if (r7 != r1) goto L22
            L20:
                r7 = r4
                goto L31
            L22:
                if (r7 != r0) goto L2f
                if (r5 == r2) goto L2c
                if (r5 != r3) goto L29
                goto L2c
            L29:
                r7 = r4
                r5 = r6
                goto L31
            L2c:
                r7 = r4
                r5 = r2
                goto L31
            L2f:
                r5 = r6
                r7 = r5
            L31:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m.y(int, int, int, int, boolean):int");
        }

        public final int A(View view) {
            return view.getBottom() + ((n) view.getLayoutParams()).f1977b.bottom;
        }

        public final void A0(int i10, int i11) {
            int x10 = x();
            if (x10 == 0) {
                this.f1955b.o(i10, i11);
                return;
            }
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MAX_VALUE;
            int i14 = Integer.MAX_VALUE;
            int i15 = Integer.MIN_VALUE;
            for (int i16 = 0; i16 < x10; i16++) {
                View w10 = w(i16);
                Rect rect = this.f1955b.A;
                B(w10, rect);
                int i17 = rect.left;
                if (i17 < i13) {
                    i13 = i17;
                }
                int i18 = rect.right;
                if (i18 > i12) {
                    i12 = i18;
                }
                int i19 = rect.top;
                if (i19 < i14) {
                    i14 = i19;
                }
                int i20 = rect.bottom;
                if (i20 > i15) {
                    i15 = i20;
                }
            }
            this.f1955b.A.set(i13, i14, i12, i15);
            z0(this.f1955b.A, i10, i11);
        }

        public final void B(View view, Rect rect) {
            int[] iArr = RecyclerView.O0;
            n nVar = (n) view.getLayoutParams();
            Rect rect2 = nVar.f1977b;
            rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) nVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) nVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) nVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin);
        }

        public final void B0(RecyclerView recyclerView) {
            int i10;
            if (recyclerView == null) {
                this.f1955b = null;
                this.f1954a = null;
                i10 = 0;
                this.p = 0;
            } else {
                this.f1955b = recyclerView;
                this.f1954a = recyclerView.f1916w;
                this.p = recyclerView.getWidth();
                i10 = recyclerView.getHeight();
            }
            this.f1969q = i10;
            this.f1967n = 1073741824;
            this.f1968o = 1073741824;
        }

        public final int C(View view) {
            return view.getLeft() - ((n) view.getLayoutParams()).f1977b.left;
        }

        public final boolean C0(View view, int i10, int i11, n nVar) {
            return view.isLayoutRequested() || !this.f1963j || !S(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) nVar).width) || !S(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) nVar).height);
        }

        public final int D(View view) {
            return view.getRight() + ((n) view.getLayoutParams()).f1977b.right;
        }

        public boolean D0() {
            return false;
        }

        public final int E(View view) {
            return view.getTop() - ((n) view.getLayoutParams()).f1977b.top;
        }

        public final boolean E0(View view, int i10, int i11, n nVar) {
            return !this.f1963j || !S(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) nVar).width) || !S(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) nVar).height);
        }

        public final View F() {
            View focusedChild;
            RecyclerView recyclerView = this.f1955b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f1954a.k(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void F0(RecyclerView recyclerView, int i10) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public final int G() {
            RecyclerView recyclerView = this.f1955b;
            WeakHashMap<View, f0> weakHashMap = m0.z.f5921a;
            return z.e.d(recyclerView);
        }

        public final void G0(w wVar) {
            w wVar2 = this.f1960g;
            if (wVar2 != null && wVar != wVar2 && wVar2.f2000e) {
                wVar2.d();
            }
            this.f1960g = wVar;
            RecyclerView recyclerView = this.f1955b;
            recyclerView.f1913u0.c();
            if (wVar.f2003h) {
                StringBuilder c10 = androidx.activity.result.a.c("An instance of ");
                c10.append(wVar.getClass().getSimpleName());
                c10.append(" was started more than once. Each instance of");
                c10.append(wVar.getClass().getSimpleName());
                c10.append(" is intended to only be used once. You should create a new instance for each use.");
                Log.w("RecyclerView", c10.toString());
            }
            wVar.f1997b = recyclerView;
            wVar.f1998c = this;
            int i10 = wVar.f1996a;
            if (i10 != -1) {
                recyclerView.x0.f2011a = i10;
                wVar.f2000e = true;
                wVar.f1999d = true;
                wVar.f2001f = recyclerView.E.s(i10);
                wVar.f1997b.f1913u0.a();
                wVar.f2003h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        public final int H() {
            RecyclerView recyclerView = this.f1955b;
            WeakHashMap<View, f0> weakHashMap = m0.z.f5921a;
            return z.d.d(recyclerView);
        }

        public boolean H0() {
            return false;
        }

        public final int I() {
            RecyclerView recyclerView = this.f1955b;
            WeakHashMap<View, f0> weakHashMap = m0.z.f5921a;
            return z.d.e(recyclerView);
        }

        public final int J() {
            RecyclerView recyclerView = this.f1955b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public final int K() {
            RecyclerView recyclerView = this.f1955b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public final int L() {
            RecyclerView recyclerView = this.f1955b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public final int M() {
            RecyclerView recyclerView = this.f1955b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public final int N(View view) {
            return ((n) view.getLayoutParams()).a();
        }

        public int P(s sVar, x xVar) {
            RecyclerView recyclerView = this.f1955b;
            if (recyclerView == null || recyclerView.D == null || !f()) {
                return 1;
            }
            return this.f1955b.D.a();
        }

        public final void Q(View view, Rect rect) {
            Matrix matrix;
            Rect rect2 = ((n) view.getLayoutParams()).f1977b;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            if (this.f1955b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f1955b.C;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public boolean R() {
            return false;
        }

        public final void T(View view, int i10, int i11, int i12, int i13) {
            n nVar = (n) view.getLayoutParams();
            Rect rect = nVar.f1977b;
            view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) nVar).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) nVar).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) nVar).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) nVar).bottomMargin);
        }

        public void U(int i10) {
            RecyclerView recyclerView = this.f1955b;
            if (recyclerView != null) {
                int e10 = recyclerView.f1916w.e();
                for (int i11 = 0; i11 < e10; i11++) {
                    recyclerView.f1916w.d(i11).offsetLeftAndRight(i10);
                }
            }
        }

        public void V(int i10) {
            RecyclerView recyclerView = this.f1955b;
            if (recyclerView != null) {
                int e10 = recyclerView.f1916w.e();
                for (int i11 = 0; i11 < e10; i11++) {
                    recyclerView.f1916w.d(i11).offsetTopAndBottom(i10);
                }
            }
        }

        public void W(RecyclerView recyclerView) {
        }

        public View X(View view, int i10, s sVar, x xVar) {
            return null;
        }

        public void Y(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f1955b;
            s sVar = recyclerView.f1910t;
            x xVar = recyclerView.x0;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z10 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f1955b.canScrollVertically(-1) && !this.f1955b.canScrollHorizontally(-1) && !this.f1955b.canScrollHorizontally(1)) {
                z10 = false;
            }
            accessibilityEvent.setScrollable(z10);
            e eVar = this.f1955b.D;
            if (eVar == null) {
                return;
            }
            accessibilityEvent.setItemCount(eVar.a());
        }

        public final void Z(View view, n0.f fVar) {
            a0 K = RecyclerView.K(view);
            if (K == null || K.m() || this.f1954a.k(K.f1924a)) {
                return;
            }
            RecyclerView recyclerView = this.f1955b;
            a0(recyclerView.f1910t, recyclerView.x0, view, fVar);
        }

        public void a0(s sVar, x xVar, View view, n0.f fVar) {
            fVar.p(f.c.a(f() ? N(view) : 0, 1, e() ? N(view) : 0, 1, false));
        }

        public final void b(View view) {
            c(view, -1, false);
        }

        public void b0(int i10, int i11) {
        }

        public final void c(View view, int i10, boolean z10) {
            a0 K = RecyclerView.K(view);
            if (z10 || K.m()) {
                this.f1955b.f1918x.a(K);
            } else {
                this.f1955b.f1918x.e(K);
            }
            n nVar = (n) view.getLayoutParams();
            if (K.w() || K.n()) {
                if (K.n()) {
                    K.v();
                } else {
                    K.d();
                }
                this.f1954a.b(view, i10, view.getLayoutParams(), false);
            } else {
                int i11 = -1;
                if (view.getParent() == this.f1955b) {
                    int j3 = this.f1954a.j(view);
                    if (i10 == -1) {
                        i10 = this.f1954a.e();
                    }
                    if (j3 == -1) {
                        StringBuilder c10 = androidx.activity.result.a.c("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                        c10.append(this.f1955b.indexOfChild(view));
                        throw new IllegalStateException(androidx.activity.result.a.b(this.f1955b, c10));
                    } else if (j3 != i10) {
                        m mVar = this.f1955b.E;
                        View w10 = mVar.w(j3);
                        if (w10 != null) {
                            mVar.w(j3);
                            mVar.f1954a.c(j3);
                            n nVar2 = (n) w10.getLayoutParams();
                            a0 K2 = RecyclerView.K(w10);
                            if (K2.m()) {
                                mVar.f1955b.f1918x.a(K2);
                            } else {
                                mVar.f1955b.f1918x.e(K2);
                            }
                            mVar.f1954a.b(w10, i10, nVar2, K2.m());
                        } else {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + j3 + mVar.f1955b.toString());
                        }
                    }
                } else {
                    this.f1954a.a(view, i10, false);
                    nVar.f1978c = true;
                    w wVar = this.f1960g;
                    if (wVar != null && wVar.f2000e) {
                        Objects.requireNonNull(wVar.f1997b);
                        a0 K3 = RecyclerView.K(view);
                        if (K3 != null) {
                            i11 = K3.f();
                        }
                        if (i11 == wVar.f1996a) {
                            wVar.f2001f = view;
                        }
                    }
                }
            }
            if (nVar.f1979d) {
                K.f1924a.invalidate();
                nVar.f1979d = false;
            }
        }

        public void c0() {
        }

        public void d(String str) {
            RecyclerView recyclerView = this.f1955b;
            if (recyclerView != null) {
                recyclerView.i(str);
            }
        }

        public void d0(int i10, int i11) {
        }

        public boolean e() {
            return false;
        }

        public void e0(int i10, int i11) {
        }

        public boolean f() {
            return false;
        }

        public void f0(int i10, int i11) {
        }

        public boolean g(n nVar) {
            return nVar != null;
        }

        public void g0(s sVar, x xVar) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public void h0() {
        }

        public void i(int i10, int i11, x xVar, c cVar) {
        }

        public final void i0(int i10, int i11) {
            this.f1955b.o(i10, i11);
        }

        public void j(int i10, c cVar) {
        }

        public void j0(Parcelable parcelable) {
        }

        public int k(x xVar) {
            return 0;
        }

        public Parcelable k0() {
            return null;
        }

        public int l(x xVar) {
            return 0;
        }

        public void l0(int i10) {
        }

        public int m(x xVar) {
            return 0;
        }

        public final void m0(s sVar) {
            int x10 = x();
            while (true) {
                x10--;
                if (x10 >= 0) {
                    if (!RecyclerView.K(w(x10)).u()) {
                        p0(x10, sVar);
                    }
                } else {
                    return;
                }
            }
        }

        public int n(x xVar) {
            return 0;
        }

        public final void n0(s sVar) {
            int size = sVar.f1986a.size();
            for (int i10 = size - 1; i10 >= 0; i10--) {
                View view = sVar.f1986a.get(i10).f1924a;
                a0 K = RecyclerView.K(view);
                if (!K.u()) {
                    K.t(false);
                    if (K.o()) {
                        this.f1955b.removeDetachedView(view, false);
                    }
                    j jVar = this.f1955b.f1895f0;
                    if (jVar != null) {
                        jVar.e(K);
                    }
                    K.t(true);
                    a0 K2 = RecyclerView.K(view);
                    K2.f1937n = null;
                    K2.f1938o = false;
                    K2.d();
                    sVar.h(K2);
                }
            }
            sVar.f1986a.clear();
            ArrayList<a0> arrayList = sVar.f1987b;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (size > 0) {
                this.f1955b.invalidate();
            }
        }

        public int o(x xVar) {
            return 0;
        }

        public final void o0(View view, s sVar) {
            androidx.recyclerview.widget.b bVar = this.f1954a;
            int c10 = ((androidx.recyclerview.widget.v) bVar.f2081a).c(view);
            if (c10 >= 0) {
                if (bVar.f2082b.f(c10)) {
                    bVar.l(view);
                }
                ((androidx.recyclerview.widget.v) bVar.f2081a).d(c10);
            }
            sVar.g(view);
        }

        public int p(x xVar) {
            return 0;
        }

        public final void p0(int i10, s sVar) {
            View w10 = w(i10);
            q0(i10);
            sVar.g(w10);
        }

        public final void q(s sVar) {
            int x10 = x();
            while (true) {
                x10--;
                if (x10 >= 0) {
                    View w10 = w(x10);
                    a0 K = RecyclerView.K(w10);
                    if (!K.u()) {
                        if (K.k() && !K.m() && !this.f1955b.D.f1944b) {
                            q0(x10);
                            sVar.h(K);
                        } else {
                            w(x10);
                            this.f1954a.c(x10);
                            sVar.i(w10);
                            this.f1955b.f1918x.e(K);
                        }
                    }
                } else {
                    return;
                }
            }
        }

        public final void q0(int i10) {
            androidx.recyclerview.widget.b bVar;
            int f10;
            View a10;
            if (w(i10) == null || (a10 = ((androidx.recyclerview.widget.v) bVar.f2081a).a((f10 = (bVar = this.f1954a).f(i10)))) == null) {
                return;
            }
            if (bVar.f2082b.f(f10)) {
                bVar.l(a10);
            }
            ((androidx.recyclerview.widget.v) bVar.f2081a).d(f10);
        }

        public final View r(View view) {
            View C;
            RecyclerView recyclerView = this.f1955b;
            if (recyclerView == null || (C = recyclerView.C(view)) == null || this.f1954a.k(C)) {
                return null;
            }
            return C;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x00b4, code lost:
            if (r14 == false) goto L28;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean r0(androidx.recyclerview.widget.RecyclerView r10, android.view.View r11, android.graphics.Rect r12, boolean r13, boolean r14) {
            /*
                r9 = this;
                r0 = 2
                int[] r0 = new int[r0]
                int r1 = r9.K()
                int r2 = r9.M()
                int r3 = r9.p
                int r4 = r9.L()
                int r3 = r3 - r4
                int r4 = r9.f1969q
                int r5 = r9.J()
                int r4 = r4 - r5
                int r5 = r11.getLeft()
                int r6 = r12.left
                int r5 = r5 + r6
                int r6 = r11.getScrollX()
                int r5 = r5 - r6
                int r6 = r11.getTop()
                int r7 = r12.top
                int r6 = r6 + r7
                int r11 = r11.getScrollY()
                int r6 = r6 - r11
                int r11 = r12.width()
                int r11 = r11 + r5
                int r12 = r12.height()
                int r12 = r12 + r6
                int r5 = r5 - r1
                r1 = 0
                int r7 = java.lang.Math.min(r1, r5)
                int r6 = r6 - r2
                int r2 = java.lang.Math.min(r1, r6)
                int r11 = r11 - r3
                int r3 = java.lang.Math.max(r1, r11)
                int r12 = r12 - r4
                int r12 = java.lang.Math.max(r1, r12)
                int r4 = r9.G()
                r8 = 1
                if (r4 != r8) goto L5f
                if (r3 == 0) goto L5a
                goto L67
            L5a:
                int r3 = java.lang.Math.max(r7, r11)
                goto L67
            L5f:
                if (r7 == 0) goto L62
                goto L66
            L62:
                int r7 = java.lang.Math.min(r5, r3)
            L66:
                r3 = r7
            L67:
                if (r2 == 0) goto L6a
                goto L6e
            L6a:
                int r2 = java.lang.Math.min(r6, r12)
            L6e:
                r0[r1] = r3
                r0[r8] = r2
                r11 = r0[r1]
                r12 = r0[r8]
                if (r14 == 0) goto Lb6
                android.view.View r14 = r10.getFocusedChild()
                if (r14 != 0) goto L7f
                goto Lb3
            L7f:
                int r0 = r9.K()
                int r2 = r9.M()
                int r3 = r9.p
                int r4 = r9.L()
                int r3 = r3 - r4
                int r4 = r9.f1969q
                int r5 = r9.J()
                int r4 = r4 - r5
                androidx.recyclerview.widget.RecyclerView r5 = r9.f1955b
                android.graphics.Rect r5 = r5.A
                r9.B(r14, r5)
                int r14 = r5.left
                int r14 = r14 - r11
                if (r14 >= r3) goto Lb3
                int r14 = r5.right
                int r14 = r14 - r11
                if (r14 <= r0) goto Lb3
                int r14 = r5.top
                int r14 = r14 - r12
                if (r14 >= r4) goto Lb3
                int r14 = r5.bottom
                int r14 = r14 - r12
                if (r14 > r2) goto Lb1
                goto Lb3
            Lb1:
                r14 = r8
                goto Lb4
            Lb3:
                r14 = r1
            Lb4:
                if (r14 == 0) goto Lbb
            Lb6:
                if (r11 != 0) goto Lbc
                if (r12 == 0) goto Lbb
                goto Lbc
            Lbb:
                return r1
            Lbc:
                if (r13 == 0) goto Lc2
                r10.scrollBy(r11, r12)
                goto Lc5
            Lc2:
                r10.h0(r11, r12, r1)
            Lc5:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m.r0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
        }

        public View s(int i10) {
            int x10 = x();
            for (int i11 = 0; i11 < x10; i11++) {
                View w10 = w(i11);
                a0 K = RecyclerView.K(w10);
                if (K != null && K.f() == i10 && !K.u() && (this.f1955b.x0.f2017g || !K.m())) {
                    return w10;
                }
            }
            return null;
        }

        public final void s0() {
            RecyclerView recyclerView = this.f1955b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public abstract n t();

        public int t0(int i10, s sVar, x xVar) {
            return 0;
        }

        public n u(Context context, AttributeSet attributeSet) {
            return new n(context, attributeSet);
        }

        public void u0(int i10) {
        }

        public n v(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof n ? new n((n) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new n((ViewGroup.MarginLayoutParams) layoutParams) : new n(layoutParams);
        }

        public int v0(int i10, s sVar, x xVar) {
            return 0;
        }

        public final View w(int i10) {
            androidx.recyclerview.widget.b bVar = this.f1954a;
            if (bVar != null) {
                return bVar.d(i10);
            }
            return null;
        }

        public final void w0(RecyclerView recyclerView) {
            x0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final int x() {
            androidx.recyclerview.widget.b bVar = this.f1954a;
            if (bVar != null) {
                return bVar.e();
            }
            return 0;
        }

        public final void x0(int i10, int i11) {
            this.p = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.f1967n = mode;
            if (mode == 0) {
                int[] iArr = RecyclerView.O0;
            }
            this.f1969q = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f1968o = mode2;
            if (mode2 == 0) {
                int[] iArr2 = RecyclerView.O0;
            }
        }

        public final void y0(int i10, int i11) {
            this.f1955b.setMeasuredDimension(i10, i11);
        }

        public int z(s sVar, x xVar) {
            RecyclerView recyclerView = this.f1955b;
            if (recyclerView == null || recyclerView.D == null || !e()) {
                return 1;
            }
            return this.f1955b.D.a();
        }

        public void z0(Rect rect, int i10, int i11) {
            y0(h(i10, L() + K() + rect.width(), I()), h(i11, J() + M() + rect.height(), H()));
        }
    }

    /* loaded from: classes.dex */
    public static class n extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public a0 f1976a;

        /* renamed from: b */
        public final Rect f1977b = new Rect();

        /* renamed from: c */
        public boolean f1978c = true;

        /* renamed from: d */
        public boolean f1979d = false;

        public n(int i10, int i11) {
            super(i10, i11);
        }

        public n(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public n(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public n(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public n(n nVar) {
            super((ViewGroup.LayoutParams) nVar);
        }

        public final int a() {
            return this.f1976a.f();
        }

        public final boolean b() {
            return this.f1976a.p();
        }

        public final boolean c() {
            return this.f1976a.m();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o {
    }

    /* loaded from: classes.dex */
    public interface p {
        void a(MotionEvent motionEvent);

        boolean b(MotionEvent motionEvent);

        void c();
    }

    /* loaded from: classes.dex */
    public static abstract class q {
        public void a(RecyclerView recyclerView, int i10) {
        }

        public void b(RecyclerView recyclerView, int i10, int i11) {
        }
    }

    /* loaded from: classes.dex */
    public static class r {

        /* renamed from: a */
        public SparseArray<a> f1980a = new SparseArray<>();

        /* renamed from: b */
        public int f1981b = 0;

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a */
            public final ArrayList<a0> f1982a = new ArrayList<>();

            /* renamed from: b */
            public int f1983b = 5;

            /* renamed from: c */
            public long f1984c = 0;

            /* renamed from: d */
            public long f1985d = 0;
        }

        public final a a(int i10) {
            a aVar = this.f1980a.get(i10);
            if (aVar == null) {
                a aVar2 = new a();
                this.f1980a.put(i10, aVar2);
                return aVar2;
            }
            return aVar;
        }
    }

    /* loaded from: classes.dex */
    public final class s {

        /* renamed from: a */
        public final ArrayList<a0> f1986a;

        /* renamed from: d */
        public final List<a0> f1989d;

        /* renamed from: g */
        public r f1992g;

        /* renamed from: b */
        public ArrayList<a0> f1987b = null;

        /* renamed from: c */
        public final ArrayList<a0> f1988c = new ArrayList<>();

        /* renamed from: e */
        public int f1990e = 2;

        /* renamed from: f */
        public int f1991f = 2;

        public s() {
            RecyclerView.this = r2;
            ArrayList<a0> arrayList = new ArrayList<>();
            this.f1986a = arrayList;
            this.f1989d = Collections.unmodifiableList(arrayList);
        }

        /* JADX WARN: Type inference failed for: r1v8, types: [java.util.Map<android.view.View, m0.a>, java.util.WeakHashMap] */
        public final void a(a0 a0Var, boolean z10) {
            RecyclerView.k(a0Var);
            View view = a0Var.f1924a;
            androidx.recyclerview.widget.x xVar = RecyclerView.this.E0;
            if (xVar != null) {
                m0.a j3 = xVar.j();
                m0.z.p(view, j3 instanceof x.a ? (m0.a) ((x.a) j3).f2221e.remove(view) : null);
            }
            if (z10) {
                t tVar = RecyclerView.this.F;
                if (tVar != null) {
                    tVar.a();
                }
                RecyclerView recyclerView = RecyclerView.this;
                e eVar = recyclerView.D;
                if (recyclerView.x0 != null) {
                    recyclerView.f1918x.f(a0Var);
                }
            }
            a0Var.f1940r = null;
            r d5 = d();
            Objects.requireNonNull(d5);
            int i10 = a0Var.f1929f;
            ArrayList<a0> arrayList = d5.a(i10).f1982a;
            if (d5.f1980a.get(i10).f1983b <= arrayList.size()) {
                return;
            }
            a0Var.r();
            arrayList.add(a0Var);
        }

        public final void b() {
            this.f1986a.clear();
            e();
        }

        public final int c(int i10) {
            if (i10 >= 0 && i10 < RecyclerView.this.x0.b()) {
                RecyclerView recyclerView = RecyclerView.this;
                return !recyclerView.x0.f2017g ? i10 : recyclerView.f1914v.f(i10, 0);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("invalid position ");
            sb.append(i10);
            sb.append(". State item count is ");
            sb.append(RecyclerView.this.x0.b());
            throw new IndexOutOfBoundsException(androidx.activity.result.a.b(RecyclerView.this, sb));
        }

        public final r d() {
            if (this.f1992g == null) {
                this.f1992g = new r();
            }
            return this.f1992g;
        }

        public final void e() {
            for (int size = this.f1988c.size() - 1; size >= 0; size--) {
                f(size);
            }
            this.f1988c.clear();
            int[] iArr = RecyclerView.O0;
            m.b bVar = RecyclerView.this.f1917w0;
            int[] iArr2 = bVar.f2186c;
            if (iArr2 != null) {
                Arrays.fill(iArr2, -1);
            }
            bVar.f2187d = 0;
        }

        public final void f(int i10) {
            a(this.f1988c.get(i10), true);
            this.f1988c.remove(i10);
        }

        public final void g(View view) {
            a0 K = RecyclerView.K(view);
            if (K.o()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (K.n()) {
                K.v();
            } else if (K.w()) {
                K.d();
            }
            h(K);
            if (RecyclerView.this.f1895f0 == null || K.l()) {
                return;
            }
            RecyclerView.this.f1895f0.e(K);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0092  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void h(androidx.recyclerview.widget.RecyclerView.a0 r7) {
            /*
                Method dump skipped, instructions count: 249
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.s.h(androidx.recyclerview.widget.RecyclerView$a0):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void i(android.view.View r5) {
            /*
                r4 = this;
                androidx.recyclerview.widget.RecyclerView$a0 r5 = androidx.recyclerview.widget.RecyclerView.K(r5)
                r0 = 12
                boolean r0 = r5.h(r0)
                r1 = 0
                if (r0 != 0) goto L55
                boolean r0 = r5.p()
                if (r0 == 0) goto L55
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$j r0 = r0.f1895f0
                r2 = 1
                if (r0 == 0) goto L3f
                java.util.List r3 = r5.g()
                androidx.recyclerview.widget.k r0 = (androidx.recyclerview.widget.k) r0
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L39
                boolean r0 = r0.f2222g
                if (r0 == 0) goto L33
                boolean r0 = r5.k()
                if (r0 == 0) goto L31
                goto L33
            L31:
                r0 = r1
                goto L34
            L33:
                r0 = r2
            L34:
                if (r0 == 0) goto L37
                goto L39
            L37:
                r0 = r1
                goto L3a
            L39:
                r0 = r2
            L3a:
                if (r0 == 0) goto L3d
                goto L3f
            L3d:
                r0 = r1
                goto L40
            L3f:
                r0 = r2
            L40:
                if (r0 == 0) goto L43
                goto L55
            L43:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r0 = r4.f1987b
                if (r0 != 0) goto L4e
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r4.f1987b = r0
            L4e:
                r5.f1937n = r4
                r5.f1938o = r2
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r0 = r4.f1987b
                goto L82
            L55:
                boolean r0 = r5.k()
                if (r0 == 0) goto L7c
                boolean r0 = r5.m()
                if (r0 != 0) goto L7c
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r0 = r0.D
                boolean r0 = r0.f1944b
                if (r0 == 0) goto L6a
                goto L7c
            L6a:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."
                java.lang.StringBuilder r0 = androidx.activity.result.a.c(r0)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r0 = androidx.activity.result.a.b(r1, r0)
                r5.<init>(r0)
                throw r5
            L7c:
                r5.f1937n = r4
                r5.f1938o = r1
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r0 = r4.f1986a
            L82:
                r0.add(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.s.i(android.view.View):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:155:0x02ef, code lost:
            r7 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:223:0x044e, code lost:
            if (r7.k() == false) goto L233;
         */
        /* JADX WARN: Code restructure failed: missing block: B:232:0x0482, code lost:
            if ((r10 == 0 || r10 + r8 < r18) == false) goto L233;
         */
        /* JADX WARN: Removed duplicated region for block: B:122:0x0241  */
        /* JADX WARN: Removed duplicated region for block: B:209:0x040f  */
        /* JADX WARN: Removed duplicated region for block: B:217:0x0440  */
        /* JADX WARN: Removed duplicated region for block: B:226:0x046b  */
        /* JADX WARN: Removed duplicated region for block: B:236:0x0495  */
        /* JADX WARN: Removed duplicated region for block: B:239:0x04b2  */
        /* JADX WARN: Removed duplicated region for block: B:242:0x04c5  */
        /* JADX WARN: Removed duplicated region for block: B:245:0x04e5  */
        /* JADX WARN: Removed duplicated region for block: B:253:0x0500  */
        /* JADX WARN: Removed duplicated region for block: B:266:0x0535  */
        /* JADX WARN: Removed duplicated region for block: B:269:0x053e  */
        /* JADX WARN: Removed duplicated region for block: B:273:0x0549  */
        /* JADX WARN: Removed duplicated region for block: B:274:0x0550  */
        /* JADX WARN: Removed duplicated region for block: B:281:0x056c A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0090  */
        /* JADX WARN: Type inference failed for: r10v16, types: [java.util.List<android.view.View>, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r3v11, types: [java.util.List<java.lang.Object>, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r8v11, types: [java.util.List<android.view.View>, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r8v6, types: [java.util.Map<android.view.View, m0.a>, java.util.WeakHashMap] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final androidx.recyclerview.widget.RecyclerView.a0 j(int r17, long r18) {
            /*
                Method dump skipped, instructions count: 1443
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.s.j(int, long):androidx.recyclerview.widget.RecyclerView$a0");
        }

        public final void k(a0 a0Var) {
            (a0Var.f1938o ? this.f1987b : this.f1986a).remove(a0Var);
            a0Var.f1937n = null;
            a0Var.f1938o = false;
            a0Var.d();
        }

        public final void l() {
            m mVar = RecyclerView.this.E;
            this.f1991f = this.f1990e + (mVar != null ? mVar.f1965l : 0);
            for (int size = this.f1988c.size() - 1; size >= 0 && this.f1988c.size() > this.f1991f; size--) {
                f(size);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface t {
        void a();
    }

    /* loaded from: classes.dex */
    public class u extends g {
        public u() {
            RecyclerView.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public final void a() {
            RecyclerView.this.i(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.x0.f2016f = true;
            recyclerView.Y(true);
            if (!RecyclerView.this.f1914v.g()) {
                RecyclerView.this.requestLayout();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x0026, code lost:
            if (r0.f2068b.size() == 1) goto L7;
         */
        @Override // androidx.recyclerview.widget.RecyclerView.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void b(int r5, int r6, java.lang.Object r7) {
            /*
                r4 = this;
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                r1 = 0
                r0.i(r1)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.f1914v
                java.util.Objects.requireNonNull(r0)
                r1 = 1
                if (r6 >= r1) goto L11
                goto L29
            L11:
                java.util.ArrayList<androidx.recyclerview.widget.a$b> r2 = r0.f2068b
                r3 = 4
                androidx.recyclerview.widget.a$b r5 = r0.h(r3, r5, r6, r7)
                r2.add(r5)
                int r5 = r0.f2072f
                r5 = r5 | r3
                r0.f2072f = r5
                java.util.ArrayList<androidx.recyclerview.widget.a$b> r5 = r0.f2068b
                int r5 = r5.size()
                if (r5 != r1) goto L29
                goto L2a
            L29:
                r1 = 0
            L2a:
                if (r1 == 0) goto L2f
                r4.e()
            L2f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.u.b(int, int, java.lang.Object):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x0025, code lost:
            if (r0.f2068b.size() == 1) goto L7;
         */
        @Override // androidx.recyclerview.widget.RecyclerView.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void c(int r5, int r6) {
            /*
                r4 = this;
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                r1 = 0
                r0.i(r1)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.f1914v
                java.util.Objects.requireNonNull(r0)
                r2 = 1
                if (r6 >= r2) goto L11
                goto L28
            L11:
                java.util.ArrayList<androidx.recyclerview.widget.a$b> r3 = r0.f2068b
                androidx.recyclerview.widget.a$b r5 = r0.h(r2, r5, r6, r1)
                r3.add(r5)
                int r5 = r0.f2072f
                r5 = r5 | r2
                r0.f2072f = r5
                java.util.ArrayList<androidx.recyclerview.widget.a$b> r5 = r0.f2068b
                int r5 = r5.size()
                if (r5 != r2) goto L28
                goto L29
            L28:
                r2 = 0
            L29:
                if (r2 == 0) goto L2e
                r4.e()
            L2e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.u.c(int, int):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:0x0026, code lost:
            if (r0.f2068b.size() == 1) goto L7;
         */
        @Override // androidx.recyclerview.widget.RecyclerView.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void d(int r6, int r7) {
            /*
                r5 = this;
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                r1 = 0
                r0.i(r1)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.f1914v
                java.util.Objects.requireNonNull(r0)
                r2 = 1
                if (r7 >= r2) goto L11
                goto L29
            L11:
                java.util.ArrayList<androidx.recyclerview.widget.a$b> r3 = r0.f2068b
                r4 = 2
                androidx.recyclerview.widget.a$b r6 = r0.h(r4, r6, r7, r1)
                r3.add(r6)
                int r6 = r0.f2072f
                r6 = r6 | r4
                r0.f2072f = r6
                java.util.ArrayList<androidx.recyclerview.widget.a$b> r6 = r0.f2068b
                int r6 = r6.size()
                if (r6 != r2) goto L29
                goto L2a
            L29:
                r2 = 0
            L2a:
                if (r2 == 0) goto L2f
                r5.e()
            L2f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.u.d(int, int):void");
        }

        public final void e() {
            int[] iArr = RecyclerView.O0;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.K && recyclerView.J) {
                a aVar = recyclerView.f1920z;
                WeakHashMap<View, f0> weakHashMap = m0.z.f5921a;
                z.d.m(recyclerView, aVar);
                return;
            }
            recyclerView.R = true;
            recyclerView.requestLayout();
        }
    }

    /* loaded from: classes.dex */
    public static class v extends s0.a {
        public static final Parcelable.Creator<v> CREATOR = new a();

        /* renamed from: u */
        public Parcelable f1995u;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<v> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new v(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i10) {
                return new v[i10];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final v createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new v(parcel, classLoader);
            }
        }

        public v(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1995u = parcel.readParcelable(classLoader == null ? m.class.getClassLoader() : classLoader);
        }

        public v(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // s0.a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f17592s, i10);
            parcel.writeParcelable(this.f1995u, 0);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class w {

        /* renamed from: b */
        public RecyclerView f1997b;

        /* renamed from: c */
        public m f1998c;

        /* renamed from: d */
        public boolean f1999d;

        /* renamed from: e */
        public boolean f2000e;

        /* renamed from: f */
        public View f2001f;

        /* renamed from: h */
        public boolean f2003h;

        /* renamed from: a */
        public int f1996a = -1;

        /* renamed from: g */
        public final a f2002g = new a();

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: d */
            public int f2007d = -1;

            /* renamed from: f */
            public boolean f2009f = false;

            /* renamed from: g */
            public int f2010g = 0;

            /* renamed from: a */
            public int f2004a = 0;

            /* renamed from: b */
            public int f2005b = 0;

            /* renamed from: c */
            public int f2006c = Integer.MIN_VALUE;

            /* renamed from: e */
            public Interpolator f2008e = null;

            public final void a(RecyclerView recyclerView) {
                int i10 = this.f2007d;
                if (i10 >= 0) {
                    this.f2007d = -1;
                    recyclerView.Q(i10);
                    this.f2009f = false;
                } else if (this.f2009f) {
                    Interpolator interpolator = this.f2008e;
                    if (interpolator != null && this.f2006c < 1) {
                        throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                    }
                    int i11 = this.f2006c;
                    if (i11 >= 1) {
                        recyclerView.f1913u0.b(this.f2004a, this.f2005b, i11, interpolator);
                        int i12 = this.f2010g + 1;
                        this.f2010g = i12;
                        if (i12 > 10) {
                            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                        }
                        this.f2009f = false;
                        return;
                    }
                    throw new IllegalStateException("Scroll duration must be a positive number");
                } else {
                    this.f2010g = 0;
                }
            }

            public final void b(int i10, int i11, int i12, Interpolator interpolator) {
                this.f2004a = i10;
                this.f2005b = i11;
                this.f2006c = i12;
                this.f2008e = interpolator;
                this.f2009f = true;
            }
        }

        /* loaded from: classes.dex */
        public interface b {
            PointF a(int i10);
        }

        public final PointF a(int i10) {
            m mVar = this.f1998c;
            if (mVar instanceof b) {
                return ((b) mVar).a(i10);
            }
            StringBuilder c10 = androidx.activity.result.a.c("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
            c10.append(b.class.getCanonicalName());
            Log.w("RecyclerView", c10.toString());
            return null;
        }

        public final void b(int i10, int i11) {
            float f10;
            PointF a10;
            RecyclerView recyclerView = this.f1997b;
            int i12 = -1;
            if (this.f1996a == -1 || recyclerView == null) {
                d();
            }
            if (this.f1999d && this.f2001f == null && this.f1998c != null && (a10 = a(this.f1996a)) != null) {
                float f11 = a10.x;
                if (f11 != 0.0f || a10.y != 0.0f) {
                    recyclerView.e0((int) Math.signum(f11), (int) Math.signum(a10.y), null);
                }
            }
            boolean z10 = false;
            this.f1999d = false;
            View view = this.f2001f;
            if (view != null) {
                Objects.requireNonNull(this.f1997b);
                a0 K = RecyclerView.K(view);
                if (K != null) {
                    i12 = K.f();
                }
                if (i12 == this.f1996a) {
                    View view2 = this.f2001f;
                    x xVar = recyclerView.x0;
                    c(view2, this.f2002g);
                    this.f2002g.a(recyclerView);
                    d();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f2001f = null;
                }
            }
            if (this.f2000e) {
                x xVar2 = recyclerView.x0;
                a aVar = this.f2002g;
                androidx.recyclerview.widget.o oVar = (androidx.recyclerview.widget.o) this;
                if (oVar.f1997b.E.x() == 0) {
                    oVar.d();
                } else {
                    int i13 = oVar.f2208o;
                    int i14 = i13 - i10;
                    if (i13 * i14 <= 0) {
                        i14 = 0;
                    }
                    oVar.f2208o = i14;
                    int i15 = oVar.p;
                    int i16 = i15 - i11;
                    if (i15 * i16 <= 0) {
                        i16 = 0;
                    }
                    oVar.p = i16;
                    if (i14 == 0 && i16 == 0) {
                        PointF a11 = oVar.a(oVar.f1996a);
                        if (a11 != null) {
                            if (a11.x != 0.0f || a11.y != 0.0f) {
                                float f12 = a11.y;
                                float sqrt = (float) Math.sqrt((f12 * f12) + (f10 * f10));
                                float f13 = a11.x / sqrt;
                                a11.x = f13;
                                float f14 = a11.y / sqrt;
                                a11.y = f14;
                                oVar.f2204k = a11;
                                oVar.f2208o = (int) (f13 * 10000.0f);
                                oVar.p = (int) (f14 * 10000.0f);
                                aVar.b((int) (oVar.f2208o * 1.2f), (int) (oVar.p * 1.2f), (int) (oVar.g(10000) * 1.2f), oVar.f2202i);
                            }
                        }
                        aVar.f2007d = oVar.f1996a;
                        oVar.d();
                    }
                }
                a aVar2 = this.f2002g;
                if (aVar2.f2007d >= 0) {
                    z10 = true;
                }
                aVar2.a(recyclerView);
                if (!z10 || !this.f2000e) {
                    return;
                }
                this.f1999d = true;
                recyclerView.f1913u0.a();
            }
        }

        public abstract void c(View view, a aVar);

        public final void d() {
            if (!this.f2000e) {
                return;
            }
            this.f2000e = false;
            androidx.recyclerview.widget.o oVar = (androidx.recyclerview.widget.o) this;
            oVar.p = 0;
            oVar.f2208o = 0;
            oVar.f2204k = null;
            this.f1997b.x0.f2011a = -1;
            this.f2001f = null;
            this.f1996a = -1;
            this.f1999d = false;
            m mVar = this.f1998c;
            if (mVar.f1960g == this) {
                mVar.f1960g = null;
            }
            this.f1998c = null;
            this.f1997b = null;
        }
    }

    /* loaded from: classes.dex */
    public static class x {

        /* renamed from: a */
        public int f2011a = -1;

        /* renamed from: b */
        public int f2012b = 0;

        /* renamed from: c */
        public int f2013c = 0;

        /* renamed from: d */
        public int f2014d = 1;

        /* renamed from: e */
        public int f2015e = 0;

        /* renamed from: f */
        public boolean f2016f = false;

        /* renamed from: g */
        public boolean f2017g = false;

        /* renamed from: h */
        public boolean f2018h = false;

        /* renamed from: i */
        public boolean f2019i = false;

        /* renamed from: j */
        public boolean f2020j = false;

        /* renamed from: k */
        public boolean f2021k = false;

        /* renamed from: l */
        public int f2022l;

        /* renamed from: m */
        public long f2023m;

        /* renamed from: n */
        public int f2024n;

        public final void a(int i10) {
            if ((this.f2014d & i10) != 0) {
                return;
            }
            StringBuilder c10 = androidx.activity.result.a.c("Layout state should be one of ");
            c10.append(Integer.toBinaryString(i10));
            c10.append(" but it is ");
            c10.append(Integer.toBinaryString(this.f2014d));
            throw new IllegalStateException(c10.toString());
        }

        public final int b() {
            return this.f2017g ? this.f2012b - this.f2013c : this.f2015e;
        }

        public final String toString() {
            StringBuilder c10 = androidx.activity.result.a.c("State{mTargetPosition=");
            c10.append(this.f2011a);
            c10.append(", mData=");
            c10.append((Object) null);
            c10.append(", mItemCount=");
            c10.append(this.f2015e);
            c10.append(", mIsMeasuring=");
            c10.append(this.f2019i);
            c10.append(", mPreviousLayoutItemCount=");
            c10.append(this.f2012b);
            c10.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            c10.append(this.f2013c);
            c10.append(", mStructureChanged=");
            c10.append(this.f2016f);
            c10.append(", mInPreLayout=");
            c10.append(this.f2017g);
            c10.append(", mRunSimpleAnimations=");
            c10.append(this.f2020j);
            c10.append(", mRunPredictiveAnimations=");
            c10.append(this.f2021k);
            c10.append('}');
            return c10.toString();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class y {
    }

    /* loaded from: classes.dex */
    public class z implements Runnable {

        /* renamed from: s */
        public int f2025s;

        /* renamed from: t */
        public int f2026t;

        /* renamed from: u */
        public OverScroller f2027u;

        /* renamed from: v */
        public Interpolator f2028v;

        /* renamed from: w */
        public boolean f2029w = false;

        /* renamed from: x */
        public boolean f2030x = false;

        public z() {
            RecyclerView.this = r3;
            c cVar = RecyclerView.Q0;
            this.f2028v = cVar;
            this.f2027u = new OverScroller(r3.getContext(), cVar);
        }

        public final void a() {
            if (this.f2029w) {
                this.f2030x = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            RecyclerView recyclerView = RecyclerView.this;
            WeakHashMap<View, f0> weakHashMap = m0.z.f5921a;
            z.d.m(recyclerView, this);
        }

        public final void b(int i10, int i11, int i12, Interpolator interpolator) {
            int i13;
            if (i12 == Integer.MIN_VALUE) {
                int abs = Math.abs(i10);
                int abs2 = Math.abs(i11);
                boolean z10 = abs > abs2;
                int sqrt = (int) Math.sqrt(0);
                int sqrt2 = (int) Math.sqrt((i11 * i11) + (i10 * i10));
                RecyclerView recyclerView = RecyclerView.this;
                int width = z10 ? recyclerView.getWidth() : recyclerView.getHeight();
                int i14 = width / 2;
                float f10 = width;
                float f11 = i14;
                float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f10) - 0.5f) * 0.47123894f)) * f11) + f11;
                if (sqrt > 0) {
                    i13 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
                } else {
                    if (!z10) {
                        abs = abs2;
                    }
                    i13 = (int) (((abs / f10) + 1.0f) * 300.0f);
                }
                i12 = Math.min(i13, 2000);
            }
            int i15 = i12;
            if (interpolator == null) {
                interpolator = RecyclerView.Q0;
            }
            if (this.f2028v != interpolator) {
                this.f2028v = interpolator;
                this.f2027u = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f2026t = 0;
            this.f2025s = 0;
            RecyclerView.this.setScrollState(2);
            this.f2027u.startScroll(0, 0, i10, i11, i15);
            a();
        }

        public final void c() {
            RecyclerView.this.removeCallbacks(this);
            this.f2027u.abortAnimation();
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i10;
            int i11;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.E == null) {
                c();
                return;
            }
            this.f2030x = false;
            this.f2029w = true;
            recyclerView.n();
            OverScroller overScroller = this.f2027u;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i12 = currX - this.f2025s;
                int i13 = currY - this.f2026t;
                this.f2025s = currX;
                this.f2026t = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.K0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.t(i12, i13, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.K0;
                    i12 -= iArr2[0];
                    i13 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.m(i12, i13);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.D != null) {
                    int[] iArr3 = recyclerView3.K0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.e0(i12, i13, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.K0;
                    i10 = iArr4[0];
                    i11 = iArr4[1];
                    i12 -= i10;
                    i13 -= i11;
                    w wVar = recyclerView4.E.f1960g;
                    if (wVar != null && !wVar.f1999d && wVar.f2000e) {
                        int b10 = recyclerView4.x0.b();
                        if (b10 == 0) {
                            wVar.d();
                        } else {
                            if (wVar.f1996a >= b10) {
                                wVar.f1996a = b10 - 1;
                            }
                            wVar.b(i10, i11);
                        }
                    }
                } else {
                    i11 = 0;
                    i10 = 0;
                }
                if (!RecyclerView.this.G.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.K0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.u(i10, i11, i12, i13, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.K0;
                int i14 = i12 - iArr6[0];
                int i15 = i13 - iArr6[1];
                if (i10 != 0 || i11 != 0) {
                    recyclerView6.v(i10, i11);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z10 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i14 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i15 != 0));
                RecyclerView recyclerView7 = RecyclerView.this;
                w wVar2 = recyclerView7.E.f1960g;
                if (!(wVar2 != null && wVar2.f1999d) && z10) {
                    if (recyclerView7.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i16 = i14 < 0 ? -currVelocity : i14 > 0 ? currVelocity : 0;
                        if (i15 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i15 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView recyclerView8 = RecyclerView.this;
                        Objects.requireNonNull(recyclerView8);
                        if (i16 < 0) {
                            recyclerView8.x();
                            if (recyclerView8.f1891b0.isFinished()) {
                                recyclerView8.f1891b0.onAbsorb(-i16);
                            }
                        } else if (i16 > 0) {
                            recyclerView8.y();
                            if (recyclerView8.f1893d0.isFinished()) {
                                recyclerView8.f1893d0.onAbsorb(i16);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView8.z();
                            if (recyclerView8.f1892c0.isFinished()) {
                                recyclerView8.f1892c0.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView8.w();
                            if (recyclerView8.f1894e0.isFinished()) {
                                recyclerView8.f1894e0.onAbsorb(currVelocity);
                            }
                        }
                        if (i16 != 0 || currVelocity != 0) {
                            WeakHashMap<View, f0> weakHashMap = m0.z.f5921a;
                            z.d.k(recyclerView8);
                        }
                    }
                    int[] iArr7 = RecyclerView.O0;
                    m.b bVar = RecyclerView.this.f1917w0;
                    int[] iArr8 = bVar.f2186c;
                    if (iArr8 != null) {
                        Arrays.fill(iArr8, -1);
                    }
                    bVar.f2187d = 0;
                } else {
                    a();
                    RecyclerView recyclerView9 = RecyclerView.this;
                    androidx.recyclerview.widget.m mVar = recyclerView9.f1915v0;
                    if (mVar != null) {
                        mVar.a(recyclerView9, i10, i11);
                    }
                }
            }
            w wVar3 = RecyclerView.this.E.f1960g;
            if (wVar3 != null && wVar3.f1999d) {
                wVar3.b(0, 0);
            }
            this.f2029w = false;
            if (this.f2030x) {
                RecyclerView.this.removeCallbacks(this);
                RecyclerView recyclerView10 = RecyclerView.this;
                WeakHashMap<View, f0> weakHashMap2 = m0.z.f5921a;
                z.d.m(recyclerView10, this);
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.l0(1);
        }
    }

    static {
        Class<?> cls = Integer.TYPE;
        P0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(1:47)(12:48|(1:51)|50|92|53|(1:55)(1:56)|57|58|88|59|60|64)|92|53|(0)(0)|57|58|88|59|60|64) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x026d, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0270, code lost:
        r0 = r4.getConstructor(new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0284, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0285, code lost:
        r0.initCause(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x02a5, code lost:
        throw new java.lang.IllegalStateException(r20.getPositionDescription() + ": Error creating LayoutManager " + r3, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0238 A[Catch: ClassCastException -> 0x02a6, IllegalAccessException -> 0x02c5, InstantiationException -> 0x02e4, InvocationTargetException -> 0x0301, ClassNotFoundException -> 0x031e, TryCatch #4 {ClassCastException -> 0x02a6, ClassNotFoundException -> 0x031e, IllegalAccessException -> 0x02c5, InstantiationException -> 0x02e4, InvocationTargetException -> 0x0301, blocks: (B:53:0x0232, B:55:0x0238, B:56:0x0241, B:57:0x0245, B:59:0x0251, B:63:0x0270, B:64:0x0276, B:66:0x0285, B:67:0x02a5), top: B:92:0x0232 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0241 A[Catch: ClassCastException -> 0x02a6, IllegalAccessException -> 0x02c5, InstantiationException -> 0x02e4, InvocationTargetException -> 0x0301, ClassNotFoundException -> 0x031e, TryCatch #4 {ClassCastException -> 0x02a6, ClassNotFoundException -> 0x031e, IllegalAccessException -> 0x02c5, InstantiationException -> 0x02e4, InvocationTargetException -> 0x0301, blocks: (B:53:0x0232, B:55:0x0238, B:56:0x0241, B:57:0x0245, B:59:0x0251, B:63:0x0270, B:64:0x0276, B:66:0x0285, B:67:0x02a5), top: B:92:0x0232 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public RecyclerView(android.content.Context r19, android.util.AttributeSet r20, int r21) {
        /*
            Method dump skipped, instructions count: 867
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public static RecyclerView F(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView F = F(viewGroup.getChildAt(i10));
            if (F != null) {
                return F;
            }
        }
        return null;
    }

    public static a0 K(View view) {
        if (view == null) {
            return null;
        }
        return ((n) view.getLayoutParams()).f1976a;
    }

    private m0.m getScrollingChildHelper() {
        if (this.H0 == null) {
            this.H0 = new m0.m(this);
        }
        return this.H0;
    }

    public static void k(a0 a0Var) {
        WeakReference<RecyclerView> weakReference = a0Var.f1925b;
        if (weakReference != null) {
            ViewParent viewParent = weakReference.get();
            while (true) {
                for (View view = (View) viewParent; view != null; view = null) {
                    if (view == a0Var.f1924a) {
                        return;
                    }
                    viewParent = view.getParent();
                    if (viewParent instanceof View) {
                        break;
                    }
                }
                a0Var.f1925b = null;
                return;
            }
        }
    }

    public final String A() {
        StringBuilder c10 = androidx.activity.result.a.c(" ");
        c10.append(super.toString());
        c10.append(", adapter:");
        c10.append(this.D);
        c10.append(", layout:");
        c10.append(this.E);
        c10.append(", context:");
        c10.append(getContext());
        return c10.toString();
    }

    public final void B(x xVar) {
        if (getScrollState() != 2) {
            Objects.requireNonNull(xVar);
            return;
        }
        OverScroller overScroller = this.f1913u0.f2027u;
        overScroller.getFinalX();
        overScroller.getCurrX();
        Objects.requireNonNull(xVar);
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View C(android.view.View r3) {
        /*
            r2 = this;
        L0:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L10
            if (r0 == r2) goto L10
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L10
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L0
        L10:
            if (r0 != r2) goto L13
            goto L14
        L13:
            r3 = 0
        L14:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C(android.view.View):android.view.View");
    }

    public final boolean D(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.H.size();
        for (int i10 = 0; i10 < size; i10++) {
            p pVar = this.H.get(i10);
            if (pVar.b(motionEvent) && action != 3) {
                this.I = pVar;
                return true;
            }
        }
        return false;
    }

    public final void E(int[] iArr) {
        int e10 = this.f1916w.e();
        if (e10 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < e10; i12++) {
            a0 K = K(this.f1916w.d(i12));
            if (!K.u()) {
                int f10 = K.f();
                if (f10 < i10) {
                    i10 = f10;
                }
                if (f10 > i11) {
                    i11 = f10;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    public final a0 G(int i10) {
        a0 a0Var = null;
        if (this.T) {
            return null;
        }
        int h10 = this.f1916w.h();
        for (int i11 = 0; i11 < h10; i11++) {
            a0 K = K(this.f1916w.g(i11));
            if (K != null && !K.m() && H(K) == i10) {
                if (!this.f1916w.k(K.f1924a)) {
                    return K;
                }
                a0Var = K;
            }
        }
        return a0Var;
    }

    public final int H(a0 a0Var) {
        if (a0Var.h(524) || !a0Var.j()) {
            return -1;
        }
        androidx.recyclerview.widget.a aVar = this.f1914v;
        int i10 = a0Var.f1926c;
        int size = aVar.f2068b.size();
        for (int i11 = 0; i11 < size; i11++) {
            a.b bVar = aVar.f2068b.get(i11);
            int i12 = bVar.f2073a;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = bVar.f2074b;
                    if (i13 <= i10) {
                        int i14 = bVar.f2076d;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = bVar.f2074b;
                    if (i15 == i10) {
                        i10 = bVar.f2076d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (bVar.f2076d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (bVar.f2074b <= i10) {
                i10 += bVar.f2076d;
            }
        }
        return i10;
    }

    public final long I(a0 a0Var) {
        if (this.D.f1944b) {
            return a0Var.f1928e;
        }
        return a0Var.f1926c;
    }

    public final a0 J(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return K(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect L(View view) {
        n nVar = (n) view.getLayoutParams();
        if (!nVar.f1978c) {
            return nVar.f1977b;
        }
        if (this.x0.f2017g && (nVar.b() || nVar.f1976a.k())) {
            return nVar.f1977b;
        }
        Rect rect = nVar.f1977b;
        rect.set(0, 0, 0, 0);
        int size = this.G.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.A.set(0, 0, 0, 0);
            this.G.get(i10).d(this.A, view, this);
            int i11 = rect.left;
            Rect rect2 = this.A;
            rect.left = i11 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        nVar.f1978c = false;
        return rect;
    }

    public final boolean M() {
        return !this.L || this.T || this.f1914v.g();
    }

    public final void N() {
        this.f1894e0 = null;
        this.f1892c0 = null;
        this.f1893d0 = null;
        this.f1891b0 = null;
    }

    public final void O() {
        if (this.G.size() == 0) {
            return;
        }
        m mVar = this.E;
        if (mVar != null) {
            mVar.d("Cannot invalidate item decorations during a scroll or layout");
        }
        R();
        requestLayout();
    }

    public final boolean P() {
        return this.V > 0;
    }

    public final void Q(int i10) {
        if (this.E == null) {
            return;
        }
        setScrollState(2);
        this.E.u0(i10);
        awakenScrollBars();
    }

    public final void R() {
        int h10 = this.f1916w.h();
        for (int i10 = 0; i10 < h10; i10++) {
            ((n) this.f1916w.g(i10).getLayoutParams()).f1978c = true;
        }
        s sVar = this.f1910t;
        int size = sVar.f1988c.size();
        for (int i11 = 0; i11 < size; i11++) {
            n nVar = (n) sVar.f1988c.get(i11).f1924a.getLayoutParams();
            if (nVar != null) {
                nVar.f1978c = true;
            }
        }
    }

    public final void S(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int h10 = this.f1916w.h();
        for (int i13 = 0; i13 < h10; i13++) {
            a0 K = K(this.f1916w.g(i13));
            if (K != null && !K.u()) {
                int i14 = K.f1926c;
                if (i14 >= i12) {
                    K.q(-i11, z10);
                } else if (i14 >= i10) {
                    K.b(8);
                    K.q(-i11, z10);
                    K.f1926c = i10 - 1;
                }
                this.x0.f2016f = true;
            }
        }
        s sVar = this.f1910t;
        int size = sVar.f1988c.size();
        while (true) {
            size--;
            if (size < 0) {
                requestLayout();
                return;
            }
            a0 a0Var = sVar.f1988c.get(size);
            if (a0Var != null) {
                int i15 = a0Var.f1926c;
                if (i15 >= i12) {
                    a0Var.q(-i11, z10);
                } else if (i15 >= i10) {
                    a0Var.b(8);
                    sVar.f(size);
                }
            }
        }
    }

    public final void T() {
        this.V++;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List<androidx.recyclerview.widget.RecyclerView$a0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List<androidx.recyclerview.widget.RecyclerView$a0>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.List<androidx.recyclerview.widget.RecyclerView$a0>, java.util.ArrayList] */
    public final void U(boolean z10) {
        int i10;
        boolean z11 = true;
        int i11 = this.V - 1;
        this.V = i11;
        if (i11 < 1) {
            this.V = 0;
            if (!z10) {
                return;
            }
            int i12 = this.Q;
            this.Q = 0;
            if (i12 != 0) {
                AccessibilityManager accessibilityManager = this.S;
                if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
                    z11 = false;
                }
                if (z11) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(2048);
                    n0.b.b(obtain, i12);
                    sendAccessibilityEventUnchecked(obtain);
                }
            }
            for (int size = this.L0.size() - 1; size >= 0; size--) {
                a0 a0Var = (a0) this.L0.get(size);
                if (a0Var.f1924a.getParent() == this && !a0Var.u() && (i10 = a0Var.f1939q) != -1) {
                    View view = a0Var.f1924a;
                    WeakHashMap<View, f0> weakHashMap = m0.z.f5921a;
                    z.d.s(view, i10);
                    a0Var.f1939q = -1;
                }
            }
            this.L0.clear();
        }
    }

    public final void V(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1897h0) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f1897h0 = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.f1901l0 = x10;
            this.f1899j0 = x10;
            int y3 = (int) (motionEvent.getY(i10) + 0.5f);
            this.f1902m0 = y3;
            this.f1900k0 = y3;
        }
    }

    public final void W() {
        if (this.D0 || !this.J) {
            return;
        }
        b bVar = this.M0;
        WeakHashMap<View, f0> weakHashMap = m0.z.f5921a;
        z.d.m(this, bVar);
        this.D0 = true;
    }

    public final void X() {
        boolean z10;
        boolean z11 = false;
        if (this.T) {
            androidx.recyclerview.widget.a aVar = this.f1914v;
            aVar.l(aVar.f2068b);
            aVar.l(aVar.f2069c);
            aVar.f2072f = 0;
            if (this.U) {
                this.E.c0();
            }
        }
        if (this.f1895f0 != null && this.E.H0()) {
            this.f1914v.j();
        } else {
            this.f1914v.c();
        }
        boolean z12 = this.A0 || this.B0;
        x xVar = this.x0;
        boolean z13 = this.L && this.f1895f0 != null && ((z10 = this.T) || z12 || this.E.f1961h) && (!z10 || this.D.f1944b);
        xVar.f2020j = z13;
        if (z13 && z12 && !this.T) {
            if (this.f1895f0 != null && this.E.H0()) {
                z11 = true;
            }
        }
        xVar.f2021k = z11;
    }

    public final void Y(boolean z10) {
        this.U = z10 | this.U;
        this.T = true;
        int h10 = this.f1916w.h();
        for (int i10 = 0; i10 < h10; i10++) {
            a0 K = K(this.f1916w.g(i10));
            if (K != null && !K.u()) {
                K.b(6);
            }
        }
        R();
        s sVar = this.f1910t;
        int size = sVar.f1988c.size();
        for (int i11 = 0; i11 < size; i11++) {
            a0 a0Var = sVar.f1988c.get(i11);
            if (a0Var != null) {
                a0Var.b(6);
                a0Var.a(null);
            }
        }
        e eVar = RecyclerView.this.D;
        if (eVar == null || !eVar.f1944b) {
            sVar.e();
        }
    }

    public final void Z(a0 a0Var, j.c cVar) {
        a0Var.s(0, 8192);
        if (this.x0.f2018h && a0Var.p() && !a0Var.m() && !a0Var.u()) {
            this.f1918x.f2096b.f(I(a0Var), a0Var);
        }
        this.f1918x.c(a0Var, cVar);
    }

    public final void a0() {
        j jVar = this.f1895f0;
        if (jVar != null) {
            jVar.f();
        }
        m mVar = this.E;
        if (mVar != null) {
            mVar.m0(this.f1910t);
            this.E.n0(this.f1910t);
        }
        this.f1910t.b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        m mVar = this.E;
        if (mVar != null) {
            Objects.requireNonNull(mVar);
        }
        super.addFocusables(arrayList, i10, i11);
    }

    public final void b0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.A.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof n) {
            n nVar = (n) layoutParams;
            if (!nVar.f1978c) {
                Rect rect = nVar.f1977b;
                Rect rect2 = this.A;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.A);
            offsetRectIntoDescendantCoords(view, this.A);
        }
        this.E.r0(this, view, this.A, !this.L, view2 == null);
    }

    public final void c0() {
        VelocityTracker velocityTracker = this.f1898i0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z10 = false;
        l0(0);
        EdgeEffect edgeEffect = this.f1891b0;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = this.f1891b0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1892c0;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 |= this.f1892c0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1893d0;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 |= this.f1893d0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1894e0;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z10 |= this.f1894e0.isFinished();
        }
        if (z10) {
            WeakHashMap<View, f0> weakHashMap = m0.z.f5921a;
            z.d.k(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof n) && this.E.g((n) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        m mVar = this.E;
        if (mVar != null && mVar.e()) {
            return this.E.k(this.x0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        m mVar = this.E;
        if (mVar != null && mVar.e()) {
            return this.E.l(this.x0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        m mVar = this.E;
        if (mVar != null && mVar.e()) {
            return this.E.m(this.x0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        m mVar = this.E;
        if (mVar != null && mVar.f()) {
            return this.E.n(this.x0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        m mVar = this.E;
        if (mVar != null && mVar.f()) {
            return this.E.o(this.x0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        m mVar = this.E;
        if (mVar != null && mVar.f()) {
            return this.E.p(this.x0);
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d0(int r20, int r21, android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.d0(int, int, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().e(i10, i11, i12, i13, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z10;
        float f10;
        float f11;
        super.draw(canvas);
        int size = this.G.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            this.G.get(i10).f(canvas, this);
        }
        EdgeEffect edgeEffect = this.f1891b0;
        boolean z12 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.y ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f1891b0;
            z10 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f1892c0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.y) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f1892c0;
            z10 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f1893d0;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.y ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f1893d0;
            z10 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f1894e0;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.y) {
                f11 = getPaddingRight() + (-getWidth());
                f10 = getPaddingBottom() + (-getHeight());
            } else {
                f11 = -getWidth();
                f10 = -getHeight();
            }
            canvas.translate(f11, f10);
            EdgeEffect edgeEffect8 = this.f1894e0;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(save4);
        }
        if (z10 || this.f1895f0 == null || this.G.size() <= 0 || !this.f1895f0.g()) {
            z12 = z10;
        }
        if (z12) {
            WeakHashMap<View, f0> weakHashMap = m0.z.f5921a;
            z.d.k(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return super.drawChild(canvas, view, j3);
    }

    public final void e0(int i10, int i11, int[] iArr) {
        a0 a0Var;
        i0();
        T();
        int i12 = i0.j.f5171a;
        j.a.a("RV Scroll");
        B(this.x0);
        int t02 = i10 != 0 ? this.E.t0(i10, this.f1910t, this.x0) : 0;
        int v02 = i11 != 0 ? this.E.v0(i11, this.f1910t, this.x0) : 0;
        j.a.b();
        int e10 = this.f1916w.e();
        for (int i13 = 0; i13 < e10; i13++) {
            View d5 = this.f1916w.d(i13);
            a0 J = J(d5);
            if (J != null && (a0Var = J.f1932i) != null) {
                View view = a0Var.f1924a;
                int left = d5.getLeft();
                int top = d5.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        U(true);
        k0(false);
        if (iArr != null) {
            iArr[0] = t02;
            iArr[1] = v02;
        }
    }

    public final void f(a0 a0Var) {
        View view = a0Var.f1924a;
        boolean z10 = view.getParent() == this;
        this.f1910t.k(J(view));
        if (a0Var.o()) {
            this.f1916w.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        androidx.recyclerview.widget.b bVar = this.f1916w;
        if (!z10) {
            bVar.a(view, -1, true);
            return;
        }
        int c10 = ((androidx.recyclerview.widget.v) bVar.f2081a).c(view);
        if (c10 >= 0) {
            bVar.f2082b.h(c10);
            bVar.i(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    public final void f0(int i10) {
        if (this.O) {
            return;
        }
        m0();
        m mVar = this.E;
        if (mVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        mVar.u0(i10);
        awakenScrollBars();
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0164, code lost:
        if (r3 > 0) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x017e, code lost:
        if (r6 > 0) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0181, code lost:
        if (r3 < 0) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0184, code lost:
        if (r6 < 0) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x018c, code lost:
        if ((r6 * r2) < 0) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0194, code lost:
        if ((r6 * r2) > 0) goto L126;
     */
    /* JADX WARN: Removed duplicated region for block: B:128:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x006f  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View focusSearch(android.view.View r14, int r15) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g(l lVar) {
        m mVar = this.E;
        if (mVar != null) {
            mVar.d("Cannot add item decoration during a scroll  or layout");
        }
        if (this.G.isEmpty()) {
            setWillNotDraw(false);
        }
        this.G.add(lVar);
        R();
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List<androidx.recyclerview.widget.RecyclerView$a0>, java.util.ArrayList] */
    public final boolean g0(a0 a0Var, int i10) {
        if (P()) {
            a0Var.f1939q = i10;
            this.L0.add(a0Var);
            return false;
        }
        View view = a0Var.f1924a;
        WeakHashMap<View, f0> weakHashMap = m0.z.f5921a;
        z.d.s(view, i10);
        return true;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        m mVar = this.E;
        if (mVar != null) {
            return mVar.t();
        }
        throw new IllegalStateException(androidx.activity.result.a.b(this, androidx.activity.result.a.c("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        m mVar = this.E;
        if (mVar != null) {
            return mVar.u(getContext(), attributeSet);
        }
        throw new IllegalStateException(androidx.activity.result.a.b(this, androidx.activity.result.a.c("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public e getAdapter() {
        return this.D;
    }

    @Override // android.view.View
    public int getBaseline() {
        m mVar = this.E;
        if (mVar != null) {
            Objects.requireNonNull(mVar);
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        h hVar = this.F0;
        return hVar == null ? super.getChildDrawingOrder(i10, i11) : hVar.a();
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.y;
    }

    public androidx.recyclerview.widget.x getCompatAccessibilityDelegate() {
        return this.E0;
    }

    public i getEdgeEffectFactory() {
        return this.f1890a0;
    }

    public j getItemAnimator() {
        return this.f1895f0;
    }

    public int getItemDecorationCount() {
        return this.G.size();
    }

    public m getLayoutManager() {
        return this.E;
    }

    public int getMaxFlingVelocity() {
        return this.f1906q0;
    }

    public int getMinFlingVelocity() {
        return this.f1905p0;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public o getOnFlingListener() {
        return this.f1904o0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f1911t0;
    }

    public r getRecycledViewPool() {
        return this.f1910t.d();
    }

    public int getScrollState() {
        return this.f1896g0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<androidx.recyclerview.widget.RecyclerView$q>, java.util.ArrayList] */
    public final void h(q qVar) {
        if (this.f1921z0 == null) {
            this.f1921z0 = new ArrayList();
        }
        this.f1921z0.add(qVar);
    }

    public final void h0(int i10, int i11, boolean z10) {
        m mVar = this.E;
        if (mVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.O) {
        } else {
            int i12 = 0;
            if (!mVar.e()) {
                i10 = 0;
            }
            if (!this.E.f()) {
                i11 = 0;
            }
            if (i10 == 0 && i11 == 0) {
                return;
            }
            if (z10) {
                if (i10 != 0) {
                    i12 = 1;
                }
                if (i11 != 0) {
                    i12 |= 2;
                }
                j0(i12, 1);
            }
            this.f1913u0.b(i10, i11, Integer.MIN_VALUE, null);
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().g(0);
    }

    public final void i(String str) {
        if (P()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(androidx.activity.result.a.b(this, androidx.activity.result.a.c("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        } else if (this.W <= 0) {
        } else {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(androidx.activity.result.a.b(this, androidx.activity.result.a.c(""))));
        }
    }

    public final void i0() {
        int i10 = this.M + 1;
        this.M = i10;
        if (i10 != 1 || this.O) {
            return;
        }
        this.N = false;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.J;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.O;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f5913d;
    }

    public final void j() {
        c0();
        setScrollState(0);
    }

    public final boolean j0(int i10, int i11) {
        return getScrollingChildHelper().h(i10, i11);
    }

    public final void k0(boolean z10) {
        if (this.M < 1) {
            this.M = 1;
        }
        if (!z10 && !this.O) {
            this.N = false;
        }
        if (this.M == 1) {
            if (z10 && this.N && !this.O && this.E != null && this.D != null) {
                q();
            }
            if (!this.O) {
                this.N = false;
            }
        }
        this.M--;
    }

    public final void l() {
        int h10 = this.f1916w.h();
        for (int i10 = 0; i10 < h10; i10++) {
            a0 K = K(this.f1916w.g(i10));
            if (!K.u()) {
                K.c();
            }
        }
        s sVar = this.f1910t;
        int size = sVar.f1988c.size();
        for (int i11 = 0; i11 < size; i11++) {
            sVar.f1988c.get(i11).c();
        }
        int size2 = sVar.f1986a.size();
        for (int i12 = 0; i12 < size2; i12++) {
            sVar.f1986a.get(i12).c();
        }
        ArrayList<a0> arrayList = sVar.f1987b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i13 = 0; i13 < size3; i13++) {
                sVar.f1987b.get(i13).c();
            }
        }
    }

    public final void l0(int i10) {
        getScrollingChildHelper().i(i10);
    }

    public final void m(int i10, int i11) {
        boolean z10;
        EdgeEffect edgeEffect = this.f1891b0;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            z10 = false;
        } else {
            this.f1891b0.onRelease();
            z10 = this.f1891b0.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f1893d0;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.f1893d0.onRelease();
            z10 |= this.f1893d0.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f1892c0;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.f1892c0.onRelease();
            z10 |= this.f1892c0.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f1894e0;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.f1894e0.onRelease();
            z10 |= this.f1894e0.isFinished();
        }
        if (z10) {
            WeakHashMap<View, f0> weakHashMap = m0.z.f5921a;
            z.d.k(this);
        }
    }

    public final void m0() {
        w wVar;
        setScrollState(0);
        this.f1913u0.c();
        m mVar = this.E;
        if (mVar == null || (wVar = mVar.f1960g) == null) {
            return;
        }
        wVar.d();
    }

    public final void n() {
        if (!this.L || this.T) {
            int i10 = i0.j.f5171a;
            j.a.a("RV FullInvalidate");
            q();
            j.a.b();
        } else if (!this.f1914v.g()) {
        } else {
            androidx.recyclerview.widget.a aVar = this.f1914v;
            int i11 = aVar.f2072f;
            boolean z10 = false;
            if ((4 & i11) != 0) {
                if (!((11 & i11) != 0)) {
                    int i12 = i0.j.f5171a;
                    j.a.a("RV PartialInvalidate");
                    i0();
                    T();
                    this.f1914v.j();
                    if (!this.N) {
                        int e10 = this.f1916w.e();
                        int i13 = 0;
                        while (true) {
                            if (i13 < e10) {
                                a0 K = K(this.f1916w.d(i13));
                                if (K != null && !K.u() && K.p()) {
                                    z10 = true;
                                    break;
                                }
                                i13++;
                            } else {
                                break;
                            }
                        }
                        if (z10) {
                            q();
                        } else {
                            this.f1914v.b();
                        }
                    }
                    k0(true);
                    U(true);
                    j.a.b();
                }
            }
            if (!aVar.g()) {
                return;
            }
            int i14 = i0.j.f5171a;
            j.a.a("RV FullInvalidate");
            q();
            j.a.b();
        }
    }

    public final void o(int i10, int i11) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap<View, f0> weakHashMap = m0.z.f5921a;
        setMeasuredDimension(m.h(i10, paddingRight, z.d.e(this)), m.h(i11, getPaddingBottom() + getPaddingTop(), z.d.d(this)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.V = 0;
        this.J = true;
        this.L = this.L && !isLayoutRequested();
        m mVar = this.E;
        if (mVar != null) {
            mVar.f1962i = true;
        }
        this.D0 = false;
        ThreadLocal<androidx.recyclerview.widget.m> threadLocal = androidx.recyclerview.widget.m.f2178w;
        androidx.recyclerview.widget.m mVar2 = threadLocal.get();
        this.f1915v0 = mVar2;
        if (mVar2 == null) {
            this.f1915v0 = new androidx.recyclerview.widget.m();
            WeakHashMap<View, f0> weakHashMap = m0.z.f5921a;
            Display b10 = z.e.b(this);
            float f10 = 60.0f;
            if (!isInEditMode() && b10 != null) {
                float refreshRate = b10.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f10 = refreshRate;
                }
            }
            androidx.recyclerview.widget.m mVar3 = this.f1915v0;
            mVar3.f2182u = 1.0E9f / f10;
            threadLocal.set(mVar3);
        }
        this.f1915v0.f2180s.add(this);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List<androidx.recyclerview.widget.RecyclerView$a0>, java.util.ArrayList] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j jVar = this.f1895f0;
        if (jVar != null) {
            jVar.f();
        }
        m0();
        this.J = false;
        m mVar = this.E;
        if (mVar != null) {
            mVar.f1962i = false;
            mVar.W(this);
        }
        this.L0.clear();
        removeCallbacks(this.M0);
        Objects.requireNonNull(this.f1918x);
        do {
        } while (c0.a.f2097d.a() != null);
        androidx.recyclerview.widget.m mVar2 = this.f1915v0;
        if (mVar2 != null) {
            mVar2.f2180s.remove(this);
            this.f1915v0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.G.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.G.get(i10).e(canvas, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$m r0 = r5.E
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.O
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L77
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView$m r0 = r5.E
            boolean r0 = r0.f()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.RecyclerView$m r3 = r5.E
            boolean r3 = r3.e()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$m r3 = r5.E
            boolean r3 = r3.f()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.RecyclerView$m r3 = r5.E
            boolean r3 = r3.e()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L77
        L6c:
            float r2 = r5.f1907r0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f1909s0
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.d0(r2, r0, r6)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr;
        if (this.O) {
            return false;
        }
        this.I = null;
        if (D(motionEvent)) {
            j();
            return true;
        }
        m mVar = this.E;
        if (mVar == null) {
            return false;
        }
        boolean e10 = mVar.e();
        boolean f10 = this.E.f();
        if (this.f1898i0 == null) {
            this.f1898i0 = VelocityTracker.obtain();
        }
        this.f1898i0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.P) {
                this.P = false;
            }
            this.f1897h0 = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.f1901l0 = x10;
            this.f1899j0 = x10;
            int y3 = (int) (motionEvent.getY() + 0.5f);
            this.f1902m0 = y3;
            this.f1900k0 = y3;
            if (this.f1896g0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                l0(1);
            }
            int[] iArr = this.J0;
            iArr[1] = 0;
            iArr[0] = 0;
            if (f10) {
                boolean z10 = e10 ? 1 : 0;
                char c10 = e10 ? 1 : 0;
                e10 = z10 | true;
            }
            int i10 = e10 ? 1 : 0;
            int i11 = e10 ? 1 : 0;
            j0(i10, 0);
        } else if (actionMasked == 1) {
            this.f1898i0.clear();
            l0(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f1897h0);
            if (findPointerIndex < 0) {
                StringBuilder c11 = androidx.activity.result.a.c("Error processing scroll; pointer index for id ");
                c11.append(this.f1897h0);
                c11.append(" not found. Did any MotionEvents get skipped?");
                Log.e("RecyclerView", c11.toString());
                return false;
            }
            int x11 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y10 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f1896g0 != 1) {
                int i12 = x11 - this.f1899j0;
                int i13 = y10 - this.f1900k0;
                if (!e10 || Math.abs(i12) <= this.f1903n0) {
                    objArr = null;
                } else {
                    this.f1901l0 = x11;
                    objArr = 1;
                }
                if (f10 && Math.abs(i13) > this.f1903n0) {
                    this.f1902m0 = y10;
                    objArr = 1;
                }
                if (objArr != null) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            j();
        } else if (actionMasked == 5) {
            this.f1897h0 = motionEvent.getPointerId(actionIndex);
            int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f1901l0 = x12;
            this.f1899j0 = x12;
            int y11 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f1902m0 = y11;
            this.f1900k0 = y11;
        } else if (actionMasked == 6) {
            V(motionEvent);
        }
        return this.f1896g0 == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i0.j.f5171a;
        j.a.a("RV OnLayout");
        q();
        j.a.b();
        this.L = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        m mVar = this.E;
        if (mVar == null) {
            o(i10, i11);
            return;
        }
        boolean z10 = false;
        if (mVar.R()) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.E.i0(i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            if (z10 || this.D == null) {
                return;
            }
            if (this.x0.f2014d == 1) {
                r();
            }
            this.E.x0(i10, i11);
            this.x0.f2019i = true;
            s();
            this.E.A0(i10, i11);
            if (!this.E.D0()) {
                return;
            }
            this.E.x0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            this.x0.f2019i = true;
            s();
            this.E.A0(i10, i11);
        } else if (this.K) {
            this.E.i0(i10, i11);
        } else {
            if (this.R) {
                i0();
                T();
                X();
                U(true);
                x xVar = this.x0;
                if (xVar.f2021k) {
                    xVar.f2017g = true;
                } else {
                    this.f1914v.c();
                    this.x0.f2017g = false;
                }
                this.R = false;
                k0(false);
            } else if (this.x0.f2021k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            e eVar = this.D;
            if (eVar != null) {
                this.x0.f2015e = eVar.a();
            } else {
                this.x0.f2015e = 0;
            }
            i0();
            this.E.i0(i10, i11);
            k0(false);
            this.x0.f2017g = false;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (P()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof v)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        v vVar = (v) parcelable;
        this.f1912u = vVar;
        super.onRestoreInstanceState(vVar.f17592s);
        m mVar = this.E;
        if (mVar == null || (parcelable2 = this.f1912u.f1995u) == null) {
            return;
        }
        mVar.j0(parcelable2);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        v vVar = new v(super.onSaveInstanceState());
        v vVar2 = this.f1912u;
        if (vVar2 != null) {
            vVar.f1995u = vVar2.f1995u;
        } else {
            m mVar = this.E;
            vVar.f1995u = mVar != null ? mVar.k0() : null;
        }
        return vVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        N();
    }

    /* JADX WARN: Code restructure failed: missing block: B:210:0x0339, code lost:
        if (r0 < r3) goto L212;
     */
    /* JADX WARN: Removed duplicated region for block: B:214:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 1024
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(View view) {
        a0 K = K(view);
        e eVar = this.D;
        if (eVar == null || K == null) {
            return;
        }
        Objects.requireNonNull(eVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x02f4, code lost:
        if (r15.f1916w.k(getFocusedChild()) == false) goto L201;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q() {
        /*
            Method dump skipped, instructions count: 962
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.q():void");
    }

    public final void r() {
        int id;
        View C;
        this.x0.a(1);
        B(this.x0);
        this.x0.f2019i = false;
        i0();
        c0 c0Var = this.f1918x;
        c0Var.f2095a.clear();
        c0Var.f2096b.b();
        T();
        X();
        View focusedChild = (!this.f1911t0 || !hasFocus() || this.D == null) ? null : getFocusedChild();
        a0 J = (focusedChild == null || (C = C(focusedChild)) == null) ? null : J(C);
        long j3 = -1;
        if (J == null) {
            x xVar = this.x0;
            xVar.f2023m = -1L;
            xVar.f2022l = -1;
            xVar.f2024n = -1;
        } else {
            x xVar2 = this.x0;
            if (this.D.f1944b) {
                j3 = J.f1928e;
            }
            xVar2.f2023m = j3;
            xVar2.f2022l = this.T ? -1 : J.m() ? J.f1927d : J.e();
            x xVar3 = this.x0;
            View view = J.f1924a;
            loop0: while (true) {
                id = view.getId();
                while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                    view = ((ViewGroup) view).getFocusedChild();
                    if (view.getId() != -1) {
                        break;
                    }
                }
            }
            xVar3.f2024n = id;
        }
        x xVar4 = this.x0;
        xVar4.f2018h = xVar4.f2020j && this.B0;
        this.B0 = false;
        this.A0 = false;
        xVar4.f2017g = xVar4.f2021k;
        xVar4.f2015e = this.D.a();
        E(this.G0);
        if (this.x0.f2020j) {
            int e10 = this.f1916w.e();
            for (int i10 = 0; i10 < e10; i10++) {
                a0 K = K(this.f1916w.d(i10));
                if (!K.u() && (!K.k() || this.D.f1944b)) {
                    j jVar = this.f1895f0;
                    j.b(K);
                    K.g();
                    Objects.requireNonNull(jVar);
                    j.c cVar = new j.c();
                    cVar.a(K);
                    this.f1918x.c(K, cVar);
                    if (this.x0.f2018h && K.p() && !K.m() && !K.u() && !K.k()) {
                        this.f1918x.f2096b.f(I(K), K);
                    }
                }
            }
        }
        if (this.x0.f2021k) {
            int h10 = this.f1916w.h();
            for (int i11 = 0; i11 < h10; i11++) {
                a0 K2 = K(this.f1916w.g(i11));
                if (!K2.u() && K2.f1927d == -1) {
                    K2.f1927d = K2.f1926c;
                }
            }
            x xVar5 = this.x0;
            boolean z10 = xVar5.f2016f;
            xVar5.f2016f = false;
            this.E.g0(this.f1910t, xVar5);
            this.x0.f2016f = z10;
            for (int i12 = 0; i12 < this.f1916w.e(); i12++) {
                a0 K3 = K(this.f1916w.d(i12));
                if (!K3.u()) {
                    c0.a orDefault = this.f1918x.f2095a.getOrDefault(K3, null);
                    if (!((orDefault == null || (orDefault.f2098a & 4) == 0) ? false : true)) {
                        j.b(K3);
                        boolean h11 = K3.h(8192);
                        j jVar2 = this.f1895f0;
                        K3.g();
                        Objects.requireNonNull(jVar2);
                        j.c cVar2 = new j.c();
                        cVar2.a(K3);
                        if (h11) {
                            Z(K3, cVar2);
                        } else {
                            c0 c0Var2 = this.f1918x;
                            c0.a orDefault2 = c0Var2.f2095a.getOrDefault(K3, null);
                            if (orDefault2 == null) {
                                orDefault2 = c0.a.a();
                                c0Var2.f2095a.put(K3, orDefault2);
                            }
                            orDefault2.f2098a |= 2;
                            orDefault2.f2099b = cVar2;
                        }
                    }
                }
            }
        }
        l();
        U(true);
        k0(false);
        this.x0.f2014d = 2;
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z10) {
        a0 K = K(view);
        if (K != null) {
            if (K.o()) {
                K.f1933j &= -257;
            } else if (!K.u()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(K);
                throw new IllegalArgumentException(androidx.activity.result.a.b(this, sb));
            }
        }
        view.clearAnimation();
        p(view);
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        w wVar = this.E.f1960g;
        boolean z10 = true;
        if (!(wVar != null && wVar.f2000e) && !P()) {
            z10 = false;
        }
        if (!z10 && view2 != null) {
            b0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.E.r0(this, view, rect, z10, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.H.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.H.get(i10).c();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.M != 0 || this.O) {
            this.N = true;
        } else {
            super.requestLayout();
        }
    }

    public final void s() {
        i0();
        T();
        this.x0.a(6);
        this.f1914v.c();
        this.x0.f2015e = this.D.a();
        x xVar = this.x0;
        xVar.f2013c = 0;
        xVar.f2017g = false;
        this.E.g0(this.f1910t, xVar);
        x xVar2 = this.x0;
        xVar2.f2016f = false;
        this.f1912u = null;
        xVar2.f2020j = xVar2.f2020j && this.f1895f0 != null;
        xVar2.f2014d = 4;
        U(true);
        k0(false);
    }

    @Override // android.view.View
    public final void scrollBy(int i10, int i11) {
        m mVar = this.E;
        if (mVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.O) {
        } else {
            boolean e10 = mVar.e();
            boolean f10 = this.E.f();
            if (!e10 && !f10) {
                return;
            }
            if (!e10) {
                i10 = 0;
            }
            if (!f10) {
                i11 = 0;
            }
            d0(i10, i11, null);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i10 = 0;
        if (P()) {
            int a10 = accessibilityEvent != null ? n0.b.a(accessibilityEvent) : 0;
            if (a10 != 0) {
                i10 = a10;
            }
            this.Q |= i10;
            i10 = 1;
        }
        if (i10 != 0) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.x xVar) {
        this.E0 = xVar;
        m0.z.p(this, xVar);
    }

    public void setAdapter(e eVar) {
        setLayoutFrozen(false);
        e eVar2 = this.D;
        if (eVar2 != null) {
            eVar2.f1943a.unregisterObserver(this.f1908s);
            Objects.requireNonNull(this.D);
        }
        a0();
        androidx.recyclerview.widget.a aVar = this.f1914v;
        aVar.l(aVar.f2068b);
        aVar.l(aVar.f2069c);
        aVar.f2072f = 0;
        e eVar3 = this.D;
        this.D = eVar;
        if (eVar != null) {
            eVar.f1943a.registerObserver(this.f1908s);
        }
        s sVar = this.f1910t;
        e eVar4 = this.D;
        sVar.b();
        r d5 = sVar.d();
        Objects.requireNonNull(d5);
        if (eVar3 != null) {
            d5.f1981b--;
        }
        if (d5.f1981b == 0) {
            for (int i10 = 0; i10 < d5.f1980a.size(); i10++) {
                d5.f1980a.valueAt(i10).f1982a.clear();
            }
        }
        if (eVar4 != null) {
            d5.f1981b++;
        }
        this.x0.f2016f = true;
        Y(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(h hVar) {
        if (hVar == this.F0) {
            return;
        }
        this.F0 = hVar;
        setChildrenDrawingOrderEnabled(hVar != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.y) {
            N();
        }
        this.y = z10;
        super.setClipToPadding(z10);
        if (this.L) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(i iVar) {
        Objects.requireNonNull(iVar);
        this.f1890a0 = iVar;
        N();
    }

    public void setHasFixedSize(boolean z10) {
        this.K = z10;
    }

    public void setItemAnimator(j jVar) {
        j jVar2 = this.f1895f0;
        if (jVar2 != null) {
            jVar2.f();
            this.f1895f0.f1945a = null;
        }
        this.f1895f0 = jVar;
        if (jVar != null) {
            jVar.f1945a = this.C0;
        }
    }

    public void setItemViewCacheSize(int i10) {
        s sVar = this.f1910t;
        sVar.f1990e = i10;
        sVar.l();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List<android.view.View>, java.util.ArrayList] */
    public void setLayoutManager(m mVar) {
        if (mVar == this.E) {
            return;
        }
        m0();
        if (this.E != null) {
            j jVar = this.f1895f0;
            if (jVar != null) {
                jVar.f();
            }
            this.E.m0(this.f1910t);
            this.E.n0(this.f1910t);
            this.f1910t.b();
            if (this.J) {
                m mVar2 = this.E;
                mVar2.f1962i = false;
                mVar2.W(this);
            }
            this.E.B0(null);
            this.E = null;
        } else {
            this.f1910t.b();
        }
        androidx.recyclerview.widget.b bVar = this.f1916w;
        b.a aVar = bVar.f2082b;
        aVar.f2084a = 0L;
        b.a aVar2 = aVar.f2085b;
        if (aVar2 != null) {
            aVar2.g();
        }
        int size = bVar.f2083c.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            androidx.recyclerview.widget.v vVar = (androidx.recyclerview.widget.v) bVar.f2081a;
            Objects.requireNonNull(vVar);
            a0 K = K((View) bVar.f2083c.get(size));
            if (K != null) {
                vVar.f2216a.g0(K, K.p);
                K.p = 0;
            }
            bVar.f2083c.remove(size);
        }
        androidx.recyclerview.widget.v vVar2 = (androidx.recyclerview.widget.v) bVar.f2081a;
        int b10 = vVar2.b();
        for (int i10 = 0; i10 < b10; i10++) {
            View a10 = vVar2.a(i10);
            vVar2.f2216a.p(a10);
            a10.clearAnimation();
        }
        vVar2.f2216a.removeAllViews();
        this.E = mVar;
        if (mVar != null) {
            if (mVar.f1955b != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("LayoutManager ");
                sb.append(mVar);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(androidx.activity.result.a.b(mVar.f1955b, sb));
            }
            mVar.B0(this);
            if (this.J) {
                this.E.f1962i = true;
            }
        }
        this.f1910t.l();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        m0.m scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f5913d) {
            View view = scrollingChildHelper.f5912c;
            WeakHashMap<View, f0> weakHashMap = m0.z.f5921a;
            z.i.z(view);
        }
        scrollingChildHelper.f5913d = z10;
    }

    public void setOnFlingListener(o oVar) {
        this.f1904o0 = oVar;
    }

    @Deprecated
    public void setOnScrollListener(q qVar) {
        this.f1919y0 = qVar;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.f1911t0 = z10;
    }

    public void setRecycledViewPool(r rVar) {
        r rVar2;
        s sVar = this.f1910t;
        if (sVar.f1992g != null) {
            rVar2.f1981b--;
        }
        sVar.f1992g = rVar;
        if (rVar == null || RecyclerView.this.getAdapter() == null) {
            return;
        }
        sVar.f1992g.f1981b++;
    }

    public void setRecyclerListener(t tVar) {
        this.F = tVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List<androidx.recyclerview.widget.RecyclerView$q>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<androidx.recyclerview.widget.RecyclerView$q>, java.util.ArrayList] */
    void setScrollState(int i10) {
        w wVar;
        if (i10 == this.f1896g0) {
            return;
        }
        this.f1896g0 = i10;
        if (i10 != 2) {
            this.f1913u0.c();
            m mVar = this.E;
            if (mVar != null && (wVar = mVar.f1960g) != null) {
                wVar.d();
            }
        }
        m mVar2 = this.E;
        if (mVar2 != null) {
            mVar2.l0(i10);
        }
        q qVar = this.f1919y0;
        if (qVar != null) {
            qVar.a(this, i10);
        }
        ?? r02 = this.f1921z0;
        if (r02 == 0) {
            return;
        }
        int size = r02.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            ((q) this.f1921z0.get(size)).a(this, i10);
        }
    }

    public void setScrollingTouchSlop(int i10) {
        int i11;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 == 1) {
                i11 = viewConfiguration.getScaledPagingTouchSlop();
                this.f1903n0 = i11;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
        }
        i11 = viewConfiguration.getScaledTouchSlop();
        this.f1903n0 = i11;
    }

    public void setViewCacheExtension(y yVar) {
        Objects.requireNonNull(this.f1910t);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().h(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().i(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        if (z10 != this.O) {
            i("Do not suppressLayout in layout or scroll");
            if (z10) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.O = true;
                this.P = true;
                m0();
                return;
            }
            this.O = false;
            if (this.N && this.E != null && this.D != null) {
                requestLayout();
            }
            this.N = false;
        }
    }

    public final boolean t(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().c(i10, i11, iArr, null, 1);
    }

    public final void u(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().e(i10, i11, i12, i13, null, 1, iArr2);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List<androidx.recyclerview.widget.RecyclerView$q>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List<androidx.recyclerview.widget.RecyclerView$q>, java.util.ArrayList] */
    public final void v(int i10, int i11) {
        this.W++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        q qVar = this.f1919y0;
        if (qVar != null) {
            qVar.b(this, i10, i11);
        }
        ?? r02 = this.f1921z0;
        if (r02 != 0) {
            int size = r02.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((q) this.f1921z0.get(size)).b(this, i10, i11);
            }
        }
        this.W--;
    }

    public final void w() {
        int i10;
        int i11;
        if (this.f1894e0 != null) {
            return;
        }
        EdgeEffect a10 = this.f1890a0.a(this);
        this.f1894e0 = a10;
        if (this.y) {
            i11 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            i10 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            i11 = getMeasuredWidth();
            i10 = getMeasuredHeight();
        }
        a10.setSize(i11, i10);
    }

    public final void x() {
        int i10;
        int i11;
        if (this.f1891b0 != null) {
            return;
        }
        EdgeEffect a10 = this.f1890a0.a(this);
        this.f1891b0 = a10;
        if (this.y) {
            i11 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            i10 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            i11 = getMeasuredHeight();
            i10 = getMeasuredWidth();
        }
        a10.setSize(i11, i10);
    }

    public final void y() {
        int i10;
        int i11;
        if (this.f1893d0 != null) {
            return;
        }
        EdgeEffect a10 = this.f1890a0.a(this);
        this.f1893d0 = a10;
        if (this.y) {
            i11 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            i10 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            i11 = getMeasuredHeight();
            i10 = getMeasuredWidth();
        }
        a10.setSize(i11, i10);
    }

    public final void z() {
        int i10;
        int i11;
        if (this.f1892c0 != null) {
            return;
        }
        EdgeEffect a10 = this.f1890a0.a(this);
        this.f1892c0 = a10;
        if (this.y) {
            i11 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            i10 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            i11 = getMeasuredWidth();
            i10 = getMeasuredHeight();
        }
        a10.setSize(i11, i10);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        m mVar = this.E;
        if (mVar != null) {
            return mVar.v(layoutParams);
        }
        throw new IllegalStateException(androidx.activity.result.a.b(this, androidx.activity.result.a.c("RecyclerView has no LayoutManager")));
    }
}
