package m4;

import android.os.IBinder;
import android.os.Parcel;
import k4.a;

/* loaded from: classes.dex */
public final class ff0 extends aa implements hf0 {
    public ff0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.IMeasurementManager");
    }

    @Override // m4.hf0
    public final void d3(a aVar, ef0 ef0Var) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        ca.d(w10, ef0Var);
        e0(2, w10);
    }
}
