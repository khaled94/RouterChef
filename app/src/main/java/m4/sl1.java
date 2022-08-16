package m4;

import android.os.Parcel;
import android.os.RemoteException;
import androidx.lifecycle.f0;
import d.b;
import e.o;
import e9.f;
import java.util.concurrent.atomic.AtomicReference;
import n3.g1;
import n3.y0;

/* loaded from: classes.dex */
public final class sl1 extends xr1 implements mp0, vo0, to0, bp0, bq0, zk1, js0 {

    /* renamed from: s */
    public final gn1 f13731s;

    /* renamed from: t */
    public final AtomicReference<xr1> f13732t = new AtomicReference<>();

    /* renamed from: u */
    public final AtomicReference<v60> f13733u = new AtomicReference<>();

    /* renamed from: v */
    public final AtomicReference<s60> f13734v = new AtomicReference<>();

    /* renamed from: w */
    public final AtomicReference<e60> f13735w = new AtomicReference<>();

    /* renamed from: x */
    public final AtomicReference<w60> f13736x = new AtomicReference<>();
    public final AtomicReference<b60> y = new AtomicReference<>();

    /* renamed from: z */
    public final AtomicReference<gq> f13737z = new AtomicReference<>();

    public sl1(gn1 gn1Var) {
        this.f13731s = gn1Var;
    }

    @Override // m4.js0
    public final void B0() {
        b.h(this.f13734v, f.f4466v);
    }

    @Override // m4.vo0
    public final void d(final cn cnVar) {
        int i10 = cnVar.f7067s;
        b.h(this.f13733u, new rk1() { // from class: m4.uj1
            @Override // m4.rk1
            public final void h(Object obj) {
                switch (r2) {
                    case 0:
                        ((yi) obj).I(cnVar.f7067s);
                        return;
                    default:
                        ((v60) obj).t(cnVar);
                        return;
                }
            }
        });
        b.h(this.f13733u, new pl1(i10));
        e60 e60Var = this.f13735w.get();
        if (e60Var == null) {
            return;
        }
        try {
            e60Var.A(i10);
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            g1.k("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }

    @Override // m4.bp0
    public final void d0(final cn cnVar) {
        b.h(this.f13734v, new y0(cnVar, 3));
        b.h(this.f13734v, new rk1() { // from class: m4.tj1
            @Override // m4.rk1
            public final void h(Object obj) {
                switch (r2) {
                    case 0:
                        ((yi) obj).w2(cnVar);
                        return;
                    default:
                        ((s60) obj).q0(cnVar.f7067s);
                        return;
                }
            }
        });
    }

    @Override // m4.to0
    public final void e() {
        e60 e60Var = this.f13735w.get();
        if (e60Var == null) {
            return;
        }
        try {
            e60Var.n();
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            g1.k("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }

    @Override // m4.zk1
    public final void g(zk1 zk1Var) {
        throw null;
    }

    @Override // m4.bq0
    public final void h(qn qnVar) {
        gq gqVar = this.f13737z.get();
        if (gqVar == null) {
            return;
        }
        try {
            gqVar.I2(qnVar);
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            g1.k("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }

    @Override // m4.to0
    public final void i() {
        this.f13731s.a();
        s60 s60Var = this.f13734v.get();
        if (s60Var != null) {
            try {
                s60Var.e();
            } catch (RemoteException e10) {
                g1.l("#007 Could not call remote method.", e10);
            } catch (NullPointerException e11) {
                g1.k("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
        e60 e60Var = this.f13735w.get();
        if (e60Var == null) {
            return;
        }
        try {
            e60Var.d();
        } catch (RemoteException e12) {
            g1.l("#007 Could not call remote method.", e12);
        } catch (NullPointerException e13) {
            g1.k("NullPointerException occurs when invoking a method from a delegating listener.", e13);
        }
    }

    @Override // m4.mp0
    public final void j() {
        b.h(this.f13733u, ql1.f12917s);
        e60 e60Var = this.f13735w.get();
        if (e60Var == null) {
            return;
        }
        try {
            e60Var.h();
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            g1.k("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }

    @Override // m4.to0
    public final void k() {
        b.h(this.f13734v, f0.f1678u);
        e60 e60Var = this.f13735w.get();
        if (e60Var != null) {
            try {
                e60Var.i();
            } catch (RemoteException e10) {
                g1.l("#007 Could not call remote method.", e10);
            } catch (NullPointerException e11) {
                g1.k("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
        b.h(this.f13734v, ol1.f12196s);
    }

    @Override // m4.to0
    public final void o() {
        e60 e60Var = this.f13735w.get();
        if (e60Var == null) {
            return;
        }
        try {
            e60Var.f();
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            g1.k("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }

    @Override // m4.xr1
    public final void r() {
        b.h(this.f13732t, rl1.f13389s);
    }

    public final void s(xr1 xr1Var) {
        this.f13732t.set(xr1Var);
    }

    @Override // m4.to0
    public final void u(a60 a60Var, String str, String str2) {
        b.h(this.f13734v, new o(a60Var, 3));
        w60 w60Var = this.f13736x.get();
        if (w60Var != null) {
            try {
                w60 w60Var2 = w60Var;
                z60 z60Var = new z60(((y50) a60Var).f15591s, ((y50) a60Var).f15592t);
                Parcel w10 = w60Var2.w();
                ca.d(w10, z60Var);
                w10.writeString(str);
                w10.writeString(str2);
                w60Var2.e0(2, w10);
            } catch (RemoteException e10) {
                g1.l("#007 Could not call remote method.", e10);
            } catch (NullPointerException e11) {
                g1.k("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
        b.h(this.f13735w, new m7(a60Var, 6));
        b60 b60Var = this.y.get();
        if (b60Var == null) {
            return;
        }
        try {
            b60 b60Var2 = b60Var;
            Parcel w11 = b60Var2.w();
            ca.d(w11, a60Var);
            w11.writeString(str);
            w11.writeString(str2);
            b60Var2.e0(2, w11);
        } catch (RemoteException e12) {
            g1.l("#007 Could not call remote method.", e12);
        } catch (NullPointerException e13) {
            g1.k("NullPointerException occurs when invoking a method from a delegating listener.", e13);
        }
    }

    @Override // m4.to0
    public final void x() {
        e60 e60Var = this.f13735w.get();
        if (e60Var == null) {
            return;
        }
        try {
            e60Var.l();
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            g1.k("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }
}
