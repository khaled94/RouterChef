package m4;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class lv extends aa implements nv {
    public lv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // m4.nv
    public final void I3(fv fvVar, String str) {
        Parcel w10 = w();
        ca.d(w10, fvVar);
        w10.writeString(str);
        e0(1, w10);
    }
}
