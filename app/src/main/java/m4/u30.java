package m4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import k4.a;

/* loaded from: classes.dex */
public final class u30 extends aa implements w30 {
    public u30(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // m4.w30
    public final t30 j0(a aVar, f10 f10Var) {
        t30 t30Var;
        Parcel w10 = w();
        ca.d(w10, aVar);
        ca.d(w10, f10Var);
        w10.writeInt(214106000);
        Parcel c02 = c0(1, w10);
        IBinder readStrongBinder = c02.readStrongBinder();
        if (readStrongBinder == null) {
            t30Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            t30Var = queryLocalInterface instanceof t30 ? (t30) queryLocalInterface : new r30(readStrongBinder);
        }
        c02.recycle();
        return t30Var;
    }
}
