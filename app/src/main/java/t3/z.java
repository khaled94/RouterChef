package t3;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import androidx.fragment.app.b1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import k4.a;
import k4.b;
import m4.dp1;
import m4.e11;
import m4.eh0;
import m4.ep1;
import m4.es;
import m4.f11;
import m4.f80;
import m4.fu1;
import m4.go0;
import m4.gz1;
import m4.h80;
import m4.ho0;
import m4.if0;
import m4.jn;
import m4.jo;
import m4.m80;
import m4.my1;
import m4.mz1;
import m4.nm1;
import m4.o90;
import m4.on;
import m4.r40;
import m4.ty0;
import m4.tz1;
import m4.uz1;
import m4.w7;
import m4.xy1;
import m4.yr;
import m4.zm1;
import m4.zp1;
import n3.v0;
import org.json.JSONObject;
import p1.t;

/* loaded from: classes.dex */
public final class z extends h80 {
    public static final List<String> R = new ArrayList(Arrays.asList("/aclk", "/pcs/click"));
    public static final List<String> S = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    public static final List<String> T = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion"));
    public static final List<String> U = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public final k D;
    public final f11 E;
    public final ep1 F;
    public final zp1 G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final String L;
    public final String M;
    public final o90 O;
    public String P;
    public final String Q;

    /* renamed from: t */
    public final if0 f18626t;

    /* renamed from: u */
    public Context f18627u;

    /* renamed from: v */
    public final w7 f18628v;

    /* renamed from: w */
    public final zm1<ty0> f18629w;

    /* renamed from: x */
    public final uz1 f18630x;
    public final ScheduledExecutorService y;

    /* renamed from: z */
    public r40 f18631z;
    public Point A = new Point();
    public Point B = new Point();
    public final Set<WebView> C = Collections.newSetFromMap(new WeakHashMap());
    public final AtomicInteger N = new AtomicInteger(0);

    public z(if0 if0Var, Context context, w7 w7Var, zm1<ty0> zm1Var, uz1 uz1Var, ScheduledExecutorService scheduledExecutorService, f11 f11Var, ep1 ep1Var, zp1 zp1Var, o90 o90Var) {
        this.f18626t = if0Var;
        this.f18627u = context;
        this.f18628v = w7Var;
        this.f18629w = zm1Var;
        this.f18630x = uz1Var;
        this.y = scheduledExecutorService;
        this.D = if0Var.r();
        this.E = f11Var;
        this.F = ep1Var;
        this.G = zp1Var;
        this.O = o90Var;
        yr<Boolean> yrVar = es.S4;
        jo joVar = jo.f10145d;
        this.H = ((Boolean) joVar.f10148c.a(yrVar)).booleanValue();
        this.I = ((Boolean) joVar.f10148c.a(es.R4)).booleanValue();
        this.J = ((Boolean) joVar.f10148c.a(es.T4)).booleanValue();
        this.K = ((Boolean) joVar.f10148c.a(es.V4)).booleanValue();
        this.L = (String) joVar.f10148c.a(es.U4);
        this.M = (String) joVar.f10148c.a(es.W4);
        this.Q = (String) joVar.f10148c.a(es.X4);
    }

    public static boolean N3(Uri uri) {
        return Q3(uri, T, U);
    }

    public static boolean Q3(Uri uri, List<String> list, List<String> list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            for (String str : list) {
                if (path.contains(str)) {
                    for (String str2 : list2) {
                        if (host.endsWith(str2)) {
                            return true;
                        }
                    }
                    continue;
                }
            }
        }
        return false;
    }

    public static final Uri R3(Uri uri, String str, String str2) {
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("&adurl=");
        if (indexOf == -1) {
            indexOf = uri2.indexOf("?adurl=");
        }
        if (indexOf != -1) {
            int i10 = indexOf + 1;
            StringBuilder sb = new StringBuilder(uri2.substring(0, i10));
            b1.b(sb, str, "=", str2, "&");
            sb.append(uri2.substring(i10));
            return Uri.parse(sb.toString());
        }
        return uri.buildUpon().appendQueryParameter(str, str2).build();
    }

    public static void S3(z zVar, String str, String str2, String str3) {
        yr<Boolean> yrVar = es.N4;
        jo joVar = jo.f10145d;
        if (!((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
            return;
        }
        if (((Boolean) joVar.f10148c.a(es.I5)).booleanValue()) {
            ep1 ep1Var = zVar.F;
            dp1 b10 = dp1.b(str);
            b10.a(str2, str3);
            ep1Var.a(b10);
            return;
        }
        e11 a10 = zVar.E.a();
        a10.a("action", str);
        a10.a(str2, str3);
        a10.c();
    }

    public final eh0 O3(Context context, String str, String str2, on onVar, jn jnVar) {
        fu1 s10 = this.f18626t.s();
        go0 go0Var = new go0();
        go0Var.f8988a = context;
        nm1 nm1Var = new nm1();
        nm1Var.f11841c = str == null ? "adUnitId" : str;
        nm1Var.f11839a = jnVar == null ? new jn(8, -1L, new Bundle(), -1, new ArrayList(), false, -1, false, null, null, null, null, new Bundle(), new Bundle(), new ArrayList(), null, null, false, null, -1, null, new ArrayList(), 60000, null) : jnVar;
        nm1Var.f11840b = onVar == null ? new on() : onVar;
        go0Var.f8989b = nm1Var.a();
        s10.f8649c = new ho0(go0Var);
        t tVar = new t();
        tVar.f16942s = str2;
        s10.f8650d = new b0(tVar);
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        return s10.a();
    }

    public final tz1<String> P3(final String str) {
        final ty0[] ty0VarArr = new ty0[1];
        tz1 p = mz1.p(this.f18629w.a(), new xy1() { // from class: t3.s
            @Override // m4.xy1
            public final tz1 h(Object obj) {
                z zVar = z.this;
                ty0[] ty0VarArr2 = ty0VarArr;
                String str2 = str;
                ty0 ty0Var = (ty0) obj;
                Objects.requireNonNull(zVar);
                ty0VarArr2[0] = ty0Var;
                Context context = zVar.f18627u;
                r40 r40Var = zVar.f18631z;
                Map<String, WeakReference<View>> map = r40Var.f13137t;
                JSONObject d5 = v0.d(context, map, map, r40Var.f13136s);
                JSONObject g10 = v0.g(zVar.f18627u, zVar.f18631z.f13136s);
                JSONObject f10 = v0.f(zVar.f18631z.f13136s);
                JSONObject e10 = v0.e(zVar.f18627u, zVar.f18631z.f13136s);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("asset_view_signal", d5);
                jSONObject.put("ad_view_signal", g10);
                jSONObject.put("scroll_view_signal", f10);
                jSONObject.put("lock_screen_signal", e10);
                if (str2 == "google.afma.nativeAds.getPublisherCustomRenderedClickSignals") {
                    jSONObject.put("click_signal", v0.c(null, zVar.f18627u, zVar.B, zVar.A));
                }
                return ty0Var.a(str2, jSONObject);
            }
        }, this.f18630x);
        ((my1) p).b(new t(this, ty0VarArr, 0), this.f18630x);
        return mz1.i(mz1.o((gz1) mz1.q(gz1.r(p), ((Integer) jo.f10145d.f10148c.a(es.Z4)).intValue(), TimeUnit.MILLISECONDS, this.y), p.f18604a, this.f18630x), Exception.class, o.f18603a, this.f18630x);
    }

    @Override // m4.i80
    public final void o2(a aVar, m80 m80Var, f80 f80Var) {
        Context context = (Context) b.e0(aVar);
        this.f18627u = context;
        mz1.t(O3(context, m80Var.f11105s, m80Var.f11106t, m80Var.f11107u, m80Var.f11108v).a(), new w(this, f80Var), this.f18626t.b());
    }
}
