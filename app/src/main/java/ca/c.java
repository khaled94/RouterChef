package ca;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class c extends z {

    /* renamed from: h */
    public static final long f2832h;

    /* renamed from: i */
    public static final long f2833i;
    @Nullable

    /* renamed from: j */
    public static c f2834j;

    /* renamed from: e */
    public boolean f2835e;
    @Nullable

    /* renamed from: f */
    public c f2836f;

    /* renamed from: g */
    public long f2837g;

    /* loaded from: classes.dex */
    public static final class a extends Thread {
        public a() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0015, code lost:
            r1.n();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                r3 = this;
            L0:
                java.lang.Class<ca.c> r0 = ca.c.class
                monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L0
                ca.c r1 = ca.c.h()     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                goto L0
            Lb:
                ca.c r2 = ca.c.f2834j     // Catch: java.lang.Throwable -> L19
                if (r1 != r2) goto L14
                r1 = 0
                ca.c.f2834j = r1     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                return
            L14:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                r1.n()     // Catch: java.lang.InterruptedException -> L0
                goto L0
            L19:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                throw r1     // Catch: java.lang.InterruptedException -> L0
            */
            throw new UnsupportedOperationException("Method not decompiled: ca.c.a.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f2832h = millis;
        f2833i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    @Nullable
    public static c h() {
        c cVar = f2834j.f2836f;
        long nanoTime = System.nanoTime();
        if (cVar == null) {
            c.class.wait(f2832h);
            if (f2834j.f2836f == null && System.nanoTime() - nanoTime >= f2833i) {
                return f2834j;
            }
            return null;
        }
        long j3 = cVar.f2837g - nanoTime;
        if (j3 > 0) {
            long j10 = j3 / 1000000;
            c.class.wait(j10, (int) (j3 - (1000000 * j10)));
            return null;
        }
        f2834j.f2836f = cVar.f2836f;
        cVar.f2836f = null;
        return cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0065 A[Catch: all -> 0x0070, TRY_LEAVE, TryCatch #0 {, blocks: (B:10:0x0017, B:12:0x001b, B:13:0x002a, B:16:0x0032, B:18:0x003e, B:20:0x0044, B:21:0x004a, B:22:0x004f, B:24:0x0053, B:28:0x005d, B:30:0x0065, B:33:0x006a, B:34:0x006f), top: B:39:0x0017 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i() {
        /*
            r9 = this;
            boolean r0 = r9.f2835e
            if (r0 != 0) goto L73
            long r0 = r9.f2891c
            boolean r2 = r9.f2889a
            r3 = 0
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L11
            if (r2 != 0) goto L11
            return
        L11:
            r4 = 1
            r9.f2835e = r4
            java.lang.Class<ca.c> r4 = ca.c.class
            monitor-enter(r4)
            ca.c r5 = ca.c.f2834j     // Catch: java.lang.Throwable -> L70
            if (r5 != 0) goto L2a
            ca.c r5 = new ca.c     // Catch: java.lang.Throwable -> L70
            r5.<init>()     // Catch: java.lang.Throwable -> L70
            ca.c.f2834j = r5     // Catch: java.lang.Throwable -> L70
            ca.c$a r5 = new ca.c$a     // Catch: java.lang.Throwable -> L70
            r5.<init>()     // Catch: java.lang.Throwable -> L70
            r5.start()     // Catch: java.lang.Throwable -> L70
        L2a:
            long r5 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L70
            if (r3 == 0) goto L3c
            if (r2 == 0) goto L3c
            long r2 = r9.c()     // Catch: java.lang.Throwable -> L70
            long r2 = r2 - r5
            long r0 = java.lang.Math.min(r0, r2)     // Catch: java.lang.Throwable -> L70
            goto L3e
        L3c:
            if (r3 == 0) goto L42
        L3e:
            long r0 = r0 + r5
            r9.f2837g = r0     // Catch: java.lang.Throwable -> L70
            goto L4a
        L42:
            if (r2 == 0) goto L6a
            long r0 = r9.c()     // Catch: java.lang.Throwable -> L70
            r9.f2837g = r0     // Catch: java.lang.Throwable -> L70
        L4a:
            long r0 = r9.f2837g     // Catch: java.lang.Throwable -> L70
            long r0 = r0 - r5
            ca.c r2 = ca.c.f2834j     // Catch: java.lang.Throwable -> L70
        L4f:
            ca.c r3 = r2.f2836f     // Catch: java.lang.Throwable -> L70
            if (r3 == 0) goto L5d
            long r7 = r3.f2837g     // Catch: java.lang.Throwable -> L70
            long r7 = r7 - r5
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L5b
            goto L5d
        L5b:
            r2 = r3
            goto L4f
        L5d:
            r9.f2836f = r3     // Catch: java.lang.Throwable -> L70
            r2.f2836f = r9     // Catch: java.lang.Throwable -> L70
            ca.c r0 = ca.c.f2834j     // Catch: java.lang.Throwable -> L70
            if (r2 != r0) goto L68
            r4.notify()     // Catch: java.lang.Throwable -> L70
        L68:
            monitor-exit(r4)
            return
        L6a:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L70
            r0.<init>()     // Catch: java.lang.Throwable -> L70
            throw r0     // Catch: java.lang.Throwable -> L70
        L70:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L73:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unbalanced enter/exit"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ca.c.i():void");
    }

    public final IOException j(IOException iOException) {
        return !l() ? iOException : m(iOException);
    }

    public final void k(boolean z10) {
        if (!l() || !z10) {
            return;
        }
        throw m(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        r2.f2836f = r4.f2836f;
        r4.f2836f = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l() {
        /*
            r4 = this;
            boolean r0 = r4.f2835e
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r4.f2835e = r1
            java.lang.Class<ca.c> r0 = ca.c.class
            monitor-enter(r0)
            ca.c r2 = ca.c.f2834j     // Catch: java.lang.Throwable -> L20
        Ld:
            if (r2 == 0) goto L1d
            ca.c r3 = r2.f2836f     // Catch: java.lang.Throwable -> L20
            if (r3 != r4) goto L1b
            ca.c r3 = r4.f2836f     // Catch: java.lang.Throwable -> L20
            r2.f2836f = r3     // Catch: java.lang.Throwable -> L20
            r2 = 0
            r4.f2836f = r2     // Catch: java.lang.Throwable -> L20
            goto L1e
        L1b:
            r2 = r3
            goto Ld
        L1d:
            r1 = 1
        L1e:
            monitor-exit(r0)
            return r1
        L20:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ca.c.l():boolean");
    }

    public IOException m(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void n() {
    }
}
