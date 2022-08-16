package m4;

/* loaded from: classes.dex */
public class ip2 implements jp2 {

    /* renamed from: a */
    public final long f9721a;

    /* renamed from: b */
    public final hp2 f9722b;

    public ip2(long j3, long j10) {
        this.f9721a = j3;
        kp2 kp2Var = j10 == 0 ? kp2.f10524c : new kp2(0L, j10);
        this.f9722b = new hp2(kp2Var, kp2Var);
    }

    @Override // m4.jp2
    public final long b() {
        return this.f9721a;
    }

    @Override // m4.jp2
    public final hp2 d(long j3) {
        return this.f9722b;
    }

    @Override // m4.jp2
    public final boolean f() {
        return false;
    }
}
