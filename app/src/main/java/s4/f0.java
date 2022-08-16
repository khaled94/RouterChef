package s4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public class f0 implements IInterface {

    /* renamed from: s */
    public final IBinder f17856s;

    /* renamed from: t */
    public final String f17857t;

    public f0(IBinder iBinder, String str) {
        this.f17856s = iBinder;
        this.f17857t = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f17856s;
    }

    public final Parcel c0(int i10, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f17856s.transact(i10, parcel, parcel, 0);
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
            this.f17856s.transact(i10, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
        }
    }

    public final Parcel w() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f17857t);
        return obtain;
    }
}
