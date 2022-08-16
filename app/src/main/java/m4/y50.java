package m4;

import android.os.Parcel;
import d4.l;

/* loaded from: classes.dex */
public final class y50 extends ba implements a60 {

    /* renamed from: s */
    public final String f15591s;

    /* renamed from: t */
    public final int f15592t;

    public y50(String str, int i10) {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
        this.f15591s = str;
        this.f15592t = i10;
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            String str = this.f15591s;
            parcel2.writeNoException();
            parcel2.writeString(str);
            return true;
        } else if (i10 != 2) {
            return false;
        } else {
            int i11 = this.f15592t;
            parcel2.writeNoException();
            parcel2.writeInt(i11);
            return true;
        }
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof y50)) {
            y50 y50Var = (y50) obj;
            if (l.a(this.f15591s, y50Var.f15591s) && l.a(Integer.valueOf(this.f15592t), Integer.valueOf(y50Var.f15592t))) {
                return true;
            }
        }
        return false;
    }
}
