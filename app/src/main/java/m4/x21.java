package m4;

import a6.f;
import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import l3.s;
import n3.g1;
import n3.i1;
import n3.k1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class x21 implements a31, m21 {

    /* renamed from: a */
    public final z21 f15193a;

    /* renamed from: b */
    public final b31 f15194b;

    /* renamed from: c */
    public final n21 f15195c;

    /* renamed from: d */
    public final s21 f15196d;

    /* renamed from: e */
    public final l21 f15197e;

    /* renamed from: f */
    public final String f15198f;

    /* renamed from: l */
    public boolean f15204l;

    /* renamed from: m */
    public int f15205m;

    /* renamed from: n */
    public boolean f15206n;

    /* renamed from: h */
    public String f15200h = "{}";

    /* renamed from: i */
    public String f15201i = "";

    /* renamed from: j */
    public long f15202j = Long.MAX_VALUE;

    /* renamed from: k */
    public t21 f15203k = t21.NONE;

    /* renamed from: o */
    public w21 f15207o = w21.UNKNOWN;

    /* renamed from: g */
    public final Map<String, List<p21>> f15199g = new HashMap();

    public x21(z21 z21Var, b31 b31Var, n21 n21Var, Context context, o90 o90Var, s21 s21Var) {
        this.f15193a = z21Var;
        this.f15194b = b31Var;
        this.f15195c = n21Var;
        this.f15197e = new l21(context);
        this.f15198f = o90Var.f12051s;
        this.f15196d = s21Var;
        s.B.f5799m.f16443g = this;
    }

    public final void a() {
        String str;
        boolean z10;
        yr<Boolean> yrVar = es.S5;
        jo joVar = jo.f10145d;
        if (!((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
            return;
        }
        if (((Boolean) joVar.f10148c.a(es.f8109h6)).booleanValue()) {
            k1 k1Var = (k1) s.B.f5793g.c();
            k1Var.u();
            synchronized (k1Var.f16496a) {
                z10 = k1Var.f16517w;
            }
            if (z10) {
                f();
                return;
            }
        }
        k1 k1Var2 = (k1) s.B.f5793g.c();
        k1Var2.u();
        synchronized (k1Var2.f16496a) {
            str = k1Var2.f16516v;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            if (!new JSONObject(str).optBoolean("isTestMode", false)) {
                return;
            }
            f();
        } catch (JSONException unused) {
        }
    }

    public final synchronized void b(bq bqVar, w21 w21Var) {
        if (!d()) {
            try {
                bqVar.h1(f.n(18, null, null));
                return;
            } catch (RemoteException unused) {
                g1.j("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) jo.f10145d.f10148c.a(es.S5)).booleanValue()) {
            this.f15207o = w21Var;
            this.f15193a.c(bqVar, new mx(this));
            return;
        }
        try {
            bqVar.h1(f.n(1, null, null));
            return;
        } catch (RemoteException unused2) {
            g1.j("Ad inspector had an internal error.");
            return;
        }
    }

    public final void c(boolean z10) {
        if (!this.f15206n && z10) {
            f();
        }
        i(z10, true);
    }

    public final synchronized boolean d() {
        if (((Boolean) jo.f10145d.f10148c.a(es.f8109h6)).booleanValue()) {
            return this.f15204l || s.B.f5799m.g();
        }
        return this.f15204l;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map<java.lang.String, java.util.List<m4.p21>>, java.util.HashMap] */
    public final synchronized JSONObject e() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        for (Map.Entry entry : this.f15199g.entrySet()) {
            JSONArray jSONArray = new JSONArray();
            for (p21 p21Var : (List) entry.getValue()) {
                if (p21Var.f12390v != o21.AD_REQUESTED) {
                    jSONArray.put(p21Var.a());
                }
            }
            if (jSONArray.length() > 0) {
                jSONObject.put((String) entry.getKey(), jSONArray);
            }
        }
        return jSONObject;
    }

    public final void f() {
        String str;
        this.f15206n = true;
        this.f15196d.b();
        this.f15193a.f15984u = this;
        this.f15194b.f6352f = this;
        this.f15195c.f11411i = this;
        k1 k1Var = (k1) s.B.f5793g.c();
        k1Var.u();
        synchronized (k1Var.f16496a) {
            str = k1Var.f16516v;
        }
        synchronized (this) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    i(jSONObject.optBoolean("isTestMode", false), false);
                    h((t21) Enum.valueOf(t21.class, jSONObject.optString("gesture", "NONE")), false);
                    this.f15200h = jSONObject.optString("networkExtras", "{}");
                    this.f15202j = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
                } catch (JSONException unused) {
                }
            }
        }
    }

    public final void g() {
        String jSONObject;
        s sVar = s.B;
        i1 c10 = sVar.f5793g.c();
        synchronized (this) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("isTestMode", this.f15204l);
                jSONObject2.put("gesture", this.f15203k);
                long j3 = this.f15202j;
                Objects.requireNonNull(sVar.f5796j);
                if (j3 > System.currentTimeMillis() / 1000) {
                    jSONObject2.put("networkExtras", this.f15200h);
                    jSONObject2.put("networkExtrasExpirationSecs", this.f15202j);
                }
            } catch (JSONException unused) {
            }
            jSONObject = jSONObject2.toString();
        }
        k1 k1Var = (k1) c10;
        Objects.requireNonNull(k1Var);
        if (!((Boolean) jo.f10145d.f10148c.a(es.S5)).booleanValue()) {
            return;
        }
        k1Var.u();
        synchronized (k1Var.f16496a) {
            if (!k1Var.f16516v.equals(jSONObject)) {
                k1Var.f16516v = jSONObject;
                SharedPreferences.Editor editor = k1Var.f16502g;
                if (editor != null) {
                    editor.putString("inspector_info", jSONObject);
                    k1Var.f16502g.apply();
                }
                k1Var.v();
            }
        }
    }

    public final synchronized void h(t21 t21Var, boolean z10) {
        if (this.f15203k == t21Var) {
            return;
        }
        if (d()) {
            j();
        }
        this.f15203k = t21Var;
        if (d()) {
            k();
        }
        if (!z10) {
            return;
        }
        g();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036 A[Catch: all -> 0x003d, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x000b, B:11:0x001d, B:13:0x0027, B:14:0x002b, B:16:0x0031, B:18:0x0036), top: B:25:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void i(boolean r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f15204l     // Catch: java.lang.Throwable -> L3d
            if (r0 != r2) goto L7
            monitor-exit(r1)
            return
        L7:
            r1.f15204l = r2     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L2b
            m4.yr<java.lang.Boolean> r2 = m4.es.f8109h6     // Catch: java.lang.Throwable -> L3d
            m4.jo r0 = m4.jo.f10145d     // Catch: java.lang.Throwable -> L3d
            m4.ds r0 = r0.f10148c     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r2 = r0.a(r2)     // Catch: java.lang.Throwable -> L3d
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L3d
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L27
            l3.s r2 = l3.s.B     // Catch: java.lang.Throwable -> L3d
            n3.a0 r2 = r2.f5799m     // Catch: java.lang.Throwable -> L3d
            boolean r2 = r2.g()     // Catch: java.lang.Throwable -> L3d
            if (r2 != 0) goto L2b
        L27:
            r1.k()     // Catch: java.lang.Throwable -> L3d
            goto L34
        L2b:
            boolean r2 = r1.d()     // Catch: java.lang.Throwable -> L3d
            if (r2 != 0) goto L34
            r1.j()     // Catch: java.lang.Throwable -> L3d
        L34:
            if (r3 == 0) goto L3b
            r1.g()     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r1)
            return
        L3b:
            monitor-exit(r1)
            return
        L3d:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.x21.i(boolean, boolean):void");
    }

    public final synchronized void j() {
        SensorManager sensorManager;
        Sensor sensor;
        int ordinal = this.f15203k.ordinal();
        if (ordinal == 1) {
            b31 b31Var = this.f15194b;
            synchronized (b31Var) {
                if (b31Var.f6353g) {
                    SensorManager sensorManager2 = b31Var.f6348b;
                    if (sensorManager2 != null) {
                        sensorManager2.unregisterListener(b31Var, b31Var.f6349c);
                        g1.a("Stopped listening for shake gestures.");
                    }
                    b31Var.f6353g = false;
                }
            }
        } else if (ordinal != 2) {
        } else {
            n21 n21Var = this.f15195c;
            synchronized (n21Var) {
                if (n21Var.f11412j && (sensorManager = n21Var.f11403a) != null && (sensor = n21Var.f11404b) != null) {
                    sensorManager.unregisterListener(n21Var, sensor);
                    n21Var.f11412j = false;
                    g1.a("Stopped listening for flick gestures.");
                }
            }
        }
    }

    public final synchronized void k() {
        int ordinal = this.f15203k.ordinal();
        if (ordinal == 1) {
            this.f15194b.a();
        } else if (ordinal != 2) {
        } else {
            this.f15195c.a();
        }
    }
}
