package k9;

import d.c;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import n9.j;
import n9.r;
import n9.u;
import n9.v;
import x8.f;

/* loaded from: classes.dex */
public abstract class f0 extends g0 implements x {

    /* renamed from: w */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5652w = AtomicReferenceFieldUpdater.newUpdater(f0.class, Object.class, "_queue");

    /* renamed from: x */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5653x = AtomicReferenceFieldUpdater.newUpdater(f0.class, Object.class, "_delayed");
    private volatile /* synthetic */ Object _queue = null;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;

    /* loaded from: classes.dex */
    public static abstract class a implements Runnable, Comparable<a>, c0, v {

        /* renamed from: s */
        public long f5654s;

        /* renamed from: t */
        public Object f5655t;

        /* renamed from: u */
        public int f5656u;

        @Override // n9.v
        public final void b(int i10) {
            this.f5656u = i10;
        }

        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            int i10 = ((this.f5654s - aVar.f5654s) > 0L ? 1 : ((this.f5654s - aVar.f5654s) == 0L ? 0 : -1));
            if (i10 > 0) {
                return 1;
            }
            return i10 < 0 ? -1 : 0;
        }

        @Override // k9.c0
        public final synchronized void d() {
            Object obj = this.f5655t;
            r rVar = c.f3665s;
            if (obj == rVar) {
                return;
            }
            b bVar = obj instanceof b ? (b) obj : null;
            if (bVar != null) {
                synchronized (bVar) {
                    if (h() != null) {
                        bVar.d(e());
                    }
                }
            }
            this.f5655t = rVar;
        }

        @Override // n9.v
        public final int e() {
            return this.f5656u;
        }

        @Override // n9.v
        public final void f(u<?> uVar) {
            if (this.f5655t != c.f3665s) {
                this.f5655t = uVar;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        @Override // n9.v
        public final u<?> h() {
            Object obj = this.f5655t;
            if (obj instanceof u) {
                return (u) obj;
            }
            return null;
        }

        public final String toString() {
            StringBuilder c10 = androidx.activity.result.a.c("Delayed[nanos=");
            c10.append(this.f5654s);
            c10.append(']');
            return c10.toString();
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends u<a> {

        /* renamed from: b */
        public long f5657b;

        public b(long j3) {
            this.f5657b = j3;
        }
    }

    public final void A0() {
        this._queue = null;
        this._delayed = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
        if ((r8 - r0.f5657b) > 0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B0(long r13, k9.f0.a r15) {
        /*
            r12 = this;
            int r0 = r12._isCompleted
            r1 = 0
            r2 = 2
            r3 = 0
            r4 = 1
            if (r0 == 0) goto Lb
            r0 = r4
            goto L6d
        Lb:
            java.lang.Object r0 = r12._delayed
            k9.f0$b r0 = (k9.f0.b) r0
            if (r0 != 0) goto L2c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = k9.f0.f5653x
            k9.f0$b r6 = new k9.f0$b
            r6.<init>(r13)
        L18:
            boolean r0 = r5.compareAndSet(r12, r3, r6)
            if (r0 == 0) goto L1f
            goto L25
        L1f:
            java.lang.Object r0 = r5.get(r12)
            if (r0 == 0) goto L18
        L25:
            java.lang.Object r0 = r12._delayed
            e9.f.c(r0)
            k9.f0$b r0 = (k9.f0.b) r0
        L2c:
            monitor-enter(r15)
            java.lang.Object r5 = r15.f5655t     // Catch: java.lang.Throwable -> Lad
            n9.r r6 = d.c.f3665s     // Catch: java.lang.Throwable -> Lad
            if (r5 != r6) goto L35
            r0 = r2
            goto L6c
        L35:
            monitor-enter(r0)     // Catch: java.lang.Throwable -> Lad
            n9.v r5 = r0.b()     // Catch: java.lang.Throwable -> Laa
            k9.f0$a r5 = (k9.f0.a) r5     // Catch: java.lang.Throwable -> Laa
            int r6 = r12._isCompleted     // Catch: java.lang.Throwable -> Laa
            if (r6 == 0) goto L43
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lad
            r0 = r4
            goto L6c
        L43:
            r6 = 0
            if (r5 != 0) goto L49
            r8 = r13
            goto L5a
        L49:
            long r8 = r5.f5654s     // Catch: java.lang.Throwable -> Laa
            long r10 = r8 - r13
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 < 0) goto L52
            r8 = r13
        L52:
            long r10 = r0.f5657b     // Catch: java.lang.Throwable -> Laa
            long r10 = r8 - r10
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 <= 0) goto L5c
        L5a:
            r0.f5657b = r8     // Catch: java.lang.Throwable -> Laa
        L5c:
            long r8 = r15.f5654s     // Catch: java.lang.Throwable -> Laa
            long r10 = r0.f5657b     // Catch: java.lang.Throwable -> Laa
            long r8 = r8 - r10
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 >= 0) goto L67
            r15.f5654s = r10     // Catch: java.lang.Throwable -> Laa
        L67:
            r0.a(r15)     // Catch: java.lang.Throwable -> Laa
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lad
            r0 = r1
        L6c:
            monitor-exit(r15)
        L6d:
            if (r0 == 0) goto L84
            if (r0 == r4) goto L80
            if (r0 != r2) goto L74
            goto La6
        L74:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected result"
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L80:
            r12.v0(r13, r15)
            goto La6
        L84:
            java.lang.Object r13 = r12._delayed
            k9.f0$b r13 = (k9.f0.b) r13
            if (r13 != 0) goto L8b
            goto L94
        L8b:
            monitor-enter(r13)
            n9.v r14 = r13.b()     // Catch: java.lang.Throwable -> La7
            monitor-exit(r13)
            r3 = r14
            k9.f0$a r3 = (k9.f0.a) r3
        L94:
            if (r3 != r15) goto L97
            r1 = r4
        L97:
            if (r1 == 0) goto La6
            java.lang.Thread r13 = r12.u0()
            java.lang.Thread r14 = java.lang.Thread.currentThread()
            if (r14 == r13) goto La6
            java.util.concurrent.locks.LockSupport.unpark(r13)
        La6:
            return
        La7:
            r14 = move-exception
            monitor-exit(r13)
            throw r14
        Laa:
            r13 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lad
            throw r13     // Catch: java.lang.Throwable -> Lad
        Lad:
            r13 = move-exception
            monitor-exit(r15)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.f0.B0(long, k9.f0$a):void");
    }

    @Override // k9.q
    public final void m0(f fVar, Runnable runnable) {
        w0(runnable);
    }

    @Override // k9.e0
    public void shutdown() {
        z0 z0Var = z0.f5699a;
        z0.f5700b.set(null);
        this._isCompleted = 1;
        while (true) {
            Object obj = this._queue;
            boolean z10 = false;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5652w;
                r rVar = c.f3666t;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, null, rVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    break;
                }
            } else if (obj instanceof j) {
                ((j) obj).b();
                break;
            } else if (obj == c.f3666t) {
                break;
            } else {
                j jVar = new j(8, true);
                jVar.a((Runnable) obj);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f5652w;
                while (true) {
                    if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, jVar)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj) {
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    break;
                }
            }
        }
        do {
        } while (z0() <= 0);
        long nanoTime = System.nanoTime();
        while (true) {
            b bVar = (b) this._delayed;
            a e10 = bVar == null ? null : bVar.e();
            if (e10 == null) {
                return;
            }
            v0(nanoTime, e10);
        }
    }

    public void w0(Runnable runnable) {
        if (x0(runnable)) {
            Thread u02 = u0();
            if (Thread.currentThread() == u02) {
                return;
            }
            LockSupport.unpark(u02);
            return;
        }
        v.y.w0(runnable);
    }

    public final boolean x0(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            boolean z10 = false;
            if (this._isCompleted != 0) {
                return false;
            }
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5652w;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    return true;
                }
            } else if (obj instanceof j) {
                j jVar = (j) obj;
                int a10 = jVar.a(runnable);
                if (a10 == 0) {
                    return true;
                }
                if (a10 == 1) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f5652w;
                    j e10 = jVar.e();
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, e10) && atomicReferenceFieldUpdater2.get(this) == obj) {
                    }
                } else if (a10 == 2) {
                    return false;
                }
            } else if (obj == c.f3666t) {
                return false;
            } else {
                j jVar2 = new j(8, true);
                jVar2.a((Runnable) obj);
                jVar2.a(runnable);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f5652w;
                while (true) {
                    if (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, jVar2)) {
                        if (atomicReferenceFieldUpdater3.get(this) != obj) {
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    return true;
                }
            }
        }
    }

    public final boolean y0() {
        n9.a<a0<?>> aVar = this.f5647v;
        if (!(aVar == null || aVar.f16678b == aVar.f16679c)) {
            return false;
        }
        b bVar = (b) this._delayed;
        if (bVar != null && !bVar.c()) {
            return false;
        }
        Object obj = this._queue;
        if (obj == null) {
            return true;
        }
        return obj instanceof j ? ((j) obj).d() : obj == c.f3666t;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0050 A[EDGE_INSN: B:95:0x0050->B:32:0x0050 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long z0() {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.f0.z0():long");
    }
}
