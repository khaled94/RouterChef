package m4;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class j implements Parcelable.Creator<k> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ k createFromParcel(Parcel parcel) {
        return new k(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ k[] newArray(int i10) {
        return new k[i10];
    }
}
