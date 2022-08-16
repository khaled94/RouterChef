package y4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;
import s4.f0;
import s4.h0;

/* loaded from: classes.dex */
public final class g1 extends f0 implements j1 {
    public g1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // y4.j1
    public final void A0(k6 k6Var) {
        Parcel w10 = w();
        h0.b(w10, k6Var);
        e0(6, w10);
    }

    @Override // y4.j1
    public final void A3(k6 k6Var) {
        Parcel w10 = w();
        h0.b(w10, k6Var);
        e0(4, w10);
    }

    @Override // y4.j1
    public final void I1(k6 k6Var) {
        Parcel w10 = w();
        h0.b(w10, k6Var);
        e0(20, w10);
    }

    @Override // y4.j1
    public final List<b> K3(String str, String str2, k6 k6Var) {
        Parcel w10 = w();
        w10.writeString(str);
        w10.writeString(str2);
        h0.b(w10, k6Var);
        Parcel c02 = c0(16, w10);
        ArrayList createTypedArrayList = c02.createTypedArrayList(b.CREATOR);
        c02.recycle();
        return createTypedArrayList;
    }

    @Override // y4.j1
    public final void L0(p pVar, k6 k6Var) {
        Parcel w10 = w();
        h0.b(w10, pVar);
        h0.b(w10, k6Var);
        e0(1, w10);
    }

    @Override // y4.j1
    public final void P2(d6 d6Var, k6 k6Var) {
        Parcel w10 = w();
        h0.b(w10, d6Var);
        h0.b(w10, k6Var);
        e0(2, w10);
    }

    @Override // y4.j1
    public final byte[] S1(p pVar, String str) {
        Parcel w10 = w();
        h0.b(w10, pVar);
        w10.writeString(str);
        Parcel c02 = c0(9, w10);
        byte[] createByteArray = c02.createByteArray();
        c02.recycle();
        return createByteArray;
    }

    @Override // y4.j1
    public final List<b> V1(String str, String str2, String str3) {
        Parcel w10 = w();
        w10.writeString(null);
        w10.writeString(str2);
        w10.writeString(str3);
        Parcel c02 = c0(17, w10);
        ArrayList createTypedArrayList = c02.createTypedArrayList(b.CREATOR);
        c02.recycle();
        return createTypedArrayList;
    }

    @Override // y4.j1
    public final List<d6> a2(String str, String str2, boolean z10, k6 k6Var) {
        Parcel w10 = w();
        w10.writeString(str);
        w10.writeString(str2);
        ClassLoader classLoader = h0.f17902a;
        w10.writeInt(z10 ? 1 : 0);
        h0.b(w10, k6Var);
        Parcel c02 = c0(14, w10);
        ArrayList createTypedArrayList = c02.createTypedArrayList(d6.CREATOR);
        c02.recycle();
        return createTypedArrayList;
    }

    @Override // y4.j1
    public final List<d6> d1(String str, String str2, String str3, boolean z10) {
        Parcel w10 = w();
        w10.writeString(null);
        w10.writeString(str2);
        w10.writeString(str3);
        ClassLoader classLoader = h0.f17902a;
        w10.writeInt(z10 ? 1 : 0);
        Parcel c02 = c0(15, w10);
        ArrayList createTypedArrayList = c02.createTypedArrayList(d6.CREATOR);
        c02.recycle();
        return createTypedArrayList;
    }

    @Override // y4.j1
    public final void f3(Bundle bundle, k6 k6Var) {
        Parcel w10 = w();
        h0.b(w10, bundle);
        h0.b(w10, k6Var);
        e0(19, w10);
    }

    @Override // y4.j1
    public final String p2(k6 k6Var) {
        Parcel w10 = w();
        h0.b(w10, k6Var);
        Parcel c02 = c0(11, w10);
        String readString = c02.readString();
        c02.recycle();
        return readString;
    }

    @Override // y4.j1
    public final void x1(b bVar, k6 k6Var) {
        Parcel w10 = w();
        h0.b(w10, bVar);
        h0.b(w10, k6Var);
        e0(12, w10);
    }

    @Override // y4.j1
    public final void x2(k6 k6Var) {
        Parcel w10 = w();
        h0.b(w10, k6Var);
        e0(18, w10);
    }

    @Override // y4.j1
    public final void z0(long j3, String str, String str2, String str3) {
        Parcel w10 = w();
        w10.writeLong(j3);
        w10.writeString(str);
        w10.writeString(str2);
        w10.writeString(str3);
        e0(10, w10);
    }
}
