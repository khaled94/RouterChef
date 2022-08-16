package m4;

import android.os.Parcel;
import o3.b;

/* loaded from: classes.dex */
public abstract class ro extends ba implements to {
    public ro() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        AdT adt;
        if (i10 == 1) {
            fn fnVar = (fn) this;
            b bVar = fnVar.f8599s;
            if (bVar != null && (adt = fnVar.f8600t) != 0) {
                bVar.b(adt);
            }
        } else if (i10 != 2) {
            return false;
        } else {
            cn cnVar = (cn) ca.a(parcel, cn.CREATOR);
            b bVar2 = ((fn) this).f8599s;
            if (bVar2 != null) {
                bVar2.a(cnVar.t());
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
