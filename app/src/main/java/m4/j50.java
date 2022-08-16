package m4;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import n3.d0;

/* loaded from: classes.dex */
public final class j50 extends aa implements l50 {
    public j50(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // m4.l50
    public final void W0(d0 d0Var) {
        Parcel w10 = w();
        ca.b(w10, d0Var);
        e0(2, w10);
    }

    @Override // m4.l50
    public final void t0(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel w10 = w();
        ca.b(w10, parcelFileDescriptor);
        e0(1, w10);
    }
}
