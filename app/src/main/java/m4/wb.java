package m4;

import java.util.Arrays;
import n9.d;

/* loaded from: classes.dex */
public final class wb {

    /* renamed from: a */
    public final int f14903a;

    /* renamed from: b */
    public final int f14904b;

    /* renamed from: c */
    public final int f14905c;

    /* renamed from: d */
    public final int f14906d;

    /* renamed from: e */
    public final int f14907e;

    /* renamed from: f */
    public final short[] f14908f;

    /* renamed from: g */
    public int f14909g;

    /* renamed from: h */
    public short[] f14910h;

    /* renamed from: i */
    public int f14911i;

    /* renamed from: j */
    public short[] f14912j;

    /* renamed from: k */
    public int f14913k;

    /* renamed from: l */
    public short[] f14914l;

    /* renamed from: q */
    public int f14918q;

    /* renamed from: r */
    public int f14919r;

    /* renamed from: s */
    public int f14920s;

    /* renamed from: t */
    public int f14921t;

    /* renamed from: v */
    public int f14923v;

    /* renamed from: w */
    public int f14924w;

    /* renamed from: x */
    public int f14925x;

    /* renamed from: m */
    public int f14915m = 0;

    /* renamed from: n */
    public int f14916n = 0;

    /* renamed from: u */
    public int f14922u = 0;

    /* renamed from: o */
    public float f14917o = 1.0f;
    public float p = 1.0f;

    public wb(int i10, int i11) {
        this.f14903a = i10;
        this.f14904b = i11;
        this.f14905c = i10 / 400;
        int i12 = i10 / 65;
        this.f14906d = i12;
        int i13 = i12 + i12;
        this.f14907e = i13;
        this.f14908f = new short[i13];
        this.f14909g = i13;
        int i14 = i11 * i13;
        this.f14910h = new short[i14];
        this.f14911i = i13;
        this.f14912j = new short[i14];
        this.f14913k = i13;
        this.f14914l = new short[i14];
    }

    public static void f(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr3[i17] * i19) + ((i10 - i19) * sArr2[i18])) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    public final int a(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f14904b;
        int i14 = 1;
        int i15 = 255;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int i18 = 0;
            for (int i19 = 0; i19 < i11; i19++) {
                short s10 = sArr[i13 + i19];
                short s11 = sArr[i13 + i11 + i19];
                i18 += s10 >= s11 ? s10 - s11 : s11 - s10;
            }
            int i20 = i18 * i16;
            int i21 = i14 * i11;
            if (i20 < i21) {
                i14 = i18;
            }
            if (i20 < i21) {
                i16 = i11;
            }
            int i22 = i18 * i15;
            int i23 = i17 * i11;
            if (i22 > i23) {
                i17 = i18;
            }
            if (i22 > i23) {
                i15 = i11;
            }
            i11++;
        }
        this.f14924w = i14 / i16;
        this.f14925x = i17 / i15;
        return i16;
    }

    public final void b(short[] sArr, int i10, int i11) {
        e(i11);
        int i12 = this.f14904b;
        System.arraycopy(sArr, i10 * i12, this.f14912j, this.f14919r * i12, i12 * i11);
        this.f14919r += i11;
    }

    public final void c(short[] sArr, int i10, int i11) {
        int i12 = this.f14907e / i11;
        int i13 = this.f14904b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f14908f[i16] = (short) (i17 / i14);
        }
    }

    public final void d(int i10) {
        int i11 = this.f14918q;
        int i12 = this.f14909g;
        if (i11 + i10 > i12) {
            int i13 = (i12 / 2) + i10 + i12;
            this.f14909g = i13;
            this.f14910h = Arrays.copyOf(this.f14910h, i13 * this.f14904b);
        }
    }

    public final void e(int i10) {
        int i11 = this.f14919r;
        int i12 = this.f14911i;
        if (i11 + i10 > i12) {
            int i13 = (i12 / 2) + i10 + i12;
            this.f14911i = i13;
            this.f14912j = Arrays.copyOf(this.f14912j, i13 * this.f14904b);
        }
    }

    public final void g() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = this.f14919r;
        float f10 = this.f14917o / this.p;
        double d5 = f10;
        int i19 = 1;
        if (d5 > 1.00001d || d5 < 0.99999d) {
            int i20 = this.f14918q;
            if (i20 >= this.f14907e) {
                int i21 = 0;
                while (true) {
                    int i22 = this.f14921t;
                    if (i22 > 0) {
                        int min = Math.min(this.f14907e, i22);
                        b(this.f14910h, i21, min);
                        this.f14921t -= min;
                        i21 += min;
                    } else {
                        short[] sArr = this.f14910h;
                        int i23 = this.f14903a;
                        int i24 = i23 > 4000 ? i23 / 4000 : i19;
                        if (this.f14904b == i19 && i24 == i19) {
                            i14 = a(sArr, i21, this.f14905c, this.f14906d);
                        } else {
                            c(sArr, i21, i24);
                            int a10 = a(this.f14908f, 0, this.f14905c / i24, this.f14906d / i24);
                            if (i24 != i19) {
                                int i25 = a10 * i24;
                                int i26 = i24 * 4;
                                int i27 = i25 - i26;
                                int i28 = i25 + i26;
                                int i29 = this.f14905c;
                                if (i27 < i29) {
                                    i27 = i29;
                                }
                                int i30 = this.f14906d;
                                if (i28 > i30) {
                                    i28 = i30;
                                }
                                if (this.f14904b == i19) {
                                    i14 = a(sArr, i21, i27, i28);
                                } else {
                                    c(sArr, i21, i19);
                                    i14 = a(this.f14908f, 0, i27, i28);
                                }
                            } else {
                                i14 = a10;
                            }
                        }
                        int i31 = this.f14924w;
                        int i32 = (i31 == 0 || (i17 = this.f14922u) == 0 || this.f14925x > i31 * 3 || i31 + i31 <= this.f14923v * 3) ? i14 : i17;
                        this.f14923v = i31;
                        this.f14922u = i14;
                        if (d5 > 1.0d) {
                            short[] sArr2 = this.f14910h;
                            if (f10 >= 2.0f) {
                                i16 = (int) (i32 / ((-1.0f) + f10));
                            } else {
                                this.f14921t = (int) (((2.0f - f10) * i32) / ((-1.0f) + f10));
                                i16 = i32;
                            }
                            e(i16);
                            int i33 = i16;
                            f(i16, this.f14904b, this.f14912j, this.f14919r, sArr2, i21, sArr2, i21 + i32);
                            this.f14919r += i33;
                            i21 = i32 + i33 + i21;
                        } else {
                            int i34 = i32;
                            short[] sArr3 = this.f14910h;
                            if (f10 < 0.5f) {
                                i15 = (int) ((i34 * f10) / (1.0f - f10));
                            } else {
                                this.f14921t = (int) ((((f10 + f10) - 1.0f) * i34) / (1.0f - f10));
                                i15 = i34;
                            }
                            int i35 = i34 + i15;
                            e(i35);
                            int i36 = this.f14904b;
                            System.arraycopy(sArr3, i21 * i36, this.f14912j, this.f14919r * i36, i36 * i34);
                            f(i15, this.f14904b, this.f14912j, this.f14919r + i34, sArr3, i34 + i21, sArr3, i21);
                            this.f14919r += i35;
                            i21 += i15;
                        }
                    }
                    if (this.f14907e + i21 > i20) {
                        break;
                    }
                    i19 = 1;
                }
                int i37 = this.f14918q - i21;
                short[] sArr4 = this.f14910h;
                int i38 = this.f14904b;
                System.arraycopy(sArr4, i21 * i38, sArr4, 0, i38 * i37);
                this.f14918q = i37;
            }
        } else {
            b(this.f14910h, 0, this.f14918q);
            this.f14918q = 0;
        }
        float f11 = this.p;
        if (f11 == 1.0f || this.f14919r == i18) {
            return;
        }
        int i39 = this.f14903a;
        int i40 = (int) (i39 / f11);
        while (true) {
            if (i40 <= 16384 && i39 <= 16384) {
                break;
            }
            i40 /= 2;
            i39 /= 2;
        }
        int i41 = this.f14919r - i18;
        int i42 = this.f14920s;
        int i43 = this.f14913k;
        if (i42 + i41 > i43) {
            int i44 = (i43 / 2) + i41 + i43;
            this.f14913k = i44;
            this.f14914l = Arrays.copyOf(this.f14914l, i44 * this.f14904b);
        }
        short[] sArr5 = this.f14912j;
        int i45 = this.f14904b;
        System.arraycopy(sArr5, i18 * i45, this.f14914l, this.f14920s * i45, i45 * i41);
        this.f14919r = i18;
        this.f14920s += i41;
        int i46 = 0;
        while (true) {
            i10 = this.f14920s;
            i11 = i10 - 1;
            if (i46 >= i11) {
                break;
            }
            while (true) {
                i12 = this.f14915m + 1;
                i13 = this.f14916n;
                if (i12 * i40 <= i13 * i39) {
                    break;
                }
                e(1);
                int i47 = 0;
                while (true) {
                    int i48 = this.f14904b;
                    if (i47 < i48) {
                        short[] sArr6 = this.f14912j;
                        int i49 = this.f14919r;
                        short[] sArr7 = this.f14914l;
                        int i50 = (i46 * i48) + i47;
                        short s10 = sArr7[i50];
                        short s11 = sArr7[i50 + i48];
                        int i51 = this.f14916n;
                        int i52 = this.f14915m;
                        int i53 = (i52 + 1) * i40;
                        int i54 = i53 - (i51 * i39);
                        int i55 = i53 - (i52 * i40);
                        sArr6[(i49 * i48) + i47] = (short) ((((i55 - i54) * s11) + (s10 * i54)) / i55);
                        i47++;
                    }
                }
                this.f14916n++;
                this.f14919r++;
            }
            this.f14915m = i12;
            if (i12 == i39) {
                this.f14915m = 0;
                d.i(i13 == i40);
                this.f14916n = 0;
            }
            i46++;
        }
        if (i11 == 0) {
            return;
        }
        short[] sArr8 = this.f14914l;
        int i56 = this.f14904b;
        System.arraycopy(sArr8, i11 * i56, sArr8, 0, (i10 - i11) * i56);
        this.f14920s -= i11;
    }
}
