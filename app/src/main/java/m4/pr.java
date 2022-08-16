package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.b;

/* loaded from: classes.dex */
public final class pr implements Parcelable.Creator<or> {
    @Override // android.os.Parcelable.Creator
    public final or createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 2) {
                z10 = b.k(parcel, readInt);
            } else if (c10 == 3) {
                z11 = b.k(parcel, readInt);
            } else if (c10 != 4) {
                b.q(parcel, readInt);
            } else {
                z12 = b.k(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new or(z10, z11, z12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ or[] newArray(int i10) {
        return new or[i10];
    }
}
