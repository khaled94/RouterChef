package d4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import e4.b;

/* loaded from: classes.dex */
public final class f0 implements Parcelable.Creator<e0> {
    @Override // android.os.Parcelable.Creator
    public final e0 createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        IBinder iBinder = null;
        a4.b bVar = null;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = b.n(parcel, readInt);
            } else if (c10 == 2) {
                iBinder = b.m(parcel, readInt);
            } else if (c10 == 3) {
                bVar = (a4.b) b.d(parcel, readInt, a4.b.CREATOR);
            } else if (c10 == 4) {
                z10 = b.k(parcel, readInt);
            } else if (c10 != 5) {
                b.q(parcel, readInt);
            } else {
                z11 = b.k(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new e0(i10, iBinder, bVar, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ e0[] newArray(int i10) {
        return new e0[i10];
    }
}
