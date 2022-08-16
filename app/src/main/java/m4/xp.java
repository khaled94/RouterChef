package m4;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class xp extends aa implements yp {
    public xp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    @Override // m4.yp
    public final String b() {
        Parcel c02 = c0(1, w());
        String readString = c02.readString();
        c02.recycle();
        return readString;
    }

    @Override // m4.yp
    public final String d() {
        Parcel c02 = c0(2, w());
        String readString = c02.readString();
        c02.recycle();
        return readString;
    }
}
