package m4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class n20 extends ba implements o20 {
    public n20() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        t10 t10Var;
        if (i10 == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                t10Var = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
                t10Var = queryLocalInterface instanceof t10 ? (t10) queryLocalInterface : new r10(readStrongBinder);
            }
            o91 o91Var = (o91) this;
            o91Var.f12057t.f12449c = t10Var;
            o91Var.f12056s.f9130c.k();
        } else if (i10 == 2) {
            ((o91) this).f12056s.f9130c.g1(0, parcel.readString());
        } else if (i10 != 3) {
            return false;
        } else {
            ((o91) this).f12056s.f9130c.w3((cn) ca.a(parcel, cn.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
