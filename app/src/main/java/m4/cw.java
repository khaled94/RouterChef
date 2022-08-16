package m4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import d4.f1;
import java.util.ArrayList;
import java.util.List;
import k4.a;

/* loaded from: classes.dex */
public final class cw extends aa implements ew {
    public cw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // m4.ew
    public final double b() {
        Parcel c02 = c0(8, w());
        double readDouble = c02.readDouble();
        c02.recycle();
        return readDouble;
    }

    @Override // m4.ew
    public final lq f() {
        Parcel c02 = c0(11, w());
        lq N3 = kq.N3(c02.readStrongBinder());
        c02.recycle();
        return N3;
    }

    @Override // m4.ew
    public final pu h() {
        pu puVar;
        Parcel c02 = c0(14, w());
        IBinder readStrongBinder = c02.readStrongBinder();
        if (readStrongBinder == null) {
            puVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            puVar = queryLocalInterface instanceof pu ? (pu) queryLocalInterface : new nu(readStrongBinder);
        }
        c02.recycle();
        return puVar;
    }

    @Override // m4.ew
    public final String j() {
        Parcel c02 = c0(7, w());
        String readString = c02.readString();
        c02.recycle();
        return readString;
    }

    @Override // m4.ew
    public final String k() {
        Parcel c02 = c0(4, w());
        String readString = c02.readString();
        c02.recycle();
        return readString;
    }

    @Override // m4.ew
    public final a l() {
        return f1.b(c0(19, w()));
    }

    @Override // m4.ew
    public final String m() {
        Parcel c02 = c0(6, w());
        String readString = c02.readString();
        c02.recycle();
        return readString;
    }

    @Override // m4.ew
    public final vu n() {
        vu vuVar;
        Parcel c02 = c0(5, w());
        IBinder readStrongBinder = c02.readStrongBinder();
        if (readStrongBinder == null) {
            vuVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            vuVar = queryLocalInterface instanceof vu ? (vu) queryLocalInterface : new uu(readStrongBinder);
        }
        c02.recycle();
        return vuVar;
    }

    @Override // m4.ew
    public final String p() {
        Parcel c02 = c0(10, w());
        String readString = c02.readString();
        c02.recycle();
        return readString;
    }

    @Override // m4.ew
    public final List q() {
        Parcel c02 = c0(23, w());
        ArrayList readArrayList = c02.readArrayList(ca.f6747a);
        c02.recycle();
        return readArrayList;
    }

    @Override // m4.ew
    public final String r() {
        Parcel c02 = c0(9, w());
        String readString = c02.readString();
        c02.recycle();
        return readString;
    }

    @Override // m4.ew
    public final String s() {
        Parcel c02 = c0(2, w());
        String readString = c02.readString();
        c02.recycle();
        return readString;
    }

    @Override // m4.ew
    public final List v() {
        Parcel c02 = c0(3, w());
        ArrayList readArrayList = c02.readArrayList(ca.f6747a);
        c02.recycle();
        return readArrayList;
    }
}
