package m4;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class o82 extends r82 {

    /* renamed from: c */
    public final byte[] f12044c;

    /* renamed from: d */
    public int f12045d;

    /* renamed from: e */
    public int f12046e;

    /* renamed from: f */
    public int f12047f;

    /* renamed from: g */
    public final int f12048g;

    /* renamed from: h */
    public int f12049h;

    /* renamed from: i */
    public int f12050i = Integer.MAX_VALUE;

    public /* synthetic */ o82(byte[] bArr, int i10, int i11) {
        this.f12044c = bArr;
        this.f12045d = i11 + i10;
        this.f12047f = i10;
        this.f12048g = i10;
    }

    @Override // m4.r82
    public final void A(int i10) {
        if (this.f12049h == i10) {
            return;
        }
        throw x92.b();
    }

    public final void B(int i10) {
        if (i10 >= 0) {
            int i11 = this.f12045d;
            int i12 = this.f12047f;
            if (i10 <= i11 - i12) {
                this.f12047f = i12 + i10;
                return;
            }
        }
        if (i10 < 0) {
            throw x92.f();
        }
        throw x92.h();
    }

    public final void C() {
        int i10 = this.f12045d + this.f12046e;
        this.f12045d = i10;
        int i11 = i10 - this.f12048g;
        int i12 = this.f12050i;
        if (i11 <= i12) {
            this.f12046e = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f12046e = i13;
        this.f12045d = i10 - i13;
    }

    public final int D() {
        int i10 = this.f12047f;
        if (this.f12045d - i10 >= 4) {
            byte[] bArr = this.f12044c;
            this.f12047f = i10 + 4;
            return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
        }
        throw x92.h();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0067, code lost:
        if (r2[r3] >= 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int E() {
        /*
            r5 = this;
            int r0 = r5.f12047f
            int r1 = r5.f12045d
            if (r1 != r0) goto L7
            goto L6c
        L7:
            byte[] r2 = r5.f12044c
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.f12047f = r3
            return r0
        L12:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6c
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L23
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L69
        L23:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L30
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2e:
            r1 = r3
            goto L69
        L30:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L69
        L3e:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L69
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L69
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 < 0) goto L6c
        L69:
            r5.f12047f = r1
            return r0
        L6c:
            long r0 = r5.H()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.o82.E():int");
    }

    public final long F() {
        int i10 = this.f12047f;
        if (this.f12045d - i10 >= 8) {
            byte[] bArr = this.f12044c;
            this.f12047f = i10 + 8;
            return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
        }
        throw x92.h();
    }

    public final long G() {
        long j3;
        long j10;
        long j11;
        long j12;
        int i10;
        int i11 = this.f12047f;
        int i12 = this.f12045d;
        if (i12 != i11) {
            byte[] bArr = this.f12044c;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f12047f = i13;
                return b10;
            } else if (i12 - i13 >= 9) {
                int i14 = i13 + 1;
                int i15 = b10 ^ (bArr[i13] << 7);
                if (i15 >= 0) {
                    int i16 = i14 + 1;
                    int i17 = i15 ^ (bArr[i14] << 14);
                    if (i17 >= 0) {
                        j10 = i17 ^ 16256;
                    } else {
                        i14 = i16 + 1;
                        int i18 = i17 ^ (bArr[i16] << 21);
                        if (i18 < 0) {
                            i10 = i18 ^ (-2080896);
                        } else {
                            i16 = i14 + 1;
                            long j13 = (bArr[i14] << 28) ^ i18;
                            if (j13 < 0) {
                                int i19 = i16 + 1;
                                long j14 = j13 ^ (bArr[i16] << 35);
                                if (j14 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    i16 = i19 + 1;
                                    j13 = j14 ^ (bArr[i19] << 42);
                                    if (j13 >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        i19 = i16 + 1;
                                        j14 = j13 ^ (bArr[i16] << 49);
                                        if (j14 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            i16 = i19 + 1;
                                            j10 = (j14 ^ (bArr[i19] << 56)) ^ 71499008037633920L;
                                            if (j10 < 0) {
                                                i19 = i16 + 1;
                                                if (bArr[i16] >= 0) {
                                                    j3 = j10;
                                                    i14 = i19;
                                                    this.f12047f = i14;
                                                    return j3;
                                                }
                                            }
                                        }
                                    }
                                }
                                j3 = j11 ^ j14;
                                i14 = i19;
                                this.f12047f = i14;
                                return j3;
                            }
                            j12 = 266354560;
                            j10 = j13 ^ j12;
                        }
                    }
                    i14 = i16;
                    j3 = j10;
                    this.f12047f = i14;
                    return j3;
                }
                i10 = i15 ^ (-128);
                j3 = i10;
                this.f12047f = i14;
                return j3;
            }
        }
        return H();
    }

    public final long H() {
        long j3 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            int i11 = this.f12047f;
            if (i11 == this.f12045d) {
                throw x92.h();
            }
            byte[] bArr = this.f12044c;
            this.f12047f = i11 + 1;
            byte b10 = bArr[i11];
            j3 |= (b10 & Byte.MAX_VALUE) << i10;
            if ((b10 & 128) == 0) {
                return j3;
            }
        }
        throw x92.e();
    }

    @Override // m4.r82
    public final void a(int i10) {
        this.f12050i = i10;
        C();
    }

    @Override // m4.r82
    public final boolean b() {
        return this.f12047f == this.f12045d;
    }

    @Override // m4.r82
    public final boolean c() {
        return G() != 0;
    }

    @Override // m4.r82
    public final boolean d(int i10) {
        int q10;
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (this.f12045d - this.f12047f >= 10) {
                while (i12 < 10) {
                    byte[] bArr = this.f12044c;
                    int i13 = this.f12047f;
                    this.f12047f = i13 + 1;
                    if (bArr[i13] < 0) {
                        i12++;
                    }
                }
                throw x92.e();
            }
            while (i12 < 10) {
                int i14 = this.f12047f;
                if (i14 == this.f12045d) {
                    throw x92.h();
                }
                byte[] bArr2 = this.f12044c;
                this.f12047f = i14 + 1;
                if (bArr2[i14] < 0) {
                    i12++;
                }
            }
            throw x92.e();
            return true;
        } else if (i11 == 1) {
            B(8);
            return true;
        } else if (i11 == 2) {
            B(E());
            return true;
        } else if (i11 == 3) {
            do {
                q10 = q();
                if (q10 == 0) {
                    break;
                }
            } while (d(q10));
            A(((i10 >>> 3) << 3) | 4);
            return true;
        } else if (i11 == 4) {
            return false;
        } else {
            if (i11 == 5) {
                B(4);
                return true;
            }
            int i15 = x92.f15256t;
            throw new w92();
        }
    }

    @Override // m4.r82
    public final double h() {
        return Double.longBitsToDouble(F());
    }

    @Override // m4.r82
    public final float i() {
        return Float.intBitsToFloat(D());
    }

    @Override // m4.r82
    public final int j() {
        return this.f12047f - this.f12048g;
    }

    @Override // m4.r82
    public final int k(int i10) {
        if (i10 >= 0) {
            int i11 = (this.f12047f - this.f12048g) + i10;
            if (i11 < 0) {
                throw x92.g();
            }
            int i12 = this.f12050i;
            if (i11 > i12) {
                throw x92.h();
            }
            this.f12050i = i11;
            C();
            return i12;
        }
        throw x92.f();
    }

    @Override // m4.r82
    public final int l() {
        return E();
    }

    @Override // m4.r82
    public final int m() {
        return D();
    }

    @Override // m4.r82
    public final int n() {
        return E();
    }

    @Override // m4.r82
    public final int o() {
        return D();
    }

    @Override // m4.r82
    public final int p() {
        return r82.e(E());
    }

    @Override // m4.r82
    public final int q() {
        if (b()) {
            this.f12049h = 0;
            return 0;
        }
        int E = E();
        this.f12049h = E;
        if ((E >>> 3) == 0) {
            throw x92.c();
        }
        return E;
    }

    @Override // m4.r82
    public final int r() {
        return E();
    }

    @Override // m4.r82
    public final long s() {
        return F();
    }

    @Override // m4.r82
    public final long t() {
        return G();
    }

    @Override // m4.r82
    public final long u() {
        return F();
    }

    @Override // m4.r82
    public final long v() {
        return r82.f(G());
    }

    @Override // m4.r82
    public final long w() {
        return G();
    }

    @Override // m4.r82
    public final n82 x() {
        int E = E();
        if (E > 0) {
            int i10 = this.f12045d;
            int i11 = this.f12047f;
            if (E <= i10 - i11) {
                n82 D = n82.D(this.f12044c, i11, E);
                this.f12047f += E;
                return D;
            }
        }
        if (E != 0) {
            if (E > 0) {
                int i12 = this.f12045d;
                int i13 = this.f12047f;
                if (E <= i12 - i13) {
                    int i14 = E + i13;
                    this.f12047f = i14;
                    byte[] copyOfRange = Arrays.copyOfRange(this.f12044c, i13, i14);
                    l82 l82Var = n82.f11571t;
                    return new l82(copyOfRange);
                }
            }
            if (E > 0) {
                throw x92.h();
            }
            throw x92.f();
        }
        return n82.f11571t;
    }

    @Override // m4.r82
    public final String y() {
        int E = E();
        if (E > 0) {
            int i10 = this.f12045d;
            int i11 = this.f12047f;
            if (E <= i10 - i11) {
                String str = new String(this.f12044c, i11, E, v92.f14624a);
                this.f12047f += E;
                return str;
            }
        }
        if (E == 0) {
            return "";
        }
        if (E >= 0) {
            throw x92.h();
        }
        throw x92.f();
    }

    @Override // m4.r82
    public final String z() {
        int E = E();
        if (E > 0) {
            int i10 = this.f12045d;
            int i11 = this.f12047f;
            if (E <= i10 - i11) {
                String d5 = bc2.d(this.f12044c, i11, E);
                this.f12047f += E;
                return d5;
            }
        }
        if (E == 0) {
            return "";
        }
        if (E > 0) {
            throw x92.h();
        }
        throw x92.f();
    }
}
