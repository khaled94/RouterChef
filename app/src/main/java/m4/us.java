package m4;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class us extends aa implements vs {
    public us(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // m4.vs
    public final void B1(ts tsVar) {
        Parcel w10 = w();
        ca.d(w10, tsVar);
        e0(1, w10);
    }
}
