package m4;

import android.os.IBinder;
import android.os.Parcel;
import d4.f1;
import k4.a;

/* loaded from: classes.dex */
public final class m10 extends aa implements n10 {
    public m10(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // m4.n10
    public final a b() {
        return f1.b(c0(1, w()));
    }

    @Override // m4.n10
    public final boolean d() {
        Parcel c02 = c0(2, w());
        ClassLoader classLoader = ca.f6747a;
        boolean z10 = c02.readInt() != 0;
        c02.recycle();
        return z10;
    }
}
