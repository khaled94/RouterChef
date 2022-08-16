package m4;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class q20 extends ba implements r20 {
    public q20() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 2) {
            ((ja1) this).f9888s.f9130c.k();
        } else if (i10 == 3) {
            ((ja1) this).f9888s.f9130c.g1(0, parcel.readString());
        } else if (i10 != 4) {
            return false;
        } else {
            ((ja1) this).f9888s.f9130c.w3((cn) ca.a(parcel, cn.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
