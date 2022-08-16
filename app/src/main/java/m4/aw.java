package m4;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class aw extends aa implements bw {
    public aw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override // m4.bw
    public final void O(String str) {
        Parcel w10 = w();
        w10.writeString(str);
        e0(1, w10);
    }

    @Override // m4.bw
    public final void b() {
        e0(2, w());
    }
}
