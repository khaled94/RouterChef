package m4;

import android.os.IBinder;
import android.os.Parcel;
import k4.a;

/* loaded from: classes.dex */
public final class xv extends aa implements zv {
    public xv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    @Override // m4.zv
    public final boolean C2(a aVar) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        Parcel c02 = c0(2, w10);
        boolean z10 = c02.readInt() != 0;
        c02.recycle();
        return z10;
    }
}
