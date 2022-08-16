package m4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class e10 extends ba implements f10 {
    public e10() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static f10 N3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof f10 ? (f10) queryLocalInterface : new d10(iBinder);
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        IInterface iInterface;
        boolean z10;
        if (i10 != 1) {
            if (i10 == 2) {
                z10 = ((c10) this).O(parcel.readString());
                parcel2.writeNoException();
            } else if (i10 == 3) {
                iInterface = ((c10) this).X(parcel.readString());
            } else if (i10 != 4) {
                return false;
            } else {
                z10 = ((c10) this).P(parcel.readString());
                parcel2.writeNoException();
            }
            ClassLoader classLoader = ca.f6747a;
            int i11 = z10 ? 1 : 0;
            int i12 = z10 ? 1 : 0;
            parcel2.writeInt(i11);
            return true;
        }
        iInterface = ((c10) this).z(parcel.readString());
        parcel2.writeNoException();
        ca.d(parcel2, iInterface);
        return true;
    }
}
