package m4;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import h3.a;
import h3.f;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class t91<AdT> implements e71<AdT> {
    @Override // m4.e71
    public final boolean a(km1 km1Var, cm1 cm1Var) {
        return !TextUtils.isEmpty(cm1Var.f7064w.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    @Override // m4.e71
    public final tz1<AdT> b(km1 km1Var, cm1 cm1Var) {
        String optString = cm1Var.f7064w.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        om1 om1Var = (om1) km1Var.f10488a.f8363t;
        nm1 nm1Var = new nm1();
        nm1Var.f11853o.f9379a = om1Var.f12214o.f12816a;
        jn jnVar = om1Var.f12203d;
        nm1Var.f11839a = jnVar;
        nm1Var.f11840b = om1Var.f12204e;
        nm1Var.f11855r = om1Var.f12215q;
        nm1Var.f11841c = om1Var.f12205f;
        nm1Var.f11842d = om1Var.f12200a;
        nm1Var.f11844f = om1Var.f12206g;
        nm1Var.f11845g = om1Var.f12207h;
        nm1Var.f11846h = om1Var.f12208i;
        nm1Var.f11847i = om1Var.f12209j;
        a aVar = om1Var.f12211l;
        nm1Var.f11848j = aVar;
        if (aVar != null) {
            nm1Var.f11843e = aVar.f5052s;
        }
        f fVar = om1Var.f12212m;
        nm1Var.f11849k = fVar;
        if (fVar != null) {
            nm1Var.f11843e = fVar.f5068s;
            nm1Var.f11850l = fVar.f5069t;
        }
        nm1Var.p = om1Var.p;
        nm1Var.f11854q = om1Var.f12202c;
        nm1Var.f11841c = optString;
        Bundle bundle = jnVar.E;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        Bundle bundle3 = bundle2.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        Bundle bundle4 = bundle3 == null ? new Bundle() : new Bundle(bundle3);
        bundle4.putInt("gw", 1);
        String optString2 = cm1Var.f7064w.optString(AdMobAdapter.HOUSE_ADS_PARAMETER, null);
        if (optString2 != null) {
            bundle4.putString(AdMobAdapter.HOUSE_ADS_PARAMETER, optString2);
        }
        String optString3 = cm1Var.f7064w.optString(AdMobAdapter.AD_JSON_PARAMETER, null);
        if (optString3 != null) {
            bundle4.putString(AdMobAdapter.AD_PARAMETER, optString3);
        }
        bundle4.putBoolean("_noRefresh", true);
        Iterator<String> keys = cm1Var.E.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = cm1Var.E.optString(next, null);
            if (next != null) {
                bundle4.putString(next, optString4);
            }
        }
        bundle2.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle4);
        jn jnVar2 = om1Var.f12203d;
        nm1Var.f11839a = new jn(jnVar2.f10128s, jnVar2.f10129t, bundle4, jnVar2.f10131v, jnVar2.f10132w, jnVar2.f10133x, jnVar2.y, jnVar2.f10134z, jnVar2.A, jnVar2.B, jnVar2.C, jnVar2.D, bundle2, jnVar2.F, jnVar2.G, jnVar2.H, jnVar2.I, jnVar2.J, jnVar2.K, jnVar2.L, jnVar2.M, jnVar2.N, jnVar2.O, jnVar2.P);
        om1 a10 = nm1Var.a();
        Bundle bundle5 = new Bundle();
        em1 em1Var = km1Var.f10489b.f10126b;
        Bundle bundle6 = new Bundle();
        bundle6.putStringArrayList("nofill_urls", new ArrayList<>(em1Var.f8003a));
        bundle6.putInt("refresh_interval", em1Var.f8005c);
        bundle6.putString("gws_query_id", em1Var.f8004b);
        bundle5.putBundle("parent_common_config", bundle6);
        String str = ((om1) km1Var.f10488a.f8363t).f12205f;
        Bundle bundle7 = new Bundle();
        bundle7.putString("initial_ad_unit_id", str);
        bundle7.putString("allocation_id", cm1Var.f7065x);
        bundle7.putStringArrayList("click_urls", new ArrayList<>(cm1Var.f7036c));
        bundle7.putStringArrayList("imp_urls", new ArrayList<>(cm1Var.f7038d));
        bundle7.putStringArrayList("manual_tracking_urls", new ArrayList<>(cm1Var.f7058q));
        bundle7.putStringArrayList("fill_urls", new ArrayList<>(cm1Var.f7056n));
        bundle7.putStringArrayList("video_start_urls", new ArrayList<>(cm1Var.f7046h));
        bundle7.putStringArrayList("video_reward_urls", new ArrayList<>(cm1Var.f7048i));
        bundle7.putStringArrayList("video_complete_urls", new ArrayList<>(cm1Var.f7050j));
        bundle7.putString("transaction_id", cm1Var.f7052k);
        bundle7.putString("valid_from_timestamp", cm1Var.f7054l);
        bundle7.putBoolean("is_closable_area_disabled", cm1Var.M);
        if (cm1Var.f7055m != null) {
            Bundle bundle8 = new Bundle();
            bundle8.putInt("rb_amount", cm1Var.f7055m.f10284t);
            bundle8.putString("rb_type", cm1Var.f7055m.f10283s);
            bundle7.putParcelableArray("rewards", new Bundle[]{bundle8});
        }
        bundle5.putBundle("parent_ad_config", bundle7);
        return c(a10, bundle5);
    }

    public abstract tz1<AdT> c(om1 om1Var, Bundle bundle);
}
