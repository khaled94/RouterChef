package m4;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import e4.b;

/* loaded from: classes.dex */
public final class n50 implements Parcelable.Creator<m50> {
    @Override // android.os.Parcelable.Creator
    public final m50 createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                b.q(parcel, readInt);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) b.d(parcel, readInt, ParcelFileDescriptor.CREATOR);
            }
        }
        b.j(parcel, r10);
        return new m50(parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ m50[] newArray(int i10) {
        return new m50[i10];
    }
}
