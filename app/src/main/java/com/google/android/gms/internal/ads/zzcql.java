package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;

/* loaded from: classes.dex */
public interface zzcql extends MediationInterstitialAdapter {
    Bundle getInterstitialAdapterInfo();

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    /* synthetic */ void onDestroy();

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    /* synthetic */ void onPause();

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    /* synthetic */ void onResume();
}
