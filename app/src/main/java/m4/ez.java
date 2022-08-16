package m4;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class ez extends aa implements fz {
    public ez(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // m4.fz
    public final void E(int i10) {
        Parcel w10 = w();
        w10.writeInt(i10);
        e0(2, w10);
    }

    @Override // m4.fz
    public final void d() {
        e0(1, w());
    }
}
