package u1;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.a;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.utils.ForceStopRunnable;
import c2.r;
import com.raouf.routerchef.R;
import d2.e;
import d2.g;
import d2.h;
import d2.j;
import d2.l;
import f2.b;
import g1.x;
import g1.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import k1.f;
import t1.h;
import t1.o;
import t1.p;
import v1.c;

/* loaded from: classes.dex */
public final class k extends o {

    /* renamed from: j */
    public static k f19020j = null;

    /* renamed from: k */
    public static k f19021k = null;

    /* renamed from: l */
    public static final Object f19022l = new Object();

    /* renamed from: a */
    public Context f19023a;

    /* renamed from: b */
    public a f19024b;

    /* renamed from: c */
    public WorkDatabase f19025c;

    /* renamed from: d */
    public f2.a f19026d;

    /* renamed from: e */
    public List<e> f19027e;

    /* renamed from: f */
    public d f19028f;

    /* renamed from: g */
    public h f19029g;

    /* renamed from: h */
    public boolean f19030h;

    /* renamed from: i */
    public BroadcastReceiver.PendingResult f19031i;

    static {
        t1.h.e("WorkManagerImpl");
    }

    public k(Context context, a aVar, f2.a aVar2) {
        z.a aVar3;
        boolean z10 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        j jVar = ((b) aVar2).f4477a;
        int i10 = WorkDatabase.f2309m;
        if (z10) {
            aVar3 = new z.a(applicationContext, WorkDatabase.class, null);
            aVar3.f4880h = true;
        } else {
            String str = j.f19018a;
            aVar3 = x.a(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            aVar3.f4879g = new h(applicationContext);
        }
        aVar3.f4877e = jVar;
        i iVar = new i();
        if (aVar3.f4876d == null) {
            aVar3.f4876d = new ArrayList<>();
        }
        aVar3.f4876d.add(iVar);
        aVar3.a(androidx.work.impl.a.f2318a);
        aVar3.a(new a.h(applicationContext, 2, 3));
        aVar3.a(androidx.work.impl.a.f2319b);
        aVar3.a(androidx.work.impl.a.f2320c);
        aVar3.a(new a.h(applicationContext, 5, 6));
        aVar3.a(androidx.work.impl.a.f2321d);
        aVar3.a(androidx.work.impl.a.f2322e);
        aVar3.a(androidx.work.impl.a.f2323f);
        aVar3.a(new a.i(applicationContext));
        aVar3.a(new a.h(applicationContext, 10, 11));
        aVar3.a(androidx.work.impl.a.f2324g);
        aVar3.c();
        WorkDatabase workDatabase = (WorkDatabase) aVar3.b();
        Context applicationContext2 = context.getApplicationContext();
        h.a aVar4 = new h.a(aVar.f2301f);
        synchronized (t1.h.class) {
            t1.h.f18469a = aVar4;
        }
        String str2 = f.f19006a;
        x1.b bVar = new x1.b(applicationContext2, this);
        g.a(applicationContext2, SystemJobService.class, true);
        t1.h.c().a(f.f19006a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
        List<e> asList = Arrays.asList(bVar, new c(applicationContext2, aVar, aVar2, this));
        d dVar = new d(context, aVar, aVar2, workDatabase, asList);
        Context applicationContext3 = context.getApplicationContext();
        this.f19023a = applicationContext3;
        this.f19024b = aVar;
        this.f19026d = aVar2;
        this.f19025c = workDatabase;
        this.f19027e = asList;
        this.f19028f = dVar;
        this.f19029g = new d2.h(workDatabase);
        this.f19030h = false;
        if (Build.VERSION.SDK_INT < 24 || !applicationContext3.isDeviceProtectedStorage()) {
            ((b) this.f19026d).a(new ForceStopRunnable(applicationContext3, this));
            return;
        }
        throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
    }

    public static k c(Context context) {
        k kVar;
        Object obj = f19022l;
        synchronized (obj) {
            synchronized (obj) {
                kVar = f19020j;
                if (kVar == null) {
                    kVar = f19021k;
                }
            }
            return kVar;
        }
        if (kVar == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof a.b)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            d(applicationContext, ((a.b) applicationContext).a());
            kVar = c(applicationContext);
        }
        return kVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0016, code lost:
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (u1.k.f19021k != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
        u1.k.f19021k = new u1.k(r4, r5, new f2.b(r5.f2297b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        u1.k.f19020j = u1.k.f19021k;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(android.content.Context r4, androidx.work.a r5) {
        /*
            java.lang.Object r0 = u1.k.f19022l
            monitor-enter(r0)
            u1.k r1 = u1.k.f19020j     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L14
            u1.k r2 = u1.k.f19021k     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto Lc
            goto L14
        Lc:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L32
            java.lang.String r5 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L32
            throw r4     // Catch: java.lang.Throwable -> L32
        L14:
            if (r1 != 0) goto L30
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L32
            u1.k r1 = u1.k.f19021k     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L2c
            u1.k r1 = new u1.k     // Catch: java.lang.Throwable -> L32
            f2.b r2 = new f2.b     // Catch: java.lang.Throwable -> L32
            java.util.concurrent.ExecutorService r3 = r5.f2297b     // Catch: java.lang.Throwable -> L32
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L32
            r1.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L32
            u1.k.f19021k = r1     // Catch: java.lang.Throwable -> L32
        L2c:
            u1.k r4 = u1.k.f19021k     // Catch: java.lang.Throwable -> L32
            u1.k.f19020j = r4     // Catch: java.lang.Throwable -> L32
        L30:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return
        L32:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.k.d(android.content.Context, androidx.work.a):void");
    }

    @Override // t1.o
    public final t1.k a(List<? extends p> list) {
        if (!list.isEmpty()) {
            g gVar = new g(this, list);
            if (!gVar.f19015h) {
                e eVar = new e(gVar);
                ((b) this.f19026d).a(eVar);
                gVar.f19016i = eVar.f3744t;
            } else {
                t1.h.c().f(g.f19007j, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", gVar.f19012e)), new Throwable[0]);
            }
            return gVar.f19016i;
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    public final void e() {
        synchronized (f19022l) {
            this.f19030h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f19031i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f19031i = null;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void f() {
        List<JobInfo> d5;
        Context context = this.f19023a;
        String str = x1.b.f19991w;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (d5 = x1.b.d(context, jobScheduler)) != null) {
            ArrayList arrayList = (ArrayList) d5;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    x1.b.a(jobScheduler, ((JobInfo) it.next()).getId());
                }
            }
        }
        r rVar = (r) this.f19025c.v();
        rVar.f2654a.b();
        f a10 = rVar.f2662i.a();
        rVar.f2654a.c();
        try {
            a10.s();
            rVar.f2654a.o();
            rVar.f2654a.k();
            rVar.f2662i.d(a10);
            f.a(this.f19024b, this.f19025c, this.f19027e);
        } catch (Throwable th) {
            rVar.f2654a.k();
            rVar.f2662i.d(a10);
            throw th;
        }
    }

    public final void g(String str) {
        ((b) this.f19026d).a(new l(this, str, false));
    }
}
