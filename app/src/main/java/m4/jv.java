package m4;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class jv extends aa implements kv {
    public jv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // m4.kv
    public final void t1(cv cvVar) {
        Parcel w10 = w();
        ca.d(w10, cvVar);
        e0(1, w10);
    }
}
