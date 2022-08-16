package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.b;

/* loaded from: classes.dex */
public final class l60 implements Parcelable.Creator<k60> {
    @Override // android.os.Parcelable.Creator
    public final k60 createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        String str = null;
        int i10 = 0;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 2) {
                str = b.e(parcel, readInt);
            } else if (c10 != 3) {
                b.q(parcel, readInt);
            } else {
                i10 = b.n(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new k60(str, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ k60[] newArray(int i10) {
        return new k60[i10];
    }
}
