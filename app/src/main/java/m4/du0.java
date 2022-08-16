package m4;

import d.a;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class du0 implements nd2 {

    /* renamed from: a */
    public final /* synthetic */ int f7641a;

    /* renamed from: b */
    public final Object f7642b;

    public /* synthetic */ du0(Object obj, int i10) {
        this.f7641a = i10;
        this.f7642b = obj;
    }

    @Override // m4.vd2
    public final Object a() {
        switch (this.f7641a) {
            case 0:
                Set singleton = ((bu0) ((vd2) this.f7642b)).b().f11033d != null ? Collections.singleton("banner") : Collections.emptySet();
                a.d(singleton);
                return singleton;
            case 1:
                return ((mo0) ((vd2) this.f7642b)).b().f12214o.f12816a == 3 ? zj.REWARDED_INTERSTITIAL : zj.REWARD_BASED_VIDEO_AD;
            default:
                return new wo2();
        }
    }
}
