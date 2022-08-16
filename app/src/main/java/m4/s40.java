package m4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import e4.b;

/* loaded from: classes.dex */
public final class s40 implements Parcelable.Creator<r40> {
    @Override // android.os.Parcelable.Creator
    public final r40 createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                iBinder = b.m(parcel, readInt);
            } else if (c10 != 2) {
                b.q(parcel, readInt);
            } else {
                iBinder2 = b.m(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new r40(iBinder, iBinder2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ r40[] newArray(int i10) {
        return new r40[i10];
    }
}
