package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.b;

/* loaded from: classes.dex */
public final class jt1 implements Parcelable.Creator<it1> {
    @Override // android.os.Parcelable.Creator
    public final it1 createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        int i10 = 0;
        byte[] bArr = null;
        int i11 = 0;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = b.n(parcel, readInt);
            } else if (c10 == 2) {
                bArr = b.b(parcel, readInt);
            } else if (c10 != 3) {
                b.q(parcel, readInt);
            } else {
                i11 = b.n(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new it1(i10, bArr, i11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ it1[] newArray(int i10) {
        return new it1[i10];
    }
}
