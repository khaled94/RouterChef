package m4;

/* loaded from: classes.dex */
public final class a1 implements jp2 {

    /* renamed from: a */
    public final /* synthetic */ b1 f6002a;

    @Override // m4.jp2
    public final long b() {
        b1 b1Var = this.f6002a;
        return (b1Var.f6319x * 1000000) / b1Var.f6317v.f9791i;
    }

    @Override // m4.jp2
    public final hp2 d(long j3) {
        long d5 = this.f6002a.f6317v.d(j3);
        b1 b1Var = this.f6002a;
        long j10 = b1Var.f6315t;
        long j11 = b1Var.f6316u;
        kp2 kp2Var = new kp2(j3, ls1.u((-30000) + (((j11 - j10) * d5) / b1Var.f6319x) + j10, j10, (-1) + j11));
        return new hp2(kp2Var, kp2Var);
    }

    @Override // m4.jp2
    public final boolean f() {
        return true;
    }
}
