package a4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import e4.b;

/* loaded from: classes.dex */
public final class z implements Parcelable.Creator<y> {
    @Override // android.os.Parcelable.Creator
    public final y createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        String str = null;
        IBinder iBinder = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                str = b.e(parcel, readInt);
            } else if (c10 == 2) {
                z10 = b.k(parcel, readInt);
            } else if (c10 == 3) {
                z11 = b.k(parcel, readInt);
            } else if (c10 == 4) {
                iBinder = b.m(parcel, readInt);
            } else if (c10 != 5) {
                b.q(parcel, readInt);
            } else {
                z12 = b.k(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new y(str, z10, z11, iBinder, z12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ y[] newArray(int i10) {
        return new y[i10];
    }
}
