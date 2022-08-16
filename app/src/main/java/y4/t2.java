package y4;

import android.os.Process;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
public final class t2 extends Thread {

    /* renamed from: t */
    public final BlockingQueue<s2<?>> f20736t;

    /* renamed from: v */
    public final /* synthetic */ u2 f20738v;

    /* renamed from: u */
    public boolean f20737u = false;

    /* renamed from: s */
    public final Object f20735s = new Object();

    public t2(u2 u2Var, String str, BlockingQueue<s2<?>> blockingQueue) {
        this.f20738v = u2Var;
        Objects.requireNonNull(blockingQueue, "null reference");
        this.f20736t = blockingQueue;
        setName(str);
    }

    public final void a() {
        synchronized (this.f20738v.A) {
            if (!this.f20737u) {
                this.f20738v.B.release();
                this.f20738v.A.notifyAll();
                u2 u2Var = this.f20738v;
                if (this == u2Var.f20750u) {
                    u2Var.f20750u = null;
                } else if (this == u2Var.f20751v) {
                    u2Var.f20751v = null;
                } else {
                    ((w2) u2Var.f20505s).C().f20710x.a("Current scheduler thread is neither worker nor network");
                }
                this.f20737u = true;
            }
        }
    }

    public final void b(InterruptedException interruptedException) {
        ((w2) this.f20738v.f20505s).C().A.b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z10 = false;
        while (!z10) {
            try {
                this.f20738v.B.acquire();
                z10 = true;
            } catch (InterruptedException e10) {
                b(e10);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                s2<?> poll = this.f20736t.poll();
                if (poll == null) {
                    synchronized (this.f20735s) {
                        if (this.f20736t.peek() == null) {
                            Objects.requireNonNull(this.f20738v);
                            try {
                                this.f20735s.wait(30000L);
                            } catch (InterruptedException e11) {
                                b(e11);
                            }
                        }
                    }
                    synchronized (this.f20738v.A) {
                        if (this.f20736t.peek() == null) {
                            break;
                        }
                    }
                } else {
                    Process.setThreadPriority(true != poll.f20713t ? 10 : threadPriority);
                    poll.run();
                }
            }
            if (((w2) this.f20738v.f20505s).y.s(null, f1.f20418k0)) {
                a();
            }
        } finally {
            a();
        }
    }
}
