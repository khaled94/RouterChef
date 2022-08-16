package m4;

/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a */
    public final w0 f15933a;

    /* renamed from: b */
    public final int f15934b;

    /* renamed from: c */
    public final long[] f15935c;

    /* renamed from: d */
    public final int[] f15936d;

    /* renamed from: e */
    public final int f15937e;

    /* renamed from: f */
    public final long[] f15938f;

    /* renamed from: g */
    public final int[] f15939g;

    /* renamed from: h */
    public final long f15940h;

    public z0(w0 w0Var, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j3) {
        int length = iArr.length;
        int length2 = jArr2.length;
        boolean z10 = true;
        r01.f(length == length2);
        int length3 = jArr.length;
        r01.f(length3 == length2);
        int length4 = iArr2.length;
        r01.f(length4 != length2 ? false : z10);
        this.f15933a = w0Var;
        this.f15935c = jArr;
        this.f15936d = iArr;
        this.f15937e = i10;
        this.f15938f = jArr2;
        this.f15939g = iArr2;
        this.f15940h = j3;
        this.f15934b = length3;
        if (length4 > 0) {
            int i11 = length4 - 1;
            iArr2[i11] = iArr2[i11] | 536870912;
        }
    }

    public final int a(long j3) {
        for (int p = ls1.p(this.f15938f, j3, false); p >= 0; p--) {
            if ((this.f15939g[p] & 1) != 0) {
                return p;
            }
        }
        return -1;
    }

    public final int b(long j3) {
        for (int o10 = ls1.o(this.f15938f, j3, true); o10 < this.f15938f.length; o10++) {
            if ((this.f15939g[o10] & 1) != 0) {
                return o10;
            }
        }
        return -1;
    }
}
