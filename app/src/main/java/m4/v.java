package m4;

/* loaded from: classes.dex */
public final class v implements a0, jp2 {

    /* renamed from: a */
    public final long f14538a;

    /* renamed from: b */
    public final long f14539b;

    /* renamed from: c */
    public final int f14540c;

    /* renamed from: d */
    public final long f14541d;

    /* renamed from: e */
    public final int f14542e;

    /* renamed from: f */
    public final long f14543f;

    public v(long j3, long j10, fp2 fp2Var) {
        long j11;
        int i10 = fp2Var.f8621f;
        int i11 = fp2Var.f8618c;
        this.f14538a = j3;
        this.f14539b = j10;
        this.f14540c = i11 == -1 ? 1 : i11;
        this.f14542e = i10;
        if (j3 == -1) {
            this.f14541d = -1L;
            j11 = -9223372036854775807L;
        } else {
            long j12 = j3 - j10;
            this.f14541d = j12;
            j11 = (Math.max(0L, j12) * 8000000) / i10;
        }
        this.f14543f = j11;
    }

    @Override // m4.a0
    public final long a() {
        return -1L;
    }

    @Override // m4.jp2
    public final long b() {
        return this.f14543f;
    }

    public final long c(long j3) {
        return (Math.max(0L, j3 - this.f14539b) * 8000000) / this.f14542e;
    }

    @Override // m4.jp2
    public final hp2 d(long j3) {
        long j10 = this.f14541d;
        int i10 = (j10 > (-1L) ? 1 : (j10 == (-1L) ? 0 : -1));
        if (i10 == 0) {
            kp2 kp2Var = new kp2(0L, this.f14539b);
            return new hp2(kp2Var, kp2Var);
        }
        int i11 = this.f14542e;
        long j11 = this.f14540c;
        long j12 = (((i11 * j3) / 8000000) / j11) * j11;
        if (i10 != 0) {
            j12 = Math.min(j12, j10 - j11);
        }
        long max = this.f14539b + Math.max(j12, 0L);
        long c10 = c(max);
        kp2 kp2Var2 = new kp2(c10, max);
        if (this.f14541d != -1 && c10 < j3) {
            long j13 = max + this.f14540c;
            if (j13 < this.f14538a) {
                return new hp2(kp2Var2, new kp2(c(j13), j13));
            }
        }
        return new hp2(kp2Var2, kp2Var2);
    }

    @Override // m4.jp2
    public final boolean f() {
        return this.f14541d != -1;
    }

    @Override // m4.a0
    public final long i(long j3) {
        return c(j3);
    }
}
