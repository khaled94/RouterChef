package m4;

/* loaded from: classes.dex */
public final class c1 implements h1 {

    /* renamed from: s */
    public final bp2 f6676s;

    /* renamed from: t */
    public final u8 f6677t;

    /* renamed from: u */
    public long f6678u = -1;

    /* renamed from: v */
    public long f6679v = -1;

    public c1(bp2 bp2Var, u8 u8Var) {
        this.f6676s = bp2Var;
        this.f6677t = u8Var;
    }

    @Override // m4.h1
    public final jp2 b() {
        r01.h(this.f6678u != -1);
        return new ap2(this.f6676s, this.f6678u);
    }

    @Override // m4.h1
    public final long c(uo2 uo2Var) {
        long j3 = this.f6679v;
        if (j3 >= 0) {
            this.f6679v = -1L;
            return -(j3 + 2);
        }
        return -1L;
    }

    @Override // m4.h1
    public final void d(long j3) {
        long[] jArr = (long[]) this.f6677t.f14267s;
        this.f6679v = jArr[ls1.p(jArr, j3, true)];
    }
}
