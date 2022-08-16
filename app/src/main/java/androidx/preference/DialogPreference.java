package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.fragment.app.g0;
import androidx.fragment.app.n;
import androidx.fragment.app.o;
import androidx.preference.b;
import androidx.preference.e;
import com.raouf.routerchef.R;
import d0.l;
import e1.c;
import e1.d;
import e1.j;

/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {

    /* renamed from: f0 */
    public CharSequence f1739f0;

    /* renamed from: g0 */
    public String f1740g0;

    /* renamed from: h0 */
    public Drawable f1741h0;

    /* renamed from: i0 */
    public String f1742i0;

    /* renamed from: j0 */
    public String f1743j0;

    /* renamed from: k0 */
    public int f1744k0;

    /* loaded from: classes.dex */
    public interface a {
        <T extends Preference> T e(CharSequence charSequence);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, l.a(context, R.attr.dialogPreferenceStyle, 16842897));
    }

    @Override // androidx.preference.Preference
    public void t() {
        n nVar;
        e.a aVar = this.f1769t.f1850i;
        if (aVar != null) {
            b bVar = (b) aVar;
            boolean z10 = false;
            for (o oVar = bVar; !z10 && oVar != null; oVar = oVar.M) {
                if (oVar instanceof b.d) {
                    z10 = ((b.d) oVar).a();
                }
            }
            if (!z10 && (bVar.l() instanceof b.d)) {
                z10 = ((b.d) bVar.l()).a();
            }
            if (!z10 && (bVar.j() instanceof b.d)) {
                z10 = ((b.d) bVar.j()).a();
            }
            if (z10 || bVar.q().F("androidx.preference.PreferenceFragment.DIALOG") != null) {
                return;
            }
            if (this instanceof EditTextPreference) {
                String str = this.D;
                nVar = new e1.a();
                Bundle bundle = new Bundle(1);
                bundle.putString("key", str);
                nVar.a0(bundle);
            } else if (this instanceof ListPreference) {
                String str2 = this.D;
                nVar = new c();
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("key", str2);
                nVar.a0(bundle2);
            } else if (this instanceof MultiSelectListPreference) {
                String str3 = this.D;
                nVar = new d();
                Bundle bundle3 = new Bundle(1);
                bundle3.putString("key", str3);
                nVar.a0(bundle3);
            } else {
                StringBuilder c10 = androidx.activity.result.a.c("Cannot display dialog for an unknown Preference type: ");
                c10.append(getClass().getSimpleName());
                c10.append(". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                throw new IllegalArgumentException(c10.toString());
            }
            nVar.d0(bVar);
            g0 q10 = bVar.q();
            nVar.f1493z0 = false;
            nVar.A0 = true;
            androidx.fragment.app.b bVar2 = new androidx.fragment.app.b(q10);
            bVar2.p = true;
            bVar2.d(0, nVar, "androidx.preference.PreferenceFragment.DIALOG", 1);
            bVar2.c();
        }
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f4373u, i10, 0);
        String i11 = l.i(obtainStyledAttributes, 9, 0);
        this.f1739f0 = i11;
        if (i11 == null) {
            this.f1739f0 = this.f1774z;
        }
        this.f1740g0 = l.i(obtainStyledAttributes, 8, 1);
        Drawable drawable = obtainStyledAttributes.getDrawable(6);
        this.f1741h0 = drawable == null ? obtainStyledAttributes.getDrawable(2) : drawable;
        this.f1742i0 = l.i(obtainStyledAttributes, 11, 3);
        this.f1743j0 = l.i(obtainStyledAttributes, 10, 4);
        this.f1744k0 = obtainStyledAttributes.getResourceId(7, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }
}
