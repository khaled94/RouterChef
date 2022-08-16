package m4;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class dc implements Parcelable.Creator<ec> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ec createFromParcel(Parcel parcel) {
        return new ec(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ ec[] newArray(int i10) {
        return new ec[i10];
    }
}
