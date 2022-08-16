package m4;

import i0.b;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
public abstract class my1<V> extends i02 implements tz1<V> {

    /* renamed from: v */
    public static final boolean f11355v;

    /* renamed from: w */
    public static final Logger f11356w;

    /* renamed from: x */
    public static final ay1 f11357x;
    public static final Object y;
    @CheckForNull

    /* renamed from: s */
    public volatile Object f11358s;
    @CheckForNull

    /* renamed from: t */
    public volatile dy1 f11359t;
    @CheckForNull

    /* renamed from: u */
    public volatile ly1 f11360u;

    static {
        boolean z10;
        Throwable th;
        Throwable th2;
        ay1 ay1Var;
        try {
            z10 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z10 = false;
        }
        f11355v = z10;
        f11356w = Logger.getLogger(my1.class.getName());
        try {
            ay1Var = new ky1();
            th2 = null;
            th = null;
        } catch (Throwable th3) {
            try {
                th = null;
                th2 = th3;
                ay1Var = new ey1(AtomicReferenceFieldUpdater.newUpdater(ly1.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(ly1.class, ly1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(my1.class, ly1.class, "u"), AtomicReferenceFieldUpdater.newUpdater(my1.class, dy1.class, "t"), AtomicReferenceFieldUpdater.newUpdater(my1.class, Object.class, "s"));
            } catch (Throwable th4) {
                th = th4;
                th2 = th3;
                ay1Var = new gy1();
            }
        }
        f11357x = ay1Var;
        if (th != null) {
            Logger logger = f11356w;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        y = new Object();
    }

    public static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = f11356w;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", b.a(new StringBuilder(valueOf.length() + 57 + valueOf2.length()), "RuntimeException while executing runnable ", valueOf, " with executor ", valueOf2), (Throwable) e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final V e(Object obj) {
        if (obj instanceof by1) {
            Throwable th = ((by1) obj).f6657b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof cy1) {
            throw new ExecutionException(((cy1) obj).f7158a);
        } else {
            if (obj != y) {
                return obj;
            }
            return null;
        }
    }

    public static Object f(tz1<?> tz1Var) {
        Throwable a10;
        if (tz1Var instanceof hy1) {
            Object obj = ((my1) tz1Var).f11358s;
            if (obj instanceof by1) {
                by1 by1Var = (by1) obj;
                if (by1Var.f6656a) {
                    Throwable th = by1Var.f6657b;
                    obj = th != null ? new by1(false, th) : by1.f6655d;
                }
            }
            Objects.requireNonNull(obj);
            return obj;
        } else if ((tz1Var instanceof i02) && (a10 = ((i02) tz1Var).a()) != null) {
            return new cy1(a10);
        } else {
            boolean isCancelled = tz1Var.isCancelled();
            if ((!f11355v) && isCancelled) {
                by1 by1Var2 = by1.f6655d;
                Objects.requireNonNull(by1Var2);
                return by1Var2;
            }
            try {
                Object g10 = g(tz1Var);
                if (!isCancelled) {
                    return g10 == null ? y : g10;
                }
                String valueOf = String.valueOf(tz1Var);
                StringBuilder sb = new StringBuilder(valueOf.length() + 84);
                sb.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                sb.append(valueOf);
                return new by1(false, new IllegalArgumentException(sb.toString()));
            } catch (CancellationException e10) {
                return !isCancelled ? new cy1(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(tz1Var)), e10)) : new by1(false, e10);
            } catch (ExecutionException e11) {
                return isCancelled ? new by1(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(tz1Var)), e11)) : new cy1(e11.getCause());
            } catch (Throwable th2) {
                return new cy1(th2);
            }
        }
    }

    public static <V> V g(Future<V> future) {
        V v10;
        boolean z10 = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [m4.ay1] */
    /* JADX WARN: Type inference failed for: r5v0, types: [m4.my1<?>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [m4.my1] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v7, types: [m4.my1<V>, m4.my1] */
    public static void q(my1<?> my1Var) {
        dy1 dy1Var;
        dy1 dy1Var2;
        dy1 dy1Var3 = null;
        while (true) {
            ly1 ly1Var = ((my1) my1Var).f11360u;
            if (f11357x.e((my1) my1Var, ly1Var, ly1.f11046c)) {
                while (ly1Var != null) {
                    Thread thread = ly1Var.f11047a;
                    if (thread != null) {
                        ly1Var.f11047a = null;
                        LockSupport.unpark(thread);
                    }
                    ly1Var = ly1Var.f11048b;
                }
                ((my1) my1Var).i();
                do {
                    dy1Var = ((my1) my1Var).f11359t;
                } while (!f11357x.c((my1) my1Var, dy1Var, dy1.f7666d));
                while (true) {
                    dy1Var2 = dy1Var3;
                    dy1Var3 = dy1Var;
                    if (dy1Var3 != null) {
                        dy1Var = dy1Var3.f7669c;
                        dy1Var3.f7669c = dy1Var2;
                    }
                }
                while (dy1Var2 != null) {
                    dy1Var3 = dy1Var2.f7669c;
                    Runnable runnable = dy1Var2.f7667a;
                    Objects.requireNonNull(runnable);
                    if (runnable instanceof fy1) {
                        fy1 fy1Var = (fy1) runnable;
                        my1Var = fy1Var.f8675s;
                        if (my1Var.f11358s == fy1Var) {
                            if (f11357x.d(my1Var, fy1Var, f(fy1Var.f8676t))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        Executor executor = dy1Var2.f7668b;
                        Objects.requireNonNull(executor);
                        c(runnable, executor);
                    }
                    dy1Var2 = dy1Var3;
                }
                return;
            }
        }
    }

    @Override // m4.i02
    @CheckForNull
    public final Throwable a() {
        if (this instanceof hy1) {
            Object obj = this.f11358s;
            if (!(obj instanceof cy1)) {
                return null;
            }
            return ((cy1) obj).f7158a;
        }
        return null;
    }

    public void b(Runnable runnable, Executor executor) {
        dy1 dy1Var;
        hu1.c(runnable, "Runnable was null.");
        hu1.c(executor, "Executor was null.");
        if (isDone() || (dy1Var = this.f11359t) == dy1.f7666d) {
            c(runnable, executor);
        }
        dy1 dy1Var2 = new dy1(runnable, executor);
        do {
            dy1Var2.f7669c = dy1Var;
            if (f11357x.c(this, dy1Var, dy1Var2)) {
                return;
            }
            dy1Var = this.f11359t;
        } while (dy1Var != dy1.f7666d);
        c(runnable, executor);
    }

    public boolean cancel(boolean z10) {
        by1 by1Var;
        Object obj = this.f11358s;
        if ((obj == null) || (obj instanceof fy1)) {
            if (f11355v) {
                by1Var = new by1(z10, new CancellationException("Future.cancel() was called."));
            } else {
                by1Var = z10 ? by1.f6654c : by1.f6655d;
                Objects.requireNonNull(by1Var);
            }
            my1<V> my1Var = this;
            boolean z11 = false;
            while (true) {
                if (f11357x.d(my1Var, obj, by1Var)) {
                    if (z10) {
                        my1Var.j();
                    }
                    q(my1Var);
                    if (!(obj instanceof fy1)) {
                        break;
                    }
                    tz1<? extends V> tz1Var = ((fy1) obj).f8676t;
                    if (!(tz1Var instanceof hy1)) {
                        tz1Var.cancel(z10);
                        break;
                    }
                    my1Var = (my1) tz1Var;
                    obj = my1Var.f11358s;
                    if (!(obj == null) && !(obj instanceof fy1)) {
                        break;
                    }
                    z11 = true;
                } else {
                    obj = my1Var.f11358s;
                    if (!(obj instanceof fy1)) {
                        return z11;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void d(ly1 ly1Var) {
        ly1Var.f11047a = null;
        while (true) {
            ly1 ly1Var2 = this.f11360u;
            if (ly1Var2 != ly1.f11046c) {
                ly1 ly1Var3 = null;
                while (ly1Var2 != null) {
                    ly1 ly1Var4 = ly1Var2.f11048b;
                    if (ly1Var2.f11047a != null) {
                        ly1Var3 = ly1Var2;
                    } else if (ly1Var3 != null) {
                        ly1Var3.f11048b = ly1Var4;
                        if (ly1Var3.f11047a == null) {
                            break;
                        }
                    } else if (!f11357x.e(this, ly1Var2, ly1Var4)) {
                        break;
                    }
                    ly1Var2 = ly1Var4;
                }
                return;
            }
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
        java.util.concurrent.locks.LockSupport.park(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
        if (java.lang.Thread.interrupted() != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        r0 = r6.f11358s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
        if (r0 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
        if ((r4 & (!(r0 instanceof m4.fy1))) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004a, code lost:
        return (V) e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
        d(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
        throw new java.lang.InterruptedException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public V get() {
        /*
            r6 = this;
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L64
            java.lang.Object r0 = r6.f11358s
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Le
            r3 = r2
            goto Lf
        Le:
            r3 = r1
        Lf:
            boolean r4 = r0 instanceof m4.fy1
            r4 = r4 ^ r2
            r3 = r3 & r4
            if (r3 == 0) goto L1a
            java.lang.Object r0 = e(r0)
            return r0
        L1a:
            m4.ly1 r0 = r6.f11360u
            m4.ly1 r3 = m4.ly1.f11046c
            if (r0 == r3) goto L5a
            m4.ly1 r3 = new m4.ly1
            r3.<init>()
        L25:
            m4.ay1 r4 = m4.my1.f11357x
            r4.a(r3, r0)
            boolean r0 = r4.e(r6, r0, r3)
            if (r0 == 0) goto L54
        L30:
            java.util.concurrent.locks.LockSupport.park(r6)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L4b
            java.lang.Object r0 = r6.f11358s
            if (r0 == 0) goto L3f
            r4 = r2
            goto L40
        L3f:
            r4 = r1
        L40:
            boolean r5 = r0 instanceof m4.fy1
            r5 = r5 ^ r2
            r4 = r4 & r5
            if (r4 == 0) goto L30
            java.lang.Object r0 = e(r0)
            return r0
        L4b:
            r6.d(r3)
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L54:
            m4.ly1 r0 = r6.f11360u
            m4.ly1 r4 = m4.ly1.f11046c
            if (r0 != r4) goto L25
        L5a:
            java.lang.Object r0 = r6.f11358s
            java.util.Objects.requireNonNull(r0)
            java.lang.Object r0 = e(r0)
            return r0
        L64:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.my1.get():java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
        java.util.concurrent.locks.LockSupport.parkNanos(r18, java.lang.Math.min(r4, 2147483647999999999L));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
        if (java.lang.Thread.interrupted() != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
        r4 = r18.f11358s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
        if (r4 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0069, code lost:
        if ((r5 & (!(r4 instanceof m4.fy1))) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
        return (V) e(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
        r4 = r10 - java.lang.System.nanoTime();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0078, code lost:
        if (r4 >= 1000) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
        d(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
        d(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0086, code lost:
        throw new java.lang.InterruptedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00bd, code lost:
        r8 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public V get(long r19, java.util.concurrent.TimeUnit r21) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.my1.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    @CheckForNull
    public String h() {
        if (this instanceof ScheduledFuture) {
            long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
            StringBuilder sb = new StringBuilder(41);
            sb.append("remaining delay=[");
            sb.append(delay);
            sb.append(" ms]");
            return sb.toString();
        }
        return null;
    }

    public void i() {
    }

    public boolean isCancelled() {
        return this.f11358s instanceof by1;
    }

    public boolean isDone() {
        Object obj = this.f11358s;
        return (!(obj instanceof fy1)) & (obj != null);
    }

    public void j() {
    }

    public final void k(@CheckForNull Future<?> future) {
        if ((future != null) && (this.f11358s instanceof by1)) {
            future.cancel(o());
        }
    }

    public boolean l(V v10) {
        if (v10 == null) {
            v10 = (V) y;
        }
        if (f11357x.d(this, null, v10)) {
            q(this);
            return true;
        }
        return false;
    }

    public boolean m(Throwable th) {
        Objects.requireNonNull(th);
        if (f11357x.d(this, null, new cy1(th))) {
            q(this);
            return true;
        }
        return false;
    }

    public final boolean n(tz1<? extends V> tz1Var) {
        cy1 cy1Var;
        Objects.requireNonNull(tz1Var);
        Object obj = this.f11358s;
        if (obj == null) {
            if (tz1Var.isDone()) {
                if (!f11357x.d(this, null, f(tz1Var))) {
                    return false;
                }
                q(this);
                return true;
            }
            fy1 fy1Var = new fy1(this, tz1Var);
            if (f11357x.d(this, null, fy1Var)) {
                try {
                    tz1Var.b(fy1Var, dz1.f7671s);
                } catch (Throwable th) {
                    try {
                        cy1Var = new cy1(th);
                    } catch (Throwable unused) {
                        cy1Var = cy1.f7157b;
                    }
                    f11357x.d(this, fy1Var, cy1Var);
                }
                return true;
            }
            obj = this.f11358s;
        }
        if (obj instanceof by1) {
            tz1Var.cancel(((by1) obj).f6656a);
        }
        return false;
    }

    public final boolean o() {
        Object obj = this.f11358s;
        return (obj instanceof by1) && ((by1) obj).f6656a;
    }

    public final void p(StringBuilder sb) {
        String str;
        String str2 = "]";
        try {
            Object g10 = g(this);
            sb.append("SUCCESS, result=[");
            if (g10 == null) {
                str = "null";
            } else if (g10 == this) {
                str = "this future";
            } else {
                sb.append(g10.getClass().getName());
                sb.append("@");
                str = Integer.toHexString(System.identityHashCode(g10));
            }
            sb.append(str);
            sb.append(str2);
        } catch (CancellationException unused) {
            str2 = "CANCELLED";
            sb.append(str2);
        } catch (RuntimeException e10) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e10.getClass());
            str2 = " thrown from get()]";
            sb.append(str2);
        } catch (ExecutionException e11) {
            sb.append("FAILURE, cause=[");
            sb.append(e11.getCause());
            sb.append(str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "com.google.common.util.concurrent."
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L1e
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getSimpleName()
            goto L26
        L1e:
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
        L26:
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r6)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "[status="
            r0.append(r1)
            boolean r1 = r6.isCancelled()
            java.lang.String r2 = "]"
            if (r1 == 0) goto L4d
            java.lang.String r1 = "CANCELLED"
            r0.append(r1)
            goto Lce
        L4d:
            boolean r1 = r6.isDone()
            if (r1 == 0) goto L58
            r6.p(r0)
            goto Lce
        L58:
            int r1 = r0.length()
            java.lang.String r3 = "PENDING"
            r0.append(r3)
            java.lang.Object r3 = r6.f11358s
            boolean r4 = r3 instanceof m4.fy1
            java.lang.String r5 = "Exception thrown from implementation: "
            if (r4 == 0) goto L8c
            java.lang.String r4 = ", setFuture=["
            r0.append(r4)
            m4.fy1 r3 = (m4.fy1) r3
            m4.tz1<? extends V> r3 = r3.f8676t
            if (r3 != r6) goto L7a
            java.lang.String r3 = "this future"
            r0.append(r3)     // Catch: java.lang.StackOverflowError -> L7e java.lang.RuntimeException -> L80
            goto Lbb
        L7a:
            r0.append(r3)     // Catch: java.lang.StackOverflowError -> L7e java.lang.RuntimeException -> L80
            goto Lbb
        L7e:
            r3 = move-exception
            goto L81
        L80:
            r3 = move-exception
        L81:
            r0.append(r5)
            java.lang.Class r3 = r3.getClass()
            r0.append(r3)
            goto Lbb
        L8c:
            java.lang.String r3 = r6.h()     // Catch: java.lang.StackOverflowError -> La2 java.lang.RuntimeException -> La4
            int r4 = m4.gu1.f9052a     // Catch: java.lang.StackOverflowError -> La2 java.lang.RuntimeException -> La4
            if (r3 == 0) goto L9d
            boolean r4 = r3.isEmpty()     // Catch: java.lang.StackOverflowError -> La2 java.lang.RuntimeException -> La4
            if (r4 == 0) goto L9b
            goto L9d
        L9b:
            r4 = 0
            goto L9e
        L9d:
            r4 = 1
        L9e:
            if (r4 == 0) goto Lb1
            r3 = 0
            goto Lb1
        La2:
            r3 = move-exception
            goto La5
        La4:
            r3 = move-exception
        La5:
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r5.concat(r3)
        Lb1:
            if (r3 == 0) goto Lbe
            java.lang.String r4 = ", info=["
            r0.append(r4)
            r0.append(r3)
        Lbb:
            r0.append(r2)
        Lbe:
            boolean r3 = r6.isDone()
            if (r3 == 0) goto Lce
            int r3 = r0.length()
            r0.delete(r1, r3)
            r6.p(r0)
        Lce:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.my1.toString():java.lang.String");
    }
}
