package m4;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class q60 extends aa implements s60 {
    public q60(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // m4.s60
    public final void b() {
        e0(7, w());
    }

    @Override // m4.s60
    public final void c3(cn cnVar) {
        Parcel w10 = w();
        ca.b(w10, cnVar);
        e0(5, w10);
    }

    @Override // m4.s60
    public final void d() {
        e0(6, w());
    }

    @Override // m4.s60
    public final void e() {
        e0(2, w());
    }

    @Override // m4.s60
    public final void i() {
        e0(1, w());
    }

    @Override // m4.s60
    public final void i3(n60 n60Var) {
        Parcel w10 = w();
        ca.d(w10, n60Var);
        e0(3, w10);
    }

    @Override // m4.s60
    public final void q0(int i10) {
        Parcel w10 = w();
        w10.writeInt(i10);
        e0(4, w10);
    }
}
