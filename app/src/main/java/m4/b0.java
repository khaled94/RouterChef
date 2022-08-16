package m4;

/* loaded from: classes.dex */
public final class b0 implements a0 {

    /* renamed from: a */
    public final long[] f6306a;

    /* renamed from: b */
    public final long[] f6307b;

    /* renamed from: c */
    public final long f6308c;

    /* renamed from: d */
    public final long f6309d;

    public b0(long[] jArr, long[] jArr2, long j3, long j10) {
        this.f6306a = jArr;
        this.f6307b = jArr2;
        this.f6308c = j3;
        this.f6309d = j10;
    }

    @Override // m4.a0
    public final long a() {
        return this.f6309d;
    }

    @Override // m4.jp2
    public final long b() {
        return this.f6308c;
    }

    @Override // m4.jp2
    public final hp2 d(long j3) {
        int p = ls1.p(this.f6306a, j3, true);
        long[] jArr = this.f6306a;
        long j10 = jArr[p];
        long[] jArr2 = this.f6307b;
        kp2 kp2Var = new kp2(j10, jArr2[p]);
        if (j10 >= j3 || p == jArr.length - 1) {
            return new hp2(kp2Var, kp2Var);
        }
        int i10 = p + 1;
        return new hp2(kp2Var, new kp2(jArr[i10], jArr2[i10]));
    }

    @Override // m4.jp2
    public final boolean f() {
        return true;
    }

    @Override // m4.a0
    public final long i(long j3) {
        return this.f6306a[ls1.p(this.f6307b, j3, true)];
    }
}
