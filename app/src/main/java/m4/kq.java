package m4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class kq extends ba implements lq {
    public kq() {
        super("com.google.android.gms.ads.internal.client.IVideoController");
    }

    public static lq N3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
        return queryLocalInterface instanceof lq ? (lq) queryLocalInterface : new jq(iBinder);
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        boolean z10;
        float f10;
        pq pqVar;
        boolean z11 = false;
        switch (i10) {
            case 1:
                l();
                parcel2.writeNoException();
                break;
            case 2:
                n();
                parcel2.writeNoException();
                break;
            case 3:
                ClassLoader classLoader = ca.f6747a;
                if (parcel.readInt() != 0) {
                    z11 = true;
                }
                W1(z11);
                parcel2.writeNoException();
                break;
            case 4:
                z10 = s();
                parcel2.writeNoException();
                ClassLoader classLoader2 = ca.f6747a;
                int i11 = z10 ? 1 : 0;
                int i12 = z10 ? 1 : 0;
                int i13 = z10 ? 1 : 0;
                int i14 = z10 ? 1 : 0;
                parcel2.writeInt(i11);
                break;
            case 5:
                int f11 = f();
                parcel2.writeNoException();
                parcel2.writeInt(f11);
                break;
            case 6:
                f10 = e();
                parcel2.writeNoException();
                parcel2.writeFloat(f10);
                break;
            case 7:
                f10 = d();
                parcel2.writeNoException();
                parcel2.writeFloat(f10);
                break;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    pqVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
                    pqVar = queryLocalInterface instanceof pq ? (pq) queryLocalInterface : new nq(readStrongBinder);
                }
                y2(pqVar);
                parcel2.writeNoException();
                break;
            case 9:
                f10 = b();
                parcel2.writeNoException();
                parcel2.writeFloat(f10);
                break;
            case 10:
                z10 = m();
                parcel2.writeNoException();
                ClassLoader classLoader22 = ca.f6747a;
                int i112 = z10 ? 1 : 0;
                int i122 = z10 ? 1 : 0;
                int i132 = z10 ? 1 : 0;
                int i142 = z10 ? 1 : 0;
                parcel2.writeInt(i112);
                break;
            case 11:
                pq h10 = h();
                parcel2.writeNoException();
                ca.d(parcel2, h10);
                break;
            case 12:
                z10 = k();
                parcel2.writeNoException();
                ClassLoader classLoader222 = ca.f6747a;
                int i1122 = z10 ? 1 : 0;
                int i1222 = z10 ? 1 : 0;
                int i1322 = z10 ? 1 : 0;
                int i1422 = z10 ? 1 : 0;
                parcel2.writeInt(i1122);
                break;
            case 13:
                j();
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
