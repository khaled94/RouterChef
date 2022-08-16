package ca;

import androidx.activity.result.a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* loaded from: classes.dex */
public final class s implements g {

    /* renamed from: s */
    public final f f2871s = new f();

    /* renamed from: t */
    public final x f2872t;

    /* renamed from: u */
    public boolean f2873u;

    public s(x xVar) {
        this.f2872t = xVar;
    }

    @Override // ca.g
    public final g F(byte[] bArr) {
        if (!this.f2873u) {
            this.f2871s.y0(bArr);
            K();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // ca.g
    public final g J(i iVar) {
        if (!this.f2873u) {
            this.f2871s.x0(iVar);
            K();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // ca.g
    public final g K() {
        if (!this.f2873u) {
            long c10 = this.f2871s.c();
            if (c10 > 0) {
                this.f2872t.q(this.f2871s, c10);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // ca.g
    public final f a() {
        return this.f2871s;
    }

    @Override // ca.x, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f2873u) {
            return;
        }
        Throwable th = null;
        try {
            f fVar = this.f2871s;
            long j3 = fVar.f2843t;
            if (j3 > 0) {
                this.f2872t.q(fVar, j3);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f2872t.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f2873u = true;
        if (th == null) {
            return;
        }
        Charset charset = a0.f2829a;
        throw th;
    }

    @Override // ca.x
    public final z d() {
        return this.f2872t.d();
    }

    @Override // ca.g
    public final g e(byte[] bArr, int i10, int i11) {
        if (!this.f2873u) {
            this.f2871s.z0(bArr, i10, i11);
            K();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // ca.g
    public final g f0(String str) {
        if (!this.f2873u) {
            f fVar = this.f2871s;
            Objects.requireNonNull(fVar);
            fVar.H0(str, 0, str.length());
            K();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // ca.g, ca.x, java.io.Flushable
    public final void flush() {
        if (!this.f2873u) {
            f fVar = this.f2871s;
            long j3 = fVar.f2843t;
            if (j3 > 0) {
                this.f2872t.q(fVar, j3);
            }
            this.f2872t.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // ca.g
    public final g g0(long j3) {
        if (!this.f2873u) {
            this.f2871s.g0(j3);
            K();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f2873u;
    }

    @Override // ca.g
    public final g l(long j3) {
        if (!this.f2873u) {
            this.f2871s.l(j3);
            K();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // ca.x
    public final void q(f fVar, long j3) {
        if (!this.f2873u) {
            this.f2871s.q(fVar, j3);
            K();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // ca.g
    public final g r(int i10) {
        if (!this.f2873u) {
            this.f2871s.F0(i10);
            K();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public final String toString() {
        StringBuilder c10 = a.c("buffer(");
        c10.append(this.f2872t);
        c10.append(")");
        return c10.toString();
    }

    @Override // ca.g
    public final g u(int i10) {
        if (!this.f2873u) {
            this.f2871s.E0(i10);
            K();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (!this.f2873u) {
            int write = this.f2871s.write(byteBuffer);
            K();
            return write;
        }
        throw new IllegalStateException("closed");
    }

    @Override // ca.g
    public final g z(int i10) {
        if (!this.f2873u) {
            this.f2871s.B0(i10);
            K();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
