package m4;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;
import k4.b;

/* loaded from: classes.dex */
public abstract class bv extends ba implements cv {
    public bv() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        IInterface iInterface;
        String str;
        String a10;
        IInterface iInterface2;
        switch (i10) {
            case 2:
                iInterface = new b(((iy0) this).f9773t);
                parcel2.writeNoException();
                ca.d(parcel2, iInterface);
                return true;
            case 3:
                str = ((iy0) this).f9774u.w();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 4:
                List<?> b10 = ((iy0) this).f9774u.b();
                parcel2.writeNoException();
                parcel2.writeList(b10);
                return true;
            case 5:
                str = ((iy0) this).f9774u.t();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 6:
                ev0 ev0Var = ((iy0) this).f9774u;
                synchronized (ev0Var) {
                    iInterface = ev0Var.f8284r;
                }
                parcel2.writeNoException();
                ca.d(parcel2, iInterface);
                return true;
            case 7:
                str = ((iy0) this).f9774u.u();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 8:
                ev0 ev0Var2 = ((iy0) this).f9774u;
                synchronized (ev0Var2) {
                    a10 = ev0Var2.a("advertiser");
                }
                parcel2.writeNoException();
                parcel2.writeString(a10);
                return true;
            case 9:
                Bundle i11 = ((iy0) this).f9774u.i();
                parcel2.writeNoException();
                ca.c(parcel2, i11);
                return true;
            case 10:
                ((iy0) this).f9773t.a();
                parcel2.writeNoException();
                return true;
            case 11:
                iInterface2 = ((iy0) this).f9774u.k();
                parcel2.writeNoException();
                ca.d(parcel2, iInterface2);
                return true;
            case 12:
                ((iy0) this).f9773t.n((Bundle) ca.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                boolean h10 = ((iy0) this).f9773t.h((Bundle) ca.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(h10 ? 1 : 0);
                return true;
            case 14:
                ((iy0) this).f9773t.d((Bundle) ca.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                iInterface2 = ((iy0) this).f9774u.m();
                parcel2.writeNoException();
                ca.d(parcel2, iInterface2);
                return true;
            case 16:
                iInterface2 = ((iy0) this).f9774u.r();
                parcel2.writeNoException();
                ca.d(parcel2, iInterface2);
                return true;
            case 17:
                str = ((iy0) this).f9772s;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            default:
                return false;
        }
    }
}
