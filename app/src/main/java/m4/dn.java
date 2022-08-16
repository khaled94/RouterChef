package m4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import e4.b;

/* loaded from: classes.dex */
public final class dn implements Parcelable.Creator<cn> {
    @Override // android.os.Parcelable.Creator
    public final cn createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        String str = null;
        String str2 = null;
        cn cnVar = null;
        IBinder iBinder = null;
        int i10 = 0;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = b.n(parcel, readInt);
            } else if (c10 == 2) {
                str = b.e(parcel, readInt);
            } else if (c10 == 3) {
                str2 = b.e(parcel, readInt);
            } else if (c10 == 4) {
                cnVar = (cn) b.d(parcel, readInt, cn.CREATOR);
            } else if (c10 != 5) {
                b.q(parcel, readInt);
            } else {
                iBinder = b.m(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new cn(i10, str, str2, cnVar, iBinder);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ cn[] newArray(int i10) {
        return new cn[i10];
    }
}
