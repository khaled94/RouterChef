package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.common.annotation.KeepName;
import f3.a;
import f3.e;
import java.util.Objects;
import l0.g;
import m4.b20;
import n3.g1;
import p2.d;
import p3.h;
import p3.j;
import p3.l;
import p3.n;
import q3.f;

@KeepName
/* loaded from: classes.dex */
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {

    /* renamed from: d */
    public static final a f2913d = new a(0, "Could not instantiate custom event adapter", "com.google.android.gms.ads", null);

    /* renamed from: a */
    public CustomEventBanner f2914a;

    /* renamed from: b */
    public CustomEventInterstitial f2915b;

    /* renamed from: c */
    public CustomEventNative f2916c;

    public static <T> T a(Class<T> cls, String str) {
        Objects.requireNonNull(str);
        try {
            return cls.cast(Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Throwable th) {
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(str.length() + 46 + String.valueOf(message).length());
            sb.append("Could not instantiate custom event adapter: ");
            sb.append(str);
            sb.append(". ");
            sb.append(message);
            g1.j(sb.toString());
            return null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    @RecentlyNonNull
    public View getBannerView() {
        return null;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, p3.f, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.internal.ads.zzcql, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void onDestroy() {
        CustomEventBanner customEventBanner = this.f2914a;
        if (customEventBanner != null) {
            customEventBanner.onDestroy();
        }
        CustomEventInterstitial customEventInterstitial = this.f2915b;
        if (customEventInterstitial != null) {
            customEventInterstitial.onDestroy();
        }
        CustomEventNative customEventNative = this.f2916c;
        if (customEventNative != null) {
            customEventNative.onDestroy();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, p3.f, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.internal.ads.zzcql, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void onPause() {
        CustomEventBanner customEventBanner = this.f2914a;
        if (customEventBanner != null) {
            customEventBanner.onPause();
        }
        CustomEventInterstitial customEventInterstitial = this.f2915b;
        if (customEventInterstitial != null) {
            customEventInterstitial.onPause();
        }
        CustomEventNative customEventNative = this.f2916c;
        if (customEventNative != null) {
            customEventNative.onPause();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, p3.f, com.google.android.gms.ads.mediation.MediationNativeAdapter, com.google.android.gms.internal.ads.zzcql, com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void onResume() {
        CustomEventBanner customEventBanner = this.f2914a;
        if (customEventBanner != null) {
            customEventBanner.onResume();
        }
        CustomEventInterstitial customEventInterstitial = this.f2915b;
        if (customEventInterstitial != null) {
            customEventInterstitial.onResume();
        }
        CustomEventNative customEventNative = this.f2916c;
        if (customEventNative != null) {
            customEventNative.onResume();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(@RecentlyNonNull Context context, @RecentlyNonNull h hVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull e eVar, @RecentlyNonNull p3.e eVar2, Bundle bundle2) {
        CustomEventBanner customEventBanner = (CustomEventBanner) a(CustomEventBanner.class, bundle.getString("class_name"));
        this.f2914a = customEventBanner;
        if (customEventBanner == null) {
            ((b20) hVar).c(f2913d);
            return;
        }
        Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name"));
        CustomEventBanner customEventBanner2 = this.f2914a;
        Objects.requireNonNull(customEventBanner2);
        customEventBanner2.requestBannerAd(context, new d(this, hVar), bundle.getString("parameter"), eVar, eVar2, bundle3);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(@RecentlyNonNull Context context, @RecentlyNonNull j jVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull p3.e eVar, Bundle bundle2) {
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) a(CustomEventInterstitial.class, bundle.getString("class_name"));
        this.f2915b = customEventInterstitial;
        if (customEventInterstitial == null) {
            ((b20) jVar).d(f2913d);
            return;
        }
        Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name"));
        CustomEventInterstitial customEventInterstitial2 = this.f2915b;
        Objects.requireNonNull(customEventInterstitial2);
        customEventInterstitial2.requestInterstitialAd(context, new g(this, this, jVar), bundle.getString("parameter"), eVar, bundle3);
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(@RecentlyNonNull Context context, @RecentlyNonNull l lVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull n nVar, Bundle bundle2) {
        CustomEventNative customEventNative = (CustomEventNative) a(CustomEventNative.class, bundle.getString("class_name"));
        this.f2916c = customEventNative;
        if (customEventNative == null) {
            ((b20) lVar).e(f2913d);
            return;
        }
        Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name"));
        CustomEventNative customEventNative2 = this.f2916c;
        Objects.requireNonNull(customEventNative2);
        customEventNative2.requestNativeAd(context, new f(this, lVar, 0), bundle.getString("parameter"), nVar, bundle3);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        CustomEventInterstitial customEventInterstitial = this.f2915b;
        if (customEventInterstitial != null) {
            customEventInterstitial.showInterstitial();
        }
    }
}
