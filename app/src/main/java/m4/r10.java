package m4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import d4.f1;
import java.util.ArrayList;
import java.util.List;
import k4.a;

/* loaded from: classes.dex */
public final class r10 extends aa implements t10 {
    public r10(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // m4.t10
    public final boolean C() {
        Parcel c02 = c0(18, w());
        ClassLoader classLoader = ca.f6747a;
        boolean z10 = c02.readInt() != 0;
        c02.recycle();
        return z10;
    }

    @Override // m4.t10
    public final void L() {
        e0(19, w());
    }

    @Override // m4.t10
    public final void N2(a aVar) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        e0(20, w10);
    }

    @Override // m4.t10
    public final void P0(a aVar, a aVar2, a aVar3) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        ca.d(w10, aVar2);
        ca.d(w10, aVar3);
        e0(21, w10);
    }

    @Override // m4.t10
    public final double b() {
        Parcel c02 = c0(8, w());
        double readDouble = c02.readDouble();
        c02.recycle();
        return readDouble;
    }

    @Override // m4.t10
    public final float d() {
        Parcel c02 = c0(23, w());
        float readFloat = c02.readFloat();
        c02.recycle();
        return readFloat;
    }

    @Override // m4.t10
    public final float e() {
        Parcel c02 = c0(25, w());
        float readFloat = c02.readFloat();
        c02.recycle();
        return readFloat;
    }

    @Override // m4.t10
    public final float f() {
        Parcel c02 = c0(24, w());
        float readFloat = c02.readFloat();
        c02.recycle();
        return readFloat;
    }

    @Override // m4.t10
    public final Bundle h() {
        Parcel c02 = c0(16, w());
        Bundle bundle = (Bundle) ca.a(c02, Bundle.CREATOR);
        c02.recycle();
        return bundle;
    }

    @Override // m4.t10
    public final lq i() {
        Parcel c02 = c0(11, w());
        lq N3 = kq.N3(c02.readStrongBinder());
        c02.recycle();
        return N3;
    }

    @Override // m4.t10
    public final a j() {
        return f1.b(c0(14, w()));
    }

    @Override // m4.t10
    public final a k() {
        return f1.b(c0(15, w()));
    }

    @Override // m4.t10
    public final vu l() {
        Parcel c02 = c0(5, w());
        vu N3 = ju.N3(c02.readStrongBinder());
        c02.recycle();
        return N3;
    }

    @Override // m4.t10
    public final String m() {
        Parcel c02 = c0(7, w());
        String readString = c02.readString();
        c02.recycle();
        return readString;
    }

    @Override // m4.t10
    public final pu n() {
        Parcel c02 = c0(12, w());
        pu N3 = ou.N3(c02.readStrongBinder());
        c02.recycle();
        return N3;
    }

    @Override // m4.t10
    public final a o() {
        return f1.b(c0(13, w()));
    }

    @Override // m4.t10
    public final String p() {
        Parcel c02 = c0(2, w());
        String readString = c02.readString();
        c02.recycle();
        return readString;
    }

    @Override // m4.t10
    public final List q() {
        Parcel c02 = c0(3, w());
        ArrayList readArrayList = c02.readArrayList(ca.f6747a);
        c02.recycle();
        return readArrayList;
    }

    @Override // m4.t10
    public final String r() {
        Parcel c02 = c0(10, w());
        String readString = c02.readString();
        c02.recycle();
        return readString;
    }

    @Override // m4.t10
    public final String s() {
        Parcel c02 = c0(4, w());
        String readString = c02.readString();
        c02.recycle();
        return readString;
    }

    @Override // m4.t10
    public final String v() {
        Parcel c02 = c0(9, w());
        String readString = c02.readString();
        c02.recycle();
        return readString;
    }

    @Override // m4.t10
    public final void w0(a aVar) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        e0(22, w10);
    }

    @Override // m4.t10
    public final String x() {
        Parcel c02 = c0(6, w());
        String readString = c02.readString();
        c02.recycle();
        return readString;
    }

    @Override // m4.t10
    public final boolean y() {
        Parcel c02 = c0(17, w());
        ClassLoader classLoader = ca.f6747a;
        boolean z10 = c02.readInt() != 0;
        c02.recycle();
        return z10;
    }
}
