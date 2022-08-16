package o4;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import b4.b;
import c5.j;
import com.google.android.gms.common.api.Status;
import v3.d;

/* loaded from: classes.dex */
public class a extends Binder implements IInterface {
    public a() {
        attachInterface(this, "com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        d dVar = (d) this;
        boolean z10 = false;
        if (i10 == 1) {
            Parcelable.Creator<Status> creator = Status.CREATOR;
            int i12 = b.f16758a;
            v3.a aVar = null;
            Status createFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
            d createFromParcel2 = parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel);
            k kVar = (k) dVar;
            if (createFromParcel2 != null) {
                aVar = new v3.a(createFromParcel2.f19787s, createFromParcel2.f19788t);
            }
            j jVar = kVar.f16769s;
            if (createFromParcel.f2930t <= 0) {
                z10 = true;
            }
            if (z10) {
                jVar.b(aVar);
                return true;
            }
            jVar.a(new b(createFromParcel));
            return true;
        }
        return false;
    }
}
