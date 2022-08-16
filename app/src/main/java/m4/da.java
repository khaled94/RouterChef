package m4;

import android.os.IBinder;
import android.os.Parcel;
import k4.a;

/* loaded from: classes.dex */
public final class da extends aa implements fa {
    public da(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // m4.fa
    public final void A(int i10) {
        Parcel w10 = w();
        w10.writeInt(i10);
        e0(7, w10);
    }

    @Override // m4.fa
    public final void M(int i10) {
        Parcel w10 = w();
        w10.writeInt(0);
        e0(6, w10);
    }

    @Override // m4.fa
    public final void d() {
        e0(3, w());
    }

    @Override // m4.fa
    public final void i0() {
        Parcel w10 = w();
        w10.writeIntArray(null);
        e0(4, w10);
    }

    @Override // m4.fa
    public final void k0(byte[] bArr) {
        Parcel w10 = w();
        w10.writeByteArray(bArr);
        e0(5, w10);
    }

    @Override // m4.fa
    public final void n0(a aVar) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        w10.writeString("GMA_SDK");
        e0(2, w10);
    }
}
