package m4;

import java.util.Collections;
import java.util.List;
import k4.a;
import n3.g1;

/* loaded from: classes.dex */
public final class ky0 extends dw {

    /* renamed from: s */
    public final String f10613s;

    /* renamed from: t */
    public final av0 f10614t;

    /* renamed from: u */
    public final ev0 f10615u;

    public ky0(String str, av0 av0Var, ev0 ev0Var) {
        this.f10613s = str;
        this.f10614t = av0Var;
        this.f10615u = ev0Var;
    }

    public final void C() {
        final av0 av0Var = this.f10614t;
        synchronized (av0Var) {
            lw0 lw0Var = av0Var.f6270t;
            if (lw0Var == null) {
                g1.e("Ad should be associated with an ad view before calling recordCustomClickGesture()");
            } else {
                final boolean z10 = lw0Var instanceof pv0;
                av0Var.f6260i.execute(new Runnable() { // from class: m4.xu0
                    @Override // java.lang.Runnable
                    public final void run() {
                        av0 av0Var2 = av0.this;
                        av0Var2.f6262k.p(av0Var2.f6270t.d(), av0Var2.f6270t.l(), av0Var2.f6270t.o(), z10);
                    }
                });
            }
        }
    }

    public final void N3() {
        av0 av0Var = this.f10614t;
        synchronized (av0Var) {
            av0Var.f6262k.v();
        }
    }

    public final void O3(wp wpVar) {
        av0 av0Var = this.f10614t;
        synchronized (av0Var) {
            av0Var.f6262k.b(wpVar);
        }
    }

    public final void P3(gq gqVar) {
        av0 av0Var = this.f10614t;
        synchronized (av0Var) {
            av0Var.C.f11147s.set(gqVar);
        }
    }

    public final void Q() {
        av0 av0Var = this.f10614t;
        synchronized (av0Var) {
            av0Var.f6262k.e();
        }
    }

    public final void Q3(bw bwVar) {
        av0 av0Var = this.f10614t;
        synchronized (av0Var) {
            av0Var.f6262k.t(bwVar);
        }
    }

    public final boolean R3() {
        boolean F;
        av0 av0Var = this.f10614t;
        synchronized (av0Var) {
            F = av0Var.f6262k.F();
        }
        return F;
    }

    public final boolean S3() {
        return !this.f10615u.c().isEmpty() && this.f10615u.l() != null;
    }

    public final void T3(yp ypVar) {
        av0 av0Var = this.f10614t;
        synchronized (av0Var) {
            av0Var.f6262k.h(ypVar);
        }
    }

    @Override // m4.ew
    public final double b() {
        double d5;
        ev0 ev0Var = this.f10615u;
        synchronized (ev0Var) {
            d5 = ev0Var.p;
        }
        return d5;
    }

    @Override // m4.ew
    public final lq f() {
        return this.f10615u.k();
    }

    @Override // m4.ew
    public final pu h() {
        return this.f10615u.m();
    }

    @Override // m4.ew
    public final String j() {
        String a10;
        ev0 ev0Var = this.f10615u;
        synchronized (ev0Var) {
            a10 = ev0Var.a("advertiser");
        }
        return a10;
    }

    @Override // m4.ew
    public final String k() {
        return this.f10615u.t();
    }

    @Override // m4.ew
    public final a l() {
        return this.f10615u.r();
    }

    @Override // m4.ew
    public final String m() {
        return this.f10615u.u();
    }

    @Override // m4.ew
    public final vu n() {
        vu vuVar;
        ev0 ev0Var = this.f10615u;
        synchronized (ev0Var) {
            vuVar = ev0Var.f8283q;
        }
        return vuVar;
    }

    @Override // m4.ew
    public final String p() {
        String a10;
        ev0 ev0Var = this.f10615u;
        synchronized (ev0Var) {
            a10 = ev0Var.a("price");
        }
        return a10;
    }

    @Override // m4.ew
    public final List<?> q() {
        return S3() ? this.f10615u.c() : Collections.emptyList();
    }

    @Override // m4.ew
    public final String r() {
        String a10;
        ev0 ev0Var = this.f10615u;
        synchronized (ev0Var) {
            a10 = ev0Var.a("store");
        }
        return a10;
    }

    @Override // m4.ew
    public final String s() {
        return this.f10615u.w();
    }

    @Override // m4.ew
    public final List<?> v() {
        return this.f10615u.b();
    }
}
