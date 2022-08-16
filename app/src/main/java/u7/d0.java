package u7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import e4.b;

/* loaded from: classes.dex */
public final class d0 implements Parcelable.Creator<c0> {
    @Override // android.os.Parcelable.Creator
    public final c0 createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                b.q(parcel, readInt);
            } else {
                bundle = b.a(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new c0(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final c0[] newArray(int i10) {
        return new c0[i10];
    }
}
