package m4;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;
import k4.b;

/* loaded from: classes.dex */
public abstract class zu extends ba implements av {
    public zu() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        IInterface iInterface;
        String str;
        double d5;
        String str2;
        IInterface iInterface2;
        switch (i10) {
            case 2:
                iInterface = new b(((gy0) this).f9067t);
                parcel2.writeNoException();
                ca.d(parcel2, iInterface);
                return true;
            case 3:
                str = ((gy0) this).f9068u.w();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 4:
                List<?> b10 = ((gy0) this).f9068u.b();
                parcel2.writeNoException();
                parcel2.writeList(b10);
                return true;
            case 5:
                str = ((gy0) this).f9068u.t();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 6:
                ev0 ev0Var = ((gy0) this).f9068u;
                synchronized (ev0Var) {
                    iInterface = ev0Var.f8283q;
                }
                parcel2.writeNoException();
                ca.d(parcel2, iInterface);
                return true;
            case 7:
                str = ((gy0) this).f9068u.u();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 8:
                ev0 ev0Var2 = ((gy0) this).f9068u;
                synchronized (ev0Var2) {
                    d5 = ev0Var2.p;
                }
                parcel2.writeNoException();
                parcel2.writeDouble(d5);
                return true;
            case 9:
                ev0 ev0Var3 = ((gy0) this).f9068u;
                synchronized (ev0Var3) {
                    str2 = ev0Var3.a("store");
                }
                parcel2.writeNoException();
                parcel2.writeString(str2);
                return true;
            case 10:
                ev0 ev0Var4 = ((gy0) this).f9068u;
                synchronized (ev0Var4) {
                    str2 = ev0Var4.a("price");
                }
                parcel2.writeNoException();
                parcel2.writeString(str2);
                return true;
            case 11:
                Bundle i11 = ((gy0) this).f9068u.i();
                parcel2.writeNoException();
                ca.c(parcel2, i11);
                return true;
            case 12:
                ((gy0) this).f9067t.a();
                parcel2.writeNoException();
                return true;
            case 13:
                iInterface2 = ((gy0) this).f9068u.k();
                parcel2.writeNoException();
                ca.d(parcel2, iInterface2);
                return true;
            case 14:
                ((gy0) this).f9067t.n((Bundle) ca.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 15:
                boolean h10 = ((gy0) this).f9067t.h((Bundle) ca.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                parcel2.writeInt(h10 ? 1 : 0);
                return true;
            case 16:
                ((gy0) this).f9067t.d((Bundle) ca.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 17:
                iInterface2 = ((gy0) this).f9068u.m();
                parcel2.writeNoException();
                ca.d(parcel2, iInterface2);
                return true;
            case 18:
                iInterface2 = ((gy0) this).f9068u.r();
                parcel2.writeNoException();
                ca.d(parcel2, iInterface2);
                return true;
            case 19:
                str = ((gy0) this).f9066s;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            default:
                return false;
        }
    }
}
