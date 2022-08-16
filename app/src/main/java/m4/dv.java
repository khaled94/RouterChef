package m4;

import android.os.IBinder;
import android.os.Parcel;
import d4.f1;
import k4.a;

/* loaded from: classes.dex */
public final class dv extends aa implements fv {
    public dv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // m4.fv
    public final boolean Z(a aVar) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        Parcel c02 = c0(10, w10);
        boolean z10 = c02.readInt() != 0;
        c02.recycle();
        return z10;
    }

    @Override // m4.fv
    public final a e() {
        return f1.b(c0(9, w()));
    }

    @Override // m4.fv
    public final String f() {
        Parcel c02 = c0(4, w());
        String readString = c02.readString();
        c02.recycle();
        return readString;
    }
}
