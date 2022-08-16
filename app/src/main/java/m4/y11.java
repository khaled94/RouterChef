package m4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class y11 extends oo {

    /* renamed from: s */
    public final /* synthetic */ fk0 f15569s;

    /* renamed from: t */
    public final /* synthetic */ z11 f15570t;

    public y11(z11 z11Var, fk0 fk0Var) {
        this.f15570t = z11Var;
        this.f15569s = fk0Var;
    }

    @Override // m4.po
    public final void E(int i10) {
        this.f15569s.e(this.f15570t.f15976a, i10);
    }

    @Override // m4.po
    public final void c() {
        fk0 fk0Var = this.f15569s;
        long j3 = this.f15570t.f15976a;
        Objects.requireNonNull(fk0Var);
        t11 t11Var = new t11("interstitial");
        t11Var.f13896a = Long.valueOf(j3);
        t11Var.f13898c = "onAdClicked";
        ((dy) fk0Var.f8585t).z(t11.a(t11Var));
    }

    @Override // m4.po
    public final void e() {
    }

    @Override // m4.po
    public final void f() {
    }

    @Override // m4.po
    public final void g() {
        fk0 fk0Var = this.f15569s;
        long j3 = this.f15570t.f15976a;
        Objects.requireNonNull(fk0Var);
        t11 t11Var = new t11("interstitial");
        t11Var.f13896a = Long.valueOf(j3);
        t11Var.f13898c = "onAdClosed";
        fk0Var.n(t11Var);
    }

    @Override // m4.po
    public final void h() {
        fk0 fk0Var = this.f15569s;
        long j3 = this.f15570t.f15976a;
        Objects.requireNonNull(fk0Var);
        t11 t11Var = new t11("interstitial");
        t11Var.f13896a = Long.valueOf(j3);
        t11Var.f13898c = "onAdLoaded";
        fk0Var.n(t11Var);
    }

    @Override // m4.po
    public final void i() {
        fk0 fk0Var = this.f15569s;
        long j3 = this.f15570t.f15976a;
        Objects.requireNonNull(fk0Var);
        t11 t11Var = new t11("interstitial");
        t11Var.f13896a = Long.valueOf(j3);
        t11Var.f13898c = "onAdOpened";
        fk0Var.n(t11Var);
    }

    @Override // m4.po
    public final void t(cn cnVar) {
        this.f15569s.e(this.f15570t.f15976a, cnVar.f7067s);
    }
}
