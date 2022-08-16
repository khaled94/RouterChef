package n3;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import l3.s;
import m4.cn;
import m4.ls1;
import m4.me0;
import m4.o02;
import m4.pg2;
import m4.pz;
import m4.qg2;
import m4.ul1;
import m4.uz1;
import y4.f1;
import y4.f4;
import y4.w2;

/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f16493s;

    /* renamed from: t */
    public final /* synthetic */ Object f16494t;

    /* renamed from: u */
    public final /* synthetic */ Object f16495u;

    public /* synthetic */ k(Object obj, Object obj2, int i10) {
        this.f16493s = i10;
        this.f16494t = obj;
        this.f16495u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16493s) {
            case 0:
                v vVar = (v) this.f16494t;
                uz1 uz1Var = (uz1) this.f16495u;
                Objects.requireNonNull(vVar);
                s sVar = s.B;
                if (!sVar.f5799m.f(vVar.f16577a, vVar.f16580d, vVar.f16581e)) {
                    sVar.f5799m.b(vVar.f16577a, vVar.f16580d, vVar.f16581e);
                    return;
                } else {
                    uz1Var.execute(new t(vVar, 0));
                    return;
                }
            case 1:
                ((pz) this.f16494t).f12652s.loadData((String) this.f16495u, "text/html", "UTF-8");
                return;
            case 2:
                ((me0) this.f16494t).f11170s.a("pubVideoCmd", (Map) this.f16495u);
                return;
            case 3:
                ((ul1) this.f16494t).f14449v.f15045d.d((cn) this.f16495u);
                return;
            case 4:
                qg2 qg2Var = ((pg2) this.f16494t).f12510b;
                int i10 = ls1.f10971a;
                qg2Var.q((o02) this.f16495u);
                return;
            default:
                synchronized (((AtomicReference) this.f16494t)) {
                    Object obj = this.f16495u;
                    ((AtomicReference) this.f16494t).set(Boolean.valueOf(((w2) ((f4) obj).f20505s).y.s(((w2) ((f4) obj).f20505s).p().l(), f1.K)));
                    ((AtomicReference) this.f16494t).notify();
                }
                return;
        }
    }

    public k(f4 f4Var, AtomicReference atomicReference) {
        this.f16493s = 5;
        this.f16495u = f4Var;
        this.f16494t = atomicReference;
    }
}
