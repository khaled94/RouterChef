package m4;

import a4.i;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import i0.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import k4.a;
import l3.l;
import l3.s;
import m3.f;
import m3.h;
import m3.j;
import m3.n;
import m3.p;
import m3.x;
import n3.b1;
import n3.f1;
import n3.g1;
import n3.h1;
import n3.r0;
import n3.s1;
import n3.t1;
import n3.x1;
import n3.z0;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class ke0 extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, vd0 {

    /* renamed from: s0 */
    public static final /* synthetic */ int f10372s0 = 0;
    public cm1 A;
    public em1 B;
    public ce0 E;
    @GuardedBy("this")
    public n F;
    @GuardedBy("this")
    public a G;
    @GuardedBy("this")
    public cf0 H;
    @GuardedBy("this")
    public final String I;
    @GuardedBy("this")
    public boolean J;
    @GuardedBy("this")
    public boolean K;
    @GuardedBy("this")
    public boolean L;
    @GuardedBy("this")
    public boolean M;
    @GuardedBy("this")
    public Boolean N;
    @GuardedBy("this")
    public me0 Q;
    @GuardedBy("this")
    public boolean R;
    @GuardedBy("this")
    public boolean S;
    @GuardedBy("this")
    public ku T;
    @GuardedBy("this")
    public iu U;
    @GuardedBy("this")
    public ui V;
    @GuardedBy("this")
    public int W;
    @GuardedBy("this")

    /* renamed from: a0 */
    public int f10373a0;

    /* renamed from: b0 */
    public os f10374b0;

    /* renamed from: c0 */
    public final os f10375c0;

    /* renamed from: d0 */
    public os f10376d0;

    /* renamed from: e0 */
    public final ps f10377e0;

    /* renamed from: f0 */
    public int f10378f0;

    /* renamed from: g0 */
    public int f10379g0;

    /* renamed from: h0 */
    public int f10380h0;
    @GuardedBy("this")

    /* renamed from: i0 */
    public n f10381i0;
    @GuardedBy("this")

    /* renamed from: j0 */
    public boolean f10382j0;

    /* renamed from: k0 */
    public final f1 f10383k0;

    /* renamed from: p0 */
    public Map<String, uc0> f10388p0;

    /* renamed from: q0 */
    public final WindowManager f10389q0;

    /* renamed from: r0 */
    public final wj f10390r0;

    /* renamed from: s */
    public final bf0 f10391s;

    /* renamed from: t */
    public final w7 f10392t;

    /* renamed from: u */
    public final ys f10393u;

    /* renamed from: v */
    public final o90 f10394v;

    /* renamed from: w */
    public l f10395w;

    /* renamed from: x */
    public final l3.a f10396x;
    public final DisplayMetrics y;

    /* renamed from: z */
    public final float f10397z;
    public boolean C = false;
    public boolean D = false;
    @GuardedBy("this")
    public boolean O = true;
    @GuardedBy("this")
    public final String P = "";

    /* renamed from: l0 */
    public int f10384l0 = -1;

    /* renamed from: m0 */
    public int f10385m0 = -1;

    /* renamed from: n0 */
    public int f10386n0 = -1;

    /* renamed from: o0 */
    public int f10387o0 = -1;

    public ke0(bf0 bf0Var, cf0 cf0Var, String str, boolean z10, w7 w7Var, ys ysVar, o90 o90Var, l lVar, l3.a aVar, wj wjVar, cm1 cm1Var, em1 em1Var) {
        super(bf0Var);
        em1 em1Var2;
        String str2;
        this.f10391s = bf0Var;
        this.H = cf0Var;
        this.I = str;
        this.L = z10;
        this.f10392t = w7Var;
        this.f10393u = ysVar;
        this.f10394v = o90Var;
        this.f10395w = lVar;
        this.f10396x = aVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.f10389q0 = windowManager;
        s1 s1Var = s.B.f5789c;
        DisplayMetrics O = s1.O(windowManager);
        this.y = O;
        this.f10397z = O.density;
        this.f10390r0 = wjVar;
        this.A = cm1Var;
        this.B = em1Var;
        this.f10383k0 = new f1(bf0Var.f6505a, this, this);
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e10) {
            g1.h("Unable to enable Javascript.", e10);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setMixedContentMode(2);
        s sVar = s.B;
        settings.setUserAgentString(sVar.f5789c.D(bf0Var, o90Var.f12051s));
        x1 x1Var = sVar.f5791e;
        Context context = getContext();
        Objects.requireNonNull(x1Var);
        z0.a(context, new t1(context, settings, 0));
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        W0();
        addJavascriptInterface(new oe0(this, new hh0(this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        a1();
        qs qsVar = new qs(this.I);
        ps psVar = new ps(qsVar);
        this.f10377e0 = psVar;
        synchronized (qsVar.f12989c) {
        }
        if (((Boolean) jo.f10145d.f10148c.a(es.f8120j1)).booleanValue() && (em1Var2 = this.B) != null && (str2 = em1Var2.f8004b) != null) {
            qsVar.b("gqi", str2);
        }
        os d5 = qs.d();
        this.f10375c0 = d5;
        psVar.c("native:view_create", d5);
        this.f10376d0 = null;
        this.f10374b0 = null;
        Objects.requireNonNull(sVar.f5791e);
        if (b1.f16447b == null) {
            b1.f16447b = new b1();
        }
        b1 b1Var = b1.f16447b;
        g1.a("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(bf0Var);
        if (!defaultUserAgent.equals(b1Var.f16448a)) {
            if (i.a(bf0Var) == null) {
                bf0Var.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(bf0Var)).apply();
            }
            b1Var.f16448a = defaultUserAgent;
        }
        g1.a("User agent is updated.");
        sVar.f5793g.f16043i.incrementAndGet();
    }

    @Override // m4.vd0, m4.we0
    public final View A() {
        return this;
    }

    @Override // m4.vd0
    public final void A0() {
        if (this.f10376d0 == null) {
            Objects.requireNonNull(this.f10377e0);
            os d5 = qs.d();
            this.f10376d0 = d5;
            this.f10377e0.c("native:view_load", d5);
        }
    }

    @Override // m4.vd0
    public final synchronized boolean B() {
        return this.W > 0;
    }

    @Override // m4.js0
    public final void B0() {
        ce0 ce0Var = this.E;
        if (ce0Var != null) {
            ce0Var.B0();
        }
    }

    @Override // m4.vd0
    public final synchronized boolean C() {
        return this.J;
    }

    @Override // m4.vd0
    public final synchronized void C0(String str, String str2) {
        String str3;
        if (j0()) {
            g1.j("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        String[] strArr = new String[1];
        String str4 = (String) jo.f10145d.f10148c.a(es.H);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", str4);
            jSONObject.put("sdk", "Google Mobile Ads");
            jSONObject.put("sdkVersion", "12.4.51-000");
            str3 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
        } catch (JSONException e10) {
            g1.k("Unable to build MRAID_ENV", e10);
            str3 = null;
        }
        strArr[0] = str3;
        super.loadDataWithBaseURL(str, te0.a(str2, strArr), "text/html", "UTF-8", null);
    }

    @Override // m4.vd0
    public final WebViewClient D() {
        return this.E;
    }

    @Override // m4.vd0
    public final void D0(String str, lx<? super vd0> lxVar) {
        ce0 ce0Var = this.E;
        if (ce0Var != null) {
            ce0Var.w(str, lxVar);
        }
    }

    @Override // m4.vd0
    public final WebView E() {
        return this;
    }

    @Override // m4.vd0
    public final synchronized String E0() {
        return this.I;
    }

    @Override // m4.vd0
    public final synchronized void F(boolean z10) {
        n nVar;
        int i10 = this.W + (true != z10 ? -1 : 1);
        this.W = i10;
        if (i10 > 0 || (nVar = this.F) == null) {
            return;
        }
        synchronized (nVar.E) {
            nVar.G = true;
            h hVar = nVar.F;
            if (hVar != null) {
                h1 h1Var = s1.f16555i;
                h1Var.removeCallbacks(hVar);
                h1Var.post(nVar.F);
            }
        }
    }

    @Override // m4.vd0
    public final void F0(cm1 cm1Var, em1 em1Var) {
        this.A = cm1Var;
        this.B = em1Var;
    }

    @Override // m4.vd0, m4.ue0
    public final w7 G() {
        return this.f10392t;
    }

    @Override // m4.se0
    public final void G0(boolean z10, int i10, String str, String str2, boolean z11) {
        ce0 ce0Var = this.E;
        boolean w02 = ce0Var.f6792s.w0();
        boolean h10 = ce0.h(w02, ce0Var.f6792s);
        boolean z12 = true;
        if (!h10 && z11) {
            z12 = false;
        }
        ym ymVar = h10 ? null : ce0Var.f6796w;
        be0 be0Var = w02 ? null : new be0(ce0Var.f6792s, ce0Var.f6797x);
        lw lwVar = ce0Var.A;
        nw nwVar = ce0Var.B;
        x xVar = ce0Var.I;
        vd0 vd0Var = ce0Var.f6792s;
        ce0Var.v(new AdOverlayInfoParcel(ymVar, be0Var, lwVar, nwVar, xVar, vd0Var, z10, i10, str, str2, vd0Var.m(), z12 ? null : ce0Var.C));
    }

    @Override // m4.vd0
    public final Context H() {
        return this.f10391s.f6507c;
    }

    @Override // m4.se0
    public final void H0(boolean z10, int i10, String str, boolean z11) {
        ce0 ce0Var = this.E;
        boolean w02 = ce0Var.f6792s.w0();
        boolean h10 = ce0.h(w02, ce0Var.f6792s);
        boolean z12 = h10 || !z11;
        ym ymVar = h10 ? null : ce0Var.f6796w;
        be0 be0Var = w02 ? null : new be0(ce0Var.f6792s, ce0Var.f6797x);
        lw lwVar = ce0Var.A;
        nw nwVar = ce0Var.B;
        x xVar = ce0Var.I;
        vd0 vd0Var = ce0Var.f6792s;
        ce0Var.v(new AdOverlayInfoParcel(ymVar, be0Var, lwVar, nwVar, xVar, vd0Var, z10, i10, str, vd0Var.m(), z12 ? null : ce0Var.C));
    }

    @Override // m4.vd0
    public final synchronized void I(a aVar) {
        this.G = aVar;
    }

    @Override // m4.qz
    public final void I0(String str, String str2) {
        S0(b.a(new StringBuilder(str.length() + 3 + String.valueOf(str2).length()), str, "(", str2, ");"));
    }

    @Override // m4.vd0
    public final synchronized ui J() {
        return this.V;
    }

    @Override // m4.vd0
    public final synchronized void J0(cf0 cf0Var) {
        this.H = cf0Var;
        requestLayout();
    }

    @Override // m4.vd0
    public final synchronized ku K() {
        return this.T;
    }

    @Override // m4.vd0
    public final synchronized void K0(boolean z10) {
        this.O = z10;
    }

    @Override // m4.vd0
    public final void L() {
        setBackgroundColor(0);
    }

    @Override // m4.vd0
    public final synchronized void L0(ui uiVar) {
        this.V = uiVar;
    }

    @Override // m4.vd0
    public final void M(String str, fk0 fk0Var) {
        ce0 ce0Var = this.E;
        if (ce0Var != null) {
            synchronized (ce0Var.f6795v) {
                List<lx<? super vd0>> list = ce0Var.f6794u.get(str);
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    for (lx<? super vd0> lxVar : list) {
                        if ((lxVar instanceof oz) && ((oz) lxVar).f12313s.equals((lx) fk0Var.f8585t)) {
                            arrayList.add(lxVar);
                        }
                    }
                    list.removeAll(arrayList);
                }
            }
        }
    }

    @Override // l3.l
    public final synchronized void M0() {
        l lVar = this.f10395w;
        if (lVar != null) {
            lVar.M0();
        }
    }

    @Override // m4.ym
    public final void N() {
        ce0 ce0Var = this.E;
        if (ce0Var != null) {
            ce0Var.N();
        }
    }

    @Override // m4.vd0
    public final boolean N0() {
        return false;
    }

    @Override // m4.vd0
    public final synchronized void O(iu iuVar) {
        this.U = iuVar;
    }

    @Override // m4.se0
    public final void O0(r0 r0Var, v61 v61Var, f11 f11Var, ep1 ep1Var, String str, String str2) {
        ce0 ce0Var = this.E;
        vd0 vd0Var = ce0Var.f6792s;
        ce0Var.v(new AdOverlayInfoParcel(vd0Var, vd0Var.m(), r0Var, v61Var, f11Var, ep1Var, str, str2));
    }

    @Override // m4.vd0
    public final synchronized void P() {
        g1.a("Destroying WebView!");
        X0();
        s1.f16555i.post(new cj(this, 3));
    }

    @Override // m4.qz
    public final void P0(String str, JSONObject jSONObject) {
        I0(str, jSONObject.toString());
    }

    @Override // m4.fb0
    public final void Q() {
        n V = V();
        if (V != null) {
            V.C.f5963t = true;
        }
    }

    @Override // m4.vd0
    public final void Q0(boolean z10) {
        this.E.R = z10;
    }

    @Override // m4.vd0, m4.fb0
    public final synchronized cf0 R() {
        return this.H;
    }

    @Override // m4.vd0
    public final void S() {
        f1 f1Var = this.f10383k0;
        f1Var.f16468e = true;
        if (f1Var.f16467d) {
            f1Var.a();
        }
    }

    public final void S0(String str) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        synchronized (this) {
            bool = this.N;
        }
        if (bool == null) {
            synchronized (this) {
                z80 z80Var = s.B.f5793g;
                synchronized (z80Var.f16035a) {
                    bool3 = z80Var.f16042h;
                }
                this.N = bool3;
                if (bool3 == null) {
                    try {
                        evaluateJavascript("(function(){})()", null);
                        U0(Boolean.TRUE);
                    } catch (IllegalStateException unused) {
                        U0(Boolean.FALSE);
                    }
                }
            }
        }
        synchronized (this) {
            bool2 = this.N;
        }
        if (bool2.booleanValue()) {
            synchronized (this) {
                if (!j0()) {
                    evaluateJavascript(str, null);
                } else {
                    g1.j("#004 The webview is destroyed. Ignoring action.");
                }
            }
            return;
        }
        T0(str.length() != 0 ? "javascript:".concat(str) : new String("javascript:"));
    }

    @Override // m4.vd0, m4.ne0
    public final em1 T() {
        return this.B;
    }

    public final synchronized void T0(String str) {
        if (!j0()) {
            loadUrl(str);
        } else {
            g1.j("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // m4.vd0
    public final synchronized void U(boolean z10) {
        boolean z11 = this.L;
        this.L = z10;
        W0();
        if (z10 != z11) {
            if (!((Boolean) jo.f10145d.f10148c.a(es.I)).booleanValue() || !this.H.d()) {
                try {
                    l("onStateChanged", new JSONObject().put("state", true != z10 ? "default" : "expanded"));
                } catch (JSONException e10) {
                    g1.h("Error occurred while dispatching state change.", e10);
                }
            }
        }
    }

    public final void U0(Boolean bool) {
        synchronized (this) {
            this.N = bool;
        }
        z80 z80Var = s.B.f5793g;
        synchronized (z80Var.f16035a) {
            z80Var.f16042h = bool;
        }
    }

    @Override // m4.vd0
    public final synchronized n V() {
        return this.F;
    }

    public final boolean V0() {
        DisplayMetrics displayMetrics;
        DisplayMetrics displayMetrics2;
        int i10;
        int i11;
        boolean z10 = false;
        if (this.E.a() || this.E.b()) {
            io ioVar = io.f9708f;
            g90 g90Var = ioVar.f9709a;
            int round = Math.round(displayMetrics.widthPixels / this.y.density);
            g90 g90Var2 = ioVar.f9709a;
            int round2 = Math.round(displayMetrics2.heightPixels / this.y.density);
            Activity activity = this.f10391s.f6505a;
            if (activity == null || activity.getWindow() == null) {
                i10 = round;
                i11 = round2;
            } else {
                s1 s1Var = s.B.f5789c;
                int[] r10 = s1.r(activity);
                g90 g90Var3 = ioVar.f9709a;
                i10 = g90.h(this.y, r10[0]);
                g90 g90Var4 = ioVar.f9709a;
                i11 = g90.h(this.y, r10[1]);
            }
            int i12 = this.f10385m0;
            if (i12 == round && this.f10384l0 == round2 && this.f10386n0 == i10 && this.f10387o0 == i11) {
                return false;
            }
            if (i12 != round || this.f10384l0 != round2) {
                z10 = true;
            }
            this.f10385m0 = round;
            this.f10384l0 = round2;
            this.f10386n0 = i10;
            this.f10387o0 = i11;
            try {
                l("onScreenInfoChanged", new JSONObject().put("width", round).put("height", round2).put("maxSizeWidth", i10).put("maxSizeHeight", i11).put("density", this.y.density).put("rotation", this.f10389q0.getDefaultDisplay().getRotation()));
            } catch (JSONException e10) {
                g1.h("Error occurred while obtaining screen information.", e10);
            }
            return z10;
        }
        return false;
    }

    @Override // m4.fb0
    public final void W(boolean z10) {
        this.E.D = false;
    }

    public final synchronized void W0() {
        cm1 cm1Var = this.A;
        if (cm1Var != null && cm1Var.f7053k0) {
            g1.e("Disabling hardware acceleration on an overlay.");
            synchronized (this) {
                if (!this.M) {
                    setLayerType(1, null);
                }
                this.M = true;
            }
            return;
        }
        if (!this.L && !this.H.d()) {
            g1.e("Enabling hardware acceleration on an AdView.");
            synchronized (this) {
                if (this.M) {
                    setLayerType(0, null);
                }
                this.M = false;
            }
            return;
        }
        g1.e("Enabling hardware acceleration on an overlay.");
        synchronized (this) {
            if (this.M) {
                setLayerType(0, null);
            }
            this.M = false;
        }
    }

    @Override // m4.fb0
    public final synchronized void X(int i10) {
        this.f10378f0 = i10;
    }

    public final synchronized void X0() {
        if (!this.f10382j0) {
            this.f10382j0 = true;
            s.B.f5793g.f16043i.decrementAndGet();
        }
    }

    @Override // m4.vd0
    public final synchronized void Y(n nVar) {
        this.f10381i0 = nVar;
    }

    public final void Y0(boolean z10) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != z10 ? "0" : "1");
        a("onAdVisibilityChanged", hashMap);
    }

    @Override // m4.vd0
    public final synchronized boolean Z() {
        return this.O;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<java.lang.String, m4.uc0>] */
    public final synchronized void Z0() {
        ?? r02 = this.f10388p0;
        if (r02 != 0) {
            for (uc0 uc0Var : r02.values()) {
                uc0Var.a();
            }
        }
        this.f10388p0 = null;
    }

    @Override // m4.jz
    public final void a(String str, Map<String, ?> map) {
        try {
            l(str, s.B.f5789c.F(map));
        } catch (JSONException unused) {
            g1.j("Could not convert parameters to JSON.");
        }
    }

    @Override // m4.vd0
    public final void a0() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.concurrent.ArrayBlockingQueue, java.util.concurrent.BlockingQueue<m4.qs>] */
    public final void a1() {
        ps psVar = this.f10377e0;
        if (psVar == null) {
            return;
        }
        qs qsVar = (qs) psVar.f12617t;
        hs b10 = s.B.f5793g.b();
        if (b10 == null) {
            return;
        }
        b10.f9434a.offer(qsVar);
    }

    @Override // m4.qz
    public final void b(String str) {
        throw null;
    }

    @Override // m4.vd0
    public final synchronized a b0() {
        return this.G;
    }

    @Override // m4.vd0
    public final synchronized void c0(boolean z10) {
        j jVar;
        int i10 = 0;
        if (z10) {
            setBackgroundColor(0);
        }
        n nVar = this.F;
        if (nVar != null) {
            if (z10) {
                jVar = nVar.C;
            } else {
                jVar = nVar.C;
                i10 = -16777216;
            }
            jVar.setBackgroundColor(i10);
        }
    }

    @Override // m4.fb0
    public final int d() {
        return this.f10380h0;
    }

    @Override // m4.fb0
    public final void d0(boolean z10, long j3) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", true != z10 ? "0" : "1");
        hashMap.put("duration", Long.toString(j3));
        a("onCacheAccessComplete", hashMap);
    }

    @Override // android.webkit.WebView, m4.vd0
    public final synchronized void destroy() {
        a1();
        f1 f1Var = this.f10383k0;
        f1Var.f16468e = false;
        f1Var.b();
        n nVar = this.F;
        if (nVar != null) {
            nVar.a();
            this.F.l();
            this.F = null;
        }
        this.G = null;
        this.E.x();
        this.V = null;
        this.f10395w = null;
        setOnClickListener(null);
        setOnTouchListener(null);
        if (this.K) {
            return;
        }
        s.B.f5810z.e(this);
        Z0();
        this.K = true;
        if (((Boolean) jo.f10145d.f10148c.a(es.D6)).booleanValue()) {
            g1.a("Initiating WebView self destruct sequence in 3...");
            g1.a("Loading blank page in WebView, 2...");
            synchronized (this) {
                try {
                    super.loadUrl("about:blank");
                } catch (Throwable th) {
                    s.B.f5793g.g(th, "AdWebViewImpl.loadUrlUnsafe");
                    g1.k("Could not call loadUrl in destroy(). ", th);
                }
            }
            return;
        }
        g1.a("Destroying the WebView immediately...");
        P();
    }

    @Override // m4.fb0
    public final int e() {
        return this.f10379g0;
    }

    @Override // m4.vd0
    public final synchronized n e0() {
        return this.f10381i0;
    }

    @Override // android.webkit.WebView
    @TargetApi(19)
    public final synchronized void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (!j0()) {
            super.evaluateJavascript(str, valueCallback);
            return;
        }
        g1.l("#004 The webview is destroyed. Ignoring action.", null);
        if (valueCallback == null) {
            return;
        }
        valueCallback.onReceiveValue(null);
    }

    @Override // m4.fb0
    public final synchronized int f() {
        return this.f10378f0;
    }

    @Override // m4.vd0
    public final synchronized void f0(n nVar) {
        this.F = nVar;
    }

    public final void finalize() {
        try {
            synchronized (this) {
                if (!this.K) {
                    this.E.x();
                    s.B.f5810z.e(this);
                    Z0();
                    X0();
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // l3.l
    public final synchronized void g() {
        l lVar = this.f10395w;
        if (lVar != null) {
            lVar.g();
        }
    }

    @Override // m4.vd0
    public final void g0() {
        js.b((qs) this.f10377e0.f12617t, this.f10375c0, "aeh2");
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f10394v.f12051s);
        a("onhide", hashMap);
    }

    @Override // m4.fb0
    public final int h() {
        return getMeasuredHeight();
    }

    @Override // m4.vd0
    public final tz1<String> h0() {
        ys ysVar = this.f10393u;
        return ysVar == null ? mz1.m(null) : ysVar.a();
    }

    @Override // m4.fb0
    public final int i() {
        return getMeasuredWidth();
    }

    @Override // m4.vd0
    public final synchronized void i0(ku kuVar) {
        this.T = kuVar;
    }

    @Override // m4.fb0
    public final os j() {
        return this.f10375c0;
    }

    @Override // m4.vd0
    public final synchronized boolean j0() {
        return this.K;
    }

    @Override // m4.vd0, m4.fb0
    public final ps k() {
        return this.f10377e0;
    }

    @Override // m4.vd0
    public final void k0(int i10) {
        if (i10 == 0) {
            js.b((qs) this.f10377e0.f12617t, this.f10375c0, "aebb2");
        }
        js.b((qs) this.f10377e0.f12617t, this.f10375c0, "aeh2");
        Objects.requireNonNull(this.f10377e0);
        ((qs) this.f10377e0.f12617t).b("close_type", String.valueOf(i10));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i10));
        hashMap.put("version", this.f10394v.f12051s);
        a("onhide", hashMap);
    }

    @Override // m4.jz
    public final void l(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        String sb2 = sb.toString();
        g1.e(sb2.length() != 0 ? "Dispatching AFMA event: ".concat(sb2) : new String("Dispatching AFMA event: "));
        S0(sb.toString());
    }

    @Override // android.webkit.WebView, m4.vd0
    public final synchronized void loadData(String str, String str2, String str3) {
        if (!j0()) {
            super.loadData(str, str2, str3);
        } else {
            g1.j("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, m4.vd0
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (!j0()) {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            g1.j("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, m4.vd0
    public final synchronized void loadUrl(String str) {
        if (!j0()) {
            super.loadUrl(str);
        } else {
            g1.j("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // m4.vd0, m4.ve0, m4.fb0
    public final o90 m() {
        return this.f10394v;
    }

    @Override // m4.se0
    public final void m0(f fVar, boolean z10) {
        this.E.u(fVar, z10);
    }

    @Override // m4.vd0, m4.pe0, m4.fb0
    public final Activity n() {
        return this.f10391s.f6505a;
    }

    @Override // m4.fb0
    public final ua0 n0() {
        return null;
    }

    @Override // m4.vd0, m4.fb0
    public final l3.a o() {
        return this.f10396x;
    }

    @Override // m4.vd0
    public final void o0() {
        if (this.f10374b0 == null) {
            js.b((qs) this.f10377e0.f12617t, this.f10375c0, "aes2");
            Objects.requireNonNull(this.f10377e0);
            os d5 = qs.d();
            this.f10374b0 = d5;
            this.f10377e0.c("native:view_show", d5);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f10394v.f12051s);
        a("onshow", hashMap);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        boolean z10 = true;
        if (!j0()) {
            f1 f1Var = this.f10383k0;
            f1Var.f16467d = true;
            if (f1Var.f16468e) {
                f1Var.a();
            }
        }
        boolean z11 = this.R;
        ce0 ce0Var = this.E;
        if (ce0Var == null || !ce0Var.b()) {
            z10 = z11;
        } else {
            if (!this.S) {
                synchronized (this.E.f6795v) {
                }
                synchronized (this.E.f6795v) {
                }
                this.S = true;
            }
            V0();
        }
        Y0(z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ce0 ce0Var;
        synchronized (this) {
            try {
                if (!j0()) {
                    f1 f1Var = this.f10383k0;
                    f1Var.f16467d = false;
                    f1Var.b();
                }
                super.onDetachedFromWindow();
                if (this.S && (ce0Var = this.E) != null && ce0Var.b() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                    synchronized (this.E.f6795v) {
                    }
                    synchronized (this.E.f6795v) {
                    }
                    this.S = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Y0(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j3) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            s1 s1Var = s.B.f5789c;
            s1.n(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            g1.e(sb.toString());
        }
    }

    @Override // android.webkit.WebView, android.view.View
    @TargetApi(21)
    public final void onDraw(Canvas canvas) {
        if (j0()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean V0 = V0();
        n V = V();
        if (V == null || !V0 || !V.D) {
            return;
        }
        V.D = false;
        V.f5973u.o0();
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0157 A[Catch: all -> 0x01e1, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:23:0x002d, B:31:0x003a, B:33:0x004c, B:36:0x0051, B:38:0x0058, B:42:0x0062, B:45:0x0067, B:48:0x0079, B:52:0x0084, B:54:0x008a, B:62:0x009f, B:64:0x00b1, B:66:0x00cd, B:67:0x00d1, B:68:0x00d5, B:71:0x00da, B:74:0x00df, B:76:0x00e5, B:79:0x00f0, B:88:0x0114, B:90:0x011a, B:95:0x0122, B:97:0x0134, B:99:0x0142, B:108:0x0157, B:110:0x01a4, B:111:0x01a7, B:113:0x01ae, B:118:0x01bb, B:120:0x01c1, B:121:0x01c4, B:123:0x01c8, B:124:0x01d1, B:127:0x01dc), top: B:132:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01bb A[Catch: all -> 0x01e1, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:23:0x002d, B:31:0x003a, B:33:0x004c, B:36:0x0051, B:38:0x0058, B:42:0x0062, B:45:0x0067, B:48:0x0079, B:52:0x0084, B:54:0x008a, B:62:0x009f, B:64:0x00b1, B:66:0x00cd, B:67:0x00d1, B:68:0x00d5, B:71:0x00da, B:74:0x00df, B:76:0x00e5, B:79:0x00f0, B:88:0x0114, B:90:0x011a, B:95:0x0122, B:97:0x0134, B:99:0x0142, B:108:0x0157, B:110:0x01a4, B:111:0x01a7, B:113:0x01ae, B:118:0x01bb, B:120:0x01c1, B:121:0x01c4, B:123:0x01c8, B:124:0x01d1, B:127:0x01dc), top: B:132:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0134 A[Catch: all -> 0x01e1, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x000d, B:10:0x0013, B:12:0x0017, B:23:0x002d, B:31:0x003a, B:33:0x004c, B:36:0x0051, B:38:0x0058, B:42:0x0062, B:45:0x0067, B:48:0x0079, B:52:0x0084, B:54:0x008a, B:62:0x009f, B:64:0x00b1, B:66:0x00cd, B:67:0x00d1, B:68:0x00d5, B:71:0x00da, B:74:0x00df, B:76:0x00e5, B:79:0x00f0, B:88:0x0114, B:90:0x011a, B:95:0x0122, B:97:0x0134, B:99:0x0142, B:108:0x0157, B:110:0x01a4, B:111:0x01a7, B:113:0x01ae, B:118:0x01bb, B:120:0x01c1, B:121:0x01c4, B:123:0x01c8, B:124:0x01d1, B:127:0x01dc), top: B:132:0x0001 }] */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    @android.annotation.SuppressLint({"DrawAllocation"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void onMeasure(int r10, int r11) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.ke0.onMeasure(int, int):void");
    }

    @Override // android.webkit.WebView, m4.vd0
    public final void onPause() {
        if (j0()) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception e10) {
            g1.h("Could not pause webview.", e10);
        }
    }

    @Override // android.webkit.WebView, m4.vd0
    public final void onResume() {
        if (j0()) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception e10) {
            g1.h("Could not resume webview.", e10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    @Override // android.webkit.WebView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            m4.ce0 r0 = r5.E
            boolean r0 = r0.b()
            if (r0 == 0) goto L22
            m4.ce0 r0 = r5.E
            java.lang.Object r1 = r0.f6795v
            monitor-enter(r1)
            boolean r0 = r0.H     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L22
            monitor-enter(r5)
            m4.ku r0 = r5.T     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L1a
            r0.d(r6)     // Catch: java.lang.Throwable -> L1c
        L1a:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L1c
            goto L64
        L1c:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L1c
            throw r6
        L1f:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            throw r6
        L22:
            m4.w7 r0 = r5.f10392t
            if (r0 == 0) goto L29
            r0.b(r6)
        L29:
            m4.ys r0 = r5.f10393u
            if (r0 == 0) goto L64
            int r1 = r6.getAction()
            r2 = 1
            if (r1 != r2) goto L4a
            long r1 = r6.getEventTime()
            android.view.MotionEvent r3 = r0.f15896a
            long r3 = r3.getEventTime()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L43
            goto L4a
        L43:
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r6)
            r0.f15896a = r1
            goto L64
        L4a:
            int r1 = r6.getAction()
            if (r1 != 0) goto L64
            long r1 = r6.getEventTime()
            android.view.MotionEvent r3 = r0.f15897b
            long r3 = r3.getEventTime()
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L64
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r6)
            r0.f15897b = r1
        L64:
            boolean r0 = r5.j0()
            if (r0 == 0) goto L6c
            r6 = 0
            return r6
        L6c:
            boolean r6 = super.onTouchEvent(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.ke0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // m4.vd0, m4.fb0
    public final synchronized me0 p() {
        return this.Q;
    }

    @Override // m4.fb0
    public final void p0(int i10) {
    }

    @Override // m4.vd0, m4.fb0
    public final synchronized void q(me0 me0Var) {
        if (this.Q != null) {
            g1.g("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.Q = me0Var;
        }
    }

    @Override // m4.vd0
    public final /* synthetic */ af0 q0() {
        return this.E;
    }

    @Override // m4.fb0
    public final synchronized String r() {
        em1 em1Var = this.B;
        if (em1Var != null) {
            return em1Var.f8004b;
        }
        return null;
    }

    @Override // m4.vd0
    public final void r0(Context context) {
        this.f10391s.setBaseContext(context);
        this.f10383k0.f16465b = this.f10391s.f6505a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, m4.uc0>] */
    @Override // m4.fb0
    public final synchronized uc0 s(String str) {
        ?? r02 = this.f10388p0;
        if (r02 == 0) {
            return null;
        }
        return (uc0) r02.get(str);
    }

    @Override // m4.vd0
    public final synchronized void s0(int i10) {
        n nVar = this.F;
        if (nVar != null) {
            nVar.S3(i10);
        }
    }

    @Override // android.webkit.WebView, m4.vd0
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof ce0) {
            this.E = (ce0) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (j0()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e10) {
            g1.h("Could not stop loading webview.", e10);
        }
    }

    @Override // m4.vd0, m4.md0
    public final cm1 t() {
        return this.A;
    }

    @Override // m4.vd0
    public final void t0() {
        throw null;
    }

    @Override // m4.fb0
    public final synchronized void u() {
        iu iuVar = this.U;
        if (iuVar != null) {
            s1.f16555i.post(new m8((fy0) iuVar, 3));
        }
    }

    @Override // m4.vd0
    public final synchronized void u0(boolean z10) {
        n nVar = this.F;
        if (nVar != null) {
            nVar.R3(this.E.a(), z10);
        } else {
            this.J = z10;
        }
    }

    @Override // m4.fb0
    public final synchronized String v() {
        return this.P;
    }

    @Override // m4.se0
    public final void w(boolean z10, int i10, boolean z11) {
        ce0 ce0Var = this.E;
        boolean h10 = ce0.h(ce0Var.f6792s.w0(), ce0Var.f6792s);
        boolean z12 = true;
        if (!h10 && z11) {
            z12 = false;
        }
        ym ymVar = h10 ? null : ce0Var.f6796w;
        p pVar = ce0Var.f6797x;
        x xVar = ce0Var.I;
        vd0 vd0Var = ce0Var.f6792s;
        ce0Var.v(new AdOverlayInfoParcel(ymVar, pVar, xVar, vd0Var, z10, i10, vd0Var.m(), z12 ? null : ce0Var.C));
    }

    @Override // m4.vd0
    public final synchronized boolean w0() {
        return this.L;
    }

    @Override // m4.rh
    public final void x(qh qhVar) {
        boolean z10;
        synchronized (this) {
            z10 = qhVar.f12866j;
            this.R = z10;
        }
        Y0(z10);
    }

    @Override // m4.vd0
    public final boolean x0(final boolean z10, final int i10) {
        destroy();
        this.f10390r0.a(new vj() { // from class: m4.ie0
            @Override // m4.vj
            public final void c(cl clVar) {
                boolean z11 = z10;
                int i11 = i10;
                int i12 = ke0.f10372s0;
                wm v10 = xm.v();
                if (((xm) v10.f9883t).z() != z11) {
                    if (v10.f9884u) {
                        v10.m();
                        v10.f9884u = false;
                    }
                    xm.x((xm) v10.f9883t, z11);
                }
                if (v10.f9884u) {
                    v10.m();
                    v10.f9884u = false;
                }
                xm.y((xm) v10.f9883t, i11);
                xm k10 = v10.k();
                if (clVar.f9884u) {
                    clVar.m();
                    clVar.f9884u = false;
                }
                dl.G((dl) clVar.f9883t, k10);
            }
        });
        this.f10390r0.b(10003);
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<java.lang.String, m4.uc0>] */
    @Override // m4.vd0, m4.fb0
    public final synchronized void y(String str, uc0 uc0Var) {
        if (this.f10388p0 == null) {
            this.f10388p0 = new HashMap();
        }
        this.f10388p0.put(str, uc0Var);
    }

    @Override // m4.fb0
    public final void y0(int i10) {
        this.f10379g0 = i10;
    }

    @Override // m4.fb0
    public final void z(int i10) {
        this.f10380h0 = i10;
    }

    @Override // m4.vd0
    public final void z0(String str, lx<? super vd0> lxVar) {
        ce0 ce0Var = this.E;
        if (ce0Var != null) {
            synchronized (ce0Var.f6795v) {
                List<lx<? super vd0>> list = ce0Var.f6794u.get(str);
                if (list != null) {
                    list.remove(lxVar);
                }
            }
        }
    }
}
