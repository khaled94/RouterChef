package com.google.ads.mediation.customevent;

import android.app.Activity;
import androidx.annotation.RecentlyNonNull;
import o2.a;
import p2.b;

@Deprecated
/* loaded from: classes.dex */
public interface CustomEventInterstitial {
    /* synthetic */ void destroy();

    void requestInterstitialAd(@RecentlyNonNull b bVar, @RecentlyNonNull Activity activity, @RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull a aVar, @RecentlyNonNull Object obj);

    void showInterstitial();
}
