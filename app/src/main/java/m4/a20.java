package m4;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.appcompat.widget.d;
import androidx.fragment.app.b1;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.internal.ads.zzcqk;
import com.google.android.gms.internal.ads.zzcql;
import f3.e;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import k4.a;
import k4.b;
import n3.g1;
import org.json.JSONException;
import org.json.JSONObject;
import p3.f;
import p3.g;
import p3.i;
import p3.k;
import p3.m;
import p3.o;
import p3.p;
import p3.r;

/* loaded from: classes.dex */
public final class a20 extends h10 {

    /* renamed from: s */
    public final Object f6021s;

    /* renamed from: t */
    public b20 f6022t;

    /* renamed from: u */
    public j60 f6023u;

    /* renamed from: v */
    public a f6024v;

    /* renamed from: w */
    public final String f6025w = "";

    public a20(p3.a aVar) {
        this.f6021s = aVar;
    }

    public a20(f fVar) {
        this.f6021s = fVar;
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

    @Override // m4.i10
    public final void A2(a aVar, jn jnVar, j60 j60Var, String str) {
        Object obj = this.f6021s;
        if (obj instanceof p3.a) {
            this.f6024v = aVar;
            this.f6023u = j60Var;
            j60Var.N(new b(obj));
            return;
        }
        String canonicalName = p3.a.class.getCanonicalName();
        String canonicalName2 = this.f6021s.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        g1.j(sb.toString());
        throw new RemoteException();
    }

    @Override // m4.i10
    public final void D() {
        if (this.f6021s instanceof p3.a) {
            g1.g("Can not show null mediated rewarded ad.");
            throw new RemoteException();
        }
        String canonicalName = p3.a.class.getCanonicalName();
        String canonicalName2 = this.f6021s.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        g1.j(sb.toString());
        throw new RemoteException();
    }

    @Override // m4.i10
    public final void F0(a aVar, jn jnVar, String str, String str2, l10 l10Var) {
        RemoteException a10;
        Object obj = this.f6021s;
        if (!(obj instanceof MediationInterstitialAdapter) && !(obj instanceof p3.a)) {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = p3.a.class.getCanonicalName();
            String canonicalName3 = this.f6021s.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(d.a(String.valueOf(canonicalName).length(), 26, String.valueOf(canonicalName2).length(), String.valueOf(canonicalName3).length()));
            b1.b(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb.append(canonicalName3);
            g1.j(sb.toString());
            throw new RemoteException();
        }
        g1.e("Requesting interstitial ad from adapter.");
        Object obj2 = this.f6021s;
        if (!(obj2 instanceof MediationInterstitialAdapter)) {
            if (!(obj2 instanceof p3.a)) {
                return;
            }
            try {
                ((p3.a) obj2).loadInterstitialAd(new i((Context) b.e0(aVar), "", O3(str, jnVar, str2), N3(jnVar), P3(jnVar), jnVar.C, jnVar.y, jnVar.L, Q3(str, jnVar), this.f6025w), new aa0(this, l10Var));
                return;
            } finally {
            }
        }
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj2;
            List<String> list = jnVar.f10132w;
            Bundle bundle = null;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j3 = jnVar.f10129t;
            Date date = j3 == -1 ? null : new Date(j3);
            int i10 = jnVar.f10131v;
            Location location = jnVar.C;
            boolean P3 = P3(jnVar);
            int i11 = jnVar.y;
            boolean z10 = jnVar.J;
            Q3(str, jnVar);
            v10 v10Var = new v10(date, i10, hashSet, location, P3, i11, z10);
            Bundle bundle2 = jnVar.E;
            if (bundle2 != null) {
                bundle = bundle2.getBundle(mediationInterstitialAdapter.getClass().getName());
            }
            mediationInterstitialAdapter.requestInterstitialAd((Context) b.e0(aVar), new b20(l10Var), O3(str, jnVar, str2), v10Var, bundle);
        } finally {
        }
    }

    @Override // m4.i10
    public final void F2(a aVar, jn jnVar, String str, l10 l10Var) {
        if (this.f6021s instanceof p3.a) {
            g1.e("Requesting rewarded interstitial ad from adapter.");
            try {
                ((p3.a) this.f6021s).loadRewardedInterstitialAd(new m((Context) b.e0(aVar), "", O3(str, jnVar, null), N3(jnVar), P3(jnVar), jnVar.C, jnVar.y, jnVar.L, Q3(str, jnVar), ""), new z10(this, l10Var));
                return;
            } catch (Exception e10) {
                g1.h("", e10);
                throw new RemoteException();
            }
        }
        String canonicalName = p3.a.class.getCanonicalName();
        String canonicalName2 = this.f6021s.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        g1.j(sb.toString());
        throw new RemoteException();
    }

    @Override // m4.i10
    public final boolean G() {
        return false;
    }

    @Override // m4.i10
    public final void G0(a aVar, on onVar, jn jnVar, String str, String str2, l10 l10Var) {
        e eVar;
        RemoteException a10;
        Object obj = this.f6021s;
        if (!(obj instanceof MediationBannerAdapter) && !(obj instanceof p3.a)) {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = p3.a.class.getCanonicalName();
            String canonicalName3 = this.f6021s.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(d.a(String.valueOf(canonicalName).length(), 26, String.valueOf(canonicalName2).length(), String.valueOf(canonicalName3).length()));
            b1.b(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb.append(canonicalName3);
            g1.j(sb.toString());
            throw new RemoteException();
        }
        g1.e("Requesting banner ad from adapter.");
        if (onVar.F) {
            int i10 = onVar.f12224w;
            int i11 = onVar.f12221t;
            e eVar2 = new e(i10, i11);
            eVar2.f4504d = true;
            eVar2.f4505e = i11;
            eVar = eVar2;
        } else {
            eVar = new e(onVar.f12224w, onVar.f12221t, onVar.f12220s);
        }
        Object obj2 = this.f6021s;
        if (!(obj2 instanceof MediationBannerAdapter)) {
            if (!(obj2 instanceof p3.a)) {
                return;
            }
            try {
                ((p3.a) obj2).loadBannerAd(new g((Context) b.e0(aVar), "", O3(str, jnVar, str2), N3(jnVar), P3(jnVar), jnVar.C, jnVar.y, jnVar.L, Q3(str, jnVar), this.f6025w), new x10(this, l10Var));
                return;
            } finally {
            }
        }
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj2;
            List<String> list = jnVar.f10132w;
            Bundle bundle = null;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j3 = jnVar.f10129t;
            Date date = j3 == -1 ? null : new Date(j3);
            int i12 = jnVar.f10131v;
            Location location = jnVar.C;
            boolean P3 = P3(jnVar);
            int i13 = jnVar.y;
            boolean z10 = jnVar.J;
            Q3(str, jnVar);
            v10 v10Var = new v10(date, i12, hashSet, location, P3, i13, z10);
            Bundle bundle2 = jnVar.E;
            if (bundle2 != null) {
                bundle = bundle2.getBundle(mediationBannerAdapter.getClass().getName());
            }
            mediationBannerAdapter.requestBannerAd((Context) b.e0(aVar), new b20(l10Var), O3(str, jnVar, str2), eVar, v10Var, bundle);
        } finally {
        }
    }

    @Override // m4.i10
    public final void H() {
        if (this.f6021s instanceof MediationInterstitialAdapter) {
            g1.e("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.f6021s).showInterstitial();
                return;
            } catch (Throwable th) {
                throw androidx.activity.result.a.a("", th);
            }
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = this.f6021s.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        g1.j(sb.toString());
        throw new RemoteException();
    }

    @Override // m4.i10
    public final void H3(a aVar, jn jnVar, String str, String str2, l10 l10Var, lu luVar, List<String> list) {
        RemoteException a10;
        Object obj = this.f6021s;
        if (!(obj instanceof MediationNativeAdapter) && !(obj instanceof p3.a)) {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = p3.a.class.getCanonicalName();
            String canonicalName3 = this.f6021s.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(d.a(String.valueOf(canonicalName).length(), 26, String.valueOf(canonicalName2).length(), String.valueOf(canonicalName3).length()));
            b1.b(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb.append(canonicalName3);
            g1.j(sb.toString());
            throw new RemoteException();
        }
        g1.e("Requesting native ad from adapter.");
        Object obj2 = this.f6021s;
        if (!(obj2 instanceof MediationNativeAdapter)) {
            if (!(obj2 instanceof p3.a)) {
                return;
            }
            try {
                ((p3.a) obj2).loadNativeAd(new k((Context) b.e0(aVar), "", O3(str, jnVar, str2), N3(jnVar), P3(jnVar), jnVar.C, jnVar.y, jnVar.L, Q3(str, jnVar), this.f6025w), new y10(this, l10Var));
                return;
            } finally {
            }
        }
        try {
            MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj2;
            List<String> list2 = jnVar.f10132w;
            Bundle bundle = null;
            HashSet hashSet = list2 != null ? new HashSet(list2) : null;
            long j3 = jnVar.f10129t;
            Date date = j3 == -1 ? null : new Date(j3);
            int i10 = jnVar.f10131v;
            Location location = jnVar.C;
            boolean P3 = P3(jnVar);
            int i11 = jnVar.y;
            boolean z10 = jnVar.J;
            Q3(str, jnVar);
            d20 d20Var = new d20(date, i10, hashSet, location, P3, i11, luVar, list, z10);
            Bundle bundle2 = jnVar.E;
            if (bundle2 != null) {
                bundle = bundle2.getBundle(mediationNativeAdapter.getClass().getName());
            }
            this.f6022t = new b20(l10Var);
            mediationNativeAdapter.requestNativeAd((Context) b.e0(aVar), this.f6022t, O3(str, jnVar, str2), d20Var, bundle);
        } finally {
        }
    }

    @Override // m4.i10
    public final boolean J() {
        if (this.f6021s instanceof p3.a) {
            return this.f6023u != null;
        }
        String canonicalName = p3.a.class.getCanonicalName();
        String canonicalName2 = this.f6021s.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        g1.j(sb.toString());
        throw new RemoteException();
    }

    @Override // m4.i10
    public final void J1(a aVar, on onVar, jn jnVar, String str, String str2, l10 l10Var) {
        if (!(this.f6021s instanceof p3.a)) {
            String canonicalName = p3.a.class.getCanonicalName();
            String canonicalName2 = this.f6021s.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            g1.j(sb.toString());
            throw new RemoteException();
        }
        g1.e("Requesting interscroller ad from adapter.");
        try {
            p3.a aVar2 = (p3.a) this.f6021s;
            rz rzVar = new rz(this, l10Var, aVar2);
            Context context = (Context) b.e0(aVar);
            Bundle O3 = O3(str, jnVar, str2);
            Bundle N3 = N3(jnVar);
            boolean P3 = P3(jnVar);
            Location location = jnVar.C;
            int i10 = jnVar.y;
            int i11 = jnVar.L;
            String Q3 = Q3(str, jnVar);
            int i12 = onVar.f12224w;
            int i13 = onVar.f12221t;
            e eVar = new e(i12, i13);
            eVar.f4506f = true;
            eVar.f4507g = i13;
            aVar2.loadInterscrollerAd(new g(context, "", O3, N3, P3, location, i10, i11, Q3, ""), rzVar);
        } catch (Exception e10) {
            g1.h("", e10);
            throw new RemoteException();
        }
    }

    @Override // m4.i10
    public final p10 K() {
        return null;
    }

    @Override // m4.i10
    public final void M0(boolean z10) {
        Object obj = this.f6021s;
        if (obj instanceof p) {
            try {
                ((p) obj).onImmersiveModeUpdated(z10);
                return;
            } catch (Throwable th) {
                g1.h("", th);
                return;
            }
        }
        String canonicalName = p.class.getCanonicalName();
        String canonicalName2 = this.f6021s.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        g1.e(sb.toString());
    }

    public final Bundle N3(jn jnVar) {
        Bundle bundle;
        Bundle bundle2 = jnVar.E;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f6021s.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    public final Bundle O3(String str, jn jnVar, String str2) {
        String valueOf = String.valueOf(str);
        g1.e(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.f6021s instanceof AdMobAdapter) {
                bundle.putString(AdMobAdapter.AD_JSON_PARAMETER, str2);
                if (jnVar != null) {
                    bundle.putInt("tagForChildDirectedTreatment", jnVar.y);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            throw androidx.activity.result.a.a("", th);
        }
    }

    @Override // m4.i10
    public final void Q0(a aVar, jn jnVar, String str, l10 l10Var) {
        F0(aVar, jnVar, str, null, l10Var);
    }

    @Override // m4.i10
    public final void S() {
        Object obj = this.f6021s;
        if (!(obj instanceof f)) {
            return;
        }
        try {
            ((f) obj).onPause();
        } catch (Throwable th) {
            throw androidx.activity.result.a.a("", th);
        }
    }

    @Override // m4.i10
    public final q10 V() {
        return null;
    }

    @Override // m4.i10
    public final void V2(a aVar) {
        Object obj = this.f6021s;
        if ((obj instanceof p3.a) || (obj instanceof MediationInterstitialAdapter)) {
            if (obj instanceof MediationInterstitialAdapter) {
                H();
                return;
            }
            g1.e("Show interstitial ad from adapter.");
            g1.g("Can not show null mediation interstitial ad.");
            throw new RemoteException();
        }
        String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
        String canonicalName2 = p3.a.class.getCanonicalName();
        String canonicalName3 = this.f6021s.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(d.a(String.valueOf(canonicalName).length(), 26, String.valueOf(canonicalName2).length(), String.valueOf(canonicalName3).length()));
        b1.b(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
        sb.append(canonicalName3);
        g1.j(sb.toString());
        throw new RemoteException();
    }

    @Override // m4.i10
    public final void X1(a aVar, on onVar, jn jnVar, String str, l10 l10Var) {
        G0(aVar, onVar, jnVar, str, null, l10Var);
    }

    @Override // m4.i10
    public final void a1(jn jnVar, String str) {
        l3(jnVar, str);
    }

    @Override // m4.i10
    public final Bundle b() {
        Object obj = this.f6021s;
        if (!(obj instanceof zzcqk)) {
            String canonicalName = zzcqk.class.getCanonicalName();
            String canonicalName2 = this.f6021s.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            g1.j(sb.toString());
            return new Bundle();
        }
        return ((zzcqk) obj).zza();
    }

    @Override // m4.i10
    public final Bundle d() {
        Object obj = this.f6021s;
        if (!(obj instanceof zzcql)) {
            String canonicalName = zzcql.class.getCanonicalName();
            String canonicalName2 = this.f6021s.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
            sb.append(canonicalName);
            sb.append(" #009 Class mismatch: ");
            sb.append(canonicalName2);
            g1.j(sb.toString());
            return new Bundle();
        }
        return ((zzcql) obj).getInterstitialAdapterInfo();
    }

    @Override // m4.i10
    public final Bundle e() {
        return new Bundle();
    }

    @Override // m4.i10
    public final lq f() {
        Object obj = this.f6021s;
        if (obj instanceof r) {
            try {
                return ((r) obj).getVideoController();
            } catch (Throwable th) {
                g1.h("", th);
            }
        }
        return null;
    }

    @Override // m4.i10
    public final void f2(a aVar) {
        if (this.f6021s instanceof p3.a) {
            g1.e("Show rewarded ad from adapter.");
            g1.g("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        String canonicalName = p3.a.class.getCanonicalName();
        String canonicalName2 = this.f6021s.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        g1.j(sb.toString());
        throw new RemoteException();
    }

    @Override // m4.i10
    public final fv h() {
        b20 b20Var = this.f6022t;
        if (b20Var != null) {
            h3.e eVar = b20Var.f6343c;
            if (!(eVar instanceof gv)) {
                return null;
            }
            return ((gv) eVar).f9053a;
        }
        return null;
    }

    @Override // m4.i10
    public final n10 i() {
        return null;
    }

    @Override // m4.i10
    public final a j() {
        Object obj = this.f6021s;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return new b(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                throw androidx.activity.result.a.a("", th);
            }
        } else if (obj instanceof p3.a) {
            return new b(null);
        } else {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = p3.a.class.getCanonicalName();
            String canonicalName3 = this.f6021s.getClass().getCanonicalName();
            StringBuilder sb = new StringBuilder(d.a(String.valueOf(canonicalName).length(), 26, String.valueOf(canonicalName2).length(), String.valueOf(canonicalName3).length()));
            b1.b(sb, canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            sb.append(canonicalName3);
            g1.j(sb.toString());
            throw new RemoteException();
        }
    }

    @Override // m4.i10
    public final void j3(a aVar, jn jnVar, String str, l10 l10Var) {
        if (this.f6021s instanceof p3.a) {
            g1.e("Requesting rewarded ad from adapter.");
            try {
                ((p3.a) this.f6021s).loadRewardedAd(new m((Context) b.e0(aVar), "", O3(str, jnVar, null), N3(jnVar), P3(jnVar), jnVar.C, jnVar.y, jnVar.L, Q3(str, jnVar), ""), new z10(this, l10Var));
                return;
            } catch (Exception e10) {
                g1.h("", e10);
                throw new RemoteException();
            }
        }
        String canonicalName = p3.a.class.getCanonicalName();
        String canonicalName2 = this.f6021s.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        g1.j(sb.toString());
        throw new RemoteException();
    }

    @Override // m4.i10
    public final void k() {
        Object obj = this.f6021s;
        if (!(obj instanceof f)) {
            return;
        }
        try {
            ((f) obj).onDestroy();
        } catch (Throwable th) {
            throw androidx.activity.result.a.a("", th);
        }
    }

    @Override // m4.i10
    public final e30 l() {
        Object obj = this.f6021s;
        if (!(obj instanceof p3.a)) {
            return null;
        }
        ((p3.a) obj).getVersionInfo();
        throw null;
    }

    @Override // m4.i10
    public final void l3(jn jnVar, String str) {
        Object obj = this.f6021s;
        if (obj instanceof p3.a) {
            j3(this.f6024v, jnVar, str, new c20((p3.a) obj, this.f6023u));
            return;
        }
        String canonicalName = p3.a.class.getCanonicalName();
        String canonicalName2 = this.f6021s.getClass().getCanonicalName();
        StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 22 + String.valueOf(canonicalName2).length());
        sb.append(canonicalName);
        sb.append(" #009 Class mismatch: ");
        sb.append(canonicalName2);
        g1.j(sb.toString());
        throw new RemoteException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // m4.i10
    public final void m2(a aVar, uy uyVar, List<yy> list) {
        char c10;
        if (this.f6021s instanceof p3.a) {
            tz tzVar = new tz(uyVar);
            ArrayList arrayList = new ArrayList();
            for (yy yyVar : list) {
                String str = yyVar.f15919s;
                char c11 = 1;
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
                if (c10 != 0) {
                    c11 = c10 != 1 ? c10 != 2 ? c10 != 3 ? c10 != 4 ? (char) 0 : (char) 5 : (char) 4 : (char) 3 : (char) 2;
                }
                if (c11 != 0) {
                    arrayList.add(new a0.a());
                }
            }
            ((p3.a) this.f6021s).initialize((Context) b.e0(aVar), tzVar, arrayList);
            return;
        }
        throw new RemoteException();
    }

    @Override // m4.i10
    public final t10 n() {
        o2.g gVar;
        Object obj = this.f6021s;
        if (!(obj instanceof MediationNativeAdapter)) {
            boolean z10 = obj instanceof p3.a;
            return null;
        }
        b20 b20Var = this.f6022t;
        if (b20Var != null && (gVar = b20Var.f6342b) != null) {
            return new f20(gVar);
        }
        return null;
    }

    @Override // m4.i10
    public final e30 o() {
        Object obj = this.f6021s;
        if (!(obj instanceof p3.a)) {
            return null;
        }
        ((p3.a) obj).getSDKVersionInfo();
        throw null;
    }

    @Override // m4.i10
    public final void p3(a aVar, j60 j60Var, List<String> list) {
        g1.j("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // m4.i10
    public final void w1() {
        Object obj = this.f6021s;
        if (!(obj instanceof f)) {
            return;
        }
        try {
            ((f) obj).onResume();
        } catch (Throwable th) {
            throw androidx.activity.result.a.a("", th);
        }
    }

    @Override // m4.i10
    public final void y3(a aVar) {
        Context context = (Context) b.e0(aVar);
        Object obj = this.f6021s;
        if (obj instanceof o) {
            ((o) obj).a();
        }
    }
}
