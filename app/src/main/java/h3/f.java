package h3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import e4.a;
import m4.hp;
import m4.ip;
import m4.wh;

@Deprecated
/* loaded from: classes.dex */
public final class f extends a {
    @RecentlyNonNull
    public static final Parcelable.Creator<f> CREATOR = new k();

    /* renamed from: s */
    public final boolean f5068s;

    /* renamed from: t */
    public final ip f5069t;

    /* renamed from: u */
    public final IBinder f5070u;

    public f(boolean z10, IBinder iBinder, IBinder iBinder2) {
        ip ipVar;
        this.f5068s = z10;
        if (iBinder != null) {
            int i10 = wh.f15021t;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            ipVar = queryLocalInterface instanceof ip ? (ip) queryLocalInterface : new hp(iBinder);
        } else {
            ipVar = null;
        }
        this.f5069t = ipVar;
        this.f5070u = iBinder2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
        int q10 = m2.a.q(parcel, 20293);
        m2.a.a(parcel, 1, this.f5068s);
        ip ipVar = this.f5069t;
        m2.a.f(parcel, 2, ipVar == null ? null : ipVar.asBinder());
        m2.a.f(parcel, 3, this.f5070u);
        m2.a.u(parcel, q10);
    }
}
