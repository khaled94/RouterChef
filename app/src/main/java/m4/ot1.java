package m4;

import android.os.IBinder;
import android.os.Parcel;
import k4.a;

/* loaded from: classes.dex */
public final class ot1 extends aa implements qt1 {
    public ot1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // m4.qt1
    public final void A(int i10) {
        Parcel w10 = w();
        w10.writeInt(i10);
        e0(7, w10);
    }

    @Override // m4.qt1
    public final void M(int i10) {
        Parcel w10 = w();
        w10.writeInt(i10);
        e0(6, w10);
    }

    @Override // m4.qt1
    public final void X2(a aVar, String str) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        w10.writeString(str);
        w10.writeString(null);
        e0(8, w10);
    }

    @Override // m4.qt1
    public final void d() {
        e0(3, w());
    }

    @Override // m4.qt1
    public final void i0() {
        Parcel w10 = w();
        w10.writeIntArray(null);
        e0(4, w10);
    }

    @Override // m4.qt1
    public final void k0(byte[] bArr) {
        Parcel w10 = w();
        w10.writeByteArray(bArr);
        e0(5, w10);
    }
}
