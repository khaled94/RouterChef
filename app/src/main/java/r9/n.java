package r9;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import javax.annotation.Nullable;
import r9.b0;

/* loaded from: classes.dex */
public final class n {
    @Nullable

    /* renamed from: a */
    public ThreadPoolExecutor f17455a;

    /* renamed from: b */
    public final Deque<b0.a> f17456b = new ArrayDeque();

    /* renamed from: c */
    public final Deque<b0.a> f17457c = new ArrayDeque();

    /* renamed from: d */
    public final Deque<b0> f17458d = new ArrayDeque();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Deque<r9.b0$a>, java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Deque<r9.b0$a>, java.util.ArrayDeque] */
    @Nullable
    public final b0.a a(String str) {
        Iterator it = this.f17457c.iterator();
        while (it.hasNext()) {
            b0.a aVar = (b0.a) it.next();
            if (aVar.b().equals(str)) {
                return aVar;
            }
        }
        Iterator it2 = this.f17456b.iterator();
        while (it2.hasNext()) {
            b0.a aVar2 = (b0.a) it2.next();
            if (aVar2.b().equals(str)) {
                return aVar2;
            }
        }
        return null;
    }

    public final <T> void b(Deque<T> deque, T t10) {
        synchronized (this) {
            if (!deque.remove(t10)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        d();
    }

    public final void c(b0.a aVar) {
        aVar.f17308u.decrementAndGet();
        b(this.f17457c, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Deque<r9.b0$a>, java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Deque<r9.b0$a>, java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Deque<r9.b0>, java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Deque<r9.b0$a>, java.util.ArrayDeque] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.Deque<r9.b0$a>, java.util.ArrayDeque] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d() {
        /*
            r15 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r15)
            java.util.Deque<r9.b0$a> r1 = r15.f17456b     // Catch: java.lang.Throwable -> Lc6
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lc6
        Lc:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Lc6
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Lc6
            r9.b0$a r2 = (r9.b0.a) r2     // Catch: java.lang.Throwable -> Lc6
            java.util.Deque<r9.b0$a> r3 = r15.f17457c     // Catch: java.lang.Throwable -> Lc6
            int r3 = r3.size()     // Catch: java.lang.Throwable -> Lc6
            r4 = 64
            if (r3 < r4) goto L23
            goto L3e
        L23:
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f17308u     // Catch: java.lang.Throwable -> Lc6
            int r3 = r3.get()     // Catch: java.lang.Throwable -> Lc6
            r4 = 5
            if (r3 < r4) goto L2d
            goto Lc
        L2d:
            r1.remove()     // Catch: java.lang.Throwable -> Lc6
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f17308u     // Catch: java.lang.Throwable -> Lc6
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> Lc6
            r0.add(r2)     // Catch: java.lang.Throwable -> Lc6
            java.util.Deque<r9.b0$a> r3 = r15.f17457c     // Catch: java.lang.Throwable -> Lc6
            r3.add(r2)     // Catch: java.lang.Throwable -> Lc6
            goto Lc
        L3e:
            monitor-enter(r15)     // Catch: java.lang.Throwable -> Lc6
            java.util.Deque<r9.b0$a> r1 = r15.f17457c     // Catch: java.lang.Throwable -> Lc3
            int r1 = r1.size()     // Catch: java.lang.Throwable -> Lc3
            java.util.Deque<r9.b0> r2 = r15.f17458d     // Catch: java.lang.Throwable -> Lc3
            int r2 = r2.size()     // Catch: java.lang.Throwable -> Lc3
            int r1 = r1 + r2
            monitor-exit(r15)     // Catch: java.lang.Throwable -> Lc6
            r2 = 0
            if (r1 <= 0) goto L52
            r1 = 1
            goto L53
        L52:
            r1 = r2
        L53:
            monitor-exit(r15)     // Catch: java.lang.Throwable -> Lc6
            int r3 = r0.size()
            r4 = r2
        L59:
            if (r4 >= r3) goto Lc2
            java.lang.Object r5 = r0.get(r4)
            r9.b0$a r5 = (r9.b0.a) r5
            monitor-enter(r15)
            java.util.concurrent.ThreadPoolExecutor r6 = r15.f17455a     // Catch: java.lang.Throwable -> Lbf
            if (r6 != 0) goto L84
            java.util.concurrent.ThreadPoolExecutor r6 = new java.util.concurrent.ThreadPoolExecutor     // Catch: java.lang.Throwable -> Lbf
            r8 = 0
            r9 = 2147483647(0x7fffffff, float:NaN)
            r10 = 60
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> Lbf
            java.util.concurrent.SynchronousQueue r13 = new java.util.concurrent.SynchronousQueue     // Catch: java.lang.Throwable -> Lbf
            r13.<init>()     // Catch: java.lang.Throwable -> Lbf
            java.lang.String r7 = "OkHttp Dispatcher"
            byte[] r14 = s9.e.f18396a     // Catch: java.lang.Throwable -> Lbf
            s9.d r14 = new s9.d     // Catch: java.lang.Throwable -> Lbf
            r14.<init>(r7, r2)     // Catch: java.lang.Throwable -> Lbf
            r7 = r6
            r7.<init>(r8, r9, r10, r12, r13, r14)     // Catch: java.lang.Throwable -> Lbf
            r15.f17455a = r6     // Catch: java.lang.Throwable -> Lbf
        L84:
            java.util.concurrent.ThreadPoolExecutor r6 = r15.f17455a     // Catch: java.lang.Throwable -> Lbf
            monitor-exit(r15)
            java.util.Objects.requireNonNull(r5)
            r6.execute(r5)     // Catch: java.lang.Throwable -> L8e java.util.concurrent.RejectedExecutionException -> L90
            goto Lb2
        L8e:
            r0 = move-exception
            goto Lb5
        L90:
            r6 = move-exception
            java.io.InterruptedIOException r7 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L8e
            java.lang.String r8 = "executor rejected"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L8e
            r7.initCause(r6)     // Catch: java.lang.Throwable -> L8e
            r9.b0 r6 = r9.b0.this     // Catch: java.lang.Throwable -> L8e
            u9.i r6 = r6.f17303t     // Catch: java.lang.Throwable -> L8e
            r6.g(r7)     // Catch: java.lang.Throwable -> L8e
            r9.g r6 = r5.f17307t     // Catch: java.lang.Throwable -> L8e
            da.s$a r6 = (da.s.a) r6     // Catch: java.lang.Throwable -> L8e
            r6.a(r7)     // Catch: java.lang.Throwable -> L8e
            r9.b0 r6 = r9.b0.this
            r9.z r6 = r6.f17302s
            r9.n r6 = r6.f17511s
            r6.c(r5)
        Lb2:
            int r4 = r4 + 1
            goto L59
        Lb5:
            r9.b0 r1 = r9.b0.this
            r9.z r1 = r1.f17302s
            r9.n r1 = r1.f17511s
            r1.c(r5)
            throw r0
        Lbf:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        Lc2:
            return r1
        Lc3:
            r0 = move-exception
            monitor-exit(r15)     // Catch: java.lang.Throwable -> Lc6
            throw r0     // Catch: java.lang.Throwable -> Lc6
        Lc6:
            r0 = move-exception
            monitor-exit(r15)     // Catch: java.lang.Throwable -> Lc6
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r9.n.d():boolean");
    }
}
