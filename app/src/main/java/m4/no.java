package m4;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class no extends aa implements po {
    public no(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // m4.po
    public final void E(int i10) {
        Parcel w10 = w();
        w10.writeInt(i10);
        e0(2, w10);
    }

    @Override // m4.po
    public final void c() {
        e0(6, w());
    }

    @Override // m4.po
    public final void e() {
        e0(7, w());
    }

    @Override // m4.po
    public final void f() {
        e0(3, w());
    }

    @Override // m4.po
    public final void g() {
        e0(1, w());
    }

    @Override // m4.po
    public final void h() {
        e0(4, w());
    }

    @Override // m4.po
    public final void i() {
        e0(5, w());
    }

    @Override // m4.po
    public final void t(cn cnVar) {
        Parcel w10 = w();
        ca.b(w10, cnVar);
        e0(8, w10);
    }
}
