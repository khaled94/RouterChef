package m4;

import l0.d;

/* loaded from: classes.dex */
public final class c3 implements d3 {

    /* renamed from: m */
    public static final int[] f6701m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n */
    public static final int[] f6702n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a */
    public final vo2 f6703a;

    /* renamed from: b */
    public final mp2 f6704b;

    /* renamed from: c */
    public final g3 f6705c;

    /* renamed from: d */
    public final int f6706d;

    /* renamed from: e */
    public final byte[] f6707e;

    /* renamed from: f */
    public final dd f6708f;

    /* renamed from: g */
    public final int f6709g;

    /* renamed from: h */
    public final t f6710h;

    /* renamed from: i */
    public int f6711i;

    /* renamed from: j */
    public long f6712j;

    /* renamed from: k */
    public int f6713k;

    /* renamed from: l */
    public long f6714l;

    public c3(vo2 vo2Var, mp2 mp2Var, g3 g3Var) {
        this.f6703a = vo2Var;
        this.f6704b = mp2Var;
        this.f6705c = g3Var;
        int max = Math.max(1, g3Var.f8721c / 10);
        this.f6709g = max;
        byte[] bArr = g3Var.f8724f;
        int length = bArr.length;
        byte b10 = bArr[0];
        byte b11 = bArr[1];
        int i10 = ((bArr[3] & 255) << 8) | (bArr[2] & 255);
        this.f6706d = i10;
        int i11 = g3Var.f8720b;
        int i12 = g3Var.f8722d;
        int i13 = (((i12 - (i11 * 4)) * 8) / (g3Var.f8723e * i11)) + 1;
        if (i10 == i13) {
            int i14 = ls1.f10971a;
            int i15 = ((max + i10) - 1) / i10;
            this.f6707e = new byte[i12 * i15];
            this.f6708f = new dd((i10 + i10) * i11 * i15);
            int i16 = g3Var.f8721c;
            int i17 = ((g3Var.f8722d * i16) * 8) / i10;
            kq2 kq2Var = new kq2();
            kq2Var.f10542j = "audio/raw";
            kq2Var.f10537e = i17;
            kq2Var.f10538f = i17;
            kq2Var.f10543k = (max + max) * i11;
            kq2Var.f10554w = g3Var.f8720b;
            kq2Var.f10555x = i16;
            kq2Var.y = 2;
            this.f6710h = new t(kq2Var);
            return;
        }
        throw mq.a(d.a(56, "Expected frames per block: ", i13, "; got: ", i10), null);
    }

    @Override // m4.d3
    public final void a(long j3) {
        this.f6711i = 0;
        this.f6712j = j3;
        this.f6713k = 0;
        this.f6714l = 0L;
    }

    @Override // m4.d3
    public final void b(int i10, long j3) {
        this.f6703a.l(new i3(this.f6705c, this.f6706d, i10, j3));
        this.f6704b.f(this.f6710h);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003f -> B:11:0x0041). Please submit an issue!!! */
    @Override // m4.d3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(m4.uo2 r20, long r21) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.c3.c(m4.uo2, long):boolean");
    }

    public final int d(int i10) {
        int i11 = this.f6705c.f8720b;
        return i10 / (i11 + i11);
    }

    public final void e(int i10) {
        long j3 = this.f6712j;
        long w10 = ls1.w(this.f6714l, 1000000L, this.f6705c.f8721c);
        int i11 = (i10 + i10) * this.f6705c.f8720b;
        this.f6704b.e(j3 + w10, 1, i11, this.f6713k - i11, null);
        this.f6714l += i10;
        this.f6713k -= i11;
    }
}
