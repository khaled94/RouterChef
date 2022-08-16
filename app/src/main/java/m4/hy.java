package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.b;

/* loaded from: classes.dex */
public final class hy implements Parcelable.Creator<gy> {
    @Override // android.os.Parcelable.Creator
    public final gy createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        String str = null;
        String[] strArr = null;
        String[] strArr2 = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                str = b.e(parcel, readInt);
            } else if (c10 == 2) {
                strArr = b.f(parcel, readInt);
            } else if (c10 != 3) {
                b.q(parcel, readInt);
            } else {
                strArr2 = b.f(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new gy(str, strArr, strArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ gy[] newArray(int i10) {
        return new gy[i10];
    }
}
