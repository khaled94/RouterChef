package m4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import e4.b;

/* loaded from: classes.dex */
public final class zy implements Parcelable.Creator<yy> {
    @Override // android.os.Parcelable.Creator
    public final yy createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        String str = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                str = b.e(parcel, readInt);
            } else if (c10 != 2) {
                b.q(parcel, readInt);
            } else {
                bundle = b.a(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new yy(str, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ yy[] newArray(int i10) {
        return new yy[i10];
    }
}
