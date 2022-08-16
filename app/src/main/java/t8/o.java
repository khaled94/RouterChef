package t8;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class o extends InputStream {

    /* renamed from: s */
    public final InputStream f18785s;

    /* renamed from: t */
    public long f18786t;

    /* renamed from: u */
    public long f18787u;

    /* renamed from: v */
    public long f18788v;

    /* renamed from: w */
    public long f18789w = -1;

    /* renamed from: x */
    public boolean f18790x = true;
    public int y;

    public o(InputStream inputStream) {
        this.y = -1;
        this.f18785s = !inputStream.markSupported() ? new BufferedInputStream(inputStream, 4096) : inputStream;
        this.y = 1024;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f18785s.available();
    }

    public final void b(long j3) {
        if (this.f18786t > this.f18788v || j3 < this.f18787u) {
            throw new IOException("Cannot reset");
        }
        this.f18785s.reset();
        j(this.f18787u, j3);
        this.f18786t = j3;
    }

    public final void c(long j3) {
        try {
            long j10 = this.f18787u;
            long j11 = this.f18786t;
            if (j10 >= j11 || j11 > this.f18788v) {
                this.f18787u = j11;
                this.f18785s.mark((int) (j3 - j11));
            } else {
                this.f18785s.reset();
                this.f18785s.mark((int) (j3 - this.f18787u));
                j(this.f18787u, this.f18786t);
            }
            this.f18788v = j3;
        } catch (IOException e10) {
            throw new IllegalStateException("Unable to mark: " + e10);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f18785s.close();
    }

    public final void j(long j3, long j10) {
        while (j3 < j10) {
            long skip = this.f18785s.skip(j10 - j3);
            if (skip == 0) {
                if (read() == -1) {
                    return;
                }
                skip = 1;
            }
            j3 += skip;
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i10) {
        long j3 = this.f18786t + i10;
        if (this.f18788v < j3) {
            c(j3);
        }
        this.f18789w = this.f18786t;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f18785s.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() {
        if (!this.f18790x) {
            long j3 = this.f18788v;
            if (this.f18786t + 1 > j3) {
                c(j3 + this.y);
            }
        }
        int read = this.f18785s.read();
        if (read != -1) {
            this.f18786t++;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        if (!this.f18790x) {
            long j3 = this.f18786t;
            if (bArr.length + j3 > this.f18788v) {
                c(j3 + bArr.length + this.y);
            }
        }
        int read = this.f18785s.read(bArr);
        if (read != -1) {
            this.f18786t += read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        if (!this.f18790x) {
            long j3 = this.f18786t;
            long j10 = i11;
            if (j3 + j10 > this.f18788v) {
                c(j3 + j10 + this.y);
            }
        }
        int read = this.f18785s.read(bArr, i10, i11);
        if (read != -1) {
            this.f18786t += read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final void reset() {
        b(this.f18789w);
    }

    @Override // java.io.InputStream
    public final long skip(long j3) {
        if (!this.f18790x) {
            long j10 = this.f18786t;
            if (j10 + j3 > this.f18788v) {
                c(j10 + j3 + this.y);
            }
        }
        long skip = this.f18785s.skip(j3);
        this.f18786t += skip;
        return skip;
    }
}
