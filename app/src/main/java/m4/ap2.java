package m4;

/* loaded from: classes.dex */
public final class ap2 implements jp2 {

    /* renamed from: a */
    public final bp2 f6228a;

    /* renamed from: b */
    public final long f6229b;

    public ap2(bp2 bp2Var, long j3) {
        this.f6228a = bp2Var;
        this.f6229b = j3;
    }

    @Override // m4.jp2
    public final long b() {
        return this.f6228a.a();
    }

    @Override // m4.jp2
    public final hp2 d(long j3) {
        r01.d(this.f6228a.f6597k);
        bp2 bp2Var = this.f6228a;
        u8 u8Var = bp2Var.f6597k;
        long[] jArr = (long[]) u8Var.f14267s;
        long[] jArr2 = (long[]) u8Var.f14268t;
        int p = ls1.p(jArr, bp2Var.b(j3), false);
        long j10 = 0;
        long j11 = p == -1 ? 0L : jArr[p];
        if (p != -1) {
            j10 = jArr2[p];
        }
        long j12 = this.f6228a.f6591e;
        long j13 = (j11 * 1000000) / j12;
        long j14 = this.f6229b;
        kp2 kp2Var = new kp2(j13, j10 + j14);
        if (j13 == j3 || p == jArr.length - 1) {
            return new hp2(kp2Var, kp2Var);
        }
        int i10 = p + 1;
        return new hp2(kp2Var, new kp2((jArr[i10] * 1000000) / j12, j14 + jArr2[i10]));
    }

    @Override // m4.jp2
    public final boolean f() {
        return true;
    }
}
