package m4;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class u60 extends ba implements v60 {
    public u60() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            ((a21) this).e();
        } else if (i10 == 2) {
            int readInt = parcel.readInt();
            c21 c21Var = ((a21) this).f6026s;
            c21Var.f6699b.k(c21Var.f6698a, readInt);
        } else if (i10 != 3) {
            return false;
        } else {
            c21 c21Var2 = ((a21) this).f6026s;
            c21Var2.f6699b.k(c21Var2.f6698a, ((cn) ca.a(parcel, cn.CREATOR)).f7067s);
        }
        parcel2.writeNoException();
        return true;
    }
}
