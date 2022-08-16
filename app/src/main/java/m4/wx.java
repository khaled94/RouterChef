package m4;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import b0.u;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import l3.b;
import l3.s;
import m3.f;
import m3.v;
import m4.js0;
import m4.jz;
import m4.md0;
import m4.ne0;
import m4.pe0;
import m4.se0;
import m4.ue0;
import m4.vd0;
import m4.we0;
import m4.ym;
import n3.g1;
import n3.r0;
import n3.s1;

/* loaded from: classes.dex */
public final class wx<T extends ym & md0 & vd0 & jz & ne0 & pe0 & se0 & js0 & ue0 & we0> implements lx<T> {

    /* renamed from: s */
    public final b f15128s;

    /* renamed from: t */
    public final f11 f15129t;

    /* renamed from: u */
    public final ep1 f15130u;

    /* renamed from: w */
    public final m30 f15132w;

    /* renamed from: x */
    public final v61 f15133x;
    public v y = null;

    /* renamed from: v */
    public final n90 f15131v = new n90(null);

    public wx(b bVar, m30 m30Var, v61 v61Var, f11 f11Var, ep1 ep1Var) {
        this.f15128s = bVar;
        this.f15132w = m30Var;
        this.f15133x = v61Var;
        this.f15129t = f11Var;
        this.f15130u = ep1Var;
    }

    public static int b(Map<String, String> map) {
        String str = map.get("o");
        if (str != null) {
            if ("p".equalsIgnoreCase(str)) {
                return 7;
            }
            if ("l".equalsIgnoreCase(str)) {
                return 6;
            }
            if (!"c".equalsIgnoreCase(str)) {
                return -1;
            }
            Objects.requireNonNull(s.B.f5791e);
            return 14;
        }
        return -1;
    }

    public static Uri c(Context context, w7 w7Var, Uri uri, View view, Activity activity) {
        if (w7Var == null) {
            return uri;
        }
        try {
            boolean z10 = false;
            if (w7Var.c(uri)) {
                String[] strArr = w7.f14873c;
                int i10 = 0;
                while (true) {
                    if (i10 >= 3) {
                        break;
                    }
                    if (uri.getPath().endsWith(strArr[i10])) {
                        z10 = true;
                        break;
                    }
                    i10++;
                }
            }
            return z10 ? w7Var.a(uri, context, view, activity) : uri;
        } catch (x7 unused) {
            return uri;
        } catch (Exception e10) {
            s.B.f5793g.g(e10, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            return uri;
        }
    }

    public static Uri d(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") != null) {
                return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
            }
        } catch (UnsupportedOperationException e10) {
            String valueOf = String.valueOf(uri.toString());
            g1.h(valueOf.length() != 0 ? "Error adding click uptime parameter to url: ".concat(valueOf) : new String("Error adding click uptime parameter to url: "), e10);
        }
        return uri;
    }

    public static boolean e(Map<String, String> map) {
        return "1".equals(map.get("custom_close"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m4.lx
    public final void a(Object obj, Map map) {
        String str;
        String str2;
        boolean z10;
        boolean z11;
        se0 se0Var;
        f fVar;
        boolean z12;
        ym ymVar = (ym) obj;
        vd0 vd0Var = (vd0) ymVar;
        String b10 = y70.b((String) map.get("u"), vd0Var.getContext(), true);
        String str3 = (String) map.get("a");
        if (str3 == null) {
            str = "Action missing from an open GMSG.";
        } else {
            b bVar = this.f15128s;
            if (bVar != null && !bVar.b()) {
                this.f15128s.a(b10);
                return;
            }
            cm1 t10 = vd0Var.t();
            em1 T = vd0Var.T();
            boolean z13 = false;
            if (t10 == null || T == null) {
                str2 = "";
                z10 = false;
            } else {
                boolean z14 = t10.f7045g0;
                str2 = T.f8004b;
                z10 = z14;
            }
            yr<Boolean> yrVar = es.A6;
            jo joVar = jo.f10145d;
            boolean z15 = !((Boolean) joVar.f10148c.a(yrVar)).booleanValue() || !map.containsKey("sc") || !((String) map.get("sc")).equals("0");
            if (!"expand".equalsIgnoreCase(str3)) {
                if ("webapp".equalsIgnoreCase(str3)) {
                    g(false);
                    if (b10 != null) {
                        ((se0) ymVar).H0(e(map), b(map), b10, z15);
                        return;
                    } else {
                        ((se0) ymVar).G0(e(map), b(map), (String) map.get("html"), (String) map.get("baseurl"), z15);
                        return;
                    }
                }
                boolean z16 = z15;
                if ("chrome_custom_tab".equalsIgnoreCase(str3)) {
                    Context context = vd0Var.getContext();
                    if (((Boolean) joVar.f10148c.a(es.H2)).booleanValue()) {
                        if (((Boolean) joVar.f10148c.a(es.N2)).booleanValue()) {
                            g1.a("User opt out chrome custom tab.");
                        } else {
                            if (!((Boolean) joVar.f10148c.a(es.L2)).booleanValue()) {
                                z13 = true;
                                break;
                            }
                            String str4 = (String) joVar.f10148c.a(es.M2);
                            if (!str4.isEmpty() && context != null) {
                                String packageName = context.getPackageName();
                                aa0 a10 = aa0.a(new yt1(';'));
                                Iterator<String> l10 = ((mu1) a10.f6088t).l(a10, str4);
                                while (l10.hasNext()) {
                                    if (l10.next().equals(packageName)) {
                                        z13 = true;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    boolean a11 = xs.a(vd0Var.getContext());
                    if (z13) {
                        if (!a11) {
                            i(4);
                        } else {
                            g(true);
                            if (TextUtils.isEmpty(b10)) {
                                g1.j("Cannot open browser with null or empty url");
                                i(7);
                                return;
                            }
                            Uri d5 = d(c(vd0Var.getContext(), vd0Var.G(), Uri.parse(b10), vd0Var.A(), vd0Var.n()));
                            if (z10 && this.f15133x != null && h(ymVar, vd0Var.getContext(), d5.toString(), str2)) {
                                return;
                            }
                            this.y = new tx(this);
                            se0Var = (se0) ymVar;
                            fVar = new f(null, d5.toString(), null, null, null, null, null, null, new k4.b(this.y), true);
                            z11 = z16;
                        }
                    }
                    map.put("use_first_package", "true");
                    map.put("use_running_process", "true");
                    f(ymVar, map, z10, str2, z16);
                    return;
                }
                if (!"app".equalsIgnoreCase(str3) || !"true".equalsIgnoreCase((String) map.get("system_browser"))) {
                    if ("open_app".equalsIgnoreCase(str3)) {
                        if (!((Boolean) joVar.f10148c.a(es.f8186r5)).booleanValue()) {
                            return;
                        }
                        g(true);
                        String str5 = (String) map.get("p");
                        if (str5 == null) {
                            str = "Package name missing from open app action.";
                        } else if (z10 && this.f15133x != null && h(ymVar, vd0Var.getContext(), str5, str2)) {
                            return;
                        } else {
                            PackageManager packageManager = vd0Var.getContext().getPackageManager();
                            if (packageManager == null) {
                                str = "Cannot get package manager from open app action.";
                            } else {
                                Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str5);
                                if (launchIntentForPackage == null) {
                                    return;
                                }
                                se0Var = (se0) ymVar;
                                fVar = new f(launchIntentForPackage, this.y);
                                z11 = z16;
                            }
                        }
                    } else {
                        g(true);
                        String str6 = (String) map.get("intent_url");
                        Intent intent = null;
                        if (!TextUtils.isEmpty(str6)) {
                            try {
                                intent = Intent.parseUri(str6, 0);
                            } catch (URISyntaxException e10) {
                                String valueOf = String.valueOf(str6);
                                g1.h(valueOf.length() != 0 ? "Error parsing the url: ".concat(valueOf) : new String("Error parsing the url: "), e10);
                            }
                        }
                        if (intent != null && intent.getData() != null) {
                            Uri data = intent.getData();
                            if (!Uri.EMPTY.equals(data)) {
                                Uri d10 = d(c(vd0Var.getContext(), vd0Var.G(), data, vd0Var.A(), vd0Var.n()));
                                if (!TextUtils.isEmpty(intent.getType())) {
                                    if (((Boolean) jo.f10145d.f10148c.a(es.f8194s5)).booleanValue()) {
                                        intent.setDataAndType(d10, intent.getType());
                                    }
                                }
                                intent.setData(d10);
                            }
                        }
                        boolean z17 = ((Boolean) jo.f10145d.f10148c.a(es.E5)).booleanValue() && "intent_async".equalsIgnoreCase(str3) && map.containsKey("event_id");
                        HashMap hashMap = new HashMap();
                        if (z17) {
                            this.y = new ux(z16, ymVar, hashMap, map);
                            z12 = false;
                        } else {
                            z12 = z16;
                        }
                        if (intent == null) {
                            if (!TextUtils.isEmpty(b10)) {
                                b10 = d(c(vd0Var.getContext(), vd0Var.G(), Uri.parse(b10), vd0Var.A(), vd0Var.n())).toString();
                            }
                            if (!z10 || this.f15133x == null || !h(ymVar, vd0Var.getContext(), b10, str2)) {
                                ((se0) ymVar).m0(new f((String) map.get("i"), b10, (String) map.get("m"), (String) map.get("p"), (String) map.get("c"), (String) map.get("f"), (String) map.get("e"), this.y), z12);
                                return;
                            } else if (!z17) {
                                return;
                            }
                        } else if (!z10 || this.f15133x == null || !h(ymVar, vd0Var.getContext(), intent.getData().toString(), str2)) {
                            se0Var = (se0) ymVar;
                            fVar = new f(intent, this.y);
                            z11 = z12;
                        } else if (!z17) {
                            return;
                        }
                        hashMap.put((String) map.get("event_id"), Boolean.TRUE);
                        ((jz) ymVar).a("openIntentAsync", hashMap);
                        return;
                    }
                }
                f(ymVar, map, z10, str2, z16);
                return;
                se0Var.m0(fVar, z11);
                return;
            } else if (!vd0Var.w0()) {
                g(false);
                ((se0) ymVar).w(e(map), b(map), z15);
                return;
            } else {
                str = "Cannot expand WebView that is already expanded.";
            }
        }
        g1.j(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e3, code lost:
        if (m4.vx.c(r11, new java.util.ArrayList(), r5) == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0126, code lost:
        r8 = r12;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(T r15, java.util.Map<java.lang.String, java.lang.String> r16, boolean r17, java.lang.String r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.wx.f(m4.ym, java.util.Map, boolean, java.lang.String, boolean):void");
    }

    public final void g(boolean z10) {
        m30 m30Var = this.f15132w;
        if (m30Var != null) {
            m30Var.g(z10);
        }
    }

    public final boolean h(T t10, Context context, String str, String str2) {
        String str3;
        s sVar = s.B;
        s1 s1Var = sVar.f5789c;
        boolean h10 = s1.h(context);
        r0 d5 = s1.d(context);
        f11 f11Var = this.f15129t;
        if (f11Var != null) {
            c71.N3(context, f11Var, this.f15130u, this.f15133x, str2, "offline_open");
        }
        T t11 = t10;
        boolean z10 = t11.R().d() && t11.n() == null;
        if (h10) {
            v61 v61Var = this.f15133x;
            n90 n90Var = this.f15131v;
            Objects.requireNonNull(v61Var);
            v61Var.j(new z3.v(v61Var, n90Var, str2));
            return false;
        }
        if (new u(context).a() && d5 != null && !z10) {
            if (((Boolean) jo.f10145d.f10148c.a(es.A5)).booleanValue()) {
                if (t11.R().d()) {
                    c71.P3(t11.n(), null, d5, this.f15133x, this.f15129t, this.f15130u, str2, str);
                } else {
                    v61 v61Var2 = this.f15133x;
                    f11 f11Var2 = this.f15129t;
                    ep1 ep1Var = this.f15130u;
                    Objects.requireNonNull(sVar.f5791e);
                    t10.O0(d5, v61Var2, f11Var2, ep1Var, str2, str);
                }
                f11 f11Var3 = this.f15129t;
                if (f11Var3 != null) {
                    c71.N3(context, f11Var3, this.f15130u, this.f15133x, str2, "dialog_impression");
                }
                t10.N();
                return true;
            }
        }
        this.f15133x.b(str2);
        if (this.f15129t != null) {
            HashMap hashMap = new HashMap();
            if (!new u(context).a()) {
                str3 = "notifications_disabled";
            } else if (d5 == null) {
                str3 = "work_manager_unavailable";
            } else {
                if (!((Boolean) jo.f10145d.f10148c.a(es.A5)).booleanValue()) {
                    str3 = "notification_flow_disabled";
                } else {
                    if (z10) {
                        str3 = "fullscreen_no_activity";
                    }
                    c71.O3(context, this.f15129t, this.f15130u, this.f15133x, str2, "dialog_not_shown", hashMap);
                }
            }
            hashMap.put("dialog_not_shown_reason", str3);
            c71.O3(context, this.f15129t, this.f15130u, this.f15133x, str2, "dialog_not_shown", hashMap);
        }
        return false;
    }

    public final void i(int i10) {
        if (this.f15129t == null) {
            return;
        }
        if (((Boolean) jo.f10145d.f10148c.a(es.I5)).booleanValue()) {
            ep1 ep1Var = this.f15130u;
            dp1 b10 = dp1.b("cct_action");
            b10.a("cct_open_status", d.b.e(i10));
            ep1Var.a(b10);
            return;
        }
        e11 a10 = this.f15129t.a();
        a10.a("action", "cct_action");
        a10.a("cct_open_status", d.b.e(i10));
        a10.c();
    }
}
