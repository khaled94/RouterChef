package m4;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: d */
    public static final long[] f14210d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    public final byte[] f14211a = new byte[8];

    /* renamed from: b */
    public int f14212b;

    /* renamed from: c */
    public int f14213c;

    public static int a(int i10) {
        int i11 = 0;
        while (i11 < 8) {
            int i12 = ((f14210d[i11] & i10) > 0L ? 1 : ((f14210d[i11] & i10) == 0L ? 0 : -1));
            i11++;
            if (i12 != 0) {
                return i11;
            }
        }
        return -1;
    }

    public static long b(byte[] bArr, int i10, boolean z10) {
        long j3 = bArr[0] & 255;
        if (z10) {
            j3 &= ~f14210d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j3 = (j3 << 8) | (bArr[i11] & 255);
        }
        return j3;
    }

    public final long c(uo2 uo2Var, boolean z10, boolean z11, int i10) {
        if (this.f14212b == 0) {
            if (!uo2Var.n(this.f14211a, 0, 1, z10)) {
                return -1L;
            }
            int a10 = a(this.f14211a[0] & 255);
            this.f14213c = a10;
            if (a10 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f14212b = 1;
        }
        int i11 = this.f14213c;
        if (i11 > i10) {
            this.f14212b = 0;
            return -2L;
        }
        if (i11 != 1) {
            ((qo2) uo2Var).n(this.f14211a, 1, i11 - 1, false);
        }
        this.f14212b = 0;
        return b(this.f14211a, this.f14213c, z11);
    }
}
