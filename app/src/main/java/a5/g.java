package a5;

import android.os.IBinder;
import android.os.Parcel;
import p4.a;
import p4.b;
import p4.c;

/* loaded from: classes.dex */
public final class g extends a {
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void w(j jVar, f fVar) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f16948t);
        int i10 = c.f16949a;
        obtain.writeInt(1);
        jVar.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(fVar == null ? null : (b) fVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            this.f16947s.transact(12, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
