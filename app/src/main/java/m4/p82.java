package m4;

import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class p82 extends r82 {

    /* renamed from: c */
    public final Iterable<ByteBuffer> f12434c;

    /* renamed from: d */
    public final Iterator<ByteBuffer> f12435d;

    /* renamed from: e */
    public ByteBuffer f12436e;

    /* renamed from: f */
    public int f12437f;

    /* renamed from: g */
    public int f12438g;

    /* renamed from: i */
    public int f12440i;

    /* renamed from: k */
    public long f12442k;

    /* renamed from: l */
    public long f12443l;

    /* renamed from: m */
    public long f12444m;

    /* renamed from: h */
    public int f12439h = Integer.MAX_VALUE;

    /* renamed from: j */
    public int f12441j = 0;

    public /* synthetic */ p82(Iterable iterable, int i10) {
        this.f12437f = i10;
        this.f12434c = iterable;
        this.f12435d = iterable.iterator();
        if (i10 != 0) {
            G();
            return;
        }
        this.f12436e = v92.f14626c;
        this.f12442k = 0L;
        this.f12443l = 0L;
        this.f12444m = 0L;
    }

    @Override // m4.r82
    public final void A(int i10) {
        if (this.f12440i == i10) {
            return;
        }
        throw x92.b();
    }

    public final void B(int i10) {
        if (i10 < 0 || i10 > ((this.f12437f - this.f12441j) - this.f12442k) + this.f12443l) {
            if (i10 >= 0) {
                throw x92.h();
            }
            throw x92.f();
        }
        while (i10 > 0) {
            if (this.f12444m - this.f12442k == 0) {
                D();
            }
            int min = Math.min(i10, (int) (this.f12444m - this.f12442k));
            i10 -= min;
            this.f12442k += min;
        }
    }

    public final int C() {
        return (int) (((this.f12437f - this.f12441j) - this.f12442k) + this.f12443l);
    }

    public final void D() {
        if (this.f12435d.hasNext()) {
            G();
            return;
        }
        throw x92.h();
    }

    public final void E(byte[] bArr, int i10) {
        if (i10 > C()) {
            if (i10 > 0) {
                throw x92.h();
            }
            return;
        }
        int i11 = i10;
        while (i11 > 0) {
            if (this.f12444m - this.f12442k == 0) {
                D();
            }
            int min = Math.min(i11, (int) (this.f12444m - this.f12442k));
            long j3 = min;
            zb2.o(this.f12442k, bArr, i10 - i11, j3);
            i11 -= min;
            this.f12442k += j3;
        }
    }

    public final void F() {
        int i10 = this.f12437f + this.f12438g;
        this.f12437f = i10;
        int i11 = this.f12439h;
        if (i10 <= i11) {
            this.f12438g = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f12438g = i12;
        this.f12437f = i10 - i12;
    }

    public final void G() {
        ByteBuffer next = this.f12435d.next();
        this.f12436e = next;
        this.f12441j += (int) (this.f12442k - this.f12443l);
        long position = next.position();
        this.f12442k = position;
        this.f12443l = position;
        this.f12444m = this.f12436e.limit();
        long y = zb2.f16089c.y(this.f12436e, zb2.f16093g);
        this.f12442k += y;
        this.f12443l += y;
        this.f12444m += y;
    }

    public final byte H() {
        if (this.f12444m - this.f12442k == 0) {
            D();
        }
        long j3 = this.f12442k;
        this.f12442k = 1 + j3;
        return zb2.f(j3);
    }

    public final int I() {
        int H;
        byte H2;
        long j3 = this.f12444m;
        long j10 = this.f12442k;
        if (j3 - j10 >= 4) {
            this.f12442k = 4 + j10;
            H = (zb2.f(j10) & 255) | ((zb2.f(1 + j10) & 255) << 8) | ((zb2.f(2 + j10) & 255) << 16);
            H2 = zb2.f(j10 + 3);
        } else {
            H = (H() & 255) | ((H() & 255) << 8) | ((H() & 255) << 16);
            H2 = H();
        }
        return H | ((H2 & 255) << 24);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0087, code lost:
        if (m4.zb2.f(r4) >= 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int J() {
        /*
            r10 = this;
            long r0 = r10.f12442k
            long r2 = r10.f12444m
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto L8c
        La:
            r2 = 1
            long r4 = r0 + r2
            byte r0 = m4.zb2.f(r0)
            if (r0 < 0) goto L1a
            long r4 = r10.f12442k
            long r4 = r4 + r2
            r10.f12442k = r4
            return r0
        L1a:
            long r6 = r10.f12444m
            long r8 = r10.f12442k
            long r6 = r6 - r8
            r8 = 10
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto L8c
            long r6 = r4 + r2
            byte r1 = m4.zb2.f(r4)
            int r1 = r1 << 7
            r0 = r0 ^ r1
            if (r0 >= 0) goto L33
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L89
        L33:
            long r4 = r6 + r2
            byte r1 = m4.zb2.f(r6)
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L42
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L40:
            r6 = r4
            goto L89
        L42:
            long r6 = r4 + r2
            byte r1 = m4.zb2.f(r4)
            int r1 = r1 << 21
            r0 = r0 ^ r1
            if (r0 >= 0) goto L52
            r1 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r1
            goto L89
        L52:
            long r4 = r6 + r2
            byte r1 = m4.zb2.f(r6)
            int r6 = r1 << 28
            r0 = r0 ^ r6
            r6 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r6
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = m4.zb2.f(r4)
            if (r1 >= 0) goto L89
            long r4 = r6 + r2
            byte r1 = m4.zb2.f(r6)
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = m4.zb2.f(r4)
            if (r1 >= 0) goto L89
            long r4 = r6 + r2
            byte r1 = m4.zb2.f(r6)
            if (r1 >= 0) goto L40
            long r6 = r4 + r2
            byte r1 = m4.zb2.f(r4)
            if (r1 < 0) goto L8c
        L89:
            r10.f12442k = r6
            return r0
        L8c:
            long r0 = r10.M()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.p82.J():int");
    }

    public final long K() {
        long j3 = this.f12444m;
        long j10 = this.f12442k;
        if (j3 - j10 < 8) {
            return ((H() & 255) << 56) | (H() & 255) | ((H() & 255) << 8) | ((H() & 255) << 16) | ((H() & 255) << 24) | ((H() & 255) << 32) | ((H() & 255) << 40) | ((H() & 255) << 48);
        }
        this.f12442k = 8 + j10;
        return ((zb2.f(j10 + 7) & 255) << 56) | (zb2.f(j10) & 255) | ((zb2.f(1 + j10) & 255) << 8) | ((zb2.f(2 + j10) & 255) << 16) | ((zb2.f(3 + j10) & 255) << 24) | ((zb2.f(4 + j10) & 255) << 32) | ((zb2.f(5 + j10) & 255) << 40) | ((zb2.f(6 + j10) & 255) << 48);
    }

    public final long L() {
        long j3;
        long j10;
        long j11;
        int i10;
        long j12 = this.f12442k;
        if (this.f12444m != j12) {
            long j13 = j12 + 1;
            byte f10 = zb2.f(j12);
            if (f10 >= 0) {
                this.f12442k++;
                return f10;
            } else if (this.f12444m - this.f12442k >= 10) {
                long j14 = j13 + 1;
                int f11 = f10 ^ (zb2.f(j13) << 7);
                if (f11 >= 0) {
                    long j15 = j14 + 1;
                    int f12 = f11 ^ (zb2.f(j14) << 14);
                    if (f12 >= 0) {
                        j3 = f12 ^ 16256;
                    } else {
                        j14 = j15 + 1;
                        int f13 = f12 ^ (zb2.f(j15) << 21);
                        if (f13 < 0) {
                            i10 = f13 ^ (-2080896);
                        } else {
                            j15 = j14 + 1;
                            long f14 = f13 ^ (zb2.f(j14) << 28);
                            if (f14 < 0) {
                                long j16 = j15 + 1;
                                long f15 = f14 ^ (zb2.f(j15) << 35);
                                if (f15 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    j15 = j16 + 1;
                                    f14 = f15 ^ (zb2.f(j16) << 42);
                                    if (f14 >= 0) {
                                        j11 = 4363953127296L;
                                    } else {
                                        j16 = j15 + 1;
                                        f15 = f14 ^ (zb2.f(j15) << 49);
                                        if (f15 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            j15 = j16 + 1;
                                            j3 = (f15 ^ (zb2.f(j16) << 56)) ^ 71499008037633920L;
                                            if (j3 < 0) {
                                                long j17 = 1 + j15;
                                                if (zb2.f(j15) >= 0) {
                                                    j14 = j17;
                                                    this.f12442k = j14;
                                                    return j3;
                                                }
                                            }
                                        }
                                    }
                                }
                                j3 = f15 ^ j10;
                                j14 = j16;
                                this.f12442k = j14;
                                return j3;
                            }
                            j11 = 266354560;
                            j3 = f14 ^ j11;
                        }
                    }
                    j14 = j15;
                    this.f12442k = j14;
                    return j3;
                }
                i10 = f11 ^ (-128);
                j3 = i10;
                this.f12442k = j14;
                return j3;
            }
        }
        return M();
    }

    public final long M() {
        long j3 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte H = H();
            j3 |= (H & Byte.MAX_VALUE) << i10;
            if ((H & 128) == 0) {
                return j3;
            }
        }
        throw x92.e();
    }

    @Override // m4.r82
    public final void a(int i10) {
        this.f12439h = i10;
        F();
    }

    @Override // m4.r82
    public final boolean b() {
        return (((long) this.f12441j) + this.f12442k) - this.f12443l == ((long) this.f12437f);
    }

    @Override // m4.r82
    public final boolean c() {
        return L() != 0;
    }

    @Override // m4.r82
    public final boolean d(int i10) {
        int q10;
        int i11 = i10 & 7;
        if (i11 == 0) {
            for (int i12 = 0; i12 < 10; i12++) {
                if (H() >= 0) {
                    return true;
                }
            }
            throw x92.e();
        } else if (i11 == 1) {
            B(8);
            return true;
        } else if (i11 == 2) {
            B(J());
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
            int i13 = x92.f15256t;
            throw new w92();
        }
    }

    @Override // m4.r82
    public final double h() {
        return Double.longBitsToDouble(K());
    }

    @Override // m4.r82
    public final float i() {
        return Float.intBitsToFloat(I());
    }

    @Override // m4.r82
    public final int j() {
        return (int) ((this.f12441j + this.f12442k) - this.f12443l);
    }

    @Override // m4.r82
    public final int k(int i10) {
        if (i10 >= 0) {
            int j3 = j() + i10;
            int i11 = this.f12439h;
            if (j3 > i11) {
                throw x92.h();
            }
            this.f12439h = j3;
            F();
            return i11;
        }
        throw x92.f();
    }

    @Override // m4.r82
    public final int l() {
        return J();
    }

    @Override // m4.r82
    public final int m() {
        return I();
    }

    @Override // m4.r82
    public final int n() {
        return J();
    }

    @Override // m4.r82
    public final int o() {
        return I();
    }

    @Override // m4.r82
    public final int p() {
        return r82.e(J());
    }

    @Override // m4.r82
    public final int q() {
        if (b()) {
            this.f12440i = 0;
            return 0;
        }
        int J = J();
        this.f12440i = J;
        if ((J >>> 3) == 0) {
            throw x92.c();
        }
        return J;
    }

    @Override // m4.r82
    public final int r() {
        return J();
    }

    @Override // m4.r82
    public final long s() {
        return K();
    }

    @Override // m4.r82
    public final long t() {
        return L();
    }

    @Override // m4.r82
    public final long u() {
        return K();
    }

    @Override // m4.r82
    public final long v() {
        return r82.f(L());
    }

    @Override // m4.r82
    public final long w() {
        return L();
    }

    @Override // m4.r82
    public final n82 x() {
        int J = J();
        if (J > 0) {
            long j3 = J;
            long j10 = this.f12444m;
            long j11 = this.f12442k;
            if (j3 <= j10 - j11) {
                byte[] bArr = new byte[J];
                zb2.o(j11, bArr, 0L, j3);
                this.f12442k += j3;
                return new l82(bArr);
            }
        }
        if (J > 0 && J <= C()) {
            byte[] bArr2 = new byte[J];
            E(bArr2, J);
            return new l82(bArr2);
        } else if (J == 0) {
            return n82.f11571t;
        } else {
            if (J >= 0) {
                throw x92.h();
            }
            throw x92.f();
        }
    }

    @Override // m4.r82
    public final String y() {
        int J = J();
        if (J > 0) {
            long j3 = J;
            long j10 = this.f12444m;
            long j11 = this.f12442k;
            if (j3 <= j10 - j11) {
                byte[] bArr = new byte[J];
                zb2.o(j11, bArr, 0L, j3);
                String str = new String(bArr, v92.f14624a);
                this.f12442k += j3;
                return str;
            }
        }
        if (J > 0 && J <= C()) {
            byte[] bArr2 = new byte[J];
            E(bArr2, J);
            return new String(bArr2, v92.f14624a);
        } else if (J == 0) {
            return "";
        } else {
            if (J >= 0) {
                throw x92.h();
            }
            throw x92.f();
        }
    }

    @Override // m4.r82
    public final String z() {
        String str;
        int J = J();
        if (J > 0) {
            long j3 = J;
            long j10 = this.f12444m;
            long j11 = this.f12442k;
            if (j3 <= j10 - j11) {
                long j12 = this.f12443l;
                ByteBuffer byteBuffer = this.f12436e;
                int i10 = (int) (j11 - j12);
                is isVar = bc2.f6451a;
                if (byteBuffer.hasArray()) {
                    str = isVar.c(byteBuffer.array(), byteBuffer.arrayOffset() + i10, J);
                } else {
                    byteBuffer.isDirect();
                    str = is.d(byteBuffer, i10, J);
                }
                this.f12442k += j3;
                return str;
            }
        }
        if (J >= 0 && J <= C()) {
            byte[] bArr = new byte[J];
            E(bArr, J);
            return bc2.f6451a.c(bArr, 0, J);
        } else if (J == 0) {
            return "";
        } else {
            if (J > 0) {
                throw x92.h();
            }
            throw x92.f();
        }
    }
}
