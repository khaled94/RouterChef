package n3;

import android.os.IBinder;
import android.os.Parcel;
import k4.a;
import m4.aa;
import m4.ca;

/* loaded from: classes.dex */
public final class p0 extends aa implements r0 {
    public p0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // n3.r0
    public final void zze(a aVar) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        e0(2, w10);
    }

    @Override // n3.r0
    public final boolean zzf(a aVar, String str, String str2) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        w10.writeString(str);
        w10.writeString(str2);
        boolean z10 = true;
        Parcel c02 = c0(1, w10);
        if (c02.readInt() == 0) {
            z10 = false;
        }
        c02.recycle();
        return z10;
    }
}
