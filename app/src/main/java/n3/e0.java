package n3;

import android.os.Parcel;
import android.os.Parcelable;
import e4.b;

/* loaded from: classes.dex */
public final class e0 implements Parcelable.Creator<d0> {
    @Override // android.os.Parcelable.Creator
    public final d0 createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        String str = null;
        int i10 = 0;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                str = b.e(parcel, readInt);
            } else if (c10 != 2) {
                b.q(parcel, readInt);
            } else {
                i10 = b.n(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new d0(str, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d0[] newArray(int i10) {
        return new d0[i10];
    }
}
