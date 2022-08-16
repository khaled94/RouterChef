package m4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import k4.a;

/* loaded from: classes.dex */
public abstract class vi extends ba implements wi {
    public vi() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        IInterface iInterface;
        zi ziVar = null;
        bj bjVar = null;
        boolean z10 = false;
        switch (i10) {
            case 2:
                iInterface = b();
                parcel2.writeNoException();
                ca.d(parcel2, iInterface);
                return true;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    ziVar = queryLocalInterface instanceof zi ? (zi) queryLocalInterface : new zi(readStrongBinder);
                }
                k2(ziVar);
                parcel2.writeNoException();
                return true;
            case 4:
                a c02 = a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    bjVar = queryLocalInterface2 instanceof bj ? (bj) queryLocalInterface2 : new aj(readStrongBinder2);
                }
                s2(c02, bjVar);
                parcel2.writeNoException();
                return true;
            case 5:
                iInterface = d();
                parcel2.writeNoException();
                ca.d(parcel2, iInterface);
                return true;
            case 6:
                ClassLoader classLoader = ca.f6747a;
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                k3(z10);
                parcel2.writeNoException();
                return true;
            case 7:
                D0(fq.N3(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
