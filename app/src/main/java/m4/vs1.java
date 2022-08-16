package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.a;

/* loaded from: classes.dex */
public final class vs1 extends a {
    public static final Parcelable.Creator<vs1> CREATOR = new ws1();

    /* renamed from: s */
    public final int f14775s;

    /* renamed from: t */
    public final byte[] f14776t;

    public vs1(int i10, byte[] bArr) {
        this.f14775s = i10;
        this.f14776t = bArr;
    }

    public vs1(byte[] bArr) {
        this.f14775s = 1;
        this.f14776t = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.g(parcel, 1, this.f14775s);
        m2.a.d(parcel, 2, this.f14776t);
        m2.a.u(parcel, q10);
    }
}
