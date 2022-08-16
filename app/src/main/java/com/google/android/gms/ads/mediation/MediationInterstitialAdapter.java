package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import p3.e;
import p3.f;
import p3.j;

@Deprecated
/* loaded from: classes.dex */
public interface MediationInterstitialAdapter extends f {
    @Override // 
    /* synthetic */ void onDestroy();

    @Override // 
    /* synthetic */ void onPause();

    @Override // 
    /* synthetic */ void onResume();

    void requestInterstitialAd(@RecentlyNonNull Context context, @RecentlyNonNull j jVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull e eVar, Bundle bundle2);

    void showInterstitial();
}
