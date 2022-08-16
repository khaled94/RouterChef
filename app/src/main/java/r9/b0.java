package r9;

import da.s;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import s9.b;
import u9.i;
import z9.f;

/* loaded from: classes.dex */
public final class b0 implements f {

    /* renamed from: s */
    public final z f17302s;

    /* renamed from: t */
    public i f17303t;

    /* renamed from: u */
    public final c0 f17304u;

    /* renamed from: v */
    public final boolean f17305v;

    /* renamed from: w */
    public boolean f17306w;

    /* loaded from: classes.dex */
    public final class a extends b {

        /* renamed from: t */
        public final g f17307t;

        /* renamed from: u */
        public volatile AtomicInteger f17308u = new AtomicInteger(0);

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g gVar) {
            super("OkHttp %s", r3.f17304u.f17311a.q());
            b0.this = r3;
            this.f17307t = gVar;
        }

        @Override // s9.b
        public final void a() {
            IOException e10;
            Throwable th;
            b0.this.f17303t.f19674e.i();
            boolean z10 = false;
            try {
                try {
                } catch (Throwable th2) {
                    b0.this.f17302s.f17511s.c(this);
                    throw th2;
                }
            } catch (IOException e11) {
                e10 = e11;
            } catch (Throwable th3) {
                th = th3;
            }
            try {
                ((s.a) this.f17307t).b(b0.this.a());
            } catch (IOException e12) {
                e10 = e12;
                z10 = true;
                if (z10) {
                    f.f21089a.n(4, "Callback failure for " + b0.this.b(), e10);
                } else {
                    ((s.a) this.f17307t).a(e10);
                }
                b0.this.f17302s.f17511s.c(this);
            } catch (Throwable th4) {
                th = th4;
                z10 = true;
                b0.this.cancel();
                if (!z10) {
                    IOException iOException = new IOException("canceled due to " + th);
                    iOException.addSuppressed(th);
                    ((s.a) this.f17307t).a(iOException);
                }
                throw th;
            }
            b0.this.f17302s.f17511s.c(this);
        }

        public final String b() {
            return b0.this.f17304u.f17311a.f17478d;
        }
    }

    public b0(z zVar, c0 c0Var, boolean z10) {
        this.f17302s = zVar;
        this.f17304u = c0Var;
        this.f17305v = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final r9.g0 a() {
        /*
            r14 = this;
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r9.z r0 = r14.f17302s
            java.util.List<r9.w> r0 = r0.f17514v
            r1.addAll(r0)
            v9.i r0 = new v9.i
            r9.z r2 = r14.f17302s
            r0.<init>(r2)
            r1.add(r0)
            v9.a r0 = new v9.a
            r9.z r2 = r14.f17302s
            r9.m$a r2 = r2.f17517z
            r0.<init>(r2)
            r1.add(r0)
            t9.b r0 = new t9.b
            r9.z r2 = r14.f17302s
            r9.d r2 = r2.A
            r10 = 0
            if (r2 == 0) goto L2e
            r9.d$a r2 = r2.f17322s
            goto L2f
        L2e:
            r2 = r10
        L2f:
            r0.<init>(r2)
            r1.add(r0)
            u9.a r0 = new u9.a
            r0.<init>()
            r1.add(r0)
            boolean r0 = r14.f17305v
            if (r0 != 0) goto L48
            r9.z r0 = r14.f17302s
            java.util.List<r9.w> r0 = r0.f17515w
            r1.addAll(r0)
        L48:
            v9.b r0 = new v9.b
            boolean r2 = r14.f17305v
            r0.<init>(r2)
            r1.add(r0)
            v9.f r11 = new v9.f
            u9.i r2 = r14.f17303t
            r3 = 0
            r4 = 0
            r9.c0 r12 = r14.f17304u
            r9.z r0 = r14.f17302s
            int r7 = r0.N
            int r8 = r0.O
            int r9 = r0.P
            r0 = r11
            r5 = r12
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = 0
            r9.g0 r1 = r11.a(r12)     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L88
            u9.i r2 = r14.f17303t     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L88
            boolean r2 = r2.e()     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L88
            if (r2 != 0) goto L7b
            u9.i r0 = r14.f17303t
            r0.g(r10)
            return r1
        L7b:
            s9.e.c(r1)     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L88
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L88
            java.lang.String r2 = "Canceled"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L88
            throw r1     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L88
        L86:
            r1 = move-exception
            goto L95
        L88:
            r0 = move-exception
            r1 = 1
            u9.i r2 = r14.f17303t     // Catch: java.lang.Throwable -> L91
            java.io.IOException r0 = r2.g(r0)     // Catch: java.lang.Throwable -> L91
            throw r0     // Catch: java.lang.Throwable -> L91
        L91:
            r0 = move-exception
            r13 = r1
            r1 = r0
            r0 = r13
        L95:
            if (r0 != 0) goto L9c
            u9.i r0 = r14.f17303t
            r0.g(r10)
        L9c:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r9.b0.a():r9.g0");
    }

    public final String b() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f17303t.e() ? "canceled " : "");
        sb.append(this.f17305v ? "web socket" : "call");
        sb.append(" to ");
        sb.append(this.f17304u.f17311a.q());
        return sb.toString();
    }

    public final void cancel() {
        this.f17303t.b();
    }

    public final Object clone() {
        z zVar = this.f17302s;
        b0 b0Var = new b0(zVar, this.f17304u, this.f17305v);
        b0Var.f17303t = new i(zVar, b0Var);
        return b0Var;
    }
}
