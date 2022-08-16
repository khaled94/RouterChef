package m4;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class n40 extends ba implements o40 {
    public static o40 N3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        return queryLocalInterface instanceof o40 ? (o40) queryLocalInterface : new m40(iBinder);
    }
}
