package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.b;

/* loaded from: classes.dex */
public final class p90 implements Parcelable.Creator<o90> {
    @Override // android.os.Parcelable.Creator
    public final o90 createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 2) {
                str = b.e(parcel, readInt);
            } else if (c10 == 3) {
                i10 = b.n(parcel, readInt);
            } else if (c10 == 4) {
                i11 = b.n(parcel, readInt);
            } else if (c10 == 5) {
                z10 = b.k(parcel, readInt);
            } else if (c10 != 6) {
                b.q(parcel, readInt);
            } else {
                z11 = b.k(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new o90(str, i10, i11, z10, z11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ o90[] newArray(int i10) {
        return new o90[i10];
    }
}
