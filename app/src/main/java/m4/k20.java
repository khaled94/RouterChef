package m4;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class k20 extends ba implements l20 {
    public k20() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 2) {
            ((a91) this).f6084s.f9130c.k();
        } else if (i10 == 3) {
            ((a91) this).f6084s.f9130c.g1(0, parcel.readString());
        } else if (i10 != 4) {
            return false;
        } else {
            ((a91) this).f6084s.f9130c.w3((cn) ca.a(parcel, cn.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
