package m4;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class gz extends aa implements hz {
    public gz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // m4.hz
    public final void E(int i10) {
        Parcel w10 = w();
        w10.writeInt(i10);
        e0(2, w10);
    }

    @Override // m4.hz
    public final void s0(dz dzVar) {
        Parcel w10 = w();
        ca.d(w10, dzVar);
        e0(1, w10);
    }

    @Override // m4.hz
    public final void t(cn cnVar) {
        Parcel w10 = w();
        ca.b(w10, cnVar);
        e0(3, w10);
    }
}
