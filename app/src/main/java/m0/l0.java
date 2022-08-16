package m0;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;
import m0.d;
import m0.z;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: b */
    public static final l0 f5880b;

    /* renamed from: a */
    public final k f5881a;

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public static Field f5882a;

        /* renamed from: b */
        public static Field f5883b;

        /* renamed from: c */
        public static Field f5884c;

        /* renamed from: d */
        public static boolean f5885d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f5882a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f5883b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f5884c = declaredField3;
                declaredField3.setAccessible(true);
                f5885d = true;
            } catch (ReflectiveOperationException e10) {
                StringBuilder c10 = androidx.activity.result.a.c("Failed to get visible insets from AttachInfo ");
                c10.append(e10.getMessage());
                Log.w("WindowInsetsCompat", c10.toString(), e10);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends e {

        /* renamed from: d */
        public static Field f5886d = null;

        /* renamed from: e */
        public static boolean f5887e = false;

        /* renamed from: f */
        public static Constructor<WindowInsets> f5888f = null;

        /* renamed from: g */
        public static boolean f5889g = false;

        /* renamed from: b */
        public WindowInsets f5890b;

        /* renamed from: c */
        public e0.b f5891c;

        public b() {
            this.f5890b = e();
        }

        public b(l0 l0Var) {
            super(l0Var);
            this.f5890b = l0Var.k();
        }

        private static WindowInsets e() {
            if (!f5887e) {
                try {
                    f5886d = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f5887e = true;
            }
            Field field = f5886d;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!f5889g) {
                try {
                    f5888f = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f5889g = true;
            }
            Constructor<WindowInsets> constructor = f5888f;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        @Override // m0.l0.e
        public l0 b() {
            a();
            l0 l10 = l0.l(this.f5890b, null);
            l10.f5881a.o(null);
            l10.f5881a.q(this.f5891c);
            return l10;
        }

        @Override // m0.l0.e
        public void c(e0.b bVar) {
            this.f5891c = bVar;
        }

        @Override // m0.l0.e
        public void d(e0.b bVar) {
            WindowInsets windowInsets = this.f5890b;
            if (windowInsets != null) {
                this.f5890b = windowInsets.replaceSystemWindowInsets(bVar.f4311a, bVar.f4312b, bVar.f4313c, bVar.f4314d);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends e {

        /* renamed from: b */
        public final WindowInsets.Builder f5892b;

        public c() {
            this.f5892b = new WindowInsets.Builder();
        }

        public c(l0 l0Var) {
            super(l0Var);
            WindowInsets k10 = l0Var.k();
            this.f5892b = k10 != null ? new WindowInsets.Builder(k10) : new WindowInsets.Builder();
        }

        @Override // m0.l0.e
        public l0 b() {
            a();
            l0 l10 = l0.l(this.f5892b.build(), null);
            l10.f5881a.o(null);
            return l10;
        }

        @Override // m0.l0.e
        public void c(e0.b bVar) {
            this.f5892b.setStableInsets(bVar.e());
        }

        @Override // m0.l0.e
        public void d(e0.b bVar) {
            this.f5892b.setSystemWindowInsets(bVar.e());
        }
    }

    /* loaded from: classes.dex */
    public static class d extends c {
        public d() {
        }

        public d(l0 l0Var) {
            super(l0Var);
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a */
        public final l0 f5893a;

        public e() {
            this(new l0());
        }

        public e(l0 l0Var) {
            this.f5893a = l0Var;
        }

        public final void a() {
        }

        public l0 b() {
            throw null;
        }

        public void c(e0.b bVar) {
            throw null;
        }

        public void d(e0.b bVar) {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public static class f extends k {

        /* renamed from: h */
        public static boolean f5894h = false;

        /* renamed from: i */
        public static Method f5895i;

        /* renamed from: j */
        public static Class<?> f5896j;

        /* renamed from: k */
        public static Field f5897k;

        /* renamed from: l */
        public static Field f5898l;

        /* renamed from: c */
        public final WindowInsets f5899c;

        /* renamed from: d */
        public e0.b[] f5900d;

        /* renamed from: e */
        public e0.b f5901e = null;

        /* renamed from: f */
        public l0 f5902f;

        /* renamed from: g */
        public e0.b f5903g;

        public f(l0 l0Var, WindowInsets windowInsets) {
            super(l0Var);
            this.f5899c = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        private e0.b r(int i10, boolean z10) {
            e0.b bVar = e0.b.f4310e;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    bVar = e0.b.a(bVar, s(i11, z10));
                }
            }
            return bVar;
        }

        private e0.b t() {
            l0 l0Var = this.f5902f;
            if (l0Var != null) {
                return l0Var.f5881a.h();
            }
            return e0.b.f4310e;
        }

        private e0.b u(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f5894h) {
                    v();
                }
                Method method = f5895i;
                if (method != null && f5896j != null && f5897k != null) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f5897k.get(f5898l.get(invoke));
                        if (rect == null) {
                            return null;
                        }
                        return e0.b.c(rect);
                    } catch (ReflectiveOperationException e10) {
                        StringBuilder c10 = androidx.activity.result.a.c("Failed to get visible insets. (Reflection error). ");
                        c10.append(e10.getMessage());
                        Log.e("WindowInsetsCompat", c10.toString(), e10);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @SuppressLint({"PrivateApi"})
        private static void v() {
            try {
                f5895i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f5896j = cls;
                f5897k = cls.getDeclaredField("mVisibleInsets");
                f5898l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f5897k.setAccessible(true);
                f5898l.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                StringBuilder c10 = androidx.activity.result.a.c("Failed to get visible insets. (Reflection error). ");
                c10.append(e10.getMessage());
                Log.e("WindowInsetsCompat", c10.toString(), e10);
            }
            f5894h = true;
        }

        @Override // m0.l0.k
        public void d(View view) {
            e0.b u10 = u(view);
            if (u10 == null) {
                u10 = e0.b.f4310e;
            }
            w(u10);
        }

        @Override // m0.l0.k
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f5903g, ((f) obj).f5903g);
        }

        @Override // m0.l0.k
        public e0.b f(int i10) {
            return r(i10, false);
        }

        @Override // m0.l0.k
        public final e0.b j() {
            if (this.f5901e == null) {
                this.f5901e = e0.b.b(this.f5899c.getSystemWindowInsetLeft(), this.f5899c.getSystemWindowInsetTop(), this.f5899c.getSystemWindowInsetRight(), this.f5899c.getSystemWindowInsetBottom());
            }
            return this.f5901e;
        }

        @Override // m0.l0.k
        public l0 l(int i10, int i11, int i12, int i13) {
            l0 l10 = l0.l(this.f5899c, null);
            int i14 = Build.VERSION.SDK_INT;
            e dVar = i14 >= 30 ? new d(l10) : i14 >= 29 ? new c(l10) : new b(l10);
            dVar.d(l0.g(j(), i10, i11, i12, i13));
            dVar.c(l0.g(h(), i10, i11, i12, i13));
            return dVar.b();
        }

        @Override // m0.l0.k
        public boolean n() {
            return this.f5899c.isRound();
        }

        @Override // m0.l0.k
        public void o(e0.b[] bVarArr) {
            this.f5900d = bVarArr;
        }

        @Override // m0.l0.k
        public void p(l0 l0Var) {
            this.f5902f = l0Var;
        }

        public e0.b s(int i10, boolean z10) {
            int i11;
            m0.d dVar;
            int i12 = 0;
            if (i10 == 1) {
                return z10 ? e0.b.b(0, Math.max(t().f4312b, j().f4312b), 0, 0) : e0.b.b(0, j().f4312b, 0, 0);
            }
            e0.b bVar = null;
            if (i10 == 2) {
                if (z10) {
                    e0.b t10 = t();
                    e0.b h10 = h();
                    return e0.b.b(Math.max(t10.f4311a, h10.f4311a), 0, Math.max(t10.f4313c, h10.f4313c), Math.max(t10.f4314d, h10.f4314d));
                }
                e0.b j3 = j();
                l0 l0Var = this.f5902f;
                if (l0Var != null) {
                    bVar = l0Var.f5881a.h();
                }
                int i13 = j3.f4314d;
                if (bVar != null) {
                    i13 = Math.min(i13, bVar.f4314d);
                }
                return e0.b.b(j3.f4311a, 0, j3.f4313c, i13);
            } else if (i10 == 8) {
                e0.b[] bVarArr = this.f5900d;
                if (bVarArr != null) {
                    bVar = bVarArr[3];
                }
                if (bVar != null) {
                    return bVar;
                }
                e0.b j10 = j();
                e0.b t11 = t();
                int i14 = j10.f4314d;
                if (i14 > t11.f4314d) {
                    return e0.b.b(0, 0, 0, i14);
                }
                e0.b bVar2 = this.f5903g;
                return (bVar2 == null || bVar2.equals(e0.b.f4310e) || (i11 = this.f5903g.f4314d) <= t11.f4314d) ? e0.b.f4310e : e0.b.b(0, 0, 0, i11);
            } else if (i10 == 16) {
                return i();
            } else {
                if (i10 == 32) {
                    return g();
                }
                if (i10 == 64) {
                    return k();
                }
                if (i10 != 128) {
                    return e0.b.f4310e;
                }
                l0 l0Var2 = this.f5902f;
                if (l0Var2 != null) {
                    dVar = l0Var2.f5881a.e();
                } else {
                    dVar = e();
                }
                if (dVar == null) {
                    return e0.b.f4310e;
                }
                int i15 = Build.VERSION.SDK_INT;
                int d5 = i15 >= 28 ? d.a.d(dVar.f5866a) : 0;
                int f10 = i15 >= 28 ? d.a.f(dVar.f5866a) : 0;
                int e10 = i15 >= 28 ? d.a.e(dVar.f5866a) : 0;
                if (i15 >= 28) {
                    i12 = d.a.c(dVar.f5866a);
                }
                return e0.b.b(d5, f10, e10, i12);
            }
        }

        public void w(e0.b bVar) {
            this.f5903g = bVar;
        }
    }

    /* loaded from: classes.dex */
    public static class g extends f {

        /* renamed from: m */
        public e0.b f5904m = null;

        public g(l0 l0Var, WindowInsets windowInsets) {
            super(l0Var, windowInsets);
        }

        @Override // m0.l0.k
        public l0 b() {
            return l0.l(this.f5899c.consumeStableInsets(), null);
        }

        @Override // m0.l0.k
        public l0 c() {
            return l0.l(this.f5899c.consumeSystemWindowInsets(), null);
        }

        @Override // m0.l0.k
        public final e0.b h() {
            if (this.f5904m == null) {
                this.f5904m = e0.b.b(this.f5899c.getStableInsetLeft(), this.f5899c.getStableInsetTop(), this.f5899c.getStableInsetRight(), this.f5899c.getStableInsetBottom());
            }
            return this.f5904m;
        }

        @Override // m0.l0.k
        public boolean m() {
            return this.f5899c.isConsumed();
        }

        @Override // m0.l0.k
        public void q(e0.b bVar) {
            this.f5904m = bVar;
        }
    }

    /* loaded from: classes.dex */
    public static class h extends g {
        public h(l0 l0Var, WindowInsets windowInsets) {
            super(l0Var, windowInsets);
        }

        @Override // m0.l0.k
        public l0 a() {
            return l0.l(this.f5899c.consumeDisplayCutout(), null);
        }

        @Override // m0.l0.k
        public m0.d e() {
            DisplayCutout displayCutout = this.f5899c.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new m0.d(displayCutout);
        }

        @Override // m0.l0.f, m0.l0.k
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Objects.equals(this.f5899c, hVar.f5899c) && Objects.equals(this.f5903g, hVar.f5903g);
        }

        @Override // m0.l0.k
        public int hashCode() {
            return this.f5899c.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static class i extends h {

        /* renamed from: n */
        public e0.b f5905n = null;

        /* renamed from: o */
        public e0.b f5906o = null;
        public e0.b p = null;

        public i(l0 l0Var, WindowInsets windowInsets) {
            super(l0Var, windowInsets);
        }

        @Override // m0.l0.k
        public e0.b g() {
            if (this.f5906o == null) {
                this.f5906o = e0.b.d(this.f5899c.getMandatorySystemGestureInsets());
            }
            return this.f5906o;
        }

        @Override // m0.l0.k
        public e0.b i() {
            if (this.f5905n == null) {
                this.f5905n = e0.b.d(this.f5899c.getSystemGestureInsets());
            }
            return this.f5905n;
        }

        @Override // m0.l0.k
        public e0.b k() {
            if (this.p == null) {
                this.p = e0.b.d(this.f5899c.getTappableElementInsets());
            }
            return this.p;
        }

        @Override // m0.l0.f, m0.l0.k
        public l0 l(int i10, int i11, int i12, int i13) {
            return l0.l(this.f5899c.inset(i10, i11, i12, i13), null);
        }

        @Override // m0.l0.g, m0.l0.k
        public void q(e0.b bVar) {
        }
    }

    /* loaded from: classes.dex */
    public static class j extends i {

        /* renamed from: q */
        public static final l0 f5907q = l0.l(WindowInsets.CONSUMED, null);

        public j(l0 l0Var, WindowInsets windowInsets) {
            super(l0Var, windowInsets);
        }

        @Override // m0.l0.f, m0.l0.k
        public final void d(View view) {
        }

        @Override // m0.l0.f, m0.l0.k
        public e0.b f(int i10) {
            return e0.b.d(this.f5899c.getInsets(l.a(i10)));
        }
    }

    /* loaded from: classes.dex */
    public static class k {

        /* renamed from: b */
        public static final l0 f5908b;

        /* renamed from: a */
        public final l0 f5909a;

        static {
            int i10 = Build.VERSION.SDK_INT;
            f5908b = (i10 >= 30 ? new d() : i10 >= 29 ? new c() : new b()).b().f5881a.a().f5881a.b().f5881a.c();
        }

        public k(l0 l0Var) {
            this.f5909a = l0Var;
        }

        public l0 a() {
            return this.f5909a;
        }

        public l0 b() {
            return this.f5909a;
        }

        public l0 c() {
            return this.f5909a;
        }

        public void d(View view) {
        }

        public m0.d e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return n() == kVar.n() && m() == kVar.m() && l0.b.a(j(), kVar.j()) && l0.b.a(h(), kVar.h()) && l0.b.a(e(), kVar.e());
        }

        public e0.b f(int i10) {
            return e0.b.f4310e;
        }

        public e0.b g() {
            return j();
        }

        public e0.b h() {
            return e0.b.f4310e;
        }

        public int hashCode() {
            return l0.b.b(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
        }

        public e0.b i() {
            return j();
        }

        public e0.b j() {
            return e0.b.f4310e;
        }

        public e0.b k() {
            return j();
        }

        public l0 l(int i10, int i11, int i12, int i13) {
            return f5908b;
        }

        public boolean m() {
            return false;
        }

        public boolean n() {
            return false;
        }

        public void o(e0.b[] bVarArr) {
        }

        public void p(l0 l0Var) {
        }

        public void q(e0.b bVar) {
        }
    }

    /* loaded from: classes.dex */
    public static final class l {
        public static int a(int i10) {
            int i11;
            int i12 = 0;
            for (int i13 = 1; i13 <= 256; i13 <<= 1) {
                if ((i10 & i13) != 0) {
                    if (i13 == 1) {
                        i11 = WindowInsets.Type.statusBars();
                    } else if (i13 == 2) {
                        i11 = WindowInsets.Type.navigationBars();
                    } else if (i13 == 4) {
                        i11 = WindowInsets.Type.captionBar();
                    } else if (i13 == 8) {
                        i11 = WindowInsets.Type.ime();
                    } else if (i13 == 16) {
                        i11 = WindowInsets.Type.systemGestures();
                    } else if (i13 == 32) {
                        i11 = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i13 == 64) {
                        i11 = WindowInsets.Type.tappableElement();
                    } else if (i13 == 128) {
                        i11 = WindowInsets.Type.displayCutout();
                    }
                    i12 |= i11;
                }
            }
            return i12;
        }
    }

    static {
        f5880b = Build.VERSION.SDK_INT >= 30 ? j.f5907q : k.f5908b;
    }

    public l0() {
        this.f5881a = new k(this);
    }

    public l0(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        this.f5881a = i10 >= 30 ? new j(this, windowInsets) : i10 >= 29 ? new i(this, windowInsets) : i10 >= 28 ? new h(this, windowInsets) : new g(this, windowInsets);
    }

    public static e0.b g(e0.b bVar, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, bVar.f4311a - i10);
        int max2 = Math.max(0, bVar.f4312b - i11);
        int max3 = Math.max(0, bVar.f4313c - i12);
        int max4 = Math.max(0, bVar.f4314d - i13);
        return (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) ? bVar : e0.b.b(max, max2, max3, max4);
    }

    public static l0 l(WindowInsets windowInsets, View view) {
        Objects.requireNonNull(windowInsets);
        l0 l0Var = new l0(windowInsets);
        if (view != null) {
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            if (z.g.b(view)) {
                l0Var.j(z.j.a(view));
                l0Var.a(view.getRootView());
            }
        }
        return l0Var;
    }

    public final void a(View view) {
        this.f5881a.d(view);
    }

    public final e0.b b(int i10) {
        return this.f5881a.f(i10);
    }

    @Deprecated
    public final int c() {
        return this.f5881a.j().f4314d;
    }

    @Deprecated
    public final int d() {
        return this.f5881a.j().f4311a;
    }

    @Deprecated
    public final int e() {
        return this.f5881a.j().f4313c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l0) {
            return l0.b.a(this.f5881a, ((l0) obj).f5881a);
        }
        return false;
    }

    @Deprecated
    public final int f() {
        return this.f5881a.j().f4312b;
    }

    public final boolean h() {
        return this.f5881a.m();
    }

    public final int hashCode() {
        k kVar = this.f5881a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }

    @Deprecated
    public final l0 i(int i10, int i11, int i12, int i13) {
        int i14 = Build.VERSION.SDK_INT;
        e dVar = i14 >= 30 ? new d(this) : i14 >= 29 ? new c(this) : new b(this);
        dVar.d(e0.b.b(i10, i11, i12, i13));
        return dVar.b();
    }

    public final void j(l0 l0Var) {
        this.f5881a.p(l0Var);
    }

    public final WindowInsets k() {
        k kVar = this.f5881a;
        if (kVar instanceof f) {
            return ((f) kVar).f5899c;
        }
        return null;
    }
}
