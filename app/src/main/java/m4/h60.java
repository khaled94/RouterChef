package m4;

import android.os.IBinder;
import android.os.Parcel;
import k4.a;

/* loaded from: classes.dex */
public final class h60 extends aa implements j60 {
    public h60(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // m4.j60
    public final void N(a aVar) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        e0(1, w10);
    }

    @Override // m4.j60
    public final void R2(a aVar) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        e0(6, w10);
    }

    @Override // m4.j60
    public final void S0(a aVar, k60 k60Var) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        ca.b(w10, k60Var);
        e0(7, w10);
    }

    @Override // m4.j60
    public final void W(a aVar) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        e0(3, w10);
    }

    @Override // m4.j60
    public final void h2(a aVar, int i10) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        w10.writeInt(i10);
        e0(9, w10);
    }

    @Override // m4.j60
    public final void h3(a aVar) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        e0(11, w10);
    }

    @Override // m4.j60
    public final void m0(a aVar) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        e0(4, w10);
    }

    @Override // m4.j60
    public final void r2(a aVar) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        e0(5, w10);
    }

    @Override // m4.j60
    public final void zze(a aVar) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        e0(8, w10);
    }
}
