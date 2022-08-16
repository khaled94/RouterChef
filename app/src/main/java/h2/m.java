package h2;

import c5.b0;
import c5.g;
import c5.k;
import c5.p;
import c5.z;
import java.util.concurrent.Future;
import m4.ac;
import t4.i;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f5008s;

    /* renamed from: t */
    public final /* synthetic */ Object f5009t;

    /* renamed from: u */
    public final /* synthetic */ Object f5010u;

    public /* synthetic */ m(Object obj, Object obj2, int i10) {
        this.f5008s = i10;
        this.f5010u = obj;
        this.f5009t = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0 b0Var;
        Exception e10;
        switch (this.f5008s) {
            case 0:
                Future future = (Future) this.f5009t;
                Runnable runnable = (Runnable) this.f5010u;
                if (future.isDone() || future.isCancelled()) {
                    return;
                }
                future.cancel(true);
                i.f("BillingClient", "Async task is taking too long, cancel it!");
                if (runnable == null) {
                    return;
                }
                runnable.run();
                return;
            case 1:
                synchronized (((ac) this.f5009t)) {
                }
                return;
            case 2:
                return;
            default:
                try {
                    c5.i iVar = (c5.i) ((p) this.f5010u).f2790t.d((c5.i) this.f5009t);
                    if (iVar == null) {
                        ((p) this.f5010u).f2791u.q(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    z zVar = k.f2778b;
                    iVar.d(zVar, (p) this.f5010u);
                    iVar.c(zVar, (p) this.f5010u);
                    iVar.a(zVar, (p) this.f5010u);
                    return;
                } catch (g e11) {
                    e10 = e11;
                    if (e10.getCause() instanceof Exception) {
                        b0Var = ((p) this.f5010u).f2791u;
                        e10 = (Exception) e10.getCause();
                        b0Var.q(e10);
                        return;
                    }
                    b0Var = ((p) this.f5010u).f2791u;
                    b0Var.q(e10);
                    return;
                } catch (Exception e12) {
                    e10 = e12;
                    b0Var = ((p) this.f5010u).f2791u;
                    b0Var.q(e10);
                    return;
                }
        }
    }

    public /* synthetic */ m(Future future, Runnable runnable) {
        this.f5008s = 0;
        this.f5009t = future;
        this.f5010u = runnable;
    }
}
