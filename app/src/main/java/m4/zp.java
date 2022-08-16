package m4;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zp extends aa implements bq {
    public zp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // m4.bq
    public final void h1(cn cnVar) {
        Parcel w10 = w();
        ca.b(w10, cnVar);
        e0(1, w10);
    }
}
