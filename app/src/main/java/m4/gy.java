package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.a;

/* loaded from: classes.dex */
public final class gy extends a {
    public static final Parcelable.Creator<gy> CREATOR = new hy();

    /* renamed from: s */
    public final String f9063s;

    /* renamed from: t */
    public final String[] f9064t;

    /* renamed from: u */
    public final String[] f9065u;

    public gy(String str, String[] strArr, String[] strArr2) {
        this.f9063s = str;
        this.f9064t = strArr;
        this.f9065u = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.l(parcel, 1, this.f9063s);
        m2.a.m(parcel, 2, this.f9064t);
        m2.a.m(parcel, 3, this.f9065u);
        m2.a.u(parcel, q10);
    }
}
