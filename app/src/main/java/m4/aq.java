package m4;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class aq extends ba implements bq {
    public aq() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            h1((cn) ca.a(parcel, cn.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
