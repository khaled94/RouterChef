package m4;

import android.os.IBinder;
import android.os.Parcel;
import k4.a;

/* loaded from: classes.dex */
public final class f40 extends aa implements h40 {
    public f40(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
    }

    @Override // m4.h40
    public final IBinder n0(a aVar) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        Parcel c02 = c0(1, w10);
        IBinder readStrongBinder = c02.readStrongBinder();
        c02.recycle();
        return readStrongBinder;
    }
}
