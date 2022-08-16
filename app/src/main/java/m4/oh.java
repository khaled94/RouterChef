package m4;

import android.os.RemoteException;
import n3.g1;

/* loaded from: classes.dex */
public final /* synthetic */ class oh implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f12161s;

    /* renamed from: t */
    public final /* synthetic */ Object f12162t;

    public /* synthetic */ oh(Object obj, int i10) {
        this.f12161s = i10;
        this.f12162t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12161s) {
            case 0:
                ((sh) this.f12162t).e(3);
                return;
            case 1:
                oa0 oa0Var = ((sb0) this.f12162t).f13581x;
                if (oa0Var == null) {
                    return;
                }
                ((ta0) oa0Var).h();
                return;
            default:
                av0 av0Var = (av0) this.f12162t;
                try {
                    int h10 = av0Var.f6261j.h();
                    if (h10 == 1) {
                        if (av0Var.f6265n.f11030a == null) {
                            return;
                        }
                        av0Var.k("Google", true);
                        av0Var.f6265n.f11030a.t1(av0Var.f6266o.a());
                        return;
                    } else if (h10 == 2) {
                        if (av0Var.f6265n.f11031b == null) {
                            return;
                        }
                        av0Var.k("Google", true);
                        av0Var.f6265n.f11031b.e1(av0Var.p.a());
                        return;
                    } else if (h10 == 3) {
                        lv0 lv0Var = av0Var.f6265n;
                        if (lv0Var.f11035f.getOrDefault(av0Var.f6261j.v(), null) == null) {
                            return;
                        }
                        if (av0Var.f6261j.p() != null) {
                            av0Var.k("Google", true);
                        }
                        lv0 lv0Var2 = av0Var.f6265n;
                        lv0Var2.f11035f.getOrDefault(av0Var.f6261j.v(), null).L1(av0Var.f6269s.a());
                        return;
                    } else if (h10 == 6) {
                        if (av0Var.f6265n.f11032c == null) {
                            return;
                        }
                        av0Var.k("Google", true);
                        av0Var.f6265n.f11032c.M1(av0Var.f6267q.a());
                        return;
                    } else if (h10 != 7) {
                        g1.g("Wrong native template id!");
                        return;
                    } else {
                        hz hzVar = av0Var.f6265n.f11034e;
                        if (hzVar == null) {
                            return;
                        }
                        hzVar.s0(av0Var.f6268r.a());
                        return;
                    }
                } catch (RemoteException e10) {
                    g1.h("RemoteException when notifyAdLoad is called", e10);
                    return;
                }
        }
    }
}
