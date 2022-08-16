package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.a;

/* loaded from: classes.dex */
public final class ry extends a {
    public static final Parcelable.Creator<ry> CREATOR = new sy();

    /* renamed from: s */
    public final String f13451s;

    /* renamed from: t */
    public final boolean f13452t;

    /* renamed from: u */
    public final int f13453u;

    /* renamed from: v */
    public final String f13454v;

    public ry(String str, boolean z10, int i10, String str2) {
        this.f13451s = str;
        this.f13452t = z10;
        this.f13453u = i10;
        this.f13454v = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.l(parcel, 1, this.f13451s);
        m2.a.a(parcel, 2, this.f13452t);
        m2.a.g(parcel, 3, this.f13453u);
        m2.a.l(parcel, 4, this.f13454v);
        m2.a.u(parcel, q10);
    }
}
