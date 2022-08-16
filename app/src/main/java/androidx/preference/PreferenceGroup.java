package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import androidx.preference.Preference;
import d0.l;
import e1.j;
import java.util.ArrayList;
import java.util.List;
import r.g;

/* loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {

    /* renamed from: f0 */
    public final g<String, Long> f1777f0;

    /* renamed from: g0 */
    public final List<Preference> f1778g0;

    /* renamed from: h0 */
    public boolean f1779h0;

    /* renamed from: i0 */
    public int f1780i0;

    /* renamed from: j0 */
    public boolean f1781j0;

    /* renamed from: k0 */
    public int f1782k0;

    /* loaded from: classes.dex */
    public static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new C0019a();

        /* renamed from: s */
        public int f1783s;

        /* renamed from: androidx.preference.PreferenceGroup$a$a */
        /* loaded from: classes.dex */
        public class C0019a implements Parcelable.Creator<a> {
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
            this.f1783s = parcel.readInt();
        }

        public a(Parcelable parcelable, int i10) {
            super(parcelable);
            this.f1783s = i10;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f1783s);
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }

    public final <T extends Preference> T G(CharSequence charSequence) {
        T t10;
        if (charSequence != null) {
            if (TextUtils.equals(this.D, charSequence)) {
                return this;
            }
            int I = I();
            for (int i10 = 0; i10 < I; i10++) {
                T t11 = (T) H(i10);
                if (TextUtils.equals(t11.D, charSequence)) {
                    return t11;
                }
                if ((t11 instanceof PreferenceGroup) && (t10 = (T) ((PreferenceGroup) t11).G(charSequence)) != null) {
                    return t10;
                }
            }
            return null;
        }
        throw new IllegalArgumentException("Key cannot be null");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<androidx.preference.Preference>, java.util.ArrayList] */
    public final Preference H(int i10) {
        return (Preference) this.f1778g0.get(i10);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List<androidx.preference.Preference>, java.util.ArrayList] */
    public final int I() {
        return this.f1778g0.size();
    }

    public final void J(int i10) {
        if (i10 != Integer.MAX_VALUE && !l()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.f1782k0 = i10;
    }

    @Override // androidx.preference.Preference
    public final void d(Bundle bundle) {
        super.d(bundle);
        int I = I();
        for (int i10 = 0; i10 < I; i10++) {
            H(i10).d(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void e(Bundle bundle) {
        super.e(bundle);
        int I = I();
        for (int i10 = 0; i10 < I; i10++) {
            H(i10).e(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void o(boolean z10) {
        super.o(z10);
        int I = I();
        for (int i10 = 0; i10 < I; i10++) {
            Preference H = H(i10);
            if (H.N == z10) {
                H.N = !z10;
                H.o(H.D());
                H.n();
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void q() {
        super.q();
        this.f1781j0 = true;
        int I = I();
        for (int i10 = 0; i10 < I; i10++) {
            H(i10).q();
        }
    }

    @Override // androidx.preference.Preference
    public final void u() {
        super.u();
        this.f1781j0 = false;
        int I = I();
        for (int i10 = 0; i10 < I; i10++) {
            H(i10).u();
        }
    }

    @Override // androidx.preference.Preference
    public final void w(Parcelable parcelable) {
        if (!parcelable.getClass().equals(a.class)) {
            super.w(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        this.f1782k0 = aVar.f1783s;
        super.w(aVar.getSuperState());
    }

    @Override // androidx.preference.Preference
    public final Parcelable x() {
        this.f1764b0 = true;
        return new a(AbsSavedState.EMPTY_STATE, this.f1782k0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10);
        this.f1777f0 = new g<>();
        new Handler(Looper.getMainLooper());
        this.f1779h0 = true;
        this.f1780i0 = 0;
        this.f1781j0 = false;
        this.f1782k0 = Integer.MAX_VALUE;
        this.f1778g0 = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.A, i10, 0);
        this.f1779h0 = l.b(obtainStyledAttributes, 2, 2, true);
        if (obtainStyledAttributes.hasValue(1)) {
            J(obtainStyledAttributes.getInt(1, obtainStyledAttributes.getInt(1, Integer.MAX_VALUE)));
        }
        obtainStyledAttributes.recycle();
    }
}
