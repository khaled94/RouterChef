package com.google.android.gms.ads.mediation.rtb;

import androidx.annotation.RecentlyNonNull;
import javax.annotation.ParametersAreNonnullByDefault;
import p3.a;
import p3.d;
import p3.g;
import p3.i;
import p3.k;
import p3.m;
import r3.b;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public abstract class RtbAdapter extends a {
    public abstract void collectSignals(@RecentlyNonNull r3.a aVar, @RecentlyNonNull b bVar);

    public void loadRtbBannerAd(@RecentlyNonNull g gVar, @RecentlyNonNull d<Object, Object> dVar) {
        loadBannerAd(gVar, dVar);
    }

    public void loadRtbInterscrollerAd(@RecentlyNonNull g gVar, @RecentlyNonNull d<Object, Object> dVar) {
        dVar.e(new f3.a(7, getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads", null));
    }

    public void loadRtbInterstitialAd(@RecentlyNonNull i iVar, @RecentlyNonNull d<Object, Object> dVar) {
        loadInterstitialAd(iVar, dVar);
    }

    public void loadRtbNativeAd(@RecentlyNonNull k kVar, @RecentlyNonNull d<o2.g, Object> dVar) {
        loadNativeAd(kVar, dVar);
    }

    public void loadRtbRewardedAd(@RecentlyNonNull m mVar, @RecentlyNonNull d<Object, Object> dVar) {
        loadRewardedAd(mVar, dVar);
    }

    public void loadRtbRewardedInterstitialAd(@RecentlyNonNull m mVar, @RecentlyNonNull d<Object, Object> dVar) {
        loadRewardedInterstitialAd(mVar, dVar);
    }
}
