package m4;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class e80 extends ba implements f80 {
    public e80() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            parcel.readString();
            parcel.readString();
        } else if (i10 == 2) {
            ((p40) this).z(parcel.readString());
        } else if (i10 != 3) {
            return false;
        } else {
            ((p40) this).K1(parcel.readString(), parcel.readString(), (Bundle) ca.a(parcel, Bundle.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
