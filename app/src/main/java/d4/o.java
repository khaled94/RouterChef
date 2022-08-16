package d4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.a;

/* loaded from: classes.dex */
public final class o extends a {
    public static final Parcelable.Creator<o> CREATOR = new n0();

    /* renamed from: s */
    public final int f3897s;

    /* renamed from: t */
    public final boolean f3898t;

    /* renamed from: u */
    public final boolean f3899u;

    /* renamed from: v */
    public final int f3900v;

    /* renamed from: w */
    public final int f3901w;

    public o(int i10, boolean z10, boolean z11, int i11, int i12) {
        this.f3897s = i10;
        this.f3898t = z10;
        this.f3899u = z11;
        this.f3900v = i11;
        this.f3901w = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.g(parcel, 1, this.f3897s);
        m2.a.a(parcel, 2, this.f3898t);
        m2.a.a(parcel, 3, this.f3899u);
        m2.a.g(parcel, 4, this.f3900v);
        m2.a.g(parcel, 5, this.f3901w);
        m2.a.u(parcel, q10);
    }
}
