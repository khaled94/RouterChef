package ca;

import java.io.EOFException;
import java.io.IOException;
import java.util.logging.Logger;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class m implements y {

    /* renamed from: t */
    public final t f2854t;

    /* renamed from: u */
    public final Inflater f2855u;

    /* renamed from: v */
    public final n f2856v;

    /* renamed from: s */
    public int f2853s = 0;

    /* renamed from: w */
    public final CRC32 f2857w = new CRC32();

    public m(y yVar) {
        if (yVar != null) {
            Inflater inflater = new Inflater(true);
            this.f2855u = inflater;
            Logger logger = o.f2862a;
            t tVar = new t(yVar);
            this.f2854t = tVar;
            this.f2856v = new n(tVar, inflater);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // ca.y
    public final long D(f fVar, long j3) {
        long j10;
        if (this.f2853s == 0) {
            this.f2854t.c0(10L);
            byte Y = this.f2854t.f2874s.Y(3L);
            boolean z10 = ((Y >> 1) & 1) == 1;
            if (z10) {
                c(this.f2854t.f2874s, 0L, 10L);
            }
            t tVar = this.f2854t;
            tVar.c0(2L);
            b("ID1ID2", 8075, tVar.f2874s.readShort());
            this.f2854t.p(8L);
            if (((Y >> 2) & 1) == 1) {
                this.f2854t.c0(2L);
                if (z10) {
                    c(this.f2854t.f2874s, 0L, 2L);
                }
                long r02 = this.f2854t.f2874s.r0();
                this.f2854t.c0(r02);
                if (z10) {
                    j10 = r02;
                    c(this.f2854t.f2874s, 0L, r02);
                } else {
                    j10 = r02;
                }
                this.f2854t.p(j10);
            }
            if (((Y >> 3) & 1) == 1) {
                long b10 = this.f2854t.b((byte) 0, 0L, Long.MAX_VALUE);
                if (b10 == -1) {
                    throw new EOFException();
                }
                if (z10) {
                    c(this.f2854t.f2874s, 0L, b10 + 1);
                }
                this.f2854t.p(b10 + 1);
            }
            if (((Y >> 4) & 1) == 1) {
                long b11 = this.f2854t.b((byte) 0, 0L, Long.MAX_VALUE);
                if (b11 == -1) {
                    throw new EOFException();
                }
                if (z10) {
                    c(this.f2854t.f2874s, 0L, b11 + 1);
                }
                this.f2854t.p(b11 + 1);
            }
            if (z10) {
                t tVar2 = this.f2854t;
                tVar2.c0(2L);
                b("FHCRC", tVar2.f2874s.r0(), (short) this.f2857w.getValue());
                this.f2857w.reset();
            }
            this.f2853s = 1;
        }
        if (this.f2853s == 1) {
            long j11 = fVar.f2843t;
            long D = this.f2856v.D(fVar, 8192L);
            if (D != -1) {
                c(fVar, j11, D);
                return D;
            }
            this.f2853s = 2;
        }
        if (this.f2853s == 2) {
            t tVar3 = this.f2854t;
            tVar3.c0(4L);
            b("CRC", tVar3.f2874s.q0(), (int) this.f2857w.getValue());
            t tVar4 = this.f2854t;
            tVar4.c0(4L);
            b("ISIZE", tVar4.f2874s.q0(), (int) this.f2855u.getBytesWritten());
            this.f2853s = 3;
            if (!this.f2854t.y()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    public final void b(String str, int i10, int i11) {
        if (i11 == i10) {
            return;
        }
        throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", str, Integer.valueOf(i11), Integer.valueOf(i10)));
    }

    public final void c(f fVar, long j3, long j10) {
        int i10;
        u uVar = fVar.f2842s;
        while (true) {
            int i11 = uVar.f2880c;
            int i12 = uVar.f2879b;
            if (j3 >= i11 - i12) {
                j3 -= i11 - i12;
                uVar = uVar.f2883f;
            }
        }
        while (j10 > 0) {
            int min = (int) Math.min(uVar.f2880c - i10, j10);
            this.f2857w.update(uVar.f2878a, (int) (uVar.f2879b + j3), min);
            j10 -= min;
            uVar = uVar.f2883f;
            j3 = 0;
        }
    }

    @Override // ca.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f2856v.close();
    }

    @Override // ca.y
    public final z d() {
        return this.f2854t.d();
    }
}
