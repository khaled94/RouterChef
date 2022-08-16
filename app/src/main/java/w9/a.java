package w9;

import ca.g;
import ca.h;
import ca.l;
import ca.x;
import ca.y;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import r9.c0;
import r9.g0;
import r9.u;
import r9.v;
import r9.z;
import v9.j;

/* loaded from: classes.dex */
public final class a implements v9.c {

    /* renamed from: a */
    public final z f19943a;

    /* renamed from: b */
    public final u9.e f19944b;

    /* renamed from: c */
    public final h f19945c;

    /* renamed from: d */
    public final g f19946d;

    /* renamed from: e */
    public int f19947e = 0;

    /* renamed from: f */
    public long f19948f = 262144;

    /* renamed from: g */
    public u f19949g;

    /* renamed from: w9.a$a */
    /* loaded from: classes.dex */
    public abstract class AbstractC0146a implements y {

        /* renamed from: s */
        public final l f19950s;

        /* renamed from: t */
        public boolean f19951t;

        public AbstractC0146a() {
            a.this = r2;
            this.f19950s = new l(r2.f19945c.d());
        }

        @Override // ca.y
        public long D(ca.f fVar, long j3) {
            try {
                return a.this.f19945c.D(fVar, j3);
            } catch (IOException e10) {
                a.this.f19944b.i();
                b();
                throw e10;
            }
        }

        public final void b() {
            a aVar = a.this;
            int i10 = aVar.f19947e;
            if (i10 == 6) {
                return;
            }
            if (i10 == 5) {
                a.i(aVar, this.f19950s);
                a.this.f19947e = 6;
                return;
            }
            StringBuilder c10 = androidx.activity.result.a.c("state: ");
            c10.append(a.this.f19947e);
            throw new IllegalStateException(c10.toString());
        }

        @Override // ca.y
        public final ca.z d() {
            return this.f19950s;
        }
    }

    /* loaded from: classes.dex */
    public final class b implements x {

        /* renamed from: s */
        public final l f19953s;

        /* renamed from: t */
        public boolean f19954t;

        public b() {
            a.this = r2;
            this.f19953s = new l(r2.f19946d.d());
        }

        @Override // ca.x, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            if (this.f19954t) {
                return;
            }
            this.f19954t = true;
            a.this.f19946d.f0("0\r\n\r\n");
            a.i(a.this, this.f19953s);
            a.this.f19947e = 3;
        }

        @Override // ca.x
        public final ca.z d() {
            return this.f19953s;
        }

        @Override // ca.x, java.io.Flushable
        public final synchronized void flush() {
            if (this.f19954t) {
                return;
            }
            a.this.f19946d.flush();
        }

        @Override // ca.x
        public final void q(ca.f fVar, long j3) {
            if (!this.f19954t) {
                if (j3 == 0) {
                    return;
                }
                a.this.f19946d.l(j3);
                a.this.f19946d.f0("\r\n");
                a.this.f19946d.q(fVar, j3);
                a.this.f19946d.f0("\r\n");
                return;
            }
            throw new IllegalStateException("closed");
        }
    }

    /* loaded from: classes.dex */
    public class c extends AbstractC0146a {

        /* renamed from: v */
        public final v f19956v;

        /* renamed from: w */
        public long f19957w = -1;

        /* renamed from: x */
        public boolean f19958x = true;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v vVar) {
            super();
            a.this = r3;
            this.f19956v = vVar;
        }

        @Override // w9.a.AbstractC0146a, ca.y
        public final long D(ca.f fVar, long j3) {
            if (!this.f19951t) {
                if (!this.f19958x) {
                    return -1L;
                }
                long j10 = this.f19957w;
                if (j10 == 0 || j10 == -1) {
                    if (j10 != -1) {
                        a.this.f19945c.w();
                    }
                    try {
                        this.f19957w = a.this.f19945c.k0();
                        String trim = a.this.f19945c.w().trim();
                        if (this.f19957w >= 0 && (trim.isEmpty() || trim.startsWith(";"))) {
                            if (this.f19957w == 0) {
                                this.f19958x = false;
                                a aVar = a.this;
                                aVar.f19949g = aVar.l();
                                a aVar2 = a.this;
                                v9.e.d(aVar2.f19943a.f17517z, this.f19956v, aVar2.f19949g);
                                b();
                            }
                            if (!this.f19958x) {
                                return -1L;
                            }
                        } else {
                            throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f19957w + trim + "\"");
                        }
                    } catch (NumberFormatException e10) {
                        throw new ProtocolException(e10.getMessage());
                    }
                }
                long D = super.D(fVar, Math.min(8192L, this.f19957w));
                if (D != -1) {
                    this.f19957w -= D;
                    return D;
                }
                a.this.f19944b.i();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                b();
                throw protocolException;
            }
            throw new IllegalStateException("closed");
        }

        @Override // ca.y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f19951t) {
                return;
            }
            if (this.f19958x) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (!s9.e.i(this)) {
                    a.this.f19944b.i();
                    b();
                }
            }
            this.f19951t = true;
        }
    }

    /* loaded from: classes.dex */
    public class d extends AbstractC0146a {

        /* renamed from: v */
        public long f19959v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j3) {
            super();
            a.this = r3;
            this.f19959v = j3;
            if (j3 == 0) {
                b();
            }
        }

        @Override // w9.a.AbstractC0146a, ca.y
        public final long D(ca.f fVar, long j3) {
            if (!this.f19951t) {
                long j10 = this.f19959v;
                if (j10 == 0) {
                    return -1L;
                }
                long D = super.D(fVar, Math.min(j10, 8192L));
                if (D == -1) {
                    a.this.f19944b.i();
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    b();
                    throw protocolException;
                }
                long j11 = this.f19959v - D;
                this.f19959v = j11;
                if (j11 == 0) {
                    b();
                }
                return D;
            }
            throw new IllegalStateException("closed");
        }

        @Override // ca.y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f19951t) {
                return;
            }
            if (this.f19959v != 0) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                if (!s9.e.i(this)) {
                    a.this.f19944b.i();
                    b();
                }
            }
            this.f19951t = true;
        }
    }

    /* loaded from: classes.dex */
    public final class e implements x {

        /* renamed from: s */
        public final l f19961s;

        /* renamed from: t */
        public boolean f19962t;

        public e() {
            a.this = r2;
            this.f19961s = new l(r2.f19946d.d());
        }

        @Override // ca.x, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f19962t) {
                return;
            }
            this.f19962t = true;
            a.i(a.this, this.f19961s);
            a.this.f19947e = 3;
        }

        @Override // ca.x
        public final ca.z d() {
            return this.f19961s;
        }

        @Override // ca.x, java.io.Flushable
        public final void flush() {
            if (this.f19962t) {
                return;
            }
            a.this.f19946d.flush();
        }

        @Override // ca.x
        public final void q(ca.f fVar, long j3) {
            if (!this.f19962t) {
                s9.e.b(fVar.f2843t, 0L, j3);
                a.this.f19946d.q(fVar, j3);
                return;
            }
            throw new IllegalStateException("closed");
        }
    }

    /* loaded from: classes.dex */
    public class f extends AbstractC0146a {

        /* renamed from: v */
        public boolean f19964v;

        public f(a aVar) {
            super();
        }

        @Override // w9.a.AbstractC0146a, ca.y
        public final long D(ca.f fVar, long j3) {
            if (!this.f19951t) {
                if (this.f19964v) {
                    return -1L;
                }
                long D = super.D(fVar, 8192L);
                if (D != -1) {
                    return D;
                }
                this.f19964v = true;
                b();
                return -1L;
            }
            throw new IllegalStateException("closed");
        }

        @Override // ca.y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.f19951t) {
                return;
            }
            if (!this.f19964v) {
                b();
            }
            this.f19951t = true;
        }
    }

    public a(z zVar, u9.e eVar, h hVar, g gVar) {
        this.f19943a = zVar;
        this.f19944b = eVar;
        this.f19945c = hVar;
        this.f19946d = gVar;
    }

    public static void i(a aVar, l lVar) {
        Objects.requireNonNull(aVar);
        ca.z zVar = lVar.f2852e;
        lVar.f2852e = ca.z.f2888d;
        zVar.a();
        zVar.b();
    }

    @Override // v9.c
    public final long a(g0 g0Var) {
        if (!v9.e.b(g0Var)) {
            return 0L;
        }
        if (!"chunked".equalsIgnoreCase(g0Var.c("Transfer-Encoding"))) {
            return v9.e.a(g0Var);
        }
        return -1L;
    }

    @Override // v9.c
    public final y b(g0 g0Var) {
        if (!v9.e.b(g0Var)) {
            return j(0L);
        }
        if ("chunked".equalsIgnoreCase(g0Var.c("Transfer-Encoding"))) {
            v vVar = g0Var.f17373s.f17311a;
            if (this.f19947e == 4) {
                this.f19947e = 5;
                return new c(vVar);
            }
            StringBuilder c10 = androidx.activity.result.a.c("state: ");
            c10.append(this.f19947e);
            throw new IllegalStateException(c10.toString());
        }
        long a10 = v9.e.a(g0Var);
        if (a10 != -1) {
            return j(a10);
        }
        if (this.f19947e == 4) {
            this.f19947e = 5;
            this.f19944b.i();
            return new f(this);
        }
        StringBuilder c11 = androidx.activity.result.a.c("state: ");
        c11.append(this.f19947e);
        throw new IllegalStateException(c11.toString());
    }

    @Override // v9.c
    public final void c() {
        this.f19946d.flush();
    }

    @Override // v9.c
    public final void cancel() {
        u9.e eVar = this.f19944b;
        if (eVar != null) {
            s9.e.d(eVar.f19639d);
        }
    }

    @Override // v9.c
    public final void d() {
        this.f19946d.flush();
    }

    @Override // v9.c
    public final void e(c0 c0Var) {
        Proxy.Type type = this.f19944b.f19638c.f17423b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(c0Var.f17312b);
        sb.append(' ');
        if (!c0Var.f17311a.f17475a.equals("https") && type == Proxy.Type.HTTP) {
            sb.append(c0Var.f17311a);
        } else {
            sb.append(v9.h.a(c0Var.f17311a));
        }
        sb.append(" HTTP/1.1");
        m(c0Var.f17313c, sb.toString());
    }

    @Override // v9.c
    public final x f(c0 c0Var, long j3) {
        if ("chunked".equalsIgnoreCase(c0Var.b("Transfer-Encoding"))) {
            if (this.f19947e == 1) {
                this.f19947e = 2;
                return new b();
            }
            StringBuilder c10 = androidx.activity.result.a.c("state: ");
            c10.append(this.f19947e);
            throw new IllegalStateException(c10.toString());
        } else if (j3 != -1) {
            if (this.f19947e == 1) {
                this.f19947e = 2;
                return new e();
            }
            StringBuilder c11 = androidx.activity.result.a.c("state: ");
            c11.append(this.f19947e);
            throw new IllegalStateException(c11.toString());
        } else {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
    }

    @Override // v9.c
    public final g0.a g(boolean z10) {
        int i10 = this.f19947e;
        if (i10 != 1 && i10 != 3) {
            StringBuilder c10 = androidx.activity.result.a.c("state: ");
            c10.append(this.f19947e);
            throw new IllegalStateException(c10.toString());
        }
        try {
            String N = this.f19945c.N(this.f19948f);
            this.f19948f -= N.length();
            j a10 = j.a(N);
            g0.a aVar = new g0.a();
            aVar.f17381b = a10.f19856a;
            aVar.f17382c = a10.f19857b;
            aVar.f17383d = a10.f19858c;
            aVar.f17385f = l().e();
            if (z10 && a10.f19857b == 100) {
                return null;
            }
            if (a10.f19857b == 100) {
                this.f19947e = 3;
                return aVar;
            }
            this.f19947e = 4;
            return aVar;
        } catch (EOFException e10) {
            u9.e eVar = this.f19944b;
            throw new IOException(d7.a.c("unexpected end of stream on ", eVar != null ? eVar.f19638c.f17422a.f17283a.q() : "unknown"), e10);
        }
    }

    @Override // v9.c
    public final u9.e h() {
        return this.f19944b;
    }

    public final y j(long j3) {
        if (this.f19947e == 4) {
            this.f19947e = 5;
            return new d(j3);
        }
        StringBuilder c10 = androidx.activity.result.a.c("state: ");
        c10.append(this.f19947e);
        throw new IllegalStateException(c10.toString());
    }

    public final String k() {
        String N = this.f19945c.N(this.f19948f);
        this.f19948f -= N.length();
        return N;
    }

    public final u l() {
        u.a aVar = new u.a();
        while (true) {
            String k10 = k();
            if (k10.length() != 0) {
                Objects.requireNonNull(s9.a.f18391a);
                aVar.b(k10);
            } else {
                return new u(aVar);
            }
        }
    }

    public final void m(u uVar, String str) {
        if (this.f19947e == 0) {
            this.f19946d.f0(str).f0("\r\n");
            int length = uVar.f17472a.length / 2;
            for (int i10 = 0; i10 < length; i10++) {
                this.f19946d.f0(uVar.d(i10)).f0(": ").f0(uVar.g(i10)).f0("\r\n");
            }
            this.f19946d.f0("\r\n");
            this.f19947e = 1;
            return;
        }
        StringBuilder c10 = androidx.activity.result.a.c("state: ");
        c10.append(this.f19947e);
        throw new IllegalStateException(c10.toString());
    }
}
