package ca;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes.dex */
public final class t implements h {

    /* renamed from: s */
    public final f f2874s = new f();

    /* renamed from: t */
    public final y f2875t;

    /* renamed from: u */
    public boolean f2876u;

    /* loaded from: classes.dex */
    public class a extends InputStream {
        public a() {
            t.this = r1;
        }

        @Override // java.io.InputStream
        public final int available() {
            t tVar = t.this;
            if (!tVar.f2876u) {
                return (int) Math.min(tVar.f2874s.f2843t, 2147483647L);
            }
            throw new IOException("closed");
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            t.this.close();
        }

        @Override // java.io.InputStream
        public final int read() {
            t tVar = t.this;
            if (!tVar.f2876u) {
                f fVar = tVar.f2874s;
                if (fVar.f2843t != 0 || tVar.f2875t.D(fVar, 8192L) != -1) {
                    return t.this.f2874s.readByte() & 255;
                }
                return -1;
            }
            throw new IOException("closed");
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i10, int i11) {
            if (!t.this.f2876u) {
                a0.a(bArr.length, i10, i11);
                t tVar = t.this;
                f fVar = tVar.f2874s;
                if (fVar.f2843t != 0 || tVar.f2875t.D(fVar, 8192L) != -1) {
                    return t.this.f2874s.d0(bArr, i10, i11);
                }
                return -1;
            }
            throw new IOException("closed");
        }

        public final String toString() {
            return t.this + ".inputStream()";
        }
    }

    public t(y yVar) {
        Objects.requireNonNull(yVar, "source == null");
        this.f2875t = yVar;
    }

    @Override // ca.h
    public final long B(x xVar) {
        long j3 = 0;
        while (this.f2875t.D(this.f2874s, 8192L) != -1) {
            long c10 = this.f2874s.c();
            if (c10 > 0) {
                j3 += c10;
                ((f) xVar).q(this.f2874s, c10);
            }
        }
        f fVar = this.f2874s;
        long j10 = fVar.f2843t;
        if (j10 > 0) {
            long j11 = j3 + j10;
            ((f) xVar).q(fVar, j10);
            return j11;
        }
        return j3;
    }

    @Override // ca.y
    public final long D(f fVar, long j3) {
        if (fVar != null) {
            if (j3 < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j3);
            } else if (this.f2876u) {
                throw new IllegalStateException("closed");
            } else {
                f fVar2 = this.f2874s;
                if (fVar2.f2843t == 0 && this.f2875t.D(fVar2, 8192L) == -1) {
                    return -1L;
                }
                return this.f2874s.D(fVar, Math.min(j3, this.f2874s.f2843t));
            }
        }
        throw new IllegalArgumentException("sink == null");
    }

    public final void G(byte[] bArr) {
        try {
            c0(bArr.length);
            this.f2874s.p0(bArr);
        } catch (EOFException e10) {
            int i10 = 0;
            while (true) {
                f fVar = this.f2874s;
                long j3 = fVar.f2843t;
                if (j3 <= 0) {
                    throw e10;
                }
                int d02 = fVar.d0(bArr, i10, (int) j3);
                if (d02 == -1) {
                    throw new AssertionError();
                }
                i10 += d02;
            }
        }
    }

    public final boolean H(long j3) {
        f fVar;
        if (j3 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j3);
        } else if (this.f2876u) {
            throw new IllegalStateException("closed");
        } else {
            do {
                fVar = this.f2874s;
                if (fVar.f2843t >= j3) {
                    return true;
                }
            } while (this.f2875t.D(fVar, 8192L) != -1);
            return false;
        }
    }

    @Override // ca.h
    public final String N(long j3) {
        if (j3 < 0) {
            throw new IllegalArgumentException("limit < 0: " + j3);
        }
        long j10 = j3 == Long.MAX_VALUE ? Long.MAX_VALUE : j3 + 1;
        long b10 = b((byte) 10, 0L, j10);
        if (b10 != -1) {
            return this.f2874s.u0(b10);
        }
        if (j10 < Long.MAX_VALUE && H(j10) && this.f2874s.Y(j10 - 1) == 13 && H(1 + j10) && this.f2874s.Y(j10) == 10) {
            return this.f2874s.u0(j10);
        }
        f fVar = new f();
        f fVar2 = this.f2874s;
        fVar2.L(fVar, 0L, Math.min(32L, fVar2.f2843t));
        StringBuilder c10 = androidx.activity.result.a.c("\\n not found: limit=");
        c10.append(Math.min(this.f2874s.f2843t, j3));
        c10.append(" content=");
        c10.append(fVar.n0().j());
        c10.append((char) 8230);
        throw new EOFException(c10.toString());
    }

    @Override // ca.h
    public final int R(r rVar) {
        if (!this.f2876u) {
            do {
                int v02 = this.f2874s.v0(rVar, true);
                if (v02 == -1) {
                    return -1;
                }
                if (v02 != -2) {
                    this.f2874s.p(rVar.f2869s[v02].n());
                    return v02;
                }
            } while (this.f2875t.D(this.f2874s, 8192L) != -1);
            return -1;
        }
        throw new IllegalStateException("closed");
    }

    @Override // ca.h, ca.g
    public final f a() {
        return this.f2874s;
    }

    public final long b(byte b10, long j3, long j10) {
        if (!this.f2876u) {
            long j11 = 0;
            if (j10 < 0) {
                throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", 0L, Long.valueOf(j10)));
            }
            while (j11 < j10) {
                long Z = this.f2874s.Z(b10, j11, j10);
                if (Z == -1) {
                    f fVar = this.f2874s;
                    long j12 = fVar.f2843t;
                    if (j12 >= j10 || this.f2875t.D(fVar, 8192L) == -1) {
                        break;
                    }
                    j11 = Math.max(j11, j12);
                } else {
                    return Z;
                }
            }
            return -1L;
        }
        throw new IllegalStateException("closed");
    }

    public final boolean c(long j3, i iVar) {
        byte[] bArr = iVar.f2847s;
        int length = bArr.length;
        if (!this.f2876u) {
            if (j3 < 0 || length < 0 || bArr.length - 0 < length) {
                return false;
            }
            for (int i10 = 0; i10 < length; i10++) {
                long j10 = i10 + j3;
                if (!H(1 + j10)) {
                    return false;
                }
                if (this.f2874s.Y(j10) != iVar.f2847s[0 + i10]) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalStateException("closed");
    }

    @Override // ca.h
    public final void c0(long j3) {
        if (H(j3)) {
            return;
        }
        throw new EOFException();
    }

    @Override // ca.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f2876u) {
            return;
        }
        this.f2876u = true;
        this.f2875t.close();
        this.f2874s.b();
    }

    @Override // ca.y
    public final z d() {
        return this.f2875t.d();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f2876u;
    }

    public final long j() {
        byte Y;
        c0(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!H(i11)) {
                break;
            }
            Y = this.f2874s.Y(i10);
            if ((Y < 48 || Y > 57) && !(i10 == 0 && Y == 45)) {
                break;
            }
            i10 = i11;
        }
        if (i10 == 0) {
            throw new NumberFormatException(String.format("Expected leading [0-9] or '-' character but was %#x", Byte.valueOf(Y)));
        }
        return this.f2874s.o0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
        if (r1 == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
        throw new java.lang.NumberFormatException(java.lang.String.format("Expected leading [0-9a-fA-F] character but was %#x", java.lang.Byte.valueOf(r3)));
     */
    @Override // ca.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long k0() {
        /*
            r6 = this;
            r0 = 1
            r6.c0(r0)
            r0 = 0
            r1 = r0
        L7:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r6.H(r3)
            if (r3 == 0) goto L4a
            ca.f r3 = r6.f2874s
            long r4 = (long) r1
            byte r3 = r3.Y(r4)
            r4 = 48
            if (r3 < r4) goto L1f
            r4 = 57
            if (r3 <= r4) goto L30
        L1f:
            r4 = 97
            if (r3 < r4) goto L27
            r4 = 102(0x66, float:1.43E-43)
            if (r3 <= r4) goto L30
        L27:
            r4 = 65
            if (r3 < r4) goto L32
            r4 = 70
            if (r3 <= r4) goto L30
            goto L32
        L30:
            r1 = r2
            goto L7
        L32:
            if (r1 == 0) goto L35
            goto L4a
        L35:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r2[r0] = r3
            java.lang.String r0 = "Expected leading [0-9a-fA-F] character but was %#x"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L4a:
            ca.f r0 = r6.f2874s
            long r0 = r0.k0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ca.t.k0():long");
    }

    @Override // ca.h
    public final InputStream l0() {
        return new a();
    }

    @Override // ca.h
    public final i m(long j3) {
        c0(j3);
        return this.f2874s.m(j3);
    }

    @Override // ca.h
    public final void p(long j3) {
        if (!this.f2876u) {
            while (j3 > 0) {
                f fVar = this.f2874s;
                if (fVar.f2843t == 0 && this.f2875t.D(fVar, 8192L) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j3, this.f2874s.f2843t);
                this.f2874s.p(min);
                j3 -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        f fVar = this.f2874s;
        if (fVar.f2843t == 0 && this.f2875t.D(fVar, 8192L) == -1) {
            return -1;
        }
        return this.f2874s.read(byteBuffer);
    }

    @Override // ca.h
    public final byte readByte() {
        c0(1L);
        return this.f2874s.readByte();
    }

    @Override // ca.h
    public final int readInt() {
        c0(4L);
        return this.f2874s.readInt();
    }

    @Override // ca.h
    public final short readShort() {
        c0(2L);
        return this.f2874s.readShort();
    }

    public final String toString() {
        StringBuilder c10 = androidx.activity.result.a.c("buffer(");
        c10.append(this.f2875t);
        c10.append(")");
        return c10.toString();
    }

    @Override // ca.h
    public final String w() {
        return N(Long.MAX_VALUE);
    }

    @Override // ca.h
    public final boolean y() {
        if (!this.f2876u) {
            return this.f2874s.y() && this.f2875t.D(this.f2874s, 8192L) == -1;
        }
        throw new IllegalStateException("closed");
    }
}
