package d4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.a;

/* loaded from: classes.dex */
public final class k extends a {
    public static final Parcelable.Creator<k> CREATOR = new b0();
    public final int A;

    /* renamed from: s */
    public final int f3881s;

    /* renamed from: t */
    public final int f3882t;

    /* renamed from: u */
    public final int f3883u;

    /* renamed from: v */
    public final long f3884v;

    /* renamed from: w */
    public final long f3885w;

    /* renamed from: x */
    public final String f3886x;
    public final String y;

    /* renamed from: z */
    public final int f3887z;

    public k(int i10, int i11, int i12, long j3, long j10, String str, String str2, int i13, int i14) {
        this.f3881s = i10;
        this.f3882t = i11;
        this.f3883u = i12;
        this.f3884v = j3;
        this.f3885w = j10;
        this.f3886x = str;
        this.y = str2;
        this.f3887z = i13;
        this.A = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.g(parcel, 1, this.f3881s);
        m2.a.g(parcel, 2, this.f3882t);
        m2.a.g(parcel, 3, this.f3883u);
        m2.a.j(parcel, 4, this.f3884v);
        m2.a.j(parcel, 5, this.f3885w);
        m2.a.l(parcel, 6, this.f3886x);
        m2.a.l(parcel, 7, this.y);
        m2.a.g(parcel, 8, this.f3887z);
        m2.a.g(parcel, 9, this.A);
        m2.a.u(parcel, q10);
    }
}
