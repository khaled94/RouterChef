package m4;

import android.os.Parcel;
import l3.s;

/* loaded from: classes.dex */
public final class y40 extends ba {
    public y40() {
        super("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            s.B.f5793g.g(new x40(), "FlagsAccessedBeforeInitialized");
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
