package m4;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class qr1 {

    /* renamed from: a */
    public final BlockingQueue<Runnable> f12983a;

    /* renamed from: b */
    public final ThreadPoolExecutor f12984b;

    /* renamed from: c */
    public final ArrayDeque<pr1> f12985c = new ArrayDeque<>();

    /* renamed from: d */
    public pr1 f12986d = null;

    public qr1() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f12983a = linkedBlockingQueue;
        this.f12984b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    public final void a(pr1 pr1Var) {
        pr1Var.f12614a = this;
        this.f12985c.add(pr1Var);
        if (this.f12986d == null) {
            b();
        }
    }

    public final void b() {
        pr1 poll = this.f12985c.poll();
        this.f12986d = poll;
        if (poll != null) {
            poll.executeOnExecutor(this.f12984b, new Object[0]);
        }
    }
}
