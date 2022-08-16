package androidx.preference;

import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.AbsSavedState;
import androidx.preference.Preference;
import com.raouf.routerchef.R;

/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {

    /* renamed from: l0 */
    public String f1749l0;

    /* loaded from: classes.dex */
    public static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new C0016a();

        /* renamed from: s */
        public String f1750s;

        /* renamed from: androidx.preference.EditTextPreference$a$a */
        /* loaded from: classes.dex */
        public class C0016a implements Parcelable.Creator<a> {
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
            this.f1750s = parcel.readString();
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f1750s);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Preference.g<EditTextPreference> {

        /* renamed from: a */
        public static b f1751a;

        @Override // androidx.preference.Preference.g
        public final CharSequence a(EditTextPreference editTextPreference) {
            EditTextPreference editTextPreference2 = editTextPreference;
            if (TextUtils.isEmpty(editTextPreference2.f1749l0)) {
                return editTextPreference2.f1768s.getString(R.string.not_set);
            }
            return editTextPreference2.f1749l0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public EditTextPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130968967(0x7f040187, float:1.7546603E38)
            r1 = 16842898(0x1010092, float:2.3693967E-38)
            int r0 = d0.l.a(r4, r0, r1)
            r3.<init>(r4, r5, r0)
            int[] r1 = e1.j.f4374v
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            boolean r5 = d0.l.b(r4, r2, r2, r2)
            if (r5 == 0) goto L2c
            androidx.preference.EditTextPreference$b r5 = androidx.preference.EditTextPreference.b.f1751a
            if (r5 != 0) goto L25
            androidx.preference.EditTextPreference$b r5 = new androidx.preference.EditTextPreference$b
            r5.<init>()
            androidx.preference.EditTextPreference.b.f1751a = r5
        L25:
            androidx.preference.EditTextPreference$b r5 = androidx.preference.EditTextPreference.b.f1751a
            r3.f1766d0 = r5
            r3.n()
        L2c:
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.EditTextPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // androidx.preference.Preference
    public final boolean D() {
        return TextUtils.isEmpty(this.f1749l0) || super.D();
    }

    public final void G(String str) {
        boolean D = D();
        this.f1749l0 = str;
        A(str);
        boolean D2 = D();
        if (D2 != D) {
            o(D2);
        }
        n();
    }

    @Override // androidx.preference.Preference
    public final Object v(TypedArray typedArray, int i10) {
        return typedArray.getString(i10);
    }

    @Override // androidx.preference.Preference
    public final void w(Parcelable parcelable) {
        if (!parcelable.getClass().equals(a.class)) {
            super.w(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.w(aVar.getSuperState());
        G(aVar.f1750s);
    }

    @Override // androidx.preference.Preference
    public final Parcelable x() {
        this.f1764b0 = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.J) {
            return absSavedState;
        }
        a aVar = new a(absSavedState);
        aVar.f1750s = this.f1749l0;
        return aVar;
    }

    @Override // androidx.preference.Preference
    public final void y(Object obj) {
        G(i((String) obj));
    }
}
