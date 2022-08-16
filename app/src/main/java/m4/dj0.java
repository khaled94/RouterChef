package m4;

import android.content.Context;
import h4.a;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;
import m3.p;
import n3.g1;
import org.json.JSONObject;
import x.d;

/* loaded from: classes.dex */
public final class dj0 implements rh, fp0, p, ep0 {

    /* renamed from: s */
    public final yi0 f7520s;

    /* renamed from: t */
    public final zi0 f7521t;

    /* renamed from: v */
    public final u00<JSONObject, JSONObject> f7523v;

    /* renamed from: w */
    public final Executor f7524w;

    /* renamed from: x */
    public final a f7525x;

    /* renamed from: u */
    public final Set<vd0> f7522u = new HashSet();
    public final AtomicBoolean y = new AtomicBoolean(false);
    @GuardedBy("this")

    /* renamed from: z */
    public final cj0 f7526z = new cj0();
    public boolean A = false;
    public WeakReference<?> B = new WeakReference<>(this);

    public dj0(r00 r00Var, zi0 zi0Var, Executor executor, yi0 yi0Var, a aVar) {
        this.f7520s = yi0Var;
        d dVar = l00.f10626b;
        r00Var.a();
        this.f7523v = new u00<>(r00Var.f13084b);
        this.f7521t = zi0Var;
        this.f7524w = executor;
        this.f7525x = aVar;
    }

    @Override // m3.p
    public final synchronized void J3() {
        this.f7526z.f6996b = true;
        c();
    }

    @Override // m3.p
    public final void Z1() {
    }

    @Override // m3.p
    public final void a() {
    }

    @Override // m3.p
    public final void b() {
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.HashSet, java.util.Set<m4.vd0>] */
    public final synchronized void c() {
        if (this.B.get() == null) {
            synchronized (this) {
                d();
                this.A = true;
            }
        } else if (this.A || !this.y.get()) {
        } else {
            try {
                this.f7526z.f6997c = this.f7525x.b();
                final JSONObject a10 = this.f7521t.a(this.f7526z);
                Iterator it = this.f7522u.iterator();
                while (it.hasNext()) {
                    final vd0 vd0Var = (vd0) it.next();
                    this.f7524w.execute(new Runnable() { // from class: m4.bj0
                        @Override // java.lang.Runnable
                        public final void run() {
                            vd0.this.P0("AFMA_updateActiveView", a10);
                        }
                    });
                }
                u00<JSONObject, JSONObject> u00Var = this.f7523v;
                tz1<f00> tz1Var = u00Var.f14235a;
                s00 s00Var = new s00(u00Var, a10);
                t90 t90Var = u90.f14299f;
                mz1.t(mz1.p(tz1Var, s00Var, t90Var), new l7(), t90Var);
            } catch (Exception e10) {
                g1.b("Failed to call ActiveViewJS", e10);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashSet, java.util.Set<m4.vd0>] */
    public final void d() {
        Iterator it = this.f7522u.iterator();
        while (it.hasNext()) {
            vd0 vd0Var = (vd0) it.next();
            yi0 yi0Var = this.f7520s;
            vd0Var.z0("/updateActiveView", yi0Var.f15792e);
            vd0Var.z0("/untrackActiveViewUnit", yi0Var.f15793f);
        }
        yi0 yi0Var2 = this.f7520s;
        r00 r00Var = yi0Var2.f15789b;
        final lx<Object> lxVar = yi0Var2.f15792e;
        tz1<f00> tz1Var = r00Var.f13084b;
        cu1 cu1Var = new cu1() { // from class: m4.p00
            @Override // m4.cu1
            public final Object a(Object obj) {
                f00 f00Var = (f00) obj;
                f00Var.v0(r1, lxVar);
                return f00Var;
            }
        };
        t90 t90Var = u90.f14299f;
        r00Var.f13084b = mz1.o(tz1Var, cu1Var, t90Var);
        r00 r00Var2 = yi0Var2.f15789b;
        final lx<Object> lxVar2 = yi0Var2.f15793f;
        r00Var2.f13084b = mz1.o(r00Var2.f13084b, new cu1() { // from class: m4.p00
            @Override // m4.cu1
            public final Object a(Object obj) {
                f00 f00Var = (f00) obj;
                f00Var.v0(r1, lxVar2);
                return f00Var;
            }
        }, t90Var);
    }

    @Override // m4.fp0
    public final synchronized void g(Context context) {
        this.f7526z.f6996b = false;
        c();
    }

    @Override // m4.ep0
    public final synchronized void l() {
        if (this.y.compareAndSet(false, true)) {
            this.f7520s.a(this);
            c();
        }
    }

    @Override // m4.fp0
    public final synchronized void r(Context context) {
        this.f7526z.f6996b = true;
        c();
    }

    @Override // m4.fp0
    public final synchronized void s(Context context) {
        this.f7526z.f6998d = "u";
        c();
        d();
        this.A = true;
    }

    @Override // m3.p
    public final synchronized void v2() {
        this.f7526z.f6996b = false;
        c();
    }

    @Override // m3.p
    public final void w(int i10) {
    }

    @Override // m4.rh
    public final synchronized void x(qh qhVar) {
        cj0 cj0Var = this.f7526z;
        cj0Var.f6995a = qhVar.f12866j;
        cj0Var.f6999e = qhVar;
        c();
    }
}
