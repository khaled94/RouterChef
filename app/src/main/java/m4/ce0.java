package m4;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import d.d;
import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import l3.b;
import l3.s;
import m0.f0;
import m0.z;
import m3.f;
import m3.p;
import m3.x;
import n3.g1;
import n3.l1;
import n3.s1;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class ce0 extends WebViewClient implements af0 {
    public static final /* synthetic */ int U = 0;
    public lw A;
    public nw B;
    public js0 C;
    public boolean D;
    public boolean E;
    @GuardedBy("lock")
    public boolean F;
    @GuardedBy("lock")
    public boolean G;
    @GuardedBy("lock")
    public boolean H;
    public x I;
    public q30 J;
    public b K;
    public g70 M;
    public zp1 N;
    public boolean O;
    public boolean P;
    public int Q;
    public boolean R;
    public zd0 T;

    /* renamed from: s */
    public final vd0 f6792s;

    /* renamed from: t */
    public final wj f6793t;

    /* renamed from: w */
    public ym f6796w;

    /* renamed from: x */
    public p f6797x;
    public ye0 y;

    /* renamed from: z */
    public ze0 f6798z;

    /* renamed from: u */
    public final HashMap<String, List<lx<? super vd0>>> f6794u = new HashMap<>();

    /* renamed from: v */
    public final Object f6795v = new Object();
    public m30 L = null;
    public final HashSet<String> S = new HashSet<>(Arrays.asList(((String) jo.f10145d.f10148c.a(es.f8245z3)).split(",")));

    public ce0(vd0 vd0Var, wj wjVar, boolean z10) {
        q30 q30Var = new q30(vd0Var, ((he0) vd0Var).H(), new rr(((View) vd0Var).getContext()));
        this.f6793t = wjVar;
        this.f6792s = vd0Var;
        this.F = z10;
        this.J = q30Var;
    }

    public static WebResourceResponse d() {
        if (((Boolean) jo.f10145d.f10148c.a(es.f8189s0)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    public static final boolean h(boolean z10, vd0 vd0Var) {
        return z10 && !vd0Var.R().d() && !vd0Var.E0().equals("interstitial_mb");
    }

    @Override // m4.js0
    public final void B0() {
        js0 js0Var = this.C;
        if (js0Var != null) {
            js0Var.B0();
        }
    }

    @Override // m4.ym
    public final void N() {
        ym ymVar = this.f6796w;
        if (ymVar != null) {
            ymVar.N();
        }
    }

    public final boolean a() {
        boolean z10;
        synchronized (this.f6795v) {
            z10 = this.F;
        }
        return z10;
    }

    public final boolean b() {
        boolean z10;
        synchronized (this.f6795v) {
            z10 = this.G;
        }
        return z10;
    }

    public final void c(ym ymVar, lw lwVar, p pVar, nw nwVar, x xVar, boolean z10, ox oxVar, b bVar, e7 e7Var, g70 g70Var, final v61 v61Var, final zp1 zp1Var, f11 f11Var, ep1 ep1Var, mx mxVar, final js0 js0Var) {
        lx<? super vd0> lxVar;
        b bVar2 = bVar == null ? new b(this.f6792s.getContext(), g70Var) : bVar;
        this.L = new m30(this.f6792s, e7Var);
        this.M = g70Var;
        yr<Boolean> yrVar = es.f8235y0;
        jo joVar = jo.f10145d;
        if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
            w("/adMetadata", new kw(lwVar));
        }
        if (nwVar != null) {
            w("/appEvent", new mw(nwVar));
        }
        w("/backButton", kx.f10599e);
        w("/refresh", kx.f10600f);
        lx<vd0> lxVar2 = kx.f10595a;
        w("/canOpenApp", qw.f13005s);
        w("/canOpenURLs", tw.f14187s);
        w("/canOpenIntents", rw.f13444s);
        w("/close", kx.f10595a);
        w("/customClose", kx.f10596b);
        w("/instrument", kx.f10603i);
        w("/delayPageLoaded", kx.f10605k);
        w("/delayPageClosed", kx.f10606l);
        w("/getLocationInfo", kx.f10607m);
        w("/log", kx.f10597c);
        w("/mraid", new sx(bVar2, this.L, e7Var));
        q30 q30Var = this.J;
        if (q30Var != null) {
            w("/mraidLoaded", q30Var);
        }
        b bVar3 = bVar2;
        w("/open", new wx(bVar2, this.L, v61Var, f11Var, ep1Var));
        w("/precache", new ex(1));
        w("/touch", vw.f14792s);
        w("/video", kx.f10601g);
        w("/videoMeta", kx.f10602h);
        if (v61Var == null || zp1Var == null) {
            w("/click", new pw(js0Var));
            lxVar = uw.f14517s;
        } else {
            w("/click", new lx() { // from class: m4.qm1
                @Override // m4.lx
                public final void a(Object obj, Map map) {
                    js0 js0Var2 = js0.this;
                    zp1 zp1Var2 = zp1Var;
                    v61 v61Var2 = v61Var;
                    vd0 vd0Var = (vd0) obj;
                    kx.b(map, js0Var2);
                    String str = (String) map.get("u");
                    if (str == null) {
                        g1.j("URL missing from click GMSG.");
                    } else {
                        mz1.t(kx.a(vd0Var, str), new sm1(vd0Var, zp1Var2, v61Var2), u90.f14294a);
                    }
                }
            });
            lxVar = new lx() { // from class: m4.rm1
                @Override // m4.lx
                public final void a(Object obj, Map map) {
                    zp1 zp1Var2 = zp1.this;
                    v61 v61Var2 = v61Var;
                    md0 md0Var = (md0) obj;
                    String str = (String) map.get("u");
                    if (str == null) {
                        g1.j("URL missing from httpTrack GMSG.");
                    } else if (!md0Var.t().f7045g0) {
                        zp1Var2.a(str);
                    } else {
                        Objects.requireNonNull(s.B.f5796j);
                        v61Var2.c(new w61(System.currentTimeMillis(), ((ne0) md0Var).T().f8004b, str, 2));
                    }
                }
            };
        }
        w("/httpTrack", lxVar);
        if (s.B.f5809x.l(this.f6792s.getContext())) {
            w("/logScionEvent", new qx(this.f6792s.getContext()));
        }
        if (oxVar != null) {
            w("/setInterstitialProperties", new nx(oxVar));
        }
        if (mxVar != null) {
            if (((Boolean) joVar.f10148c.a(es.S5)).booleanValue()) {
                w("/inspectorNetworkExtras", mxVar);
            }
        }
        this.f6796w = ymVar;
        this.f6797x = pVar;
        this.A = lwVar;
        this.B = nwVar;
        this.I = xVar;
        this.K = bVar3;
        this.C = js0Var;
        this.D = z10;
        this.N = zp1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fc, code lost:
        return n3.s1.q(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.webkit.WebResourceResponse e(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.ce0.e(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    public final void f(Map<String, String> map, List<lx<? super vd0>> list, String str) {
        if (g1.c()) {
            g1.a(str.length() != 0 ? "Received GMSG: ".concat(str) : new String("Received GMSG: "));
            for (String str2 : map.keySet()) {
                String str3 = map.get(str2);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str3);
                g1.a(sb.toString());
            }
        }
        for (lx<? super vd0> lxVar : list) {
            lxVar.a(this.f6792s, map);
        }
    }

    public final void g(final View view, final g70 g70Var, final int i10) {
        if (!g70Var.h() || i10 <= 0) {
            return;
        }
        g70Var.c(view);
        if (!g70Var.h()) {
            return;
        }
        s1.f16555i.postDelayed(new Runnable() { // from class: m4.xd0
            @Override // java.lang.Runnable
            public final void run() {
                ce0.this.g(view, g70Var, i10 - 1);
            }
        }, 100L);
    }

    public final WebResourceResponse i(String str, Map<String, String> map) {
        Throwable e10;
        hj b10;
        try {
            if (nt.f11915a.e().booleanValue() && this.N != null && "oda".equals(Uri.parse(str).getScheme())) {
                this.N.a(str);
                return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
            }
            String b11 = y70.b(str, this.f6792s.getContext(), this.R);
            if (!b11.equals(str)) {
                return e(b11, map);
            }
            kj s10 = kj.s(Uri.parse(str));
            if (s10 != null && (b10 = s.B.f5795i.b(s10)) != null && b10.v()) {
                return new WebResourceResponse("", "", b10.t());
            }
            if (k90.d() && jt.f10184b.e().booleanValue()) {
                return e(str, map);
            }
            return null;
        } catch (Exception e11) {
            e10 = e11;
            s.B.f5793g.g(e10, "AdWebViewClient.interceptRequest");
            return d();
        } catch (NoClassDefFoundError e12) {
            e10 = e12;
            s.B.f5793g.g(e10, "AdWebViewClient.interceptRequest");
            return d();
        }
    }

    public final void j() {
        if (this.y != null && ((this.O && this.Q <= 0) || this.P || this.E)) {
            if (((Boolean) jo.f10145d.f10148c.a(es.f8120j1)).booleanValue() && this.f6792s.k() != null) {
                js.b((qs) this.f6792s.k().f12617t, this.f6792s.j(), "awfllc");
            }
            ye0 ye0Var = this.y;
            boolean z10 = false;
            if (!this.P && !this.E) {
                z10 = true;
            }
            ye0Var.J(z10);
            this.y = null;
        }
        this.f6792s.A0();
    }

    public final void l(Uri uri) {
        String path = uri.getPath();
        List<lx<? super vd0>> list = this.f6794u.get(path);
        if (path != null && list != null) {
            String encodedQuery = uri.getEncodedQuery();
            yr<Boolean> yrVar = es.y3;
            jo joVar = jo.f10145d;
            if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue() && this.S.contains(path) && encodedQuery != null) {
                if (encodedQuery.length() >= ((Integer) joVar.f10148c.a(es.A3)).intValue()) {
                    g1.a(path.length() != 0 ? "Parsing gmsg query params on BG thread: ".concat(path) : new String("Parsing gmsg query params on BG thread: "));
                    s1 s1Var = s.B.f5789c;
                    Objects.requireNonNull(s1Var);
                    l1 l1Var = new l1(uri, 0);
                    ExecutorService executorService = s1Var.f16564h;
                    g02 g02Var = new g02(l1Var);
                    executorService.execute(g02Var);
                    mz1.t(g02Var, new ae0(this, list, path, uri), u90.f14298e);
                    return;
                }
            }
            s1 s1Var2 = s.B.f5789c;
            f(s1.p(uri), list, path);
            return;
        }
        g1.a("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
        if (!((Boolean) jo.f10145d.f10148c.a(es.C4)).booleanValue() || s.B.f5793g.b() == null) {
            return;
        }
        u90.f14294a.execute(new yd0((path == null || path.length() < 2) ? "null" : path.substring(1), 0));
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        g1.a(valueOf.length() != 0 ? "Loading resource: ".concat(valueOf) : new String("Loading resource: "));
        Uri parse = Uri.parse(str);
        if (!"gmsg".equalsIgnoreCase(parse.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            return;
        }
        l(parse);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.f6795v) {
            if (this.f6792s.j0()) {
                g1.a("Blank page loaded, 1...");
                this.f6792s.P();
                return;
            }
            this.O = true;
            ze0 ze0Var = this.f6798z;
            if (ze0Var != null) {
                ze0Var.mo22zza();
                this.f6798z = null;
            }
            j();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        this.E = true;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.f6792s.x0(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    public final void r(int i10, int i11) {
        q30 q30Var = this.J;
        if (q30Var != null) {
            q30Var.g(i10, i11);
        }
        m30 m30Var = this.L;
        if (m30Var != null) {
            synchronized (m30Var.C) {
                m30Var.f11079w = i10;
                m30Var.f11080x = i11;
            }
        }
    }

    public final void s() {
        g70 g70Var = this.M;
        if (g70Var != null) {
            WebView E = this.f6792s.E();
            WeakHashMap<View, f0> weakHashMap = z.f5921a;
            if (z.g.b(E)) {
                g(E, g70Var, 10);
                return;
            }
            zd0 zd0Var = this.T;
            if (zd0Var != null) {
                ((View) this.f6792s).removeOnAttachStateChangeListener(zd0Var);
            }
            zd0 zd0Var2 = new zd0(this, g70Var);
            this.T = zd0Var2;
            ((View) this.f6792s).addOnAttachStateChangeListener(zd0Var2);
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return i(str, Collections.emptyMap());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        g1.a(valueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(valueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri parse = Uri.parse(str);
        if (!"gmsg".equalsIgnoreCase(parse.getScheme()) || !"mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            if (this.D && webView == this.f6792s.E()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    ym ymVar = this.f6796w;
                    if (ymVar != null) {
                        ymVar.N();
                        g70 g70Var = this.M;
                        if (g70Var != null) {
                            g70Var.Y(str);
                        }
                        this.f6796w = null;
                    }
                    js0 js0Var = this.C;
                    if (js0Var != null) {
                        js0Var.B0();
                        this.C = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (!this.f6792s.E().willNotDraw()) {
                try {
                    w7 G = this.f6792s.G();
                    if (G != null && G.c(parse)) {
                        Context context = this.f6792s.getContext();
                        vd0 vd0Var = this.f6792s;
                        parse = G.a(parse, context, (View) vd0Var, vd0Var.n());
                    }
                } catch (x7 unused) {
                    String valueOf2 = String.valueOf(str);
                    g1.j(valueOf2.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf2) : new String("Unable to append parameter to URL: "));
                }
                b bVar = this.K;
                if (bVar == null || bVar.b()) {
                    u(new f("android.intent.action.VIEW", parse.toString(), null, null, null, null, null, null), true);
                } else {
                    this.K.a(str);
                }
            } else {
                String valueOf3 = String.valueOf(str);
                g1.j(valueOf3.length() != 0 ? "AdWebView unable to handle URL: ".concat(valueOf3) : new String("AdWebView unable to handle URL: "));
            }
        } else {
            l(parse);
        }
        return true;
    }

    public final void u(f fVar, boolean z10) {
        boolean w02 = this.f6792s.w0();
        boolean h10 = h(w02, this.f6792s);
        v(new AdOverlayInfoParcel(fVar, h10 ? null : this.f6796w, w02 ? null : this.f6797x, this.I, this.f6792s.m(), this.f6792s, h10 || !z10 ? null : this.C));
    }

    public final void v(AdOverlayInfoParcel adOverlayInfoParcel) {
        f fVar;
        m30 m30Var = this.L;
        boolean z10 = false;
        if (m30Var != null) {
            synchronized (m30Var.C) {
                if (m30Var.J != null) {
                    z10 = true;
                }
            }
        }
        d dVar = s.B.f5788b;
        d.e(this.f6792s.getContext(), adOverlayInfoParcel, true ^ z10);
        g70 g70Var = this.M;
        if (g70Var != null) {
            String str = adOverlayInfoParcel.D;
            if (str == null && (fVar = adOverlayInfoParcel.f2906s) != null) {
                str = fVar.f5953t;
            }
            g70Var.Y(str);
        }
    }

    public final void w(String str, lx<? super vd0> lxVar) {
        synchronized (this.f6795v) {
            List<lx<? super vd0>> list = this.f6794u.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList<>();
                this.f6794u.put(str, list);
            }
            list.add(lxVar);
        }
    }

    public final void x() {
        g70 g70Var = this.M;
        if (g70Var != null) {
            g70Var.b();
            this.M = null;
        }
        zd0 zd0Var = this.T;
        if (zd0Var != null) {
            ((View) this.f6792s).removeOnAttachStateChangeListener(zd0Var);
        }
        synchronized (this.f6795v) {
            this.f6794u.clear();
            this.f6796w = null;
            this.f6797x = null;
            this.y = null;
            this.f6798z = null;
            this.A = null;
            this.B = null;
            this.D = false;
            this.F = false;
            this.G = false;
            this.I = null;
            this.K = null;
            this.J = null;
            m30 m30Var = this.L;
            if (m30Var != null) {
                m30Var.g(true);
                this.L = null;
            }
            this.N = null;
        }
    }
}
