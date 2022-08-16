package v3;

import android.os.Parcel;
import android.os.Parcelable;
import e4.a;

/* loaded from: classes.dex */
public final class b extends a {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: s */
    public final String f19785s;

    /* renamed from: t */
    public final String f19786t;

    public b(String str, String str2) {
        this.f19785s = str;
        this.f19786t = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.l(parcel, 1, this.f19785s);
        m2.a.l(parcel, 2, this.f19786t);
        m2.a.u(parcel, q10);
    }
}
