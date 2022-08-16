package m4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.MotionEvent;
import android.view.View;
import k4.a;
import k4.b;

/* loaded from: classes.dex */
public abstract class xu extends ba {
    public xu() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.view.View>>] */
    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        b bVar;
        tu tuVar = null;
        switch (i10) {
            case 1:
                String readString = parcel.readString();
                a c02 = a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                qv0 qv0Var = (qv0) this;
                synchronized (qv0Var) {
                    qv0Var.c0(readString, (View) b.e0(c02));
                }
                parcel2.writeNoException();
                break;
            case 2:
                String readString2 = parcel.readString();
                qv0 qv0Var2 = (qv0) this;
                synchronized (qv0Var2) {
                    bVar = new b(qv0Var2.E1(readString2));
                }
                parcel2.writeNoException();
                ca.d(parcel2, bVar);
                break;
            case 3:
                ((qv0) this).P3(a.AbstractBinderC0085a.c0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 4:
                qv0 qv0Var3 = (qv0) this;
                synchronized (qv0Var3) {
                    if (!qv0Var3.E) {
                        av0 av0Var = qv0Var3.f13003z;
                        if (av0Var != null) {
                            av0Var.f(qv0Var3);
                            qv0Var3.f13003z = null;
                        }
                        qv0Var3.f12998t.clear();
                        qv0Var3.f12999u.removeAllViews();
                        qv0Var3.f13000v.removeAllViews();
                        qv0Var3.f12998t = null;
                        qv0Var3.f12999u = null;
                        qv0Var3.f13000v = null;
                        qv0Var3.f13002x = null;
                        qv0Var3.A = null;
                        qv0Var3.E = true;
                    }
                }
                parcel2.writeNoException();
                break;
            case 5:
                a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                parcel.readInt();
                parcel2.writeNoException();
                break;
            case 6:
                ((qv0) this).N3(a.AbstractBinderC0085a.c0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                break;
            case 7:
                qv0 qv0Var4 = (qv0) this;
                qv0Var4.onTouch(qv0Var4.f12999u, (MotionEvent) b.e0(a.AbstractBinderC0085a.c0(parcel.readStrongBinder())));
                parcel2.writeNoException();
                break;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    tuVar = queryLocalInterface instanceof tu ? (tu) queryLocalInterface : new ru(readStrongBinder);
                }
                ((qv0) this).O3(tuVar);
                parcel2.writeNoException();
                break;
            case 9:
                a c03 = a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                qv0 qv0Var5 = (qv0) this;
                synchronized (qv0Var5) {
                    if (!qv0Var5.E) {
                        qv0Var5.B = c03;
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
