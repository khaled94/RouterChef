package m4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import d4.m;
import k4.a;
import n3.g1;

/* loaded from: classes.dex */
public abstract class cz extends ba implements dz {
    public cz() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // m4.ba
    public final boolean M3(int i10, Parcel parcel, Parcel parcel2) {
        cv0 cv0Var;
        IInterface iInterface = null;
        iInterface = null;
        iInterface = null;
        iInterface = null;
        fz fzVar = null;
        if (i10 != 3) {
            if (i10 == 4) {
                ((fy0) this).g();
            } else if (i10 == 5) {
                a c02 = a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                    fzVar = queryLocalInterface instanceof fz ? (fz) queryLocalInterface : new ez(readStrongBinder);
                }
                ((fy0) this).N3(c02, fzVar);
            } else if (i10 == 6) {
                a c03 = a.AbstractBinderC0085a.c0(parcel.readStrongBinder());
                m.d("#008 Must be called on the main UI thread.");
                ((fy0) this).N3(c03, new ey0());
            } else if (i10 != 7) {
                return false;
            } else {
                fy0 fy0Var = (fy0) this;
                m.d("#008 Must be called on the main UI thread.");
                if (fy0Var.f8673v) {
                    g1.g("getVideoController: Instream ad should not be used after destroyed");
                } else {
                    av0 av0Var = fy0Var.f8672u;
                    if (av0Var != null && (cv0Var = av0Var.B) != null) {
                        iInterface = cv0Var.a();
                    }
                }
            }
            parcel2.writeNoException();
            return true;
        }
        fy0 fy0Var2 = (fy0) this;
        m.d("#008 Must be called on the main UI thread.");
        if (fy0Var2.f8673v) {
            g1.g("getVideoController: Instream ad should not be used after destroyed");
        } else {
            iInterface = fy0Var2.f8671t;
        }
        parcel2.writeNoException();
        ca.d(parcel2, iInterface);
        return true;
    }
}
