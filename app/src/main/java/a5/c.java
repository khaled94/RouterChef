package a5;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import e4.b;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator<b> {
    @Override // android.os.Parcelable.Creator
    public final b createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        int i10 = 0;
        Intent intent = null;
        int i11 = 0;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = b.n(parcel, readInt);
            } else if (c10 == 2) {
                i11 = b.n(parcel, readInt);
            } else if (c10 != 3) {
                b.q(parcel, readInt);
            } else {
                intent = (Intent) b.d(parcel, readInt, Intent.CREATOR);
            }
        }
        b.j(parcel, r10);
        return new b(i10, i11, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b[] newArray(int i10) {
        return new b[i10];
    }
}
