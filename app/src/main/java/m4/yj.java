package m4;

/* loaded from: classes.dex */
public final class yj implements p92 {

    /* renamed from: a */
    public static final yj f15795a = new yj();

    @Override // m4.p92
    public final boolean a(int i10) {
        zj zjVar;
        switch (i10) {
            case 0:
                zjVar = zj.AD_INITIATER_UNSPECIFIED;
                break;
            case 1:
                zjVar = zj.BANNER;
                break;
            case 2:
                zjVar = zj.DFP_BANNER;
                break;
            case 3:
                zjVar = zj.INTERSTITIAL;
                break;
            case 4:
                zjVar = zj.DFP_INTERSTITIAL;
                break;
            case 5:
                zjVar = zj.NATIVE_EXPRESS;
                break;
            case 6:
                zjVar = zj.AD_LOADER;
                break;
            case 7:
                zjVar = zj.REWARD_BASED_VIDEO_AD;
                break;
            case 8:
                zjVar = zj.BANNER_SEARCH_ADS;
                break;
            case 9:
                zjVar = zj.GOOGLE_MOBILE_ADS_SDK_ADAPTER;
                break;
            case 10:
                zjVar = zj.APP_OPEN;
                break;
            case 11:
                zjVar = zj.REWARDED_INTERSTITIAL;
                break;
            default:
                zjVar = null;
                break;
        }
        return zjVar != null;
    }
}
