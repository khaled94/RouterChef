package m4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class fq extends ba implements gq {
    public fq() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static gq N3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return queryLocalInterface instanceof gq ? (gq) queryLocalInterface : new eq(iBinder);
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            ((ir) this).I2((qn) ca.a(parcel, qn.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
