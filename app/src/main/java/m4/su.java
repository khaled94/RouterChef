package m4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import k4.a;
import n3.g1;

/* loaded from: classes.dex */
public abstract class su extends ba implements tu {
    public su() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        float f10;
        int i11 = 0;
        IInterface iInterface = null;
        rv rvVar = null;
        iInterface = null;
        float f11 = 0.0f;
        switch (i10) {
            case 2:
                tu0 tu0Var = (tu0) this;
                if (((Boolean) jo.f10145d.f10148c.a(es.f8069c4)).booleanValue()) {
                    ev0 ev0Var = tu0Var.f14166s;
                    synchronized (ev0Var) {
                        f10 = ev0Var.f8288v;
                    }
                    if (f10 != 0.0f) {
                        ev0 ev0Var2 = tu0Var.f14166s;
                        synchronized (ev0Var2) {
                            f11 = ev0Var2.f8288v;
                        }
                    } else if (tu0Var.f14166s.k() != null) {
                        try {
                            f11 = tu0Var.f14166s.k().b();
                        } catch (RemoteException e10) {
                            g1.h("Remote exception getting video controller aspect ratio.", e10);
                        }
                    } else {
                        a aVar = tu0Var.f14167t;
                        if (aVar != null) {
                            f11 = tu0.N3(aVar);
                        } else {
                            vu n10 = tu0Var.f14166s.n();
                            if (n10 != null) {
                                float g10 = (n10.g() == -1 || n10.c() == -1) ? 0.0f : n10.g() / n10.c();
                                f11 = g10 == 0.0f ? tu0.N3(n10.d()) : g10;
                            }
                        }
                    }
                }
                parcel2.writeNoException();
                parcel2.writeFloat(f11);
                break;
            case 3:
                ((tu0) this).f14167t = a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                parcel2.writeNoException();
                break;
            case 4:
                tu0 tu0Var2 = (tu0) this;
                a aVar2 = tu0Var2.f14167t;
                if (aVar2 != null) {
                    iInterface = aVar2;
                } else {
                    vu n11 = tu0Var2.f14166s.n();
                    if (n11 != null) {
                        iInterface = n11.d();
                    }
                }
                parcel2.writeNoException();
                ca.d(parcel2, iInterface);
                break;
            case 5:
                tu0 tu0Var3 = (tu0) this;
                if (((Boolean) jo.f10145d.f10148c.a(es.f8077d4)).booleanValue() && tu0Var3.f14166s.k() != null) {
                    f11 = tu0Var3.f14166s.k().e();
                }
                parcel2.writeNoException();
                parcel2.writeFloat(f11);
                break;
            case 6:
                tu0 tu0Var4 = (tu0) this;
                if (((Boolean) jo.f10145d.f10148c.a(es.f8077d4)).booleanValue() && tu0Var4.f14166s.k() != null) {
                    f11 = tu0Var4.f14166s.k().d();
                }
                parcel2.writeNoException();
                parcel2.writeFloat(f11);
                break;
            case 7:
                tu0 tu0Var5 = (tu0) this;
                if (((Boolean) jo.f10145d.f10148c.a(es.f8077d4)).booleanValue()) {
                    iInterface = tu0Var5.f14166s.k();
                }
                parcel2.writeNoException();
                ca.d(parcel2, iInterface);
                break;
            case 8:
                tu0 tu0Var6 = (tu0) this;
                if (((Boolean) jo.f10145d.f10148c.a(es.f8077d4)).booleanValue() && tu0Var6.f14166s.k() != null) {
                    i11 = 1;
                }
                parcel2.writeNoException();
                ClassLoader classLoader = ca.f6747a;
                parcel2.writeInt(i11);
                break;
            case 9:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    rvVar = queryLocalInterface instanceof rv ? (rv) queryLocalInterface : new rv(readStrongBinder);
                }
                tu0 tu0Var7 = (tu0) this;
                if (((Boolean) jo.f10145d.f10148c.a(es.f8077d4)).booleanValue() && (tu0Var7.f14166s.k() instanceof me0)) {
                    me0 me0Var = (me0) tu0Var7.f14166s.k();
                    synchronized (me0Var.f11171t) {
                        me0Var.F = rvVar;
                    }
                }
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
