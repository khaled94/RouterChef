package m4;

import t3.w;

/* loaded from: classes.dex */
public final class ir1 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f9731s;

    /* renamed from: t */
    public final /* synthetic */ Object f9732t;

    public /* synthetic */ ir1(Object obj, int i10) {
        this.f9731s = i10;
        this.f9732t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9731s) {
            case 0:
                w wVar = ((nr1) this.f9732t).f11907d;
                ((qr1) wVar.f18621t).a(new rr1(wVar));
                return;
            default:
                eg2 eg2Var = (eg2) this.f9732t;
                fg2 G = eg2Var.G();
                eg2Var.I(G, 1036, new o7(G, 4));
                eg2Var.f7898w.d();
                return;
        }
    }
}
