package m4;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class qo extends aa implements to {
    public qo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // m4.to
    public final void H1(cn cnVar) {
        Parcel w10 = w();
        ca.b(w10, cnVar);
        e0(2, w10);
    }

    @Override // m4.to
    public final void c() {
        e0(1, w());
    }
}
