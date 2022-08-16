package m4;

import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class o81 extends k10 implements kp0 {
    @GuardedBy("this")

    /* renamed from: s */
    public l10 f12042s;
    @GuardedBy("this")

    /* renamed from: t */
    public hb1 f12043t;

    @Override // m4.l10
    public final synchronized void A(int i10) {
        hb1 hb1Var = this.f12043t;
        if (hb1Var != null) {
            hb1Var.a(i10);
        }
    }

    @Override // m4.l10
    public final synchronized void L() {
        l10 l10Var = this.f12042s;
        if (l10Var != null) {
            l10Var.L();
        }
    }

    public final synchronized void O3(l10 l10Var) {
        this.f12042s = l10Var;
    }

    @Override // m4.l10
    public final synchronized void P1(String str, String str2) {
        l10 l10Var = this.f12042s;
        if (l10Var != null) {
            l10Var.P1(str, str2);
        }
    }

    @Override // m4.l10
    public final synchronized void Q() {
        l10 l10Var = this.f12042s;
        if (l10Var != null) {
            l10Var.Q();
        }
    }

    @Override // m4.l10
    public final synchronized void W2(fv fvVar, String str) {
    }

    @Override // m4.l10
    public final synchronized void a0(String str) {
        l10 l10Var = this.f12042s;
        if (l10Var != null) {
            l10Var.a0(str);
        }
    }

    @Override // m4.l10
    public final synchronized void b() {
        l10 l10Var = this.f12042s;
        if (l10Var != null) {
            l10Var.b();
        }
    }

    @Override // m4.l10
    public final synchronized void d() {
        l10 l10Var = this.f12042s;
        if (l10Var != null) {
            l10Var.d();
        }
    }

    @Override // m4.l10
    public final synchronized void d0(cn cnVar) {
        l10 l10Var = this.f12042s;
        if (l10Var != null) {
            l10Var.d0(cnVar);
        }
    }

    @Override // m4.l10
    public final synchronized void f0(int i10) {
        l10 l10Var = this.f12042s;
        if (l10Var != null) {
            l10Var.f0(i10);
        }
    }

    @Override // m4.l10
    public final synchronized void f1(n60 n60Var) {
        l10 l10Var = this.f12042s;
        if (l10Var != null) {
            l10Var.f1(n60Var);
        }
    }

    @Override // m4.l10
    public final synchronized void g1(int i10, String str) {
        hb1 hb1Var = this.f12043t;
        if (hb1Var != null) {
            synchronized (hb1Var) {
                if (!hb1Var.f9177a) {
                    hb1Var.f9177a = true;
                    if (str == null) {
                        str = ib1.c(hb1Var.f9178b.f9128a, i10);
                    }
                    hb1Var.b(new cn(i10, str, "undefined", null, null));
                }
            }
        }
    }

    @Override // m4.l10
    public final synchronized void j() {
        l10 l10Var = this.f12042s;
        if (l10Var != null) {
            l10Var.j();
        }
    }

    @Override // m4.l10
    public final synchronized void k() {
        l10 l10Var = this.f12042s;
        if (l10Var != null) {
            l10Var.k();
        }
        hb1 hb1Var = this.f12043t;
        if (hb1Var != null) {
            synchronized (hb1Var) {
                hb1Var.f9179c.a(null);
            }
        }
    }

    @Override // m4.l10
    public final synchronized void m() {
        l10 l10Var = this.f12042s;
        if (l10Var != null) {
            l10Var.m();
        }
    }

    @Override // m4.l10
    public final synchronized void o() {
        l10 l10Var = this.f12042s;
        if (l10Var != null) {
            l10Var.o();
        }
    }

    @Override // m4.l10
    public final synchronized void q() {
        l10 l10Var = this.f12042s;
        if (l10Var != null) {
            l10Var.q();
        }
    }

    @Override // m4.l10
    public final synchronized void t3(k60 k60Var) {
        l10 l10Var = this.f12042s;
        if (l10Var != null) {
            l10Var.t3(k60Var);
        }
    }

    @Override // m4.l10
    public final synchronized void u() {
        l10 l10Var = this.f12042s;
        if (l10Var != null) {
            l10Var.u();
        }
    }

    @Override // m4.l10
    public final synchronized void v() {
        l10 l10Var = this.f12042s;
        if (l10Var != null) {
            l10Var.v();
        }
    }

    @Override // m4.l10
    public final synchronized void w3(cn cnVar) {
        hb1 hb1Var = this.f12043t;
        if (hb1Var != null) {
            synchronized (hb1Var) {
                hb1Var.f9177a = true;
                hb1Var.b(cnVar);
            }
        }
    }

    @Override // m4.kp0
    public final synchronized void x3(hb1 hb1Var) {
        this.f12043t = hb1Var;
    }
}
