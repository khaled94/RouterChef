package m4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.Collections;
import java.util.List;
import k4.b;

/* loaded from: classes.dex */
public abstract class dw extends ba implements ew {
    public dw() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        String str;
        List<?> list;
        IInterface iInterface;
        String str2;
        double d5;
        IInterface iInterface2;
        boolean z10;
        bw bwVar = null;
        oo0 oo0Var = null;
        wp wpVar = null;
        switch (i10) {
            case 2:
                str = ((ky0) this).f10615u.w();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 3:
                list = ((ky0) this).f10615u.b();
                parcel2.writeNoException();
                parcel2.writeList(list);
                return true;
            case 4:
                str = ((ky0) this).f10615u.t();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 5:
                ev0 ev0Var = ((ky0) this).f10615u;
                synchronized (ev0Var) {
                    iInterface = ev0Var.f8283q;
                }
                parcel2.writeNoException();
                ca.d(parcel2, iInterface);
                return true;
            case 6:
                str = ((ky0) this).f10615u.u();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 7:
                ev0 ev0Var2 = ((ky0) this).f10615u;
                synchronized (ev0Var2) {
                    str2 = ev0Var2.a("advertiser");
                }
                parcel2.writeNoException();
                parcel2.writeString(str2);
                return true;
            case 8:
                ev0 ev0Var3 = ((ky0) this).f10615u;
                synchronized (ev0Var3) {
                    d5 = ev0Var3.p;
                }
                parcel2.writeNoException();
                parcel2.writeDouble(d5);
                return true;
            case 9:
                ev0 ev0Var4 = ((ky0) this).f10615u;
                synchronized (ev0Var4) {
                    str2 = ev0Var4.a("store");
                }
                parcel2.writeNoException();
                parcel2.writeString(str2);
                return true;
            case 10:
                str = ((ky0) this).p();
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 11:
                iInterface2 = ((ky0) this).f();
                parcel2.writeNoException();
                ca.d(parcel2, iInterface2);
                return true;
            case 12:
                str = ((ky0) this).f10613s;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 13:
                ((ky0) this).f10614t.a();
                parcel2.writeNoException();
                return true;
            case 14:
                iInterface2 = ((ky0) this).h();
                parcel2.writeNoException();
                ca.d(parcel2, iInterface2);
                return true;
            case 15:
                ((ky0) this).f10614t.n((Bundle) ca.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 16:
                z10 = ((ky0) this).f10614t.h((Bundle) ca.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                int i11 = z10 ? 1 : 0;
                int i12 = z10 ? 1 : 0;
                int i13 = z10 ? 1 : 0;
                int i14 = z10 ? 1 : 0;
                parcel2.writeInt(i11);
                return true;
            case 17:
                ((ky0) this).f10614t.d((Bundle) ca.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                return true;
            case 18:
                iInterface = new b(((ky0) this).f10614t);
                parcel2.writeNoException();
                ca.d(parcel2, iInterface);
                return true;
            case 19:
                iInterface2 = ((ky0) this).f10615u.r();
                parcel2.writeNoException();
                ca.d(parcel2, iInterface2);
                return true;
            case 20:
                Bundle i15 = ((ky0) this).f10615u.i();
                parcel2.writeNoException();
                ca.c(parcel2, i15);
                return true;
            case 21:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    bwVar = queryLocalInterface instanceof bw ? (bw) queryLocalInterface : new aw(readStrongBinder);
                }
                ((ky0) this).Q3(bwVar);
                parcel2.writeNoException();
                return true;
            case 22:
                ((ky0) this).Q();
                parcel2.writeNoException();
                return true;
            case 23:
                ky0 ky0Var = (ky0) this;
                list = ky0Var.S3() ? ky0Var.f10615u.c() : Collections.emptyList();
                parcel2.writeNoException();
                parcel2.writeList(list);
                return true;
            case 24:
                z10 = ((ky0) this).S3();
                parcel2.writeNoException();
                ClassLoader classLoader = ca.f6747a;
                int i112 = z10 ? 1 : 0;
                int i122 = z10 ? 1 : 0;
                int i132 = z10 ? 1 : 0;
                int i142 = z10 ? 1 : 0;
                parcel2.writeInt(i112);
                return true;
            case 25:
                ((ky0) this).T3(ar.N3(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            case 26:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdListener");
                    wpVar = queryLocalInterface2 instanceof wp ? (wp) queryLocalInterface2 : new vp(readStrongBinder2);
                }
                ((ky0) this).O3(wpVar);
                parcel2.writeNoException();
                return true;
            case 27:
                ((ky0) this).N3();
                parcel2.writeNoException();
                return true;
            case 28:
                ((ky0) this).C();
                parcel2.writeNoException();
                return true;
            case 29:
                iInterface2 = ((ky0) this).f10614t.B.a();
                parcel2.writeNoException();
                ca.d(parcel2, iInterface2);
                return true;
            case 30:
                z10 = ((ky0) this).R3();
                parcel2.writeNoException();
                ClassLoader classLoader2 = ca.f6747a;
                int i1122 = z10 ? 1 : 0;
                int i1222 = z10 ? 1 : 0;
                int i1322 = z10 ? 1 : 0;
                int i1422 = z10 ? 1 : 0;
                parcel2.writeInt(i1122);
                return true;
            case 31:
                ky0 ky0Var2 = (ky0) this;
                if (((Boolean) jo.f10145d.f10148c.a(es.D4)).booleanValue()) {
                    oo0Var = ky0Var2.f10614t.f6195f;
                }
                parcel2.writeNoException();
                ca.d(parcel2, oo0Var);
                return true;
            case 32:
                ((ky0) this).P3(fq.N3(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
