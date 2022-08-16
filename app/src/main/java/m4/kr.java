package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.b;

/* loaded from: classes.dex */
public final class kr implements Parcelable.Creator<jr> {
    @Override // android.os.Parcelable.Creator
    public final jr createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        int i10 = 0;
        int i11 = 0;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = b.n(parcel, readInt);
            } else if (c10 != 2) {
                b.q(parcel, readInt);
            } else {
                i11 = b.n(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new jr(i10, i11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ jr[] newArray(int i10) {
        return new jr[i10];
    }
}
