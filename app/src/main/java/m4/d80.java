package m4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class d80 extends aa implements f80 {
    public d80(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // m4.f80
    public final void K1(String str, String str2, Bundle bundle) {
        Parcel w10 = w();
        w10.writeString(str);
        w10.writeString(str2);
        ca.b(w10, bundle);
        e0(3, w10);
    }

    @Override // m4.f80
    public final void z(String str) {
        Parcel w10 = w();
        w10.writeString(str);
        e0(2, w10);
    }
}
