package d4;

import a4.d;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import e4.b;

/* loaded from: classes.dex */
public final class v0 implements Parcelable.Creator<u0> {
    @Override // android.os.Parcelable.Creator
    public final u0 createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        Bundle bundle = null;
        d dVar = null;
        int i10 = 0;
        d[] dVarArr = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                bundle = b.a(parcel, readInt);
            } else if (c10 == 2) {
                dVarArr = (d[]) b.h(parcel, readInt, d.CREATOR);
            } else if (c10 == 3) {
                i10 = b.n(parcel, readInt);
            } else if (c10 != 4) {
                b.q(parcel, readInt);
            } else {
                dVar = (d) b.d(parcel, readInt, d.CREATOR);
            }
        }
        b.j(parcel, r10);
        return new u0(bundle, dVarArr, i10, dVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ u0[] newArray(int i10) {
        return new u0[i10];
    }
}
