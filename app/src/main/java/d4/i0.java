package d4;

import android.os.IBinder;
import android.os.Parcel;
import r4.b;

/* loaded from: classes.dex */
public final class i0 implements j {

    /* renamed from: s */
    public final IBinder f3880s;

    public i0(IBinder iBinder) {
        this.f3880s = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3880s;
    }

    @Override // d4.j
    public final void m3(i iVar, e eVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder((b) iVar);
            obtain.writeInt(1);
            x0.a(eVar, obtain, 0);
            this.f3880s.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
