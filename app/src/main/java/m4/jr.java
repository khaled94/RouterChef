package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.a;

/* loaded from: classes.dex */
public final class jr extends a {
    public static final Parcelable.Creator<jr> CREATOR = new kr();

    /* renamed from: s */
    public final int f10174s;

    /* renamed from: t */
    public final int f10175t;

    public jr(int i10, int i11) {
        this.f10174s = i10;
        this.f10175t = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.g(parcel, 1, this.f10174s);
        m2.a.g(parcel, 2, this.f10175t);
        m2.a.u(parcel, q10);
    }
}
