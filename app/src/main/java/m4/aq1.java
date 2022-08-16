package m4;

import android.os.IBinder;
import android.os.Parcel;
import d4.f1;
import k4.a;

/* loaded from: classes.dex */
public final class aq1 extends aa implements cq1 {
    public aq1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.omid.IOmid");
    }

    @Override // m4.cq1
    public final a E2(String str, a aVar, String str2, String str3, String str4, String str5, String str6) {
        Parcel w10 = w();
        w10.writeString(str);
        ca.d(w10, aVar);
        w10.writeString("");
        w10.writeString("javascript");
        w10.writeString(str2);
        w10.writeString(str3);
        w10.writeString(str4);
        w10.writeString(str5);
        w10.writeString(str6);
        return f1.b(c0(10, w10));
    }

    @Override // m4.cq1
    public final void G1(a aVar, a aVar2) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        ca.d(w10, aVar2);
        e0(8, w10);
    }

    @Override // m4.cq1
    public final boolean N(a aVar) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        Parcel c02 = c0(2, w10);
        boolean z10 = c02.readInt() != 0;
        c02.recycle();
        return z10;
    }

    @Override // m4.cq1
    public final void N0(a aVar, a aVar2) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        ca.d(w10, aVar2);
        e0(5, w10);
    }

    @Override // m4.cq1
    public final a O1(String str, a aVar, String str2, String str3, String str4, String str5) {
        Parcel w10 = w();
        w10.writeString(str);
        ca.d(w10, aVar);
        w10.writeString("");
        w10.writeString("javascript");
        w10.writeString(str2);
        w10.writeString("Google");
        w10.writeString(str3);
        w10.writeString(str4);
        w10.writeString(str5);
        return f1.b(c0(11, w10));
    }

    @Override // m4.cq1
    public final void W(a aVar) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        e0(7, w10);
    }

    @Override // m4.cq1
    public final String e() {
        Parcel c02 = c0(6, w());
        String readString = c02.readString();
        c02.recycle();
        return readString;
    }

    @Override // m4.cq1
    public final void g2(a aVar) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        e0(4, w10);
    }
}
