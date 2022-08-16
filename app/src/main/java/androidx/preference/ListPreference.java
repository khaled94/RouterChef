package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import androidx.preference.Preference;
import com.raouf.routerchef.R;
import d0.l;
import e1.j;

/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* renamed from: l0 */
    public CharSequence[] f1752l0;

    /* renamed from: m0 */
    public CharSequence[] f1753m0;

    /* renamed from: n0 */
    public String f1754n0;

    /* renamed from: o0 */
    public String f1755o0;

    /* renamed from: p0 */
    public boolean f1756p0;

    /* loaded from: classes.dex */
    public static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new C0017a();

        /* renamed from: s */
        public String f1757s;

        /* renamed from: androidx.preference.ListPreference$a$a */
        /* loaded from: classes.dex */
        public class C0017a implements Parcelable.Creator<a> {
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
            this.f1757s = parcel.readString();
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f1757s);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Preference.g<ListPreference> {

        /* renamed from: a */
        public static b f1758a;

        @Override // androidx.preference.Preference.g
        public final CharSequence a(ListPreference listPreference) {
            ListPreference listPreference2 = listPreference;
            return TextUtils.isEmpty(listPreference2.H()) ? listPreference2.f1768s.getString(R.string.not_set) : listPreference2.H();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, l.a(context, R.attr.dialogPreferenceStyle, 16842897));
    }

    @Override // androidx.preference.Preference
    public final void C(CharSequence charSequence) {
        super.C(charSequence);
        this.f1755o0 = charSequence == null ? null : charSequence.toString();
    }

    public final int G(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f1753m0) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.f1753m0[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public final CharSequence H() {
        CharSequence[] charSequenceArr;
        int G = G(this.f1754n0);
        if (G < 0 || (charSequenceArr = this.f1752l0) == null) {
            return null;
        }
        return charSequenceArr[G];
    }

    public final void I(String str) {
        boolean z10 = !TextUtils.equals(this.f1754n0, str);
        if (z10 || !this.f1756p0) {
            this.f1754n0 = str;
            this.f1756p0 = true;
            A(str);
            if (!z10) {
                return;
            }
            n();
        }
    }

    @Override // androidx.preference.Preference
    public final CharSequence k() {
        Preference.g gVar = this.f1766d0;
        if (gVar != null) {
            return gVar.a(this);
        }
        CharSequence H = H();
        CharSequence k10 = super.k();
        String str = this.f1755o0;
        if (str == null) {
            return k10;
        }
        Object[] objArr = new Object[1];
        if (H == null) {
            H = "";
        }
        objArr[0] = H;
        String format = String.format(str, objArr);
        if (TextUtils.equals(format, k10)) {
            return k10;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
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
        I(aVar.f1757s);
    }

    @Override // androidx.preference.Preference
    public final Parcelable x() {
        this.f1764b0 = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.J) {
            return absSavedState;
        }
        a aVar = new a(absSavedState);
        aVar.f1757s = this.f1754n0;
        return aVar;
    }

    @Override // androidx.preference.Preference
    public final void y(Object obj) {
        I(i((String) obj));
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f4375w, i10, 0);
        this.f1752l0 = l.j(obtainStyledAttributes, 2, 0);
        this.f1753m0 = l.j(obtainStyledAttributes, 3, 1);
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            if (b.f1758a == null) {
                b.f1758a = new b();
            }
            this.f1766d0 = b.f1758a;
            n();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, j.y, i10, 0);
        this.f1755o0 = l.i(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
    }
}
