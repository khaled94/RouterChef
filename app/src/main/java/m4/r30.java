package m4;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import k4.a;

/* loaded from: classes.dex */
public final class r30 extends aa implements t30 {
    public r30(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // m4.t30
    public final void d() {
        e0(3, w());
    }

    @Override // m4.t30
    public final void r0(Intent intent) {
        Parcel w10 = w();
        ca.b(w10, intent);
        e0(1, w10);
    }

    @Override // m4.t30
    public final void u0(a aVar, String str, String str2) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        w10.writeString(str);
        w10.writeString(str2);
        e0(2, w10);
    }
}
