package m4;

/* loaded from: classes.dex */
public final class ep2 implements jp2 {

    /* renamed from: a */
    public final long[] f8031a;

    /* renamed from: b */
    public final long[] f8032b;

    /* renamed from: c */
    public final long f8033c;

    /* renamed from: d */
    public final boolean f8034d;

    public ep2(long[] jArr, long[] jArr2, long j3) {
        int length = jArr.length;
        int length2 = jArr2.length;
        r01.f(length == length2);
        boolean z10 = length2 > 0;
        this.f8034d = z10;
        if (!z10 || jArr2[0] <= 0) {
            this.f8031a = jArr;
            this.f8032b = jArr2;
        } else {
            int i10 = length2 + 1;
            long[] jArr3 = new long[i10];
            this.f8031a = jArr3;
            long[] jArr4 = new long[i10];
            this.f8032b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        }
        this.f8033c = j3;
    }

    @Override // m4.jp2
    public final long b() {
        return this.f8033c;
    }

    @Override // m4.jp2
    public final hp2 d(long j3) {
        if (!this.f8034d) {
            kp2 kp2Var = kp2.f10524c;
            return new hp2(kp2Var, kp2Var);
        }
        int p = ls1.p(this.f8032b, j3, true);
        long[] jArr = this.f8032b;
        long j10 = jArr[p];
        long[] jArr2 = this.f8031a;
        kp2 kp2Var2 = new kp2(j10, jArr2[p]);
        if (j10 == j3 || p == jArr.length - 1) {
            return new hp2(kp2Var2, kp2Var2);
        }
        int i10 = p + 1;
        return new hp2(kp2Var2, new kp2(jArr[i10], jArr2[i10]));
    }

    @Override // m4.jp2
    public final boolean f() {
        return this.f8034d;
    }
}
