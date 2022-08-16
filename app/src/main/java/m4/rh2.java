package m4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class rh2 {

    /* renamed from: a */
    public final int f13334a;

    /* renamed from: b */
    public final int f13335b;

    /* renamed from: c */
    public final float f13336c;

    /* renamed from: d */
    public final float f13337d;

    /* renamed from: e */
    public final float f13338e;

    /* renamed from: f */
    public final int f13339f;

    /* renamed from: g */
    public final int f13340g;

    /* renamed from: h */
    public final int f13341h;

    /* renamed from: i */
    public final short[] f13342i;

    /* renamed from: j */
    public short[] f13343j;

    /* renamed from: k */
    public int f13344k;

    /* renamed from: l */
    public short[] f13345l;

    /* renamed from: m */
    public int f13346m;

    /* renamed from: n */
    public short[] f13347n;

    /* renamed from: o */
    public int f13348o;
    public int p;

    /* renamed from: q */
    public int f13349q;

    /* renamed from: r */
    public int f13350r;

    /* renamed from: s */
    public int f13351s;

    /* renamed from: t */
    public int f13352t;

    /* renamed from: u */
    public int f13353u;

    /* renamed from: v */
    public int f13354v;

    public rh2(int i10, int i11, float f10, float f11, int i12) {
        this.f13334a = i10;
        this.f13335b = i11;
        this.f13336c = f10;
        this.f13337d = f11;
        this.f13338e = i10 / i12;
        this.f13339f = i10 / 400;
        int i13 = i10 / 65;
        this.f13340g = i13;
        int i14 = i13 + i13;
        this.f13341h = i14;
        this.f13342i = new short[i14];
        int i15 = i14 * i11;
        this.f13343j = new short[i15];
        this.f13345l = new short[i15];
        this.f13347n = new short[i15];
    }

    public static void d(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
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
        int i13 = i10 * this.f13335b;
        int i14 = 1;
        int i15 = 255;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int i18 = 0;
            for (int i19 = 0; i19 < i11; i19++) {
                i18 += Math.abs(sArr[i13 + i19] - sArr[(i13 + i11) + i19]);
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
        this.f13353u = i14 / i16;
        this.f13354v = i17 / i15;
        return i16;
    }

    public final void b(short[] sArr, int i10, int i11) {
        short[] f10 = f(this.f13345l, this.f13346m, i11);
        this.f13345l = f10;
        int i12 = this.f13335b;
        System.arraycopy(sArr, i10 * i12, f10, this.f13346m * i12, i12 * i11);
        this.f13346m += i11;
    }

    public final void c(short[] sArr, int i10, int i11) {
        int i12 = this.f13341h / i11;
        int i13 = this.f13335b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f13342i[i16] = (short) (i17 / i14);
        }
    }

    public final void e() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = this.f13346m;
        float f10 = this.f13336c;
        float f11 = this.f13337d;
        float f12 = f10 / f11;
        float f13 = this.f13338e * f11;
        double d5 = f12;
        float f14 = 1.0f;
        int i19 = 1;
        if (d5 > 1.00001d || d5 < 0.99999d) {
            int i20 = this.f13344k;
            if (i20 >= this.f13341h) {
                int i21 = 0;
                while (true) {
                    int i22 = this.f13350r;
                    if (i22 > 0) {
                        int min = Math.min(this.f13341h, i22);
                        b(this.f13343j, i21, min);
                        this.f13350r -= min;
                        i21 += min;
                    } else {
                        short[] sArr = this.f13343j;
                        int i23 = this.f13334a;
                        int i24 = i23 > 4000 ? i23 / 4000 : i19;
                        if (this.f13335b == i19 && i24 == i19) {
                            i14 = a(sArr, i21, this.f13339f, this.f13340g);
                        } else {
                            c(sArr, i21, i24);
                            int a10 = a(this.f13342i, 0, this.f13339f / i24, this.f13340g / i24);
                            if (i24 != i19) {
                                int i25 = a10 * i24;
                                int i26 = i24 * 4;
                                int i27 = i25 - i26;
                                int i28 = i25 + i26;
                                int i29 = this.f13339f;
                                if (i27 < i29) {
                                    i27 = i29;
                                }
                                int i30 = this.f13340g;
                                if (i28 > i30) {
                                    i28 = i30;
                                }
                                if (this.f13335b == i19) {
                                    i14 = a(sArr, i21, i27, i28);
                                } else {
                                    c(sArr, i21, i19);
                                    i14 = a(this.f13342i, 0, i27, i28);
                                }
                            } else {
                                i14 = a10;
                            }
                        }
                        int i31 = this.f13353u;
                        int i32 = (i31 == 0 || (i17 = this.f13351s) == 0 || this.f13354v > i31 * 3 || i31 + i31 <= this.f13352t * 3) ? i14 : i17;
                        this.f13352t = i31;
                        this.f13351s = i14;
                        if (d5 > 1.0d) {
                            short[] sArr2 = this.f13343j;
                            if (f12 >= 2.0f) {
                                i16 = (int) (i32 / ((-1.0f) + f12));
                            } else {
                                this.f13350r = (int) (((2.0f - f12) * i32) / ((-1.0f) + f12));
                                i16 = i32;
                            }
                            short[] f15 = f(this.f13345l, this.f13346m, i16);
                            this.f13345l = f15;
                            int i33 = i16;
                            d(i16, this.f13335b, f15, this.f13346m, sArr2, i21, sArr2, i21 + i32);
                            this.f13346m += i33;
                            i21 = i32 + i33 + i21;
                        } else {
                            int i34 = i32;
                            short[] sArr3 = this.f13343j;
                            if (f12 < 0.5f) {
                                i15 = (int) ((i34 * f12) / (f14 - f12));
                            } else {
                                this.f13350r = (int) ((((f12 + f12) - 1.0f) * i34) / (f14 - f12));
                                i15 = i34;
                            }
                            int i35 = i34 + i15;
                            short[] f16 = f(this.f13345l, this.f13346m, i35);
                            this.f13345l = f16;
                            int i36 = this.f13335b;
                            System.arraycopy(sArr3, i21 * i36, f16, this.f13346m * i36, i36 * i34);
                            d(i15, this.f13335b, this.f13345l, this.f13346m + i34, sArr3, i21 + i34, sArr3, i21);
                            this.f13346m += i35;
                            i21 += i15;
                        }
                    }
                    if (this.f13341h + i21 > i20) {
                        break;
                    }
                    f14 = 1.0f;
                    i19 = 1;
                }
                int i37 = this.f13344k - i21;
                short[] sArr4 = this.f13343j;
                int i38 = this.f13335b;
                System.arraycopy(sArr4, i21 * i38, sArr4, 0, i38 * i37);
                this.f13344k = i37;
                f14 = 1.0f;
            }
        } else {
            b(this.f13343j, 0, this.f13344k);
            this.f13344k = 0;
        }
        if (f13 == f14 || this.f13346m == i18) {
            return;
        }
        int i39 = this.f13334a;
        int i40 = (int) (i39 / f13);
        while (true) {
            if (i40 <= 16384 && i39 <= 16384) {
                break;
            }
            i40 /= 2;
            i39 /= 2;
        }
        int i41 = this.f13346m - i18;
        short[] f17 = f(this.f13347n, this.f13348o, i41);
        this.f13347n = f17;
        short[] sArr5 = this.f13345l;
        int i42 = this.f13335b;
        System.arraycopy(sArr5, i18 * i42, f17, this.f13348o * i42, i42 * i41);
        this.f13346m = i18;
        this.f13348o += i41;
        int i43 = 0;
        while (true) {
            i10 = this.f13348o;
            i11 = i10 - 1;
            if (i43 >= i11) {
                break;
            }
            while (true) {
                i12 = this.p + 1;
                i13 = this.f13349q;
                if (i12 * i40 <= i13 * i39) {
                    break;
                }
                this.f13345l = f(this.f13345l, this.f13346m, 1);
                int i44 = 0;
                while (true) {
                    int i45 = this.f13335b;
                    if (i44 < i45) {
                        short[] sArr6 = this.f13345l;
                        int i46 = this.f13346m;
                        short[] sArr7 = this.f13347n;
                        int i47 = (i43 * i45) + i44;
                        short s10 = sArr7[i47];
                        short s11 = sArr7[i47 + i45];
                        int i48 = this.f13349q;
                        int i49 = this.p;
                        int i50 = (i49 + 1) * i40;
                        int i51 = i50 - (i48 * i39);
                        int i52 = i50 - (i49 * i40);
                        sArr6[(i46 * i45) + i44] = (short) ((((i52 - i51) * s11) + (s10 * i51)) / i52);
                        i44++;
                    }
                }
                this.f13349q++;
                this.f13346m++;
            }
            this.p = i12;
            if (i12 == i39) {
                this.p = 0;
                r01.h(i13 == i40);
                this.f13349q = 0;
            }
            i43++;
        }
        if (i11 == 0) {
            return;
        }
        short[] sArr8 = this.f13347n;
        int i53 = this.f13335b;
        System.arraycopy(sArr8, i11 * i53, sArr8, 0, (i10 - i11) * i53);
        this.f13348o -= i11;
    }

    public final short[] f(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f13335b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }
}
