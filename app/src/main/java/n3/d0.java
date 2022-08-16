package n3;

import android.os.Parcel;
import android.os.Parcelable;
import e4.a;

/* loaded from: classes.dex */
public final class d0 extends a {
    public static final Parcelable.Creator<d0> CREATOR = new e0();

    /* renamed from: s */
    public final String f16452s;

    /* renamed from: t */
    public final int f16453t;

    public d0(String str, int i10) {
        this.f16452s = str == null ? "" : str;
        this.f16453t = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.l(parcel, 1, this.f16452s);
        m2.a.g(parcel, 2, this.f16453t);
        m2.a.u(parcel, q10);
    }
}
