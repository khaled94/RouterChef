package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.b;

/* loaded from: classes.dex */
public final class f30 implements Parcelable.Creator<e30> {
    @Override // android.os.Parcelable.Creator
    public final e30 createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = b.n(parcel, readInt);
            } else if (c10 == 2) {
                i11 = b.n(parcel, readInt);
            } else if (c10 != 3) {
                b.q(parcel, readInt);
            } else {
                i12 = b.n(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new e30(i10, i11, i12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ e30[] newArray(int i10) {
        return new e30[i10];
    }
}
