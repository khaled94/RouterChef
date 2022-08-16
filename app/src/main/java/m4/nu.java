package m4;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class nu extends aa implements pu {
    public nu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // m4.pu
    public final String e() {
        Parcel c02 = c0(2, w());
        String readString = c02.readString();
        c02.recycle();
        return readString;
    }

    @Override // m4.pu
    public final List<vu> f() {
        Parcel c02 = c0(3, w());
        ArrayList readArrayList = c02.readArrayList(ca.f6747a);
        c02.recycle();
        return readArrayList;
    }
}
