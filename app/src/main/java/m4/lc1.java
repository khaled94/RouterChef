package m4;

import android.annotation.TargetApi;
import android.os.RemoteException;
import android.util.Pair;
import d.b;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import k9.u;
import n3.g1;

/* loaded from: classes.dex */
public final class lc1 implements gq0, mp0, vo0, ep0, ym, to0, bq0, ga, bp0, js0 {
    public final ep1 A;

    /* renamed from: s */
    public final AtomicReference<po> f10714s = new AtomicReference<>();

    /* renamed from: t */
    public final AtomicReference<ip> f10715t = new AtomicReference<>();

    /* renamed from: u */
    public final AtomicReference<gq> f10716u = new AtomicReference<>();

    /* renamed from: v */
    public final AtomicReference<to> f10717v = new AtomicReference<>();

    /* renamed from: w */
    public final AtomicReference<pp> f10718w = new AtomicReference<>();

    /* renamed from: x */
    public final AtomicBoolean f10719x = new AtomicBoolean(true);
    public final AtomicBoolean y = new AtomicBoolean(false);

    /* renamed from: z */
    public final AtomicBoolean f10720z = new AtomicBoolean(false);
    public final BlockingQueue<Pair<String, String>> B = new ArrayBlockingQueue(((Integer) jo.f10145d.f10148c.a(es.P5)).intValue());

    public lc1(ep1 ep1Var) {
        this.A = ep1Var;
    }

    @Override // m4.js0
    public final void B0() {
        po poVar;
        if (((Boolean) jo.f10145d.f10148c.a(es.C6)).booleanValue() && (poVar = this.f10714s.get()) != null) {
            try {
                poVar.c();
            } catch (RemoteException e10) {
                g1.l("#007 Could not call remote method.", e10);
            } catch (NullPointerException e11) {
                g1.k("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
        pp ppVar = this.f10718w.get();
        if (ppVar == null) {
            return;
        }
        try {
            ppVar.a();
        } catch (RemoteException e12) {
            g1.l("#007 Could not call remote method.", e12);
        } catch (NullPointerException e13) {
            g1.k("NullPointerException occurs when invoking a method from a delegating listener.", e13);
        }
    }

    @Override // m4.ym
    public final void N() {
        po poVar;
        if (((Boolean) jo.f10145d.f10148c.a(es.C6)).booleanValue() || (poVar = this.f10714s.get()) == null) {
            return;
        }
        try {
            poVar.c();
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            g1.k("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }

    public final synchronized po a() {
        return this.f10714s.get();
    }

    public final void b(po poVar) {
        this.f10714s.set(poVar);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.concurrent.BlockingQueue<android.util.Pair<java.lang.String, java.lang.String>>, java.util.concurrent.ArrayBlockingQueue] */
    @Override // m4.ga
    @TargetApi(5)
    public final synchronized void c(String str, String str2) {
        if (!this.f10719x.get()) {
            ip ipVar = this.f10715t.get();
            if (ipVar != null) {
                try {
                    try {
                        ipVar.d2(str, str2);
                    } catch (RemoteException e10) {
                        g1.l("#007 Could not call remote method.", e10);
                    }
                } catch (NullPointerException e11) {
                    g1.k("NullPointerException occurs when invoking a method from a delegating listener.", e11);
                }
            }
            return;
        }
        if (!this.B.offer(new Pair(str, str2))) {
            g1.e("The queue for app events is full, dropping the new event.");
            ep1 ep1Var = this.A;
            if (ep1Var != null) {
                dp1 b10 = dp1.b("dae_action");
                b10.a("dae_name", str);
                b10.a("dae_data", str2);
                ep1Var.a(b10);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.concurrent.BlockingQueue<android.util.Pair<java.lang.String, java.lang.String>>, java.util.concurrent.ArrayBlockingQueue] */
    @Override // m4.vo0
    public final void d(cn cnVar) {
        po poVar = this.f10714s.get();
        if (poVar != null) {
            try {
                poVar.t(cnVar);
            } catch (RemoteException e10) {
                g1.l("#007 Could not call remote method.", e10);
            } catch (NullPointerException e11) {
                g1.k("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
        po poVar2 = this.f10714s.get();
        if (poVar2 != null) {
            try {
                poVar2.E(cnVar.f7067s);
            } catch (RemoteException e12) {
                g1.l("#007 Could not call remote method.", e12);
            } catch (NullPointerException e13) {
                g1.k("NullPointerException occurs when invoking a method from a delegating listener.", e13);
            }
        }
        to toVar = this.f10717v.get();
        if (toVar != null) {
            try {
                toVar.H1(cnVar);
            } catch (RemoteException e14) {
                g1.l("#007 Could not call remote method.", e14);
            } catch (NullPointerException e15) {
                g1.k("NullPointerException occurs when invoking a method from a delegating listener.", e15);
            }
        }
        this.f10719x.set(false);
        this.B.clear();
    }

    @Override // m4.bp0
    public final void d0(cn cnVar) {
        b.h(this.f10718w, new jd0(cnVar));
    }

    @Override // m4.to0
    public final void e() {
    }

    public final void f(ip ipVar) {
        this.f10715t.set(ipVar);
        this.y.set(true);
        g();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.concurrent.BlockingQueue<android.util.Pair<java.lang.String, java.lang.String>>, java.util.concurrent.ArrayBlockingQueue] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.concurrent.BlockingQueue<android.util.Pair<java.lang.String, java.lang.String>>, java.util.concurrent.ArrayBlockingQueue] */
    @TargetApi(5)
    public final void g() {
        if (!this.y.get() || !this.f10720z.get()) {
            return;
        }
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            ip ipVar = this.f10715t.get();
            if (ipVar != null) {
                try {
                    ipVar.d2((String) pair.first, (String) pair.second);
                } catch (RemoteException e10) {
                    g1.l("#007 Could not call remote method.", e10);
                } catch (NullPointerException e11) {
                    g1.k("NullPointerException occurs when invoking a method from a delegating listener.", e11);
                }
            }
        }
        this.B.clear();
        this.f10719x.set(false);
    }

    @Override // m4.bq0
    public final void h(qn qnVar) {
        b.h(this.f10716u, new k7(qnVar, 2));
    }

    @Override // m4.to0
    public final void i() {
        b.h(this.f10714s, kc1.f10334s);
        b.h(this.f10718w, jc1.f9905s);
    }

    @Override // m4.mp0
    public final synchronized void j() {
        po poVar = this.f10714s.get();
        if (poVar != null) {
            try {
                poVar.h();
            } catch (RemoteException e10) {
                g1.l("#007 Could not call remote method.", e10);
            } catch (NullPointerException e11) {
                g1.k("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
        to toVar = this.f10717v.get();
        if (toVar != null) {
            try {
                toVar.c();
            } catch (RemoteException e12) {
                g1.l("#007 Could not call remote method.", e12);
            } catch (NullPointerException e13) {
                g1.k("NullPointerException occurs when invoking a method from a delegating listener.", e13);
            }
        }
        this.f10720z.set(true);
        g();
    }

    @Override // m4.to0
    public final void k() {
        b.h(this.f10714s, ic1.f9584s);
        pp ppVar = this.f10718w.get();
        if (ppVar != null) {
            try {
                ppVar.d();
            } catch (RemoteException e10) {
                g1.l("#007 Could not call remote method.", e10);
            } catch (NullPointerException e11) {
                g1.k("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
        pp ppVar2 = this.f10718w.get();
        if (ppVar2 == null) {
            return;
        }
        try {
            ppVar2.b();
        } catch (RemoteException e12) {
            g1.l("#007 Could not call remote method.", e12);
        } catch (NullPointerException e13) {
            g1.k("NullPointerException occurs when invoking a method from a delegating listener.", e13);
        }
    }

    @Override // m4.ep0
    public final void l() {
        b.h(this.f10714s, u.f5691s);
    }

    @Override // m4.gq0
    public final void l0(km1 km1Var) {
        this.f10719x.set(true);
        this.f10720z.set(false);
    }

    @Override // m4.to0
    public final void o() {
        po poVar = this.f10714s.get();
        if (poVar == null) {
            return;
        }
        try {
            poVar.f();
        } catch (RemoteException e10) {
            g1.l("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            g1.k("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }

    @Override // m4.to0
    public final void u(a60 a60Var, String str, String str2) {
    }

    @Override // m4.gq0
    public final void v0(o50 o50Var) {
    }

    @Override // m4.to0
    public final void x() {
    }
}
