package m4;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class d60 extends aa implements e60 {
    public d60(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // m4.e60
    public final void A(int i10) {
        Parcel w10 = w();
        w10.writeInt(i10);
        e0(7, w10);
    }

    @Override // m4.e60
    public final void B3(a60 a60Var) {
        Parcel w10 = w();
        ca.d(w10, a60Var);
        e0(5, w10);
    }

    @Override // m4.e60
    public final void d() {
        e0(4, w());
    }

    @Override // m4.e60
    public final void f() {
        e0(6, w());
    }

    @Override // m4.e60
    public final void h() {
        e0(1, w());
    }

    @Override // m4.e60
    public final void i() {
        e0(2, w());
    }

    @Override // m4.e60
    public final void l() {
        e0(3, w());
    }

    @Override // m4.e60
    public final void n() {
        e0(8, w());
    }
}
