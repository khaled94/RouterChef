package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import t1.h;
import u1.b;
import u1.d;
import u1.k;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements b {

    /* renamed from: u */
    public static final String f2364u = h.e("SystemJobService");

    /* renamed from: s */
    public k f2365s;

    /* renamed from: t */
    public final Map<String, JobParameters> f2366t = new HashMap();

    public static String b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map<java.lang.String, android.app.job.JobParameters>, java.util.HashMap] */
    @Override // u1.b
    public final void a(String str, boolean z10) {
        JobParameters jobParameters;
        h.c().a(f2364u, String.format("%s executed on JobScheduler", str), new Throwable[0]);
        synchronized (this.f2366t) {
            jobParameters = (JobParameters) this.f2366t.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z10);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            k c10 = k.c(getApplicationContext());
            this.f2365s = c10;
            c10.f19028f.b(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            h.c().f(f2364u, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        k kVar = this.f2365s;
        if (kVar != null) {
            kVar.f19028f.e(this);
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Map<java.lang.String, android.app.job.JobParameters>, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Map<java.lang.String, android.app.job.JobParameters>, java.util.HashMap] */
    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        if (this.f2365s == null) {
            h.c().a(f2364u, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        String b10 = b(jobParameters);
        if (TextUtils.isEmpty(b10)) {
            h.c().b(f2364u, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.f2366t) {
            if (this.f2366t.containsKey(b10)) {
                h.c().a(f2364u, String.format("Job is already being executed by SystemJobService: %s", b10), new Throwable[0]);
                return false;
            }
            h.c().a(f2364u, String.format("onStartJob for %s", b10), new Throwable[0]);
            this.f2366t.put(b10, jobParameters);
            WorkerParameters.a aVar = null;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 24) {
                aVar = new WorkerParameters.a();
                if (jobParameters.getTriggeredContentUris() != null) {
                    aVar.f2294b = Arrays.asList(jobParameters.getTriggeredContentUris());
                }
                if (jobParameters.getTriggeredContentAuthorities() != null) {
                    aVar.f2293a = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                }
                if (i10 >= 28) {
                    aVar.f2295c = jobParameters.getNetwork();
                }
            }
            k kVar = this.f2365s;
            ((f2.b) kVar.f19026d).a(new d2.k(kVar, b10, aVar));
            return true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Map<java.lang.String, android.app.job.JobParameters>, java.util.HashMap] */
    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        if (this.f2365s == null) {
            h.c().a(f2364u, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String b10 = b(jobParameters);
        if (TextUtils.isEmpty(b10)) {
            h.c().b(f2364u, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        h.c().a(f2364u, String.format("onStopJob for %s", b10), new Throwable[0]);
        synchronized (this.f2366t) {
            this.f2366t.remove(b10);
        }
        this.f2365s.g(b10);
        d dVar = this.f2365s.f19028f;
        synchronized (dVar.C) {
            contains = dVar.A.contains(b10);
        }
        return !contains;
    }
}
