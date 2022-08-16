package n4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class d implements b, IInterface {

    /* renamed from: s */
    public final IBinder f16606s;

    public d(IBinder iBinder) {
        this.f16606s = iBinder;
    }

    @Override // n4.b
    public final boolean a() {
        Parcel w10 = w();
        int i10 = a.f16604a;
        boolean z10 = true;
        w10.writeInt(1);
        Parcel c02 = c0(2, w10);
        if (c02.readInt() == 0) {
            z10 = false;
        }
        c02.recycle();
        return z10;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f16606s;
    }

    @Override // n4.b
    public final boolean c() {
        Parcel c02 = c0(6, w());
        int i10 = a.f16604a;
        boolean z10 = c02.readInt() != 0;
        c02.recycle();
        return z10;
    }

    public final Parcel c0(int i10, Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f16606s.transact(i10, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e10) {
            throw e10;
        } finally {
            parcel.recycle();
        }
    }

    @Override // n4.b
    public final String getId() {
        Parcel c02 = c0(1, w());
        String readString = c02.readString();
        c02.recycle();
        return readString;
    }

    public final Parcel w() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return obtain;
    }
}
