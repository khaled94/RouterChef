package h3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import e4.b;

/* loaded from: classes.dex */
public final class k implements Parcelable.Creator<f> {
    @Override // android.os.Parcelable.Creator
    public final f createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        IBinder iBinder = null;
        boolean z10 = false;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                z10 = b.k(parcel, readInt);
            } else if (c10 == 2) {
                iBinder = b.m(parcel, readInt);
            } else if (c10 != 3) {
                b.q(parcel, readInt);
            } else {
                iBinder2 = b.m(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new f(z10, iBinder, iBinder2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f[] newArray(int i10) {
        return new f[i10];
    }
}
