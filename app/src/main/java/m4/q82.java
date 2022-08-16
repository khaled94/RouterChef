package m4;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class q82 extends r82 {

    /* renamed from: c */
    public final InputStream f12741c;

    /* renamed from: f */
    public int f12744f;

    /* renamed from: h */
    public int f12746h;

    /* renamed from: j */
    public int f12748j = Integer.MAX_VALUE;

    /* renamed from: d */
    public final byte[] f12742d = new byte[4096];

    /* renamed from: e */
    public int f12743e = 0;

    /* renamed from: g */
    public int f12745g = 0;

    /* renamed from: i */
    public int f12747i = 0;

    public q82(InputStream inputStream) {
        Charset charset = v92.f14624a;
        this.f12741c = inputStream;
    }

    @Override // m4.r82
    public final void A(int i10) {
        if (this.f12746h == i10) {
            return;
        }
        throw x92.b();
    }

    public final void B(int i10) {
        int i11 = this.f12743e;
        int i12 = this.f12745g;
        int i13 = i11 - i12;
        if (i10 <= i13 && i10 >= 0) {
            this.f12745g = i12 + i10;
        } else if (i10 < 0) {
            throw x92.f();
        } else {
            int i14 = this.f12747i;
            int i15 = i14 + i12;
            int i16 = this.f12748j;
            if (i15 + i10 > i16) {
                B((i16 - i14) - i12);
                throw x92.h();
            }
            this.f12747i = i15;
            this.f12743e = 0;
            this.f12745g = 0;
            while (i13 < i10) {
                try {
                    long j3 = i10 - i13;
                    try {
                        long skip = this.f12741c.skip(j3);
                        int i17 = (skip > 0L ? 1 : (skip == 0L ? 0 : -1));
                        if (i17 < 0 || skip > j3) {
                            String valueOf = String.valueOf(this.f12741c.getClass());
                            StringBuilder sb = new StringBuilder(valueOf.length() + 92);
                            sb.append(valueOf);
                            sb.append("#skip returned invalid result: ");
                            sb.append(skip);
                            sb.append("\nThe InputStream implementation is buggy.");
                            throw new IllegalStateException(sb.toString());
                        } else if (i17 == 0) {
                            break;
                        } else {
                            i13 += (int) skip;
                        }
                    } catch (x92 e10) {
                        e10.f15257s = true;
                        throw e10;
                    }
                } finally {
                    this.f12747i += i13;
                    D();
                }
            }
            if (i13 >= i10) {
                return;
            }
            int i18 = this.f12743e;
            int i19 = i18 - this.f12745g;
            this.f12745g = i18;
            while (true) {
                E(1);
                int i20 = i10 - i19;
                int i21 = this.f12743e;
                if (i20 <= i21) {
                    this.f12745g = i20;
                    return;
                } else {
                    i19 += i21;
                    this.f12745g = i21;
                }
            }
        }
    }

    public final List<byte[]> C(int i10) {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int min = Math.min(i10, 4096);
            byte[] bArr = new byte[min];
            int i11 = 0;
            while (i11 < min) {
                int read = this.f12741c.read(bArr, i11, min - i11);
                if (read == -1) {
                    throw x92.h();
                }
                this.f12747i += read;
                i11 += read;
            }
            i10 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final void D() {
        int i10 = this.f12743e + this.f12744f;
        this.f12743e = i10;
        int i11 = this.f12747i + i10;
        int i12 = this.f12748j;
        if (i11 <= i12) {
            this.f12744f = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f12744f = i13;
        this.f12743e = i10 - i13;
    }

    public final void E(int i10) {
        if (!F(i10)) {
            if (i10 <= (Integer.MAX_VALUE - this.f12747i) - this.f12745g) {
                throw x92.h();
            }
            throw new x92("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
    }

    public final boolean F(int i10) {
        int i11 = this.f12745g;
        int i12 = this.f12743e;
        if (i11 + i10 <= i12) {
            StringBuilder sb = new StringBuilder(77);
            sb.append("refillBuffer() called when ");
            sb.append(i10);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        }
        int i13 = this.f12747i;
        if (i10 > (Integer.MAX_VALUE - i13) - i11 || i13 + i11 + i10 > this.f12748j) {
            return false;
        }
        if (i11 > 0) {
            if (i12 > i11) {
                byte[] bArr = this.f12742d;
                System.arraycopy(bArr, i11, bArr, 0, i12 - i11);
            }
            i13 = this.f12747i + i11;
            this.f12747i = i13;
            i12 = this.f12743e - i11;
            this.f12743e = i12;
            this.f12745g = 0;
        }
        try {
            int read = this.f12741c.read(this.f12742d, i12, Math.min(4096 - i12, (Integer.MAX_VALUE - i13) - i12));
            if (read == 0 || read < -1 || read > 4096) {
                String valueOf = String.valueOf(this.f12741c.getClass());
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 91);
                sb2.append(valueOf);
                sb2.append("#read(byte[]) returned invalid result: ");
                sb2.append(read);
                sb2.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb2.toString());
            } else if (read <= 0) {
                return false;
            } else {
                this.f12743e += read;
                D();
                if (this.f12743e < i10) {
                    return F(i10);
                }
                return true;
            }
        } catch (x92 e10) {
            e10.f15257s = true;
            throw e10;
        }
    }

    public final byte[] G(int i10) {
        byte[] H = H(i10);
        if (H != null) {
            return H;
        }
        int i11 = this.f12745g;
        int i12 = this.f12743e;
        int i13 = i12 - i11;
        this.f12747i += i12;
        this.f12745g = 0;
        this.f12743e = 0;
        List<byte[]> C = C(i10 - i13);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f12742d, i11, bArr, 0, i13);
        Iterator it = ((ArrayList) C).iterator();
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i13, length);
            i13 += length;
        }
        return bArr;
    }

    public final byte[] H(int i10) {
        if (i10 == 0) {
            return v92.f14625b;
        }
        if (i10 < 0) {
            throw x92.f();
        }
        int i11 = this.f12747i;
        int i12 = this.f12745g;
        int i13 = i11 + i12 + i10;
        if ((-2147483647) + i13 > 0) {
            throw new x92("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i14 = this.f12748j;
        if (i13 > i14) {
            B((i14 - i11) - i12);
            throw x92.h();
        }
        int i15 = this.f12743e - i12;
        int i16 = i10 - i15;
        if (i16 >= 4096) {
            try {
                if (i16 > this.f12741c.available()) {
                    return null;
                }
            } catch (x92 e10) {
                e10.f15257s = true;
                throw e10;
            }
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f12742d, this.f12745g, bArr, 0, i15);
        this.f12747i += this.f12743e;
        this.f12745g = 0;
        this.f12743e = 0;
        while (i15 < i10) {
            try {
                int read = this.f12741c.read(bArr, i15, i10 - i15);
                if (read == -1) {
                    throw x92.h();
                }
                this.f12747i += read;
                i15 += read;
            } catch (x92 e11) {
                e11.f15257s = true;
                throw e11;
            }
        }
        return bArr;
    }

    public final byte I() {
        if (this.f12745g == this.f12743e) {
            E(1);
        }
        byte[] bArr = this.f12742d;
        int i10 = this.f12745g;
        this.f12745g = i10 + 1;
        return bArr[i10];
    }

    public final int J() {
        int i10 = this.f12745g;
        if (this.f12743e - i10 < 4) {
            E(4);
            i10 = this.f12745g;
        }
        byte[] bArr = this.f12742d;
        this.f12745g = i10 + 4;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0067, code lost:
        if (r2[r3] >= 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int K() {
        /*
            r5 = this;
            int r0 = r5.f12745g
            int r1 = r5.f12743e
            if (r1 != r0) goto L7
            goto L6c
        L7:
            byte[] r2 = r5.f12742d
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.f12745g = r3
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
            r5.f12745g = r1
            return r0
        L6c:
            long r0 = r5.N()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.q82.K():int");
    }

    public final long L() {
        int i10 = this.f12745g;
        if (this.f12743e - i10 < 8) {
            E(8);
            i10 = this.f12745g;
        }
        byte[] bArr = this.f12742d;
        this.f12745g = i10 + 8;
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public final long M() {
        long j3;
        long j10;
        long j11;
        long j12;
        int i10;
        int i11 = this.f12745g;
        int i12 = this.f12743e;
        if (i12 != i11) {
            byte[] bArr = this.f12742d;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f12745g = i13;
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
                                                    this.f12745g = i14;
                                                    return j3;
                                                }
                                            }
                                        }
                                    }
                                }
                                j3 = j11 ^ j14;
                                i14 = i19;
                                this.f12745g = i14;
                                return j3;
                            }
                            j12 = 266354560;
                            j10 = j13 ^ j12;
                        }
                    }
                    i14 = i16;
                    j3 = j10;
                    this.f12745g = i14;
                    return j3;
                }
                i10 = i15 ^ (-128);
                j3 = i10;
                this.f12745g = i14;
                return j3;
            }
        }
        return N();
    }

    public final long N() {
        long j3 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte I = I();
            j3 |= (I & Byte.MAX_VALUE) << i10;
            if ((I & 128) == 0) {
                return j3;
            }
        }
        throw x92.e();
    }

    @Override // m4.r82
    public final void a(int i10) {
        this.f12748j = i10;
        D();
    }

    @Override // m4.r82
    public final boolean b() {
        return this.f12745g == this.f12743e && !F(1);
    }

    @Override // m4.r82
    public final boolean c() {
        return M() != 0;
    }

    @Override // m4.r82
    public final boolean d(int i10) {
        int q10;
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (this.f12743e - this.f12745g < 10) {
                while (i12 < 10) {
                    if (I() < 0) {
                        i12++;
                    }
                }
                throw x92.e();
            }
            while (i12 < 10) {
                byte[] bArr = this.f12742d;
                int i13 = this.f12745g;
                this.f12745g = i13 + 1;
                if (bArr[i13] < 0) {
                    i12++;
                }
            }
            throw x92.e();
            return true;
        } else if (i11 == 1) {
            B(8);
            return true;
        } else if (i11 == 2) {
            B(K());
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
            int i14 = x92.f15256t;
            throw new w92();
        }
    }

    @Override // m4.r82
    public final double h() {
        return Double.longBitsToDouble(L());
    }

    @Override // m4.r82
    public final float i() {
        return Float.intBitsToFloat(J());
    }

    @Override // m4.r82
    public final int j() {
        return this.f12747i + this.f12745g;
    }

    @Override // m4.r82
    public final int k(int i10) {
        if (i10 >= 0) {
            int i11 = this.f12747i + this.f12745g + i10;
            int i12 = this.f12748j;
            if (i11 > i12) {
                throw x92.h();
            }
            this.f12748j = i11;
            D();
            return i12;
        }
        throw x92.f();
    }

    @Override // m4.r82
    public final int l() {
        return K();
    }

    @Override // m4.r82
    public final int m() {
        return J();
    }

    @Override // m4.r82
    public final int n() {
        return K();
    }

    @Override // m4.r82
    public final int o() {
        return J();
    }

    @Override // m4.r82
    public final int p() {
        return r82.e(K());
    }

    @Override // m4.r82
    public final int q() {
        if (b()) {
            this.f12746h = 0;
            return 0;
        }
        int K = K();
        this.f12746h = K;
        if ((K >>> 3) == 0) {
            throw x92.c();
        }
        return K;
    }

    @Override // m4.r82
    public final int r() {
        return K();
    }

    @Override // m4.r82
    public final long s() {
        return L();
    }

    @Override // m4.r82
    public final long t() {
        return M();
    }

    @Override // m4.r82
    public final long u() {
        return L();
    }

    @Override // m4.r82
    public final long v() {
        return r82.f(M());
    }

    @Override // m4.r82
    public final long w() {
        return M();
    }

    @Override // m4.r82
    public final n82 x() {
        int K = K();
        int i10 = this.f12743e;
        int i11 = this.f12745g;
        if (K <= i10 - i11 && K > 0) {
            n82 D = n82.D(this.f12742d, i11, K);
            this.f12745g += K;
            return D;
        } else if (K == 0) {
            return n82.f11571t;
        } else {
            byte[] H = H(K);
            if (H != null) {
                return n82.D(H, 0, H.length);
            }
            int i12 = this.f12745g;
            int i13 = this.f12743e;
            int i14 = i13 - i12;
            this.f12747i += i13;
            this.f12745g = 0;
            this.f12743e = 0;
            List<byte[]> C = C(K - i14);
            byte[] bArr = new byte[K];
            System.arraycopy(this.f12742d, i12, bArr, 0, i14);
            Iterator it = ((ArrayList) C).iterator();
            while (it.hasNext()) {
                byte[] bArr2 = (byte[]) it.next();
                int length = bArr2.length;
                System.arraycopy(bArr2, 0, bArr, i14, length);
                i14 += length;
            }
            return new l82(bArr);
        }
    }

    @Override // m4.r82
    public final String y() {
        int K = K();
        if (K > 0) {
            int i10 = this.f12743e;
            int i11 = this.f12745g;
            if (K <= i10 - i11) {
                String str = new String(this.f12742d, i11, K, v92.f14624a);
                this.f12745g += K;
                return str;
            }
        }
        if (K == 0) {
            return "";
        }
        if (K > this.f12743e) {
            return new String(G(K), v92.f14624a);
        }
        E(K);
        String str2 = new String(this.f12742d, this.f12745g, K, v92.f14624a);
        this.f12745g += K;
        return str2;
    }

    @Override // m4.r82
    public final String z() {
        byte[] bArr;
        byte[] bArr2;
        int K = K();
        int i10 = this.f12745g;
        int i11 = this.f12743e;
        if (K <= i11 - i10 && K > 0) {
            bArr = this.f12742d;
            this.f12745g = i10 + K;
        } else if (K == 0) {
            return "";
        } else {
            if (K <= i11) {
                E(K);
                bArr2 = this.f12742d;
                this.f12745g = K;
            } else {
                bArr2 = G(K);
            }
            bArr = bArr2;
            i10 = 0;
        }
        return bc2.d(bArr, i10, K);
    }
}
