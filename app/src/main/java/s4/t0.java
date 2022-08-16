package s4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class t0 extends f0 implements v0 {
    public t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // s4.v0
    public final void l0(Bundle bundle) {
        Parcel w10 = w();
        h0.b(w10, bundle);
        e0(1, w10);
    }
}
