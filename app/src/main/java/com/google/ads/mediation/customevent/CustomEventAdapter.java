package com.google.ads.mediation.customevent;

import android.app.Activity;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.common.annotation.KeepName;
import h2.n;
import java.util.Objects;
import l0.g;
import m4.b00;
import m4.g90;
import m4.io;
import m4.l10;
import m4.oe;
import n2.b;
import n3.g1;
import o2.a;
import q3.c;
import r2.d;

@KeepName
/* loaded from: classes.dex */
public final class CustomEventAdapter implements MediationBannerAdapter<c, p2.c>, MediationInterstitialAdapter<c, p2.c> {

    /* renamed from: a */
    public CustomEventBanner f2900a;

    /* renamed from: b */
    public CustomEventInterstitial f2901b;

    public static Object a() {
        try {
            return Class.forName(null).newInstance();
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder("null".length() + 46 + String.valueOf(message).length());
            sb.append("Could not instantiate custom event adapter: ");
            sb.append((String) null);
            sb.append(". ");
            sb.append(message);
            g1.j(sb.toString());
            return null;
        }
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter, o2.b
    public void destroy() {
        CustomEventBanner customEventBanner = this.f2900a;
        if (customEventBanner != null) {
            customEventBanner.destroy();
        }
        CustomEventInterstitial customEventInterstitial = this.f2901b;
        if (customEventInterstitial != null) {
            customEventInterstitial.destroy();
        }
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter, o2.b
    @RecentlyNonNull
    public Class<c> getAdditionalParametersType() {
        return c.class;
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter
    @RecentlyNonNull
    public View getBannerView() {
        return null;
    }

    @Override // com.google.ads.mediation.MediationBannerAdapter, o2.b
    @RecentlyNonNull
    public Class<p2.c> getServerParametersType() {
        return p2.c.class;
    }

    public void requestBannerAd(@RecentlyNonNull o2.c cVar, @RecentlyNonNull Activity activity, @RecentlyNonNull p2.c cVar2, @RecentlyNonNull b bVar, @RecentlyNonNull a aVar, @RecentlyNonNull c cVar3) {
        Objects.requireNonNull(cVar2);
        CustomEventBanner customEventBanner = (CustomEventBanner) a();
        this.f2900a = customEventBanner;
        Object obj = null;
        if (customEventBanner == null) {
            n2.a aVar2 = n2.a.INTERNAL_ERROR;
            b00 b00Var = (b00) cVar;
            Objects.requireNonNull(b00Var);
            g1.e("Adapter called onFailedToReceiveAd with error. ".concat(String.valueOf(aVar2)));
            g90 g90Var = io.f9708f.f9709a;
            if (!g90.g()) {
                g1.l("#008 Must be called on the main UI thread.", null);
                g90.f8771b.post(new n(b00Var, aVar2, 2, null));
                return;
            }
            try {
                ((l10) b00Var.f6311t).A(d.b(aVar2));
                return;
            } catch (RemoteException e10) {
                g1.l("#007 Could not call remote method.", e10);
                return;
            }
        }
        if (cVar3 != null) {
            obj = cVar3.f17144a.get(null);
        }
        this.f2900a.requestBannerAd(new p2.d(this, cVar), activity, null, null, bVar, aVar, obj);
    }

    public void requestInterstitialAd(@RecentlyNonNull o2.d dVar, @RecentlyNonNull Activity activity, @RecentlyNonNull p2.c cVar, @RecentlyNonNull a aVar, @RecentlyNonNull c cVar2) {
        Objects.requireNonNull(cVar);
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) a();
        this.f2901b = customEventInterstitial;
        Object obj = null;
        if (customEventInterstitial == null) {
            n2.a aVar2 = n2.a.INTERNAL_ERROR;
            b00 b00Var = (b00) dVar;
            Objects.requireNonNull(b00Var);
            String valueOf = String.valueOf(aVar2);
            StringBuilder sb = new StringBuilder(valueOf.length() + 47);
            sb.append("Adapter called onFailedToReceiveAd with error ");
            sb.append(valueOf);
            sb.append(".");
            g1.e(sb.toString());
            g90 g90Var = io.f9708f.f9709a;
            if (!g90.g()) {
                g1.l("#008 Must be called on the main UI thread.", null);
                g90.f8771b.post(new oe(b00Var, aVar2, 2));
                return;
            }
            try {
                ((l10) b00Var.f6311t).A(d.b(aVar2));
                return;
            } catch (RemoteException e10) {
                g1.l("#007 Could not call remote method.", e10);
                return;
            }
        }
        if (cVar2 != null) {
            obj = cVar2.f17144a.get(null);
        }
        this.f2901b.requestInterstitialAd(new g(), activity, null, null, aVar, obj);
    }

    @Override // com.google.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        this.f2901b.showInterstitial();
    }
}
