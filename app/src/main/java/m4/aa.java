package m4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public class aa implements IInterface {

    /* renamed from: s */
    public final IBinder f6085s;

    /* renamed from: t */
    public final String f6086t;

    public aa(IBinder iBinder, String str) {
        this.f6085s = iBinder;
        this.f6086t = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f6085s;
    }

    public final Parcel c0(int i10, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f6085s.transact(i10, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e10) {
            throw e10;
        } finally {
            parcel.recycle();
        }
    }

    public final void e0(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f6085s.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final Parcel w() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f6086t);
        return obtain;
    }
}
