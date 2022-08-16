package k9;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import k9.f0;

/* loaded from: classes.dex */
public final class v extends f0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final v y;

    /* renamed from: z */
    public static final long f5694z;

    static {
        Long l10;
        v vVar = new v();
        y = vVar;
        vVar.r0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l10 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l10 = 1000L;
        }
        f5694z = timeUnit.toNanos(l10.longValue());
    }

    public final synchronized void C0() {
        if (!D0()) {
            return;
        }
        debugStatus = 3;
        A0();
        notifyAll();
    }

    public final boolean D0() {
        int i10 = debugStatus;
        return i10 == 2 || i10 == 3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        boolean y02;
        z0 z0Var = z0.f5699a;
        z0.f5700b.set(this);
        try {
            synchronized (this) {
                if (D0()) {
                    z10 = false;
                } else {
                    z10 = true;
                    debugStatus = 1;
                    notifyAll();
                }
            }
            if (!z10) {
                if (y02) {
                    return;
                }
                return;
            }
            long j3 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long z02 = z0();
                if (z02 == Long.MAX_VALUE) {
                    long nanoTime = System.nanoTime();
                    if (j3 == Long.MAX_VALUE) {
                        j3 = f5694z + nanoTime;
                    }
                    long j10 = j3 - nanoTime;
                    if (j10 <= 0) {
                        _thread = null;
                        C0();
                        if (y0()) {
                            return;
                        }
                        u0();
                        return;
                    } else if (z02 > j10) {
                        z02 = j10;
                    }
                } else {
                    j3 = Long.MAX_VALUE;
                }
                if (z02 > 0) {
                    if (D0()) {
                        _thread = null;
                        C0();
                        if (y0()) {
                            return;
                        }
                        u0();
                        return;
                    }
                    LockSupport.parkNanos(this, z02);
                }
            }
        } finally {
            _thread = null;
            C0();
            if (!y0()) {
                u0();
            }
        }
    }

    @Override // k9.f0, k9.e0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // k9.g0
    public final Thread u0() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // k9.g0
    public final void v0(long j3, f0.a aVar) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // k9.f0
    public final void w0(Runnable runnable) {
        if (!(debugStatus == 4)) {
            super.w0(runnable);
            return;
        }
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }
}
