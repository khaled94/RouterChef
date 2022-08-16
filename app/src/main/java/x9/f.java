package x9;

import ca.g;
import ca.h;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import x9.p;
import x9.t;

/* loaded from: classes.dex */
public final class f implements Closeable {
    public static final ThreadPoolExecutor P;
    public final ThreadPoolExecutor A;
    public long I;
    public final u K;
    public final Socket L;
    public final r M;
    public final C0153f N;

    /* renamed from: t */
    public final d f20140t;

    /* renamed from: v */
    public final String f20142v;

    /* renamed from: w */
    public int f20143w;
    public boolean y;

    /* renamed from: z */
    public final ScheduledThreadPoolExecutor f20145z;

    /* renamed from: u */
    public final Map<Integer, q> f20141u = new LinkedHashMap();
    public long C = 0;
    public long D = 0;
    public long E = 0;
    public long F = 0;
    public long G = 0;
    public long H = 0;
    public u J = new u();
    public final Set<Integer> O = new LinkedHashSet();
    public final t.a B = t.f20237a;

    /* renamed from: s */
    public final boolean f20139s = true;

    /* renamed from: x */
    public int f20144x = 3;

    /* loaded from: classes.dex */
    public class a extends s9.b {

        /* renamed from: t */
        public final /* synthetic */ int f20146t;

        /* renamed from: u */
        public final /* synthetic */ long f20147u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object[] objArr, int i10, long j3) {
            super("OkHttp Window Update %s stream %d", objArr);
            f.this = r1;
            this.f20146t = i10;
            this.f20147u = j3;
        }

        @Override // s9.b
        public final void a() {
            try {
                f.this.M.Y(this.f20146t, this.f20147u);
            } catch (IOException e10) {
                f.b(f.this, e10);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public Socket f20149a;

        /* renamed from: b */
        public String f20150b;

        /* renamed from: c */
        public h f20151c;

        /* renamed from: d */
        public g f20152d;

        /* renamed from: e */
        public d f20153e = d.f20156a;

        /* renamed from: f */
        public int f20154f;
    }

    /* loaded from: classes.dex */
    public final class c extends s9.b {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c() {
            super("OkHttp %s ping", r3.f20142v);
            f.this = r3;
        }

        @Override // s9.b
        public final void a() {
            f fVar;
            boolean z10;
            synchronized (f.this) {
                fVar = f.this;
                long j3 = fVar.D;
                long j10 = fVar.C;
                if (j3 < j10) {
                    z10 = true;
                } else {
                    fVar.C = j10 + 1;
                    z10 = false;
                }
            }
            if (z10) {
                f.b(fVar, null);
            } else {
                fVar.e0(false, 1, 0);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d {

        /* renamed from: a */
        public static final a f20156a = new a();

        /* loaded from: classes.dex */
        public class a extends d {
            @Override // x9.f.d
            public final void b(q qVar) {
                qVar.c(5, null);
            }
        }

        public void a(f fVar) {
        }

        public abstract void b(q qVar);
    }

    /* loaded from: classes.dex */
    public final class e extends s9.b {

        /* renamed from: t */
        public final boolean f20157t = true;

        /* renamed from: u */
        public final int f20158u;

        /* renamed from: v */
        public final int f20159v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i10, int i11) {
            super("OkHttp %s ping %08x%08x", r4.f20142v, Integer.valueOf(i10), Integer.valueOf(i11));
            f.this = r4;
            this.f20158u = i10;
            this.f20159v = i11;
        }

        @Override // s9.b
        public final void a() {
            f.this.e0(this.f20157t, this.f20158u, this.f20159v);
        }
    }

    /* renamed from: x9.f$f */
    /* loaded from: classes.dex */
    public class C0153f extends s9.b implements p.b {

        /* renamed from: t */
        public final p f20161t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0153f(p pVar) {
            super("OkHttp %s", r3.f20142v);
            f.this = r3;
            this.f20161t = pVar;
        }

        @Override // s9.b
        public final void a() {
            try {
                this.f20161t.j(this);
                do {
                } while (this.f20161t.c(false, this));
                f.this.c(1, 6, null);
            } catch (IOException e10) {
                f.this.c(2, 2, e10);
            } catch (Throwable th) {
                f.this.c(3, 3, null);
                s9.e.c(this.f20161t);
                throw th;
            }
            s9.e.c(this.f20161t);
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = s9.e.f18396a;
        P = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new s9.d("OkHttp Http2Connection", true));
    }

    public f(b bVar) {
        u uVar = new u();
        this.K = uVar;
        this.f20140t = bVar.f20153e;
        this.J.b(7, 16777216);
        String str = bVar.f20150b;
        this.f20142v = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new s9.d(s9.e.j("OkHttp %s Writer", str), false));
        this.f20145z = scheduledThreadPoolExecutor;
        if (bVar.f20154f != 0) {
            c cVar = new c();
            long j3 = bVar.f20154f;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(cVar, j3, j3, TimeUnit.MILLISECONDS);
        }
        this.A = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new s9.d(s9.e.j("OkHttp %s Push Observer", str), true));
        uVar.b(7, 65535);
        uVar.b(5, 16384);
        this.I = uVar.a();
        this.L = bVar.f20149a;
        this.M = new r(bVar.f20152d, true);
        this.N = new C0153f(new p(bVar.f20151c, true));
    }

    public static void b(f fVar, IOException iOException) {
        fVar.c(2, 2, iOException);
    }

    public final synchronized int G() {
        int i10;
        u uVar = this.K;
        i10 = Integer.MAX_VALUE;
        if ((uVar.f20238a & 16) != 0) {
            i10 = uVar.f20239b[4];
        }
        return i10;
    }

    public final synchronized void H(s9.b bVar) {
        if (!this.y) {
            this.A.execute(bVar);
        }
    }

    public final boolean I(int i10) {
        return i10 != 0 && (i10 & 1) == 0;
    }

    public final synchronized q L(int i10) {
        q remove;
        remove = this.f20141u.remove(Integer.valueOf(i10));
        notifyAll();
        return remove;
    }

    public final void Y(int i10) {
        synchronized (this.M) {
            synchronized (this) {
                if (this.y) {
                    return;
                }
                this.y = true;
                this.M.G(this.f20143w, i10, s9.e.f18396a);
            }
        }
    }

    public final synchronized void Z(long j3) {
        long j10 = this.H + j3;
        this.H = j10;
        if (j10 >= this.J.a() / 2) {
            n0(0, this.H);
            this.H = 0L;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.Map<java.lang.Integer, x9.q>, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.Map<java.lang.Integer, x9.q>, java.util.LinkedHashMap] */
    public final void c(int i10, int i11, @Nullable IOException iOException) {
        try {
            Y(i10);
        } catch (IOException unused) {
        }
        q[] qVarArr = null;
        synchronized (this) {
            if (!this.f20141u.isEmpty()) {
                qVarArr = (q[]) this.f20141u.values().toArray(new q[this.f20141u.size()]);
                this.f20141u.clear();
            }
        }
        if (qVarArr != null) {
            for (q qVar : qVarArr) {
                try {
                    qVar.c(i11, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.M.close();
        } catch (IOException unused3) {
        }
        try {
            this.L.close();
        } catch (IOException unused4) {
        }
        this.f20145z.shutdown();
        this.A.shutdown();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        c(1, 6, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r4), r8.M.f20227v);
        r6 = r2;
        r8.I -= r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d0(int r9, boolean r10, ca.f r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            x9.r r12 = r8.M
            r12.c(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L65
            monitor-enter(r8)
        L12:
            long r4 = r8.I     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L30
            java.util.Map<java.lang.Integer, x9.q> r2 = r8.f20141u     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            if (r2 == 0) goto L28
            r8.wait()     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            goto L12
        L28:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
            throw r9     // Catch: java.lang.Throwable -> L54 java.lang.InterruptedException -> L56
        L30:
            long r4 = java.lang.Math.min(r12, r4)     // Catch: java.lang.Throwable -> L54
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L54
            x9.r r4 = r8.M     // Catch: java.lang.Throwable -> L54
            int r4 = r4.f20227v     // Catch: java.lang.Throwable -> L54
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L54
            long r4 = r8.I     // Catch: java.lang.Throwable -> L54
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L54
            long r4 = r4 - r6
            r8.I = r4     // Catch: java.lang.Throwable -> L54
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L54
            long r12 = r12 - r6
            x9.r r4 = r8.M
            if (r10 == 0) goto L4f
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L4f
            r5 = 1
            goto L50
        L4f:
            r5 = r3
        L50:
            r4.c(r5, r9, r11, r2)
            goto Ld
        L54:
            r9 = move-exception
            goto L63
        L56:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L54
            r9.interrupt()     // Catch: java.lang.Throwable -> L54
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L54
            r9.<init>()     // Catch: java.lang.Throwable -> L54
            throw r9     // Catch: java.lang.Throwable -> L54
        L63:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L54
            throw r9
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x9.f.d0(int, boolean, ca.f, long):void");
    }

    public final void e0(boolean z10, int i10, int i11) {
        try {
            this.M.I(z10, i10, i11);
        } catch (IOException e10) {
            c(2, 2, e10);
        }
    }

    public final void flush() {
        this.M.flush();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.Integer, x9.q>, java.util.LinkedHashMap] */
    public final synchronized q j(int i10) {
        return (q) this.f20141u.get(Integer.valueOf(i10));
    }

    public final void m0(int i10, int i11) {
        try {
            this.f20145z.execute(new x9.e(this, new Object[]{this.f20142v, Integer.valueOf(i10)}, i10, i11));
        } catch (RejectedExecutionException unused) {
        }
    }

    public final void n0(int i10, long j3) {
        try {
            this.f20145z.execute(new a(new Object[]{this.f20142v, Integer.valueOf(i10)}, i10, j3));
        } catch (RejectedExecutionException unused) {
        }
    }
}
