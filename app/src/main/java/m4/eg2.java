package m4;

import android.os.SystemClock;
import android.util.SparseArray;
import e.o;
import g1.l;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import k1.a;
import n3.y0;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p2.d;
import q3.f;

/* loaded from: classes.dex */
public final class eg2 implements fy, qg2, fo2, fk2, im2, xh2 {

    /* renamed from: s */
    public final d30 f7894s;

    /* renamed from: u */
    public final dg2 f7896u;

    /* renamed from: w */
    public ec1<gg2> f7898w;

    /* renamed from: x */
    public te2 f7899x;
    public xo1 y;

    /* renamed from: z */
    public boolean f7900z;

    /* renamed from: t */
    public final j40 f7895t = new j40();

    /* renamed from: v */
    public final SparseArray<fg2> f7897v = new SparseArray<>();

    public eg2() {
        bn1 bn1Var = g11.f8705a;
        this.f7898w = new ec1<>(new CopyOnWriteArraySet(), ls1.a(), bn1Var, o80.f12041v);
        d30 d30Var = new d30();
        this.f7894s = d30Var;
        this.f7896u = new dg2(d30Var);
    }

    @Override // m4.qg2
    public final void A(Exception exc) {
        fg2 N = N();
        I(N, 1037, new l2(N, exc));
    }

    @Override // m4.rx
    public final void A0(s70 s70Var, p80 p80Var) {
        fg2 G = G();
        I(G, 2, new jf0(G, s70Var, p80Var));
    }

    @Override // m4.fk2
    public final void B(int i10, uj2 uj2Var, nj2 nj2Var, w3 w3Var) {
        fg2 K = K(i10, uj2Var);
        I(K, 1001, new zf2(K, nj2Var, w3Var));
    }

    @Override // m4.rx
    public final void B0(tf0 tf0Var) {
        fg2 G = G();
        I(G, 2, new y10(G, tf0Var, 3));
    }

    @Override // m4.qg2
    public final void C(String str) {
        fg2 N = N();
        I(N, 1013, new s2(N, str));
    }

    @Override // m4.rx
    public final void C0(boolean z10) {
        fg2 G = G();
        I(G, 7, new np0(G));
    }

    @Override // m4.fo2
    public final void D(String str) {
        I(N(), 1024, new cg2());
    }

    @Override // m4.qg2
    public final void E(long j3) {
        fg2 N = N();
        I(N, 1011, new rc(N));
    }

    @Override // m4.fo2
    public final void F(t tVar, h12 h12Var) {
        fg2 N = N();
        I(N, 1022, new uf2(N, tVar, h12Var));
    }

    public final fg2 G() {
        return J(this.f7896u.f7395d);
    }

    @RequiresNonNull({"player"})
    public final fg2 H(z40 z40Var, int i10, uj2 uj2Var) {
        long j3;
        boolean z10 = true;
        uj2 uj2Var2 = true == z40Var.o() ? null : uj2Var;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!z40Var.equals(this.f7899x.l()) || i10 != this.f7899x.g()) {
            z10 = false;
        }
        long j10 = 0;
        if (uj2Var2 == null || !uj2Var2.a()) {
            if (z10) {
                j3 = this.f7899x.i();
            } else if (!z40Var.o()) {
                Objects.requireNonNull(z40Var.e(i10, this.f7895t, 0L));
                j3 = xf2.c(0L);
            }
            j10 = j3;
        } else if (z10 && this.f7899x.e() == uj2Var2.f8974b && this.f7899x.f() == uj2Var2.f8975c) {
            j3 = this.f7899x.j();
            j10 = j3;
        }
        return new fg2(elapsedRealtime, z40Var, i10, uj2Var2, j10, this.f7899x.l(), this.f7899x.g(), this.f7896u.f7395d, this.f7899x.j(), this.f7899x.k());
    }

    public final void I(fg2 fg2Var, int i10, v91<gg2> v91Var) {
        this.f7897v.put(i10, fg2Var);
        ec1<gg2> ec1Var = this.f7898w;
        ec1Var.c(i10, v91Var);
        ec1Var.b();
    }

    public final fg2 J(uj2 uj2Var) {
        Objects.requireNonNull(this.f7899x);
        z40 z40Var = uj2Var == null ? null : this.f7896u.f7394c.get(uj2Var);
        if (uj2Var == null || z40Var == null) {
            int g10 = this.f7899x.g();
            z40 l10 = this.f7899x.l();
            if (g10 >= l10.c()) {
                l10 = z40.f16002a;
            }
            return H(l10, g10, null);
        }
        return H(z40Var, z40Var.n(uj2Var.f8973a, this.f7894s).f7204c, uj2Var);
    }

    public final fg2 K(int i10, uj2 uj2Var) {
        te2 te2Var = this.f7899x;
        Objects.requireNonNull(te2Var);
        if (uj2Var != null) {
            return this.f7896u.f7394c.get(uj2Var) != null ? J(uj2Var) : H(z40.f16002a, i10, uj2Var);
        }
        z40 l10 = te2Var.l();
        if (i10 >= l10.c()) {
            l10 = z40.f16002a;
        }
        return H(l10, i10, null);
    }

    public final fg2 L() {
        return J(this.f7896u.f7396e);
    }

    @Override // m4.rx
    public final void M(int i10) {
        fg2 G = G();
        I(G, 6, new rf2(G, i10));
    }

    public final fg2 N() {
        return J(this.f7896u.f7397f);
    }

    @Override // m4.fy, m4.fo2
    public final void a(sg0 sg0Var) {
        fg2 N = N();
        I(N, 1028, new z10(N, sg0Var, null));
    }

    @Override // m4.rx
    public final void b(pt ptVar) {
        fg2 G = G();
        I(G, 12, new t70(G, ptVar));
    }

    @Override // m4.fy, m4.qg2
    public final void c(boolean z10) {
        fg2 N = N();
        I(N, 1017, new y0(N));
    }

    @Override // m4.fo2
    public final void d(long j3, int i10) {
        fg2 L = L();
        I(L, 1026, new fk0(L));
    }

    @Override // m4.fk2
    public final void e(int i10, uj2 uj2Var, w3 w3Var) {
        fg2 K = K(i10, uj2Var);
        I(K, 1004, new l(K, w3Var));
    }

    @Override // m4.qg2
    public final void f(o02 o02Var) {
        fg2 L = L();
        I(L, 1014, new d(L, o02Var));
    }

    @Override // m4.qg2
    public final void g(Exception exc) {
        fg2 N = N();
        I(N, 1018, new ps(N, exc));
    }

    @Override // m4.fo2
    public final void h(o02 o02Var) {
        fg2 L = L();
        I(L, 1025, new f(L, o02Var, 3));
    }

    @Override // m4.fo2
    public final void i(int i10, long j3) {
        fg2 L = L();
        I(L, 1023, new sf2(L, i10, j3));
    }

    @Override // m4.qg2
    public final void j(String str, long j3, long j10) {
        fg2 N = N();
        I(N, 1009, new v0(N, str));
    }

    @Override // m4.fo2
    public final void k(Exception exc) {
        fg2 N = N();
        I(N, 1038, new a(N, exc));
    }

    @Override // m4.fy
    public final /* synthetic */ void l() {
    }

    @Override // m4.qg2
    public final void m(t tVar, h12 h12Var) {
        fg2 N = N();
        I(N, 1010, new q72(N, tVar, h12Var));
    }

    @Override // m4.fy
    public final /* synthetic */ void n() {
    }

    @Override // m4.rx
    public final void o() {
        I(G(), -1, new pf2(1));
    }

    @Override // m4.qg2
    public final void p(int i10, long j3, long j10) {
        I(N(), 1012, new tf2());
    }

    @Override // m4.qg2
    public final void q(o02 o02Var) {
        I(N(), 1008, new wf2());
    }

    @Override // m4.rx
    public final void q0(final int i10) {
        final fg2 G = G();
        I(G, 4, new v91() { // from class: m4.qf2
            @Override // m4.v91
            public final void h(Object obj) {
                ((gg2) obj).o(i10);
            }
        });
    }

    @Override // m4.fk2
    public final void r(int i10, uj2 uj2Var, nj2 nj2Var, w3 w3Var) {
        I(K(i10, uj2Var), 1002, new v91() { // from class: m4.yf2
            @Override // m4.v91
            public final void h(Object obj) {
                gg2 gg2Var = (gg2) obj;
            }
        });
    }

    @Override // m4.rx
    public final void r0(gi giVar, int i10) {
        fg2 G = G();
        I(G, 1, new vf2(G, giVar));
    }

    @Override // m4.fy
    public final /* synthetic */ void s() {
    }

    @Override // m4.rx
    public final void s0(lm lmVar) {
        fg2 G = G();
        I(G, 14, new yt0(G, lmVar, 3));
    }

    @Override // m4.fo2
    public final void t(o02 o02Var) {
        fg2 N = N();
        I(N, 1020, new zz(N, o02Var, 2));
    }

    @Override // m4.rx
    public final void t0(boolean z10, int i10) {
        fg2 G = G();
        I(G, 5, new l7(G));
    }

    @Override // m4.fk2
    public final void u(int i10, uj2 uj2Var, nj2 nj2Var, w3 w3Var) {
        fg2 K = K(i10, uj2Var);
        I(K, 1000, new i2(K, nj2Var, w3Var));
    }

    @Override // m4.rx
    public final void u0(sw swVar) {
        fg2 G = G();
        I(G, 13, new x10(G, swVar, null));
    }

    @Override // m4.fk2
    public final void v(int i10, uj2 uj2Var, final nj2 nj2Var, final w3 w3Var, final IOException iOException, final boolean z10) {
        final fg2 K = K(i10, uj2Var);
        I(K, 1003, new v91() { // from class: m4.ag2
            @Override // m4.v91
            public final void h(Object obj) {
                ((gg2) obj).l(iOException);
            }
        });
    }

    @Override // m4.rx
    public final void v0(int i10) {
        dg2 dg2Var = this.f7896u;
        te2 te2Var = this.f7899x;
        Objects.requireNonNull(te2Var);
        dg2Var.f7395d = dg2.a(te2Var, dg2Var.f7393b, dg2Var.f7396e, dg2Var.f7392a);
        dg2Var.c(te2Var.l());
        fg2 G = G();
        I(G, 0, new m7(G));
    }

    @Override // m4.fo2
    public final void w(String str, long j3, long j10) {
        fg2 N = N();
        I(N, 1021, new b5(N, str));
    }

    @Override // m4.rx
    public final void w0(boolean z10, int i10) {
        I(G(), -1, new rf2());
    }

    @Override // m4.fy
    public final void x(float f10) {
        fg2 N = N();
        I(N, 1019, new tf2(N, f10));
    }

    @Override // m4.rx
    public final void x0(sz szVar, sz szVar2, int i10) {
        if (i10 == 1) {
            this.f7900z = false;
        }
        dg2 dg2Var = this.f7896u;
        te2 te2Var = this.f7899x;
        Objects.requireNonNull(te2Var);
        dg2Var.f7395d = dg2.a(te2Var, dg2Var.f7393b, dg2Var.f7396e, dg2Var.f7392a);
        fg2 G = G();
        I(G, 11, new tx0(G, szVar, szVar2));
    }

    @Override // m4.fo2
    public final void y(Object obj, long j3) {
        fg2 N = N();
        I(N, 1027, new bg2(N, obj, j3));
    }

    @Override // m4.rx
    public final void y0(xr xrVar) {
        gn gnVar;
        fg2 J = (!(xrVar instanceof o62) || (gnVar = ((o62) xrVar).f12016z) == null) ? null : J(new uj2(gnVar));
        if (J == null) {
            J = G();
        }
        I(J, 10, new wn(J, xrVar));
    }

    @Override // m4.fy
    public final void z(int i10, int i11) {
        fg2 N = N();
        I(N, 1029, new o(N));
    }

    @Override // m4.rx
    public final void z0(boolean z10) {
        fg2 G = G();
        I(G, 3, new k7(G));
    }
}
