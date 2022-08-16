package g1;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.room.MultiInstanceInvalidationService;
import g1.j;

/* loaded from: classes.dex */
public abstract class k extends Binder implements IInterface {
    public k() {
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            int c02 = ((MultiInstanceInvalidationService.b) this).c0(j.a.w(parcel.readStrongBinder()), parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(c02);
            return true;
        } else if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                return true;
            }
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            ((MultiInstanceInvalidationService.b) this).w(parcel.readInt(), parcel.createStringArray());
            return true;
        } else {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            j w10 = j.a.w(parcel.readStrongBinder());
            int readInt = parcel.readInt();
            MultiInstanceInvalidationService.b bVar = (MultiInstanceInvalidationService.b) this;
            synchronized (MultiInstanceInvalidationService.this.f2225u) {
                MultiInstanceInvalidationService.this.f2225u.unregister(w10);
                MultiInstanceInvalidationService.this.f2224t.remove(Integer.valueOf(readInt));
            }
            parcel2.writeNoException();
            return true;
        }
    }
}
