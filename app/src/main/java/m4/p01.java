package m4;

import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import l3.s;
import u1.a;

/* loaded from: classes.dex */
public final class p01 implements gq0, mp0, vo0, ep0, ym, zq0 {

    /* renamed from: s */
    public final wj f12357s;
    @GuardedBy("this")

    /* renamed from: t */
    public boolean f12358t = false;

    public p01(wj wjVar, @Nullable il1 il1Var) {
        this.f12357s = wjVar;
        wjVar.b(2);
        if (il1Var != null) {
            wjVar.b(1101);
        }
    }

    @Override // m4.zq0
    public final void G0(boolean z10) {
        this.f12357s.b(true != z10 ? 1106 : 1105);
    }

    @Override // m4.ym
    public final synchronized void N() {
        if (this.f12358t) {
            this.f12357s.b(8);
            return;
        }
        this.f12357s.b(7);
        this.f12358t = true;
    }

    @Override // m4.zq0
    public final void a() {
        this.f12357s.b(1109);
    }

    @Override // m4.vo0
    public final void d(cn cnVar) {
        wj wjVar;
        int i10;
        switch (cnVar.f7067s) {
            case 1:
                wjVar = this.f12357s;
                i10 = 101;
                break;
            case 2:
                wjVar = this.f12357s;
                i10 = 102;
                break;
            case 3:
                wjVar = this.f12357s;
                i10 = 5;
                break;
            case 4:
                wjVar = this.f12357s;
                i10 = 103;
                break;
            case 5:
                wjVar = this.f12357s;
                i10 = 104;
                break;
            case 6:
                wjVar = this.f12357s;
                i10 = 105;
                break;
            case 7:
                wjVar = this.f12357s;
                i10 = 106;
                break;
            default:
                wjVar = this.f12357s;
                i10 = 4;
                break;
        }
        wjVar.b(i10);
    }

    @Override // m4.mp0
    public final void j() {
        this.f12357s.b(3);
    }

    @Override // m4.ep0
    public final synchronized void l() {
        this.f12357s.b(6);
    }

    @Override // m4.gq0
    public final void l0(km1 km1Var) {
        this.f12357s.a(new hh0(km1Var));
    }

    @Override // m4.zq0
    public final void m0(kk kkVar) {
        wj wjVar = this.f12357s;
        synchronized (wjVar) {
            if (wjVar.f15033c) {
                try {
                    wjVar.f15032b.p(kkVar);
                } catch (NullPointerException e10) {
                    s.B.f5793g.g(e10, "AdMobClearcutLogger.modify");
                }
            }
        }
        this.f12357s.b(1102);
    }

    @Override // m4.zq0
    public final void r(boolean z10) {
        this.f12357s.b(true != z10 ? 1108 : 1107);
    }

    @Override // m4.zq0
    public final void v(kk kkVar) {
        this.f12357s.a(new a(kkVar));
        this.f12357s.b(1104);
    }

    @Override // m4.gq0
    public final void v0(o50 o50Var) {
    }

    @Override // m4.zq0
    public final void y0(kk kkVar) {
        this.f12357s.a(new fk0(kkVar, 6));
        this.f12357s.b(1103);
    }
}
