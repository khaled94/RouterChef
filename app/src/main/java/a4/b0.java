package a4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.b;

/* loaded from: classes.dex */
public final class b0 implements Parcelable.Creator<a0> {
    @Override // android.os.Parcelable.Creator
    public final a0 createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        boolean z10 = false;
        String str = null;
        int i10 = 0;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                z10 = b.k(parcel, readInt);
            } else if (c10 == 2) {
                str = b.e(parcel, readInt);
            } else if (c10 != 3) {
                b.q(parcel, readInt);
            } else {
                i10 = b.n(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new a0(z10, str, i10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a0[] newArray(int i10) {
        return new a0[i10];
    }
}
