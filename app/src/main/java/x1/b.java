package x1;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import c2.g;
import c2.i;
import c2.p;
import c2.r;
import d2.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import t1.h;
import t1.n;
import u1.e;
import u1.k;

/* loaded from: classes.dex */
public final class b implements e {

    /* renamed from: w */
    public static final String f19991w = h.e("SystemJobScheduler");

    /* renamed from: s */
    public final Context f19992s;

    /* renamed from: t */
    public final JobScheduler f19993t;

    /* renamed from: u */
    public final k f19994u;

    /* renamed from: v */
    public final a f19995v;

    public b(Context context, k kVar) {
        a aVar = new a(context);
        this.f19992s = context;
        this.f19994u = kVar;
        this.f19993t = (JobScheduler) context.getSystemService("jobscheduler");
        this.f19995v = aVar;
    }

    public static void a(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th) {
            h.c().b(f19991w, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th);
        }
    }

    public static List<Integer> c(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> d5 = d(context, jobScheduler);
        if (d5 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        Iterator it = ((ArrayList) d5).iterator();
        while (it.hasNext()) {
            JobInfo jobInfo = (JobInfo) it.next();
            if (str.equals(g(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    public static List<JobInfo> d(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            h.c().b(f19991w, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static String g(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras != null) {
            try {
                if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                    return null;
                }
                return extras.getString("EXTRA_WORK_SPEC_ID");
            } catch (NullPointerException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // u1.e
    public final void b(String str) {
        List<Integer> c10 = c(this.f19992s, this.f19993t, str);
        if (c10 != null) {
            ArrayList arrayList = (ArrayList) c10;
            if (arrayList.isEmpty()) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a(this.f19993t, ((Integer) it.next()).intValue());
            }
            ((i) this.f19994u.f19025c.s()).c(str);
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // u1.e
    public final void e(p... pVarArr) {
        int i10;
        List<Integer> c10;
        int i11;
        WorkDatabase workDatabase = this.f19994u.f19025c;
        f fVar = new f(workDatabase);
        for (p pVar : pVarArr) {
            workDatabase.c();
            try {
                p i12 = ((r) workDatabase.v()).i(pVar.f2635a);
                if (i12 == null) {
                    h.c().f(f19991w, "Skipping scheduling " + pVar.f2635a + " because it's no longer in the DB", new Throwable[0]);
                } else if (i12.f2636b != n.ENQUEUED) {
                    h.c().f(f19991w, "Skipping scheduling " + pVar.f2635a + " because it is no longer enqueued", new Throwable[0]);
                } else {
                    g a10 = ((i) workDatabase.s()).a(pVar.f2635a);
                    if (a10 != null) {
                        i10 = a10.f2621b;
                    } else {
                        Objects.requireNonNull(this.f19994u.f19024b);
                        i10 = fVar.b(this.f19994u.f19024b.f2302g);
                    }
                    if (a10 == null) {
                        ((i) this.f19994u.f19025c.s()).b(new g(pVar.f2635a, i10));
                    }
                    h(pVar, i10);
                    if (Build.VERSION.SDK_INT == 23 && (c10 = c(this.f19992s, this.f19993t, pVar.f2635a)) != null) {
                        ArrayList arrayList = (ArrayList) c10;
                        int indexOf = arrayList.indexOf(Integer.valueOf(i10));
                        if (indexOf >= 0) {
                            arrayList.remove(indexOf);
                        }
                        if (!arrayList.isEmpty()) {
                            i11 = ((Integer) arrayList.get(0)).intValue();
                        } else {
                            Objects.requireNonNull(this.f19994u.f19024b);
                            i11 = fVar.b(this.f19994u.f19024b.f2302g);
                        }
                        h(pVar, i11);
                    }
                }
                workDatabase.o();
                workDatabase.k();
            } catch (Throwable th) {
                workDatabase.k();
                throw th;
            }
        }
    }

    @Override // u1.e
    public final boolean f() {
        return true;
    }

    public final void h(p pVar, int i10) {
        JobInfo a10 = this.f19995v.a(pVar, i10);
        h c10 = h.c();
        String str = f19991w;
        c10.a(str, String.format("Scheduling work ID %s Job ID %s", pVar.f2635a, Integer.valueOf(i10)), new Throwable[0]);
        try {
            if (this.f19993t.schedule(a10) != 0) {
                return;
            }
            h.c().f(str, String.format("Unable to schedule work ID %s", pVar.f2635a), new Throwable[0]);
            if (!pVar.f2650q || pVar.f2651r != 1) {
                return;
            }
            pVar.f2650q = false;
            h.c().a(str, String.format("Scheduling a non-expedited job (work ID %s)", pVar.f2635a), new Throwable[0]);
            h(pVar, i10);
        } catch (IllegalStateException e10) {
            List<JobInfo> d5 = d(this.f19992s, this.f19993t);
            int size = d5 != null ? ((ArrayList) d5).size() : 0;
            Locale locale = Locale.getDefault();
            Object[] objArr = new Object[3];
            objArr[0] = Integer.valueOf(size);
            objArr[1] = Integer.valueOf(((ArrayList) ((r) this.f19994u.f19025c.v()).e()).size());
            a aVar = this.f19994u.f19024b;
            int i11 = Build.VERSION.SDK_INT;
            int i12 = aVar.f2303h;
            if (i11 == 23) {
                i12 /= 2;
            }
            objArr[2] = Integer.valueOf(i12);
            String format = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", objArr);
            h.c().b(f19991w, format, new Throwable[0]);
            throw new IllegalStateException(format, e10);
        } catch (Throwable th) {
            h.c().b(f19991w, String.format("Unable to schedule %s", pVar), th);
        }
    }
}
