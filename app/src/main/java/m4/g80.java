package m4;

import android.os.IBinder;
import android.os.Parcel;
import k4.a;

/* loaded from: classes.dex */
public final class g80 extends aa implements i80 {
    public g80(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // m4.i80
    public final void o2(a aVar, m80 m80Var, f80 f80Var) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        ca.b(w10, m80Var);
        ca.d(w10, f80Var);
        e0(1, w10);
    }
}
