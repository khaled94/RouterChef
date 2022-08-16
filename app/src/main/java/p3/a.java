package p3;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import java.util.List;
import o2.g;

/* loaded from: classes.dex */
public abstract class a {
    @RecentlyNonNull
    public abstract q getSDKVersionInfo();

    @RecentlyNonNull
    public abstract q getVersionInfo();

    public abstract void initialize(@RecentlyNonNull Context context, @RecentlyNonNull b bVar, @RecentlyNonNull List<a0.a> list);

    public void loadBannerAd(@RecentlyNonNull g gVar, @RecentlyNonNull d<Object, Object> dVar) {
        dVar.e(new f3.a(7, getClass().getSimpleName().concat(" does not support banner ads."), "com.google.android.gms.ads", null));
    }

    public void loadInterscrollerAd(@RecentlyNonNull g gVar, @RecentlyNonNull d<Object, Object> dVar) {
        dVar.e(new f3.a(7, getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads", null));
    }

    public void loadInterstitialAd(@RecentlyNonNull i iVar, @RecentlyNonNull d<Object, Object> dVar) {
        dVar.e(new f3.a(7, getClass().getSimpleName().concat(" does not support interstitial ads."), "com.google.android.gms.ads", null));
    }

    public void loadNativeAd(@RecentlyNonNull k kVar, @RecentlyNonNull d<g, Object> dVar) {
        dVar.e(new f3.a(7, getClass().getSimpleName().concat(" does not support native ads."), "com.google.android.gms.ads", null));
    }

    public void loadRewardedAd(@RecentlyNonNull m mVar, @RecentlyNonNull d<Object, Object> dVar) {
        dVar.e(new f3.a(7, getClass().getSimpleName().concat(" does not support rewarded ads."), "com.google.android.gms.ads", null));
    }

    public void loadRewardedInterstitialAd(@RecentlyNonNull m mVar, @RecentlyNonNull d<Object, Object> dVar) {
        dVar.e(new f3.a(7, getClass().getSimpleName().concat(" does not support rewarded interstitial ads."), "com.google.android.gms.ads", null));
    }
}
