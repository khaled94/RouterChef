package m4;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import k4.a;

/* loaded from: classes.dex */
public final class s20 extends aa implements u20 {
    public s20(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // m4.u20
    public final void B0(String str, String str2, jn jnVar, a aVar, o20 o20Var, l10 l10Var, lu luVar) {
        Parcel w10 = w();
        w10.writeString(str);
        w10.writeString(str2);
        ca.b(w10, jnVar);
        ca.d(w10, aVar);
        ca.d(w10, o20Var);
        ca.d(w10, l10Var);
        ca.b(w10, luVar);
        e0(22, w10);
    }

    @Override // m4.u20
    public final void E0(String str, String str2, jn jnVar, a aVar, r20 r20Var, l10 l10Var) {
        Parcel w10 = w();
        w10.writeString(str);
        w10.writeString(str2);
        ca.b(w10, jnVar);
        ca.d(w10, aVar);
        ca.d(w10, r20Var);
        ca.d(w10, l10Var);
        e0(16, w10);
    }

    @Override // m4.u20
    public final void G3(String str, String str2, jn jnVar, a aVar, l20 l20Var, l10 l10Var) {
        Parcel w10 = w();
        w10.writeString(str);
        w10.writeString(str2);
        ca.b(w10, jnVar);
        ca.d(w10, aVar);
        ca.d(w10, l20Var);
        ca.d(w10, l10Var);
        e0(14, w10);
    }

    @Override // m4.u20
    public final void U(String str) {
        Parcel w10 = w();
        w10.writeString(str);
        e0(19, w10);
    }

    @Override // m4.u20
    public final boolean Z(a aVar) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        Parcel c02 = c0(15, w10);
        boolean z10 = c02.readInt() != 0;
        c02.recycle();
        return z10;
    }

    @Override // m4.u20
    public final lq b() {
        Parcel c02 = c0(5, w());
        lq N3 = kq.N3(c02.readStrongBinder());
        c02.recycle();
        return N3;
    }

    @Override // m4.u20
    public final e30 d() {
        Parcel c02 = c0(2, w());
        e30 e30Var = (e30) ca.a(c02, e30.CREATOR);
        c02.recycle();
        return e30Var;
    }

    @Override // m4.u20
    public final e30 e() {
        Parcel c02 = c0(3, w());
        e30 e30Var = (e30) ca.a(c02, e30.CREATOR);
        c02.recycle();
        return e30Var;
    }

    @Override // m4.u20
    public final void i1(a aVar, String str, Bundle bundle, Bundle bundle2, on onVar, x20 x20Var) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        w10.writeString(str);
        ca.b(w10, bundle);
        ca.b(w10, bundle2);
        ca.b(w10, onVar);
        ca.d(w10, x20Var);
        e0(1, w10);
    }

    @Override // m4.u20
    public final void j2(String str, String str2, jn jnVar, a aVar, o20 o20Var, l10 l10Var) {
        Parcel w10 = w();
        w10.writeString(str);
        w10.writeString(str2);
        ca.b(w10, jnVar);
        ca.d(w10, aVar);
        ca.d(w10, o20Var);
        ca.d(w10, l10Var);
        e0(18, w10);
    }

    @Override // m4.u20
    public final void l1(String str, String str2, jn jnVar, a aVar, i20 i20Var, l10 l10Var, on onVar) {
        Parcel w10 = w();
        w10.writeString(str);
        w10.writeString(str2);
        ca.b(w10, jnVar);
        ca.d(w10, aVar);
        ca.d(w10, i20Var);
        ca.d(w10, l10Var);
        ca.b(w10, onVar);
        e0(13, w10);
    }

    @Override // m4.u20
    public final boolean s3(a aVar) {
        Parcel w10 = w();
        ca.d(w10, aVar);
        Parcel c02 = c0(17, w10);
        boolean z10 = c02.readInt() != 0;
        c02.recycle();
        return z10;
    }

    @Override // m4.u20
    public final void x0(String str, String str2, jn jnVar, a aVar, i20 i20Var, l10 l10Var, on onVar) {
        Parcel w10 = w();
        w10.writeString(str);
        w10.writeString(str2);
        ca.b(w10, jnVar);
        ca.d(w10, aVar);
        ca.d(w10, i20Var);
        ca.d(w10, l10Var);
        ca.b(w10, onVar);
        e0(21, w10);
    }

    @Override // m4.u20
    public final void z1(String str, String str2, jn jnVar, a aVar, r20 r20Var, l10 l10Var) {
        Parcel w10 = w();
        w10.writeString(str);
        w10.writeString(str2);
        ca.b(w10, jnVar);
        ca.d(w10, aVar);
        ca.d(w10, r20Var);
        ca.d(w10, l10Var);
        e0(20, w10);
    }
}
