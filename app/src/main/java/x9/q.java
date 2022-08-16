package x9;

import ca.f;
import ca.x;
import ca.y;
import ca.z;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;
import java.util.concurrent.RejectedExecutionException;
import javax.annotation.Nullable;
import r9.u;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: b */
    public long f20202b;

    /* renamed from: c */
    public final int f20203c;

    /* renamed from: d */
    public final f f20204d;

    /* renamed from: e */
    public final Deque<u> f20205e;

    /* renamed from: f */
    public boolean f20206f;

    /* renamed from: g */
    public final b f20207g;

    /* renamed from: h */
    public final a f20208h;
    @Nullable

    /* renamed from: k */
    public int f20211k;
    @Nullable

    /* renamed from: l */
    public IOException f20212l;

    /* renamed from: a */
    public long f20201a = 0;

    /* renamed from: i */
    public final c f20209i = new c();

    /* renamed from: j */
    public final c f20210j = new c();

    /* loaded from: classes.dex */
    public final class a implements x {

        /* renamed from: s */
        public final f f20213s = new f();

        /* renamed from: t */
        public boolean f20214t;

        /* renamed from: u */
        public boolean f20215u;

        public a() {
            q.this = r1;
        }

        public final void b(boolean z10) {
            q qVar;
            long min;
            q qVar2;
            boolean z11;
            synchronized (q.this) {
                q.this.f20210j.i();
                while (true) {
                    qVar = q.this;
                    if (qVar.f20202b > 0 || this.f20215u || this.f20214t || qVar.f20211k != 0) {
                        break;
                    }
                    qVar.j();
                }
                qVar.f20210j.o();
                q.this.b();
                min = Math.min(q.this.f20202b, this.f20213s.f2843t);
                qVar2 = q.this;
                qVar2.f20202b -= min;
            }
            qVar2.f20210j.i();
            if (z10) {
                try {
                    if (min == this.f20213s.f2843t) {
                        z11 = true;
                        boolean z12 = z11;
                        q qVar3 = q.this;
                        qVar3.f20204d.d0(qVar3.f20203c, z12, this.f20213s, min);
                        q.this.f20210j.o();
                    }
                } catch (Throwable th) {
                    q.this.f20210j.o();
                    throw th;
                }
            }
            z11 = false;
            boolean z122 = z11;
            q qVar32 = q.this;
            qVar32.f20204d.d0(qVar32.f20203c, z122, this.f20213s, min);
            q.this.f20210j.o();
        }

        @Override // ca.x, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            synchronized (q.this) {
                if (this.f20214t) {
                    return;
                }
                q qVar = q.this;
                if (!qVar.f20208h.f20215u) {
                    if (this.f20213s.f2843t > 0) {
                        while (this.f20213s.f2843t > 0) {
                            b(true);
                        }
                    } else {
                        qVar.f20204d.d0(qVar.f20203c, true, null, 0L);
                    }
                }
                synchronized (q.this) {
                    this.f20214t = true;
                }
                q.this.f20204d.flush();
                q.this.a();
            }
        }

        @Override // ca.x
        public final z d() {
            return q.this.f20210j;
        }

        @Override // ca.x, java.io.Flushable
        public final void flush() {
            synchronized (q.this) {
                q.this.b();
            }
            while (this.f20213s.f2843t > 0) {
                b(false);
                q.this.f20204d.flush();
            }
        }

        @Override // ca.x
        public final void q(f fVar, long j3) {
            this.f20213s.q(fVar, j3);
            while (this.f20213s.f2843t >= 16384) {
                b(false);
            }
        }
    }

    /* loaded from: classes.dex */
    public final class b implements y {

        /* renamed from: s */
        public final f f20217s = new f();

        /* renamed from: t */
        public final f f20218t = new f();

        /* renamed from: u */
        public final long f20219u;

        /* renamed from: v */
        public boolean f20220v;

        /* renamed from: w */
        public boolean f20221w;

        public b(long j3) {
            q.this = r1;
            this.f20219u = j3;
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
            r0 = -1;
         */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
        @Override // ca.y
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final long D(ca.f r13, long r14) {
            /*
                r12 = this;
            L0:
                r14 = 0
                x9.q r15 = x9.q.this
                monitor-enter(r15)
                x9.q r0 = x9.q.this     // Catch: java.lang.Throwable -> L9b
                x9.q$c r0 = r0.f20209i     // Catch: java.lang.Throwable -> L9b
                r0.i()     // Catch: java.lang.Throwable -> L9b
                x9.q r0 = x9.q.this     // Catch: java.lang.Throwable -> L92
                int r1 = r0.f20211k     // Catch: java.lang.Throwable -> L92
                if (r1 == 0) goto L1f
                java.io.IOException r14 = r0.f20212l     // Catch: java.lang.Throwable -> L92
                if (r14 == 0) goto L16
                goto L1f
            L16:
                x9.v r14 = new x9.v     // Catch: java.lang.Throwable -> L92
                x9.q r0 = x9.q.this     // Catch: java.lang.Throwable -> L92
                int r0 = r0.f20211k     // Catch: java.lang.Throwable -> L92
                r14.<init>(r0)     // Catch: java.lang.Throwable -> L92
            L1f:
                boolean r0 = r12.f20220v     // Catch: java.lang.Throwable -> L92
                if (r0 != 0) goto L8a
                ca.f r0 = r12.f20218t     // Catch: java.lang.Throwable -> L92
                long r1 = r0.f2843t     // Catch: java.lang.Throwable -> L92
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                r6 = -1
                if (r5 <= 0) goto L61
                r8 = 8192(0x2000, double:4.0474E-320)
                long r1 = java.lang.Math.min(r8, r1)     // Catch: java.lang.Throwable -> L92
                long r0 = r0.D(r13, r1)     // Catch: java.lang.Throwable -> L92
                x9.q r13 = x9.q.this     // Catch: java.lang.Throwable -> L92
                long r8 = r13.f20201a     // Catch: java.lang.Throwable -> L92
                long r8 = r8 + r0
                r13.f20201a = r8     // Catch: java.lang.Throwable -> L92
                if (r14 != 0) goto L76
                x9.f r13 = r13.f20204d     // Catch: java.lang.Throwable -> L92
                x9.u r13 = r13.J     // Catch: java.lang.Throwable -> L92
                int r13 = r13.a()     // Catch: java.lang.Throwable -> L92
                int r13 = r13 / 2
                long r10 = (long) r13     // Catch: java.lang.Throwable -> L92
                int r13 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r13 < 0) goto L76
                x9.q r13 = x9.q.this     // Catch: java.lang.Throwable -> L92
                x9.f r2 = r13.f20204d     // Catch: java.lang.Throwable -> L92
                int r5 = r13.f20203c     // Catch: java.lang.Throwable -> L92
                long r8 = r13.f20201a     // Catch: java.lang.Throwable -> L92
                r2.n0(r5, r8)     // Catch: java.lang.Throwable -> L92
                x9.q r13 = x9.q.this     // Catch: java.lang.Throwable -> L92
                r13.f20201a = r3     // Catch: java.lang.Throwable -> L92
                goto L76
            L61:
                boolean r0 = r12.f20221w     // Catch: java.lang.Throwable -> L92
                if (r0 != 0) goto L75
                if (r14 != 0) goto L75
                x9.q r14 = x9.q.this     // Catch: java.lang.Throwable -> L92
                r14.j()     // Catch: java.lang.Throwable -> L92
                x9.q r14 = x9.q.this     // Catch: java.lang.Throwable -> L9b
                x9.q$c r14 = r14.f20209i     // Catch: java.lang.Throwable -> L9b
                r14.o()     // Catch: java.lang.Throwable -> L9b
                monitor-exit(r15)     // Catch: java.lang.Throwable -> L9b
                goto L0
            L75:
                r0 = r6
            L76:
                x9.q r13 = x9.q.this     // Catch: java.lang.Throwable -> L9b
                x9.q$c r13 = r13.f20209i     // Catch: java.lang.Throwable -> L9b
                r13.o()     // Catch: java.lang.Throwable -> L9b
                monitor-exit(r15)     // Catch: java.lang.Throwable -> L9b
                int r13 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
                if (r13 == 0) goto L86
                r12.b(r0)
                return r0
            L86:
                if (r14 != 0) goto L89
                return r6
            L89:
                throw r14
            L8a:
                java.io.IOException r13 = new java.io.IOException     // Catch: java.lang.Throwable -> L92
                java.lang.String r14 = "stream closed"
                r13.<init>(r14)     // Catch: java.lang.Throwable -> L92
                throw r13     // Catch: java.lang.Throwable -> L92
            L92:
                r13 = move-exception
                x9.q r14 = x9.q.this     // Catch: java.lang.Throwable -> L9b
                x9.q$c r14 = r14.f20209i     // Catch: java.lang.Throwable -> L9b
                r14.o()     // Catch: java.lang.Throwable -> L9b
                throw r13     // Catch: java.lang.Throwable -> L9b
            L9b:
                r13 = move-exception
                monitor-exit(r15)     // Catch: java.lang.Throwable -> L9b
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: x9.q.b.D(ca.f, long):long");
        }

        public final void b(long j3) {
            q.this.f20204d.Z(j3);
        }

        @Override // ca.y, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            long j3;
            synchronized (q.this) {
                this.f20220v = true;
                f fVar = this.f20218t;
                j3 = fVar.f2843t;
                fVar.b();
                q.this.notifyAll();
            }
            if (j3 > 0) {
                b(j3);
            }
            q.this.a();
        }

        @Override // ca.y
        public final z d() {
            return q.this.f20209i;
        }
    }

    /* loaded from: classes.dex */
    public class c extends ca.c {
        public c() {
            q.this = r1;
        }

        @Override // ca.c
        public final IOException m(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // ca.c
        public final void n() {
            q.this.e(6);
            f fVar = q.this.f20204d;
            synchronized (fVar) {
                long j3 = fVar.F;
                long j10 = fVar.E;
                if (j3 < j10) {
                    return;
                }
                fVar.E = j10 + 1;
                fVar.G = System.nanoTime() + 1000000000;
                try {
                    fVar.f20145z.execute(new g(fVar, fVar.f20142v));
                } catch (RejectedExecutionException unused) {
                }
            }
        }

        public final void o() {
            if (!l()) {
                return;
            }
            throw m(null);
        }
    }

    public q(int i10, f fVar, boolean z10, boolean z11, @Nullable u uVar) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f20205e = arrayDeque;
        Objects.requireNonNull(fVar, "connection == null");
        this.f20203c = i10;
        this.f20204d = fVar;
        this.f20202b = fVar.K.a();
        b bVar = new b(fVar.J.a());
        this.f20207g = bVar;
        a aVar = new a();
        this.f20208h = aVar;
        bVar.f20221w = z11;
        aVar.f20215u = z10;
        if (uVar != null) {
            arrayDeque.add(uVar);
        }
        if (!g() || uVar == null) {
            if (!g() && uVar == null) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
            return;
        }
        throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
    }

    public final void a() {
        boolean z10;
        boolean h10;
        synchronized (this) {
            b bVar = this.f20207g;
            if (!bVar.f20221w && bVar.f20220v) {
                a aVar = this.f20208h;
                if (aVar.f20215u || aVar.f20214t) {
                    z10 = true;
                    h10 = h();
                }
            }
            z10 = false;
            h10 = h();
        }
        if (z10) {
            c(6, null);
        } else if (h10) {
        } else {
            this.f20204d.L(this.f20203c);
        }
    }

    public final void b() {
        a aVar = this.f20208h;
        if (!aVar.f20214t) {
            if (aVar.f20215u) {
                throw new IOException("stream finished");
            }
            if (this.f20211k == 0) {
                return;
            }
            IOException iOException = this.f20212l;
            if (iOException == null) {
                throw new v(this.f20211k);
            }
            throw iOException;
        }
        throw new IOException("stream closed");
    }

    public final void c(int i10, @Nullable IOException iOException) {
        if (!d(i10, iOException)) {
            return;
        }
        f fVar = this.f20204d;
        fVar.M.L(this.f20203c, i10);
    }

    public final boolean d(int i10, @Nullable IOException iOException) {
        synchronized (this) {
            if (this.f20211k != 0) {
                return false;
            }
            if (this.f20207g.f20221w && this.f20208h.f20215u) {
                return false;
            }
            this.f20211k = i10;
            this.f20212l = iOException;
            notifyAll();
            this.f20204d.L(this.f20203c);
            return true;
        }
    }

    public final void e(int i10) {
        if (!d(i10, null)) {
            return;
        }
        this.f20204d.m0(this.f20203c, i10);
    }

    public final x f() {
        synchronized (this) {
            if (!this.f20206f && !g()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f20208h;
    }

    public final boolean g() {
        return this.f20204d.f20139s == ((this.f20203c & 1) == 1);
    }

    public final synchronized boolean h() {
        if (this.f20211k != 0) {
            return false;
        }
        b bVar = this.f20207g;
        if (bVar.f20221w || bVar.f20220v) {
            a aVar = this.f20208h;
            if (aVar.f20215u || aVar.f20214t) {
                if (this.f20206f) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018 A[Catch: all -> 0x002e, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0009, B:8:0x000f, B:10:0x0018, B:11:0x001c, B:12:0x0023), top: B:19:0x0001 }] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayDeque, java.util.Deque<r9.u>] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(r9.u r3, boolean r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f20206f     // Catch: java.lang.Throwable -> L2e
            r1 = 1
            if (r0 == 0) goto Lf
            if (r4 != 0) goto L9
            goto Lf
        L9:
            x9.q$b r3 = r2.f20207g     // Catch: java.lang.Throwable -> L2e
            java.util.Objects.requireNonNull(r3)     // Catch: java.lang.Throwable -> L2e
            goto L16
        Lf:
            r2.f20206f = r1     // Catch: java.lang.Throwable -> L2e
            java.util.Deque<r9.u> r0 = r2.f20205e     // Catch: java.lang.Throwable -> L2e
            r0.add(r3)     // Catch: java.lang.Throwable -> L2e
        L16:
            if (r4 == 0) goto L1c
            x9.q$b r3 = r2.f20207g     // Catch: java.lang.Throwable -> L2e
            r3.f20221w = r1     // Catch: java.lang.Throwable -> L2e
        L1c:
            boolean r3 = r2.h()     // Catch: java.lang.Throwable -> L2e
            r2.notifyAll()     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2e
            if (r3 != 0) goto L2d
            x9.f r3 = r2.f20204d
            int r4 = r2.f20203c
            r3.L(r4)
        L2d:
            return
        L2e:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2e
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: x9.q.i(r9.u, boolean):void");
    }

    public final void j() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
