package m4;

import android.content.Context;
import android.os.RemoteException;
import k4.b;
import n3.g1;

/* loaded from: classes.dex */
public final class ka1 implements l71<hz0, u20, o81> {

    /* renamed from: a */
    public final Context f10312a;

    /* renamed from: b */
    public final kz0 f10313b;

    public ka1(Context context, kz0 kz0Var) {
        this.f10312a = context;
        this.f10313b = kz0Var;
    }

    @Override // m4.l71
    public final hz0 a(km1 km1Var, cm1 cm1Var, h71<u20, o81> h71Var) {
        w81 w81Var = new w81(cm1Var, h71Var.f9129b, true);
        iz0 f10 = this.f10313b.f(new lm0(km1Var, cm1Var, h71Var.f9128a), new jz0(w81Var));
        w81Var.f14882v = f10.h();
        h71Var.f9130c.O3(f10.t());
        return f10.q();
    }

    @Override // m4.l71
    public final void b(km1 km1Var, cm1 cm1Var, h71<u20, o81> h71Var) {
        try {
            h71Var.f9129b.U(cm1Var.W);
            if (((om1) km1Var.f10488a.f8363t).f12214o.f12816a == 3) {
                h71Var.f9129b.z1(cm1Var.R, cm1Var.f7064w.toString(), ((om1) km1Var.f10488a.f8363t).f12203d, new b(this.f10312a), new ja1(h71Var), h71Var.f9130c);
            } else {
                h71Var.f9129b.E0(cm1Var.R, cm1Var.f7064w.toString(), ((om1) km1Var.f10488a.f8363t).f12203d, new b(this.f10312a), new ja1(h71Var), h71Var.f9130c);
            }
        } catch (RemoteException e10) {
            g1.b("Remote exception loading a rewarded RTB ad", e10);
        }
    }
}
