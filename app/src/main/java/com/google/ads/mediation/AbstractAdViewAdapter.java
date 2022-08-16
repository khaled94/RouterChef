package com.google.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.internal.ads.zzcql;
import f3.c;
import f3.d;
import f3.m;
import h3.d;
import java.util.Date;
import java.util.Objects;
import java.util.Set;
import m4.d20;
import m4.dp;
import m4.dr;
import m4.en;
import m4.er;
import m4.g90;
import m4.gw;
import m4.hw;
import m4.io;
import m4.iw;
import m4.jw;
import m4.lq;
import m4.lu;
import m4.or;
import m4.vq;
import m4.zo;
import n3.g1;
import o2.i;
import o2.k;
import o3.a;
import p3.e;
import p3.h;
import p3.j;
import p3.l;
import p3.n;
import p3.p;
import p3.r;
import s3.d;

/* loaded from: classes.dex */
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationNativeAdapter, p, zzcql, r {
    @RecentlyNonNull
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private c adLoader;
    @RecentlyNonNull
    public AdView mAdView;
    @RecentlyNonNull
    public a mInterstitialAd;

    public d buildAdRequest(Context context, e eVar, Bundle bundle, Bundle bundle2) {
        d.a aVar = new d.a();
        Date b10 = eVar.b();
        if (b10 != null) {
            aVar.f4491a.f13805g = b10;
        }
        int g10 = eVar.g();
        if (g10 != 0) {
            aVar.f4491a.f13807i = g10;
        }
        Set<String> d5 = eVar.d();
        if (d5 != null) {
            for (String str : d5) {
                aVar.f4491a.f13799a.add(str);
            }
        }
        Location f10 = eVar.f();
        if (f10 != null) {
            aVar.f4491a.f13808j = f10;
        }
        if (eVar.c()) {
            g90 g90Var = io.f9708f.f9709a;
            aVar.f4491a.f13802d.add(g90.k(context));
        }
        if (eVar.e() != -1) {
            int i10 = 1;
            if (eVar.e() != 1) {
                i10 = 0;
            }
            aVar.f4491a.f13809k = i10;
        }
        aVar.f4491a.f13810l = eVar.a();
        aVar.a(buildExtrasBundle(bundle, bundle2));
        return new d(aVar);
    }

    @RecentlyNonNull
    public abstract Bundle buildExtrasBundle(@RecentlyNonNull Bundle bundle, @RecentlyNonNull Bundle bundle2);

    @RecentlyNonNull
    public String getAdUnitId(@RecentlyNonNull Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    @RecentlyNonNull
    public View getBannerView() {
        return this.mAdView;
    }

    public a getInterstitialAd() {
        return this.mInterstitialAd;
    }

    @Override // com.google.android.gms.internal.ads.zzcql
    @RecentlyNonNull
    public Bundle getInterstitialAdapterInfo() {
        Bundle bundle = new Bundle();
        bundle.putInt("capabilities", 1);
        return bundle;
    }

    @Override // p3.r
    public lq getVideoController() {
        lq lqVar;
        AdView adView = this.mAdView;
        if (adView != null) {
            m mVar = adView.f4510s.f14758c;
            synchronized (mVar.f4516a) {
                lqVar = mVar.f4517b;
            }
            return lqVar;
        }
        return null;
    }

    public c.a newAdLoader(Context context, String str) {
        return new c.a(context, str);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, p3.f, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.internal.ads.zzcql, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void onDestroy() {
        AdView adView = this.mAdView;
        if (adView != null) {
            vq vqVar = adView.f4510s;
            Objects.requireNonNull(vqVar);
            try {
                dp dpVar = vqVar.f14764i;
                if (dpVar != null) {
                    dpVar.L();
                }
            } catch (RemoteException e10) {
                g1.l("#007 Could not call remote method.", e10);
            }
            this.mAdView = null;
        }
        if (this.mInterstitialAd != null) {
            this.mInterstitialAd = null;
        }
        if (this.adLoader != null) {
            this.adLoader = null;
        }
    }

    @Override // p3.p
    public void onImmersiveModeUpdated(boolean z10) {
        a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.c(z10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, p3.f, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.internal.ads.zzcql, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void onPause() {
        AdView adView = this.mAdView;
        if (adView != null) {
            vq vqVar = adView.f4510s;
            Objects.requireNonNull(vqVar);
            try {
                dp dpVar = vqVar.f14764i;
                if (dpVar == null) {
                    return;
                }
                dpVar.F();
            } catch (RemoteException e10) {
                g1.l("#007 Could not call remote method.", e10);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, p3.f, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.internal.ads.zzcql, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void onResume() {
        AdView adView = this.mAdView;
        if (adView != null) {
            vq vqVar = adView.f4510s;
            Objects.requireNonNull(vqVar);
            try {
                dp dpVar = vqVar.f14764i;
                if (dpVar == null) {
                    return;
                }
                dpVar.y();
            } catch (RemoteException e10) {
                g1.l("#007 Could not call remote method.", e10);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(@RecentlyNonNull Context context, @RecentlyNonNull h hVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull f3.e eVar, @RecentlyNonNull e eVar2, @RecentlyNonNull Bundle bundle2) {
        AdView adView = new AdView(context);
        this.mAdView = adView;
        adView.setAdSize(new f3.e(eVar.f4501a, eVar.f4502b));
        this.mAdView.setAdUnitId(getAdUnitId(bundle));
        this.mAdView.setAdListener(new o2.h(this, hVar));
        this.mAdView.a(buildAdRequest(context, eVar2, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(@RecentlyNonNull Context context, @RecentlyNonNull j jVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull e eVar, @RecentlyNonNull Bundle bundle2) {
        a.a(context, getAdUnitId(bundle), buildAdRequest(context, eVar, bundle2, bundle), new i(this, jVar));
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.Map<java.lang.String, java.lang.Boolean>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.Map<java.lang.String, java.lang.Boolean>, java.util.HashMap] */
    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(@RecentlyNonNull Context context, @RecentlyNonNull l lVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull n nVar, @RecentlyNonNull Bundle bundle2) {
        s3.d dVar;
        c cVar;
        k kVar = new k(this, lVar);
        c.a newAdLoader = newAdLoader(context, bundle.getString(AD_UNIT_ID_PARAMETER));
        Objects.requireNonNull(newAdLoader);
        try {
            newAdLoader.f4489b.p1(new en(kVar));
        } catch (RemoteException e10) {
            g1.k("Failed to set AdListener.", e10);
        }
        d20 d20Var = (d20) nVar;
        lu luVar = d20Var.f7193g;
        d.a aVar = new d.a();
        if (luVar != null) {
            int i10 = luVar.f10993s;
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        aVar.f5067g = luVar.y;
                        aVar.f5063c = luVar.f10999z;
                    }
                    aVar.f5061a = luVar.f10994t;
                    aVar.f5062b = luVar.f10995u;
                    aVar.f5064d = luVar.f10996v;
                }
                or orVar = luVar.f10998x;
                if (orVar != null) {
                    aVar.f5065e = new f3.n(orVar);
                }
            }
            aVar.f5066f = luVar.f10997w;
            aVar.f5061a = luVar.f10994t;
            aVar.f5062b = luVar.f10995u;
            aVar.f5064d = luVar.f10996v;
        }
        try {
            newAdLoader.f4489b.u3(new lu(new h3.d(aVar)));
        } catch (RemoteException e11) {
            g1.k("Failed to specify native ad options", e11);
        }
        lu luVar2 = d20Var.f7193g;
        d.a aVar2 = new d.a();
        if (luVar2 == null) {
            dVar = new s3.d(aVar2);
        } else {
            int i11 = luVar2.f10993s;
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        aVar2.f17699f = luVar2.y;
                        aVar2.f17695b = luVar2.f10999z;
                    }
                    aVar2.f17694a = luVar2.f10994t;
                    aVar2.f17696c = luVar2.f10996v;
                    dVar = new s3.d(aVar2);
                }
                or orVar2 = luVar2.f10998x;
                if (orVar2 != null) {
                    aVar2.f17697d = new f3.n(orVar2);
                }
            }
            aVar2.f17698e = luVar2.f10997w;
            aVar2.f17694a = luVar2.f10994t;
            aVar2.f17696c = luVar2.f10996v;
            dVar = new s3.d(aVar2);
        }
        try {
            zo zoVar = newAdLoader.f4489b;
            boolean z10 = dVar.f17688a;
            boolean z11 = dVar.f17690c;
            int i12 = dVar.f17691d;
            f3.n nVar2 = dVar.f17692e;
            zoVar.u3(new lu(4, z10, -1, z11, i12, nVar2 != null ? new or(nVar2) : null, dVar.f17693f, dVar.f17689b));
        } catch (RemoteException e12) {
            g1.k("Failed to specify native ad options", e12);
        }
        if (d20Var.f7194h.contains("6")) {
            try {
                newAdLoader.f4489b.s1(new jw(kVar));
            } catch (RemoteException e13) {
                g1.k("Failed to add google native ad listener", e13);
            }
        }
        if (d20Var.f7194h.contains("3")) {
            for (String str : d20Var.f7196j.keySet()) {
                k kVar2 = true != ((Boolean) d20Var.f7196j.get(str)).booleanValue() ? null : kVar;
                iw iwVar = new iw(kVar, kVar2);
                try {
                    newAdLoader.f4489b.n1(str, new hw(iwVar), kVar2 == null ? null : new gw(iwVar));
                } catch (RemoteException e14) {
                    g1.k("Failed to add custom template ad listener", e14);
                }
            }
        }
        try {
            cVar = new c(newAdLoader.f4488a, newAdLoader.f4489b.b());
        } catch (RemoteException e15) {
            g1.h("Failed to build AdLoader.", e15);
            cVar = new c(newAdLoader.f4488a, new dr(new er()));
        }
        this.adLoader = cVar;
        try {
            cVar.f4487c.D1(cVar.f4485a.a(cVar.f4486b, buildAdRequest(context, nVar, bundle2, bundle).f4490a));
        } catch (RemoteException e16) {
            g1.h("Failed to load ad.", e16);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.d(null);
        }
    }
}
