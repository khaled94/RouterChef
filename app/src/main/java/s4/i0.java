package s4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class i0 extends f0 implements k0 {
    public i0(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // s4.k0
    public final Bundle l0(Bundle bundle) {
        Parcel w10 = w();
        h0.b(w10, bundle);
        Parcel c02 = c0(1, w10);
        Bundle bundle2 = (Bundle) h0.a(c02, Bundle.CREATOR);
        c02.recycle();
        return bundle2;
    }
}
