package m4;

/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: a */
    public int f8698a;

    /* renamed from: b */
    public long f8699b;

    /* renamed from: c */
    public int f8700c;

    /* renamed from: d */
    public int f8701d;

    /* renamed from: e */
    public int f8702e;

    /* renamed from: f */
    public final int[] f8703f = new int[255];

    /* renamed from: g */
    public final dd f8704g = new dd(255);

    public final void a() {
        this.f8698a = 0;
        this.f8699b = 0L;
        this.f8700c = 0;
        this.f8701d = 0;
        this.f8702e = 0;
    }

    public final boolean b(uo2 uo2Var, boolean z10) {
        a();
        this.f8704g.e(27);
        if (wo2.g(uo2Var, (byte[]) this.f8704g.f7311d, 27, z10) && this.f8704g.w() == 1332176723) {
            if (this.f8704g.q() != 0) {
                if (!z10) {
                    throw mq.b("unsupported bit stream revision");
                }
                return false;
            }
            this.f8698a = this.f8704g.q();
            dd ddVar = this.f8704g;
            byte[] bArr = (byte[]) ddVar.f7311d;
            int i10 = ddVar.f7309b;
            int i11 = i10 + 1;
            ddVar.f7309b = i11;
            byte b10 = bArr[i10];
            int i12 = i11 + 1;
            ddVar.f7309b = i12;
            byte b11 = bArr[i11];
            int i13 = i12 + 1;
            ddVar.f7309b = i13;
            byte b12 = bArr[i12];
            int i14 = i13 + 1;
            ddVar.f7309b = i14;
            byte b13 = bArr[i13];
            int i15 = i14 + 1;
            ddVar.f7309b = i15;
            byte b14 = bArr[i14];
            int i16 = i15 + 1;
            ddVar.f7309b = i16;
            byte b15 = bArr[i15];
            int i17 = i16 + 1;
            ddVar.f7309b = i17;
            byte b16 = bArr[i16];
            ddVar.f7309b = i17 + 1;
            this.f8699b = ((b11 & 255) << 8) | (b10 & 255) | ((b12 & 255) << 16) | ((b13 & 255) << 24) | ((b14 & 255) << 32) | ((b15 & 255) << 40) | ((b16 & 255) << 48) | ((bArr[i17] & 255) << 56);
            ddVar.u();
            this.f8704g.u();
            this.f8704g.u();
            int q10 = this.f8704g.q();
            this.f8700c = q10;
            this.f8701d = q10 + 27;
            this.f8704g.e(q10);
            if (wo2.g(uo2Var, (byte[]) this.f8704g.f7311d, this.f8700c, z10)) {
                for (int i18 = 0; i18 < this.f8700c; i18++) {
                    this.f8703f[i18] = this.f8704g.q();
                    this.f8702e += this.f8703f[i18];
                }
                return true;
            }
        }
        return false;
    }

    public final boolean c(uo2 uo2Var, long j3) {
        int i10;
        r01.f(uo2Var.b() == uo2Var.g());
        this.f8704g.e(4);
        while (true) {
            i10 = (j3 > (-1L) ? 1 : (j3 == (-1L) ? 0 : -1));
            if ((i10 == 0 || uo2Var.b() + 4 < j3) && wo2.g(uo2Var, (byte[]) this.f8704g.f7311d, 4, true)) {
                this.f8704g.h(0);
                if (this.f8704g.w() == 1332176723) {
                    uo2Var.i();
                    return true;
                }
                ((qo2) uo2Var).q(1);
            }
        }
        do {
            if (i10 != 0 && uo2Var.b() >= j3) {
                break;
            }
        } while (uo2Var.a() != -1);
        return false;
    }
}
