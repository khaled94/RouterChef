package m4;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
public final class z3 extends Thread {

    /* renamed from: s */
    public final BlockingQueue<e4<?>> f15989s;

    /* renamed from: t */
    public final y3 f15990t;

    /* renamed from: u */
    public final q3 f15991u;

    /* renamed from: v */
    public volatile boolean f15992v = false;

    /* renamed from: w */
    public final w3 f15993w;

    public z3(BlockingQueue<e4<?>> blockingQueue, y3 y3Var, q3 q3Var, w3 w3Var) {
        this.f15989s = blockingQueue;
        this.f15990t = y3Var;
        this.f15991u = q3Var;
        this.f15993w = w3Var;
    }

    public final void a() {
        e4<?> take = this.f15989s.take();
        SystemClock.elapsedRealtime();
        take.l(3);
        try {
            take.f("network-queue-take");
            take.n();
            TrafficStats.setThreadStatsTag(take.f7721v);
            b4 a10 = this.f15990t.a(take);
            take.f("network-http-complete");
            if (a10.f6359e && take.m()) {
                take.h("not-modified");
                take.j();
                return;
            }
            j4<?> b10 = take.b(a10);
            take.f("network-parse-complete");
            if (b10.f9830b != null) {
                ((w4) this.f15991u).c(take.d(), b10.f9830b);
                take.f("network-cache-written");
            }
            take.i();
            this.f15993w.d(take, b10, null);
            take.k(b10);
        } catch (m4 e10) {
            SystemClock.elapsedRealtime();
            this.f15993w.c(take, e10);
            take.j();
        } catch (Exception e11) {
            Log.e("Volley", p4.d("Unhandled exception %s", e11.toString()), e11);
            m4 m4Var = new m4(e11);
            SystemClock.elapsedRealtime();
            this.f15993w.c(take, m4Var);
            take.j();
        } finally {
            take.l(4);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f15992v) {
                    Thread.currentThread().interrupt();
                    return;
                }
                p4.b("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
