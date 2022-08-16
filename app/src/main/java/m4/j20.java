package m4;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class j20 extends aa implements l20 {
    public j20(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    @Override // m4.l20
    public final void t(cn cnVar) {
        Parcel w10 = w();
        ca.b(w10, cnVar);
        e0(4, w10);
    }
}
