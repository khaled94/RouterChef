package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.b;

/* loaded from: classes.dex */
public final class rq implements Parcelable.Creator<qq> {
    @Override // android.os.Parcelable.Creator
    public final qq createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        int i10 = 0;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                b.q(parcel, readInt);
            } else {
                i10 = b.n(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new qq(i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ qq[] newArray(int i10) {
        return new qq[i10];
    }
}
