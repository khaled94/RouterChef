package m4;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class hq extends aa implements iq {
    public hq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // m4.iq
    public final String b() {
        Parcel c02 = c0(1, w());
        String readString = c02.readString();
        c02.recycle();
        return readString;
    }

    @Override // m4.iq
    public final String d() {
        Parcel c02 = c0(2, w());
        String readString = c02.readString();
        c02.recycle();
        return readString;
    }

    @Override // m4.iq
    public final List<sn> e() {
        Parcel c02 = c0(3, w());
        ArrayList createTypedArrayList = c02.createTypedArrayList(sn.CREATOR);
        c02.recycle();
        return createTypedArrayList;
    }
}
