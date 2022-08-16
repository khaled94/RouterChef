package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.b;

/* loaded from: classes.dex */
public final class ws1 implements Parcelable.Creator<vs1> {
    @Override // android.os.Parcelable.Creator
    public final vs1 createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        int i10 = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = b.n(parcel, readInt);
            } else if (c10 != 2) {
                b.q(parcel, readInt);
            } else {
                bArr = b.b(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new vs1(i10, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ vs1[] newArray(int i10) {
        return new vs1[i10];
    }
}
