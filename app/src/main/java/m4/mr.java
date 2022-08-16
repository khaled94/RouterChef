package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.b;

/* loaded from: classes.dex */
public final class mr implements Parcelable.Creator<lr> {
    @Override // android.os.Parcelable.Creator
    public final lr createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        String str = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 15) {
                b.q(parcel, readInt);
            } else {
                str = b.e(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new lr(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ lr[] newArray(int i10) {
        return new lr[i10];
    }
}
