package d2;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class j implements Executor {

    /* renamed from: t */
    public final Executor f3750t;

    /* renamed from: v */
    public volatile Runnable f3752v;

    /* renamed from: s */
    public final ArrayDeque<a> f3749s = new ArrayDeque<>();

    /* renamed from: u */
    public final Object f3751u = new Object();

    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: s */
        public final j f3753s;

        /* renamed from: t */
        public final Runnable f3754t;

        public a(j jVar, Runnable runnable) {
            this.f3753s = jVar;
            this.f3754t = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f3754t.run();
            } finally {
                this.f3753s.a();
            }
        }
    }

    public j(Executor executor) {
        this.f3750t = executor;
    }

    public final void a() {
        synchronized (this.f3751u) {
            a poll = this.f3749s.poll();
            this.f3752v = poll;
            if (poll != null) {
                this.f3750t.execute(this.f3752v);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f3751u) {
            this.f3749s.add(new a(this, runnable));
            if (this.f3752v == null) {
                a();
            }
        }
    }
}
