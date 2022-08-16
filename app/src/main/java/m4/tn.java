package m4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import e4.b;

/* loaded from: classes.dex */
public final class tn implements Parcelable.Creator<sn> {
    @Override // android.os.Parcelable.Creator
    public final sn createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        String str = null;
        cn cnVar = null;
        Bundle bundle = null;
        long j3 = 0;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                str = b.e(parcel, readInt);
            } else if (c10 == 2) {
                j3 = b.o(parcel, readInt);
            } else if (c10 == 3) {
                cnVar = (cn) b.d(parcel, readInt, cn.CREATOR);
            } else if (c10 != 4) {
                b.q(parcel, readInt);
            } else {
                bundle = b.a(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new sn(str, j3, cnVar, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ sn[] newArray(int i10) {
        return new sn[i10];
    }
}
