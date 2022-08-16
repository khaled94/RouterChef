package a5;

import android.os.Parcel;
import android.os.Parcelable;
import d4.c0;
import e4.b;

/* loaded from: classes.dex */
public final class k implements Parcelable.Creator<j> {
    @Override // android.os.Parcelable.Creator
    public final j createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        int i10 = 0;
        c0 c0Var = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = b.n(parcel, readInt);
            } else if (c10 != 2) {
                b.q(parcel, readInt);
            } else {
                c0Var = (c0) b.d(parcel, readInt, c0.CREATOR);
            }
        }
        b.j(parcel, r10);
        return new j(i10, c0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ j[] newArray(int i10) {
        return new j[i10];
    }
}
