package t3;

import m4.nd2;
import m4.zj;

/* loaded from: classes.dex */
public final class c implements nd2<zj> {

    /* renamed from: a */
    public final b0 f18580a;

    public c(b0 b0Var) {
        this.f18580a = b0Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // m4.vd2
    public final Object a() {
        char c10;
        String str = this.f18580a.f18579a;
        switch (str.hashCode()) {
            case -1999289321:
                if (str.equals("NATIVE")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -1372958932:
                if (str.equals("INTERSTITIAL")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 543046670:
                if (str.equals("REWARDED")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 1951953708:
                if (str.equals("BANNER")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        return c10 != 0 ? c10 != 1 ? c10 != 2 ? c10 != 3 ? zj.AD_INITIATER_UNSPECIFIED : zj.REWARD_BASED_VIDEO_AD : zj.AD_LOADER : zj.INTERSTITIAL : zj.BANNER;
    }
}
