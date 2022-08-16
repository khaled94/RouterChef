package m4;

/* loaded from: classes.dex */
public final class jo2 implements jp2 {

    /* renamed from: a */
    public final lo2 f10150a;

    /* renamed from: b */
    public final long f10151b;

    /* renamed from: c */
    public final long f10152c;

    /* renamed from: d */
    public final long f10153d;

    /* renamed from: e */
    public final long f10154e;

    /* renamed from: f */
    public final long f10155f;

    public jo2(lo2 lo2Var, long j3, long j10, long j11, long j12, long j13) {
        this.f10150a = lo2Var;
        this.f10151b = j3;
        this.f10152c = j10;
        this.f10153d = j11;
        this.f10154e = j12;
        this.f10155f = j13;
    }

    @Override // m4.jp2
    public final long b() {
        return this.f10151b;
    }

    @Override // m4.jp2
    public final hp2 d(long j3) {
        kp2 kp2Var = new kp2(j3, ko2.a(this.f10150a.c(j3), 0L, this.f10152c, this.f10153d, this.f10154e, this.f10155f));
        return new hp2(kp2Var, kp2Var);
    }

    @Override // m4.jp2
    public final boolean f() {
        return true;
    }
}
