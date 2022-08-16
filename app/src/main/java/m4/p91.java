package m4;

import android.content.Context;
import android.os.RemoteException;
import k4.b;

/* loaded from: classes.dex */
public final class p91 implements l71<av0, u20, o81> {

    /* renamed from: a */
    public final Context f12447a;

    /* renamed from: b */
    public final cu0 f12448b;

    /* renamed from: c */
    public t10 f12449c;

    /* renamed from: d */
    public final o90 f12450d;

    public p91(Context context, cu0 cu0Var, o90 o90Var) {
        this.f12447a = context;
        this.f12448b = cu0Var;
        this.f12450d = o90Var;
    }

    @Override // m4.l71
    public final /* bridge */ /* synthetic */ av0 a(km1 km1Var, cm1 cm1Var, h71<u20, o81> h71Var) {
        if (((om1) km1Var.f10488a.f8363t).f12206g.contains(Integer.toString(6))) {
            ev0 q10 = ev0.q(this.f12449c);
            if (!((om1) km1Var.f10488a.f8363t).f12206g.contains(Integer.toString(q10.h()))) {
                throw new ea1(1, "No corresponding native ad listener");
            }
            gv0 d5 = this.f12448b.d(new lm0(km1Var, cm1Var, h71Var.f9128a), new o7(q10, 2), new qw0(null, null, this.f12449c));
            h71Var.f9130c.O3(d5.l());
            return d5.o();
        }
        throw new ea1(2, "Unified must be used for RTB.");
    }

    @Override // m4.l71
    public final void b(km1 km1Var, cm1 cm1Var, h71<u20, o81> h71Var) {
        try {
            h71Var.f9129b.U(cm1Var.W);
            if (this.f12450d.f12053u < ((Integer) jo.f10145d.f10148c.a(es.b1)).intValue()) {
                h71Var.f9129b.j2(cm1Var.R, cm1Var.f7064w.toString(), ((om1) km1Var.f10488a.f8363t).f12203d, new b(this.f12447a), new o91(this, h71Var), h71Var.f9130c);
            } else {
                h71Var.f9129b.B0(cm1Var.R, cm1Var.f7064w.toString(), ((om1) km1Var.f10488a.f8363t).f12203d, new b(this.f12447a), new o91(this, h71Var), h71Var.f9130c, ((om1) km1Var.f10488a.f8363t).f12208i);
            }
        } catch (RemoteException e10) {
            throw new pm1(e10);
        }
    }
}
