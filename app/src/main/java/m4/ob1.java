package m4;

import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
public final class ob1 implements e71<ik0> {

    /* renamed from: a */
    public final Context f12080a;

    /* renamed from: b */
    public final dl0 f12081b;

    /* renamed from: c */
    public final vs f12082c;

    /* renamed from: d */
    public final uz1 f12083d;

    /* renamed from: e */
    public final zo1 f12084e;

    public ob1(Context context, dl0 dl0Var, zo1 zo1Var, uz1 uz1Var, vs vsVar) {
        this.f12080a = context;
        this.f12081b = dl0Var;
        this.f12084e = zo1Var;
        this.f12083d = uz1Var;
        this.f12082c = vsVar;
    }

    @Override // m4.e71
    public final boolean a(km1 km1Var, cm1 cm1Var) {
        gm1 gm1Var;
        return (this.f12082c == null || (gm1Var = cm1Var.f7061t) == null || gm1Var.f8966a == null) ? false : true;
    }

    @Override // m4.e71
    public final tz1<ik0> b(km1 km1Var, cm1 cm1Var) {
        jk0 a10 = this.f12081b.a(new lm0(km1Var, cm1Var, null), new lb1(new View(this.f12080a), cm1Var.f7063v.get(0)));
        lg0 lg0Var = (lg0) a10;
        mb1 mb1Var = new mb1(lg0Var.N.a(), lg0Var.Z.a(), lg0Var.f10782d0.a(), lg0Var.f10775a1.a(), lg0Var.f10809q.a());
        gm1 gm1Var = cm1Var.f7061t;
        rs rsVar = new rs(mb1Var, gm1Var.f8967b, gm1Var.f8966a);
        zo1 zo1Var = this.f12084e;
        return qo1.c(new yt0(this, rsVar, 1), this.f12083d, wo1.CUSTOM_RENDER_SYN, zo1Var).b(wo1.CUSTOM_RENDER_ACK).d(mz1.m(a10.n())).a();
    }
}
