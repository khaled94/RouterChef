package m4;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class nq extends aa implements pq {
    public nq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // m4.pq
    public final void b() {
        e0(4, w());
    }

    @Override // m4.pq
    public final void e() {
        e0(3, w());
    }

    @Override // m4.pq
    public final void f() {
        e0(2, w());
    }

    @Override // m4.pq
    public final void h() {
        e0(1, w());
    }

    @Override // m4.pq
    public final void l2(boolean z10) {
        Parcel w10 = w();
        ClassLoader classLoader = ca.f6747a;
        w10.writeInt(z10 ? 1 : 0);
        e0(5, w10);
    }
}
