package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.b;

/* loaded from: classes.dex */
public final class rn implements Parcelable.Creator<qn> {
    @Override // android.os.Parcelable.Creator
    public final qn createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        int i10 = 0;
        int i11 = 0;
        String str = null;
        long j3 = 0;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = b.n(parcel, readInt);
            } else if (c10 == 2) {
                i11 = b.n(parcel, readInt);
            } else if (c10 == 3) {
                str = b.e(parcel, readInt);
            } else if (c10 != 4) {
                b.q(parcel, readInt);
            } else {
                j3 = b.o(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new qn(i10, i11, str, j3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ qn[] newArray(int i10) {
        return new qn[i10];
    }
}
