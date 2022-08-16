package m4;

/* loaded from: classes.dex */
public final class c0 implements a0 {

    /* renamed from: a */
    public final long f6670a;

    /* renamed from: b */
    public final int f6671b;

    /* renamed from: c */
    public final long f6672c;

    /* renamed from: d */
    public final long f6673d;

    /* renamed from: e */
    public final long f6674e;

    /* renamed from: f */
    public final long[] f6675f;

    public c0(long j3, int i10, long j10, long j11, long[] jArr) {
        this.f6670a = j3;
        this.f6671b = i10;
        this.f6672c = j10;
        this.f6675f = jArr;
        this.f6673d = j11;
        this.f6674e = j11 != -1 ? j3 + j11 : -1L;
    }

    @Override // m4.a0
    public final long a() {
        return this.f6674e;
    }

    @Override // m4.jp2
    public final long b() {
        return this.f6672c;
    }

    @Override // m4.jp2
    public final hp2 d(long j3) {
        long[] jArr;
        if (!f()) {
            kp2 kp2Var = new kp2(0L, this.f6670a + this.f6671b);
            return new hp2(kp2Var, kp2Var);
        }
        long u10 = ls1.u(j3, 0L, this.f6672c);
        double d5 = (u10 * 100.0d) / this.f6672c;
        double d10 = 0.0d;
        if (d5 > 0.0d) {
            if (d5 >= 100.0d) {
                d10 = 256.0d;
            } else {
                int i10 = (int) d5;
                long[] jArr2 = this.f6675f;
                r01.d(jArr2);
                double d11 = jArr2[i10];
                d10 = d11 + (((i10 == 99 ? 256.0d : jArr[i10 + 1]) - d11) * (d5 - i10));
            }
        }
        kp2 kp2Var2 = new kp2(u10, this.f6670a + ls1.u(Math.round((d10 / 256.0d) * this.f6673d), this.f6671b, this.f6673d - 1));
        return new hp2(kp2Var2, kp2Var2);
    }

    @Override // m4.jp2
    public final boolean f() {
        return this.f6675f != null;
    }

    @Override // m4.a0
    public final long i(long j3) {
        long j10 = j3 - this.f6670a;
        if (!f() || j10 <= this.f6671b) {
            return 0L;
        }
        long[] jArr = this.f6675f;
        r01.d(jArr);
        double d5 = (j10 * 256.0d) / this.f6673d;
        int p = ls1.p(jArr, (long) d5, true);
        long j11 = this.f6672c;
        long j12 = (p * j11) / 100;
        long j13 = jArr[p];
        int i10 = p + 1;
        long j14 = (j11 * i10) / 100;
        long j15 = p == 99 ? 256L : jArr[i10];
        return Math.round((j13 == j15 ? 0.0d : (d5 - j13) / (j15 - j13)) * (j14 - j12)) + j12;
    }
}
