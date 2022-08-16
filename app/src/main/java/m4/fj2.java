package m4;

import g1.l;
import java.util.Objects;

/* loaded from: classes.dex */
public final class fj2 implements zk2 {

    /* renamed from: a */
    public final zk2 f8580a;

    /* renamed from: b */
    public boolean f8581b;

    /* renamed from: c */
    public final /* synthetic */ gj2 f8582c;

    public fj2(gj2 gj2Var, zk2 zk2Var) {
        this.f8582c = gj2Var;
        this.f8580a = zk2Var;
    }

    @Override // m4.zk2
    public final int a(long j3) {
        if (this.f8582c.p()) {
            return -3;
        }
        return this.f8580a.a(j3);
    }

    @Override // m4.zk2
    public final boolean b() {
        return !this.f8582c.p() && this.f8580a.b();
    }

    @Override // m4.zk2
    public final int c(l lVar, il0 il0Var, int i10) {
        if (this.f8582c.p()) {
            return -3;
        }
        if (this.f8581b) {
            il0Var.f9684a = 4;
            return -4;
        }
        int c10 = this.f8580a.c(lVar, il0Var, i10);
        if (c10 != -5) {
            gj2 gj2Var = this.f8582c;
            long j3 = gj2Var.f8955w;
            if (j3 == Long.MIN_VALUE || ((c10 != -4 || il0Var.f9688e < j3) && !(c10 == -3 && gj2Var.a() == Long.MIN_VALUE && !il0Var.f9687d))) {
                return c10;
            }
            il0Var.a();
            il0Var.f9684a = 4;
            this.f8581b = true;
            return -4;
        }
        t tVar = (t) lVar.f4818s;
        Objects.requireNonNull(tVar);
        int i11 = tVar.A;
        int i12 = 0;
        if (i11 == 0) {
            if (tVar.B != 0) {
                i11 = 0;
            }
            return -5;
        }
        if (this.f8582c.f8955w == Long.MIN_VALUE) {
            i12 = tVar.B;
        }
        kq2 kq2Var = new kq2(tVar);
        kq2Var.f10556z = i11;
        kq2Var.A = i12;
        lVar.f4818s = new t(kq2Var);
        return -5;
    }

    @Override // m4.zk2
    public final void g() {
        this.f8580a.g();
    }
}
