package a3;

import a3.f;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import e3.a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;
import t2.r;

/* loaded from: classes.dex */
public final class d implements x {

    /* renamed from: a */
    public final Context f45a;

    /* renamed from: b */
    public final b3.d f46b;

    /* renamed from: c */
    public final f f47c;

    public d(Context context, b3.d dVar, f fVar) {
        this.f45a = context;
        this.f46b = dVar;
        this.f47c = fVar;
    }

    @Override // a3.x
    public final void a(r rVar, int i10) {
        b(rVar, i10, false);
    }

    @Override // a3.x
    public final void b(r rVar, int i10, boolean z10) {
        boolean z11;
        ComponentName componentName = new ComponentName(this.f45a, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f45a.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(this.f45a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(rVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(a.a(rVar.d())).array());
        if (rVar.c() != null) {
            adler32.update(rVar.c());
        }
        int value = (int) adler32.getValue();
        if (!z10) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i11 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i11 >= i10) {
                        z11 = true;
                    }
                }
            }
            z11 = false;
            if (z11) {
                y2.a.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", rVar);
                return;
            }
        }
        long X = this.f46b.X(rVar);
        f fVar = this.f47c;
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        q2.d d5 = rVar.d();
        builder.setMinimumLatency(fVar.b(d5, X, i10));
        Set<f.b> c10 = fVar.c().get(d5).c();
        if (c10.contains(f.b.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (c10.contains(f.b.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (c10.contains(f.b.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", rVar.b());
        persistableBundle.putInt("priority", a.a(rVar.d()));
        if (rVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(rVar.c(), 0));
        }
        builder.setExtras(persistableBundle);
        y2.a.b("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", rVar, Integer.valueOf(value), Long.valueOf(this.f47c.b(rVar.d(), X, i10)), Long.valueOf(X), Integer.valueOf(i10));
        jobScheduler.schedule(builder.build());
    }
}
