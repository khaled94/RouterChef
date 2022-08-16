package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.b;

/* loaded from: classes.dex */
public final class g60 implements Parcelable.Creator<f60> {
    @Override // android.os.Parcelable.Creator
    public final f60 createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        jn jnVar = null;
        String str = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 2) {
                jnVar = (jn) b.d(parcel, readInt, jn.CREATOR);
            } else if (c10 != 3) {
                b.q(parcel, readInt);
            } else {
                str = b.e(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new f60(jnVar, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f60[] newArray(int i10) {
        return new f60[i10];
    }
}
