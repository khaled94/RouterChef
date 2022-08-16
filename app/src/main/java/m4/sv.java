package m4;

import android.os.IBinder;
import android.os.Parcel;
import k4.a;

/* loaded from: classes.dex */
public final class sv extends aa implements tv {
    public sv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // m4.tv
    public final void r1(dp dpVar, a aVar) {
        Parcel w10 = w();
        ca.d(w10, dpVar);
        ca.d(w10, aVar);
        e0(1, w10);
    }
}
