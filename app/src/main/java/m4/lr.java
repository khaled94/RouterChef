package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.a;

/* loaded from: classes.dex */
public final class lr extends a {
    public static final Parcelable.Creator<lr> CREATOR = new mr();

    /* renamed from: s */
    public final String f10969s;

    public lr(String str) {
        this.f10969s = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.l(parcel, 15, this.f10969s);
        m2.a.u(parcel, q10);
    }
}
