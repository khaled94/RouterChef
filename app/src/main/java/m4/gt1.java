package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.a;

/* loaded from: classes.dex */
public final class gt1 extends a {
    public static final Parcelable.Creator<gt1> CREATOR = new ht1();

    /* renamed from: s */
    public final int f9034s;

    /* renamed from: t */
    public final int f9035t;

    /* renamed from: u */
    public final String f9036u;

    /* renamed from: v */
    public final String f9037v;

    /* renamed from: w */
    public final int f9038w;

    public gt1(int i10, int i11, int i12, String str, String str2) {
        this.f9034s = i10;
        this.f9035t = i11;
        this.f9036u = str;
        this.f9037v = str2;
        this.f9038w = i12;
    }

    public gt1(int i10, String str, String str2) {
        this.f9034s = 1;
        this.f9035t = 1;
        this.f9036u = str;
        this.f9037v = str2;
        this.f9038w = i10 - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.g(parcel, 1, this.f9034s);
        m2.a.g(parcel, 2, this.f9035t);
        m2.a.l(parcel, 3, this.f9036u);
        m2.a.l(parcel, 4, this.f9037v);
        m2.a.g(parcel, 5, this.f9038w);
        m2.a.u(parcel, q10);
    }
}
