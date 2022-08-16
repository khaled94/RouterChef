package m4;

/* loaded from: classes.dex */
public final class i3 implements jp2 {

    /* renamed from: a */
    public final g3 f9521a;

    /* renamed from: b */
    public final int f9522b;

    /* renamed from: c */
    public final long f9523c;

    /* renamed from: d */
    public final long f9524d;

    /* renamed from: e */
    public final long f9525e;

    public i3(g3 g3Var, int i10, long j3, long j10) {
        this.f9521a = g3Var;
        this.f9522b = i10;
        this.f9523c = j3;
        long j11 = (j10 - j3) / g3Var.f8722d;
        this.f9524d = j11;
        this.f9525e = c(j11);
    }

    @Override // m4.jp2
    public final long b() {
        return this.f9525e;
    }

    public final long c(long j3) {
        return ls1.w(j3 * this.f9522b, 1000000L, this.f9521a.f8721c);
    }

    @Override // m4.jp2
    public final hp2 d(long j3) {
        long u10 = ls1.u((this.f9521a.f8721c * j3) / (this.f9522b * 1000000), 0L, this.f9524d - 1);
        long j10 = this.f9523c;
        int i10 = this.f9521a.f8722d;
        long c10 = c(u10);
        kp2 kp2Var = new kp2(c10, (i10 * u10) + j10);
        if (c10 >= j3 || u10 == this.f9524d - 1) {
            return new hp2(kp2Var, kp2Var);
        }
        long j11 = u10 + 1;
        return new hp2(kp2Var, new kp2(c(j11), (j11 * this.f9521a.f8722d) + this.f9523c));
    }

    @Override // m4.jp2
    public final boolean f() {
        return true;
    }
}
