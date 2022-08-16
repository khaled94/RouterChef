package n3;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;
import l3.s;
import m4.es;
import m4.fi;
import m4.ft;
import m4.jo;
import m4.tz1;
import m4.u90;
import m4.v80;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k1 implements i1 {

    /* renamed from: b */
    public boolean f16497b;

    /* renamed from: d */
    public tz1<?> f16499d;
    @GuardedBy("lock")

    /* renamed from: f */
    public SharedPreferences f16501f;
    @GuardedBy("lock")

    /* renamed from: g */
    public SharedPreferences.Editor f16502g;
    @GuardedBy("lock")

    /* renamed from: i */
    public String f16504i;
    @GuardedBy("lock")

    /* renamed from: j */
    public String f16505j;

    /* renamed from: a */
    public final Object f16496a = new Object();

    /* renamed from: c */
    public final List<Runnable> f16498c = new ArrayList();
    @GuardedBy("lock")

    /* renamed from: e */
    public fi f16500e = null;
    @GuardedBy("lock")

    /* renamed from: h */
    public boolean f16503h = true;
    @GuardedBy("lock")

    /* renamed from: k */
    public boolean f16506k = true;
    @GuardedBy("lock")

    /* renamed from: l */
    public v80 f16507l = new v80("", 0);
    @GuardedBy("lock")

    /* renamed from: m */
    public long f16508m = 0;
    @GuardedBy("lock")

    /* renamed from: n */
    public long f16509n = 0;
    @GuardedBy("lock")

    /* renamed from: o */
    public int f16510o = -1;
    @GuardedBy("lock")
    public int p = 0;
    @GuardedBy("lock")

    /* renamed from: q */
    public Set<String> f16511q = Collections.emptySet();
    @GuardedBy("lock")

    /* renamed from: r */
    public JSONObject f16512r = new JSONObject();
    @GuardedBy("lock")

    /* renamed from: s */
    public boolean f16513s = true;
    @GuardedBy("lock")

    /* renamed from: t */
    public boolean f16514t = true;
    @GuardedBy("lock")

    /* renamed from: u */
    public String f16515u = null;
    @GuardedBy("lock")

    /* renamed from: v */
    public String f16516v = "";
    @GuardedBy("lock")

    /* renamed from: w */
    public boolean f16517w = false;
    @GuardedBy("lock")

    /* renamed from: x */
    public String f16518x = "";
    @GuardedBy("lock")
    public int y = -1;
    @GuardedBy("lock")

    /* renamed from: z */
    public int f16519z = -1;
    @GuardedBy("lock")
    public long A = 0;

    public final void A(final Context context) {
        synchronized (this.f16496a) {
            if (this.f16501f != null) {
                return;
            }
            this.f16499d = u90.f14294a.a(new Runnable() { // from class: n3.j1
                @Override // java.lang.Runnable
                public final void run() {
                    k1 k1Var = k1.this;
                    Context context2 = context;
                    Objects.requireNonNull(k1Var);
                    SharedPreferences sharedPreferences = context2.getSharedPreferences("admob", 0);
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    synchronized (k1Var.f16496a) {
                        k1Var.f16501f = sharedPreferences;
                        k1Var.f16502g = edit;
                        NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                        k1Var.f16503h = k1Var.f16501f.getBoolean("use_https", k1Var.f16503h);
                        k1Var.f16513s = k1Var.f16501f.getBoolean("content_url_opted_out", k1Var.f16513s);
                        k1Var.f16504i = k1Var.f16501f.getString("content_url_hashes", k1Var.f16504i);
                        k1Var.f16506k = k1Var.f16501f.getBoolean("gad_idless", k1Var.f16506k);
                        k1Var.f16514t = k1Var.f16501f.getBoolean("content_vertical_opted_out", k1Var.f16514t);
                        k1Var.f16505j = k1Var.f16501f.getString("content_vertical_hashes", k1Var.f16505j);
                        k1Var.p = k1Var.f16501f.getInt("version_code", k1Var.p);
                        k1Var.f16507l = new v80(k1Var.f16501f.getString("app_settings_json", k1Var.f16507l.f14602e), k1Var.f16501f.getLong("app_settings_last_update_ms", k1Var.f16507l.f14603f));
                        k1Var.f16508m = k1Var.f16501f.getLong("app_last_background_time_ms", k1Var.f16508m);
                        k1Var.f16510o = k1Var.f16501f.getInt("request_in_session_count", k1Var.f16510o);
                        k1Var.f16509n = k1Var.f16501f.getLong("first_ad_req_time_ms", k1Var.f16509n);
                        k1Var.f16511q = k1Var.f16501f.getStringSet("never_pool_slots", k1Var.f16511q);
                        k1Var.f16515u = k1Var.f16501f.getString("display_cutout", k1Var.f16515u);
                        k1Var.y = k1Var.f16501f.getInt("app_measurement_npa", k1Var.y);
                        k1Var.f16519z = k1Var.f16501f.getInt("sd_app_measure_npa", k1Var.f16519z);
                        k1Var.A = k1Var.f16501f.getLong("sd_app_measure_npa_ts", k1Var.A);
                        k1Var.f16516v = k1Var.f16501f.getString("inspector_info", k1Var.f16516v);
                        k1Var.f16517w = k1Var.f16501f.getBoolean("linked_device", k1Var.f16517w);
                        k1Var.f16518x = k1Var.f16501f.getString("linked_ad_unit", k1Var.f16518x);
                        try {
                            k1Var.f16512r = new JSONObject(k1Var.f16501f.getString("native_advanced_settings", "{}"));
                        } catch (JSONException e10) {
                            g1.k("Could not convert native advanced settings to json object", e10);
                        }
                        k1Var.v();
                    }
                }
            });
            this.f16497b = true;
        }
    }

    public final void B(String str) {
        u();
        synchronized (this.f16496a) {
            if (str.equals(this.f16504i)) {
                return;
            }
            this.f16504i = str;
            SharedPreferences.Editor editor = this.f16502g;
            if (editor != null) {
                editor.putString("content_url_hashes", str);
                this.f16502g.apply();
            }
            v();
        }
    }

    public final void C(String str) {
        u();
        synchronized (this.f16496a) {
            if (str.equals(this.f16505j)) {
                return;
            }
            this.f16505j = str;
            SharedPreferences.Editor editor = this.f16502g;
            if (editor != null) {
                editor.putString("content_vertical_hashes", str);
                this.f16502g.apply();
            }
            v();
        }
    }

    public final void D(String str) {
        if (!((Boolean) jo.f10145d.f10148c.a(es.f8109h6)).booleanValue()) {
            return;
        }
        u();
        synchronized (this.f16496a) {
            if (this.f16518x.equals(str)) {
                return;
            }
            this.f16518x = str;
            SharedPreferences.Editor editor = this.f16502g;
            if (editor != null) {
                editor.putString("linked_ad_unit", str);
                this.f16502g.apply();
            }
            v();
        }
    }

    public final void E(boolean z10) {
        if (!((Boolean) jo.f10145d.f10148c.a(es.f8109h6)).booleanValue()) {
            return;
        }
        u();
        synchronized (this.f16496a) {
            if (this.f16517w == z10) {
                return;
            }
            this.f16517w = z10;
            SharedPreferences.Editor editor = this.f16502g;
            if (editor != null) {
                editor.putBoolean("linked_device", z10);
                this.f16502g.apply();
            }
            v();
        }
    }

    @Override // n3.i1
    public final boolean J() {
        boolean z10;
        if (!((Boolean) jo.f10145d.f10148c.a(es.f8126k0)).booleanValue()) {
            return false;
        }
        u();
        synchronized (this.f16496a) {
            z10 = this.f16506k;
        }
        return z10;
    }

    @Override // n3.i1
    public final int a() {
        int i10;
        u();
        synchronized (this.f16496a) {
            i10 = this.f16510o;
        }
        return i10;
    }

    @Override // n3.i1
    public final long b() {
        long j3;
        u();
        synchronized (this.f16496a) {
            j3 = this.A;
        }
        return j3;
    }

    @Override // n3.i1
    public final long c() {
        long j3;
        u();
        synchronized (this.f16496a) {
            j3 = this.f16508m;
        }
        return j3;
    }

    @Override // n3.i1
    public final void d(long j3) {
        u();
        synchronized (this.f16496a) {
            if (this.f16509n == j3) {
                return;
            }
            this.f16509n = j3;
            SharedPreferences.Editor editor = this.f16502g;
            if (editor != null) {
                editor.putLong("first_ad_req_time_ms", j3);
                this.f16502g.apply();
            }
            v();
        }
    }

    @Override // n3.i1
    public final v80 e() {
        v80 v80Var;
        u();
        synchronized (this.f16496a) {
            v80Var = this.f16507l;
        }
        return v80Var;
    }

    @Override // n3.i1
    public final void f(int i10) {
        u();
        synchronized (this.f16496a) {
            if (this.f16519z == i10) {
                return;
            }
            this.f16519z = i10;
            SharedPreferences.Editor editor = this.f16502g;
            if (editor != null) {
                editor.putInt("sd_app_measure_npa", i10);
                this.f16502g.apply();
            }
            v();
        }
    }

    @Override // n3.i1
    public final long g() {
        long j3;
        u();
        synchronized (this.f16496a) {
            j3 = this.f16509n;
        }
        return j3;
    }

    @Override // n3.i1
    public final void h(long j3) {
        u();
        synchronized (this.f16496a) {
            if (this.f16508m == j3) {
                return;
            }
            this.f16508m = j3;
            SharedPreferences.Editor editor = this.f16502g;
            if (editor != null) {
                editor.putLong("app_last_background_time_ms", j3);
                this.f16502g.apply();
            }
            v();
        }
    }

    @Override // n3.i1
    public final void i(boolean z10) {
        u();
        synchronized (this.f16496a) {
            if (this.f16513s == z10) {
                return;
            }
            this.f16513s = z10;
            SharedPreferences.Editor editor = this.f16502g;
            if (editor != null) {
                editor.putBoolean("content_url_opted_out", z10);
                this.f16502g.apply();
            }
            v();
        }
    }

    @Override // n3.i1
    public final JSONObject j() {
        JSONObject jSONObject;
        u();
        synchronized (this.f16496a) {
            jSONObject = this.f16512r;
        }
        return jSONObject;
    }

    @Override // n3.i1
    public final void k(long j3) {
        u();
        synchronized (this.f16496a) {
            if (this.A == j3) {
                return;
            }
            this.A = j3;
            SharedPreferences.Editor editor = this.f16502g;
            if (editor != null) {
                editor.putLong("sd_app_measure_npa_ts", j3);
                this.f16502g.apply();
            }
            v();
        }
    }

    @Override // n3.i1
    public final void l(boolean z10) {
        u();
        synchronized (this.f16496a) {
            if (z10 == this.f16506k) {
                return;
            }
            this.f16506k = z10;
            SharedPreferences.Editor editor = this.f16502g;
            if (editor != null) {
                editor.putBoolean("gad_idless", z10);
                this.f16502g.apply();
            }
            v();
        }
    }

    @Override // n3.i1
    public final void m(String str, String str2, boolean z10) {
        u();
        synchronized (this.f16496a) {
            JSONArray optJSONArray = this.f16512r.optJSONArray(str);
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            int length = optJSONArray.length();
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                if (optJSONObject == null) {
                    return;
                }
                if (str2.equals(optJSONObject.optString("template_id"))) {
                    if (z10 && optJSONObject.optBoolean("uses_media_view", false)) {
                        return;
                    }
                    length = i10;
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("template_id", str2);
                jSONObject.put("uses_media_view", z10);
                Objects.requireNonNull(s.B.f5796j);
                jSONObject.put("timestamp_ms", System.currentTimeMillis());
                optJSONArray.put(length, jSONObject);
                this.f16512r.put(str, optJSONArray);
            } catch (JSONException e10) {
                g1.k("Could not update native advanced settings", e10);
            }
            SharedPreferences.Editor editor = this.f16502g;
            if (editor != null) {
                editor.putString("native_advanced_settings", this.f16512r.toString());
                this.f16502g.apply();
            }
            v();
        }
    }

    @Override // n3.i1
    public final void n(int i10) {
        u();
        synchronized (this.f16496a) {
            if (this.p == i10) {
                return;
            }
            this.p = i10;
            SharedPreferences.Editor editor = this.f16502g;
            if (editor != null) {
                editor.putInt("version_code", i10);
                this.f16502g.apply();
            }
            v();
        }
    }

    @Override // n3.i1
    public final void o(boolean z10) {
        u();
        synchronized (this.f16496a) {
            if (this.f16514t == z10) {
                return;
            }
            this.f16514t = z10;
            SharedPreferences.Editor editor = this.f16502g;
            if (editor != null) {
                editor.putBoolean("content_vertical_opted_out", z10);
                this.f16502g.apply();
            }
            v();
        }
    }

    @Override // n3.i1
    public final void p(int i10) {
        u();
        synchronized (this.f16496a) {
            if (this.f16510o == i10) {
                return;
            }
            this.f16510o = i10;
            SharedPreferences.Editor editor = this.f16502g;
            if (editor != null) {
                editor.putInt("request_in_session_count", i10);
                this.f16502g.apply();
            }
            v();
        }
    }

    public final void q(String str) {
        u();
        synchronized (this.f16496a) {
            if (TextUtils.equals(this.f16515u, str)) {
                return;
            }
            this.f16515u = str;
            SharedPreferences.Editor editor = this.f16502g;
            if (editor != null) {
                editor.putString("display_cutout", str);
                this.f16502g.apply();
            }
            v();
        }
    }

    public final boolean r() {
        boolean z10;
        u();
        synchronized (this.f16496a) {
            z10 = this.f16513s;
        }
        return z10;
    }

    @Override // n3.i1
    public final void s() {
        u();
        synchronized (this.f16496a) {
            this.f16512r = new JSONObject();
            SharedPreferences.Editor editor = this.f16502g;
            if (editor != null) {
                editor.remove("native_advanced_settings");
                this.f16502g.apply();
            }
            v();
        }
    }

    public final boolean t() {
        boolean z10;
        u();
        synchronized (this.f16496a) {
            z10 = this.f16514t;
        }
        return z10;
    }

    public final void u() {
        Throwable e10;
        tz1<?> tz1Var = this.f16499d;
        if (tz1Var != null && !tz1Var.isDone()) {
            try {
                this.f16499d.get(1L, TimeUnit.SECONDS);
            } catch (InterruptedException e11) {
                Thread.currentThread().interrupt();
                g1.k("Interrupted while waiting for preferences loaded.", e11);
            } catch (CancellationException e12) {
                e10 = e12;
                g1.h("Fail to initialize AdSharedPreferenceManager.", e10);
            } catch (ExecutionException e13) {
                e10 = e13;
                g1.h("Fail to initialize AdSharedPreferenceManager.", e10);
            } catch (TimeoutException e14) {
                e10 = e14;
                g1.h("Fail to initialize AdSharedPreferenceManager.", e10);
            }
        }
    }

    public final void v() {
        u90.f14294a.execute(new a(this, 1));
    }

    public final fi w() {
        if (!this.f16497b) {
            return null;
        }
        if ((r() && t()) || !ft.f8634b.e().booleanValue()) {
            return null;
        }
        synchronized (this.f16496a) {
            if (Looper.getMainLooper() == null) {
                return null;
            }
            if (this.f16500e == null) {
                this.f16500e = new fi();
            }
            fi fiVar = this.f16500e;
            synchronized (fiVar.f8560u) {
                if (fiVar.f8558s) {
                    g1.e("Content hash thread already started, quiting...");
                } else {
                    fiVar.f8558s = true;
                    fiVar.start();
                }
            }
            g1.i("start fetching content...");
            return this.f16500e;
        }
    }

    public final String x() {
        String str;
        u();
        synchronized (this.f16496a) {
            str = this.f16505j;
        }
        return str;
    }

    public final String y() {
        String str;
        u();
        synchronized (this.f16496a) {
            str = this.f16515u;
        }
        return str;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<java.lang.Runnable>, java.util.ArrayList] */
    public final void z(Runnable runnable) {
        this.f16498c.add(runnable);
    }

    @Override // n3.i1
    public final int zza() {
        int i10;
        u();
        synchronized (this.f16496a) {
            i10 = this.p;
        }
        return i10;
    }
}
