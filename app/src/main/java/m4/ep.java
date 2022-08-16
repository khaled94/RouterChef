package m4;

import android.os.IBinder;
import android.os.Parcel;
import k4.a;

/* loaded from: classes.dex */
public final class ep extends aa {
    public ep(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder E1(a aVar, on onVar, String str, f10 f10Var, int i10) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        ca.b(w10, onVar);
        w10.writeString(str);
        ca.d(w10, f10Var);
        w10.writeInt(214106000);
        w10.writeInt(i10);
        Parcel c02 = c0(2, w10);
        IBinder readStrongBinder = c02.readStrongBinder();
        c02.recycle();
        return readStrongBinder;
    }
}
