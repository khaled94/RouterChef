package androidx.preference;

import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import androidx.preference.Preference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {

    /* renamed from: l0 */
    public CharSequence[] f1759l0;

    /* renamed from: m0 */
    public CharSequence[] f1760m0;

    /* renamed from: n0 */
    public Set<String> f1761n0 = new HashSet();

    /* loaded from: classes.dex */
    public static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new C0018a();

        /* renamed from: s */
        public Set<String> f1762s;

        /* renamed from: androidx.preference.MultiSelectListPreference$a$a */
        /* loaded from: classes.dex */
        public class C0018a implements Parcelable.Creator<a> {
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
            int readInt = parcel.readInt();
            this.f1762s = new HashSet();
            String[] strArr = new String[readInt];
            parcel.readStringArray(strArr);
            Collections.addAll(this.f1762s, strArr);
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
        /* JADX WARN: Type inference failed for: r3v3, types: [java.util.HashSet, java.util.Set, java.util.Set<java.lang.String>] */
        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f1762s.size());
            ?? r32 = this.f1762s;
            parcel.writeStringArray((String[]) r32.toArray(new String[r32.size()]));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MultiSelectListPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130968930(0x7f040162, float:1.7546528E38)
            r1 = 16842897(0x1010091, float:2.3693964E-38)
            int r0 = d0.l.a(r4, r0, r1)
            r3.<init>(r4, r5, r0)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r3.f1761n0 = r1
            int[] r1 = e1.j.f4376x
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r1, r0, r2)
            r5 = 2
            java.lang.CharSequence[] r5 = d0.l.j(r4, r5, r2)
            r3.f1759l0 = r5
            r5 = 3
            r0 = 1
            java.lang.CharSequence[] r5 = d0.l.j(r4, r5, r0)
            r3.f1760m0 = r5
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.MultiSelectListPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    public final void G(Set<String> set) {
        this.f1761n0.clear();
        this.f1761n0.addAll(set);
        if (E() && !set.equals(j(null))) {
            SharedPreferences.Editor c10 = this.f1769t.c();
            c10.putStringSet(this.D, set);
            F(c10);
        }
        n();
    }

    @Override // androidx.preference.Preference
    public final Object v(TypedArray typedArray, int i10) {
        CharSequence[] textArray = typedArray.getTextArray(i10);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // androidx.preference.Preference
    public final void w(Parcelable parcelable) {
        if (!parcelable.getClass().equals(a.class)) {
            super.w(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.w(aVar.getSuperState());
        G(aVar.f1762s);
    }

    @Override // androidx.preference.Preference
    public final Parcelable x() {
        this.f1764b0 = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.J) {
            return absSavedState;
        }
        a aVar = new a(absSavedState);
        aVar.f1762s = this.f1761n0;
        return aVar;
    }

    @Override // androidx.preference.Preference
    public final void y(Object obj) {
        G(j((Set) obj));
    }
}
