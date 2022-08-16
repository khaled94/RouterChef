package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.a;

/* loaded from: classes.dex */
public final class ys1 extends a {
    public static final Parcelable.Creator<ys1> CREATOR = new zs1();

    /* renamed from: s */
    public final int f15899s;

    /* renamed from: t */
    public final String f15900t;

    /* renamed from: u */
    public final String f15901u;

    public ys1(int i10, String str, String str2) {
        this.f15899s = i10;
        this.f15900t = str;
        this.f15901u = str2;
    }

    public ys1(String str, String str2) {
        this.f15899s = 1;
        this.f15900t = str;
        this.f15901u = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.g(parcel, 1, this.f15899s);
        m2.a.l(parcel, 2, this.f15900t);
        m2.a.l(parcel, 3, this.f15901u);
        m2.a.u(parcel, q10);
    }
}
