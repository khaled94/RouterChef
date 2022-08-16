package m4;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class uo extends aa implements wo {
    public uo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // m4.wo
    public final void D1(jn jnVar) {
        Parcel w10 = w();
        ca.b(w10, jnVar);
        e0(1, w10);
    }
}
