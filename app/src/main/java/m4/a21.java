package m4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class a21 extends u60 {

    /* renamed from: s */
    public final /* synthetic */ c21 f6026s;

    public a21(c21 c21Var) {
        this.f6026s = c21Var;
    }

    @Override // m4.v60
    public final void E(int i10) {
        c21 c21Var = this.f6026s;
        c21Var.f6699b.k(c21Var.f6698a, i10);
    }

    @Override // m4.v60
    public final void e() {
        c21 c21Var = this.f6026s;
        fk0 fk0Var = c21Var.f6699b;
        long j3 = c21Var.f6698a;
        Objects.requireNonNull(fk0Var);
        t11 t11Var = new t11("rewarded");
        t11Var.f13896a = Long.valueOf(j3);
        t11Var.f13898c = "onRewardedAdLoaded";
        fk0Var.n(t11Var);
    }

    @Override // m4.v60
    public final void t(cn cnVar) {
        c21 c21Var = this.f6026s;
        c21Var.f6699b.k(c21Var.f6698a, cnVar.f7067s);
    }
}
