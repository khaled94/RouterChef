package s4;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class u0 extends g0 implements v0 {
    public u0() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // s4.g0
    public final boolean w(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            ((o0) this).l0((Bundle) h0.a(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
