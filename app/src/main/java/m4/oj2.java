package m4;

import java.io.IOException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class oj2 implements tj2, sj2 {

    /* renamed from: s */
    public final uj2 f12179s;

    /* renamed from: t */
    public final long f12180t;

    /* renamed from: u */
    public xj2 f12181u;

    /* renamed from: v */
    public tj2 f12182v;

    /* renamed from: w */
    public sj2 f12183w;

    /* renamed from: x */
    public long f12184x = -9223372036854775807L;
    public final pm2 y;

    public oj2(uj2 uj2Var, pm2 pm2Var, long j3) {
        this.f12179s = uj2Var;
        this.y = pm2Var;
        this.f12180t = j3;
    }

    @Override // m4.tj2, m4.al2
    public final long a() {
        tj2 tj2Var = this.f12182v;
        int i10 = ls1.f10971a;
        return tj2Var.a();
    }

    @Override // m4.tj2, m4.al2
    public final boolean b(long j3) {
        tj2 tj2Var = this.f12182v;
        return tj2Var != null && tj2Var.b(j3);
    }

    @Override // m4.tj2, m4.al2
    public final long c() {
        tj2 tj2Var = this.f12182v;
        int i10 = ls1.f10971a;
        return tj2Var.c();
    }

    @Override // m4.tj2
    public final s70 d() {
        tj2 tj2Var = this.f12182v;
        int i10 = ls1.f10971a;
        return tj2Var.d();
    }

    @Override // m4.tj2, m4.al2
    public final void e(long j3) {
        tj2 tj2Var = this.f12182v;
        int i10 = ls1.f10971a;
        tj2Var.e(j3);
    }

    @Override // m4.tj2
    public final long f(long j3, hf2 hf2Var) {
        tj2 tj2Var = this.f12182v;
        int i10 = ls1.f10971a;
        return tj2Var.f(j3, hf2Var);
    }

    @Override // m4.tj2
    public final long g() {
        tj2 tj2Var = this.f12182v;
        int i10 = ls1.f10971a;
        return tj2Var.g();
    }

    @Override // m4.sj2
    public final void h(tj2 tj2Var) {
        sj2 sj2Var = this.f12183w;
        int i10 = ls1.f10971a;
        sj2Var.h(this);
    }

    @Override // m4.tj2
    public final void i() {
        try {
            tj2 tj2Var = this.f12182v;
            if (tj2Var != null) {
                tj2Var.i();
                return;
            }
            xj2 xj2Var = this.f12181u;
            if (xj2Var == null) {
                return;
            }
            xj2Var.q();
        } catch (IOException e10) {
            throw e10;
        }
    }

    @Override // m4.tj2
    public final long j(long j3) {
        tj2 tj2Var = this.f12182v;
        int i10 = ls1.f10971a;
        return tj2Var.j(j3);
    }

    @Override // m4.tj2, m4.al2
    public final boolean k() {
        tj2 tj2Var = this.f12182v;
        return tj2Var != null && tj2Var.k();
    }

    @Override // m4.sj2
    public final /* bridge */ /* synthetic */ void l(al2 al2Var) {
        tj2 tj2Var = (tj2) al2Var;
        sj2 sj2Var = this.f12183w;
        int i10 = ls1.f10971a;
        sj2Var.l(this);
    }

    @Override // m4.tj2
    public final void m(sj2 sj2Var, long j3) {
        this.f12183w = sj2Var;
        tj2 tj2Var = this.f12182v;
        if (tj2Var != null) {
            long j10 = this.f12180t;
            long j11 = this.f12184x;
            if (j11 != -9223372036854775807L) {
                j10 = j11;
            }
            tj2Var.m(this, j10);
        }
    }

    @Override // m4.tj2
    public final void n(long j3) {
        tj2 tj2Var = this.f12182v;
        int i10 = ls1.f10971a;
        tj2Var.n(j3);
    }

    @Override // m4.tj2
    public final long o(kl2[] kl2VarArr, boolean[] zArr, zk2[] zk2VarArr, boolean[] zArr2, long j3) {
        long j10;
        long j11 = this.f12184x;
        if (j11 == -9223372036854775807L || j3 != this.f12180t) {
            j10 = j3;
        } else {
            this.f12184x = -9223372036854775807L;
            j10 = j11;
        }
        tj2 tj2Var = this.f12182v;
        int i10 = ls1.f10971a;
        return tj2Var.o(kl2VarArr, zArr, zk2VarArr, zArr2, j10);
    }

    public final void p(uj2 uj2Var) {
        long j3 = this.f12180t;
        long j10 = this.f12184x;
        if (j10 != -9223372036854775807L) {
            j3 = j10;
        }
        xj2 xj2Var = this.f12181u;
        Objects.requireNonNull(xj2Var);
        tj2 i10 = xj2Var.i(uj2Var, this.y, j3);
        this.f12182v = i10;
        if (this.f12183w != null) {
            i10.m(this, j3);
        }
    }
}
