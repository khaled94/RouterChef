package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.b;

/* loaded from: classes.dex */
public final class bn implements Parcelable.Creator<an> {
    @Override // android.os.Parcelable.Creator
    public final an createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                str = b.e(parcel, readInt);
            } else if (c10 != 2) {
                b.q(parcel, readInt);
            } else {
                str2 = b.e(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new an(str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ an[] newArray(int i10) {
        return new an[i10];
    }
}
