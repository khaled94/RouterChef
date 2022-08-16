package m4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import k4.a;

/* loaded from: classes.dex */
public final class jp extends aa implements lp {
    public jp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // m4.lp
    public final zo C3(a aVar, String str, f10 f10Var) {
        zo zoVar;
        Parcel w10 = w();
        ca.d(w10, aVar);
        w10.writeString(str);
        ca.d(w10, f10Var);
        w10.writeInt(214106000);
        Parcel c02 = c0(3, w10);
        IBinder readStrongBinder = c02.readStrongBinder();
        if (readStrongBinder == null) {
            zoVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zoVar = queryLocalInterface instanceof zo ? (zo) queryLocalInterface : new xo(readStrongBinder);
        }
        c02.recycle();
        return zoVar;
    }

    @Override // m4.lp
    public final t30 E3(a aVar, f10 f10Var) {
        t30 t30Var;
        Parcel w10 = w();
        ca.d(w10, aVar);
        ca.d(w10, f10Var);
        w10.writeInt(214106000);
        Parcel c02 = c0(15, w10);
        IBinder readStrongBinder = c02.readStrongBinder();
        int i10 = s30.f13507s;
        if (readStrongBinder == null) {
            t30Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            t30Var = queryLocalInterface instanceof t30 ? (t30) queryLocalInterface : new r30(readStrongBinder);
        }
        c02.recycle();
        return t30Var;
    }

    @Override // m4.lp
    public final e40 N(a aVar) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        Parcel c02 = c0(8, w10);
        e40 N3 = d40.N3(c02.readStrongBinder());
        c02.recycle();
        return N3;
    }

    @Override // m4.lp
    public final dp Q1(a aVar, on onVar, String str, f10 f10Var, int i10) {
        dp dpVar;
        Parcel w10 = w();
        ca.d(w10, aVar);
        ca.b(w10, onVar);
        w10.writeString(str);
        ca.d(w10, f10Var);
        w10.writeInt(214106000);
        Parcel c02 = c0(2, w10);
        IBinder readStrongBinder = c02.readStrongBinder();
        if (readStrongBinder == null) {
            dpVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            dpVar = queryLocalInterface instanceof dp ? (dp) queryLocalInterface : new bp(readStrongBinder);
        }
        c02.recycle();
        return dpVar;
    }

    @Override // m4.lp
    public final dp T1(a aVar, on onVar, String str, int i10) {
        dp dpVar;
        Parcel w10 = w();
        ca.d(w10, aVar);
        ca.b(w10, onVar);
        w10.writeString(str);
        w10.writeInt(214106000);
        Parcel c02 = c0(10, w10);
        IBinder readStrongBinder = c02.readStrongBinder();
        if (readStrongBinder == null) {
            dpVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            dpVar = queryLocalInterface instanceof dp ? (dp) queryLocalInterface : new bp(readStrongBinder);
        }
        c02.recycle();
        return dpVar;
    }

    @Override // m4.lp
    public final tp U1(a aVar) {
        tp tpVar;
        Parcel w10 = w();
        ca.d(w10, aVar);
        w10.writeInt(214106000);
        Parcel c02 = c0(9, w10);
        IBinder readStrongBinder = c02.readStrongBinder();
        if (readStrongBinder == null) {
            tpVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            tpVar = queryLocalInterface instanceof tp ? (tp) queryLocalInterface : new qp(readStrongBinder);
        }
        c02.recycle();
        return tpVar;
    }

    @Override // m4.lp
    public final i80 U2(a aVar, f10 f10Var) {
        i80 i80Var;
        Parcel w10 = w();
        ca.d(w10, aVar);
        ca.d(w10, f10Var);
        w10.writeInt(214106000);
        Parcel c02 = c0(14, w10);
        IBinder readStrongBinder = c02.readStrongBinder();
        int i10 = h80.f9136s;
        if (readStrongBinder == null) {
            i80Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            i80Var = queryLocalInterface instanceof i80 ? (i80) queryLocalInterface : new g80(readStrongBinder);
        }
        c02.recycle();
        return i80Var;
    }

    @Override // m4.lp
    public final dp V0(a aVar, on onVar, String str, f10 f10Var, int i10) {
        dp dpVar;
        Parcel w10 = w();
        ca.d(w10, aVar);
        ca.b(w10, onVar);
        w10.writeString(str);
        ca.d(w10, f10Var);
        w10.writeInt(214106000);
        Parcel c02 = c0(1, w10);
        IBinder readStrongBinder = c02.readStrongBinder();
        if (readStrongBinder == null) {
            dpVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            dpVar = queryLocalInterface instanceof dp ? (dp) queryLocalInterface : new bp(readStrongBinder);
        }
        c02.recycle();
        return dpVar;
    }
}
