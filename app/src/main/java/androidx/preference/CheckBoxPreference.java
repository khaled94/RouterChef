package androidx.preference;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import e1.g;

/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {

    /* renamed from: k0 */
    public final a f1737k0 = new a();

    /* loaded from: classes.dex */
    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
            CheckBoxPreference.this = r1;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (!CheckBoxPreference.this.b(Boolean.valueOf(z10))) {
                compoundButton.setChecked(!z10);
            } else {
                CheckBoxPreference.this.G(z10);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public CheckBoxPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130968741(0x7f0400a5, float:1.7546144E38)
            r1 = 16842895(0x101008f, float:2.369396E-38)
            int r0 = d0.l.a(r4, r0, r1)
            r3.<init>(r4, r5, r0)
            androidx.preference.CheckBoxPreference$a r1 = new androidx.preference.CheckBoxPreference$a
            r1.<init>()
            r3.f1737k0 = r1
            int[] r1 = e1.j.f4372t
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            r5 = 5
            java.lang.String r5 = d0.l.i(r4, r5, r2)
            r3.I(r5)
            r5 = 4
            r0 = 1
            java.lang.String r5 = d0.l.i(r4, r5, r0)
            r3.H(r5)
            r5 = 2
            boolean r5 = r4.getBoolean(r5, r2)
            r0 = 3
            boolean r5 = r4.getBoolean(r0, r5)
            r3.f1814j0 = r5
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.CheckBoxPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final void L(View view) {
        boolean z10 = view instanceof CompoundButton;
        if (z10) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f1810f0);
        }
        if (z10) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f1737k0);
        }
    }

    @Override // androidx.preference.Preference
    public final void s(g gVar) {
        super.s(gVar);
        L(gVar.x(16908289));
        K(gVar);
    }

    @Override // androidx.preference.Preference
    public final void z(View view) {
        super.z(view);
        if (!((AccessibilityManager) this.f1768s.getSystemService("accessibility")).isEnabled()) {
            return;
        }
        L(view.findViewById(16908289));
        J(view.findViewById(16908304));
    }
}
