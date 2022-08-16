package m4;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class mj extends aa {
    public mj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final hj E1(kj kjVar) {
        Parcel w10 = w();
        ca.b(w10, kjVar);
        Parcel c02 = c0(1, w10);
        hj hjVar = (hj) ca.a(c02, hj.CREATOR);
        c02.recycle();
        return hjVar;
    }

    public final hj Z1(kj kjVar) {
        Parcel w10 = w();
        ca.b(w10, kjVar);
        Parcel c02 = c0(2, w10);
        hj hjVar = (hj) ca.a(c02, hj.CREATOR);
        c02.recycle();
        return hjVar;
    }
}
