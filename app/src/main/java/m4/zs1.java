package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.b;

/* loaded from: classes.dex */
public final class zs1 implements Parcelable.Creator<ys1> {
    @Override // android.os.Parcelable.Creator
    public final ys1 createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        String str = null;
        int i10 = 0;
        String str2 = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = b.n(parcel, readInt);
            } else if (c10 == 2) {
                str = b.e(parcel, readInt);
            } else if (c10 != 3) {
                b.q(parcel, readInt);
            } else {
                str2 = b.e(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new ys1(i10, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ys1[] newArray(int i10) {
        return new ys1[i10];
    }
}
