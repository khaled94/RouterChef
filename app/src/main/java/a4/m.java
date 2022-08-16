package a4;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import e4.b;

/* loaded from: classes.dex */
public final class m implements Parcelable.Creator<b> {
    @Override // android.os.Parcelable.Creator
    public final b createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        PendingIntent pendingIntent = null;
        int i10 = 0;
        int i11 = 0;
        String str = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = b.n(parcel, readInt);
            } else if (c10 == 2) {
                i11 = b.n(parcel, readInt);
            } else if (c10 == 3) {
                pendingIntent = (PendingIntent) b.d(parcel, readInt, PendingIntent.CREATOR);
            } else if (c10 != 4) {
                b.q(parcel, readInt);
            } else {
                str = b.e(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new b(i10, i11, pendingIntent, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b[] newArray(int i10) {
        return new b[i10];
    }
}
