package m4;

import java.util.Objects;
import y4.h3;
import y4.p;

/* loaded from: classes.dex */
public final /* synthetic */ class pe2 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f12493s = 0;

    /* renamed from: t */
    public final /* synthetic */ Object f12494t;

    /* renamed from: u */
    public final /* synthetic */ Object f12495u;

    /* renamed from: v */
    public final /* synthetic */ Object f12496v;

    public /* synthetic */ pe2(qe2 qe2Var, dw1 dw1Var, uj2 uj2Var) {
        this.f12494t = qe2Var;
        this.f12495u = dw1Var;
        this.f12496v = uj2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12493s) {
            case 0:
                uj2 uj2Var = (uj2) this.f12496v;
                eg2 eg2Var = ((qe2) this.f12494t).f12819c;
                gw1 p = ((dw1) this.f12495u).p();
                dg2 dg2Var = eg2Var.f7896u;
                te2 te2Var = eg2Var.f7899x;
                Objects.requireNonNull(te2Var);
                Objects.requireNonNull(dg2Var);
                dg2Var.f7393b = gw1.q(p);
                if (!p.isEmpty()) {
                    dg2Var.f7396e = (uj2) ((gx1) p).get(0);
                    Objects.requireNonNull(uj2Var);
                    dg2Var.f7397f = uj2Var;
                }
                if (dg2Var.f7395d == null) {
                    dg2Var.f7395d = dg2.a(te2Var, dg2Var.f7393b, dg2Var.f7396e, dg2Var.f7392a);
                }
                dg2Var.c(te2Var.l());
                return;
            default:
                ((h3) this.f12496v).f20483s.a();
                ((h3) this.f12496v).f20483s.h((p) this.f12494t, (String) this.f12495u);
                return;
        }
    }

    public pe2(h3 h3Var, p pVar, String str) {
        this.f12496v = h3Var;
        this.f12494t = pVar;
        this.f12495u = str;
    }
}
