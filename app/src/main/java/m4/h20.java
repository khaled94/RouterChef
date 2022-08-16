package m4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.View;
import k4.a;
import k4.b;

/* loaded from: classes.dex */
public abstract class h20 extends ba implements i20 {
    public h20() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        n10 n10Var;
        if (i10 == 1) {
            a c02 = a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
            e81 e81Var = (e81) this;
            e81Var.f7740t.f8371c = (View) b.e0(c02);
            e81Var.f7739s.f9130c.k();
        } else if (i10 == 2) {
            ((e81) this).f7739s.f9130c.g1(0, parcel.readString());
        } else if (i10 == 3) {
            ((e81) this).t((cn) ca.a(parcel, cn.CREATOR));
        } else if (i10 != 4) {
            return false;
        } else {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                n10Var = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
                n10Var = queryLocalInterface instanceof n10 ? (n10) queryLocalInterface : new m10(readStrongBinder);
            }
            e81 e81Var2 = (e81) this;
            e81Var2.f7740t.f8372d = n10Var;
            e81Var2.f7739s.f9130c.k();
        }
        parcel2.writeNoException();
        return true;
    }
}
