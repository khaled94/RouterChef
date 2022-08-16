package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.a;

/* loaded from: classes.dex */
public final class qq extends a {
    public static final Parcelable.Creator<qq> CREATOR = new rq();

    /* renamed from: s */
    public final int f12972s;

    public qq(int i10) {
        this.f12972s = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.g(parcel, 2, this.f12972s);
        m2.a.u(parcel, q10);
    }
}
