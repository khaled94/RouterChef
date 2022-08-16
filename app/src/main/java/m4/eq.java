package m4;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class eq extends aa implements gq {
    public eq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // m4.gq
    public final void I2(qn qnVar) {
        Parcel w10 = w();
        ca.b(w10, qnVar);
        e0(1, w10);
    }
}
