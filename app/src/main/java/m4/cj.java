package m4;

import a6.f;
import android.os.RemoteException;
import java.util.Objects;
import n3.g1;

/* loaded from: classes.dex */
public final class cj implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f6993s;

    /* renamed from: t */
    public final /* synthetic */ Object f6994t;

    public /* synthetic */ cj(Object obj, int i10) {
        this.f6993s = i10;
        this.f6994t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6993s) {
            case 0:
                gj.c((gj) this.f6994t);
                return;
            case 1:
                Object obj = this.f6994t;
                if (((fr) obj).f8626s == null) {
                    return;
                }
                try {
                    ((fr) obj).f8626s.E(1);
                    return;
                } catch (RemoteException e10) {
                    g1.k("Could not notify onAdFailedToLoad event.", e10);
                    return;
                }
            case 2:
                oa0 oa0Var = ((na0) this.f6994t).H;
                if (oa0Var == null) {
                    return;
                }
                ta0 ta0Var = (ta0) oa0Var;
                ta0Var.c("ended", new String[0]);
                ta0Var.b();
                return;
            case 3:
                cj.super.destroy();
                return;
            case 4:
                xn0 xn0Var = (xn0) this.f6994t;
                synchronized (xn0Var) {
                    if (!xn0Var.f15418w.isDone()) {
                        xn0Var.f15418w.l(Boolean.TRUE);
                    }
                }
                return;
            case 5:
                ((vd0) this.f6994t).destroy();
                return;
            case 6:
                Objects.requireNonNull((c01) this.f6994t);
                return;
            case 7:
                ((wc1) this.f6994t).f14939v.f15299d.f13591b.j();
                return;
            case 8:
                ((wl1) this.f6994t).f15045d.d(f.n(6, null, null));
                return;
            default:
                gp1 gp1Var = (gp1) this.f6994t;
                while (!gp1Var.f8996b.isEmpty()) {
                    gp1Var.f8995a.a(gp1Var.f8996b.remove());
                }
                return;
        }
    }
}
