package m4;

import g1.l;

/* loaded from: classes.dex */
public final class ik2 implements zk2 {

    /* renamed from: a */
    public final zk2 f9682a;

    /* renamed from: b */
    public final long f9683b;

    public ik2(zk2 zk2Var, long j3) {
        this.f9682a = zk2Var;
        this.f9683b = j3;
    }

    @Override // m4.zk2
    public final int a(long j3) {
        return this.f9682a.a(j3 - this.f9683b);
    }

    @Override // m4.zk2
    public final boolean b() {
        return this.f9682a.b();
    }

    @Override // m4.zk2
    public final int c(l lVar, il0 il0Var, int i10) {
        int c10 = this.f9682a.c(lVar, il0Var, i10);
        if (c10 == -4) {
            il0Var.f9688e = Math.max(0L, il0Var.f9688e + this.f9683b);
            return -4;
        }
        return c10;
    }

    @Override // m4.zk2
    public final void g() {
        this.f9682a.g();
    }
}
