package m4;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class hp extends aa implements ip {
    public hp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    @Override // m4.ip
    public final void d2(String str, String str2) {
        Parcel w10 = w();
        w10.writeString(str);
        w10.writeString(str2);
        e0(1, w10);
    }
}
