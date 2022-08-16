package m4;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import e4.b;

/* loaded from: classes.dex */
public final class ij implements Parcelable.Creator<hj> {
    @Override // android.os.Parcelable.Creator
    public final hj createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        ParcelFileDescriptor parcelFileDescriptor = null;
        long j3 = 0;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) b.d(parcel, readInt, ParcelFileDescriptor.CREATOR);
            } else if (c10 == 3) {
                z10 = b.k(parcel, readInt);
            } else if (c10 == 4) {
                z11 = b.k(parcel, readInt);
            } else if (c10 == 5) {
                j3 = b.o(parcel, readInt);
            } else if (c10 != 6) {
                b.q(parcel, readInt);
            } else {
                z12 = b.k(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new hj(parcelFileDescriptor, z10, z11, j3, z12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ hj[] newArray(int i10) {
        return new hj[i10];
    }
}
