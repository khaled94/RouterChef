package m4;

import a6.d;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import d4.m;
import i3.a;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Objects;
import l3.s;
import y4.f1;
import y4.f4;
import y4.g2;
import y4.h6;
import y4.i4;
import y4.j4;
import y4.q1;
import y4.w2;

/* loaded from: classes.dex */
public final /* synthetic */ class yd0 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f15655s;

    /* renamed from: t */
    public final /* synthetic */ Object f15656t;

    public /* synthetic */ yd0(Object obj, int i10) {
        this.f15655s = i10;
        this.f15656t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Pair pair;
        String str;
        q1 q1Var;
        NetworkInfo activeNetworkInfo;
        URL url = null;
        switch (this.f15655s) {
            case 0:
                String str2 = (String) this.f15656t;
                int i10 = ce0.U;
                hs b10 = s.B.f5793g.b();
                if (b10.f9440g.contains(str2)) {
                    return;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("sdkVersion", b10.f9439f);
                linkedHashMap.put("ue", str2);
                b10.b(b10.a(b10.f9435b, linkedHashMap), null);
                return;
            case 1:
                ((kz1) this.f15656t).f(new c31(3));
                return;
            case 2:
                d.e(((k51) this.f15656t).f10279u.b(), "persistFlags");
                return;
            case 3:
                Objects.requireNonNull((c01) this.f15656t);
                return;
            default:
                f4 f4Var = (f4) this.f15656t;
                f4Var.g();
                if (((w2) f4Var.f20505s).s().I.b()) {
                    ((w2) f4Var.f20505s).C().E.a("Deferred Deep Link already retrieved. Not fetching again.");
                    return;
                }
                long a10 = ((w2) f4Var.f20505s).s().J.a();
                ((w2) f4Var.f20505s).s().J.b(1 + a10);
                Objects.requireNonNull((w2) f4Var.f20505s);
                if (a10 >= 5) {
                    ((w2) f4Var.f20505s).C().A.a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                    ((w2) f4Var.f20505s).s().I.a(true);
                    return;
                }
                w2 w2Var = (w2) f4Var.f20505s;
                w2Var.B().g();
                w2.k(w2Var.v());
                String l10 = w2Var.p().l();
                g2 s10 = w2Var.s();
                s10.g();
                Objects.requireNonNull(((w2) s10.f20505s).F);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                String str3 = s10.y;
                if (str3 == null || elapsedRealtime >= s10.A) {
                    s10.A = ((w2) s10.f20505s).y.p(l10, f1.f20399b) + elapsedRealtime;
                    try {
                        a.C0075a b11 = a.b(((w2) s10.f20505s).f20786s);
                        s10.y = "";
                        String str4 = b11.f5258a;
                        if (str4 != null) {
                            s10.y = str4;
                        }
                        s10.f20471z = b11.f5259b;
                    } catch (Exception e10) {
                        ((w2) s10.f20505s).C().E.b("Unable to get advertising id", e10);
                        s10.y = "";
                    }
                    pair = new Pair(s10.y, Boolean.valueOf(s10.f20471z));
                } else {
                    pair = new Pair(str3, Boolean.valueOf(s10.f20471z));
                }
                Boolean r10 = w2Var.y.r("google_analytics_adid_collection_enabled");
                if ((r10 == null || r10.booleanValue()) && !((Boolean) pair.second).booleanValue() && !TextUtils.isEmpty((CharSequence) pair.first)) {
                    j4 v10 = w2Var.v();
                    v10.j();
                    ConnectivityManager connectivityManager = (ConnectivityManager) ((w2) v10.f20505s).f20786s.getSystemService("connectivity");
                    if (connectivityManager != null) {
                        try {
                            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        } catch (SecurityException unused) {
                        }
                        if (activeNetworkInfo == null && activeNetworkInfo.isConnected()) {
                            h6 z10 = w2Var.z();
                            ((w2) w2Var.p().f20505s).y.o();
                            String str5 = (String) pair.first;
                            long a11 = w2Var.s().J.a() - 1;
                            Objects.requireNonNull(z10);
                            try {
                                m.e(str5);
                                m.e(l10);
                                String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 43042L, Integer.valueOf(z10.m0())), str5, l10, Long.valueOf(a11));
                                if (l10.equals(((w2) z10.f20505s).y.i("debug.deferred.deeplink"))) {
                                    format = format.concat("&ddl_test=1");
                                }
                                url = new URL(format);
                            } catch (IllegalArgumentException | MalformedURLException e11) {
                                ((w2) z10.f20505s).C().f20710x.b("Failed to create BOW URL for Deferred Deep Link. exception", e11.getMessage());
                            }
                            if (url == null) {
                                return;
                            }
                            j4 v11 = w2Var.v();
                            bs bsVar = new bs(w2Var);
                            v11.g();
                            v11.j();
                            ((w2) v11.f20505s).B().p(new i4(v11, l10, url, bsVar));
                            return;
                        }
                        q1Var = w2Var.C().A;
                        str = "Network is not available for Deferred Deep Link request. Skipping";
                    }
                    activeNetworkInfo = null;
                    if (activeNetworkInfo == null) {
                    }
                    q1Var = w2Var.C().A;
                    str = "Network is not available for Deferred Deep Link request. Skipping";
                } else {
                    q1Var = w2Var.C().E;
                    str = "ADID unavailable to retrieve Deferred Deep Link. Skipping";
                }
                q1Var.a(str);
                return;
        }
    }
}
