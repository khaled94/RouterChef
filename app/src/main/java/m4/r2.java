package m4;

/* loaded from: classes.dex */
public final class r2 implements b3 {

    /* renamed from: a */
    public final q2 f13118a;

    /* renamed from: b */
    public final dd f13119b = new dd(32);

    /* renamed from: c */
    public int f13120c;

    /* renamed from: d */
    public int f13121d;

    /* renamed from: e */
    public boolean f13122e;

    /* renamed from: f */
    public boolean f13123f;

    public r2(q2 q2Var) {
        this.f13118a = q2Var;
    }

    @Override // m4.b3
    public final void a(dd ddVar, int i10) {
        int i11 = i10 & 1;
        int q10 = i11 != 0 ? ddVar.f7309b + ddVar.q() : -1;
        if (this.f13123f) {
            if (i11 == 0) {
                return;
            }
            this.f13123f = false;
            ddVar.h(q10);
            this.f13121d = 0;
        }
        while (ddVar.zza() > 0) {
            int i12 = this.f13121d;
            if (i12 < 3) {
                if (i12 == 0) {
                    int q11 = ddVar.q();
                    ddVar.h(ddVar.f7309b - 1);
                    if (q11 == 255) {
                        this.f13123f = true;
                        return;
                    }
                }
                int min = Math.min(ddVar.zza(), 3 - this.f13121d);
                ddVar.d((byte[]) this.f13119b.f7311d, this.f13121d, min);
                int i13 = this.f13121d + min;
                this.f13121d = i13;
                if (i13 == 3) {
                    this.f13119b.h(0);
                    this.f13119b.g(3);
                    this.f13119b.i(1);
                    int q12 = this.f13119b.q();
                    int q13 = this.f13119b.q();
                    this.f13122e = (q12 & 128) != 0;
                    this.f13120c = (((q12 & 15) << 8) | q13) + 3;
                    int a10 = this.f13119b.a();
                    int i14 = this.f13120c;
                    if (a10 < i14) {
                        int a11 = this.f13119b.a();
                        this.f13119b.D(Math.min(4098, Math.max(i14, a11 + a11)));
                    }
                }
            } else {
                int min2 = Math.min(ddVar.zza(), this.f13120c - this.f13121d);
                ddVar.d((byte[]) this.f13119b.f7311d, this.f13121d, min2);
                int i15 = this.f13121d + min2;
                this.f13121d = i15;
                int i16 = this.f13120c;
                if (i15 != i16) {
                    continue;
                } else {
                    if (this.f13122e) {
                        byte[] bArr = (byte[]) this.f13119b.f7311d;
                        int i17 = ls1.f10971a;
                        int i18 = -1;
                        for (int i19 = 0; i19 < i16; i19++) {
                            i18 = ls1.f10980j[(i18 >>> 24) ^ (bArr[i19] & 255)] ^ (i18 << 8);
                        }
                        if (i18 != 0) {
                            this.f13123f = true;
                            return;
                        }
                        this.f13119b.g(this.f13120c - 4);
                    } else {
                        this.f13119b.g(i16);
                    }
                    this.f13119b.h(0);
                    this.f13118a.d(this.f13119b);
                    this.f13121d = 0;
                }
            }
        }
    }

    @Override // m4.b3
    public final void b(eq1 eq1Var, vo2 vo2Var, a3 a3Var) {
        this.f13118a.b(eq1Var, vo2Var, a3Var);
        this.f13123f = true;
    }

    @Override // m4.b3
    public final void c() {
        this.f13123f = true;
    }
}
