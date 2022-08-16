package m4;

/* loaded from: classes.dex */
public final class wc {

    /* renamed from: d */
    public static final long[] f14929d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    public final byte[] f14930a = new byte[8];

    /* renamed from: b */
    public int f14931b;

    /* renamed from: c */
    public int f14932c;

    public static int a(int i10) {
        int i11 = 0;
        while (i11 < 8) {
            int i12 = ((f14929d[i11] & i10) > 0L ? 1 : ((f14929d[i11] & i10) == 0L ? 0 : -1));
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
            j3 &= ~f14929d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j3 = (j3 << 8) | (bArr[i11] & 255);
        }
        return j3;
    }

    public final long c(hc hcVar, boolean z10, boolean z11, int i10) {
        if (this.f14931b == 0) {
            if (!hcVar.c(this.f14930a, 0, 1, z10)) {
                return -1L;
            }
            int a10 = a(this.f14930a[0] & 255);
            this.f14932c = a10;
            if (a10 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f14931b = 1;
        }
        int i11 = this.f14932c;
        if (i11 > i10) {
            this.f14931b = 0;
            return -2L;
        }
        if (i11 != 1) {
            hcVar.c(this.f14930a, 1, i11 - 1, false);
        }
        this.f14931b = 0;
        return b(this.f14930a, this.f14932c, z11);
    }
}
