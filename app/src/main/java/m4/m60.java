package m4;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class m60 extends aa implements n60 {
    public m60(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // m4.n60
    public final int b() {
        Parcel c02 = c0(2, w());
        int readInt = c02.readInt();
        c02.recycle();
        return readInt;
    }

    @Override // m4.n60
    public final String d() {
        Parcel c02 = c0(1, w());
        String readString = c02.readString();
        c02.recycle();
        return readString;
    }
}
