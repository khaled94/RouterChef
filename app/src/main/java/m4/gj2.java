package m4;

import java.util.Objects;

/* loaded from: classes.dex */
public final class gj2 implements tj2, sj2 {

    /* renamed from: s */
    public final tj2 f8951s;

    /* renamed from: t */
    public sj2 f8952t;

    /* renamed from: u */
    public fj2[] f8953u = new fj2[0];

    /* renamed from: v */
    public long f8954v = 0;

    /* renamed from: w */
    public long f8955w;

    public gj2(tj2 tj2Var, long j3) {
        this.f8951s = tj2Var;
        this.f8955w = j3;
    }

    @Override // m4.tj2, m4.al2
    public final long a() {
        long a10 = this.f8951s.a();
        if (a10 != Long.MIN_VALUE) {
            long j3 = this.f8955w;
            if (j3 == Long.MIN_VALUE || a10 < j3) {
                return a10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // m4.tj2, m4.al2
    public final boolean b(long j3) {
        return this.f8951s.b(j3);
    }

    @Override // m4.tj2, m4.al2
    public final long c() {
        long c10 = this.f8951s.c();
        if (c10 != Long.MIN_VALUE) {
            long j3 = this.f8955w;
            if (j3 == Long.MIN_VALUE || c10 < j3) {
                return c10;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // m4.tj2
    public final s70 d() {
        return this.f8951s.d();
    }

    @Override // m4.tj2, m4.al2
    public final void e(long j3) {
        this.f8951s.e(j3);
    }

    @Override // m4.tj2
    public final long f(long j3, hf2 hf2Var) {
        if (j3 != 0) {
            long u10 = ls1.u(hf2Var.f9227a, 0L, j3);
            long j10 = hf2Var.f9228b;
            long j11 = this.f8955w;
            long u11 = ls1.u(j10, 0L, j11 == Long.MIN_VALUE ? Long.MAX_VALUE : j11 - j3);
            if (u10 != hf2Var.f9227a || u11 != hf2Var.f9228b) {
                hf2Var = new hf2(u10, u11);
            }
            return this.f8951s.f(j3, hf2Var);
        }
        return 0L;
    }

    @Override // m4.tj2
    public final long g() {
        if (p()) {
            long j3 = this.f8954v;
            this.f8954v = -9223372036854775807L;
            long g10 = g();
            return g10 != -9223372036854775807L ? g10 : j3;
        }
        long g11 = this.f8951s.g();
        if (g11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z10 = false;
        r01.h(g11 >= 0);
        long j10 = this.f8955w;
        if (j10 == Long.MIN_VALUE || g11 <= j10) {
            z10 = true;
        }
        r01.h(z10);
        return g11;
    }

    @Override // m4.sj2
    public final void h(tj2 tj2Var) {
        sj2 sj2Var = this.f8952t;
        Objects.requireNonNull(sj2Var);
        sj2Var.h(this);
    }

    @Override // m4.tj2
    public final void i() {
        this.f8951s.i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        if (r0 > r3) goto L17;
     */
    @Override // m4.tj2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long j(long r8) {
        /*
            r7 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.f8954v = r0
            m4.fj2[] r0 = r7.f8953u
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L17
            r4 = r0[r3]
            if (r4 == 0) goto L14
            r4.f8581b = r2
        L14:
            int r3 = r3 + 1
            goto Lc
        L17:
            m4.tj2 r0 = r7.f8951s
            long r0 = r0.j(r8)
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r9 = 1
            if (r8 == 0) goto L34
            r3 = 0
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 < 0) goto L35
            long r3 = r7.f8955w
            r5 = -9223372036854775808
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L34
            int r8 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r8 > 0) goto L35
        L34:
            r2 = r9
        L35:
            m4.r01.h(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.gj2.j(long):long");
    }

    @Override // m4.tj2, m4.al2
    public final boolean k() {
        return this.f8951s.k();
    }

    @Override // m4.sj2
    public final /* bridge */ /* synthetic */ void l(al2 al2Var) {
        tj2 tj2Var = (tj2) al2Var;
        sj2 sj2Var = this.f8952t;
        Objects.requireNonNull(sj2Var);
        sj2Var.l(this);
    }

    @Override // m4.tj2
    public final void m(sj2 sj2Var, long j3) {
        this.f8952t = sj2Var;
        this.f8951s.m(this, j3);
    }

    @Override // m4.tj2
    public final void n(long j3) {
        this.f8951s.n(j3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r4 > r6) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    @Override // m4.tj2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long o(m4.kl2[] r13, boolean[] r14, m4.zk2[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            m4.fj2[] r3 = new m4.fj2[r2]
            r0.f8953u = r3
            m4.zk2[] r2 = new m4.zk2[r2]
            r3 = 0
            r4 = r3
        Lb:
            int r5 = r1.length
            r11 = 0
            if (r4 >= r5) goto L20
            m4.fj2[] r5 = r0.f8953u
            r6 = r1[r4]
            m4.fj2 r6 = (m4.fj2) r6
            r5[r4] = r6
            if (r6 == 0) goto L1b
            m4.zk2 r11 = r6.f8580a
        L1b:
            r2[r4] = r11
            int r4 = r4 + 1
            goto Lb
        L20:
            m4.tj2 r4 = r0.f8951s
            r5 = r13
            r6 = r14
            r7 = r2
            r8 = r16
            r9 = r17
            long r4 = r4.o(r5, r6, r7, r8, r9)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.f8954v = r6
            int r6 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r6 == 0) goto L4d
            r6 = 0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 < 0) goto L4b
            long r6 = r0.f8955w
            r8 = -9223372036854775808
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 == 0) goto L4d
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 > 0) goto L4b
            goto L4d
        L4b:
            r6 = r3
            goto L4e
        L4d:
            r6 = 1
        L4e:
            m4.r01.h(r6)
        L51:
            int r6 = r1.length
            if (r3 >= r6) goto L77
            r6 = r2[r3]
            if (r6 != 0) goto L5d
            m4.fj2[] r6 = r0.f8953u
            r6[r3] = r11
            goto L6e
        L5d:
            m4.fj2[] r7 = r0.f8953u
            r8 = r7[r3]
            if (r8 == 0) goto L67
            m4.zk2 r8 = r8.f8580a
            if (r8 == r6) goto L6e
        L67:
            m4.fj2 r8 = new m4.fj2
            r8.<init>(r12, r6)
            r7[r3] = r8
        L6e:
            m4.fj2[] r6 = r0.f8953u
            r6 = r6[r3]
            r1[r3] = r6
            int r3 = r3 + 1
            goto L51
        L77:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.gj2.o(m4.kl2[], boolean[], m4.zk2[], boolean[], long):long");
    }

    public final boolean p() {
        return this.f8954v != -9223372036854775807L;
    }
}
