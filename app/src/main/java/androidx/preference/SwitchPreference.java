package androidx.preference;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import e1.g;

/* loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {

    /* renamed from: k0 */
    public final a f1802k0 = new a();

    /* renamed from: l0 */
    public CharSequence f1803l0;

    /* renamed from: m0 */
    public CharSequence f1804m0;

    /* loaded from: classes.dex */
    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
            SwitchPreference.this = r1;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (!SwitchPreference.this.b(Boolean.valueOf(z10))) {
                compoundButton.setChecked(!z10);
            } else {
                SwitchPreference.this.G(z10);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SwitchPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130969651(0x7f040433, float:1.754799E38)
            r1 = 16843629(0x101036d, float:2.3696016E-38)
            int r0 = d0.l.a(r4, r0, r1)
            r3.<init>(r4, r5, r0)
            androidx.preference.SwitchPreference$a r1 = new androidx.preference.SwitchPreference$a
            r1.<init>()
            r3.f1802k0 = r1
            int[] r1 = e1.j.D
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            r5 = 7
            java.lang.String r5 = d0.l.i(r4, r5, r2)
            r3.I(r5)
            r5 = 6
            r0 = 1
            java.lang.String r5 = d0.l.i(r4, r5, r0)
            r3.H(r5)
            r5 = 9
            r0 = 3
            java.lang.String r5 = d0.l.i(r4, r5, r0)
            r3.f1803l0 = r5
            r3.n()
            r5 = 8
            r0 = 4
            java.lang.String r5 = d0.l.i(r4, r5, r0)
            r3.f1804m0 = r5
            r3.n()
            r5 = 2
            boolean r5 = r4.getBoolean(r5, r2)
            r0 = 5
            boolean r5 = r4.getBoolean(r0, r5)
            r3.f1814j0 = r5
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.SwitchPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final void L(View view) {
        boolean z10 = view instanceof Switch;
        if (z10) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f1810f0);
        }
        if (z10) {
            Switch r42 = (Switch) view;
            r42.setTextOn(this.f1803l0);
            r42.setTextOff(this.f1804m0);
            r42.setOnCheckedChangeListener(this.f1802k0);
        }
    }

    @Override // androidx.preference.Preference
    public final void s(g gVar) {
        super.s(gVar);
        L(gVar.x(16908352));
        K(gVar);
    }

    @Override // androidx.preference.Preference
    public final void z(View view) {
        super.z(view);
        if (!((AccessibilityManager) this.f1768s.getSystemService("accessibility")).isEnabled()) {
            return;
        }
        L(view.findViewById(16908352));
        J(view.findViewById(16908304));
    }
}
