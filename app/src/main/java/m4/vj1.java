package m4;

import android.os.RemoteException;
import d.b;
import java.util.concurrent.atomic.AtomicReference;
import m3.p;
import n3.g1;

/* loaded from: classes.dex */
public final class vj1 implements vo0, up0, zk1, p, bq0, bp0, js0 {

    /* renamed from: s */
    public final gn1 f14702s;

    /* renamed from: t */
    public final AtomicReference<yi> f14703t = new AtomicReference<>();

    /* renamed from: u */
    public final AtomicReference<zi> f14704u = new AtomicReference<>();

    /* renamed from: v */
    public final AtomicReference<bj> f14705v = new AtomicReference<>();

    /* renamed from: w */
    public final AtomicReference<up0> f14706w = new AtomicReference<>();

    /* renamed from: x */
    public final AtomicReference<p> f14707x = new AtomicReference<>();
    public final AtomicReference<gq> y = new AtomicReference<>();

    /* renamed from: z */
    public vj1 f14708z = null;

    public vj1(gn1 gn1Var) {
        this.f14702s = gn1Var;
    }

    @Override // m4.js0
    public final void B0() {
        vj1 vj1Var = this.f14708z;
        if (vj1Var != null) {
            vj1Var.B0();
            return;
        }
        bj bjVar = this.f14705v.get();
        if (bjVar == null) {
            return;
        }
        try {
            bjVar.a();
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            g1.k("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }

    @Override // m3.p
    public final void J3() {
    }

    @Override // m3.p
    public final void Z1() {
        vj1 vj1Var = this.f14708z;
        if (vj1Var != null) {
            vj1Var.Z1();
            return;
        }
        p pVar = this.f14707x.get();
        if (pVar == null) {
            return;
        }
        try {
            pVar.Z1();
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            g1.k("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }

    @Override // m3.p
    public final void a() {
        vj1 vj1Var = this.f14708z;
        if (vj1Var != null) {
            vj1Var.a();
            return;
        }
        p pVar = this.f14707x.get();
        if (pVar != null) {
            try {
                pVar.a();
            } catch (RemoteException e10) {
                g1.l("#007 Could not call remote method.", e10);
            } catch (NullPointerException e11) {
                g1.k("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
        bj bjVar = this.f14705v.get();
        if (bjVar != null) {
            try {
                bjVar.d();
            } catch (RemoteException e12) {
                g1.l("#007 Could not call remote method.", e12);
            } catch (NullPointerException e13) {
                g1.k("NullPointerException occurs when invoking a method from a delegating listener.", e13);
            }
        }
        bj bjVar2 = this.f14705v.get();
        if (bjVar2 == null) {
            return;
        }
        try {
            bjVar2.b();
        } catch (RemoteException e14) {
            g1.l("#007 Could not call remote method.", e14);
        } catch (NullPointerException e15) {
            g1.k("NullPointerException occurs when invoking a method from a delegating listener.", e15);
        }
    }

    @Override // m3.p
    public final void b() {
        vj1 vj1Var = this.f14708z;
        if (vj1Var != null) {
            vj1Var.b();
            return;
        }
        p pVar = this.f14707x.get();
        if (pVar == null) {
            return;
        }
        try {
            pVar.b();
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            g1.k("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }

    public final void c() {
        vj1 vj1Var = this.f14708z;
        if (vj1Var != null) {
            vj1Var.c();
            return;
        }
        this.f14702s.a();
        zi ziVar = this.f14704u.get();
        if (ziVar != null) {
            try {
                zi ziVar2 = ziVar;
                ziVar2.e0(1, ziVar2.w());
            } catch (RemoteException e10) {
                g1.l("#007 Could not call remote method.", e10);
            } catch (NullPointerException e11) {
                g1.k("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
        bj bjVar = this.f14705v.get();
        if (bjVar == null) {
            return;
        }
        try {
            bjVar.c();
        } catch (RemoteException e12) {
            g1.l("#007 Could not call remote method.", e12);
        } catch (NullPointerException e13) {
            g1.k("NullPointerException occurs when invoking a method from a delegating listener.", e13);
        }
    }

    @Override // m4.vo0
    public final void d(cn cnVar) {
        vj1 vj1Var = this.f14708z;
        if (vj1Var != null) {
            vj1Var.d(cnVar);
            return;
        }
        yi yiVar = this.f14703t.get();
        if (yiVar != null) {
            try {
                yiVar.w2(cnVar);
            } catch (RemoteException e10) {
                g1.l("#007 Could not call remote method.", e10);
            } catch (NullPointerException e11) {
                g1.k("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
        yi yiVar2 = this.f14703t.get();
        if (yiVar2 == null) {
            return;
        }
        try {
            yiVar2.I(cnVar.f7067s);
        } catch (RemoteException e12) {
            g1.l("#007 Could not call remote method.", e12);
        } catch (NullPointerException e13) {
            g1.k("NullPointerException occurs when invoking a method from a delegating listener.", e13);
        }
    }

    @Override // m4.bp0
    public final void d0(cn cnVar) {
        vj1 vj1Var = this.f14708z;
        if (vj1Var != null) {
            vj1Var.d0(cnVar);
            return;
        }
        bj bjVar = this.f14705v.get();
        if (bjVar == null) {
            return;
        }
        try {
            bjVar.p0(cnVar);
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            g1.k("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }

    public final void e(wi wiVar) {
        vj1 vj1Var = this.f14708z;
        if (vj1Var != null) {
            vj1Var.e(wiVar);
            return;
        }
        yi yiVar = this.f14703t.get();
        if (yiVar == null) {
            return;
        }
        try {
            yiVar.u1(wiVar);
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            g1.k("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }

    @Override // m4.up0
    public final void f() {
        vj1 vj1Var = this.f14708z;
        if (vj1Var != null) {
            vj1Var.f();
            return;
        }
        up0 up0Var = this.f14706w.get();
        if (up0Var == null) {
            return;
        }
        try {
            up0Var.f();
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            g1.k("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }

    @Override // m4.zk1
    public final void g(zk1 zk1Var) {
        this.f14708z = (vj1) zk1Var;
    }

    @Override // m4.bq0
    public final void h(qn qnVar) {
        vj1 vj1Var = this.f14708z;
        if (vj1Var != null) {
            vj1Var.h(qnVar);
        } else {
            b.h(this.y, new m7(qnVar, 5));
        }
    }

    @Override // m3.p
    public final void v2() {
    }

    @Override // m3.p
    public final void w(int i10) {
        vj1 vj1Var = this.f14708z;
        if (vj1Var != null) {
            vj1Var.w(i10);
            return;
        }
        p pVar = this.f14707x.get();
        if (pVar == null) {
            return;
        }
        try {
            pVar.w(i10);
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            g1.k("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }
}
