package m4;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class np extends aa implements pp {
    public np(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // m4.pp
    public final void a() {
        e0(5, w());
    }

    @Override // m4.pp
    public final void b() {
        e0(4, w());
    }

    @Override // m4.pp
    public final void c() {
        e0(3, w());
    }

    @Override // m4.pp
    public final void d() {
        e0(2, w());
    }

    @Override // m4.pp
    public final void p0(cn cnVar) {
        Parcel w10 = w();
        ca.b(w10, cnVar);
        e0(1, w10);
    }
}
