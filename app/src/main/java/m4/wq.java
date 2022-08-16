package m4;

import c5.d;
import c5.i;

/* loaded from: classes.dex */
public final /* synthetic */ class wq implements z90, kz1, rk1, ar0, d, m02, v91 {

    /* renamed from: s */
    public final /* synthetic */ int f15087s;

    /* renamed from: t */
    public final Object f15088t;

    public /* synthetic */ wq(Object obj, int i10) {
        this.f15087s = i10;
        this.f15088t = obj;
    }

    @Override // m4.kz1
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Void r22 = (Void) obj;
        d70.f7232l.remove((tz1) this.f15088t);
    }

    @Override // c5.d
    public final void c(i iVar) {
        a02 a02Var = (a02) this.f15088t;
        if (iVar.l()) {
            a02Var.cancel(false);
        } else if (iVar.n()) {
            a02Var.l(iVar.j());
        } else {
            Exception i10 = iVar.i();
            if (i10 == null) {
                throw new IllegalStateException();
            }
            a02Var.m(i10);
        }
    }

    @Override // m4.kz1
    public final void f(Throwable th) {
        d70.f7232l.remove((tz1) this.f15088t);
    }

    @Override // m4.z90, m4.ar0, m4.ko1
    /* renamed from: h */
    public final void mo30h(Object obj) {
        switch (this.f15087s) {
            case 1:
                ((w90) this.f15088t).a((f00) obj);
                return;
            case 2:
            default:
                ze2 ze2Var = (ze2) this.f15088t;
                ((rx) obj).w0(ze2Var.f16176l, ze2Var.f16169e);
                return;
            case 3:
                ((gq) obj).I2((qn) this.f15088t);
                return;
            case 4:
                mo1 mo1Var = (mo1) this.f15088t;
                ((ap1) obj).b((wo1) mo1Var.f11264s, mo1Var.f11265t);
                return;
        }
    }

    public wq(tz1 tz1Var) {
        this.f15087s = 2;
        this.f15088t = tz1Var;
    }
}
