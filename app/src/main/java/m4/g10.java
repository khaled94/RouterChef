package m4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import d4.f1;
import java.util.List;
import k4.a;

/* loaded from: classes.dex */
public final class g10 extends aa implements i10 {
    public g10(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // m4.i10
    public final void A2(a aVar, jn jnVar, j60 j60Var, String str) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        ca.b(w10, jnVar);
        w10.writeString(null);
        ca.d(w10, j60Var);
        w10.writeString(str);
        e0(10, w10);
    }

    @Override // m4.i10
    public final void D() {
        e0(12, w());
    }

    @Override // m4.i10
    public final void F0(a aVar, jn jnVar, String str, String str2, l10 l10Var) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        ca.b(w10, jnVar);
        w10.writeString(str);
        w10.writeString(str2);
        ca.d(w10, l10Var);
        e0(7, w10);
    }

    @Override // m4.i10
    public final void F2(a aVar, jn jnVar, String str, l10 l10Var) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        ca.b(w10, jnVar);
        w10.writeString(str);
        ca.d(w10, l10Var);
        e0(32, w10);
    }

    @Override // m4.i10
    public final boolean G() {
        Parcel c02 = c0(22, w());
        ClassLoader classLoader = ca.f6747a;
        boolean z10 = c02.readInt() != 0;
        c02.recycle();
        return z10;
    }

    @Override // m4.i10
    public final void G0(a aVar, on onVar, jn jnVar, String str, String str2, l10 l10Var) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        ca.b(w10, onVar);
        ca.b(w10, jnVar);
        w10.writeString(str);
        w10.writeString(str2);
        ca.d(w10, l10Var);
        e0(6, w10);
    }

    @Override // m4.i10
    public final void H() {
        e0(4, w());
    }

    @Override // m4.i10
    public final void H3(a aVar, jn jnVar, String str, String str2, l10 l10Var, lu luVar, List<String> list) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        ca.b(w10, jnVar);
        w10.writeString(str);
        w10.writeString(str2);
        ca.d(w10, l10Var);
        ca.b(w10, luVar);
        w10.writeStringList(list);
        e0(14, w10);
    }

    @Override // m4.i10
    public final boolean J() {
        Parcel c02 = c0(13, w());
        ClassLoader classLoader = ca.f6747a;
        boolean z10 = c02.readInt() != 0;
        c02.recycle();
        return z10;
    }

    @Override // m4.i10
    public final void J1(a aVar, on onVar, jn jnVar, String str, String str2, l10 l10Var) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        ca.b(w10, onVar);
        ca.b(w10, jnVar);
        w10.writeString(str);
        w10.writeString(str2);
        ca.d(w10, l10Var);
        e0(35, w10);
    }

    @Override // m4.i10
    public final p10 K() {
        p10 p10Var;
        Parcel c02 = c0(15, w());
        IBinder readStrongBinder = c02.readStrongBinder();
        if (readStrongBinder == null) {
            p10Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            p10Var = queryLocalInterface instanceof p10 ? (p10) queryLocalInterface : new p10(readStrongBinder);
        }
        c02.recycle();
        return p10Var;
    }

    @Override // m4.i10
    public final void M0(boolean z10) {
        Parcel w10 = w();
        ClassLoader classLoader = ca.f6747a;
        w10.writeInt(z10 ? 1 : 0);
        e0(25, w10);
    }

    @Override // m4.i10
    public final void S() {
        e0(8, w());
    }

    @Override // m4.i10
    public final q10 V() {
        q10 q10Var;
        Parcel c02 = c0(16, w());
        IBinder readStrongBinder = c02.readStrongBinder();
        if (readStrongBinder == null) {
            q10Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            q10Var = queryLocalInterface instanceof q10 ? (q10) queryLocalInterface : new q10(readStrongBinder);
        }
        c02.recycle();
        return q10Var;
    }

    @Override // m4.i10
    public final void V2(a aVar) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        e0(37, w10);
    }

    @Override // m4.i10
    public final void a1(jn jnVar, String str) {
        Parcel w10 = w();
        ca.b(w10, jnVar);
        w10.writeString(str);
        e0(11, w10);
    }

    @Override // m4.i10
    public final lq f() {
        Parcel c02 = c0(26, w());
        lq N3 = kq.N3(c02.readStrongBinder());
        c02.recycle();
        return N3;
    }

    @Override // m4.i10
    public final void f2(a aVar) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        e0(30, w10);
    }

    @Override // m4.i10
    public final n10 i() {
        n10 n10Var;
        Parcel c02 = c0(36, w());
        IBinder readStrongBinder = c02.readStrongBinder();
        if (readStrongBinder == null) {
            n10Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            n10Var = queryLocalInterface instanceof n10 ? (n10) queryLocalInterface : new m10(readStrongBinder);
        }
        c02.recycle();
        return n10Var;
    }

    @Override // m4.i10
    public final a j() {
        return f1.b(c0(2, w()));
    }

    @Override // m4.i10
    public final void j3(a aVar, jn jnVar, String str, l10 l10Var) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        ca.b(w10, jnVar);
        w10.writeString(str);
        ca.d(w10, l10Var);
        e0(28, w10);
    }

    @Override // m4.i10
    public final void k() {
        e0(5, w());
    }

    @Override // m4.i10
    public final e30 l() {
        Parcel c02 = c0(33, w());
        e30 e30Var = (e30) ca.a(c02, e30.CREATOR);
        c02.recycle();
        return e30Var;
    }

    @Override // m4.i10
    public final void m2(a aVar, uy uyVar, List<yy> list) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        ca.d(w10, uyVar);
        w10.writeTypedList(list);
        e0(31, w10);
    }

    @Override // m4.i10
    public final t10 n() {
        t10 t10Var;
        Parcel c02 = c0(27, w());
        IBinder readStrongBinder = c02.readStrongBinder();
        if (readStrongBinder == null) {
            t10Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            t10Var = queryLocalInterface instanceof t10 ? (t10) queryLocalInterface : new r10(readStrongBinder);
        }
        c02.recycle();
        return t10Var;
    }

    @Override // m4.i10
    public final e30 o() {
        Parcel c02 = c0(34, w());
        e30 e30Var = (e30) ca.a(c02, e30.CREATOR);
        c02.recycle();
        return e30Var;
    }

    @Override // m4.i10
    public final void p3(a aVar, j60 j60Var, List<String> list) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        ca.d(w10, j60Var);
        w10.writeStringList(list);
        e0(23, w10);
    }

    @Override // m4.i10
    public final void w1() {
        e0(9, w());
    }

    @Override // m4.i10
    public final void y3(a aVar) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        e0(21, w10);
    }
}
