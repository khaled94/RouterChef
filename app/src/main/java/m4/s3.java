package m4;

import android.os.Process;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
public final class s3 extends Thread {
    public static final boolean y = p4.f12403a;

    /* renamed from: s */
    public final BlockingQueue<e4<?>> f13501s;

    /* renamed from: t */
    public final BlockingQueue<e4<?>> f13502t;

    /* renamed from: u */
    public final q3 f13503u;

    /* renamed from: v */
    public volatile boolean f13504v = false;

    /* renamed from: w */
    public final ca1 f13505w;

    /* renamed from: x */
    public final w3 f13506x;

    public s3(BlockingQueue<e4<?>> blockingQueue, BlockingQueue<e4<?>> blockingQueue2, q3 q3Var, w3 w3Var) {
        this.f13501s = blockingQueue;
        this.f13502t = blockingQueue2;
        this.f13503u = q3Var;
        this.f13506x = w3Var;
        this.f13505w = new ca1(this, blockingQueue2, w3Var);
    }

    public final void a() {
        e4<?> take = this.f13501s.take();
        take.f("cache-queue-take");
        take.l(1);
        try {
            take.n();
            p3 a10 = ((w4) this.f13503u).a(take.d());
            if (a10 == null) {
                take.f("cache-miss");
                if (!this.f13505w.c(take)) {
                    this.f13502t.put(take);
                }
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (a10.f12397e < currentTimeMillis) {
                take.f("cache-hit-expired");
                take.B = a10;
                if (!this.f13505w.c(take)) {
                    this.f13502t.put(take);
                }
                return;
            }
            take.f("cache-hit");
            byte[] bArr = a10.f12393a;
            Map<String, String> map = a10.f12399g;
            j4<?> b10 = take.b(new b4(200, bArr, (Map) map, (List) b4.a(map), false));
            take.f("cache-hit-parsed");
            if (!(b10.f9831c == null)) {
                take.f("cache-parsing-failed");
                q3 q3Var = this.f13503u;
                String d5 = take.d();
                w4 w4Var = (w4) q3Var;
                synchronized (w4Var) {
                    p3 a11 = w4Var.a(d5);
                    if (a11 != null) {
                        a11.f12398f = 0L;
                        a11.f12397e = 0L;
                        w4Var.c(d5, a11);
                    }
                }
                take.B = null;
                if (!this.f13505w.c(take)) {
                    this.f13502t.put(take);
                }
                return;
            }
            if (a10.f12398f < currentTimeMillis) {
                take.f("cache-hit-refresh-needed");
                take.B = a10;
                b10.f9832d = true;
                if (!this.f13505w.c(take)) {
                    this.f13506x.d(take, b10, new r3(this, take, 0));
                }
            }
            this.f13506x.d(take, b10, null);
        } finally {
            take.l(2);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (y) {
            p4.c("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        ((w4) this.f13503u).b();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f13504v) {
                    Thread.currentThread().interrupt();
                    return;
                }
                p4.b("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
