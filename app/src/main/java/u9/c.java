package u9;

import ca.f;
import ca.j;
import ca.k;
import ca.x;
import ca.y;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.Objects;
import javax.annotation.Nullable;
import r9.c0;
import r9.g0;
import r9.r;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    public final i f19612a;

    /* renamed from: b */
    public final r f19613b;

    /* renamed from: c */
    public final d f19614c;

    /* renamed from: d */
    public final v9.c f19615d;

    /* renamed from: e */
    public boolean f19616e;

    /* loaded from: classes.dex */
    public final class a extends j {

        /* renamed from: t */
        public boolean f19617t;

        /* renamed from: u */
        public long f19618u;

        /* renamed from: v */
        public long f19619v;

        /* renamed from: w */
        public boolean f19620w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x xVar, long j3) {
            super(xVar);
            c.this = r1;
            this.f19618u = j3;
        }

        @Nullable
        public final IOException b(@Nullable IOException iOException) {
            if (this.f19617t) {
                return iOException;
            }
            this.f19617t = true;
            return c.this.a(false, true, iOException);
        }

        @Override // ca.j, ca.x, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f19620w) {
                return;
            }
            this.f19620w = true;
            long j3 = this.f19618u;
            if (j3 != -1 && this.f19619v != j3) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                b(null);
            } catch (IOException e10) {
                throw b(e10);
            }
        }

        @Override // ca.j, ca.x, java.io.Flushable
        public final void flush() {
            try {
                super.flush();
            } catch (IOException e10) {
                throw b(e10);
            }
        }

        @Override // ca.j, ca.x
        public final void q(f fVar, long j3) {
            if (!this.f19620w) {
                long j10 = this.f19618u;
                if (j10 == -1 || this.f19619v + j3 <= j10) {
                    try {
                        super.q(fVar, j3);
                        this.f19619v += j3;
                        return;
                    } catch (IOException e10) {
                        throw b(e10);
                    }
                }
                StringBuilder c10 = androidx.activity.result.a.c("expected ");
                c10.append(this.f19618u);
                c10.append(" bytes but received ");
                c10.append(this.f19619v + j3);
                throw new ProtocolException(c10.toString());
            }
            throw new IllegalStateException("closed");
        }
    }

    /* loaded from: classes.dex */
    public final class b extends k {

        /* renamed from: t */
        public final long f19622t;

        /* renamed from: u */
        public long f19623u;

        /* renamed from: v */
        public boolean f19624v;

        /* renamed from: w */
        public boolean f19625w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(y yVar, long j3) {
            super(yVar);
            c.this = r1;
            this.f19622t = j3;
            if (j3 == 0) {
                b(null);
            }
        }

        @Override // ca.k, ca.y
        public final long D(f fVar, long j3) {
            if (!this.f19625w) {
                try {
                    long D = this.f2851s.D(fVar, 8192L);
                    if (D == -1) {
                        b(null);
                        return -1L;
                    }
                    long j10 = this.f19623u + D;
                    long j11 = this.f19622t;
                    if (j11 != -1 && j10 > j11) {
                        throw new ProtocolException("expected " + this.f19622t + " bytes but received " + j10);
                    }
                    this.f19623u = j10;
                    if (j10 == j11) {
                        b(null);
                    }
                    return D;
                } catch (IOException e10) {
                    throw b(e10);
                }
            }
            throw new IllegalStateException("closed");
        }

        @Nullable
        public final IOException b(@Nullable IOException iOException) {
            if (this.f19624v) {
                return iOException;
            }
            this.f19624v = true;
            return c.this.a(true, false, iOException);
        }

        @Override // ca.k, ca.y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f19625w) {
                return;
            }
            this.f19625w = true;
            try {
                super.close();
                b(null);
            } catch (IOException e10) {
                throw b(e10);
            }
        }
    }

    public c(i iVar, r9.f fVar, r rVar, d dVar, v9.c cVar) {
        this.f19612a = iVar;
        this.f19613b = rVar;
        this.f19614c = dVar;
        this.f19615d = cVar;
    }

    @Nullable
    public final IOException a(boolean z10, boolean z11, @Nullable IOException iOException) {
        if (iOException != null) {
            e(iOException);
        }
        if (z11) {
            Objects.requireNonNull(this.f19613b);
        }
        if (z10) {
            Objects.requireNonNull(this.f19613b);
        }
        return this.f19612a.d(this, z11, z10, iOException);
    }

    public final e b() {
        return this.f19615d.h();
    }

    public final x c(c0 c0Var) {
        this.f19616e = false;
        long a10 = c0Var.f17314d.a();
        Objects.requireNonNull(this.f19613b);
        return new a(this.f19615d.f(c0Var, a10), a10);
    }

    @Nullable
    public final g0.a d(boolean z10) {
        try {
            g0.a g10 = this.f19615d.g(z10);
            if (g10 != null) {
                Objects.requireNonNull(s9.a.f18391a);
                g10.f17392m = this;
            }
            return g10;
        } catch (IOException e10) {
            Objects.requireNonNull(this.f19613b);
            e(e10);
            throw e10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r6 > 1) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.io.IOException r6) {
        /*
            r5 = this;
            u9.d r0 = r5.f19614c
            r0.e()
            v9.c r0 = r5.f19615d
            u9.e r0 = r0.h()
            u9.f r1 = r0.f19637b
            monitor-enter(r1)
            boolean r2 = r6 instanceof x9.v     // Catch: java.lang.Throwable -> L48
            r3 = 1
            if (r2 == 0) goto L28
            x9.v r6 = (x9.v) r6     // Catch: java.lang.Throwable -> L48
            int r6 = r6.f20240s     // Catch: java.lang.Throwable -> L48
            r2 = 5
            if (r6 != r2) goto L24
            int r6 = r0.f19649n     // Catch: java.lang.Throwable -> L48
            int r6 = r6 + r3
            r0.f19649n = r6     // Catch: java.lang.Throwable -> L48
            if (r6 <= r3) goto L46
        L21:
            r0.f19646k = r3     // Catch: java.lang.Throwable -> L48
            goto L41
        L24:
            r2 = 6
            if (r6 == r2) goto L46
            goto L21
        L28:
            boolean r2 = r0.g()     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto L32
            boolean r2 = r6 instanceof x9.a     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto L46
        L32:
            r0.f19646k = r3     // Catch: java.lang.Throwable -> L48
            int r2 = r0.f19648m     // Catch: java.lang.Throwable -> L48
            if (r2 != 0) goto L46
            if (r6 == 0) goto L41
            u9.f r2 = r0.f19637b     // Catch: java.lang.Throwable -> L48
            r9.j0 r4 = r0.f19638c     // Catch: java.lang.Throwable -> L48
            r2.a(r4, r6)     // Catch: java.lang.Throwable -> L48
        L41:
            int r6 = r0.f19647l     // Catch: java.lang.Throwable -> L48
            int r6 = r6 + r3
            r0.f19647l = r6     // Catch: java.lang.Throwable -> L48
        L46:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L48
            return
        L48:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L48
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: u9.c.e(java.io.IOException):void");
    }
}
