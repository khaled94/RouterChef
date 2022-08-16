package m4;

import a6.d;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import d4.m;
import h4.a;
import h4.f;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Objects;
import javax.annotation.ParametersAreNonnullByDefault;
import l3.s;
import n3.g1;
import n3.s1;
import n3.v0;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class lu0 implements jv0 {

    /* renamed from: a */
    public final Context f11000a;

    /* renamed from: b */
    public final lv0 f11001b;

    /* renamed from: c */
    public final JSONObject f11002c;

    /* renamed from: d */
    public final ty0 f11003d;

    /* renamed from: e */
    public final ev0 f11004e;

    /* renamed from: f */
    public final w7 f11005f;

    /* renamed from: g */
    public final cp0 f11006g;

    /* renamed from: h */
    public final ro0 f11007h;

    /* renamed from: i */
    public final hs0 f11008i;

    /* renamed from: j */
    public final cm1 f11009j;

    /* renamed from: k */
    public final o90 f11010k;

    /* renamed from: l */
    public final om1 f11011l;

    /* renamed from: m */
    public final dj0 f11012m;

    /* renamed from: n */
    public final wv0 f11013n;

    /* renamed from: o */
    public final a f11014o;
    public final fs0 p;

    /* renamed from: q */
    public final zp1 f11015q;

    /* renamed from: s */
    public boolean f11017s;

    /* renamed from: z */
    public wp f11023z;

    /* renamed from: r */
    public boolean f11016r = false;

    /* renamed from: t */
    public boolean f11018t = false;

    /* renamed from: u */
    public boolean f11019u = false;

    /* renamed from: v */
    public Point f11020v = new Point();

    /* renamed from: w */
    public Point f11021w = new Point();

    /* renamed from: x */
    public long f11022x = 0;
    public long y = 0;

    public lu0(Context context, lv0 lv0Var, JSONObject jSONObject, ty0 ty0Var, ev0 ev0Var, w7 w7Var, cp0 cp0Var, ro0 ro0Var, hs0 hs0Var, cm1 cm1Var, o90 o90Var, om1 om1Var, dj0 dj0Var, wv0 wv0Var, a aVar, fs0 fs0Var, zp1 zp1Var) {
        this.f11000a = context;
        this.f11001b = lv0Var;
        this.f11002c = jSONObject;
        this.f11003d = ty0Var;
        this.f11004e = ev0Var;
        this.f11005f = w7Var;
        this.f11006g = cp0Var;
        this.f11007h = ro0Var;
        this.f11008i = hs0Var;
        this.f11009j = cm1Var;
        this.f11010k = o90Var;
        this.f11011l = om1Var;
        this.f11012m = dj0Var;
        this.f11013n = wv0Var;
        this.f11014o = aVar;
        this.p = fs0Var;
        this.f11015q = zp1Var;
    }

    public final void A(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z10, boolean z11) {
        String str2;
        m.d("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.f11002c);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            boolean z12 = false;
            jSONObject7.put("has_custom_click_handler", this.f11001b.a(this.f11004e.v()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.f11004e.h());
            jSONObject8.put("view_aware_api_used", z10);
            lu luVar = this.f11011l.f12208i;
            jSONObject8.put("custom_mute_requested", luVar != null && luVar.y);
            jSONObject8.put("custom_mute_enabled", !this.f11004e.c().isEmpty() && this.f11004e.l() != null);
            if (this.f11013n.f15117u != null && this.f11002c.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.f11014o.a());
            if (this.f11019u && y()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z11) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            if (this.f11001b.a(this.f11004e.v()) != null) {
                z12 = true;
            }
            jSONObject8.put("has_custom_click_handler", z12);
            try {
                JSONObject optJSONObject = this.f11002c.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                str2 = this.f11005f.f14875b.f(this.f11000a, optJSONObject.optString("click_string"), view);
            } catch (Exception e10) {
                g1.h("Exception obtaining click signals", e10);
                str2 = null;
            }
            jSONObject8.put("click_signals", str2);
            yr<Boolean> yrVar = es.K2;
            jo joVar = jo.f10145d;
            if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
                jSONObject8.put("open_chrome_custom_tab", true);
            }
            if (((Boolean) joVar.f10148c.a(es.G5)).booleanValue() && f.c()) {
                jSONObject8.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) joVar.f10148c.a(es.H5)).booleanValue() && f.c()) {
                jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long a10 = this.f11014o.a();
            jSONObject9.put("time_from_last_touch_down", a10 - this.f11022x);
            jSONObject9.put("time_from_last_touch", a10 - this.y);
            jSONObject7.put("touch_signal", jSONObject9);
            d.e(this.f11003d.a("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e11) {
            g1.h("Unable to create click JSON.", e11);
        }
    }

    @Override // m4.jv0
    public final boolean F() {
        return y();
    }

    @Override // m4.jv0
    public final boolean a(Bundle bundle) {
        if (!x("impression_reporting")) {
            g1.g("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
            return false;
        }
        s1 s1Var = s.B.f5789c;
        Objects.requireNonNull(s1Var);
        JSONObject jSONObject = null;
        if (bundle != null) {
            try {
                jSONObject = s1Var.E(bundle);
            } catch (JSONException e10) {
                g1.h("Error converting Bundle to JSON", e10);
            }
        }
        return z(null, null, null, null, null, jSONObject, false);
    }

    @Override // m4.jv0
    public final void b(wp wpVar) {
        this.f11023z = wpVar;
    }

    @Override // m4.jv0
    public final void c(Bundle bundle) {
        if (bundle == null) {
            g1.e("Click data is null. No click is reported.");
        } else if (!x("click_reporting")) {
            g1.g("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            JSONObject jSONObject = null;
            String string = bundle2 != null ? bundle2.getString("asset_id") : null;
            s1 s1Var = s.B.f5789c;
            Objects.requireNonNull(s1Var);
            try {
                jSONObject = s1Var.E(bundle);
            } catch (JSONException e10) {
                g1.h("Error converting Bundle to JSON", e10);
            }
            A(null, null, null, null, null, string, null, jSONObject, false, false);
        }
    }

    @Override // m4.jv0
    public final void d() {
        try {
            wp wpVar = this.f11023z;
            if (wpVar == null) {
                return;
            }
            wpVar.b();
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        }
    }

    @Override // m4.jv0
    public final void e() {
        if (!this.f11002c.optBoolean("custom_one_point_five_click_enabled", false)) {
            return;
        }
        wv0 wv0Var = this.f11013n;
        if (wv0Var.f15117u == null || wv0Var.f15120x == null) {
            return;
        }
        wv0Var.a();
        try {
            wv0Var.f15117u.b();
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        }
    }

    @Override // m4.jv0
    public final void f() {
        ty0 ty0Var = this.f11003d;
        synchronized (ty0Var) {
            tz1<vd0> tz1Var = ty0Var.f14205l;
            if (tz1Var != null) {
                mz1.t(tz1Var, new a6.f(ty0Var), ty0Var.f14199f);
                ty0Var.f14205l = null;
            }
        }
    }

    @Override // m4.jv0
    public final JSONObject g(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        JSONObject d5 = v0.d(this.f11000a, map, map2, view);
        JSONObject g10 = v0.g(this.f11000a, view);
        JSONObject f10 = v0.f(view);
        JSONObject e10 = v0.e(this.f11000a, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", d5);
            jSONObject.put("ad_view_signal", g10);
            jSONObject.put("scroll_view_signal", f10);
            jSONObject.put("lock_screen_signal", e10);
            return jSONObject;
        } catch (JSONException e11) {
            g1.h("Unable to create native ad view signals JSON.", e11);
            return null;
        }
    }

    @Override // m4.jv0
    public final void h(yp ypVar) {
        try {
            if (this.f11018t) {
                return;
            }
            if (ypVar == null && this.f11004e.l() != null) {
                this.f11018t = true;
                this.f11015q.a(this.f11004e.l().f6244t);
                d();
                return;
            }
            this.f11018t = true;
            this.f11015q.a(ypVar.d());
            d();
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        }
    }

    @Override // m4.jv0
    public final void i(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        String e10;
        JSONObject d5 = v0.d(this.f11000a, map, map2, view);
        JSONObject g10 = v0.g(this.f11000a, view);
        JSONObject f10 = v0.f(view);
        JSONObject e11 = v0.e(this.f11000a, view);
        if (((Boolean) jo.f10145d.f10148c.a(es.V1)).booleanValue()) {
            try {
                e10 = this.f11005f.f14875b.e(this.f11000a, view);
            } catch (Exception unused) {
                g1.g("Exception getting data.");
            }
            z(g10, d5, f10, e11, e10, null, v0.h(this.f11000a, this.f11009j));
        }
        e10 = null;
        z(g10, d5, f10, e11, e10, null, v0.h(this.f11000a, this.f11009j));
    }

    @Override // m4.jv0
    public final void j(Bundle bundle) {
        if (bundle == null) {
            g1.e("Touch event data is null. No touch event is reported.");
        } else if (!x("touch_reporting")) {
            g1.g("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
        } else {
            float f10 = bundle.getFloat("x");
            float f11 = bundle.getFloat("y");
            this.f11005f.f14875b.d((int) f10, (int) f11, bundle.getInt("duration_ms"));
        }
    }

    @Override // m4.jv0
    public final void k() {
        m.d("recordDownloadedImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f11002c);
            d.e(this.f11003d.a("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e10) {
            g1.h("", e10);
        }
    }

    @Override // m4.jv0
    public final void l(String str) {
        A(null, null, null, null, null, str, null, null, false, false);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map<android.view.View, m4.sh>, java.util.WeakHashMap] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Map<android.view.View, m4.sh>, java.util.WeakHashMap] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.Map<android.view.View, m4.sh>, java.util.WeakHashMap] */
    @Override // m4.jv0
    public final void m(View view) {
        this.f11020v = new Point();
        this.f11021w = new Point();
        if (view != null) {
            fs0 fs0Var = this.p;
            synchronized (fs0Var) {
                if (fs0Var.f8628t.containsKey(view)) {
                    ((sh) fs0Var.f8628t.get(view)).D.remove(fs0Var);
                    fs0Var.f8628t.remove(view);
                }
            }
        }
        this.f11017s = false;
    }

    @Override // m4.jv0
    public final void n(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z10) {
        JSONObject d5 = v0.d(this.f11000a, map, map2, view2);
        JSONObject g10 = v0.g(this.f11000a, view2);
        JSONObject f10 = v0.f(view2);
        JSONObject e10 = v0.e(this.f11000a, view2);
        String w10 = w(view, map);
        A(true == ((Boolean) jo.f10145d.f10148c.a(es.W1)).booleanValue() ? view2 : view, g10, d5, f10, e10, w10, v0.c(w10, this.f11000a, this.f11021w, this.f11020v), null, z10, false);
    }

    @Override // m4.jv0
    public final void o(View view) {
        if (!this.f11002c.optBoolean("custom_one_point_five_click_enabled", false)) {
            g1.j("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        wv0 wv0Var = this.f11013n;
        if (view == null) {
            return;
        }
        view.setOnClickListener(wv0Var);
        view.setClickable(true);
        wv0Var.y = new WeakReference<>(view);
    }

    @Override // m4.jv0
    public final void p(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z10) {
        if (!this.f11019u) {
            g1.e("Custom click reporting failed. enableCustomClickGesture is not set.");
        } else if (!y()) {
            g1.e("Custom click reporting failed. Ad unit id not in the allow list.");
        } else {
            JSONObject d5 = v0.d(this.f11000a, map, map2, view);
            JSONObject g10 = v0.g(this.f11000a, view);
            JSONObject f10 = v0.f(view);
            JSONObject e10 = v0.e(this.f11000a, view);
            String w10 = w(null, map);
            A(view, g10, d5, f10, e10, w10, v0.c(w10, this.f11000a, this.f11021w, this.f11020v), null, z10, true);
        }
    }

    @Override // m4.jv0
    public final void q(MotionEvent motionEvent, View view) {
        this.f11020v = v0.a(motionEvent, view);
        long a10 = this.f11014o.a();
        this.y = a10;
        if (motionEvent.getAction() == 0) {
            this.f11022x = a10;
            this.f11021w = this.f11020v;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.f11020v;
        obtain.setLocation(point.x, point.y);
        this.f11005f.b(obtain);
        obtain.recycle();
    }

    @Override // m4.jv0
    public final void r(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.f11020v = new Point();
        this.f11021w = new Point();
        if (!this.f11017s) {
            this.p.O0(view);
            this.f11017s = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        dj0 dj0Var = this.f11012m;
        Objects.requireNonNull(dj0Var);
        dj0Var.B = new WeakReference<>(this);
        boolean i10 = v0.i(this.f11010k.f12053u);
        if (map != null) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                View view2 = entry.getValue().get();
                if (view2 != null) {
                    if (i10) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            for (Map.Entry<String, WeakReference<View>> entry2 : map2.entrySet()) {
                View view3 = entry2.getValue().get();
                if (view3 != null) {
                    if (i10) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // m4.jv0
    public final void s() {
        z(null, null, null, null, null, null, false);
    }

    @Override // m4.jv0
    public final void t(final bw bwVar) {
        if (!this.f11002c.optBoolean("custom_one_point_five_click_enabled", false)) {
            g1.j("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        final wv0 wv0Var = this.f11013n;
        wv0Var.f15117u = bwVar;
        lx<Object> lxVar = wv0Var.f15118v;
        if (lxVar != null) {
            wv0Var.f15115s.e("/unconfirmedClick", lxVar);
        }
        lx<Object> lxVar2 = new lx() { // from class: m4.vv0
            @Override // m4.lx
            public final void a(Object obj, Map map) {
                wv0 wv0Var2 = wv0.this;
                bw bwVar2 = bwVar;
                try {
                    wv0Var2.f15120x = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    g1.g("Failed to call parse unconfirmedClickTimestamp.");
                }
                wv0Var2.f15119w = (String) map.get("id");
                String str = (String) map.get("asset_id");
                if (bwVar2 == null) {
                    g1.e("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    bwVar2.O(str);
                } catch (RemoteException e10) {
                    g1.l("#007 Could not call remote method.", e10);
                }
            }
        };
        wv0Var.f15118v = lxVar2;
        wv0Var.f15115s.c("/unconfirmedClick", lxVar2);
    }

    @Override // m4.jv0
    public final JSONObject u(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        JSONObject g10 = g(view, map, map2);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f11019u && y()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (g10 != null) {
                jSONObject.put("nas", g10);
            }
        } catch (JSONException e10) {
            g1.h("Unable to create native click meta data JSON.", e10);
        }
        return jSONObject;
    }

    @Override // m4.jv0
    public final void v() {
        this.f11019u = true;
    }

    public final String w(View view, Map<String, WeakReference<View>> map) {
        if (map != null && view != null) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                if (view.equals(entry.getValue().get())) {
                    return entry.getKey();
                }
            }
        }
        int h10 = this.f11004e.h();
        if (h10 != 1) {
            if (h10 == 2) {
                return "2099";
            }
            if (h10 == 6) {
                return "3099";
            }
            return null;
        }
        return "1099";
    }

    public final boolean x(String str) {
        JSONObject optJSONObject = this.f11002c.optJSONObject("allow_pub_event_reporting");
        return optJSONObject != null && optJSONObject.optBoolean(str, false);
    }

    public final boolean y() {
        return this.f11002c.optBoolean("allow_custom_click_gesture", false);
    }

    public final boolean z(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z10) {
        String str2;
        lx<Object> lxVar;
        ty0 ty0Var;
        m.d("recordImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f11002c);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) jo.f10145d.f10148c.a(es.V1)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z10);
            Context context = this.f11000a;
            JSONObject jSONObject7 = new JSONObject();
            s1 s1Var = s.B.f5789c;
            DisplayMetrics O = s1.O((WindowManager) context.getSystemService("window"));
            try {
                int i10 = O.widthPixels;
                io ioVar = io.f9708f;
                jSONObject7.put("width", ioVar.f9709a.a(context, i10));
                jSONObject7.put("height", ioVar.f9709a.a(context, O.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            if (((Boolean) jo.f10145d.f10148c.a(es.C5)).booleanValue()) {
                ty0Var = this.f11003d;
                lxVar = new iu0(this);
                str2 = "/clickRecorded";
            } else {
                ty0Var = this.f11003d;
                lxVar = new hu0(this);
                str2 = "/logScionEvent";
            }
            ty0Var.c(str2, lxVar);
            this.f11003d.c("/nativeImpression", new ku0(this));
            d.e(this.f11003d.a("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.f11016r) {
                return true;
            }
            this.f11016r = s.B.f5799m.i(this.f11000a, this.f11010k.f12051s, this.f11009j.D.toString(), this.f11011l.f12205f);
            return true;
        } catch (JSONException e10) {
            g1.h("Unable to create impression JSON.", e10);
            return false;
        }
    }
}
