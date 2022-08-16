package d4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class s implements Parcelable.Creator<q> {
    @Override // android.os.Parcelable.Creator
    public final q createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        int i10 = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = b.n(parcel, readInt);
            } else if (c10 != 2) {
                b.q(parcel, readInt);
            } else {
                arrayList = b.i(parcel, readInt, k.CREATOR);
            }
        }
        b.j(parcel, r10);
        return new q(i10, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ q[] newArray(int i10) {
        return new q[i10];
    }
}
