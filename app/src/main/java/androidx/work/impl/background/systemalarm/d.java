package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import d2.j;
import d2.m;
import d2.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import t1.h;
import u1.k;

/* loaded from: classes.dex */
public final class d implements u1.b {
    public static final String C = h.e("SystemAlarmDispatcher");
    public c B;

    /* renamed from: s */
    public final Context f2352s;

    /* renamed from: t */
    public final f2.a f2353t;

    /* renamed from: v */
    public final u1.d f2355v;

    /* renamed from: w */
    public final k f2356w;

    /* renamed from: x */
    public final androidx.work.impl.background.systemalarm.a f2357x;

    /* renamed from: u */
    public final r f2354u = new r();

    /* renamed from: z */
    public final List<Intent> f2358z = new ArrayList();
    public Intent A = null;
    public final Handler y = new Handler(Looper.getMainLooper());

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
            d.this = r1;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List<android.content.Intent>, java.util.ArrayList] */
        @Override // java.lang.Runnable
        public final void run() {
            RunnableC0029d runnableC0029d;
            d dVar;
            synchronized (d.this.f2358z) {
                d dVar2 = d.this;
                dVar2.A = (Intent) dVar2.f2358z.get(0);
            }
            Intent intent = d.this.A;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = d.this.A.getIntExtra("KEY_START_ID", 0);
                h c10 = h.c();
                String str = d.C;
                c10.a(str, String.format("Processing command %s, %s", d.this.A, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock a10 = m.a(d.this.f2352s, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    h.c().a(str, String.format("Acquiring operation wake lock (%s) %s", action, a10), new Throwable[0]);
                    a10.acquire();
                    d dVar3 = d.this;
                    dVar3.f2357x.e(dVar3.A, intExtra, dVar3);
                    h.c().a(str, String.format("Releasing operation wake lock (%s) %s", action, a10), new Throwable[0]);
                    a10.release();
                    dVar = d.this;
                    runnableC0029d = new RunnableC0029d(dVar);
                } catch (Throwable th) {
                    try {
                        h c11 = h.c();
                        String str2 = d.C;
                        c11.b(str2, "Unexpected error in onHandleIntent", th);
                        h.c().a(str2, String.format("Releasing operation wake lock (%s) %s", action, a10), new Throwable[0]);
                        a10.release();
                        dVar = d.this;
                        runnableC0029d = new RunnableC0029d(dVar);
                    } catch (Throwable th2) {
                        h.c().a(d.C, String.format("Releasing operation wake lock (%s) %s", action, a10), new Throwable[0]);
                        a10.release();
                        d dVar4 = d.this;
                        dVar4.e(new RunnableC0029d(dVar4));
                        throw th2;
                    }
                }
                dVar.e(runnableC0029d);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b implements Runnable {

        /* renamed from: s */
        public final d f2360s;

        /* renamed from: t */
        public final Intent f2361t;

        /* renamed from: u */
        public final int f2362u;

        public b(d dVar, Intent intent, int i10) {
            this.f2360s = dVar;
            this.f2361t = intent;
            this.f2362u = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f2360s.b(this.f2361t, this.f2362u);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
    }

    /* renamed from: androidx.work.impl.background.systemalarm.d$d */
    /* loaded from: classes.dex */
    public static class RunnableC0029d implements Runnable {

        /* renamed from: s */
        public final d f2363s;

        public RunnableC0029d(d dVar) {
            this.f2363s = dVar;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List<android.content.Intent>, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r3v9, types: [java.util.List<android.content.Intent>, java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r6v1, types: [java.util.HashMap, java.util.Map<java.lang.String, u1.b>] */
        /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List<android.content.Intent>, java.util.ArrayList] */
        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            d dVar = this.f2363s;
            Objects.requireNonNull(dVar);
            h c10 = h.c();
            String str = d.C;
            c10.a(str, "Checking if commands are complete.", new Throwable[0]);
            dVar.c();
            synchronized (dVar.f2358z) {
                boolean z11 = true;
                if (dVar.A != null) {
                    h.c().a(str, String.format("Removing command %s", dVar.A), new Throwable[0]);
                    if (!((Intent) dVar.f2358z.remove(0)).equals(dVar.A)) {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                    dVar.A = null;
                }
                j jVar = ((f2.b) dVar.f2353t).f4477a;
                androidx.work.impl.background.systemalarm.a aVar = dVar.f2357x;
                synchronized (aVar.f2339u) {
                    z10 = !aVar.f2338t.isEmpty();
                }
                if (!z10 && dVar.f2358z.isEmpty()) {
                    synchronized (jVar.f3751u) {
                        if (jVar.f3749s.isEmpty()) {
                            z11 = false;
                        }
                    }
                    if (!z11) {
                        h.c().a(str, "No more commands & intents.", new Throwable[0]);
                        c cVar = dVar.B;
                        if (cVar != null) {
                            ((SystemAlarmService) cVar).e();
                        }
                    }
                }
                if (!dVar.f2358z.isEmpty()) {
                    dVar.f();
                }
            }
        }
    }

    public d(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f2352s = applicationContext;
        this.f2357x = new androidx.work.impl.background.systemalarm.a(applicationContext);
        k c10 = k.c(context);
        this.f2356w = c10;
        u1.d dVar = c10.f19028f;
        this.f2355v = dVar;
        this.f2353t = c10.f19026d;
        dVar.b(this);
    }

    @Override // u1.b
    public final void a(String str, boolean z10) {
        Context context = this.f2352s;
        String str2 = androidx.work.impl.background.systemalarm.a.f2336v;
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z10);
        e(new b(this, intent, 0));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List<android.content.Intent>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List<android.content.Intent>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List<android.content.Intent>, java.util.ArrayList] */
    public final boolean b(Intent intent, int i10) {
        boolean z10;
        h c10 = h.c();
        String str = C;
        c10.a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i10)), new Throwable[0]);
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            h.c().f(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            c();
            synchronized (this.f2358z) {
                Iterator it = this.f2358z.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = false;
                        break;
                    } else if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                        z10 = true;
                        break;
                    }
                }
            }
            if (z10) {
                return false;
            }
        }
        intent.putExtra("KEY_START_ID", i10);
        synchronized (this.f2358z) {
            boolean z11 = !this.f2358z.isEmpty();
            this.f2358z.add(intent);
            if (!z11) {
                f();
            }
        }
        return true;
    }

    public final void c() {
        if (this.y.getLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Needs to be invoked on the main thread.");
    }

    public final void d() {
        h.c().a(C, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f2355v.e(this);
        r rVar = this.f2354u;
        if (!rVar.f3791b.isShutdown()) {
            rVar.f3791b.shutdownNow();
        }
        this.B = null;
    }

    public final void e(Runnable runnable) {
        this.y.post(runnable);
    }

    public final void f() {
        c();
        PowerManager.WakeLock a10 = m.a(this.f2352s, "ProcessCommand");
        try {
            a10.acquire();
            ((f2.b) this.f2356w.f19026d).a(new a());
        } finally {
            a10.release();
        }
    }
}
