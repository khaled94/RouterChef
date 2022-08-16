package d4;

import android.os.IBinder;
import android.os.Parcel;
import r4.a;

/* loaded from: classes.dex */
public final class g1 extends a implements i1 {
    public g1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // d4.i1
    public final int c() {
        Parcel w10 = w(2, c0());
        int readInt = w10.readInt();
        w10.recycle();
        return readInt;
    }

    @Override // d4.i1
    public final k4.a g() {
        return f1.b(w(1, c0()));
    }
}
