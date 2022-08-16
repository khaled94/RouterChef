package s4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class w0 extends f0 implements y0 {
    public w0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // s4.y0
    public final void C0(String str, String str2, Bundle bundle, long j3) {
        Parcel w10 = w();
        w10.writeString(str);
        w10.writeString(str2);
        h0.b(w10, bundle);
        w10.writeLong(j3);
        e0(1, w10);
    }

    @Override // s4.y0
    public final int g() {
        Parcel c02 = c0(2, w());
        int readInt = c02.readInt();
        c02.recycle();
        return readInt;
    }
}
