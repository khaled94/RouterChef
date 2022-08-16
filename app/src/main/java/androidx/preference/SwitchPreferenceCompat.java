package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import com.raouf.routerchef.R;
import d0.l;
import e1.g;
import e1.j;

/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {

    /* renamed from: k0 */
    public final a f1806k0 = new a();

    /* renamed from: l0 */
    public CharSequence f1807l0;

    /* renamed from: m0 */
    public CharSequence f1808m0;

    /* loaded from: classes.dex */
    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
            SwitchPreferenceCompat.this = r1;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (!SwitchPreferenceCompat.this.b(Boolean.valueOf(z10))) {
                compoundButton.setChecked(!z10);
            } else {
                SwitchPreferenceCompat.this.G(z10);
            }
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchPreferenceCompatStyle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.E, R.attr.switchPreferenceCompatStyle, 0);
        I(l.i(obtainStyledAttributes, 7, 0));
        H(l.i(obtainStyledAttributes, 6, 1));
        this.f1807l0 = l.i(obtainStyledAttributes, 9, 3);
        n();
        this.f1808m0 = l.i(obtainStyledAttributes, 8, 4);
        n();
        this.f1814j0 = obtainStyledAttributes.getBoolean(5, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }

    public final void L(View view) {
        boolean z10 = view instanceof SwitchCompat;
        if (z10) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f1810f0);
        }
        if (z10) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.f1807l0);
            switchCompat.setTextOff(this.f1808m0);
            switchCompat.setOnCheckedChangeListener(this.f1806k0);
        }
    }

    @Override // androidx.preference.Preference
    public final void s(g gVar) {
        super.s(gVar);
        L(gVar.x(R.id.switchWidget));
        K(gVar);
    }

    @Override // androidx.preference.Preference
    public final void z(View view) {
        super.z(view);
        if (!((AccessibilityManager) this.f1768s.getSystemService("accessibility")).isEnabled()) {
            return;
        }
        L(view.findViewById(R.id.switchWidget));
        J(view.findViewById(16908304));
    }
}
