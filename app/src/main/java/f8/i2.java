package f8;

import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.android.billingclient.api.Purchase;
import com.raouf.routerchef.SettingsActivity;
import h2.f;
import h2.h;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import o8.a;
import q8.e;

/* loaded from: classes.dex */
public final /* synthetic */ class i2 implements Preference.d, h {

    /* renamed from: s */
    public final /* synthetic */ Object f4622s;

    public /* synthetic */ i2(Object obj) {
        this.f4622s = obj;
    }

    @Override // androidx.preference.Preference.d
    public final void a(Preference preference, Object obj) {
        SettingsActivity.a aVar = (SettingsActivity.a) this.f4622s;
        int i10 = SettingsActivity.a.f3640u0;
        Objects.requireNonNull(aVar);
        String str = (String) obj;
        if (preference.D.equals("router_model")) {
            SettingsActivity settingsActivity = (SettingsActivity) aVar.U();
            settingsActivity.T.b(str);
            settingsActivity.S = (a) settingsActivity.T.f16191s;
        }
        ListPreference listPreference = (ListPreference) preference;
        listPreference.C(listPreference.f1752l0[listPreference.G(str)]);
    }

    @Override // h2.h
    public final void b(f fVar, List list) {
        e eVar = (e) this.f4622s;
        Objects.requireNonNull(eVar);
        if (fVar.f4994a != 0 || list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            eVar.a((Purchase) it.next());
        }
    }
}
