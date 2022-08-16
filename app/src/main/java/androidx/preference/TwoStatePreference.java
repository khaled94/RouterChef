package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import androidx.preference.Preference;
import e1.g;

/* loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {

    /* renamed from: f0 */
    public boolean f1810f0;

    /* renamed from: g0 */
    public CharSequence f1811g0;

    /* renamed from: h0 */
    public CharSequence f1812h0;

    /* renamed from: i0 */
    public boolean f1813i0;

    /* renamed from: j0 */
    public boolean f1814j0;

    /* loaded from: classes.dex */
    public static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new C0020a();

        /* renamed from: s */
        public boolean f1815s;

        /* renamed from: androidx.preference.TwoStatePreference$a$a */
        /* loaded from: classes.dex */
        public class C0020a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i10) {
                return new a[i10];
            }
        }

        public a(Parcel parcel) {
            super(parcel);
            this.f1815s = parcel.readInt() != 1 ? false : true;
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f1815s ? 1 : 0);
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // androidx.preference.Preference
    public final boolean D() {
        return (this.f1814j0 ? this.f1810f0 : !this.f1810f0) || super.D();
    }

    public final void G(boolean z10) {
        boolean z11 = this.f1810f0 != z10;
        if (z11 || !this.f1813i0) {
            this.f1810f0 = z10;
            this.f1813i0 = true;
            if (E() && z10 != g(!z10)) {
                SharedPreferences.Editor c10 = this.f1769t.c();
                c10.putBoolean(this.D, z10);
                F(c10);
            }
            if (!z11) {
                return;
            }
            o(D());
            n();
        }
    }

    public final void H(CharSequence charSequence) {
        this.f1812h0 = charSequence;
        if (!this.f1810f0) {
            n();
        }
    }

    public final void I(CharSequence charSequence) {
        this.f1811g0 = charSequence;
        if (this.f1810f0) {
            n();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L5
            return
        L5:
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 1
            boolean r1 = r4.f1810f0
            r2 = 0
            if (r1 == 0) goto L1c
            java.lang.CharSequence r1 = r4.f1811g0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L1c
            java.lang.CharSequence r0 = r4.f1811g0
        L17:
            r5.setText(r0)
            r0 = r2
            goto L2b
        L1c:
            boolean r1 = r4.f1810f0
            if (r1 != 0) goto L2b
            java.lang.CharSequence r1 = r4.f1812h0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L2b
            java.lang.CharSequence r0 = r4.f1812h0
            goto L17
        L2b:
            if (r0 == 0) goto L3b
            java.lang.CharSequence r1 = r4.k()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L3b
            r5.setText(r1)
            r0 = r2
        L3b:
            r1 = 8
            if (r0 != 0) goto L40
            goto L41
        L40:
            r2 = r1
        L41:
            int r0 = r5.getVisibility()
            if (r2 == r0) goto L4a
            r5.setVisibility(r2)
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.J(android.view.View):void");
    }

    public final void K(g gVar) {
        J(gVar.x(16908304));
    }

    @Override // androidx.preference.Preference
    public final void t() {
        boolean z10 = !this.f1810f0;
        if (b(Boolean.valueOf(z10))) {
            G(z10);
        }
    }

    @Override // androidx.preference.Preference
    public final Object v(TypedArray typedArray, int i10) {
        return Boolean.valueOf(typedArray.getBoolean(i10, false));
    }

    @Override // androidx.preference.Preference
    public final void w(Parcelable parcelable) {
        if (!parcelable.getClass().equals(a.class)) {
            super.w(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.w(aVar.getSuperState());
        G(aVar.f1815s);
    }

    @Override // androidx.preference.Preference
    public final Parcelable x() {
        this.f1764b0 = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.J) {
            return absSavedState;
        }
        a aVar = new a(absSavedState);
        aVar.f1815s = this.f1810f0;
        return aVar;
    }

    @Override // androidx.preference.Preference
    public final void y(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        G(g(((Boolean) obj).booleanValue()));
    }
}
