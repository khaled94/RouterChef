package m4;

import android.content.Context;
import android.os.RemoteException;
import k4.b;

/* loaded from: classes.dex */
public final class b91 implements l71<xs0, u20, o81> {

    /* renamed from: a */
    public final Context f6425a;

    /* renamed from: b */
    public final nt0 f6426b;

    public b91(Context context, nt0 nt0Var) {
        this.f6425a = context;
        this.f6426b = nt0Var;
    }

    @Override // m4.l71
    public final xs0 a(km1 km1Var, cm1 cm1Var, h71<u20, o81> h71Var) {
        w81 w81Var = new w81(cm1Var, h71Var.f9129b, false);
        ys0 c10 = this.f6426b.c(new lm0(km1Var, cm1Var, h71Var.f9128a), new ct0(w81Var, null));
        w81Var.f14882v = c10.h();
        h71Var.f9130c.O3(c10.l());
        return c10.o();
    }

    @Override // m4.l71
    public final void b(km1 km1Var, cm1 cm1Var, h71<u20, o81> h71Var) {
        try {
            h71Var.f9129b.U(cm1Var.W);
            h71Var.f9129b.G3(cm1Var.R, cm1Var.f7064w.toString(), ((om1) km1Var.f10488a.f8363t).f12203d, new b(this.f6425a), new a91(h71Var), h71Var.f9130c);
        } catch (RemoteException e10) {
            throw new pm1(e10);
        }
    }
}
