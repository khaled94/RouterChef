package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.b;

/* loaded from: classes.dex */
public final class bz implements Parcelable.Creator<az> {
    @Override // android.os.Parcelable.Creator
    public final az createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        int i10 = 0;
        int i11 = 0;
        String str = null;
        int i12 = 0;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i12 = b.n(parcel, readInt);
            } else if (c10 == 2) {
                str = b.e(parcel, readInt);
            } else if (c10 == 3) {
                i11 = b.n(parcel, readInt);
            } else if (c10 != 1000) {
                b.q(parcel, readInt);
            } else {
                i10 = b.n(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new az(i10, i12, str, i11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ az[] newArray(int i10) {
        return new az[i10];
    }
}
