package f3;

import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import com.google.ads.mediation.admob.AdMobAdapter;
import m4.sq;
import m4.tq;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    public final tq f4490a;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final sq f4491a;

        public a() {
            sq sqVar = new sq();
            this.f4491a = sqVar;
            sqVar.f13802d.add("B3EEABB8EE11C2BE770B684D95219ECB");
        }

        @RecentlyNonNull
        public final a a(@RecentlyNonNull Bundle bundle) {
            this.f4491a.f13800b.putBundle(AdMobAdapter.class.getName(), bundle);
            if (AdMobAdapter.class.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
                this.f4491a.f13802d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
            }
            return this;
        }
    }

    public d(@RecentlyNonNull a aVar) {
        this.f4490a = new tq(aVar.f4491a);
    }
}
