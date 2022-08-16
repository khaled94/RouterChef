package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.a;

/* loaded from: classes.dex */
public final class iy extends a {
    public static final Parcelable.Creator<iy> CREATOR = new jy();

    /* renamed from: s */
    public final boolean f9765s;

    /* renamed from: t */
    public final String f9766t;

    /* renamed from: u */
    public final int f9767u;

    /* renamed from: v */
    public final byte[] f9768v;

    /* renamed from: w */
    public final String[] f9769w;

    /* renamed from: x */
    public final String[] f9770x;
    public final boolean y;

    /* renamed from: z */
    public final long f9771z;

    public iy(boolean z10, String str, int i10, byte[] bArr, String[] strArr, String[] strArr2, boolean z11, long j3) {
        this.f9765s = z10;
        this.f9766t = str;
        this.f9767u = i10;
        this.f9768v = bArr;
        this.f9769w = strArr;
        this.f9770x = strArr2;
        this.y = z11;
        this.f9771z = j3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.a(parcel, 1, this.f9765s);
        m2.a.l(parcel, 2, this.f9766t);
        m2.a.g(parcel, 3, this.f9767u);
        m2.a.d(parcel, 4, this.f9768v);
        m2.a.m(parcel, 5, this.f9769w);
        m2.a.m(parcel, 6, this.f9770x);
        m2.a.a(parcel, 7, this.y);
        m2.a.j(parcel, 8, this.f9771z);
        m2.a.u(parcel, q10);
    }
}
