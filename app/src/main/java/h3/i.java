package h3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import e4.b;

/* loaded from: classes.dex */
public final class i implements Parcelable.Creator<a> {
    @Override // android.os.Parcelable.Creator
    public final a createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        boolean z10 = false;
        IBinder iBinder = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                z10 = b.k(parcel, readInt);
            } else if (c10 != 2) {
                b.q(parcel, readInt);
            } else {
                iBinder = b.m(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new a(z10, iBinder);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a[] newArray(int i10) {
        return new a[i10];
    }
}
