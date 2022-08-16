package m4;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes.dex */
public final class m40 extends aa implements o40 {
    public m40(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    @Override // m4.o40
    public final void A1(List<Uri> list) {
        Parcel w10 = w();
        w10.writeTypedList(list);
        e0(1, w10);
    }

    @Override // m4.o40
    public final void P(String str) {
        Parcel w10 = w();
        w10.writeString(str);
        e0(2, w10);
    }
}
