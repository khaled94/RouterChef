package d2;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import t1.h;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: f */
    public static final String f3789f = h.e("WorkTimer");

    /* renamed from: a */
    public final a f3790a;

    /* renamed from: b */
    public final ScheduledExecutorService f3791b;

    /* renamed from: c */
    public final Map<String, c> f3792c = new HashMap();

    /* renamed from: d */
    public final Map<String, b> f3793d = new HashMap();

    /* renamed from: e */
    public final Object f3794e = new Object();

    /* loaded from: classes.dex */
    public class a implements ThreadFactory {

        /* renamed from: a */
        public int f3795a = 0;

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            StringBuilder c10 = androidx.activity.result.a.c("WorkManager-WorkTimer-thread-");
            c10.append(this.f3795a);
            newThread.setName(c10.toString());
            this.f3795a++;
            return newThread;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void b(String str);
    }

    /* loaded from: classes.dex */
    public static class c implements Runnable {

        /* renamed from: s */
        public final r f3796s;

        /* renamed from: t */
        public final String f3797t;

        public c(r rVar, String str) {
            this.f3796s = rVar;
            this.f3797t = str;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [java.util.HashMap, java.util.Map<java.lang.String, d2.r$c>] */
        /* JADX WARN: Type inference failed for: r1v7, types: [java.util.Map<java.lang.String, d2.r$b>, java.util.HashMap] */
        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.f3796s.f3794e) {
                if (((c) this.f3796s.f3792c.remove(this.f3797t)) != null) {
                    b bVar = (b) this.f3796s.f3793d.remove(this.f3797t);
                    if (bVar != null) {
                        bVar.b(this.f3797t);
                    }
                } else {
                    h.c().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f3797t), new Throwable[0]);
                }
            }
        }
    }

    public r() {
        a aVar = new a();
        this.f3790a = aVar;
        this.f3791b = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.HashMap, java.util.Map<java.lang.String, d2.r$c>] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Map<java.lang.String, d2.r$b>, java.util.HashMap] */
    public final void a(String str, b bVar) {
        synchronized (this.f3794e) {
            h.c().a(f3789f, String.format("Starting timer for %s", str), new Throwable[0]);
            b(str);
            c cVar = new c(this, str);
            this.f3792c.put(str, cVar);
            this.f3793d.put(str, bVar);
            this.f3791b.schedule(cVar, 600000L, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.String, d2.r$c>] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.Map<java.lang.String, d2.r$b>, java.util.HashMap] */
    public final void b(String str) {
        synchronized (this.f3794e) {
            if (((c) this.f3792c.remove(str)) != null) {
                h.c().a(f3789f, String.format("Stopping timer for %s", str), new Throwable[0]);
                this.f3793d.remove(str);
            }
        }
    }
}
