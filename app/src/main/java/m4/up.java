package m4;

import android.os.IBinder;
import android.os.Parcel;
import k4.a;

/* loaded from: classes.dex */
public final class up extends aa {
    public up(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
    }

    public final IBinder E1(a aVar) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        w10.writeInt(214106000);
        Parcel c02 = c0(1, w10);
        IBinder readStrongBinder = c02.readStrongBinder();
        c02.recycle();
        return readStrongBinder;
    }
}
