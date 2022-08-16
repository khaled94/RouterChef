package m4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;
import k4.a;

/* loaded from: classes.dex */
public abstract class sp extends ba implements tp {
    public sp() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        xy xyVar = null;
        bq bqVar = null;
        boolean z10 = false;
        switch (i10) {
            case 1:
                i();
                parcel2.writeNoException();
                break;
            case 2:
                T2(parcel.readFloat());
                parcel2.writeNoException();
                break;
            case 3:
                a3(parcel.readString());
                parcel2.writeNoException();
                break;
            case 4:
                ClassLoader classLoader = ca.f6747a;
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                O2(z10);
                parcel2.writeNoException();
                break;
            case 5:
                X0(a.AbstractBinderC0085a.c0(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                break;
            case 6:
                y0(parcel.readString(), a.AbstractBinderC0085a.c0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 7:
                float b10 = b();
                parcel2.writeNoException();
                parcel2.writeFloat(b10);
                break;
            case 8:
                boolean r10 = r();
                parcel2.writeNoException();
                ClassLoader classLoader2 = ca.f6747a;
                parcel2.writeInt(r10 ? 1 : 0);
                break;
            case 9:
                String d5 = d();
                parcel2.writeNoException();
                parcel2.writeString(d5);
                break;
            case 10:
                Y(parcel.readString());
                parcel2.writeNoException();
                break;
            case 11:
                o3(e10.N3(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 12:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
                    xyVar = queryLocalInterface instanceof xy ? (xy) queryLocalInterface : new vy(readStrongBinder);
                }
                c2(xyVar);
                parcel2.writeNoException();
                break;
            case 13:
                List<ry> e10 = e();
                parcel2.writeNoException();
                parcel2.writeTypedList(e10);
                break;
            case 14:
                I0((jr) ca.a(parcel, jr.CREATOR));
                parcel2.writeNoException();
                break;
            case 15:
                h();
                parcel2.writeNoException();
                break;
            case 16:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    bqVar = queryLocalInterface2 instanceof bq ? (bq) queryLocalInterface2 : new zp(readStrongBinder2);
                }
                q2(bqVar);
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
