package n3;

import android.os.Parcel;
import k4.a;
import m4.ba;
import m4.ca;

/* loaded from: classes.dex */
public abstract class q0 extends ba implements r0 {
    public q0() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            boolean zzf = zzf(a.AbstractBinderC0085a.c0(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            ClassLoader classLoader = ca.f6747a;
            parcel2.writeInt(zzf ? 1 : 0);
        } else if (i10 != 2) {
            return false;
        } else {
            zze(a.AbstractBinderC0085a.c0(parcel.readStrongBinder()));
            parcel2.writeNoException();
        }
        return true;
    }
}
