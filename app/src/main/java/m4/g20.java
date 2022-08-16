package m4;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class g20 extends aa implements i20 {
    public g20(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // m4.i20
    public final void t(cn cnVar) {
        Parcel w10 = w();
        ca.b(w10, cnVar);
        e0(3, w10);
    }
}
