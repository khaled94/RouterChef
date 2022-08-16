package s4;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class x0 extends g0 implements y0 {
    public x0() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // s4.g0
    public final boolean w(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            ((a2) this).C0(parcel.readString(), parcel.readString(), (Bundle) h0.a(parcel, Bundle.CREATOR), parcel.readLong());
            parcel2.writeNoException();
        } else if (i10 != 2) {
            return false;
        } else {
            int g10 = ((a2) this).g();
            parcel2.writeNoException();
            parcel2.writeInt(g10);
        }
        return true;
    }
}
