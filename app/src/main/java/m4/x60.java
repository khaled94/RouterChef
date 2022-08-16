package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.a;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class x60 extends a {
    public static final Parcelable.Creator<x60> CREATOR = new y60();

    /* renamed from: s */
    public final String f15225s;

    /* renamed from: t */
    public final String f15226t;

    public x60(String str, String str2) {
        this.f15225s = str;
        this.f15226t = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.l(parcel, 1, this.f15225s);
        m2.a.l(parcel, 2, this.f15226t);
        m2.a.u(parcel, q10);
    }
}
