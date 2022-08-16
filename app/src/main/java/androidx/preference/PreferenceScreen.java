package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.fragment.app.o;
import androidx.preference.b;
import androidx.preference.e;
import com.raouf.routerchef.R;
import d0.l;

/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {

    /* renamed from: l0 */
    public boolean f1784l0 = true;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, l.a(context, R.attr.preferenceScreenStyle, 16842891), 0);
    }

    @Override // androidx.preference.Preference
    public final void t() {
        e.b bVar;
        if (this.E != null || this.F != null || I() == 0 || (bVar = this.f1769t.f1851j) == null) {
            return;
        }
        b bVar2 = (b) bVar;
        boolean z10 = false;
        for (o oVar = bVar2; !z10 && oVar != null; oVar = oVar.M) {
            if (oVar instanceof b.f) {
                z10 = ((b.f) oVar).a();
            }
        }
        if (!z10 && (bVar2.l() instanceof b.f)) {
            z10 = ((b.f) bVar2.l()).a();
        }
        if (z10 || !(bVar2.j() instanceof b.f)) {
            return;
        }
        ((b.f) bVar2.j()).a();
    }
}
