package m4;

import android.view.View;
import i3.c;
import java.util.Objects;
import l3.f;

/* loaded from: classes.dex */
public final class pb1 implements f {

    /* renamed from: s */
    public final /* synthetic */ w90 f12463s;

    /* renamed from: t */
    public final /* synthetic */ km1 f12464t;

    /* renamed from: u */
    public final /* synthetic */ cm1 f12465u;

    /* renamed from: v */
    public final /* synthetic */ ub1 f12466v;

    /* renamed from: w */
    public final /* synthetic */ qb1 f12467w;

    public pb1(qb1 qb1Var, w90 w90Var, km1 km1Var, cm1 cm1Var, ub1 ub1Var) {
        this.f12467w = qb1Var;
        this.f12463s = w90Var;
        this.f12464t = km1Var;
        this.f12465u = cm1Var;
        this.f12466v = ub1Var;
    }

    @Override // l3.f
    public final void a() {
    }

    @Override // l3.f
    public final void c() {
    }

    @Override // l3.f
    public final void d(View view) {
        w90 w90Var = this.f12463s;
        wb1 wb1Var = this.f12467w.f12762d;
        km1 km1Var = this.f12464t;
        cm1 cm1Var = this.f12465u;
        ub1 ub1Var = this.f12466v;
        Objects.requireNonNull(wb1Var);
        ys0 c10 = wb1Var.f14928a.c(new lm0(km1Var, cm1Var, null), new vb1());
        c cVar = new c(c10);
        synchronized (ub1Var) {
            ub1Var.f14330s = cVar;
        }
        w90Var.a(c10.o());
    }
}
