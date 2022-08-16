package m4;

import android.util.Log;
import e1.h;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

/* loaded from: classes.dex */
public final class r1 implements u1 {

    /* renamed from: v */
    public static final byte[] f13094v = {73, 68, 51};

    /* renamed from: a */
    public final boolean f13095a;

    /* renamed from: d */
    public final String f13098d;

    /* renamed from: e */
    public String f13099e;

    /* renamed from: f */
    public mp2 f13100f;

    /* renamed from: g */
    public mp2 f13101g;

    /* renamed from: h */
    public int f13102h;

    /* renamed from: i */
    public int f13103i;

    /* renamed from: j */
    public int f13104j;

    /* renamed from: k */
    public boolean f13105k;

    /* renamed from: l */
    public boolean f13106l;

    /* renamed from: o */
    public int f13109o;
    public boolean p;

    /* renamed from: r */
    public int f13111r;

    /* renamed from: t */
    public mp2 f13113t;

    /* renamed from: u */
    public long f13114u;

    /* renamed from: b */
    public final nl1 f13096b = new nl1(new byte[7], 7);

    /* renamed from: c */
    public final dd f13097c = new dd(Arrays.copyOf(f13094v, 10));

    /* renamed from: m */
    public int f13107m = -1;

    /* renamed from: n */
    public int f13108n = -1;

    /* renamed from: q */
    public long f13110q = -9223372036854775807L;

    /* renamed from: s */
    public long f13112s = -9223372036854775807L;

    public r1(boolean z10, String str) {
        a();
        this.f13095a = z10;
        this.f13098d = str;
    }

    public static final boolean h(dd ddVar, byte[] bArr, int i10) {
        if (ddVar.zza() < i10) {
            return false;
        }
        ddVar.d(bArr, 0, i10);
        return true;
    }

    public final void a() {
        this.f13102h = 0;
        this.f13103i = 0;
        this.f13104j = 256;
    }

    @Override // m4.u1
    public final void b() {
        this.f13112s = -9223372036854775807L;
        this.f13106l = false;
        a();
    }

    @Override // m4.u1
    public final void c() {
    }

    @Override // m4.u1
    public final void d(dd ddVar) {
        int i10;
        char c10;
        boolean z10;
        int i11;
        Objects.requireNonNull(this.f13100f);
        int i12 = ls1.f10971a;
        while (ddVar.zza() > 0) {
            int i13 = this.f13102h;
            int i14 = 4;
            int i15 = 2;
            boolean z11 = false;
            if (i13 == 0) {
                byte[] bArr = (byte[]) ddVar.f7311d;
                int i16 = ddVar.f7309b;
                int i17 = ddVar.f7310c;
                while (i16 < i17) {
                    int i18 = i16 + 1;
                    int i19 = bArr[i16] & 255;
                    if (this.f13104j == 512) {
                        if ((((((byte) i19) & 255) | 65280) & 65526) == 65520 ? true : z11) {
                            if (!this.f13106l) {
                                int i20 = i18 - 2;
                                ddVar.h(i20 + 1);
                                if (h(ddVar, this.f13096b.f11826a, 1)) {
                                    this.f13096b.f(i14);
                                    int c11 = this.f13096b.c(1);
                                    int i21 = this.f13107m;
                                    if (i21 == -1 || c11 == i21) {
                                        if (this.f13108n != -1) {
                                            if (h(ddVar, this.f13096b.f11826a, 1)) {
                                                this.f13096b.f(i15);
                                                if (this.f13096b.c(i14) == this.f13108n) {
                                                    ddVar.h(i20 + 2);
                                                }
                                            }
                                        }
                                        if (h(ddVar, this.f13096b.f11826a, i14)) {
                                            this.f13096b.f(14);
                                            int c12 = this.f13096b.c(13);
                                            if (c12 >= 7) {
                                                byte[] bArr2 = (byte[]) ddVar.f7311d;
                                                int i22 = ddVar.f7310c;
                                                int i23 = i20 + c12;
                                                if (i23 < i22) {
                                                    byte b10 = bArr2[i23];
                                                    if (b10 == -1) {
                                                        int i24 = i23 + 1;
                                                        if (i24 != i22) {
                                                            if (((((bArr2[i24] & 255) | 65280) & 65526) == 65520) && ((bArr2[i24] & 8) >> 3) == c11) {
                                                            }
                                                        }
                                                    } else if (b10 == 73) {
                                                        int i25 = i23 + 1;
                                                        if (i25 != i22) {
                                                            if (bArr2[i25] == 68) {
                                                                int i26 = i23 + 2;
                                                                if (i26 != i22) {
                                                                    if (bArr2[i26] == 51) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    ddVar.h(i18);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            this.f13109o = (i19 & 8) >> 3;
                            this.f13105k = 1 == ((i19 & 1) ^ 1);
                            if (!this.f13106l) {
                                this.f13102h = 1;
                                this.f13103i = 0;
                            } else {
                                this.f13102h = 3;
                                this.f13103i = 0;
                            }
                            ddVar.h(i18);
                            break;
                            break;
                        }
                    }
                    int i27 = this.f13104j;
                    int i28 = i27 | i19;
                    if (i28 == 329) {
                        i10 = 2;
                        c10 = 3;
                        z10 = false;
                        i11 = 768;
                    } else if (i28 == 511) {
                        i10 = 2;
                        c10 = 3;
                        z10 = false;
                        i11 = 512;
                    } else if (i28 == 836) {
                        i10 = 2;
                        c10 = 3;
                        z10 = false;
                        i11 = 1024;
                    } else if (i28 == 1075) {
                        this.f13102h = 2;
                        this.f13103i = 3;
                        this.f13111r = 0;
                        this.f13097c.h(0);
                        ddVar.h(i18);
                        break;
                        break;
                    } else if (i27 != 256) {
                        this.f13104j = 256;
                        i16 = i18 - 1;
                        i14 = 4;
                        i15 = 2;
                        z11 = false;
                    } else {
                        i10 = 2;
                        c10 = 3;
                        z10 = false;
                        z11 = z10;
                        i16 = i18;
                        i15 = i10;
                        i14 = 4;
                    }
                    this.f13104j = i11;
                    z11 = z10;
                    i16 = i18;
                    i15 = i10;
                    i14 = 4;
                }
                ddVar.h(i16);
            } else if (i13 != 1) {
                if (i13 != 2) {
                    if (i13 != 3) {
                        int min = Math.min(ddVar.zza(), this.f13111r - this.f13103i);
                        this.f13113t.b(ddVar, min);
                        int i29 = this.f13103i + min;
                        this.f13103i = i29;
                        int i30 = this.f13111r;
                        if (i29 == i30) {
                            long j3 = this.f13112s;
                            if (j3 != -9223372036854775807L) {
                                this.f13113t.e(j3, 1, i30, 0, null);
                                this.f13112s += this.f13114u;
                            }
                            a();
                        }
                    } else {
                        if (g(ddVar, this.f13096b.f11826a, true != this.f13105k ? 5 : 7)) {
                            this.f13096b.f(0);
                            if (!this.p) {
                                int c13 = this.f13096b.c(2) + 1;
                                if (c13 != 2) {
                                    StringBuilder sb = new StringBuilder(61);
                                    sb.append("Detected audio object type: ");
                                    sb.append(c13);
                                    sb.append(", but assuming AAC LC.");
                                    Log.w("AdtsReader", sb.toString());
                                }
                                this.f13096b.h(5);
                                int c14 = this.f13096b.c(3);
                                int i31 = this.f13108n;
                                byte[] bArr3 = {(byte) (((i31 >> 1) & 7) | 16), (byte) (((c14 << 3) & 120) | ((i31 << 7) & 128))};
                                go2 d5 = h.d(bArr3);
                                kq2 kq2Var = new kq2();
                                kq2Var.f10533a = this.f13099e;
                                kq2Var.f10542j = "audio/mp4a-latm";
                                kq2Var.f10539g = d5.f8994c;
                                kq2Var.f10554w = d5.f8993b;
                                kq2Var.f10555x = d5.f8992a;
                                kq2Var.f10544l = Collections.singletonList(bArr3);
                                kq2Var.f10535c = this.f13098d;
                                t tVar = new t(kq2Var);
                                this.f13110q = 1024000000 / tVar.y;
                                this.f13100f.f(tVar);
                                this.p = true;
                            } else {
                                this.f13096b.h(10);
                            }
                            this.f13096b.h(4);
                            int c15 = this.f13096b.c(13) - 7;
                            if (this.f13105k) {
                                c15 -= 2;
                            }
                            mp2 mp2Var = this.f13100f;
                            long j10 = this.f13110q;
                            this.f13102h = 4;
                            this.f13103i = 0;
                            this.f13113t = mp2Var;
                            this.f13114u = j10;
                            this.f13111r = c15;
                        }
                    }
                } else if (g(ddVar, (byte[]) this.f13097c.f7311d, 10)) {
                    this.f13101g.b(this.f13097c, 10);
                    this.f13097c.h(6);
                    mp2 mp2Var2 = this.f13101g;
                    this.f13102h = 4;
                    this.f13103i = 10;
                    this.f13113t = mp2Var2;
                    this.f13114u = 0L;
                    this.f13111r = this.f13097c.p() + 10;
                }
            } else if (ddVar.zza() != 0) {
                nl1 nl1Var = this.f13096b;
                nl1Var.f11826a[0] = ((byte[]) ddVar.f7311d)[ddVar.f7309b];
                nl1Var.f(2);
                int c16 = this.f13096b.c(4);
                int i32 = this.f13108n;
                if (i32 != -1 && c16 != i32) {
                    this.f13106l = false;
                    a();
                } else {
                    if (!this.f13106l) {
                        this.f13106l = true;
                        this.f13107m = this.f13109o;
                        this.f13108n = c16;
                    }
                    this.f13102h = 3;
                    this.f13103i = 0;
                }
            }
        }
    }

    @Override // m4.u1
    public final void e(vo2 vo2Var, a3 a3Var) {
        a3Var.c();
        this.f13099e = a3Var.b();
        mp2 p = vo2Var.p(a3Var.a(), 1);
        this.f13100f = p;
        this.f13113t = p;
        if (!this.f13095a) {
            this.f13101g = new so2();
            return;
        }
        a3Var.c();
        mp2 p10 = vo2Var.p(a3Var.a(), 5);
        this.f13101g = p10;
        kq2 kq2Var = new kq2();
        kq2Var.f10533a = a3Var.b();
        kq2Var.f10542j = "application/id3";
        p10.f(new t(kq2Var));
    }

    @Override // m4.u1
    public final void f(long j3, int i10) {
        if (j3 != -9223372036854775807L) {
            this.f13112s = j3;
        }
    }

    public final boolean g(dd ddVar, byte[] bArr, int i10) {
        int min = Math.min(ddVar.zza(), i10 - this.f13103i);
        ddVar.d(bArr, this.f13103i, min);
        int i11 = this.f13103i + min;
        this.f13103i = i11;
        return i11 == i10;
    }
}
