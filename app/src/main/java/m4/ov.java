package m4;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class ov extends aa implements qv {
    public ov(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // m4.qv
    public final void L1(fv fvVar) {
        Parcel w10 = w();
        ca.d(w10, fvVar);
        e0(1, w10);
    }
}
