package z3;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import e4.b;

/* loaded from: classes.dex */
public final class d implements Parcelable.Creator<a> {
    @Override // android.os.Parcelable.Creator
    public final a createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                b.q(parcel, readInt);
            } else {
                intent = (Intent) b.d(parcel, readInt, Intent.CREATOR);
            }
        }
        b.j(parcel, r10);
        return new a(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ a[] newArray(int i10) {
        return new a[i10];
    }
}
