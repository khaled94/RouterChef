package ca;

import androidx.appcompat.widget.e0;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.util.Objects;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class f implements h, g, Cloneable, ByteChannel {

    /* renamed from: u */
    public static final byte[] f2841u = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    @Nullable

    /* renamed from: s */
    public u f2842s;

    /* renamed from: t */
    public long f2843t;

    /* loaded from: classes.dex */
    public class a extends InputStream {
        public a() {
            f.this = r1;
        }

        @Override // java.io.InputStream
        public final int available() {
            return (int) Math.min(f.this.f2843t, 2147483647L);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.InputStream
        public final int read() {
            f fVar = f.this;
            if (fVar.f2843t > 0) {
                return fVar.readByte() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i10, int i11) {
            return f.this.d0(bArr, i10, i11);
        }

        public final String toString() {
            return f.this + ".inputStream()";
        }
    }

    public final long A0(y yVar) {
        if (yVar != null) {
            long j3 = 0;
            while (true) {
                long D = yVar.D(this, 8192L);
                if (D == -1) {
                    return j3;
                }
                j3 += D;
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    @Override // ca.h
    public final long B(x xVar) {
        long j3 = this.f2843t;
        if (j3 > 0) {
            ((f) xVar).q(this, j3);
        }
        return j3;
    }

    public final f B0(int i10) {
        u w02 = w0(1);
        byte[] bArr = w02.f2878a;
        int i11 = w02.f2880c;
        w02.f2880c = i11 + 1;
        bArr[i11] = (byte) i10;
        this.f2843t++;
        return this;
    }

    /* renamed from: C0 */
    public final f g0(long j3) {
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i10 == 0) {
            B0(48);
            return this;
        }
        boolean z10 = false;
        int i11 = 1;
        if (i10 < 0) {
            j3 = -j3;
            if (j3 < 0) {
                H0("-9223372036854775808", 0, 20);
                return this;
            }
            z10 = true;
        }
        if (j3 >= 100000000) {
            i11 = j3 < 1000000000000L ? j3 < 10000000000L ? j3 < 1000000000 ? 9 : 10 : j3 < 100000000000L ? 11 : 12 : j3 < 1000000000000000L ? j3 < 10000000000000L ? 13 : j3 < 100000000000000L ? 14 : 15 : j3 < 100000000000000000L ? j3 < 10000000000000000L ? 16 : 17 : j3 < 1000000000000000000L ? 18 : 19;
        } else if (j3 >= 10000) {
            i11 = j3 < 1000000 ? j3 < 100000 ? 5 : 6 : j3 < 10000000 ? 7 : 8;
        } else if (j3 >= 100) {
            i11 = j3 < 1000 ? 3 : 4;
        } else if (j3 >= 10) {
            i11 = 2;
        }
        if (z10) {
            i11++;
        }
        u w02 = w0(i11);
        byte[] bArr = w02.f2878a;
        int i12 = w02.f2880c + i11;
        while (j3 != 0) {
            i12--;
            bArr[i12] = f2841u[(int) (j3 % 10)];
            j3 /= 10;
        }
        if (z10) {
            bArr[i12 - 1] = 45;
        }
        w02.f2880c += i11;
        this.f2843t += i11;
        return this;
    }

    @Override // ca.y
    public final long D(f fVar, long j3) {
        if (fVar != null) {
            if (j3 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j3);
            }
            long j10 = this.f2843t;
            if (j10 == 0) {
                return -1L;
            }
            if (j3 > j10) {
                j3 = j10;
            }
            fVar.q(this, j3);
            return j3;
        }
        throw new IllegalArgumentException("sink == null");
    }

    /* renamed from: D0 */
    public final f l(long j3) {
        if (j3 == 0) {
            B0(48);
            return this;
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j3)) / 4) + 1;
        u w02 = w0(numberOfTrailingZeros);
        byte[] bArr = w02.f2878a;
        int i10 = w02.f2880c;
        for (int i11 = (i10 + numberOfTrailingZeros) - 1; i11 >= i10; i11--) {
            bArr[i11] = f2841u[(int) (15 & j3)];
            j3 >>>= 4;
        }
        w02.f2880c += numberOfTrailingZeros;
        this.f2843t += numberOfTrailingZeros;
        return this;
    }

    public final f E0(int i10) {
        u w02 = w0(4);
        byte[] bArr = w02.f2878a;
        int i11 = w02.f2880c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i10 >>> 16) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((i10 >>> 8) & 255);
        bArr[i14] = (byte) (i10 & 255);
        w02.f2880c = i14 + 1;
        this.f2843t += 4;
        return this;
    }

    @Override // ca.g
    public final /* bridge */ /* synthetic */ g F(byte[] bArr) {
        y0(bArr);
        return this;
    }

    public final f F0(int i10) {
        u w02 = w0(2);
        byte[] bArr = w02.f2878a;
        int i11 = w02.f2880c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i12] = (byte) (i10 & 255);
        w02.f2880c = i12 + 1;
        this.f2843t += 2;
        return this;
    }

    public final f G0(String str) {
        H0(str, 0, str.length());
        return this;
    }

    public final f H0(String str, int i10, int i11) {
        char charAt;
        int i12;
        if (str != null) {
            if (i10 < 0) {
                throw new IllegalArgumentException(e0.a("beginIndex < 0: ", i10));
            }
            if (i11 < i10) {
                throw new IllegalArgumentException("endIndex < beginIndex: " + i11 + " < " + i10);
            } else if (i11 > str.length()) {
                throw new IllegalArgumentException("endIndex > string.length: " + i11 + " > " + str.length());
            } else {
                while (i10 < i11) {
                    char charAt2 = str.charAt(i10);
                    if (charAt2 < 128) {
                        u w02 = w0(1);
                        byte[] bArr = w02.f2878a;
                        int i13 = w02.f2880c - i10;
                        int min = Math.min(i11, 8192 - i13);
                        int i14 = i10 + 1;
                        bArr[i10 + i13] = (byte) charAt2;
                        while (true) {
                            i10 = i14;
                            if (i10 >= min || (charAt = str.charAt(i10)) >= 128) {
                                break;
                            }
                            i14 = i10 + 1;
                            bArr[i10 + i13] = (byte) charAt;
                        }
                        int i15 = w02.f2880c;
                        int i16 = (i13 + i10) - i15;
                        w02.f2880c = i15 + i16;
                        this.f2843t += i16;
                    } else {
                        if (charAt2 < 2048) {
                            i12 = (charAt2 >> 6) | 192;
                        } else if (charAt2 < 55296 || charAt2 > 57343) {
                            B0((charAt2 >> '\f') | 224);
                            i12 = ((charAt2 >> 6) & 63) | 128;
                        } else {
                            int i17 = i10 + 1;
                            char charAt3 = i17 < i11 ? str.charAt(i17) : (char) 0;
                            if (charAt2 > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                                B0(63);
                                i10 = i17;
                            } else {
                                int i18 = (((charAt2 & 10239) << 10) | (9215 & charAt3)) + 65536;
                                B0((i18 >> 18) | 240);
                                B0(((i18 >> 12) & 63) | 128);
                                B0(((i18 >> 6) & 63) | 128);
                                B0((i18 & 63) | 128);
                                i10 += 2;
                            }
                        }
                        B0(i12);
                        B0((charAt2 & '?') | 128);
                        i10++;
                    }
                }
                return this;
            }
        }
        throw new IllegalArgumentException("string == null");
    }

    public final f I0(int i10) {
        int i11;
        int i12;
        if (i10 >= 128) {
            if (i10 < 2048) {
                i11 = (i10 >> 6) | 192;
            } else {
                if (i10 < 65536) {
                    if (i10 >= 55296 && i10 <= 57343) {
                        B0(63);
                        return this;
                    }
                    i12 = (i10 >> 12) | 224;
                } else if (i10 > 1114111) {
                    StringBuilder c10 = androidx.activity.result.a.c("Unexpected code point: ");
                    c10.append(Integer.toHexString(i10));
                    throw new IllegalArgumentException(c10.toString());
                } else {
                    B0((i10 >> 18) | 240);
                    i12 = ((i10 >> 12) & 63) | 128;
                }
                B0(i12);
                i11 = ((i10 >> 6) & 63) | 128;
            }
            B0(i11);
            i10 = (i10 & 63) | 128;
        }
        B0(i10);
        return this;
    }

    @Override // ca.g
    public final /* bridge */ /* synthetic */ g J(i iVar) {
        x0(iVar);
        return this;
    }

    @Override // ca.g
    public final g K() {
        return this;
    }

    public final f L(f fVar, long j3, long j10) {
        if (fVar != null) {
            a0.a(this.f2843t, j3, j10);
            if (j10 == 0) {
                return this;
            }
            fVar.f2843t += j10;
            u uVar = this.f2842s;
            while (true) {
                int i10 = uVar.f2880c;
                int i11 = uVar.f2879b;
                if (j3 >= i10 - i11) {
                    j3 -= i10 - i11;
                    uVar = uVar.f2883f;
                }
            }
            while (j10 > 0) {
                u c10 = uVar.c();
                int i12 = (int) (c10.f2879b + j3);
                c10.f2879b = i12;
                c10.f2880c = Math.min(i12 + ((int) j10), c10.f2880c);
                u uVar2 = fVar.f2842s;
                if (uVar2 == null) {
                    c10.f2884g = c10;
                    c10.f2883f = c10;
                    fVar.f2842s = c10;
                } else {
                    uVar2.f2884g.b(c10);
                }
                j10 -= c10.f2880c - c10.f2879b;
                uVar = uVar.f2883f;
                j3 = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    @Override // ca.h
    public final String N(long j3) {
        if (j3 < 0) {
            throw new IllegalArgumentException("limit < 0: " + j3);
        }
        long j10 = Long.MAX_VALUE;
        if (j3 != Long.MAX_VALUE) {
            j10 = j3 + 1;
        }
        long Z = Z((byte) 10, 0L, j10);
        if (Z != -1) {
            return u0(Z);
        }
        if (j10 < this.f2843t && Y(j10 - 1) == 13 && Y(j10) == 10) {
            return u0(j10);
        }
        f fVar = new f();
        L(fVar, 0L, Math.min(32L, this.f2843t));
        StringBuilder c10 = androidx.activity.result.a.c("\\n not found: limit=");
        c10.append(Math.min(this.f2843t, j3));
        c10.append(" content=");
        c10.append(fVar.n0().j());
        c10.append((char) 8230);
        throw new EOFException(c10.toString());
    }

    @Override // ca.h
    public final int R(r rVar) {
        int v02 = v0(rVar, false);
        if (v02 == -1) {
            return -1;
        }
        try {
            p(rVar.f2869s[v02].n());
            return v02;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    public final byte Y(long j3) {
        int i10;
        a0.a(this.f2843t, j3, 1L);
        long j10 = this.f2843t;
        if (j10 - j3 <= j3) {
            long j11 = j3 - j10;
            u uVar = this.f2842s;
            do {
                uVar = uVar.f2884g;
                int i11 = uVar.f2880c;
                i10 = uVar.f2879b;
                j11 += i11 - i10;
            } while (j11 < 0);
            return uVar.f2878a[i10 + ((int) j11)];
        }
        u uVar2 = this.f2842s;
        while (true) {
            int i12 = uVar2.f2880c;
            int i13 = uVar2.f2879b;
            long j12 = i12 - i13;
            if (j3 < j12) {
                return uVar2.f2878a[i13 + ((int) j3)];
            }
            j3 -= j12;
            uVar2 = uVar2.f2883f;
        }
    }

    public final long Z(byte b10, long j3, long j10) {
        u uVar;
        long j11 = 0;
        if (j3 < 0 || j10 < j3) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.f2843t), Long.valueOf(j3), Long.valueOf(j10)));
        }
        long j12 = this.f2843t;
        long j13 = j10 > j12 ? j12 : j10;
        if (j3 == j13 || (uVar = this.f2842s) == null) {
            return -1L;
        }
        if (j12 - j3 < j3) {
            while (j12 > j3) {
                uVar = uVar.f2884g;
                j12 -= uVar.f2880c - uVar.f2879b;
            }
        } else {
            while (true) {
                long j14 = (uVar.f2880c - uVar.f2879b) + j11;
                if (j14 >= j3) {
                    break;
                }
                uVar = uVar.f2883f;
                j11 = j14;
            }
            j12 = j11;
        }
        long j15 = j3;
        while (j12 < j13) {
            byte[] bArr = uVar.f2878a;
            int min = (int) Math.min(uVar.f2880c, (uVar.f2879b + j13) - j12);
            for (int i10 = (int) ((uVar.f2879b + j15) - j12); i10 < min; i10++) {
                if (bArr[i10] == b10) {
                    return (i10 - uVar.f2879b) + j12;
                }
            }
            j12 += uVar.f2880c - uVar.f2879b;
            uVar = uVar.f2883f;
            j15 = j12;
        }
        return -1L;
    }

    @Override // ca.h, ca.g
    public final f a() {
        return this;
    }

    public final void b() {
        try {
            p(this.f2843t);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    public final long c() {
        long j3 = this.f2843t;
        if (j3 == 0) {
            return 0L;
        }
        u uVar = this.f2842s.f2884g;
        int i10 = uVar.f2880c;
        return (i10 >= 8192 || !uVar.f2882e) ? j3 : j3 - (i10 - uVar.f2879b);
    }

    @Override // ca.h
    public final void c0(long j3) {
        if (this.f2843t >= j3) {
            return;
        }
        throw new EOFException();
    }

    public final Object clone() {
        f fVar = new f();
        if (this.f2843t != 0) {
            u c10 = this.f2842s.c();
            fVar.f2842s = c10;
            c10.f2884g = c10;
            c10.f2883f = c10;
            u uVar = this.f2842s;
            while (true) {
                uVar = uVar.f2883f;
                if (uVar == this.f2842s) {
                    break;
                }
                fVar.f2842s.f2884g.b(uVar.c());
            }
            fVar.f2843t = this.f2843t;
        }
        return fVar;
    }

    @Override // ca.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // ca.y
    public final z d() {
        return z.f2888d;
    }

    public final int d0(byte[] bArr, int i10, int i11) {
        a0.a(bArr.length, i10, i11);
        u uVar = this.f2842s;
        if (uVar == null) {
            return -1;
        }
        int min = Math.min(i11, uVar.f2880c - uVar.f2879b);
        System.arraycopy(uVar.f2878a, uVar.f2879b, bArr, i10, min);
        int i12 = uVar.f2879b + min;
        uVar.f2879b = i12;
        this.f2843t -= min;
        if (i12 == uVar.f2880c) {
            this.f2842s = uVar.a();
            v.a(uVar);
        }
        return min;
    }

    @Override // ca.g
    public final /* bridge */ /* synthetic */ g e(byte[] bArr, int i10, int i11) {
        z0(bArr, i10, i11);
        return this;
    }

    public final byte[] e0() {
        try {
            return m0(this.f2843t);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        long j3 = this.f2843t;
        if (j3 != fVar.f2843t) {
            return false;
        }
        long j10 = 0;
        if (j3 == 0) {
            return true;
        }
        u uVar = this.f2842s;
        u uVar2 = fVar.f2842s;
        int i10 = uVar.f2879b;
        int i11 = uVar2.f2879b;
        while (j10 < this.f2843t) {
            long min = Math.min(uVar.f2880c - i10, uVar2.f2880c - i11);
            int i12 = 0;
            while (i12 < min) {
                int i13 = i10 + 1;
                int i14 = i11 + 1;
                if (uVar.f2878a[i10] != uVar2.f2878a[i11]) {
                    return false;
                }
                i12++;
                i10 = i13;
                i11 = i14;
            }
            if (i10 == uVar.f2880c) {
                uVar = uVar.f2883f;
                i10 = uVar.f2879b;
            }
            if (i11 == uVar2.f2880c) {
                uVar2 = uVar2.f2883f;
                i11 = uVar2.f2879b;
            }
            j10 += min;
        }
        return true;
    }

    @Override // ca.g
    public final g f0(String str) {
        H0(str, 0, str.length());
        return this;
    }

    @Override // ca.g, ca.x, java.io.Flushable
    public final void flush() {
    }

    public final int hashCode() {
        u uVar = this.f2842s;
        if (uVar == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = uVar.f2880c;
            for (int i12 = uVar.f2879b; i12 < i11; i12++) {
                i10 = (i10 * 31) + uVar.f2878a[i12];
            }
            uVar = uVar.f2883f;
        } while (uVar != this.f2842s);
        return i10;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009b A[EDGE_INSN: B:42:0x009b->B:38:0x009b ?: BREAK  , SYNTHETIC] */
    @Override // ca.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long k0() {
        /*
            r14 = this;
            long r0 = r14.f2843t
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto La2
            r0 = 0
            r1 = r0
            r4 = r2
        Lb:
            ca.u r6 = r14.f2842s
            byte[] r7 = r6.f2878a
            int r8 = r6.f2879b
            int r9 = r6.f2880c
        L13:
            if (r8 >= r9) goto L87
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L22
            r11 = 57
            if (r10 > r11) goto L22
            int r11 = r10 + (-48)
            goto L39
        L22:
            r11 = 97
            if (r10 < r11) goto L2d
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L2d
            int r11 = r10 + (-97)
            goto L37
        L2d:
            r11 = 65
            if (r10 < r11) goto L6c
            r11 = 70
            if (r10 > r11) goto L6c
            int r11 = r10 + (-65)
        L37:
            int r11 = r11 + 10
        L39:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L49
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L13
        L49:
            ca.f r0 = new ca.f
            r0.<init>()
            ca.f r0 = r0.l(r4)
            r0.B0(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = "Number too large: "
            java.lang.StringBuilder r2 = androidx.activity.result.a.c(r2)
            java.lang.String r0 = r0.t0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L6c:
            if (r0 == 0) goto L70
            r1 = 1
            goto L87
        L70:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.StringBuilder r1 = androidx.activity.result.a.c(r1)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L87:
            if (r8 != r9) goto L93
            ca.u r7 = r6.a()
            r14.f2842s = r7
            ca.v.a(r6)
            goto L95
        L93:
            r6.f2879b = r8
        L95:
            if (r1 != 0) goto L9b
            ca.u r6 = r14.f2842s
            if (r6 != 0) goto Lb
        L9b:
            long r1 = r14.f2843t
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.f2843t = r1
            return r4
        La2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ca.f.k0():long");
    }

    @Override // ca.h
    public final InputStream l0() {
        return new a();
    }

    @Override // ca.h
    public final i m(long j3) {
        return new i(m0(j3));
    }

    public final byte[] m0(long j3) {
        a0.a(this.f2843t, 0L, j3);
        if (j3 <= 2147483647L) {
            byte[] bArr = new byte[(int) j3];
            p0(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j3);
    }

    public final i n0() {
        return new i(e0());
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
        r0 = new ca.f().g0(r2);
        r0.B0(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
        if (r7 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
        r0.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
        r2 = androidx.activity.result.a.c("Number too large: ");
        r2.append(r0.t0());
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
        throw new java.lang.NumberFormatException(r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ae, code lost:
        r15.f2843t -= r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
        if (r7 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b8, code lost:
        return -r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
        return r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long o0() {
        /*
            r15 = this;
            long r0 = r15.f2843t
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb9
            r0 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            r4 = -7
            r6 = 0
            r7 = r6
            r8 = r7
        L12:
            ca.u r9 = r15.f2842s
            byte[] r10 = r9.f2878a
            int r11 = r9.f2879b
            int r12 = r9.f2880c
        L1a:
            if (r11 >= r12) goto L92
            r13 = r10[r11]
            r14 = 48
            if (r13 < r14) goto L62
            r14 = 57
            if (r13 > r14) goto L62
            int r14 = 48 - r13
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L3a
            if (r0 != 0) goto L34
            long r0 = (long) r14
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L34
            goto L3a
        L34:
            r0 = 10
            long r2 = r2 * r0
            long r0 = (long) r14
            long r2 = r2 + r0
            goto L6c
        L3a:
            ca.f r0 = new ca.f
            r0.<init>()
            ca.f r0 = r0.g0(r2)
            r0.B0(r13)
            if (r7 != 0) goto L4b
            r0.readByte()
        L4b:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = "Number too large: "
            java.lang.StringBuilder r2 = androidx.activity.result.a.c(r2)
            java.lang.String r0 = r0.t0()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L62:
            r0 = 45
            if (r13 != r0) goto L76
            if (r6 != 0) goto L76
            r0 = 1
            long r4 = r4 - r0
            r7 = 1
        L6c:
            int r11 = r11 + 1
            int r6 = r6 + 1
            r0 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            goto L1a
        L76:
            if (r6 == 0) goto L7b
            r0 = 1
            r8 = r0
            goto L92
        L7b:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = "Expected leading [0-9] or '-' character but was 0x"
            java.lang.StringBuilder r1 = androidx.activity.result.a.c(r1)
            java.lang.String r2 = java.lang.Integer.toHexString(r13)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L92:
            if (r11 != r12) goto L9e
            ca.u r0 = r9.a()
            r15.f2842s = r0
            ca.v.a(r9)
            goto La0
        L9e:
            r9.f2879b = r11
        La0:
            if (r8 != 0) goto Lae
            ca.u r0 = r15.f2842s
            if (r0 != 0) goto La7
            goto Lae
        La7:
            r0 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            goto L12
        Lae:
            long r0 = r15.f2843t
            long r4 = (long) r6
            long r0 = r0 - r4
            r15.f2843t = r0
            if (r7 == 0) goto Lb7
            goto Lb8
        Lb7:
            long r2 = -r2
        Lb8:
            return r2
        Lb9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ca.f.o0():long");
    }

    @Override // ca.h
    public final void p(long j3) {
        u uVar;
        while (j3 > 0) {
            if (this.f2842s == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j3, uVar.f2880c - uVar.f2879b);
            long j10 = min;
            this.f2843t -= j10;
            j3 -= j10;
            u uVar2 = this.f2842s;
            int i10 = uVar2.f2879b + min;
            uVar2.f2879b = i10;
            if (i10 == uVar2.f2880c) {
                this.f2842s = uVar2.a();
                v.a(uVar2);
            }
        }
    }

    public final void p0(byte[] bArr) {
        int i10 = 0;
        while (i10 < bArr.length) {
            int d02 = d0(bArr, i10, bArr.length - i10);
            if (d02 == -1) {
                throw new EOFException();
            }
            i10 += d02;
        }
    }

    @Override // ca.x
    public final void q(f fVar, long j3) {
        u uVar;
        if (fVar != null) {
            if (fVar == this) {
                throw new IllegalArgumentException("source == this");
            }
            a0.a(fVar.f2843t, 0L, j3);
            while (j3 > 0) {
                u uVar2 = fVar.f2842s;
                int i10 = 0;
                if (j3 < uVar2.f2880c - uVar2.f2879b) {
                    u uVar3 = this.f2842s;
                    u uVar4 = uVar3 != null ? uVar3.f2884g : null;
                    if (uVar4 != null && uVar4.f2882e) {
                        if ((uVar4.f2880c + j3) - (uVar4.f2881d ? 0 : uVar4.f2879b) <= 8192) {
                            uVar2.d(uVar4, (int) j3);
                            fVar.f2843t -= j3;
                            this.f2843t += j3;
                            return;
                        }
                    }
                    int i11 = (int) j3;
                    Objects.requireNonNull(uVar2);
                    if (i11 > 0 && i11 <= uVar2.f2880c - uVar2.f2879b) {
                        if (i11 >= 1024) {
                            uVar = uVar2.c();
                        } else {
                            uVar = v.b();
                            System.arraycopy(uVar2.f2878a, uVar2.f2879b, uVar.f2878a, 0, i11);
                        }
                        uVar.f2880c = uVar.f2879b + i11;
                        uVar2.f2879b += i11;
                        uVar2.f2884g.b(uVar);
                        fVar.f2842s = uVar;
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                u uVar5 = fVar.f2842s;
                long j10 = uVar5.f2880c - uVar5.f2879b;
                fVar.f2842s = uVar5.a();
                u uVar6 = this.f2842s;
                if (uVar6 == null) {
                    this.f2842s = uVar5;
                    uVar5.f2884g = uVar5;
                    uVar5.f2883f = uVar5;
                } else {
                    uVar6.f2884g.b(uVar5);
                    u uVar7 = uVar5.f2884g;
                    if (uVar7 == uVar5) {
                        throw new IllegalStateException();
                    }
                    if (uVar7.f2882e) {
                        int i12 = uVar5.f2880c - uVar5.f2879b;
                        int i13 = 8192 - uVar7.f2880c;
                        if (!uVar7.f2881d) {
                            i10 = uVar7.f2879b;
                        }
                        if (i12 <= i13 + i10) {
                            uVar5.d(uVar7, i12);
                            uVar5.a();
                            v.a(uVar5);
                        }
                    }
                }
                fVar.f2843t -= j10;
                this.f2843t += j10;
                j3 -= j10;
            }
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final int q0() {
        int readInt = readInt();
        Charset charset = a0.f2829a;
        return ((readInt & 255) << 24) | (((-16777216) & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    @Override // ca.g
    public final /* bridge */ /* synthetic */ g r(int i10) {
        F0(i10);
        return this;
    }

    public final short r0() {
        short readShort = readShort();
        Charset charset = a0.f2829a;
        int i10 = readShort & 65535;
        return (short) (((i10 & 255) << 8) | ((65280 & i10) >>> 8));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        u uVar = this.f2842s;
        if (uVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), uVar.f2880c - uVar.f2879b);
        byteBuffer.put(uVar.f2878a, uVar.f2879b, min);
        int i10 = uVar.f2879b + min;
        uVar.f2879b = i10;
        this.f2843t -= min;
        if (i10 == uVar.f2880c) {
            this.f2842s = uVar.a();
            v.a(uVar);
        }
        return min;
    }

    @Override // ca.h
    public final byte readByte() {
        long j3 = this.f2843t;
        if (j3 != 0) {
            u uVar = this.f2842s;
            int i10 = uVar.f2879b;
            int i11 = uVar.f2880c;
            int i12 = i10 + 1;
            byte b10 = uVar.f2878a[i10];
            this.f2843t = j3 - 1;
            if (i12 == i11) {
                this.f2842s = uVar.a();
                v.a(uVar);
            } else {
                uVar.f2879b = i12;
            }
            return b10;
        }
        throw new IllegalStateException("size == 0");
    }

    @Override // ca.h
    public final int readInt() {
        long j3 = this.f2843t;
        if (j3 < 4) {
            StringBuilder c10 = androidx.activity.result.a.c("size < 4: ");
            c10.append(this.f2843t);
            throw new IllegalStateException(c10.toString());
        }
        u uVar = this.f2842s;
        int i10 = uVar.f2879b;
        int i11 = uVar.f2880c;
        if (i11 - i10 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = uVar.f2878a;
        int i12 = i10 + 1;
        int i13 = i12 + 1;
        int i14 = ((bArr[i10] & 255) << 24) | ((bArr[i12] & 255) << 16);
        int i15 = i13 + 1;
        int i16 = i14 | ((bArr[i13] & 255) << 8);
        int i17 = i15 + 1;
        int i18 = i16 | (bArr[i15] & 255);
        this.f2843t = j3 - 4;
        if (i17 == i11) {
            this.f2842s = uVar.a();
            v.a(uVar);
        } else {
            uVar.f2879b = i17;
        }
        return i18;
    }

    @Override // ca.h
    public final short readShort() {
        long j3 = this.f2843t;
        if (j3 < 2) {
            StringBuilder c10 = androidx.activity.result.a.c("size < 2: ");
            c10.append(this.f2843t);
            throw new IllegalStateException(c10.toString());
        }
        u uVar = this.f2842s;
        int i10 = uVar.f2879b;
        int i11 = uVar.f2880c;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = uVar.f2878a;
        int i12 = i10 + 1;
        int i13 = i12 + 1;
        int i14 = ((bArr[i10] & 255) << 8) | (bArr[i12] & 255);
        this.f2843t = j3 - 2;
        if (i13 == i11) {
            this.f2842s = uVar.a();
            v.a(uVar);
        } else {
            uVar.f2879b = i13;
        }
        return (short) i14;
    }

    public final String s0(long j3, Charset charset) {
        a0.a(this.f2843t, 0L, j3);
        if (charset != null) {
            if (j3 > 2147483647L) {
                throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j3);
            } else if (j3 == 0) {
                return "";
            } else {
                u uVar = this.f2842s;
                int i10 = uVar.f2879b;
                if (i10 + j3 > uVar.f2880c) {
                    return new String(m0(j3), charset);
                }
                String str = new String(uVar.f2878a, i10, (int) j3, charset);
                int i11 = (int) (uVar.f2879b + j3);
                uVar.f2879b = i11;
                this.f2843t -= j3;
                if (i11 == uVar.f2880c) {
                    this.f2842s = uVar.a();
                    v.a(uVar);
                }
                return str;
            }
        }
        throw new IllegalArgumentException("charset == null");
    }

    public final String t0() {
        try {
            return s0(this.f2843t, a0.f2829a);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    public final String toString() {
        long j3 = this.f2843t;
        if (j3 <= 2147483647L) {
            int i10 = (int) j3;
            return (i10 == 0 ? i.f2846w : new w(this, i10)).toString();
        }
        StringBuilder c10 = androidx.activity.result.a.c("size > Integer.MAX_VALUE: ");
        c10.append(this.f2843t);
        throw new IllegalArgumentException(c10.toString());
    }

    @Override // ca.g
    public final /* bridge */ /* synthetic */ g u(int i10) {
        E0(i10);
        return this;
    }

    public final String u0(long j3) {
        if (j3 > 0) {
            long j10 = j3 - 1;
            if (Y(j10) == 13) {
                String s02 = s0(j10, a0.f2829a);
                p(2L);
                return s02;
            }
        }
        String s03 = s0(j3, a0.f2829a);
        p(1L);
        return s03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
        if (r19 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
        return r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int v0(ca.r r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 161
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ca.f.v0(ca.r, boolean):int");
    }

    @Override // ca.h
    public final String w() {
        return N(Long.MAX_VALUE);
    }

    public final u w0(int i10) {
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException();
        }
        u uVar = this.f2842s;
        if (uVar == null) {
            u b10 = v.b();
            this.f2842s = b10;
            b10.f2884g = b10;
            b10.f2883f = b10;
            return b10;
        }
        u uVar2 = uVar.f2884g;
        if (uVar2.f2880c + i10 <= 8192 && uVar2.f2882e) {
            return uVar2;
        }
        u b11 = v.b();
        uVar2.b(b11);
        return b11;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i10 = remaining;
            while (i10 > 0) {
                u w02 = w0(1);
                int min = Math.min(i10, 8192 - w02.f2880c);
                byteBuffer.get(w02.f2878a, w02.f2880c, min);
                i10 -= min;
                w02.f2880c += min;
            }
            this.f2843t += remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final f x0(i iVar) {
        if (iVar != null) {
            iVar.r(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    @Override // ca.h
    public final boolean y() {
        return this.f2843t == 0;
    }

    public final f y0(byte[] bArr) {
        if (bArr != null) {
            z0(bArr, 0, bArr.length);
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // ca.g
    public final /* bridge */ /* synthetic */ g z(int i10) {
        B0(i10);
        return this;
    }

    public final f z0(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            long j3 = i11;
            a0.a(bArr.length, i10, j3);
            int i12 = i11 + i10;
            while (i10 < i12) {
                u w02 = w0(1);
                int min = Math.min(i12 - i10, 8192 - w02.f2880c);
                System.arraycopy(bArr, i10, w02.f2878a, w02.f2880c, min);
                i10 += min;
                w02.f2880c += min;
            }
            this.f2843t += j3;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }
}
