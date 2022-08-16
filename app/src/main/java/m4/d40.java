package m4;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import k4.a;

/* loaded from: classes.dex */
public abstract class d40 extends ba implements e40 {
    public d40() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public static e40 N3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
        return queryLocalInterface instanceof e40 ? (e40) queryLocalInterface : new c40(iBinder);
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 1:
                C1((Bundle) ca.a(parcel, Bundle.CREATOR));
                break;
            case 2:
                break;
            case 3:
                x();
                break;
            case 4:
                m();
                break;
            case 5:
                j();
                break;
            case 6:
                Bundle bundle = (Bundle) ca.a(parcel, Bundle.CREATOR);
                Z2(bundle);
                parcel2.writeNoException();
                ca.c(parcel2, bundle);
                return true;
            case 7:
                p();
                break;
            case 8:
                l();
                break;
            case 9:
                q();
                break;
            case 10:
                f();
                break;
            case 11:
                boolean B = B();
                parcel2.writeNoException();
                ClassLoader classLoader = ca.f6747a;
                parcel2.writeInt(B ? 1 : 0);
                return true;
            case 12:
                parcel.readInt();
                parcel.readInt();
                Intent intent = (Intent) ca.a(parcel, Intent.CREATOR);
                break;
            case 13:
                m0(a.AbstractBinderC0085a.c0(parcel.readStrongBinder()));
                break;
            case 14:
                r();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
