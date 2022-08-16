package m4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import d4.f1;
import k4.a;

/* loaded from: classes.dex */
public final class bp extends aa implements dp {
    public bp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // m4.dp
    public final void D3(on onVar) {
        Parcel w10 = w();
        ca.b(w10, onVar);
        e0(13, w10);
    }

    @Override // m4.dp
    public final void F() {
        e0(5, w());
    }

    @Override // m4.dp
    public final boolean F1(jn jnVar) {
        Parcel w10 = w();
        ca.b(w10, jnVar);
        Parcel c02 = c0(4, w10);
        boolean z10 = c02.readInt() != 0;
        c02.recycle();
        return z10;
    }

    @Override // m4.dp
    public final void G2(gq gqVar) {
        Parcel w10 = w();
        ca.d(w10, gqVar);
        e0(42, w10);
    }

    @Override // m4.dp
    public final void K0(mo moVar) {
        Parcel w10 = w();
        ca.d(w10, moVar);
        e0(20, w10);
    }

    @Override // m4.dp
    public final void L() {
        e0(2, w());
    }

    @Override // m4.dp
    public final void L2(or orVar) {
        Parcel w10 = w();
        ca.b(w10, orVar);
        e0(29, w10);
    }

    @Override // m4.dp
    public final void Y0(po poVar) {
        Parcel w10 = w();
        ca.d(w10, poVar);
        e0(7, w10);
    }

    @Override // m4.dp
    public final void c1(pp ppVar) {
        Parcel w10 = w();
        ca.d(w10, ppVar);
        e0(45, w10);
    }

    @Override // m4.dp
    public final on e() {
        Parcel c02 = c0(12, w());
        on onVar = (on) ca.a(c02, on.CREATOR);
        c02.recycle();
        return onVar;
    }

    @Override // m4.dp
    public final void e2(boolean z10) {
        Parcel w10 = w();
        ClassLoader classLoader = ca.f6747a;
        w10.writeInt(z10 ? 1 : 0);
        e0(34, w10);
    }

    @Override // m4.dp
    public final a j() {
        return f1.b(c0(1, w()));
    }

    @Override // m4.dp
    public final void k1(a aVar) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        e0(44, w10);
    }

    @Override // m4.dp
    public final lq l() {
        lq lqVar;
        Parcel c02 = c0(26, w());
        IBinder readStrongBinder = c02.readStrongBinder();
        if (readStrongBinder == null) {
            lqVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            lqVar = queryLocalInterface instanceof lq ? (lq) queryLocalInterface : new jq(readStrongBinder);
        }
        c02.recycle();
        return lqVar;
    }

    @Override // m4.dp
    public final iq n() {
        iq iqVar;
        Parcel c02 = c0(41, w());
        IBinder readStrongBinder = c02.readStrongBinder();
        if (readStrongBinder == null) {
            iqVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            iqVar = queryLocalInterface instanceof iq ? (iq) queryLocalInterface : new hq(readStrongBinder);
        }
        c02.recycle();
        return iqVar;
    }

    @Override // m4.dp
    public final void n2(ip ipVar) {
        Parcel w10 = w();
        ca.d(w10, ipVar);
        e0(8, w10);
    }

    @Override // m4.dp
    public final void r3(jn jnVar, to toVar) {
        Parcel w10 = w();
        ca.b(w10, jnVar);
        ca.d(w10, toVar);
        e0(43, w10);
    }

    @Override // m4.dp
    public final String x() {
        Parcel c02 = c0(31, w());
        String readString = c02.readString();
        c02.recycle();
        return readString;
    }

    @Override // m4.dp
    public final void y() {
        e0(6, w());
    }

    @Override // m4.dp
    public final void z3(boolean z10) {
        Parcel w10 = w();
        ClassLoader classLoader = ca.f6747a;
        w10.writeInt(z10 ? 1 : 0);
        e0(22, w10);
    }
}
