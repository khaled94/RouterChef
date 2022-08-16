package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.b;

/* loaded from: classes.dex */
public final class n80 implements Parcelable.Creator<m80> {
    @Override // android.os.Parcelable.Creator
    public final m80 createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        String str = null;
        String str2 = null;
        on onVar = null;
        jn jnVar = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                str = b.e(parcel, readInt);
            } else if (c10 == 2) {
                str2 = b.e(parcel, readInt);
            } else if (c10 == 3) {
                onVar = (on) b.d(parcel, readInt, on.CREATOR);
            } else if (c10 != 4) {
                b.q(parcel, readInt);
            } else {
                jnVar = (jn) b.d(parcel, readInt, jn.CREATOR);
            }
        }
        b.j(parcel, r10);
        return new m80(str, str2, onVar, jnVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ m80[] newArray(int i10) {
        return new m80[i10];
    }
}
