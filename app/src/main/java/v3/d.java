package v3;

import android.os.Parcel;
import android.os.Parcelable;
import e4.a;

/* loaded from: classes.dex */
public final class d extends a {
    public static final Parcelable.Creator<d> CREATOR = new e();

    /* renamed from: s */
    public final String f19787s;

    /* renamed from: t */
    public final int f19788t;

    public d(String str, int i10) {
        this.f19787s = str;
        this.f19788t = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.l(parcel, 1, this.f19787s);
        m2.a.g(parcel, 2, this.f19788t);
        m2.a.u(parcel, q10);
    }
}
