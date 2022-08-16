package m4;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class xi extends aa implements yi {
    public xi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // m4.yi
    public final void I(int i10) {
        Parcel w10 = w();
        w10.writeInt(i10);
        e0(2, w10);
    }

    @Override // m4.yi
    public final void u1(wi wiVar) {
        Parcel w10 = w();
        ca.d(w10, wiVar);
        e0(1, w10);
    }

    @Override // m4.yi
    public final void w2(cn cnVar) {
        Parcel w10 = w();
        ca.b(w10, cnVar);
        e0(3, w10);
    }
}
