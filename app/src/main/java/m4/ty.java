package m4;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class ty extends aa implements uy {
    public ty(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    @Override // m4.uy
    public final void P(String str) {
        Parcel w10 = w();
        w10.writeString(str);
        e0(3, w10);
    }
}
