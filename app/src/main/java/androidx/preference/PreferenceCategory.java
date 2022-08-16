package androidx.preference;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import com.raouf.routerchef.R;
import d0.l;
import e1.g;

/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, l.a(context, R.attr.preferenceCategoryStyle, 16842892), 0);
    }

    @Override // androidx.preference.Preference
    public final boolean D() {
        return !super.m();
    }

    @Override // androidx.preference.Preference
    public final boolean m() {
        return false;
    }

    @Override // androidx.preference.Preference
    public final void s(g gVar) {
        super.s(gVar);
        if (Build.VERSION.SDK_INT >= 28) {
            gVar.f1924a.setAccessibilityHeading(true);
        }
    }
}
