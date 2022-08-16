package m4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import k4.a;

/* loaded from: classes.dex */
public abstract class i60 extends ba implements j60 {
    public i60() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public static j60 N3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
        return queryLocalInterface instanceof j60 ? (j60) queryLocalInterface : new h60(iBinder);
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        switch (i10) {
            case 1:
                N(a.AbstractBinderC0085a.c0(parcel.readStrongBinder()));
                break;
            case 2:
                a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                parcel.readInt();
                J0();
                break;
            case 3:
                W(a.AbstractBinderC0085a.c0(parcel.readStrongBinder()));
                break;
            case 4:
                m0(a.AbstractBinderC0085a.c0(parcel.readStrongBinder()));
                break;
            case 5:
                r2(a.AbstractBinderC0085a.c0(parcel.readStrongBinder()));
                break;
            case 6:
                R2(a.AbstractBinderC0085a.c0(parcel.readStrongBinder()));
                break;
            case 7:
                S0(a.AbstractBinderC0085a.c0(parcel.readStrongBinder()), (k60) ca.a(parcel, k60.CREATOR));
                break;
            case 8:
                zze(a.AbstractBinderC0085a.c0(parcel.readStrongBinder()));
                break;
            case 9:
                h2(a.AbstractBinderC0085a.c0(parcel.readStrongBinder()), parcel.readInt());
                break;
            case 10:
                b0(a.AbstractBinderC0085a.c0(parcel.readStrongBinder()));
                break;
            case 11:
                h3(a.AbstractBinderC0085a.c0(parcel.readStrongBinder()));
                break;
            case 12:
                Bundle bundle = (Bundle) ca.a(parcel, Bundle.CREATOR);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
