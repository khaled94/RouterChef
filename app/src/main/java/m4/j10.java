package m4;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class j10 extends aa implements l10 {
    public j10(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // m4.l10
    public final void A(int i10) {
        Parcel w10 = w();
        w10.writeInt(i10);
        e0(3, w10);
    }

    @Override // m4.l10
    public final void L() {
        e0(20, w());
    }

    @Override // m4.l10
    public final void P1(String str, String str2) {
        Parcel w10 = w();
        w10.writeString(str);
        w10.writeString(str2);
        e0(9, w10);
    }

    @Override // m4.l10
    public final void Q() {
        e0(15, w());
    }

    @Override // m4.l10
    public final void W2(fv fvVar, String str) {
        Parcel w10 = w();
        ca.d(w10, fvVar);
        w10.writeString(str);
        e0(10, w10);
    }

    @Override // m4.l10
    public final void a0(String str) {
        Parcel w10 = w();
        w10.writeString(str);
        e0(21, w10);
    }

    @Override // m4.l10
    public final void b() {
        e0(1, w());
    }

    @Override // m4.l10
    public final void d() {
        e0(2, w());
    }

    @Override // m4.l10
    public final void d0(cn cnVar) {
        Parcel w10 = w();
        ca.b(w10, cnVar);
        e0(24, w10);
    }

    @Override // m4.l10
    public final void f0(int i10) {
        throw null;
    }

    @Override // m4.l10
    public final void f1(n60 n60Var) {
        Parcel w10 = w();
        ca.d(w10, n60Var);
        e0(16, w10);
    }

    @Override // m4.l10
    public final void g1(int i10, String str) {
        Parcel w10 = w();
        w10.writeInt(i10);
        w10.writeString(str);
        e0(22, w10);
    }

    @Override // m4.l10
    public final void j() {
        e0(4, w());
    }

    @Override // m4.l10
    public final void k() {
        e0(6, w());
    }

    @Override // m4.l10
    public final void m() {
        e0(5, w());
    }

    @Override // m4.l10
    public final void o() {
        e0(8, w());
    }

    @Override // m4.l10
    public final void q() {
        e0(11, w());
    }

    @Override // m4.l10
    public final void t3(k60 k60Var) {
        throw null;
    }

    @Override // m4.l10
    public final void u() {
        e0(13, w());
    }

    @Override // m4.l10
    public final void v() {
        e0(18, w());
    }

    @Override // m4.l10
    public final void w3(cn cnVar) {
        Parcel w10 = w();
        ca.b(w10, cnVar);
        e0(23, w10);
    }
}
