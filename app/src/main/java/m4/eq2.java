package m4;

/* loaded from: classes.dex */
public final class eq2 implements jp2 {

    /* renamed from: a */
    public final /* synthetic */ jp2 f8039a;

    /* renamed from: b */
    public final /* synthetic */ fq2 f8040b;

    public eq2(fq2 fq2Var, jp2 jp2Var) {
        this.f8040b = fq2Var;
        this.f8039a = jp2Var;
    }

    @Override // m4.jp2
    public final long b() {
        return this.f8039a.b();
    }

    @Override // m4.jp2
    public final hp2 d(long j3) {
        hp2 d5 = this.f8039a.d(j3);
        kp2 kp2Var = d5.f9408a;
        long j10 = kp2Var.f10525a;
        long j11 = kp2Var.f10526b;
        long j12 = this.f8040b.f8624s;
        kp2 kp2Var2 = new kp2(j10, j11 + j12);
        kp2 kp2Var3 = d5.f9409b;
        return new hp2(kp2Var2, new kp2(kp2Var3.f10525a, kp2Var3.f10526b + j12));
    }

    @Override // m4.jp2
    public final boolean f() {
        return this.f8039a.f();
    }
}
