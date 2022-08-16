package m4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ou extends ba implements pu {
    public ou() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public static pu N3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return queryLocalInterface instanceof pu ? (pu) queryLocalInterface : new nu(iBinder);
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 2) {
            String str = ((gu) this).f9039s;
            parcel2.writeNoException();
            parcel2.writeString(str);
            return true;
        } else if (i10 != 3) {
            return false;
        } else {
            List<vu> list = ((gu) this).f9041u;
            parcel2.writeNoException();
            parcel2.writeList(list);
            return true;
        }
    }
}
