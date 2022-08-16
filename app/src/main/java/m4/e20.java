package m4;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import k4.a;
import n3.g1;
import o2.b;
import o2.e;
import o2.f;
import org.json.JSONObject;
import r2.d;

/* loaded from: classes.dex */
public final class e20<NETWORK_EXTRAS extends f, SERVER_PARAMETERS extends e> extends h10 {

    /* renamed from: s */
    public final b<NETWORK_EXTRAS, SERVER_PARAMETERS> f7698s;

    /* renamed from: t */
    public final NETWORK_EXTRAS f7699t;

    public e20(b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar, NETWORK_EXTRAS network_extras) {
        this.f7698s = bVar;
        this.f7699t = network_extras;
    }

    @Override // m4.i10
    public final void A2(a aVar, jn jnVar, j60 j60Var, String str) {
    }

    @Override // m4.i10
    public final void D() {
    }

    @Override // m4.i10
    public final void F0(a aVar, jn jnVar, String str, String str2, l10 l10Var) {
        b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f7698s;
        if (!(bVar instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            g1.j(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        g1.e("Requesting interstitial ad from adapter.");
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) this.f7698s;
            boolean z10 = true;
            b00 b00Var = new b00(l10Var, 1);
            Activity activity = (Activity) k4.b.e0(aVar);
            SERVER_PARAMETERS N3 = N3(str);
            if (!jnVar.f10133x) {
                g90 g90Var = io.f9708f.f9709a;
                if (!g90.e()) {
                    z10 = false;
                }
            }
            mediationInterstitialAdapter.requestInterstitialAd(b00Var, activity, N3, d.g(jnVar, z10), this.f7699t);
        } catch (Throwable th) {
            throw androidx.activity.result.a.a("", th);
        }
    }

    @Override // m4.i10
    public final void F2(a aVar, jn jnVar, String str, l10 l10Var) {
    }

    @Override // m4.i10
    public final boolean G() {
        return false;
    }

    @Override // m4.i10
    public final void G0(a aVar, on onVar, jn jnVar, String str, String str2, l10 l10Var) {
        n2.b bVar;
        b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar2 = this.f7698s;
        if (!(bVar2 instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(bVar2.getClass().getCanonicalName());
            g1.j(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        g1.e("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.f7698s;
            boolean z10 = true;
            b00 b00Var = new b00(l10Var, 1);
            Activity activity = (Activity) k4.b.e0(aVar);
            SERVER_PARAMETERS N3 = N3(str);
            n2.b[] bVarArr = {n2.b.f16428b, n2.b.f16429c, n2.b.f16430d, n2.b.f16431e, n2.b.f16432f, n2.b.f16433g};
            int i10 = 0;
            while (true) {
                if (i10 < 6) {
                    if (bVarArr[i10].f16434a.f4501a == onVar.f12224w && bVarArr[i10].f16434a.f4502b == onVar.f12221t) {
                        bVar = bVarArr[i10];
                        break;
                    }
                    i10++;
                } else {
                    bVar = new n2.b(new f3.e(onVar.f12224w, onVar.f12221t, onVar.f12220s));
                    break;
                }
            }
            if (!jnVar.f10133x) {
                g90 g90Var = io.f9708f.f9709a;
                if (!g90.e()) {
                    z10 = false;
                }
            }
            mediationBannerAdapter.requestBannerAd(b00Var, activity, N3, bVar, d.g(jnVar, z10), this.f7699t);
        } catch (Throwable th) {
            throw androidx.activity.result.a.a("", th);
        }
    }

    @Override // m4.i10
    public final void H() {
        b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f7698s;
        if (!(bVar instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            g1.j(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        g1.e("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f7698s).showInterstitial();
        } catch (Throwable th) {
            throw androidx.activity.result.a.a("", th);
        }
    }

    @Override // m4.i10
    public final void H3(a aVar, jn jnVar, String str, String str2, l10 l10Var, lu luVar, List<String> list) {
    }

    @Override // m4.i10
    public final boolean J() {
        return true;
    }

    @Override // m4.i10
    public final void J1(a aVar, on onVar, jn jnVar, String str, String str2, l10 l10Var) {
    }

    @Override // m4.i10
    public final p10 K() {
        return null;
    }

    @Override // m4.i10
    public final void M0(boolean z10) {
    }

    public final SERVER_PARAMETERS N3(String str) {
        HashMap hashMap;
        try {
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                hashMap = new HashMap(jSONObject.length());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.getString(next));
                }
            } else {
                hashMap = new HashMap(0);
            }
            Class<SERVER_PARAMETERS> serverParametersType = this.f7698s.getServerParametersType();
            if (serverParametersType == null) {
                return null;
            }
            SERVER_PARAMETERS newInstance = serverParametersType.newInstance();
            newInstance.a(hashMap);
            return newInstance;
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
        throw new RemoteException();
    }

    @Override // m4.i10
    public final q10 V() {
        return null;
    }

    @Override // m4.i10
    public final void V2(a aVar) {
    }

    @Override // m4.i10
    public final void X1(a aVar, on onVar, jn jnVar, String str, l10 l10Var) {
        G0(aVar, onVar, jnVar, str, null, l10Var);
    }

    @Override // m4.i10
    public final void a1(jn jnVar, String str) {
    }

    @Override // m4.i10
    public final Bundle b() {
        return new Bundle();
    }

    @Override // m4.i10
    public final Bundle d() {
        return new Bundle();
    }

    @Override // m4.i10
    public final Bundle e() {
        return new Bundle();
    }

    @Override // m4.i10
    public final lq f() {
        return null;
    }

    @Override // m4.i10
    public final void f2(a aVar) {
    }

    @Override // m4.i10
    public final fv h() {
        return null;
    }

    @Override // m4.i10
    public final n10 i() {
        return null;
    }

    @Override // m4.i10
    public final a j() {
        b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f7698s;
        if (!(bVar instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            g1.j(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        try {
            return new k4.b(((MediationBannerAdapter) bVar).getBannerView());
        } catch (Throwable th) {
            throw androidx.activity.result.a.a("", th);
        }
    }

    @Override // m4.i10
    public final void j3(a aVar, jn jnVar, String str, l10 l10Var) {
    }

    @Override // m4.i10
    public final void k() {
        try {
            this.f7698s.destroy();
        } catch (Throwable th) {
            throw androidx.activity.result.a.a("", th);
        }
    }

    @Override // m4.i10
    public final e30 l() {
        return null;
    }

    @Override // m4.i10
    public final void l3(jn jnVar, String str) {
    }

    @Override // m4.i10
    public final void m2(a aVar, uy uyVar, List<yy> list) {
    }

    @Override // m4.i10
    public final t10 n() {
        return null;
    }

    @Override // m4.i10
    public final e30 o() {
        return null;
    }

    @Override // m4.i10
    public final void p3(a aVar, j60 j60Var, List<String> list) {
    }

    @Override // m4.i10
    public final void w1() {
        throw new RemoteException();
    }

    @Override // m4.i10
    public final void y3(a aVar) {
    }
}
