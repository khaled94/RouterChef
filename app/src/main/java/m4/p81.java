package m4;

import javax.annotation.concurrent.GuardedBy;
import k4.a;
import n3.g1;

/* loaded from: classes.dex */
public final class p81 extends i60 implements kp0 {
    @GuardedBy("this")

    /* renamed from: s */
    public j60 f12431s;
    @GuardedBy("this")

    /* renamed from: t */
    public hb1 f12432t;
    @GuardedBy("this")

    /* renamed from: u */
    public rs0 f12433u;

    @Override // m4.j60
    public final synchronized void J0() {
        rs0 rs0Var = this.f12433u;
        if (rs0Var != null) {
            String valueOf = String.valueOf(((ya1) rs0Var).f15635c.f9128a);
            g1.j(valueOf.length() != 0 ? "Fail to initialize adapter ".concat(valueOf) : new String("Fail to initialize adapter "));
        }
    }

    @Override // m4.j60
    public final synchronized void N(a aVar) {
        rs0 rs0Var = this.f12433u;
        if (rs0Var != null) {
            ((ya1) rs0Var).f15636d.f6098b.execute(new xa1((ya1) rs0Var, ((ya1) rs0Var).f15633a, ((ya1) rs0Var).f15634b, ((ya1) rs0Var).f15635c));
        }
    }

    @Override // m4.j60
    public final synchronized void R2(a aVar) {
        j60 j60Var = this.f12431s;
        if (j60Var != null) {
            j60Var.R2(aVar);
        }
    }

    @Override // m4.j60
    public final synchronized void S0(a aVar, k60 k60Var) {
        j60 j60Var = this.f12431s;
        if (j60Var != null) {
            ((za1) j60Var).f16071v.n0(k60Var);
        }
    }

    @Override // m4.j60
    public final synchronized void W(a aVar) {
        hb1 hb1Var = this.f12432t;
        if (hb1Var != null) {
            synchronized (hb1Var) {
                hb1Var.f9179c.a(null);
            }
        }
    }

    @Override // m4.j60
    public final synchronized void b0(a aVar) {
        j60 j60Var = this.f12431s;
        if (j60Var != null) {
            ((za1) j60Var).f16070u.a();
        }
    }

    @Override // m4.j60
    public final synchronized void h2(a aVar, int i10) {
        hb1 hb1Var = this.f12432t;
        if (hb1Var != null) {
            hb1Var.a(i10);
        }
    }

    @Override // m4.j60
    public final synchronized void h3(a aVar) {
        j60 j60Var = this.f12431s;
        if (j60Var != null) {
            ((za1) j60Var).f16070u.b();
        }
    }

    @Override // m4.j60
    public final synchronized void m0(a aVar) {
        j60 j60Var = this.f12431s;
        if (j60Var != null) {
            ((za1) j60Var).f16068s.a();
        }
    }

    @Override // m4.j60
    public final synchronized void r2(a aVar) {
        j60 j60Var = this.f12431s;
        if (j60Var != null) {
            ((za1) j60Var).f16071v.c();
        }
    }

    @Override // m4.kp0
    public final synchronized void x3(hb1 hb1Var) {
        this.f12432t = hb1Var;
    }

    @Override // m4.j60
    public final synchronized void zze(a aVar) {
        j60 j60Var = this.f12431s;
        if (j60Var != null) {
            ((za1) j60Var).f16069t.N();
        }
    }
}
