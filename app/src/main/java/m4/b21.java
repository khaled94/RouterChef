package m4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class b21 extends r60 {

    /* renamed from: s */
    public final /* synthetic */ c21 f6344s;

    public b21(c21 c21Var) {
        this.f6344s = c21Var;
    }

    @Override // m4.s60
    public final void b() {
        c21 c21Var = this.f6344s;
        fk0 fk0Var = c21Var.f6699b;
        long j3 = c21Var.f6698a;
        Objects.requireNonNull(fk0Var);
        t11 t11Var = new t11("rewarded");
        t11Var.f13896a = Long.valueOf(j3);
        t11Var.f13898c = "onAdClicked";
        fk0Var.n(t11Var);
    }

    @Override // m4.s60
    public final void c3(cn cnVar) {
        c21 c21Var = this.f6344s;
        c21Var.f6699b.l(c21Var.f6698a, cnVar.f7067s);
    }

    @Override // m4.s60
    public final void d() {
        c21 c21Var = this.f6344s;
        fk0 fk0Var = c21Var.f6699b;
        long j3 = c21Var.f6698a;
        Objects.requireNonNull(fk0Var);
        t11 t11Var = new t11("rewarded");
        t11Var.f13896a = Long.valueOf(j3);
        t11Var.f13898c = "onAdImpression";
        fk0Var.n(t11Var);
    }

    @Override // m4.s60
    public final void e() {
        c21 c21Var = this.f6344s;
        fk0 fk0Var = c21Var.f6699b;
        long j3 = c21Var.f6698a;
        Objects.requireNonNull(fk0Var);
        t11 t11Var = new t11("rewarded");
        t11Var.f13896a = Long.valueOf(j3);
        t11Var.f13898c = "onRewardedAdClosed";
        fk0Var.n(t11Var);
    }

    @Override // m4.s60
    public final void i() {
        c21 c21Var = this.f6344s;
        fk0 fk0Var = c21Var.f6699b;
        long j3 = c21Var.f6698a;
        Objects.requireNonNull(fk0Var);
        t11 t11Var = new t11("rewarded");
        t11Var.f13896a = Long.valueOf(j3);
        t11Var.f13898c = "onRewardedAdOpened";
        fk0Var.n(t11Var);
    }

    @Override // m4.s60
    public final void i3(n60 n60Var) {
        c21 c21Var = this.f6344s;
        fk0 fk0Var = c21Var.f6699b;
        long j3 = c21Var.f6698a;
        Objects.requireNonNull(fk0Var);
        t11 t11Var = new t11("rewarded");
        t11Var.f13896a = Long.valueOf(j3);
        t11Var.f13898c = "onUserEarnedReward";
        t11Var.f13900e = n60Var.d();
        t11Var.f13901f = Integer.valueOf(n60Var.b());
        fk0Var.n(t11Var);
    }

    @Override // m4.s60
    public final void q0(int i10) {
        c21 c21Var = this.f6344s;
        c21Var.f6699b.l(c21Var.f6698a, i10);
    }
}
