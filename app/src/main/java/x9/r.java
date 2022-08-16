package x9;

import ca.f;
import ca.g;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import x9.c;

/* loaded from: classes.dex */
public final class r implements Closeable {
    public static final Logger y = Logger.getLogger(d.class.getName());

    /* renamed from: s */
    public final g f20224s;

    /* renamed from: t */
    public final boolean f20225t;

    /* renamed from: u */
    public final f f20226u;

    /* renamed from: v */
    public int f20227v = 16384;

    /* renamed from: w */
    public boolean f20228w;

    /* renamed from: x */
    public final c.b f20229x;

    public r(g gVar, boolean z10) {
        this.f20224s = gVar;
        this.f20225t = z10;
        f fVar = new f();
        this.f20226u = fVar;
        this.f20229x = new c.b(fVar);
    }

    public final synchronized void G(int i10, int i11, byte[] bArr) {
        if (this.f20228w) {
            throw new IOException("closed");
        }
        if (r7.c.b(i11) == -1) {
            d.b("errorCode.httpCode == -1", new Object[0]);
            throw null;
        }
        j(0, bArr.length + 8, (byte) 7, (byte) 0);
        this.f20224s.u(i10);
        this.f20224s.u(r7.c.b(i11));
        if (bArr.length > 0) {
            this.f20224s.F(bArr);
        }
        this.f20224s.flush();
    }

    public final synchronized void H(boolean z10, int i10, List<b> list) {
        if (this.f20228w) {
            throw new IOException("closed");
        }
        this.f20229x.e(list);
        long j3 = this.f20226u.f2843t;
        int min = (int) Math.min(this.f20227v, j3);
        long j10 = min;
        int i11 = (j3 > j10 ? 1 : (j3 == j10 ? 0 : -1));
        byte b10 = i11 == 0 ? (byte) 4 : (byte) 0;
        if (z10) {
            b10 = (byte) (b10 | 1);
        }
        j(i10, min, (byte) 1, b10);
        this.f20224s.q(this.f20226u, j10);
        if (i11 > 0) {
            Z(i10, j3 - j10);
        }
    }

    public final synchronized void I(boolean z10, int i10, int i11) {
        if (this.f20228w) {
            throw new IOException("closed");
        }
        j(0, 8, (byte) 6, z10 ? (byte) 1 : (byte) 0);
        this.f20224s.u(i10);
        this.f20224s.u(i11);
        this.f20224s.flush();
    }

    public final synchronized void L(int i10, int i11) {
        if (this.f20228w) {
            throw new IOException("closed");
        }
        if (r7.c.b(i11) == -1) {
            throw new IllegalArgumentException();
        }
        j(i10, 4, (byte) 3, (byte) 0);
        this.f20224s.u(r7.c.b(i11));
        this.f20224s.flush();
    }

    public final synchronized void Y(int i10, long j3) {
        if (this.f20228w) {
            throw new IOException("closed");
        }
        if (j3 == 0 || j3 > 2147483647L) {
            d.b("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j3));
            throw null;
        }
        j(i10, 4, (byte) 8, (byte) 0);
        this.f20224s.u((int) j3);
        this.f20224s.flush();
    }

    public final void Z(int i10, long j3) {
        while (j3 > 0) {
            int min = (int) Math.min(this.f20227v, j3);
            long j10 = min;
            j3 -= j10;
            j(i10, min, (byte) 9, j3 == 0 ? (byte) 4 : (byte) 0);
            this.f20224s.q(this.f20226u, j10);
        }
    }

    public final synchronized void b(u uVar) {
        if (this.f20228w) {
            throw new IOException("closed");
        }
        int i10 = this.f20227v;
        int i11 = uVar.f20238a;
        if ((i11 & 32) != 0) {
            i10 = uVar.f20239b[5];
        }
        this.f20227v = i10;
        int i12 = i11 & 2;
        int i13 = -1;
        if ((i12 != 0 ? uVar.f20239b[1] : -1) != -1) {
            c.b bVar = this.f20229x;
            if (i12 != 0) {
                i13 = uVar.f20239b[1];
            }
            bVar.c(i13);
        }
        j(0, 0, (byte) 4, (byte) 1);
        this.f20224s.flush();
    }

    public final synchronized void c(boolean z10, int i10, f fVar, int i11) {
        if (this.f20228w) {
            throw new IOException("closed");
        }
        j(i10, i11, (byte) 0, z10 ? (byte) 1 : (byte) 0);
        if (i11 > 0) {
            this.f20224s.q(fVar, i11);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f20228w = true;
        this.f20224s.close();
    }

    public final synchronized void flush() {
        if (this.f20228w) {
            throw new IOException("closed");
        }
        this.f20224s.flush();
    }

    public final void j(int i10, int i11, byte b10, byte b11) {
        Logger logger = y;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(d.a(false, i10, i11, b10, b11));
        }
        int i12 = this.f20227v;
        if (i11 > i12) {
            d.b("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i12), Integer.valueOf(i11));
            throw null;
        } else if ((Integer.MIN_VALUE & i10) != 0) {
            d.b("reserved bit set: %s", Integer.valueOf(i10));
            throw null;
        } else {
            g gVar = this.f20224s;
            gVar.z((i11 >>> 16) & 255);
            gVar.z((i11 >>> 8) & 255);
            gVar.z(i11 & 255);
            this.f20224s.z(b10 & 255);
            this.f20224s.z(b11 & 255);
            this.f20224s.u(i10 & Integer.MAX_VALUE);
        }
    }
}
