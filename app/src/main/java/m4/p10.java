package m4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import d4.f1;
import k4.a;

/* loaded from: classes.dex */
public final class p10 extends aa {
    public p10(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    public final lq E1() {
        Parcel c02 = c0(17, w());
        lq N3 = kq.N3(c02.readStrongBinder());
        c02.recycle();
        return N3;
    }

    public final a J3() {
        return f1.b(c0(20, w()));
    }

    public final pu Z1() {
        Parcel c02 = c0(19, w());
        pu N3 = ou.N3(c02.readStrongBinder());
        c02.recycle();
        return N3;
    }

    public final Bundle d() {
        Parcel c02 = c0(15, w());
        Bundle bundle = (Bundle) ca.a(c02, Bundle.CREATOR);
        c02.recycle();
        return bundle;
    }

    public final a l() {
        return f1.b(c0(21, w()));
    }

    public final vu v2() {
        Parcel c02 = c0(5, w());
        vu N3 = ju.N3(c02.readStrongBinder());
        c02.recycle();
        return N3;
    }

    public final a x3() {
        return f1.b(c0(18, w()));
    }
}
