package m4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class k10 extends ba implements l10 {
    public k10() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static l10 N3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return queryLocalInterface instanceof l10 ? (l10) queryLocalInterface : new j10(iBinder);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        n60 n60Var;
        switch (i10) {
            case 1:
                b();
                break;
            case 2:
                d();
                break;
            case 3:
                A(parcel.readInt());
                break;
            case 4:
                j();
                break;
            case 5:
                m();
                break;
            case 6:
                k();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (queryLocalInterface instanceof o10) {
                        o10 o10Var = (o10) queryLocalInterface;
                        break;
                    }
                }
                break;
            case 8:
                o();
                break;
            case 9:
                P1(parcel.readString(), parcel.readString());
                break;
            case 10:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                    if (queryLocalInterface2 instanceof fv) {
                        fv fvVar = (fv) queryLocalInterface2;
                    }
                }
                parcel.readString();
                break;
            case 11:
                q();
                break;
            case 12:
                parcel.readString();
                break;
            case 13:
                u();
                break;
            case 14:
                t3((k60) ca.a(parcel, k60.CREATOR));
                break;
            case 15:
                Q();
                break;
            case 16:
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 == null) {
                    n60Var = null;
                } else {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    n60Var = queryLocalInterface3 instanceof n60 ? (n60) queryLocalInterface3 : new m60(readStrongBinder3);
                }
                f1(n60Var);
                break;
            case 17:
                f0(parcel.readInt());
                break;
            case 18:
                v();
                break;
            case 19:
                Bundle bundle = (Bundle) ca.a(parcel, Bundle.CREATOR);
                break;
            case 20:
                L();
                break;
            case 21:
                a0(parcel.readString());
                break;
            case 22:
                g1(parcel.readInt(), parcel.readString());
                break;
            case 23:
                w3((cn) ca.a(parcel, cn.CREATOR));
                break;
            case 24:
                d0((cn) ca.a(parcel, cn.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
