package m4;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class t60 extends aa implements v60 {
    public t60(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // m4.v60
    public final void E(int i10) {
        Parcel w10 = w();
        w10.writeInt(i10);
        e0(2, w10);
    }

    @Override // m4.v60
    public final void e() {
        e0(1, w());
    }

    @Override // m4.v60
    public final void t(cn cnVar) {
        Parcel w10 = w();
        ca.b(w10, cnVar);
        e0(3, w10);
    }
}
