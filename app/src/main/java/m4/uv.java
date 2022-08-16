package m4;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class uv extends aa implements wv {
    public uv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // m4.wv
    public final void M1(ew ewVar) {
        Parcel w10 = w();
        ca.d(w10, ewVar);
        e0(1, w10);
    }
}
