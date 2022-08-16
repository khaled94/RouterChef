package m4;

/* loaded from: classes.dex */
public final class g2 implements u1 {

    /* renamed from: a */
    public final dd f8706a;

    /* renamed from: c */
    public final String f8708c;

    /* renamed from: d */
    public mp2 f8709d;

    /* renamed from: e */
    public String f8710e;

    /* renamed from: g */
    public int f8712g;

    /* renamed from: h */
    public boolean f8713h;

    /* renamed from: i */
    public boolean f8714i;

    /* renamed from: j */
    public long f8715j;

    /* renamed from: k */
    public int f8716k;

    /* renamed from: f */
    public int f8711f = 0;

    /* renamed from: b */
    public final fp2 f8707b = new fp2();

    /* renamed from: l */
    public long f8717l = -9223372036854775807L;

    public g2(String str) {
        dd ddVar = new dd(4);
        this.f8706a = ddVar;
        ((byte[]) ddVar.f7311d)[0] = -1;
        this.f8708c = str;
    }

    @Override // m4.u1
    public final void b() {
        this.f8711f = 0;
        this.f8712g = 0;
        this.f8714i = false;
        this.f8717l = -9223372036854775807L;
    }

    @Override // m4.u1
    public final void c() {
    }

    @Override // m4.u1
    public final void d(dd ddVar) {
        r01.d(this.f8709d);
        while (ddVar.zza() > 0) {
            int i10 = this.f8711f;
            if (i10 == 0) {
                byte[] bArr = (byte[]) ddVar.f7311d;
                int i11 = ddVar.f7310c;
                for (int i12 = ddVar.f7309b; i12 < i11; i12++) {
                    byte b10 = bArr[i12];
                    boolean z10 = (b10 & 255) == 255;
                    boolean z11 = this.f8714i && (b10 & 224) == 224;
                    this.f8714i = z10;
                    if (z11) {
                        ddVar.h(i12 + 1);
                        this.f8714i = false;
                        ((byte[]) this.f8706a.f7311d)[1] = bArr[i12];
                        this.f8712g = 2;
                        this.f8711f = 1;
                        break;
                        break;
                    }
                }
                ddVar.h(i11);
            } else if (i10 != 1) {
                int min = Math.min(ddVar.zza(), this.f8716k - this.f8712g);
                this.f8709d.d(ddVar, min);
                int i13 = this.f8712g + min;
                this.f8712g = i13;
                int i14 = this.f8716k;
                if (i13 >= i14) {
                    long j3 = this.f8717l;
                    if (j3 != -9223372036854775807L) {
                        this.f8709d.e(j3, 1, i14, 0, null);
                        this.f8717l += this.f8715j;
                    }
                    this.f8712g = 0;
                    this.f8711f = 0;
                }
            } else {
                int min2 = Math.min(ddVar.zza(), 4 - this.f8712g);
                ddVar.d((byte[]) this.f8706a.f7311d, this.f8712g, min2);
                int i15 = this.f8712g + min2;
                this.f8712g = i15;
                if (i15 >= 4) {
                    this.f8706a.h(0);
                    if (!this.f8707b.a(this.f8706a.l())) {
                        this.f8712g = 0;
                        this.f8711f = 1;
                        break;
                    }
                    fp2 fp2Var = this.f8707b;
                    this.f8716k = fp2Var.f8618c;
                    if (!this.f8713h) {
                        int i16 = fp2Var.f8619d;
                        this.f8715j = (fp2Var.f8622g * 1000000) / i16;
                        kq2 kq2Var = new kq2();
                        kq2Var.f10533a = this.f8710e;
                        kq2Var.f10542j = fp2Var.f8617b;
                        kq2Var.f10543k = 4096;
                        kq2Var.f10554w = fp2Var.f8620e;
                        kq2Var.f10555x = i16;
                        kq2Var.f10535c = this.f8708c;
                        this.f8709d.f(new t(kq2Var));
                        this.f8713h = true;
                    }
                    this.f8706a.h(0);
                    this.f8709d.d(this.f8706a, 4);
                    this.f8711f = 2;
                }
            }
        }
    }

    @Override // m4.u1
    public final void e(vo2 vo2Var, a3 a3Var) {
        a3Var.c();
        this.f8710e = a3Var.b();
        this.f8709d = vo2Var.p(a3Var.a(), 1);
    }

    @Override // m4.u1
    public final void f(long j3, int i10) {
        if (j3 != -9223372036854775807L) {
            this.f8717l = j3;
        }
    }
}
