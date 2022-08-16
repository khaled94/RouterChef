package m4;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class g50 extends ba implements h50 {
    public g50() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        l50 l50Var = null;
        if (i10 != 1) {
            if (i10 == 2) {
                b50 b50Var = (b50) ca.a(parcel, b50.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if (queryLocalInterface instanceof i50) {
                        i50 i50Var = (i50) queryLocalInterface;
                    }
                }
            } else if (i10 == 4) {
                o50 o50Var = (o50) ca.a(parcel, o50.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    l50Var = queryLocalInterface2 instanceof l50 ? (l50) queryLocalInterface2 : new j50(readStrongBinder2);
                }
                ((k51) this).u2(o50Var, l50Var);
            } else if (i10 == 5) {
                o50 o50Var2 = (o50) ca.a(parcel, o50.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    l50Var = queryLocalInterface3 instanceof l50 ? (l50) queryLocalInterface3 : new j50(readStrongBinder3);
                }
                k51 k51Var = (k51) this;
                k51Var.V3(k51Var.P3(o50Var2, Binder.getCallingUid()), l50Var);
            } else if (i10 == 6) {
                o50 o50Var3 = (o50) ca.a(parcel, o50.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    l50Var = queryLocalInterface4 instanceof l50 ? (l50) queryLocalInterface4 : new j50(readStrongBinder4);
                }
                k51 k51Var2 = (k51) this;
                k51Var2.V3(k51Var2.N3(o50Var3, Binder.getCallingUid()), l50Var);
            } else if (i10 != 7) {
                return false;
            } else {
                String readString = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    l50Var = queryLocalInterface5 instanceof l50 ? (l50) queryLocalInterface5 : new j50(readStrongBinder5);
                }
                k51 k51Var3 = (k51) this;
                k51Var3.V3(k51Var3.Q3(readString), l50Var);
            }
            parcel2.writeNoException();
        } else {
            b50 b50Var2 = (b50) ca.a(parcel, b50.CREATOR);
            parcel2.writeNoException();
            ca.c(parcel2, null);
        }
        return true;
    }
}
