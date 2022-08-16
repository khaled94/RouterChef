package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.a;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class it1 extends a {
    public static final Parcelable.Creator<it1> CREATOR = new jt1();

    /* renamed from: s */
    public final int f9748s;

    /* renamed from: t */
    public final byte[] f9749t;

    /* renamed from: u */
    public final int f9750u;

    public it1() {
        this.f9748s = 1;
        this.f9749t = null;
        this.f9750u = 1;
    }

    public it1(int i10, byte[] bArr, int i11) {
        this.f9748s = i10;
        this.f9749t = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.f9750u = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.g(parcel, 1, this.f9748s);
        m2.a.d(parcel, 2, this.f9749t);
        m2.a.g(parcel, 3, this.f9750u);
        m2.a.u(parcel, q10);
    }
}
