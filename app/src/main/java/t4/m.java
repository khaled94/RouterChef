package t4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public class m implements IInterface {

    /* renamed from: s */
    public final IBinder f18653s;

    public m(IBinder iBinder) {
        this.f18653s = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f18653s;
    }

    public final Parcel c0(int i10, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f18653s.transact(i10, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e10) {
            throw e10;
        } finally {
            parcel.recycle();
        }
    }

    public final Parcel w() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
        return obtain;
    }
}
