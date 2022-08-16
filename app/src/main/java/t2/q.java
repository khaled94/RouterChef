package t2;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class q implements Executor {

    /* renamed from: s */
    public final Executor f18544s;

    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: s */
        public final Runnable f18545s;

        public a(Runnable runnable) {
            this.f18545s = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f18545s.run();
            } catch (Exception e10) {
                y2.a.c("Executor", "Background execution failure.", e10);
            }
        }
    }

    public q(Executor executor) {
        this.f18544s = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f18544s.execute(new a(runnable));
    }
}
