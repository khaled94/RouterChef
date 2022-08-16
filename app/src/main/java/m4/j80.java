package m4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import k4.a;

/* loaded from: classes.dex */
public final class j80 extends aa implements l80 {
    public j80(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // m4.l80
    public final i80 j0(a aVar, f10 f10Var) {
        i80 i80Var;
        Parcel w10 = w();
        ca.d(w10, aVar);
        ca.d(w10, f10Var);
        w10.writeInt(214106000);
        Parcel c02 = c0(2, w10);
        IBinder readStrongBinder = c02.readStrongBinder();
        if (readStrongBinder == null) {
            i80Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            i80Var = queryLocalInterface instanceof i80 ? (i80) queryLocalInterface : new g80(readStrongBinder);
        }
        c02.recycle();
        return i80Var;
    }
}
