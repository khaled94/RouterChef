package y4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import e4.b;

/* loaded from: classes.dex */
public final class o implements Parcelable.Creator<n> {
    @Override // android.os.Parcelable.Creator
    public final n createFromParcel(Parcel parcel) {
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
        return new n(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ n[] newArray(int i10) {
        return new n[i10];
    }
}
