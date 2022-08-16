package e2;

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

/* loaded from: classes.dex */
public abstract class a<V> implements g6.a<V> {

    /* renamed from: v */
    public static final boolean f4378v = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: w */
    public static final Logger f4379w = Logger.getLogger(a.class.getName());

    /* renamed from: x */
    public static final AbstractC0064a f4380x;
    public static final Object y;

    /* renamed from: s */
    public volatile Object f4381s;

    /* renamed from: t */
    public volatile d f4382t;

    /* renamed from: u */
    public volatile h f4383u;

    /* renamed from: e2.a$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0064a {
        public abstract boolean a(a<?> aVar, d dVar, d dVar2);

        public abstract boolean b(a<?> aVar, Object obj, Object obj2);

        public abstract boolean c(a<?> aVar, h hVar, h hVar2);

        public abstract void d(h hVar, h hVar2);

        public abstract void e(h hVar, Thread thread);
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: c */
        public static final b f4384c;

        /* renamed from: d */
        public static final b f4385d;

        /* renamed from: a */
        public final boolean f4386a;

        /* renamed from: b */
        public final Throwable f4387b;

        static {
            if (a.f4378v) {
                f4385d = null;
                f4384c = null;
                return;
            }
            f4385d = new b(false, null);
            f4384c = new b(true, null);
        }

        public b(boolean z10, Throwable th) {
            this.f4386a = z10;
            this.f4387b = th;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: b */
        public static final c f4388b = new c(new C0065a());

        /* renamed from: a */
        public final Throwable f4389a;

        /* renamed from: e2.a$c$a */
        /* loaded from: classes.dex */
        public class C0065a extends Throwable {
            public C0065a() {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public c(Throwable th) {
            boolean z10 = a.f4378v;
            Objects.requireNonNull(th);
            this.f4389a = th;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: d */
        public static final d f4390d = new d(null, null);

        /* renamed from: a */
        public final Runnable f4391a;

        /* renamed from: b */
        public final Executor f4392b;

        /* renamed from: c */
        public d f4393c;

        public d(Runnable runnable, Executor executor) {
            this.f4391a = runnable;
            this.f4392b = executor;
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends AbstractC0064a {

        /* renamed from: a */
        public final AtomicReferenceFieldUpdater<h, Thread> f4394a;

        /* renamed from: b */
        public final AtomicReferenceFieldUpdater<h, h> f4395b;

        /* renamed from: c */
        public final AtomicReferenceFieldUpdater<a, h> f4396c;

        /* renamed from: d */
        public final AtomicReferenceFieldUpdater<a, d> f4397d;

        /* renamed from: e */
        public final AtomicReferenceFieldUpdater<a, Object> f4398e;

        public e(AtomicReferenceFieldUpdater<h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<h, h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            this.f4394a = atomicReferenceFieldUpdater;
            this.f4395b = atomicReferenceFieldUpdater2;
            this.f4396c = atomicReferenceFieldUpdater3;
            this.f4397d = atomicReferenceFieldUpdater4;
            this.f4398e = atomicReferenceFieldUpdater5;
        }

        @Override // e2.a.AbstractC0064a
        public final boolean a(a<?> aVar, d dVar, d dVar2) {
            AtomicReferenceFieldUpdater<a, d> atomicReferenceFieldUpdater = this.f4397d;
            while (!atomicReferenceFieldUpdater.compareAndSet(aVar, dVar, dVar2)) {
                if (atomicReferenceFieldUpdater.get(aVar) != dVar) {
                    return false;
                }
            }
            return true;
        }

        @Override // e2.a.AbstractC0064a
        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater = this.f4398e;
            while (!atomicReferenceFieldUpdater.compareAndSet(aVar, obj, obj2)) {
                if (atomicReferenceFieldUpdater.get(aVar) != obj) {
                    return false;
                }
            }
            return true;
        }

        @Override // e2.a.AbstractC0064a
        public final boolean c(a<?> aVar, h hVar, h hVar2) {
            AtomicReferenceFieldUpdater<a, h> atomicReferenceFieldUpdater = this.f4396c;
            while (!atomicReferenceFieldUpdater.compareAndSet(aVar, hVar, hVar2)) {
                if (atomicReferenceFieldUpdater.get(aVar) != hVar) {
                    return false;
                }
            }
            return true;
        }

        @Override // e2.a.AbstractC0064a
        public final void d(h hVar, h hVar2) {
            this.f4395b.lazySet(hVar, hVar2);
        }

        @Override // e2.a.AbstractC0064a
        public final void e(h hVar, Thread thread) {
            this.f4394a.lazySet(hVar, thread);
        }
    }

    /* loaded from: classes.dex */
    public static final class f<V> implements Runnable {

        /* renamed from: s */
        public final a<V> f4399s;

        /* renamed from: t */
        public final g6.a<? extends V> f4400t;

        public f(a<V> aVar, g6.a<? extends V> aVar2) {
            this.f4399s = aVar;
            this.f4400t = aVar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f4399s.f4381s != this) {
                return;
            }
            if (!a.f4380x.b(this.f4399s, this, a.g(this.f4400t))) {
                return;
            }
            a.d(this.f4399s);
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends AbstractC0064a {
        @Override // e2.a.AbstractC0064a
        public final boolean a(a<?> aVar, d dVar, d dVar2) {
            synchronized (aVar) {
                if (aVar.f4382t == dVar) {
                    aVar.f4382t = dVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // e2.a.AbstractC0064a
        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f4381s == obj) {
                    aVar.f4381s = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // e2.a.AbstractC0064a
        public final boolean c(a<?> aVar, h hVar, h hVar2) {
            synchronized (aVar) {
                if (aVar.f4383u == hVar) {
                    aVar.f4383u = hVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // e2.a.AbstractC0064a
        public final void d(h hVar, h hVar2) {
            hVar.f4403b = hVar2;
        }

        @Override // e2.a.AbstractC0064a
        public final void e(h hVar, Thread thread) {
            hVar.f4402a = thread;
        }
    }

    /* loaded from: classes.dex */
    public static final class h {

        /* renamed from: c */
        public static final h f4401c = new h(false);

        /* renamed from: a */
        public volatile Thread f4402a;

        /* renamed from: b */
        public volatile h f4403b;

        public h() {
            a.f4380x.e(this, Thread.currentThread());
        }

        public h(boolean z10) {
        }
    }

    static {
        AbstractC0064a abstractC0064a;
        Throwable th;
        try {
            abstractC0064a = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, h.class, "u"), AtomicReferenceFieldUpdater.newUpdater(a.class, d.class, "t"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "s"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            abstractC0064a = new g();
        }
        f4380x = abstractC0064a;
        if (th != null) {
            f4379w.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        y = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [e2.a$a] */
    /* JADX WARN: Type inference failed for: r5v0, types: [e2.a<?>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [e2.a] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v7, types: [e2.a<V>, e2.a] */
    public static void d(a<?> aVar) {
        d dVar;
        d dVar2;
        d dVar3 = null;
        while (true) {
            h hVar = ((a) aVar).f4383u;
            if (f4380x.c((a) aVar, hVar, h.f4401c)) {
                while (hVar != null) {
                    Thread thread = hVar.f4402a;
                    if (thread != null) {
                        hVar.f4402a = null;
                        LockSupport.unpark(thread);
                    }
                    hVar = hVar.f4403b;
                }
                do {
                    dVar = ((a) aVar).f4382t;
                } while (!f4380x.a((a) aVar, dVar, d.f4390d));
                while (true) {
                    dVar2 = dVar3;
                    dVar3 = dVar;
                    if (dVar3 != null) {
                        dVar = dVar3.f4393c;
                        dVar3.f4393c = dVar2;
                    }
                }
                while (dVar2 != null) {
                    dVar3 = dVar2.f4393c;
                    Runnable runnable = dVar2.f4391a;
                    if (runnable instanceof f) {
                        f fVar = (f) runnable;
                        aVar = fVar.f4399s;
                        if (aVar.f4381s == fVar) {
                            if (f4380x.b(aVar, fVar, g(fVar.f4400t))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        e(runnable, dVar2.f4392b);
                    }
                    dVar2 = dVar3;
                }
                return;
            }
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = f4379w;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object g(g6.a<?> aVar) {
        if (aVar instanceof a) {
            Object obj = ((a) aVar).f4381s;
            if (!(obj instanceof b)) {
                return obj;
            }
            b bVar = (b) obj;
            return bVar.f4386a ? bVar.f4387b != null ? new b(false, bVar.f4387b) : b.f4385d : obj;
        }
        boolean z10 = ((a) aVar).f4381s instanceof b;
        if ((!f4378v) && z10) {
            return b.f4385d;
        }
        try {
            Object h10 = h(aVar);
            return h10 == null ? y : h10;
        } catch (CancellationException e10) {
            if (z10) {
                return new b(false, e10);
            }
            return new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e10));
        } catch (ExecutionException e11) {
            return new c(e11.getCause());
        } catch (Throwable th) {
            return new c(th);
        }
    }

    public static <V> V h(Future<V> future) {
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

    public final void a(StringBuilder sb) {
        String str = "]";
        try {
            Object h10 = h(this);
            sb.append("SUCCESS, result=[");
            sb.append(h10 == this ? "this future" : String.valueOf(h10));
            sb.append(str);
        } catch (CancellationException unused) {
            str = "CANCELLED";
            sb.append(str);
        } catch (RuntimeException e10) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e10.getClass());
            str = " thrown from get()]";
            sb.append(str);
        } catch (ExecutionException e11) {
            sb.append("FAILURE, cause=[");
            sb.append(e11.getCause());
            sb.append(str);
        }
    }

    public final void c(Runnable runnable, Executor executor) {
        Objects.requireNonNull(executor);
        d dVar = this.f4382t;
        if (dVar == d.f4390d) {
            e(runnable, executor);
        }
        d dVar2 = new d(runnable, executor);
        do {
            dVar2.f4393c = dVar;
            if (f4380x.a(this, dVar, dVar2)) {
                return;
            }
            dVar = this.f4382t;
        } while (dVar != d.f4390d);
        e(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        Object obj = this.f4381s;
        if ((obj == null) || (obj instanceof f)) {
            b bVar = f4378v ? new b(z10, new CancellationException("Future.cancel() was called.")) : z10 ? b.f4384c : b.f4385d;
            a<V> aVar = this;
            boolean z11 = false;
            while (true) {
                if (f4380x.b(aVar, obj, bVar)) {
                    d(aVar);
                    if (!(obj instanceof f)) {
                        return true;
                    }
                    g6.a<? extends V> aVar2 = ((f) obj).f4400t;
                    if (!(aVar2 instanceof a)) {
                        ((a) aVar2).cancel(z10);
                        return true;
                    }
                    aVar = (a) aVar2;
                    obj = aVar.f4381s;
                    if (!(obj == null) && !(obj instanceof f)) {
                        return true;
                    }
                    z11 = true;
                } else {
                    obj = aVar.f4381s;
                    if (!(obj instanceof f)) {
                        return z11;
                    }
                }
            }
        } else {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final V f(Object obj) {
        if (obj instanceof b) {
            Throwable th = ((b) obj).f4387b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        } else if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f4389a);
        } else {
            if (obj != y) {
                return obj;
            }
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
        java.util.concurrent.locks.LockSupport.park(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
        if (java.lang.Thread.interrupted() != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        r0 = r6.f4381s;
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
        if ((r4 & (!(r0 instanceof e2.a.f))) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004a, code lost:
        return f(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
        j(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
        throw new java.lang.InterruptedException();
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V get() {
        /*
            r6 = this;
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L61
            java.lang.Object r0 = r6.f4381s
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Le
            r3 = r2
            goto Lf
        Le:
            r3 = r1
        Lf:
            boolean r4 = r0 instanceof e2.a.f
            r4 = r4 ^ r2
            r3 = r3 & r4
            if (r3 == 0) goto L1a
            java.lang.Object r0 = r6.f(r0)
            return r0
        L1a:
            e2.a$h r0 = r6.f4383u
            e2.a$h r3 = e2.a.h.f4401c
            if (r0 == r3) goto L5a
            e2.a$h r3 = new e2.a$h
            r3.<init>()
        L25:
            e2.a$a r4 = e2.a.f4380x
            r4.d(r3, r0)
            boolean r0 = r4.c(r6, r0, r3)
            if (r0 == 0) goto L54
        L30:
            java.util.concurrent.locks.LockSupport.park(r6)
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L4b
            java.lang.Object r0 = r6.f4381s
            if (r0 == 0) goto L3f
            r4 = r2
            goto L40
        L3f:
            r4 = r1
        L40:
            boolean r5 = r0 instanceof e2.a.f
            r5 = r5 ^ r2
            r4 = r4 & r5
            if (r4 == 0) goto L30
            java.lang.Object r0 = r6.f(r0)
            return r0
        L4b:
            r6.j(r3)
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L54:
            e2.a$h r0 = r6.f4383u
            e2.a$h r4 = e2.a.h.f4401c
            if (r0 != r4) goto L25
        L5a:
            java.lang.Object r0 = r6.f4381s
            java.lang.Object r0 = r6.f(r0)
            return r0
        L61:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.a.get():java.lang.Object");
    }

    public final String i() {
        Object obj = this.f4381s;
        if (obj instanceof f) {
            StringBuilder c10 = androidx.activity.result.a.c("setFuture=[");
            g6.a<? extends V> aVar = ((f) obj).f4400t;
            return s.b.b(c10, aVar == this ? "this future" : String.valueOf(aVar), "]");
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            StringBuilder c11 = androidx.activity.result.a.c("remaining delay=[");
            c11.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
            c11.append(" ms]");
            return c11.toString();
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f4381s instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.f4381s;
        return (!(obj instanceof f)) & (obj != null);
    }

    public final void j(h hVar) {
        hVar.f4402a = null;
        while (true) {
            h hVar2 = this.f4383u;
            if (hVar2 == h.f4401c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f4403b;
                if (hVar2.f4402a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f4403b = hVar4;
                    if (hVar3.f4402a == null) {
                        break;
                    }
                } else if (!f4380x.c(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (!(this.f4381s instanceof b)) {
            if (!isDone()) {
                try {
                    str2 = i();
                } catch (RuntimeException e10) {
                    StringBuilder c10 = androidx.activity.result.a.c("Exception thrown from implementation: ");
                    c10.append(e10.getClass());
                    str2 = c10.toString();
                }
                if (str2 != null && !str2.isEmpty()) {
                    sb.append("PENDING, info=[");
                    sb.append(str2);
                    sb.append("]");
                    sb.append("]");
                    return sb.toString();
                } else if (!isDone()) {
                    str = "PENDING";
                }
            }
            a(sb);
            sb.append("]");
            return sb.toString();
        }
        str = "CANCELLED";
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
        java.util.concurrent.locks.LockSupport.parkNanos(r18, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
        if (java.lang.Thread.interrupted() != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
        r4 = r18.f4381s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
        if (r4 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
        if ((r5 & (!(r4 instanceof e2.a.f))) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0066, code lost:
        return f(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
        r4 = r10 - java.lang.System.nanoTime();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006f, code lost:
        if (r4 >= 1000) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0071, code lost:
        j(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
        j(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007d, code lost:
        throw new java.lang.InterruptedException();
     */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V get(long r19, java.util.concurrent.TimeUnit r21) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.a.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }
}
