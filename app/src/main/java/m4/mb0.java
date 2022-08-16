package m4;

import java.util.Objects;
import m3.h;
import y4.p4;

/* loaded from: classes.dex */
public final /* synthetic */ class mb0 implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f11131s;

    /* renamed from: t */
    public final /* synthetic */ Object f11132t;

    public /* synthetic */ mb0(Object obj, int i10) {
        this.f11131s = i10;
        this.f11132t = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11131s) {
            case 0:
                oa0 oa0Var = ((sb0) this.f11132t).f13581x;
                if (oa0Var == null) {
                    return;
                }
                ((ta0) oa0Var).f13971u.setVisibility(4);
                return;
            case 1:
                nj1 nj1Var = (nj1) this.f11132t;
                Objects.requireNonNull(nj1Var);
                g90 g90Var = io.f9708f.f9709a;
                if (g90.g()) {
                    nj1Var.O3(5);
                    return;
                } else {
                    nj1Var.f11805s.b().execute(new h(nj1Var, 4));
                    return;
                }
            case 2:
                ((kl1) this.f11132t).f10478v.f10911d.j();
                return;
            default:
                p4 p4Var = (p4) this.f11132t;
                p4Var.f20653w = p4Var.B;
                return;
        }
    }
}
