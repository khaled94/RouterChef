package z3;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class f implements Parcelable.Creator<h> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ h createFromParcel(Parcel parcel) {
        return new h(parcel.readStrongBinder());
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ h[] newArray(int i10) {
        return new h[i10];
    }
}
