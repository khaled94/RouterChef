package m4;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import f3.e;
import h2.u;
import java.util.ArrayList;
import java.util.Iterator;
import k4.a;
import k4.b;
import n3.g1;
import org.json.JSONException;
import org.json.JSONObject;
import p3.g;
import p3.i;
import p3.k;
import p3.m;
import p3.r;

/* loaded from: classes.dex */
public final class b30 extends t20 {

    /* renamed from: t */
    public final RtbAdapter f6345t;

    /* renamed from: u */
    public String f6346u = "";

    public b30(RtbAdapter rtbAdapter) {
        this.f6345t = rtbAdapter;
    }

    public static final Bundle O3(String str) {
        String valueOf = String.valueOf(str);
        g1.j(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e10) {
            g1.h("", e10);
            throw new RemoteException();
        }
    }

    public static final boolean P3(jn jnVar) {
        if (!jnVar.f10133x) {
            g90 g90Var = io.f9708f.f9709a;
            return g90.e();
        }
        return true;
    }

    public static final String Q3(String str, jn jnVar) {
        String str2 = jnVar.M;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // m4.u20
    public final void B0(String str, String str2, jn jnVar, a aVar, o20 o20Var, l10 l10Var, lu luVar) {
        try {
            this.f6345t.loadRtbNativeAd(new k((Context) b.e0(aVar), str, O3(str2), N3(jnVar), P3(jnVar), jnVar.C, jnVar.y, jnVar.L, Q3(str2, jnVar), this.f6346u), new z20(o20Var, l10Var));
        } catch (Throwable th) {
            throw androidx.activity.result.a.a("Adapter failed to render native ad.", th);
        }
    }

    @Override // m4.u20
    public final void E0(String str, String str2, jn jnVar, a aVar, r20 r20Var, l10 l10Var) {
        try {
            this.f6345t.loadRtbRewardedAd(new m((Context) b.e0(aVar), str, O3(str2), N3(jnVar), P3(jnVar), jnVar.C, jnVar.y, jnVar.L, Q3(str2, jnVar), this.f6346u), new a30(r20Var, l10Var));
        } catch (Throwable th) {
            throw androidx.activity.result.a.a("Adapter failed to render rewarded ad.", th);
        }
    }

    @Override // m4.u20
    public final void G3(String str, String str2, jn jnVar, a aVar, l20 l20Var, l10 l10Var) {
        try {
            this.f6345t.loadRtbInterstitialAd(new i((Context) b.e0(aVar), str, O3(str2), N3(jnVar), P3(jnVar), jnVar.C, jnVar.y, jnVar.L, Q3(str2, jnVar), this.f6346u), new y20(this, l20Var, l10Var));
        } catch (Throwable th) {
            throw androidx.activity.result.a.a("Adapter failed to render interstitial ad.", th);
        }
    }

    public final Bundle N3(jn jnVar) {
        Bundle bundle;
        Bundle bundle2 = jnVar.E;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f6345t.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    @Override // m4.u20
    public final void U(String str) {
        this.f6346u = str;
    }

    @Override // m4.u20
    public final boolean Z(a aVar) {
        return false;
    }

    @Override // m4.u20
    public final lq b() {
        RtbAdapter rtbAdapter = this.f6345t;
        if (rtbAdapter instanceof r) {
            try {
                return ((r) rtbAdapter).getVideoController();
            } catch (Throwable th) {
                g1.h("", th);
            }
        }
        return null;
    }

    @Override // m4.u20
    public final e30 d() {
        this.f6345t.getVersionInfo();
        throw null;
    }

    @Override // m4.u20
    public final e30 e() {
        this.f6345t.getSDKVersionInfo();
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // m4.u20
    public final void i1(a aVar, String str, Bundle bundle, Bundle bundle2, on onVar, x20 x20Var) {
        char c10;
        try {
            l7 l7Var = new l7(x20Var);
            RtbAdapter rtbAdapter = this.f6345t;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1911491517:
                    if (str.equals("rewarded_interstitial")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            if (c10 != 0 && c10 != 1 && c10 != 2 && c10 != 3 && c10 != 4) {
                throw new IllegalArgumentException("Internal Error");
            }
            a0.a aVar2 = new a0.a();
            ArrayList arrayList = new ArrayList();
            arrayList.add(aVar2);
            Context context = (Context) b.e0(aVar);
            new e(onVar.f12224w, onVar.f12221t, onVar.f12220s);
            rtbAdapter.collectSignals(new r3.a(arrayList), l7Var);
        } catch (Throwable th) {
            throw androidx.activity.result.a.a("Error generating signals for RTB", th);
        }
    }

    @Override // m4.u20
    public final void j2(String str, String str2, jn jnVar, a aVar, o20 o20Var, l10 l10Var) {
        B0(str, str2, jnVar, aVar, o20Var, l10Var, null);
    }

    @Override // m4.u20
    public final void l1(String str, String str2, jn jnVar, a aVar, i20 i20Var, l10 l10Var, on onVar) {
        try {
            u uVar = new u(this, i20Var, l10Var, 5);
            RtbAdapter rtbAdapter = this.f6345t;
            Context context = (Context) b.e0(aVar);
            Bundle O3 = O3(str2);
            Bundle N3 = N3(jnVar);
            boolean P3 = P3(jnVar);
            Location location = jnVar.C;
            int i10 = jnVar.y;
            int i11 = jnVar.L;
            String Q3 = Q3(str2, jnVar);
            new e(onVar.f12224w, onVar.f12221t, onVar.f12220s);
            rtbAdapter.loadRtbBannerAd(new g(context, str, O3, N3, P3, location, i10, i11, Q3, this.f6346u), uVar);
        } catch (Throwable th) {
            throw androidx.activity.result.a.a("Adapter failed to render banner ad.", th);
        }
    }

    @Override // m4.u20
    public final boolean s3(a aVar) {
        return false;
    }

    @Override // m4.u20
    public final void x0(String str, String str2, jn jnVar, a aVar, i20 i20Var, l10 l10Var, on onVar) {
        try {
            d5 d5Var = new d5(i20Var, l10Var);
            RtbAdapter rtbAdapter = this.f6345t;
            Context context = (Context) b.e0(aVar);
            Bundle O3 = O3(str2);
            Bundle N3 = N3(jnVar);
            boolean P3 = P3(jnVar);
            Location location = jnVar.C;
            int i10 = jnVar.y;
            int i11 = jnVar.L;
            String Q3 = Q3(str2, jnVar);
            new e(onVar.f12224w, onVar.f12221t, onVar.f12220s);
            rtbAdapter.loadRtbInterscrollerAd(new g(context, str, O3, N3, P3, location, i10, i11, Q3, this.f6346u), d5Var);
        } catch (Throwable th) {
            throw androidx.activity.result.a.a("Adapter failed to render interscroller ad.", th);
        }
    }

    @Override // m4.u20
    public final void z1(String str, String str2, jn jnVar, a aVar, r20 r20Var, l10 l10Var) {
        try {
            this.f6345t.loadRtbRewardedInterstitialAd(new m((Context) b.e0(aVar), str, O3(str2), N3(jnVar), P3(jnVar), jnVar.C, jnVar.y, jnVar.L, Q3(str2, jnVar), this.f6346u), new a30(r20Var, l10Var));
        } catch (Throwable th) {
            throw androidx.activity.result.a.a("Adapter failed to render rewarded interstitial ad.", th);
        }
    }
}
