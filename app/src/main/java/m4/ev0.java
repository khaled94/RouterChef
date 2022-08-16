package m4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import java.util.Collections;
import java.util.List;
import k4.a;
import k4.b;
import n3.g1;
import r.g;

/* loaded from: classes.dex */
public final class ev0 {

    /* renamed from: a */
    public int f8268a;

    /* renamed from: b */
    public lq f8269b;

    /* renamed from: c */
    public pu f8270c;

    /* renamed from: d */
    public View f8271d;

    /* renamed from: e */
    public List<?> f8272e;

    /* renamed from: g */
    public ar f8274g;

    /* renamed from: h */
    public Bundle f8275h;

    /* renamed from: i */
    public vd0 f8276i;

    /* renamed from: j */
    public vd0 f8277j;

    /* renamed from: k */
    public vd0 f8278k;

    /* renamed from: l */
    public a f8279l;

    /* renamed from: m */
    public View f8280m;

    /* renamed from: n */
    public View f8281n;

    /* renamed from: o */
    public a f8282o;
    public double p;

    /* renamed from: q */
    public vu f8283q;

    /* renamed from: r */
    public vu f8284r;

    /* renamed from: s */
    public String f8285s;

    /* renamed from: v */
    public float f8288v;

    /* renamed from: w */
    public String f8289w;

    /* renamed from: t */
    public final g<String, ju> f8286t = new g<>();

    /* renamed from: u */
    public final g<String, String> f8287u = new g<>();

    /* renamed from: f */
    public List<ar> f8273f = Collections.emptyList();

    public static dv0 e(lq lqVar, t10 t10Var) {
        if (lqVar == null) {
            return null;
        }
        return new dv0(lqVar, t10Var);
    }

    public static ev0 f(lq lqVar, pu puVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, a aVar, String str4, String str5, double d5, vu vuVar, String str6, float f10) {
        ev0 ev0Var = new ev0();
        ev0Var.f8268a = 6;
        ev0Var.f8269b = lqVar;
        ev0Var.f8270c = puVar;
        ev0Var.f8271d = view;
        ev0Var.d("headline", str);
        ev0Var.f8272e = list;
        ev0Var.d("body", str2);
        ev0Var.f8275h = bundle;
        ev0Var.d("call_to_action", str3);
        ev0Var.f8280m = view2;
        ev0Var.f8282o = aVar;
        ev0Var.d("store", str4);
        ev0Var.d("price", str5);
        ev0Var.p = d5;
        ev0Var.f8283q = vuVar;
        ev0Var.d("advertiser", str6);
        synchronized (ev0Var) {
            ev0Var.f8288v = f10;
        }
        return ev0Var;
    }

    public static <T> T g(a aVar) {
        if (aVar == null) {
            return null;
        }
        return (T) b.e0(aVar);
    }

    public static ev0 q(t10 t10Var) {
        try {
            return f(e(t10Var.i(), t10Var), t10Var.n(), (View) g(t10Var.o()), t10Var.p(), t10Var.q(), t10Var.s(), t10Var.h(), t10Var.x(), (View) g(t10Var.j()), t10Var.k(), t10Var.v(), t10Var.r(), t10Var.b(), t10Var.l(), t10Var.m(), t10Var.d());
        } catch (RemoteException e10) {
            g1.k("Failed to get native ad assets from unified ad mapper", e10);
            return null;
        }
    }

    public final synchronized String a(String str) {
        return this.f8287u.getOrDefault(str, null);
    }

    public final synchronized List<?> b() {
        return this.f8272e;
    }

    public final synchronized List<ar> c() {
        return this.f8273f;
    }

    public final synchronized void d(String str, String str2) {
        if (str2 == null) {
            this.f8287u.remove(str);
        } else {
            this.f8287u.put(str, str2);
        }
    }

    public final synchronized int h() {
        return this.f8268a;
    }

    public final synchronized Bundle i() {
        if (this.f8275h == null) {
            this.f8275h = new Bundle();
        }
        return this.f8275h;
    }

    public final synchronized View j() {
        return this.f8280m;
    }

    public final synchronized lq k() {
        return this.f8269b;
    }

    public final synchronized ar l() {
        return this.f8274g;
    }

    public final synchronized pu m() {
        return this.f8270c;
    }

    public final vu n() {
        List<?> list = this.f8272e;
        if (list != null && list.size() != 0) {
            Object obj = this.f8272e.get(0);
            if (obj instanceof IBinder) {
                return ju.N3((IBinder) obj);
            }
        }
        return null;
    }

    public final synchronized vd0 o() {
        return this.f8278k;
    }

    public final synchronized vd0 p() {
        return this.f8276i;
    }

    public final synchronized a r() {
        return this.f8282o;
    }

    public final synchronized a s() {
        return this.f8279l;
    }

    public final synchronized String t() {
        return a("body");
    }

    public final synchronized String u() {
        return a("call_to_action");
    }

    public final synchronized String v() {
        return this.f8285s;
    }

    public final synchronized String w() {
        return a("headline");
    }
}
