package m4;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class cy extends aa implements dy {
    public cy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    @Override // m4.dy
    public final void z(String str) {
        Parcel w10 = w();
        w10.writeString(str);
        e0(1, w10);
    }
}
