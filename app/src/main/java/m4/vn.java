package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.b;

/* loaded from: classes.dex */
public final class vn implements Parcelable.Creator<un> {
    @Override // android.os.Parcelable.Creator
    public final un createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        int i10 = 0;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                b.q(parcel, readInt);
            } else {
                i10 = b.n(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new un(i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ un[] newArray(int i10) {
        return new un[i10];
    }
}
