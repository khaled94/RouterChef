package m4;

import android.os.Parcel;
import android.os.Parcelable;
import e4.b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e50 implements Parcelable.Creator<d50> {
    @Override // android.os.Parcelable.Creator
    public final d50 createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        boolean z10 = false;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 2) {
                z10 = b.k(parcel, readInt);
            } else if (c10 != 3) {
                b.q(parcel, readInt);
            } else {
                arrayList = b.g(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new d50(z10, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d50[] newArray(int i10) {
        return new d50[i10];
    }
}
