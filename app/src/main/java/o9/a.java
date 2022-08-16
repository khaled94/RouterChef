package o9;

import e9.f;
import f9.c;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import k9.u;
import n9.p;
import n9.r;
import s.h;

/* loaded from: classes.dex */
public final class a implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated;
    public volatile /* synthetic */ long controlState;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: s */
    public final int f16813s;

    /* renamed from: t */
    public final int f16814t;

    /* renamed from: u */
    public final long f16815u;

    /* renamed from: v */
    public final String f16816v;

    /* renamed from: w */
    public final d f16817w;

    /* renamed from: x */
    public final d f16818x;
    public final p<C0099a> y;
    public static final r C = new r("NOT_IN_STACK");

    /* renamed from: z */
    public static final /* synthetic */ AtomicLongFieldUpdater f16812z = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");
    public static final /* synthetic */ AtomicLongFieldUpdater A = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");
    public static final /* synthetic */ AtomicIntegerFieldUpdater B = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");

    /* renamed from: o9.a$a */
    /* loaded from: classes.dex */
    public final class C0099a extends Thread {

        /* renamed from: z */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f16819z = AtomicIntegerFieldUpdater.newUpdater(C0099a.class, "workerCtl");
        private volatile int indexInArray;

        /* renamed from: u */
        public long f16822u;

        /* renamed from: v */
        public long f16823v;

        /* renamed from: x */
        public boolean f16825x;

        /* renamed from: s */
        public final m f16820s = new m();

        /* renamed from: t */
        public int f16821t = 4;
        public volatile /* synthetic */ int workerCtl = 0;
        private volatile Object nextParkedWorker = a.C;

        /* renamed from: w */
        public int f16824w = c.f4723t.a();

        public C0099a(int i10) {
            a.this = r1;
            a.this = r1;
            setDaemon(true);
            c.a aVar = c.f4722s;
            f(i10);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final o9.g a(boolean r10) {
            /*
                r9 = this;
                int r0 = r9.f16821t
                r1 = 1
                r2 = 0
                if (r0 != r1) goto L7
                goto L2e
            L7:
                o9.a r0 = o9.a.this
            L9:
                long r5 = r0.controlState
                r3 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
                long r3 = r3 & r5
                r7 = 42
                long r3 = r3 >> r7
                int r3 = (int) r3
                if (r3 != 0) goto L19
                r0 = r2
                goto L2a
            L19:
                r3 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
                long r7 = r5 - r3
                java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = o9.a.A
                r4 = r0
                boolean r3 = r3.compareAndSet(r4, r5, r7)
                if (r3 == 0) goto L9
                r0 = r1
            L2a:
                if (r0 == 0) goto L30
                r9.f16821t = r1
            L2e:
                r0 = r1
                goto L31
            L30:
                r0 = r2
            L31:
                if (r0 == 0) goto L67
                if (r10 == 0) goto L5c
                o9.a r10 = o9.a.this
                int r10 = r10.f16813s
                int r10 = r10 * 2
                int r10 = r9.d(r10)
                if (r10 != 0) goto L42
                goto L43
            L42:
                r1 = r2
            L43:
                if (r1 == 0) goto L4b
                o9.g r10 = r9.e()
                if (r10 != 0) goto L66
            L4b:
                o9.m r10 = r9.f16820s
                o9.g r10 = r10.d()
                if (r10 != 0) goto L66
                if (r1 != 0) goto L62
                o9.g r10 = r9.e()
                if (r10 != 0) goto L66
                goto L62
            L5c:
                o9.g r10 = r9.e()
                if (r10 != 0) goto L66
            L62:
                o9.g r10 = r9.i(r2)
            L66:
                return r10
            L67:
                if (r10 == 0) goto L71
                o9.m r10 = r9.f16820s
                o9.g r10 = r10.d()
                if (r10 != 0) goto L7b
            L71:
                o9.a r10 = o9.a.this
                o9.d r10 = r10.f16818x
                java.lang.Object r10 = r10.d()
                o9.g r10 = (o9.g) r10
            L7b:
                if (r10 != 0) goto L81
                o9.g r10 = r9.i(r1)
            L81:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: o9.a.C0099a.a(boolean):o9.g");
        }

        public final int b() {
            return this.indexInArray;
        }

        public final Object c() {
            return this.nextParkedWorker;
        }

        public final int d(int i10) {
            int i11 = this.f16824w;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f16824w = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i14 & i15 : (i14 & Integer.MAX_VALUE) % i10;
        }

        public final g e() {
            d dVar;
            if (d(2) == 0) {
                g d5 = a.this.f16817w.d();
                if (d5 != null) {
                    return d5;
                }
                dVar = a.this.f16818x;
            } else {
                g d10 = a.this.f16818x.d();
                if (d10 != null) {
                    return d10;
                }
                dVar = a.this.f16817w;
            }
            return dVar.d();
        }

        public final void f(int i10) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.f16816v);
            sb.append("-worker-");
            sb.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb.toString());
            this.indexInArray = i10;
        }

        public final void g(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean h(int i10) {
            int i11 = this.f16821t;
            boolean z10 = true;
            if (i11 != 1) {
                z10 = false;
            }
            if (z10) {
                a.A.addAndGet(a.this, 4398046511104L);
            }
            if (i11 != i10) {
                this.f16821t = i10;
            }
            return z10;
        }

        public final g i(boolean z10) {
            long j3;
            int i10 = (int) (a.this.controlState & 2097151);
            if (i10 < 2) {
                return null;
            }
            int d5 = d(i10);
            a aVar = a.this;
            int i11 = 0;
            long j10 = Long.MAX_VALUE;
            while (i11 < i10) {
                i11++;
                d5++;
                if (d5 > i10) {
                    d5 = 1;
                }
                C0099a b10 = aVar.y.b(d5);
                if (b10 != null && b10 != this) {
                    m mVar = this.f16820s;
                    m mVar2 = b10.f16820s;
                    if (z10) {
                        j3 = mVar.f(mVar2);
                    } else {
                        Objects.requireNonNull(mVar);
                        g e10 = mVar2.e();
                        if (e10 != null) {
                            mVar.a(e10, false);
                            j3 = -1;
                        } else {
                            j3 = mVar.g(mVar2, false);
                        }
                    }
                    if (j3 == -1) {
                        return this.f16820s.d();
                    }
                    if (j3 > 0) {
                        j10 = Math.min(j10, j3);
                    }
                }
            }
            if (j10 == Long.MAX_VALUE) {
                j10 = 0;
            }
            this.f16823v = j10;
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:90:0x0064 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:94:0x0002 A[SYNTHETIC] */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 335
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o9.a.C0099a.run():void");
        }
    }

    public a(int i10, int i11, long j3, String str) {
        this.f16813s = i10;
        this.f16814t = i11;
        this.f16815u = j3;
        this.f16816v = str;
        boolean z10 = true;
        if (!(i10 >= 1)) {
            throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
        }
        if (!(i11 >= i10)) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        }
        if (!(i11 <= 2097150)) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (!(j3 <= 0 ? false : z10)) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j3 + " must be positive").toString());
        }
        this.f16817w = new d();
        this.f16818x = new d();
        this.parkedWorkersStack = 0L;
        this.y = new p<>(i10 + 1);
        this.controlState = i10 << 42;
        this._isTerminated = 0;
    }

    public final int G(C0099a c0099a) {
        int b10;
        do {
            Object c10 = c0099a.c();
            if (c10 == C) {
                return -1;
            }
            if (c10 == null) {
                return 0;
            }
            c0099a = (C0099a) c10;
            b10 = c0099a.b();
        } while (b10 == 0);
        return b10;
    }

    public final boolean H(C0099a c0099a) {
        long j3;
        int b10;
        if (c0099a.c() != C) {
            return false;
        }
        do {
            j3 = this.parkedWorkersStack;
            b10 = c0099a.b();
            c0099a.g(this.y.b((int) (2097151 & j3)));
        } while (!f16812z.compareAndSet(this, j3, ((2097152 + j3) & (-2097152)) | b10));
        return true;
    }

    public final void I(C0099a c0099a, int i10, int i11) {
        while (true) {
            long j3 = this.parkedWorkersStack;
            int i12 = (int) (2097151 & j3);
            long j10 = (2097152 + j3) & (-2097152);
            if (i12 == i10) {
                i12 = i11 == 0 ? G(c0099a) : i11;
            }
            if (i12 >= 0 && f16812z.compareAndSet(this, j3, j10 | i12)) {
                return;
            }
        }
    }

    public final boolean L(long j3) {
        int i10 = ((int) (2097151 & j3)) - ((int) ((j3 & 4398044413952L) >> 21));
        if (i10 < 0) {
            i10 = 0;
        }
        if (i10 < this.f16813s) {
            int b10 = b();
            if (b10 == 1 && this.f16813s > 1) {
                b();
            }
            if (b10 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean Y() {
        while (true) {
            long j3 = this.parkedWorkersStack;
            C0099a b10 = this.y.b((int) (2097151 & j3));
            if (b10 == null) {
                b10 = null;
            } else {
                long j10 = (2097152 + j3) & (-2097152);
                int G = G(b10);
                if (G >= 0 && f16812z.compareAndSet(this, j3, G | j10)) {
                    b10.g(C);
                }
            }
            if (b10 == null) {
                return false;
            }
            if (C0099a.f16819z.compareAndSet(b10, -1, 0)) {
                LockSupport.unpark(b10);
                return true;
            }
        }
    }

    public final int b() {
        int i10;
        synchronized (this.y) {
            if (this._isTerminated != 0) {
                i10 = -1;
            } else {
                long j3 = this.controlState;
                int i11 = (int) (j3 & 2097151);
                int i12 = i11 - ((int) ((j3 & 4398044413952L) >> 21));
                boolean z10 = false;
                if (i12 < 0) {
                    i12 = 0;
                }
                if (i12 >= this.f16813s) {
                    return 0;
                }
                if (i11 >= this.f16814t) {
                    return 0;
                }
                int i13 = ((int) (this.controlState & 2097151)) + 1;
                if (!(i13 > 0 && this.y.b(i13) == null)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                C0099a c0099a = new C0099a(i13);
                this.y.c(i13, c0099a);
                if (i13 == ((int) (2097151 & A.incrementAndGet(this)))) {
                    z10 = true;
                }
                if (!z10) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                c0099a.start();
                i10 = i12 + 1;
            }
            return i10;
        }
    }

    public final C0099a c() {
        Thread currentThread = Thread.currentThread();
        C0099a c0099a = currentThread instanceof C0099a ? (C0099a) currentThread : null;
        if (c0099a != null && f.a(a.this, this)) {
            return c0099a;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0064 A[LOOP:0: B:12:0x001f->B:26:0x0064, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0066 A[EDGE_INSN: B:53:0x0066->B:27:0x0066 ?: BREAK  , SYNTHETIC] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() {
        /*
            r10 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = o9.a.B
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r10, r1, r2)
            if (r0 != 0) goto Lc
            goto L9b
        Lc:
            o9.a$a r0 = r10.c()
            n9.p<o9.a$a> r3 = r10.y
            monitor-enter(r3)
            long r4 = r10.controlState     // Catch: java.lang.Throwable -> Laf
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r3)
            r3 = 0
            if (r2 > r4) goto L66
            r5 = r2
        L1f:
            int r6 = r5 + 1
            n9.p<o9.a$a> r7 = r10.y
            java.lang.Object r7 = r7.b(r5)
            e9.f.c(r7)
            o9.a$a r7 = (o9.a.C0099a) r7
            if (r7 == r0) goto L61
        L2e:
            boolean r8 = r7.isAlive()
            if (r8 == 0) goto L3d
            java.util.concurrent.locks.LockSupport.unpark(r7)
            r8 = 10000(0x2710, double:4.9407E-320)
            r7.join(r8)
            goto L2e
        L3d:
            o9.m r7 = r7.f16820s
            o9.d r8 = r10.f16818x
            java.util.Objects.requireNonNull(r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = o9.m.f16843b
            java.lang.Object r9 = r9.getAndSet(r7, r3)
            o9.g r9 = (o9.g) r9
            if (r9 != 0) goto L4f
            goto L52
        L4f:
            r8.a(r9)
        L52:
            o9.g r9 = r7.e()
            if (r9 != 0) goto L5a
            r9 = r1
            goto L5e
        L5a:
            r8.a(r9)
            r9 = r2
        L5e:
            if (r9 == 0) goto L61
            goto L52
        L61:
            if (r5 != r4) goto L64
            goto L66
        L64:
            r5 = r6
            goto L1f
        L66:
            o9.d r1 = r10.f16818x
            r1.b()
            o9.d r1 = r10.f16817w
            r1.b()
        L70:
            if (r0 != 0) goto L74
            r1 = r3
            goto L78
        L74:
            o9.g r1 = r0.a(r2)
        L78:
            if (r1 != 0) goto L9c
            o9.d r1 = r10.f16817w
            java.lang.Object r1 = r1.d()
            o9.g r1 = (o9.g) r1
            if (r1 != 0) goto L9c
            o9.d r1 = r10.f16818x
            java.lang.Object r1 = r1.d()
            o9.g r1 = (o9.g) r1
            if (r1 != 0) goto L9c
            if (r0 != 0) goto L91
            goto L95
        L91:
            r1 = 5
            r0.h(r1)
        L95:
            r0 = 0
            r10.parkedWorkersStack = r0
            r10.controlState = r0
        L9b:
            return
        L9c:
            r1.run()     // Catch: java.lang.Throwable -> La0
            goto L70
        La0:
            r1 = move-exception
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> Lad
            java.lang.Thread$UncaughtExceptionHandler r5 = r4.getUncaughtExceptionHandler()     // Catch: java.lang.Throwable -> Lad
            r5.uncaughtException(r4, r1)     // Catch: java.lang.Throwable -> Lad
            goto L70
        Lad:
            r0 = move-exception
            throw r0
        Laf:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o9.a.close():void");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        j(runnable, k.f16840f, false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final void j(Runnable runnable, h hVar, boolean z10) {
        g gVar;
        g gVar2;
        Objects.requireNonNull(k.f16839e);
        long nanoTime = System.nanoTime();
        if (runnable instanceof g) {
            gVar = (g) runnable;
            gVar.f16831s = nanoTime;
            gVar.f16832t = hVar;
        } else {
            gVar = new j(runnable, nanoTime, hVar);
        }
        C0099a c10 = c();
        boolean z11 = true;
        if (c10 == null || c10.f16821t == 5 || (gVar.f16832t.b() == 0 && c10.f16821t == 2)) {
            gVar2 = gVar;
        } else {
            c10.f16825x = true;
            gVar2 = c10.f16820s.a(gVar, z10);
        }
        if (gVar2 != null) {
            if (!(gVar2.f16832t.b() == 1 ? this.f16818x : this.f16817w).a(gVar2)) {
                throw new RejectedExecutionException(f.j(this.f16816v, " was terminated"));
            }
        }
        if (!z10 || c10 == null) {
            z11 = false;
        }
        if (gVar.f16832t.b() == 0) {
            if (z11 || Y() || L(this.controlState)) {
                return;
            }
            Y();
            return;
        }
        long addAndGet = A.addAndGet(this, 2097152L);
        if (z11 || Y() || L(addAndGet)) {
            return;
        }
        Y();
    }

    public final String toString() {
        char c10;
        StringBuilder sb;
        ArrayList arrayList = new ArrayList();
        int a10 = this.y.a();
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (i11 < a10) {
            int i16 = i11 + 1;
            C0099a b10 = this.y.b(i11);
            if (b10 != null) {
                int c11 = b10.f16820s.c();
                int b11 = h.b(b10.f16821t);
                if (b11 == 0) {
                    i10++;
                    sb = new StringBuilder();
                    sb.append(c11);
                    c10 = 'c';
                } else if (b11 == 1) {
                    i12++;
                    sb = new StringBuilder();
                    sb.append(c11);
                    c10 = 'b';
                } else if (b11 == 2) {
                    i13++;
                } else if (b11 == 3) {
                    i14++;
                    if (c11 > 0) {
                        sb = new StringBuilder();
                        sb.append(c11);
                        c10 = 'd';
                    }
                } else if (b11 == 4) {
                    i15++;
                }
                sb.append(c10);
                arrayList.add(sb.toString());
            }
            i11 = i16;
        }
        long j3 = this.controlState;
        return this.f16816v + '@' + u.b(this) + "[Pool Size {core = " + this.f16813s + ", max = " + this.f16814t + "}, Worker States {CPU = " + i10 + ", blocking = " + i12 + ", parked = " + i13 + ", dormant = " + i14 + ", terminated = " + i15 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f16817w.c() + ", global blocking queue size = " + this.f16818x.c() + ", Control State {created workers= " + ((int) (2097151 & j3)) + ", blocking tasks = " + ((int) ((4398044413952L & j3) >> 21)) + ", CPUs acquired = " + (this.f16813s - ((int) ((j3 & 9223367638808264704L) >> 42))) + "}]";
    }
}
