package m4;

import n3.s;
import n3.s1;

/* loaded from: classes.dex */
public final /* synthetic */ class nb0 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f11619s;

    /* renamed from: t */
    public final /* synthetic */ Object f11620t;

    public /* synthetic */ nb0(Object obj, int i10) {
        this.f11619s = i10;
        this.f11620t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11619s) {
            case 0:
                oa0 oa0Var = ((sb0) this.f11620t).f13581x;
                if (oa0Var == null) {
                    return;
                }
                ta0 ta0Var = (ta0) oa0Var;
                ta0Var.f13973w.b();
                s1.f16555i.post(new s(ta0Var, 2));
                return;
            case 1:
                av0 av0Var = (av0) this.f11620t;
                av0Var.f6262k.f();
                ev0 ev0Var = av0Var.f6261j;
                synchronized (ev0Var) {
                    vd0 vd0Var = ev0Var.f8276i;
                    if (vd0Var != null) {
                        vd0Var.destroy();
                        ev0Var.f8276i = null;
                    }
                    vd0 vd0Var2 = ev0Var.f8277j;
                    if (vd0Var2 != null) {
                        vd0Var2.destroy();
                        ev0Var.f8277j = null;
                    }
                    vd0 vd0Var3 = ev0Var.f8278k;
                    if (vd0Var3 != null) {
                        vd0Var3.destroy();
                        ev0Var.f8278k = null;
                    }
                    ev0Var.f8279l = null;
                    ev0Var.f8286t.clear();
                    ev0Var.f8287u.clear();
                    ev0Var.f8269b = null;
                    ev0Var.f8270c = null;
                    ev0Var.f8271d = null;
                    ev0Var.f8272e = null;
                    ev0Var.f8275h = null;
                    ev0Var.f8280m = null;
                    ev0Var.f8281n = null;
                    ev0Var.f8282o = null;
                    ev0Var.f8283q = null;
                    ev0Var.f8284r = null;
                    ev0Var.f8285s = null;
                }
                return;
            default:
                ((kl1) this.f11620t).f10478v.f10912e.j();
                return;
        }
    }
}
