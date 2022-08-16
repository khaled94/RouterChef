package e1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.raouf.routerchef.R;
import f.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class b extends Preference {

    /* renamed from: f0 */
    public long f4339f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, List<Preference> list, long j3) {
        super(context, null);
        String str = null;
        this.W = R.layout.expand_button;
        Drawable b10 = a.b(this.f1768s, R.drawable.ic_arrow_down_24dp);
        if (this.C != b10) {
            this.C = b10;
            this.B = 0;
            n();
        }
        this.B = R.drawable.ic_arrow_down_24dp;
        String string = this.f1768s.getString(R.string.expand_button_title);
        if (!TextUtils.equals(string, this.f1774z)) {
            this.f1774z = string;
            n();
        }
        if (999 != this.y) {
            this.y = 999;
            p();
        }
        ArrayList arrayList = new ArrayList();
        for (Preference preference : list) {
            CharSequence charSequence = preference.f1774z;
            boolean z10 = preference instanceof PreferenceGroup;
            if (z10 && !TextUtils.isEmpty(charSequence)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.f1763a0)) {
                if (z10) {
                    arrayList.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(charSequence)) {
                str = str == null ? charSequence : this.f1768s.getString(R.string.summary_collapsed_preference_list, str, charSequence);
            }
        }
        C(str);
        this.f4339f0 = j3 + 1000000;
    }

    @Override // androidx.preference.Preference
    public final long f() {
        return this.f4339f0;
    }

    @Override // androidx.preference.Preference
    public final void s(g gVar) {
        super.s(gVar);
        gVar.f4355w = false;
    }
}
