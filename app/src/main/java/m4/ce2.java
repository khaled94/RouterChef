package m4;

import c5.b0;
import c5.g;
import c5.i;
import c5.o;

/* loaded from: classes.dex */
public final /* synthetic */ class ce2 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f6805s = 1;

    /* renamed from: t */
    public final /* synthetic */ Object f6806t;

    /* renamed from: u */
    public final /* synthetic */ Object f6807u;

    public ce2(o oVar, i iVar) {
        this.f6807u = oVar;
        this.f6806t = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0 b0Var;
        Exception e10;
        switch (this.f6805s) {
            case 0:
                try {
                    je2.H((cf2) this.f6807u);
                    return;
                } catch (o62 e11) {
                    x90.e("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e11);
                    throw new RuntimeException(e11);
                }
            default:
                if (((i) this.f6806t).l()) {
                    ((o) this.f6807u).f2788u.s();
                    return;
                }
                try {
                    ((o) this.f6807u).f2788u.r(((o) this.f6807u).f2787t.d((i) this.f6806t));
                    return;
                } catch (g e12) {
                    e10 = e12;
                    if (e10.getCause() instanceof Exception) {
                        b0Var = ((o) this.f6807u).f2788u;
                        e10 = (Exception) e10.getCause();
                        b0Var.q(e10);
                        return;
                    }
                    b0Var = ((o) this.f6807u).f2788u;
                    b0Var.q(e10);
                    return;
                } catch (Exception e13) {
                    e10 = e13;
                    b0Var = ((o) this.f6807u).f2788u;
                    b0Var.q(e10);
                    return;
                }
        }
    }

    public /* synthetic */ ce2(je2 je2Var, cf2 cf2Var) {
        this.f6806t = je2Var;
        this.f6807u = cf2Var;
    }
}
