package m4;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import k4.a;

/* loaded from: classes.dex */
public final class c40 extends aa implements e40 {
    public c40(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // m4.e40
    public final boolean B() {
        Parcel c02 = c0(11, w());
        ClassLoader classLoader = ca.f6747a;
        boolean z10 = c02.readInt() != 0;
        c02.recycle();
        return z10;
    }

    @Override // m4.e40
    public final void C1(Bundle bundle) {
        Parcel w10 = w();
        ca.b(w10, bundle);
        e0(1, w10);
    }

    @Override // m4.e40
    public final void Y2(int i10, int i11, Intent intent) {
        Parcel w10 = w();
        w10.writeInt(i10);
        w10.writeInt(i11);
        ca.b(w10, intent);
        e0(12, w10);
    }

    @Override // m4.e40
    public final void Z2(Bundle bundle) {
        Parcel w10 = w();
        ca.b(w10, bundle);
        Parcel c02 = c0(6, w10);
        if (c02.readInt() != 0) {
            bundle.readFromParcel(c02);
        }
        c02.recycle();
    }

    @Override // m4.e40
    public final void f() {
        e0(10, w());
    }

    @Override // m4.e40
    public final void j() {
        e0(5, w());
    }

    @Override // m4.e40
    public final void k() {
        e0(2, w());
    }

    @Override // m4.e40
    public final void l() {
        e0(8, w());
    }

    @Override // m4.e40
    public final void m() {
        e0(4, w());
    }

    @Override // m4.e40
    public final void m0(a aVar) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        e0(13, w10);
    }

    @Override // m4.e40
    public final void p() {
        e0(7, w());
    }

    @Override // m4.e40
    public final void q() {
        e0(9, w());
    }

    @Override // m4.e40
    public final void r() {
        e0(14, w());
    }

    @Override // m4.e40
    public final void x() {
        e0(3, w());
    }
}
