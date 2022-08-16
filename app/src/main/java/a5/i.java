package a5;

import android.os.Parcel;
import android.os.Parcelable;
import e4.b;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i implements Parcelable.Creator<h> {
    @Override // android.os.Parcelable.Creator
    public final h createFromParcel(Parcel parcel) {
        int r10 = b.r(parcel);
        ArrayList<String> arrayList = null;
        String str = null;
        while (parcel.dataPosition() < r10) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                arrayList = b.g(parcel, readInt);
            } else if (c10 != 2) {
                b.q(parcel, readInt);
            } else {
                str = b.e(parcel, readInt);
            }
        }
        b.j(parcel, r10);
        return new h(arrayList, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ h[] newArray(int i10) {
        return new h[i10];
    }
}
