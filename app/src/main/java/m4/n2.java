package m4;

/* loaded from: classes.dex */
public final class n2 {

    /* renamed from: c */
    public boolean f11397c;

    /* renamed from: d */
    public boolean f11398d;

    /* renamed from: e */
    public boolean f11399e;

    /* renamed from: a */
    public final eq1 f11395a = new eq1();

    /* renamed from: f */
    public long f11400f = -9223372036854775807L;

    /* renamed from: g */
    public long f11401g = -9223372036854775807L;

    /* renamed from: h */
    public long f11402h = -9223372036854775807L;

    /* renamed from: b */
    public final dd f11396b = new dd();

    public static long a(dd ddVar) {
        int i10 = ddVar.f7309b;
        if (ddVar.zza() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        ddVar.d(bArr, 0, 9);
        ddVar.h(i10);
        if ((bArr[0] & 196) != 68 || (bArr[2] & 4) != 4 || (bArr[4] & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j3 = bArr[0];
        byte b10 = bArr[1];
        long j10 = bArr[2];
        return ((bArr[3] & 255) << 5) | ((j3 & 3) << 28) | (((56 & j3) >> 3) << 30) | ((b10 & 255) << 20) | (((j10 & 248) >> 3) << 15) | ((j10 & 3) << 13) | ((bArr[4] & 248) >> 3);
    }

    public static final int c(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public final void b(uo2 uo2Var) {
        dd ddVar = this.f11396b;
        byte[] bArr = ls1.f10976f;
        int length = bArr.length;
        ddVar.f(bArr, 0);
        this.f11397c = true;
        uo2Var.i();
    }
}
