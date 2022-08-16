package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.a;

/* loaded from: classes.dex */
public final class an extends a {
    public static final Parcelable.Creator<an> CREATOR = new bn();

    /* renamed from: s */
    public final String f6208s;

    /* renamed from: t */
    public final String f6209t;

    public an(String str, String str2) {
        this.f6208s = str;
        this.f6209t = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.l(parcel, 1, this.f6208s);
        m2.a.l(parcel, 2, this.f6209t);
        m2.a.u(parcel, q10);
    }
}
