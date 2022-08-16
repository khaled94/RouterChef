package m4;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes.dex */
public final class vy extends aa implements xy {
    public vy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // m4.xy
    public final void N1(List<ry> list) {
        Parcel w10 = w();
        w10.writeTypedList(list);
        e0(1, w10);
    }
}
