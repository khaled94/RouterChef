package m4;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class wy extends ba implements xy {
    public wy() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            N1(parcel.createTypedArrayList(ry.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
