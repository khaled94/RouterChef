package m4;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class hv extends aa implements iv {
    public hv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // m4.iv
    public final void e1(av avVar) {
        Parcel w10 = w();
        ca.d(w10, avVar);
        e0(1, w10);
    }
}
