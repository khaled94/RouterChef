package a5;

import android.os.Parcel;
import android.os.Parcelable;
import d4.e0;
import e4.b;

/* loaded from: classes.dex */
public final class m implements Parcelable.Creator<l> {
    @Override // android.os.Parcelable.Creator
    public final l createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        a4.b bVar = null;
        int i10 = 0;
        e0 e0Var = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = b.n(parcel, readInt);
            } else if (c10 == 2) {
                bVar = (a4.b) b.d(parcel, readInt, a4.b.CREATOR);
            } else if (c10 != 3) {
                b.q(parcel, readInt);
            } else {
                e0Var = (e0) b.d(parcel, readInt, e0.CREATOR);
            }
        }
        b.j(parcel, r10);
        return new l(i10, bVar, e0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ l[] newArray(int i10) {
        return new l[i10];
    }
}
