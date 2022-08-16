package m4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class hk2 implements tj2, sj2 {

    /* renamed from: s */
    public final tj2 f9369s;

    /* renamed from: t */
    public final long f9370t;

    /* renamed from: u */
    public sj2 f9371u;

    public hk2(tj2 tj2Var, long j3) {
        this.f9369s = tj2Var;
        this.f9370t = j3;
    }

    @Override // m4.tj2, m4.al2
    public final long a() {
        long a10 = this.f9369s.a();
        if (a10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return a10 + this.f9370t;
    }

    @Override // m4.tj2, m4.al2
    public final boolean b(long j3) {
        return this.f9369s.b(j3 - this.f9370t);
    }

    @Override // m4.tj2, m4.al2
    public final long c() {
        long c10 = this.f9369s.c();
        if (c10 == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return c10 + this.f9370t;
    }

    @Override // m4.tj2
    public final s70 d() {
        return this.f9369s.d();
    }

    @Override // m4.tj2, m4.al2
    public final void e(long j3) {
        this.f9369s.e(j3 - this.f9370t);
    }

    @Override // m4.tj2
    public final long f(long j3, hf2 hf2Var) {
        return this.f9369s.f(j3 - this.f9370t, hf2Var) + this.f9370t;
    }

    @Override // m4.tj2
    public final long g() {
        long g10 = this.f9369s.g();
        if (g10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return g10 + this.f9370t;
    }

    @Override // m4.sj2
    public final void h(tj2 tj2Var) {
        sj2 sj2Var = this.f9371u;
        Objects.requireNonNull(sj2Var);
        sj2Var.h(this);
    }

    @Override // m4.tj2
    public final void i() {
        this.f9369s.i();
    }

    @Override // m4.tj2
    public final long j(long j3) {
        return this.f9369s.j(j3 - this.f9370t) + this.f9370t;
    }

    @Override // m4.tj2, m4.al2
    public final boolean k() {
        return this.f9369s.k();
    }

    @Override // m4.sj2
    public final /* bridge */ /* synthetic */ void l(al2 al2Var) {
        tj2 tj2Var = (tj2) al2Var;
        sj2 sj2Var = this.f9371u;
        Objects.requireNonNull(sj2Var);
        sj2Var.l(this);
    }

    @Override // m4.tj2
    public final void m(sj2 sj2Var, long j3) {
        this.f9371u = sj2Var;
        this.f9369s.m(this, j3 - this.f9370t);
    }

    @Override // m4.tj2
    public final void n(long j3) {
        this.f9369s.n(j3 - this.f9370t);
    }

    @Override // m4.tj2
    public final long o(kl2[] kl2VarArr, boolean[] zArr, zk2[] zk2VarArr, boolean[] zArr2, long j3) {
        zk2[] zk2VarArr2 = new zk2[zk2VarArr.length];
        int i10 = 0;
        while (true) {
            zk2 zk2Var = null;
            if (i10 >= zk2VarArr.length) {
                break;
            }
            ik2 ik2Var = (ik2) zk2VarArr[i10];
            if (ik2Var != null) {
                zk2Var = ik2Var.f9682a;
            }
            zk2VarArr2[i10] = zk2Var;
            i10++;
        }
        long o10 = this.f9369s.o(kl2VarArr, zArr, zk2VarArr2, zArr2, j3 - this.f9370t);
        for (int i11 = 0; i11 < zk2VarArr.length; i11++) {
            zk2 zk2Var2 = zk2VarArr2[i11];
            if (zk2Var2 == null) {
                zk2VarArr[i11] = null;
            } else {
                zk2 zk2Var3 = zk2VarArr[i11];
                if (zk2Var3 == null || ((ik2) zk2Var3).f9682a != zk2Var2) {
                    zk2VarArr[i11] = new ik2(zk2Var2, this.f9370t);
                }
            }
        }
        return o10 + this.f9370t;
    }
}
