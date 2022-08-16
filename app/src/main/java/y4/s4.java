package y4;

import android.os.RemoteException;
import d4.m;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class s4 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ AtomicReference f20721s;

    /* renamed from: t */
    public final /* synthetic */ k6 f20722t;

    /* renamed from: u */
    public final /* synthetic */ e5 f20723u;

    public s4(e5 e5Var, AtomicReference atomicReference, k6 k6Var) {
        this.f20723u = e5Var;
        this.f20721s = atomicReference;
        this.f20722t = k6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f20721s) {
            try {
            } catch (RemoteException e10) {
                ((w2) this.f20723u.f20505s).C().f20710x.b("Failed to get app instance id", e10);
            }
            if (!((w2) this.f20723u.f20505s).s().o().g()) {
                ((w2) this.f20723u.f20505s).C().C.a("Analytics storage consent denied; will not get app instance id");
                ((w2) this.f20723u.f20505s).u().t(null);
                ((w2) this.f20723u.f20505s).s().f20470x.b(null);
                this.f20721s.set(null);
                this.f20721s.notify();
                return;
            }
            e5 e5Var = this.f20723u;
            j1 j1Var = e5Var.f20389v;
            if (j1Var == null) {
                ((w2) e5Var.f20505s).C().f20710x.a("Failed to get app instance id");
                this.f20721s.notify();
                return;
            }
            m.h(this.f20722t);
            this.f20721s.set(j1Var.p2(this.f20722t));
            String str = (String) this.f20721s.get();
            if (str != null) {
                ((w2) this.f20723u.f20505s).u().t(str);
                ((w2) this.f20723u.f20505s).s().f20470x.b(str);
            }
            this.f20723u.r();
            this.f20721s.notify();
        }
    }
}
