package m4;

import java.util.Objects;
import n3.g1;
import n3.j0;

/* loaded from: classes.dex */
public final class ib implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f9577s;

    /* renamed from: t */
    public final /* synthetic */ Object f9578t;

    public /* synthetic */ ib(Object obj, int i10) {
        this.f9577s = i10;
        this.f9578t = obj;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.Map<java.lang.String, m4.ac1>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.Map<java.lang.String, m4.cc1>, java.util.HashMap] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9577s) {
            case 0:
                return;
            case 1:
                se seVar = (se) this.f9578t;
                if (seVar.X) {
                    return;
                }
                seVar.G.b(seVar);
                return;
            case 2:
                zo0 zo0Var = (zo0) this.f9578t;
                synchronized (zo0Var) {
                    g1.g("Timeout waiting for show call succeed to be called.");
                    zo0Var.p0(new pt0("Timeout for show call succeed."));
                    zo0Var.f16300v = true;
                }
                return;
            case 3:
                ((j41) this.f9578t).a();
                return;
            case 4:
                zb1 zb1Var = (zb1) this.f9578t;
                synchronized (zb1Var) {
                    zb1Var.f16083b.clear();
                    zb1Var.f16082a.clear();
                    zb1Var.d();
                    zb1Var.e();
                }
                return;
            default:
                pk2 pk2Var = (pk2) this.f9578t;
                if (pk2Var.f12545a0) {
                    return;
                }
                sj2 sj2Var = pk2Var.F;
                Objects.requireNonNull(sj2Var);
                sj2Var.l(pk2Var);
                return;
        }
    }

    public ib(j0 j0Var) {
        this.f9577s = 0;
        this.f9578t = j0Var;
    }
}
