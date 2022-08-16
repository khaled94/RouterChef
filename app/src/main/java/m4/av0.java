package m4;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import k4.a;
import l3.s;
import n3.g1;
import n3.s1;

/* loaded from: classes.dex */
public final class av0 extends am0 {
    public final Context A;
    public final cv0 B;
    public final mc1 C;
    public final Map<String, Boolean> D = new HashMap();
    public final List<sh> E = new ArrayList();

    /* renamed from: i */
    public final Executor f6260i;

    /* renamed from: j */
    public final ev0 f6261j;

    /* renamed from: k */
    public final jv0 f6262k;

    /* renamed from: l */
    public final tv0 f6263l;

    /* renamed from: m */
    public final iv0 f6264m;

    /* renamed from: n */
    public final lv0 f6265n;

    /* renamed from: o */
    public final jd2<iy0> f6266o;
    public final jd2<gy0> p;

    /* renamed from: q */
    public final jd2<ky0> f6267q;

    /* renamed from: r */
    public final jd2<fy0> f6268r;

    /* renamed from: s */
    public final jd2<jy0> f6269s;

    /* renamed from: t */
    public lw0 f6270t;

    /* renamed from: u */
    public boolean f6271u;

    /* renamed from: v */
    public boolean f6272v;

    /* renamed from: w */
    public boolean f6273w;

    /* renamed from: x */
    public final o70 f6274x;
    public final w7 y;

    /* renamed from: z */
    public final o90 f6275z;

    public av0(zl0 zl0Var, Executor executor, ev0 ev0Var, jv0 jv0Var, tv0 tv0Var, iv0 iv0Var, lv0 lv0Var, jd2 jd2Var, jd2 jd2Var2, jd2 jd2Var3, jd2 jd2Var4, jd2 jd2Var5, o70 o70Var, w7 w7Var, o90 o90Var, Context context, cv0 cv0Var, mc1 mc1Var) {
        super(zl0Var);
        this.f6260i = executor;
        this.f6261j = ev0Var;
        this.f6262k = jv0Var;
        this.f6263l = tv0Var;
        this.f6264m = iv0Var;
        this.f6265n = lv0Var;
        this.f6266o = jd2Var;
        this.p = jd2Var2;
        this.f6267q = jd2Var3;
        this.f6268r = jd2Var4;
        this.f6269s = jd2Var5;
        this.f6274x = o70Var;
        this.y = w7Var;
        this.f6275z = o90Var;
        this.A = context;
        this.B = cv0Var;
        this.C = mc1Var;
    }

    public static boolean g(View view) {
        yr<Boolean> yrVar = es.f8203t6;
        jo joVar = jo.f10145d;
        if (!((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
        }
        s1 s1Var = s.B.f5789c;
        long a10 = s1.a(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), null)) {
            if (a10 >= ((Integer) joVar.f10148c.a(es.f8211u6)).intValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // m4.am0
    public final synchronized void a() {
        this.f6271u = true;
        this.f6260i.execute(new nb0(this, 1));
        super.a();
    }

    @Override // m4.am0
    public final void b() {
        this.f6260i.execute(new oh(this, 2));
        if (this.f6261j.h() != 7) {
            Executor executor = this.f6260i;
            jv0 jv0Var = this.f6262k;
            Objects.requireNonNull(jv0Var);
            executor.execute(new yu0(jv0Var, 0));
        }
        super.b();
    }

    public final void c(View view) {
        a s10 = this.f6261j.s();
        vd0 o10 = this.f6261j.o();
        if (!this.f6264m.b() || s10 == null || o10 == null || view == null) {
            return;
        }
        s.B.f5807v.d0(s10, view);
    }

    public final synchronized void d(Bundle bundle) {
        this.f6262k.j(bundle);
    }

    public final synchronized void e(lw0 lw0Var) {
        if (((Boolean) jo.f10145d.f10148c.a(es.f8066c1)).booleanValue()) {
            s1.f16555i.post(new vu0(this, lw0Var, 0));
        } else {
            i(lw0Var);
        }
    }

    public final synchronized void f(lw0 lw0Var) {
        if (((Boolean) jo.f10145d.f10148c.a(es.f8066c1)).booleanValue()) {
            s1.f16555i.post(new wu0(this, lw0Var, 0));
        } else {
            j(lw0Var);
        }
    }

    public final synchronized boolean h(Bundle bundle) {
        if (this.f6272v) {
            return true;
        }
        boolean a10 = this.f6262k.a(bundle);
        this.f6272v = a10;
        return a10;
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.List<m4.sh>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map<java.lang.String, java.lang.Boolean>, java.util.HashMap] */
    public final synchronized void i(lw0 lw0Var) {
        Iterator<String> keys;
        View view;
        s7 s7Var;
        if (this.f6271u) {
            return;
        }
        this.f6270t = lw0Var;
        tv0 tv0Var = this.f6263l;
        tv0Var.f14176g.execute(new mz(tv0Var, lw0Var, 1));
        this.f6262k.r(lw0Var.d(), lw0Var.o(), lw0Var.j(), lw0Var, lw0Var);
        yr<Boolean> yrVar = es.G1;
        jo joVar = jo.f10145d;
        if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue() && (s7Var = this.y.f14875b) != null) {
            s7Var.b(lw0Var.d());
        }
        if (((Boolean) joVar.f10148c.a(es.f8081e1)).booleanValue()) {
            cm1 cm1Var = this.f6191b;
            if (cm1Var.f7049i0 && (keys = cm1Var.f7047h0.keys()) != null) {
                while (keys.hasNext()) {
                    String next = keys.next();
                    WeakReference<View> weakReference = this.f6270t.l().get(next);
                    this.D.put(next, Boolean.FALSE);
                    if (weakReference != null && (view = weakReference.get()) != null) {
                        sh shVar = new sh(this.A, view);
                        this.E.add(shVar);
                        shVar.b(new zu0(this, next));
                    }
                }
            }
        }
        if (lw0Var.h() == null) {
            return;
        }
        lw0Var.h().b(this.f6274x);
    }

    public final void j(lw0 lw0Var) {
        jv0 jv0Var = this.f6262k;
        View d5 = lw0Var.d();
        lw0Var.l();
        jv0Var.m(d5);
        if (lw0Var.f() != null) {
            lw0Var.f().setClickable(false);
            lw0Var.f().removeAllViews();
        }
        if (lw0Var.h() != null) {
            sh h10 = lw0Var.h();
            h10.D.remove(this.f6274x);
        }
        this.f6270t = null;
    }

    public final void k(String str, boolean z10) {
        String str2;
        z30 z30Var;
        a40 a40Var;
        String str3;
        if (!this.f6264m.b() || TextUtils.isEmpty(str)) {
            return;
        }
        vd0 o10 = this.f6261j.o();
        vd0 p = this.f6261j.p();
        if (o10 == null && p == null) {
            return;
        }
        if (o10 != null) {
            str2 = null;
        } else {
            str2 = "javascript";
            o10 = p;
        }
        String str4 = str2;
        s sVar = s.B;
        if (!sVar.f5807v.g0(this.A)) {
            str3 = "Failed to initialize omid in InternalNativeAd";
        } else {
            o90 o90Var = this.f6275z;
            int i10 = o90Var.f12052t;
            int i11 = o90Var.f12053u;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i10);
            sb.append(".");
            sb.append(i11);
            String sb2 = sb.toString();
            if (p != null) {
                z30Var = z30.VIDEO;
                a40Var = a40.DEFINED_BY_JAVASCRIPT;
            } else {
                z30Var = z30.NATIVE_DISPLAY;
                a40Var = this.f6261j.h() == 3 ? a40.UNSPECIFIED : a40.ONE_PIXEL;
            }
            a c02 = sVar.f5807v.c0(sb2, o10.E(), str4, str, a40Var, z30Var, this.f6191b.f7051j0);
            if (c02 != null) {
                ev0 ev0Var = this.f6261j;
                synchronized (ev0Var) {
                    ev0Var.f8279l = c02;
                }
                o10.I(c02);
                if (p != null) {
                    sVar.f5807v.d0(c02, p.A());
                    this.f6273w = true;
                }
                if (!z10) {
                    return;
                }
                sVar.f5807v.b0(c02);
                o10.a("onSdkLoaded", new r.a());
                return;
            }
            str3 = "Failed to create omid session in InternalNativeAd";
        }
        g1.j(str3);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.Map<java.lang.String, java.lang.Boolean>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.Map<java.lang.String, java.lang.Boolean>, java.util.HashMap] */
    public final synchronized void l(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z10) {
        if (this.f6272v) {
            return;
        }
        if (((Boolean) jo.f10145d.f10148c.a(es.f8081e1)).booleanValue() && this.f6191b.f7049i0) {
            for (String str : this.D.keySet()) {
                if (!((Boolean) this.D.get(str)).booleanValue()) {
                    return;
                }
            }
        }
        if (z10) {
            this.f6263l.a(this.f6270t);
            this.f6262k.i(view, map, map2);
            this.f6272v = true;
            return;
        }
        if (((Boolean) jo.f10145d.f10148c.a(es.f8121j2)).booleanValue() && map != null) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                View view2 = entry.getValue().get();
                if (view2 != null && g(view2)) {
                    this.f6263l.a(this.f6270t);
                    this.f6262k.i(view, map, map2);
                    this.f6272v = true;
                    return;
                }
            }
        }
    }

    public final synchronized void m(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z10) {
        tv0 tv0Var = this.f6263l;
        lw0 lw0Var = this.f6270t;
        Objects.requireNonNull(tv0Var);
        if (lw0Var != null && tv0Var.f14174e != null && lw0Var.f() != null && tv0Var.f14172c.e()) {
            try {
                lw0Var.f().addView(tv0Var.f14174e.a());
            } catch (fe0 e10) {
                g1.b("web view can not be obtained", e10);
            }
        }
        this.f6262k.n(view, view2, map, map2, z10);
        if (this.f6273w && this.f6261j.p() != null) {
            this.f6261j.p().a("onSdkAdUserInteractionClick", new r.a());
        }
    }

    public final synchronized void n(Bundle bundle) {
        this.f6262k.c(bundle);
    }
}
