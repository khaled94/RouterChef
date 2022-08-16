package n3;

import java.util.Objects;
import l3.s;
import m4.ls1;
import m4.pg2;
import m4.pz;
import m4.qg2;
import m4.uz1;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f16520s;

    /* renamed from: t */
    public final /* synthetic */ Object f16521t;

    /* renamed from: u */
    public final /* synthetic */ Object f16522u;

    public /* synthetic */ l(Object obj, Object obj2, int i10) {
        this.f16520s = i10;
        this.f16521t = obj;
        this.f16522u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16520s) {
            case 0:
                v vVar = (v) this.f16521t;
                uz1 uz1Var = (uz1) this.f16522u;
                Objects.requireNonNull(vVar);
                s sVar = s.B;
                if (!sVar.f5799m.f(vVar.f16577a, vVar.f16580d, vVar.f16581e)) {
                    sVar.f5799m.b(vVar.f16577a, vVar.f16580d, vVar.f16581e);
                    return;
                } else {
                    uz1Var.execute(new h(vVar, 0));
                    return;
                }
            case 1:
                ((pz) this.f16521t).f12652s.loadUrl((String) this.f16522u);
                return;
            default:
                qg2 qg2Var = ((pg2) this.f16521t).f12510b;
                int i10 = ls1.f10971a;
                qg2Var.A((Exception) this.f16522u);
                return;
        }
    }
}
