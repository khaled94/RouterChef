package b4;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import e4.b;

/* loaded from: classes.dex */
public final class l implements Parcelable.Creator<Status> {
    @Override // android.os.Parcelable.Creator
    public final Status createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        int i10 = 0;
        int i11 = 0;
        String str = null;
        PendingIntent pendingIntent = null;
        a4.b bVar = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i11 = b.n(parcel, readInt);
            } else if (c10 == 2) {
                str = b.e(parcel, readInt);
            } else if (c10 == 3) {
                pendingIntent = (PendingIntent) b.d(parcel, readInt, PendingIntent.CREATOR);
            } else if (c10 == 4) {
                bVar = (a4.b) b.d(parcel, readInt, a4.b.CREATOR);
            } else if (c10 != 1000) {
                b.q(parcel, readInt);
            } else {
                i10 = b.n(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new Status(i10, i11, str, pendingIntent, bVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status[] newArray(int i10) {
        return new Status[i10];
    }
}
