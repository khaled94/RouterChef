package m4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class xo extends aa implements zo {
    public xo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // m4.zo
    public final wo b() {
        wo woVar;
        Parcel c02 = c0(1, w());
        IBinder readStrongBinder = c02.readStrongBinder();
        if (readStrongBinder == null) {
            woVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            woVar = queryLocalInterface instanceof wo ? (wo) queryLocalInterface : new uo(readStrongBinder);
        }
        c02.recycle();
        return woVar;
    }

    @Override // m4.zo
    public final void n1(String str, qv qvVar, nv nvVar) {
        Parcel w10 = w();
        w10.writeString(str);
        ca.d(w10, qvVar);
        ca.d(w10, nvVar);
        e0(5, w10);
    }

    @Override // m4.zo
    public final void p1(po poVar) {
        Parcel w10 = w();
        ca.d(w10, poVar);
        e0(2, w10);
    }

    @Override // m4.zo
    public final void s1(wv wvVar) {
        Parcel w10 = w();
        ca.d(w10, wvVar);
        e0(10, w10);
    }

    @Override // m4.zo
    public final void u3(lu luVar) {
        Parcel w10 = w();
        ca.b(w10, luVar);
        e0(6, w10);
    }
}
