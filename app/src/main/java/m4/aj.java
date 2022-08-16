package m4;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class aj extends aa implements bj {
    public aj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // m4.bj
    public final void a() {
        e0(5, w());
    }

    @Override // m4.bj
    public final void b() {
        e0(4, w());
    }

    @Override // m4.bj
    public final void c() {
        e0(2, w());
    }

    @Override // m4.bj
    public final void d() {
        e0(1, w());
    }

    @Override // m4.bj
    public final void p0(cn cnVar) {
        Parcel w10 = w();
        ca.b(w10, cnVar);
        e0(3, w10);
    }
}
