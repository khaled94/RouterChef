package m4;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class m20 extends aa implements o20 {
    public m20(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // m4.o20
    public final void t(cn cnVar) {
        Parcel w10 = w();
        ca.b(w10, cnVar);
        e0(3, w10);
    }
}
