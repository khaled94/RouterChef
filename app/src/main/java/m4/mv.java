package m4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class mv extends ba implements nv {
    public mv() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        fv fvVar;
        if (i10 == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                fvVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                fvVar = queryLocalInterface instanceof fv ? (fv) queryLocalInterface : new dv(readStrongBinder);
            }
            ((gw) this).I3(fvVar, parcel.readString());
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
