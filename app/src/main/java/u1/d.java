package u1;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import c0.a;
import d2.m;
import e2.c;
import f2.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import t1.h;
import u1.n;

/* loaded from: classes.dex */
public final class d implements b, b2.a {
    public static final String D = h.e("Processor");

    /* renamed from: t */
    public Context f18997t;

    /* renamed from: u */
    public androidx.work.a f18998u;

    /* renamed from: v */
    public f2.a f18999v;

    /* renamed from: w */
    public WorkDatabase f19000w;

    /* renamed from: z */
    public List<e> f19002z;
    public Map<String, n> y = new HashMap();

    /* renamed from: x */
    public Map<String, n> f19001x = new HashMap();
    public Set<String> A = new HashSet();
    public final List<b> B = new ArrayList();

    /* renamed from: s */
    public PowerManager.WakeLock f18996s = null;
    public final Object C = new Object();

    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: s */
        public b f19003s;

        /* renamed from: t */
        public String f19004t;

        /* renamed from: u */
        public g6.a<Boolean> f19005u;

        public a(b bVar, String str, g6.a<Boolean> aVar) {
            this.f19003s = bVar;
            this.f19004t = str;
            this.f19005u = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            try {
                z10 = ((Boolean) ((e2.a) this.f19005u).get()).booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z10 = true;
            }
            this.f19003s.a(this.f19004t, z10);
        }
    }

    public d(Context context, androidx.work.a aVar, f2.a aVar2, WorkDatabase workDatabase, List<e> list) {
        this.f18997t = context;
        this.f18998u = aVar;
        this.f18999v = aVar2;
        this.f19000w = workDatabase;
        this.f19002z = list;
    }

    public static boolean c(String str, n nVar) {
        boolean z10;
        if (nVar == null) {
            h.c().a(D, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
            return false;
        }
        nVar.K = true;
        nVar.i();
        g6.a<ListenableWorker.a> aVar = nVar.J;
        if (aVar != null) {
            z10 = ((e2.a) aVar).isDone();
            ((e2.a) nVar.J).cancel(true);
        } else {
            z10 = false;
        }
        ListenableWorker listenableWorker = nVar.f19043x;
        if (listenableWorker == null || z10) {
            h.c().a(n.L, String.format("WorkSpec %s is already done. Not interrupting.", nVar.f19042w), new Throwable[0]);
        } else {
            listenableWorker.stop();
        }
        h.c().a(D, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map<java.lang.String, u1.n>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List<u1.b>, java.util.ArrayList] */
    @Override // u1.b
    public final void a(String str, boolean z10) {
        synchronized (this.C) {
            this.y.remove(str);
            h.c().a(D, String.format("%s %s executed; reschedule = %s", d.class.getSimpleName(), str, Boolean.valueOf(z10)), new Throwable[0]);
            Iterator it = this.B.iterator();
            while (it.hasNext()) {
                ((b) it.next()).a(str, z10);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<u1.b>, java.util.ArrayList] */
    public final void b(b bVar) {
        synchronized (this.C) {
            this.B.add(bVar);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map<java.lang.String, u1.n>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Map<java.lang.String, u1.n>, java.util.HashMap] */
    public final boolean d(String str) {
        boolean z10;
        synchronized (this.C) {
            if (!this.y.containsKey(str) && !this.f19001x.containsKey(str)) {
                z10 = false;
            }
            z10 = true;
        }
        return z10;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List<u1.b>, java.util.ArrayList] */
    public final void e(b bVar) {
        synchronized (this.C) {
            this.B.remove(bVar);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map<java.lang.String, u1.n>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Map<java.lang.String, u1.n>, java.util.HashMap] */
    public final void f(String str, t1.d dVar) {
        synchronized (this.C) {
            h.c().d(D, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
            n nVar = (n) this.y.remove(str);
            if (nVar != null) {
                if (this.f18996s == null) {
                    PowerManager.WakeLock a10 = m.a(this.f18997t, "ProcessorForegroundLck");
                    this.f18996s = a10;
                    a10.acquire();
                }
                this.f19001x.put(str, nVar);
                Intent e10 = androidx.work.impl.foreground.a.e(this.f18997t, str, dVar);
                Context context = this.f18997t;
                Object obj = c0.a.f2602a;
                if (Build.VERSION.SDK_INT >= 26) {
                    a.e.a(context, e10);
                } else {
                    context.startService(e10);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Map<java.lang.String, u1.n>, java.util.HashMap] */
    public final boolean g(String str, WorkerParameters.a aVar) {
        synchronized (this.C) {
            if (d(str)) {
                h.c().a(D, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                return false;
            }
            n.a aVar2 = new n.a(this.f18997t, this.f18998u, this.f18999v, this, this.f19000w, str);
            aVar2.f19051g = this.f19002z;
            if (aVar != null) {
                aVar2.f19052h = aVar;
            }
            n nVar = new n(aVar2);
            c<Boolean> cVar = nVar.I;
            cVar.c(new a(this, str, cVar), ((b) this.f18999v).f4479c);
            this.y.put(str, nVar);
            ((b) this.f18999v).f4477a.execute(nVar);
            h.c().a(D, String.format("%s: processing %s", d.class.getSimpleName(), str), new Throwable[0]);
            return true;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map<java.lang.String, u1.n>, java.util.HashMap] */
    public final void h() {
        synchronized (this.C) {
            if (!(!this.f19001x.isEmpty())) {
                Context context = this.f18997t;
                String str = androidx.work.impl.foreground.a.C;
                Intent intent = new Intent(context, SystemForegroundService.class);
                intent.setAction("ACTION_STOP_FOREGROUND");
                this.f18997t.startService(intent);
                PowerManager.WakeLock wakeLock = this.f18996s;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f18996s = null;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map<java.lang.String, u1.n>, java.util.HashMap] */
    public final boolean i(String str) {
        boolean c10;
        synchronized (this.C) {
            h.c().a(D, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            c10 = c(str, (n) this.f19001x.remove(str));
        }
        return c10;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map<java.lang.String, u1.n>, java.util.HashMap] */
    public final boolean j(String str) {
        boolean c10;
        synchronized (this.C) {
            h.c().a(D, String.format("Processor stopping background work %s", str), new Throwable[0]);
            c10 = c(str, (n) this.y.remove(str));
        }
        return c10;
    }
}
