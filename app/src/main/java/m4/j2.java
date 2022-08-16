package m4;

import android.util.Log;

/* loaded from: classes.dex */
public final class j2 implements b3 {

    /* renamed from: a */
    public final u1 f9797a;

    /* renamed from: b */
    public final nl1 f9798b = new nl1(new byte[10], 10);

    /* renamed from: c */
    public int f9799c = 0;

    /* renamed from: d */
    public int f9800d;

    /* renamed from: e */
    public eq1 f9801e;

    /* renamed from: f */
    public boolean f9802f;

    /* renamed from: g */
    public boolean f9803g;

    /* renamed from: h */
    public boolean f9804h;

    /* renamed from: i */
    public int f9805i;

    /* renamed from: j */
    public int f9806j;

    /* renamed from: k */
    public boolean f9807k;

    public j2(u1 u1Var) {
        this.f9797a = u1Var;
    }

    @Override // m4.b3
    public final void a(dd ddVar, int i10) {
        long j3;
        int i11;
        r01.d(this.f9801e);
        int i12 = -1;
        int i13 = 2;
        if ((i10 & 1) != 0) {
            int i14 = this.f9799c;
            if (i14 != 0 && i14 != 1) {
                if (i14 != 2) {
                    int i15 = this.f9806j;
                    if (i15 != -1) {
                        StringBuilder sb = new StringBuilder(59);
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(i15);
                        sb.append(" more bytes");
                        Log.w("PesReader", sb.toString());
                    }
                    this.f9797a.c();
                } else {
                    Log.w("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            d(1);
        }
        while (ddVar.zza() > 0) {
            int i16 = this.f9799c;
            if (i16 != 0) {
                int i17 = 0;
                if (i16 == 1) {
                    if (e(ddVar, this.f9798b.f11826a, 9)) {
                        int i18 = 0;
                        this.f9798b.f(0);
                        int c10 = this.f9798b.c(24);
                        if (c10 != 1) {
                            StringBuilder sb2 = new StringBuilder(41);
                            sb2.append("Unexpected start code prefix: ");
                            sb2.append(c10);
                            Log.w("PesReader", sb2.toString());
                            i11 = -1;
                            this.f9806j = -1;
                            i13 = 2;
                        } else {
                            this.f9798b.h(8);
                            int c11 = this.f9798b.c(16);
                            this.f9798b.h(5);
                            this.f9807k = this.f9798b.i();
                            this.f9798b.h(2);
                            this.f9802f = this.f9798b.i();
                            this.f9803g = this.f9798b.i();
                            this.f9798b.h(6);
                            int c12 = this.f9798b.c(8);
                            this.f9805i = c12;
                            if (c11 != 0) {
                                int i19 = (c11 - 3) - c12;
                                this.f9806j = i19;
                                if (i19 < 0) {
                                    StringBuilder sb3 = new StringBuilder(47);
                                    sb3.append("Found negative packet payload size: ");
                                    sb3.append(i19);
                                    Log.w("PesReader", sb3.toString());
                                } else {
                                    i11 = -1;
                                    i18 = 2;
                                    i13 = 2;
                                }
                            }
                            i11 = -1;
                            this.f9806j = -1;
                            i18 = 2;
                            i13 = 2;
                        }
                        d(i18);
                    } else {
                        i11 = -1;
                        i13 = 2;
                    }
                    i12 = i11;
                } else if (i16 != i13) {
                    int zza = ddVar.zza();
                    int i20 = this.f9806j;
                    if (i20 != i12) {
                        i17 = zza - i20;
                    }
                    if (i17 > 0) {
                        zza -= i17;
                        ddVar.g(ddVar.f7309b + zza);
                    }
                    this.f9797a.d(ddVar);
                    int i21 = this.f9806j;
                    if (i21 != i12) {
                        int i22 = i21 - zza;
                        this.f9806j = i22;
                        if (i22 == 0) {
                            this.f9797a.c();
                            d(1);
                        }
                    }
                } else {
                    if (e(ddVar, this.f9798b.f11826a, Math.min(10, this.f9805i)) && e(ddVar, null, this.f9805i)) {
                        this.f9798b.f(0);
                        if (this.f9802f) {
                            this.f9798b.h(4);
                            int c13 = this.f9798b.c(3);
                            this.f9798b.h(1);
                            int c14 = this.f9798b.c(15);
                            this.f9798b.h(1);
                            long c15 = (c13 << 30) | (c14 << 15) | this.f9798b.c(15);
                            this.f9798b.h(1);
                            if (!this.f9804h && this.f9803g) {
                                this.f9798b.h(4);
                                int c16 = this.f9798b.c(3);
                                this.f9798b.h(1);
                                int c17 = this.f9798b.c(15);
                                this.f9798b.h(1);
                                int c18 = this.f9798b.c(15);
                                this.f9798b.h(1);
                                this.f9801e.b((c17 << 15) | (c16 << 30) | c18);
                                this.f9804h = true;
                            }
                            j3 = this.f9801e.b(c15);
                        } else {
                            j3 = -9223372036854775807L;
                        }
                        i10 |= true != this.f9807k ? 0 : 4;
                        this.f9797a.f(j3, i10);
                        d(3);
                        i12 = -1;
                        i13 = 2;
                    }
                }
            } else {
                ddVar.i(ddVar.zza());
            }
        }
    }

    @Override // m4.b3
    public final void b(eq1 eq1Var, vo2 vo2Var, a3 a3Var) {
        this.f9801e = eq1Var;
        this.f9797a.e(vo2Var, a3Var);
    }

    @Override // m4.b3
    public final void c() {
        this.f9799c = 0;
        this.f9800d = 0;
        this.f9804h = false;
        this.f9797a.b();
    }

    public final void d(int i10) {
        this.f9799c = i10;
        this.f9800d = 0;
    }

    public final boolean e(dd ddVar, byte[] bArr, int i10) {
        int min = Math.min(ddVar.zza(), i10 - this.f9800d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            ddVar.i(min);
        } else {
            ddVar.d(bArr, this.f9800d, min);
        }
        int i11 = this.f9800d + min;
        this.f9800d = i11;
        return i11 == i10;
    }
}
