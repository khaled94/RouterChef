package r4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public class a implements IInterface {

    /* renamed from: s */
    public final IBinder f17251s;

    /* renamed from: t */
    public final String f17252t;

    public a(IBinder iBinder, String str) {
        this.f17251s = iBinder;
        this.f17252t = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f17251s;
    }

    public final Parcel c0() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f17252t);
        return obtain;
    }

    public final Parcel w(int i10, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f17251s.transact(i10, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e10) {
            throw e10;
        } finally {
            parcel.recycle();
        }
    }
}
