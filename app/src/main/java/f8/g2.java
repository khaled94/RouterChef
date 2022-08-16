package f8;

import android.util.Log;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.android.billingclient.api.Purchase;
import com.raouf.routerchef.SettingsActivity;
import h2.f;
import h2.g;
import java.util.List;
import java.util.Objects;
import q8.a;
import r8.b;

/* loaded from: classes.dex */
public final /* synthetic */ class g2 implements Preference.d, g {

    /* renamed from: s */
    public final /* synthetic */ Object f4607s;

    public /* synthetic */ g2(Object obj) {
        this.f4607s = obj;
    }

    @Override // androidx.preference.Preference.d
    public final void a(Preference preference, Object obj) {
        SettingsActivity.a aVar = (SettingsActivity.a) this.f4607s;
        int i10 = SettingsActivity.a.f3640u0;
        Objects.requireNonNull(aVar);
        String str = (String) obj;
        if (preference.D.equals("language")) {
            b.p(str, aVar.U());
            aVar.U().recreate();
        }
        ListPreference listPreference = (ListPreference) preference;
        listPreference.C(listPreference.f1752l0[listPreference.G(str)]);
    }

    @Override // h2.g
    public final void b(f fVar, List list) {
        a.C0106a c0106a = (a.C0106a) this.f4607s;
        Objects.requireNonNull(c0106a);
        if (fVar.f4994a != 0) {
            a aVar = a.this;
            aVar.c(aVar.b());
            Log.i("In checkSub-Not-OK ::::: ", "Offline Check : " + a.this.b());
        } else if (list.size() > 0) {
            a.d(a.this.f17152a, (Purchase) list.get(0));
            Log.i("In checkSub-OK ::::: ", "Has Sub");
            a.this.c(true);
        } else {
            a.d(a.this.f17152a, null);
            Log.i("In checkSub-OK ::::: ", "Doesn't have Sub");
            a.this.c(false);
        }
    }
}
