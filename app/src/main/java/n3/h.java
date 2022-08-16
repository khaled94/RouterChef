package n3;

import a6.f;
import java.util.Objects;
import l3.s;
import m4.p7;
import m4.xc1;
import m4.zj1;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f16477s;

    /* renamed from: t */
    public final /* synthetic */ Object f16478t;

    public /* synthetic */ h(Object obj, int i10) {
        this.f16477s = i10;
        this.f16478t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16477s) {
            case 0:
                v vVar = (v) this.f16478t;
                Objects.requireNonNull(vVar);
                s.B.f5799m.a(vVar.f16577a);
                return;
            case 1:
                ((xc1) this.f16478t).f15299d.f13592c.d(f.n(4, null, null));
                return;
            default:
                zj1 zj1Var = (zj1) this.f16478t;
                zj1Var.f16251s.b().execute(new p7(zj1Var, 2));
                return;
        }
    }
}
