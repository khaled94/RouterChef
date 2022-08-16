package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.a;

/* loaded from: classes.dex */
public final class un extends a {
    public static final Parcelable.Creator<un> CREATOR = new vn();

    /* renamed from: s */
    public final int f14459s;

    public un(int i10) {
        this.f14459s = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.g(parcel, 2, this.f14459s);
        m2.a.u(parcel, q10);
    }
}
