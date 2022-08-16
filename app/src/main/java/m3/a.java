package m3;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;
import androidx.lifecycle.l;
import com.raouf.routerchef.R;
import java.security.KeyFactory;
import java.security.Provider;
import java.util.ArrayDeque;
import java.util.Objects;
import k4.b;
import k9.u;
import l3.s;
import m4.a40;
import m4.ar0;
import m4.dd;
import m4.dq1;
import m4.er1;
import m4.es;
import m4.fq1;
import m4.gq1;
import m4.hq1;
import m4.iq1;
import m4.jo;
import m4.jq1;
import m4.kq1;
import m4.mq1;
import m4.nq1;
import m4.o72;
import m4.oq1;
import m4.qq1;
import m4.tq1;
import m4.tt0;
import m4.uo2;
import m4.vq1;
import m4.x90;
import m4.xq1;
import m4.y30;
import m4.yr;
import m4.z30;
import n3.g1;
import n3.s1;
import s4.ac;
import y4.d1;
import y4.e1;
import y4.f1;
import z7.m;

/* loaded from: classes.dex */
public final class a implements ar0, y30, o72, d1, m {

    /* renamed from: s */
    public static final int[] f5948s = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* renamed from: t */
    public static final /* synthetic */ a f5949t = new a();

    /* renamed from: u */
    public static final byte[] f5950u = new byte[0];

    /* renamed from: v */
    public static final /* synthetic */ a f5951v = new a();

    public /* synthetic */ a() {
    }

    public /* synthetic */ a(Context context) {
    }

    public static void a(View view, l lVar) {
        view.setTag(R.id.view_tree_lifecycle_owner, lVar);
    }

    public static final boolean b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static final boolean d(Context context, Intent intent, x xVar, v vVar, boolean z10) {
        int i10;
        if (z10) {
            try {
                i10 = s.B.f5789c.I(context, intent.getData());
                if (xVar != null) {
                    xVar.e();
                }
            } catch (ActivityNotFoundException e10) {
                g1.j(e10.getMessage());
                i10 = 6;
            }
            if (vVar != null) {
                vVar.I(i10);
            }
            return i10 == 5;
        }
        try {
            String valueOf = String.valueOf(intent.toURI());
            g1.a(valueOf.length() != 0 ? "Launching an intent: ".concat(valueOf) : new String("Launching an intent: "));
            s1 s1Var = s.B.f5789c;
            s1.n(context, intent);
            if (xVar != null) {
                xVar.e();
            }
            if (vVar != null) {
                vVar.J(true);
            }
            return true;
        } catch (ActivityNotFoundException e11) {
            g1.j(e11.getMessage());
            if (vVar != null) {
                vVar.J(false);
            }
            return false;
        }
    }

    public static final boolean f(Context context, f fVar, x xVar, v vVar) {
        String str;
        int i10 = 0;
        if (fVar != null) {
            es.c(context);
            Intent intent = fVar.f5958z;
            if (intent == null) {
                intent = new Intent();
                if (TextUtils.isEmpty(fVar.f5953t)) {
                    str = "Open GMSG did not contain a URL.";
                } else {
                    if (!TextUtils.isEmpty(fVar.f5954u)) {
                        intent.setDataAndType(Uri.parse(fVar.f5953t), fVar.f5954u);
                    } else {
                        intent.setData(Uri.parse(fVar.f5953t));
                    }
                    intent.setAction("android.intent.action.VIEW");
                    if (!TextUtils.isEmpty(fVar.f5955v)) {
                        intent.setPackage(fVar.f5955v);
                    }
                    if (!TextUtils.isEmpty(fVar.f5956w)) {
                        String[] split = fVar.f5956w.split("/", 2);
                        if (split.length < 2) {
                            String valueOf = String.valueOf(fVar.f5956w);
                            g1.j(valueOf.length() != 0 ? "Could not parse component name from open GMSG: ".concat(valueOf) : new String("Could not parse component name from open GMSG: "));
                            return false;
                        }
                        intent.setClassName(split[0], split[1]);
                    }
                    String str2 = fVar.f5957x;
                    if (!TextUtils.isEmpty(str2)) {
                        try {
                            i10 = Integer.parseInt(str2);
                        } catch (NumberFormatException unused) {
                            g1.j("Could not parse intent flags.");
                        }
                        intent.addFlags(i10);
                    }
                    yr<Boolean> yrVar = es.G2;
                    jo joVar = jo.f10145d;
                    if (((Boolean) joVar.f10148c.a(yrVar)).booleanValue()) {
                        intent.addFlags(268435456);
                        intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
                    } else {
                        if (((Boolean) joVar.f10148c.a(es.F2)).booleanValue()) {
                            s1 s1Var = s.B.f5789c;
                            s1.K(context, intent);
                        }
                    }
                }
            }
            return d(context, intent, xVar, vVar, fVar.B);
        }
        str = "No intent data for launcher overlay.";
        g1.j(str);
        return false;
    }

    public static boolean g(uo2 uo2Var, boolean z10) {
        boolean z11;
        long c10 = uo2Var.c();
        long j3 = -1;
        int i10 = (c10 > (-1L) ? 1 : (c10 == (-1L) ? 0 : -1));
        long j10 = 4096;
        if (i10 != 0 && c10 <= 4096) {
            j10 = c10;
        }
        int i11 = (int) j10;
        dd ddVar = new dd(64);
        boolean z12 = false;
        int i12 = 0;
        boolean z13 = false;
        while (i12 < i11) {
            ddVar.e(8);
            int i13 = z12 ? 1 : 0;
            int i14 = z12 ? 1 : 0;
            int i15 = z12 ? 1 : 0;
            int i16 = z12 ? 1 : 0;
            if (!uo2Var.o((byte[]) ddVar.f7311d, i13, 8, true)) {
                boolean z14 = z12 ? 1 : 0;
                Object[] objArr = z12 ? 1 : 0;
                Object[] objArr2 = z12 ? 1 : 0;
                Object[] objArr3 = z12 ? 1 : 0;
                z11 = z14;
                break;
            }
            long w10 = ddVar.w();
            int l10 = ddVar.l();
            int i17 = 16;
            if (w10 == 1) {
                uo2Var.l((byte[]) ddVar.f7311d, 8, 8);
                ddVar.g(16);
                w10 = ddVar.v();
            } else {
                if (w10 == 0) {
                    long c11 = uo2Var.c();
                    if (c11 != j3) {
                        w10 = (c11 - uo2Var.g()) + 8;
                    }
                }
                i17 = 8;
            }
            long j11 = i17;
            if (w10 < j11) {
                return z12;
            }
            i12 += i17;
            if (l10 == 1836019574) {
                i11 += (int) w10;
                if (i10 != 0 && i11 > c10) {
                    i11 = (int) c10;
                }
                j3 = -1;
            } else if (l10 == 1836019558 || l10 == 1836475768) {
                z11 = true;
                break;
            } else {
                long j12 = c10;
                if ((i12 + w10) - j11 >= i11) {
                    break;
                }
                int i18 = (int) (w10 - j11);
                i12 += i18;
                if (l10 == 1718909296) {
                    if (i18 < 8) {
                        return false;
                    }
                    ddVar.e(i18);
                    uo2Var.l((byte[]) ddVar.f7311d, 0, i18);
                    int i19 = i18 >> 2;
                    for (int i20 = 0; i20 < i19; i20++) {
                        if (i20 != 1) {
                            int l11 = ddVar.l();
                            if ((l11 >>> 8) != 3368816) {
                                if (l11 == 1751476579) {
                                    l11 = 1751476579;
                                }
                                int[] iArr = f5948s;
                                for (int i21 = 0; i21 < 29; i21++) {
                                    if (iArr[i21] != l11) {
                                    }
                                }
                                continue;
                            }
                            z13 = true;
                            break;
                        }
                        ddVar.i(4);
                    }
                    if (!z13) {
                        return false;
                    }
                } else if (i18 != 0) {
                    uo2Var.w(i18);
                }
                c10 = j12;
                j3 = -1;
                z12 = false;
            }
        }
        z11 = false;
        return z13 && z10 == z11;
    }

    public static kq1 i(String str) {
        char c10;
        int hashCode = str.hashCode();
        if (hashCode == -382745961) {
            if (str.equals("htmlDisplay")) {
                c10 = 0;
            }
            c10 = 65535;
        } else if (hashCode != 112202875) {
            if (hashCode == 714893483 && str.equals("nativeDisplay")) {
                c10 = 1;
            }
            c10 = 65535;
        } else {
            if (str.equals("video")) {
                c10 = 2;
            }
            c10 = 65535;
        }
        if (c10 != 0) {
            if (c10 == 1) {
                return kq1.NATIVE_DISPLAY;
            }
            if (c10 == 2) {
                return kq1.VIDEO;
            }
            return null;
        }
        return kq1.HTML_DISPLAY;
    }

    public static mq1 j(String str) {
        char c10;
        int hashCode = str.hashCode();
        if (hashCode == -1104128070) {
            if (str.equals("beginToRender")) {
                c10 = 0;
            }
            c10 = 65535;
        } else if (hashCode != 1318088141) {
            if (hashCode == 1988248512 && str.equals("onePixel")) {
                c10 = 2;
            }
            c10 = 65535;
        } else {
            if (str.equals("definedByJavascript")) {
                c10 = 1;
            }
            c10 = 65535;
        }
        return c10 != 0 ? c10 != 1 ? c10 != 2 ? mq1.UNSPECIFIED : mq1.ONE_PIXEL : mq1.DEFINED_BY_JAVASCRIPT : mq1.BEGIN_TO_RENDER;
    }

    public static nq1 k(String str) {
        return "native".equals(str) ? nq1.NATIVE : "javascript".equals(str) ? nq1.JAVASCRIPT : nq1.NONE;
    }

    @Override // m4.y30
    public void b0(k4.a aVar) {
        if (!((Boolean) jo.f10145d.f10148c.a(es.f8098g3)).booleanValue() || !u.f5692t.f7592a) {
            return;
        }
        Object e02 = b.e0(aVar);
        if (!(e02 instanceof fq1)) {
            return;
        }
        ((fq1) e02).d();
    }

    @Override // z7.m
    public Object c() {
        return new ArrayDeque();
    }

    @Override // m4.y30
    public k4.a c0(String str, WebView webView, String str2, String str3, a40 a40Var, z30 z30Var, String str4) {
        String concat;
        if (((Boolean) jo.f10145d.f10148c.a(es.f8098g3)).booleanValue()) {
            dq1 dq1Var = u.f5692t;
            if (dq1Var.f7592a) {
                oq1 a10 = oq1.a(str3, str);
                nq1 k10 = k("javascript");
                nq1 k11 = k(str2);
                kq1 i10 = i(z30Var.f15998s);
                nq1 nq1Var = nq1.NONE;
                if (k10 == nq1Var) {
                    concat = "Omid js session error; Unable to parse impression owner: javascript";
                } else if (i10 != null) {
                    if (i10 == kq1.VIDEO && k11 == nq1Var) {
                        String valueOf = String.valueOf(str2);
                        g1.j(valueOf.length() != 0 ? "Omid js session error; Video events owner unknown for video creative: ".concat(valueOf) : new String("Omid js session error; Video events owner unknown for video creative: "));
                        return null;
                    }
                    hq1 hq1Var = new hq1(a10, webView, str4, iq1.JAVASCRIPT);
                    gq1 a11 = gq1.a(i10, j(a40Var.f6039s), k10, k11);
                    if (dq1Var.f7592a) {
                        return new b(new jq1(a11, hq1Var));
                    }
                    throw new IllegalStateException("Method called before OM SDK activation");
                } else {
                    concat = "Omid js session error; Unable to parse creative type: ".concat(String.valueOf(z30Var));
                }
                g1.j(concat);
                return null;
            }
        }
        return null;
    }

    @Override // m4.y30
    public void d0(k4.a aVar, View view) {
        if (!((Boolean) jo.f10145d.f10148c.a(es.f8098g3)).booleanValue() || !u.f5692t.f7592a) {
            return;
        }
        Object e02 = b.e0(aVar);
        if (!(e02 instanceof fq1)) {
            return;
        }
        ((fq1) e02).c(view);
    }

    @Override // m4.o72
    public /* bridge */ /* synthetic */ Object e(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }

    @Override // m4.y30
    public String e0(Context context) {
        if (!((Boolean) jo.f10145d.f10148c.a(es.f8098g3)).booleanValue()) {
            return null;
        }
        return "a.1.3.3-google_20200416";
    }

    @Override // m4.y30
    public void f0(k4.a aVar, View view) {
        if (!((Boolean) jo.f10145d.f10148c.a(es.f8098g3)).booleanValue() || !u.f5692t.f7592a) {
            return;
        }
        Object e02 = b.e0(aVar);
        if (!(e02 instanceof fq1)) {
            return;
        }
        ((fq1) e02).a(view);
    }

    @Override // m4.y30
    public boolean g0(Context context) {
        if (!((Boolean) jo.f10145d.f10148c.a(es.f8098g3)).booleanValue()) {
            g1.j("Omid flag is disabled");
            return false;
        }
        dq1 dq1Var = u.f5692t;
        if (dq1Var.f7592a) {
            return true;
        }
        Context applicationContext = context.getApplicationContext();
        x90.j(applicationContext, "Application Context cannot be null");
        if (!dq1Var.f7592a) {
            dq1Var.f7592a = true;
            xq1 a10 = xq1.a();
            Objects.requireNonNull(a10);
            a10.f15453b = new qq1(new Handler(), applicationContext, a10);
            tq1.f14155f.f14156a = applicationContext.getApplicationContext();
            WindowManager windowManager = er1.f8045a;
            er1.f8047c = applicationContext.getResources().getDisplayMetrics().density;
            er1.f8045a = (WindowManager) applicationContext.getSystemService("window");
            vq1.f14771b.f14772a = applicationContext.getApplicationContext();
        }
        return dq1Var.f7592a;
    }

    @Override // m4.ar0, m4.ko1
    /* renamed from: h */
    public void mo30h(Object obj) {
        ((tt0) obj).f14164a.O0(null);
    }

    @Override // m4.y30
    public k4.a h0(String str, WebView webView, String str2, a40 a40Var, z30 z30Var, String str3) {
        String valueOf;
        String str4;
        String str5;
        if (((Boolean) jo.f10145d.f10148c.a(es.f8098g3)).booleanValue()) {
            dq1 dq1Var = u.f5692t;
            if (dq1Var.f7592a) {
                oq1 a10 = oq1.a("Google", str);
                nq1 k10 = k("javascript");
                kq1 i10 = i(z30Var.f15998s);
                nq1 nq1Var = nq1.NONE;
                if (k10 == nq1Var) {
                    str5 = "Omid html session error; Unable to parse impression owner: javascript";
                } else {
                    if (i10 == null) {
                        valueOf = String.valueOf(z30Var);
                        str4 = "Omid html session error; Unable to parse creative type: ";
                    } else {
                        nq1 k11 = k(str2);
                        if (i10 != kq1.VIDEO || k11 != nq1Var) {
                            hq1 hq1Var = new hq1(a10, webView, str3, iq1.HTML);
                            gq1 a11 = gq1.a(i10, j(a40Var.f6039s), k10, k11);
                            if (dq1Var.f7592a) {
                                return new b(new jq1(a11, hq1Var));
                            }
                            throw new IllegalStateException("Method called before OM SDK activation");
                        }
                        valueOf = String.valueOf(str2);
                        str4 = "Omid html session error; Video events owner unknown for video creative: ";
                        if (valueOf.length() == 0) {
                            str5 = new String(str4);
                        }
                    }
                    str5 = str4.concat(valueOf);
                }
                g1.j(str5);
            }
        }
        return null;
    }

    @Override // y4.d1
    /* renamed from: zza */
    public Object mo14zza() {
        e1<Long> e1Var = f1.f20399b;
        return ac.f17729t.zza().g();
    }

    @Override // m4.y30
    public void zze(k4.a aVar) {
        if (!((Boolean) jo.f10145d.f10148c.a(es.f8098g3)).booleanValue() || !u.f5692t.f7592a) {
            return;
        }
        Object e02 = b.e0(aVar);
        if (!(e02 instanceof fq1)) {
            return;
        }
        ((fq1) e02).b();
    }
}
