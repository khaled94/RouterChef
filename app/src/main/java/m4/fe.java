package m4;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class fe implements Parcelable.Creator<ge> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ge createFromParcel(Parcel parcel) {
        return new ge(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ge[] newArray(int i10) {
        return new ge[i10];
    }
}
