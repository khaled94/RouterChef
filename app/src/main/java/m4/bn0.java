package m4;

import h4.a;

/* loaded from: classes.dex */
public final class bn0 implements mp0, ym, gq0, ep0, to0, zq0 {

    /* renamed from: s */
    public final a f6574s;

    /* renamed from: t */
    public final u80 f6575t;

    public bn0(a aVar, u80 u80Var) {
        this.f6574s = aVar;
        this.f6575t = u80Var;
    }

    @Override // m4.zq0
    public final void G0(boolean z10) {
    }

    @Override // m4.ym
    public final void N() {
        u80 u80Var = this.f6575t;
        synchronized (u80Var.f14272d) {
            if (u80Var.f14279k != -1) {
                t80 t80Var = new t80(u80Var);
                t80Var.f13956a = u80Var.f14269a.b();
                u80Var.f14271c.add(t80Var);
                u80Var.f14277i++;
                d90 d90Var = u80Var.f14270b;
                synchronized (d90Var.f7264a) {
                    a90 a90Var = d90Var.f7267d;
                    synchronized (a90Var.f6079f) {
                        a90Var.f6082i++;
                    }
                }
                u80Var.f14270b.a(u80Var);
            }
        }
    }

    @Override // m4.zq0
    public final void a() {
    }

    public final void b(jn jnVar) {
        u80 u80Var = this.f6575t;
        synchronized (u80Var.f14272d) {
            long b10 = u80Var.f14269a.b();
            u80Var.f14278j = b10;
            d90 d90Var = u80Var.f14270b;
            synchronized (d90Var.f7264a) {
                d90Var.f7267d.a(jnVar, b10);
            }
        }
    }

    @Override // m4.to0
    public final void e() {
    }

    @Override // m4.to0
    public final void i() {
        u80 u80Var = this.f6575t;
        synchronized (u80Var.f14272d) {
            if (u80Var.f14279k != -1 && !u80Var.f14271c.isEmpty()) {
                t80 last = u80Var.f14271c.getLast();
                if (last.f13957b == -1) {
                    last.f13957b = last.f13958c.f14269a.b();
                    u80Var.f14270b.a(u80Var);
                }
            }
        }
    }

    @Override // m4.mp0
    public final void j() {
        u80 u80Var = this.f6575t;
        synchronized (u80Var.f14272d) {
            if (u80Var.f14279k != -1) {
                u80Var.f14276h = u80Var.f14269a.b();
            }
        }
    }

    @Override // m4.to0
    public final void k() {
    }

    @Override // m4.ep0
    public final void l() {
        u80 u80Var = this.f6575t;
        synchronized (u80Var.f14272d) {
            if (u80Var.f14279k != -1 && u80Var.f14275g == -1) {
                u80Var.f14275g = u80Var.f14269a.b();
                u80Var.f14270b.a(u80Var);
            }
            d90 d90Var = u80Var.f14270b;
            synchronized (d90Var.f7264a) {
                a90 a90Var = d90Var.f7267d;
                synchronized (a90Var.f6079f) {
                    a90Var.f6083j++;
                }
            }
        }
    }

    @Override // m4.gq0
    public final void l0(km1 km1Var) {
        u80 u80Var = this.f6575t;
        long b10 = this.f6574s.b();
        synchronized (u80Var.f14272d) {
            u80Var.f14279k = b10;
            if (b10 != -1) {
                u80Var.f14270b.a(u80Var);
            }
        }
    }

    @Override // m4.zq0
    public final void m0(kk kkVar) {
    }

    @Override // m4.to0
    public final void o() {
    }

    @Override // m4.zq0
    public final void r(boolean z10) {
    }

    @Override // m4.to0
    public final void u(a60 a60Var, String str, String str2) {
    }

    @Override // m4.zq0
    public final void v(kk kkVar) {
        u80 u80Var = this.f6575t;
        synchronized (u80Var.f14272d) {
            d90 d90Var = u80Var.f14270b;
            synchronized (d90Var.f7264a) {
                d90Var.f7267d.b();
            }
        }
    }

    @Override // m4.gq0
    public final void v0(o50 o50Var) {
    }

    @Override // m4.to0
    public final void x() {
    }

    @Override // m4.zq0
    public final void y0(kk kkVar) {
        u80 u80Var = this.f6575t;
        synchronized (u80Var.f14272d) {
            d90 d90Var = u80Var.f14270b;
            synchronized (d90Var.f7264a) {
                d90Var.f7267d.b();
            }
        }
    }
}
