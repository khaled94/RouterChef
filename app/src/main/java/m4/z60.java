package m4;

import android.os.Parcel;

/* loaded from: classes.dex */
public final class z60 extends ba implements n60 {

    /* renamed from: s */
    public final String f16014s;

    /* renamed from: t */
    public final int f16015t;

    public z60(String str, int i10) {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
        this.f16014s = str;
        this.f16015t = i10;
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            String str = this.f16014s;
            parcel2.writeNoException();
            parcel2.writeString(str);
            return true;
        } else if (i10 != 2) {
            return false;
        } else {
            int i11 = this.f16015t;
            parcel2.writeNoException();
            parcel2.writeInt(i11);
            return true;
        }
    }

    @Override // m4.n60
    public final int b() {
        return this.f16015t;
    }

    @Override // m4.n60
    public final String d() {
        return this.f16014s;
    }
}
