package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import a3.e;
import a3.h;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import e3.a;
import t2.j;
import t2.r;
import t2.w;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: s */
    public static final /* synthetic */ int f2903s = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i10 = jobParameters.getExtras().getInt("priority");
        int i11 = jobParameters.getExtras().getInt("attemptNumber");
        w.b(getApplicationContext());
        r.a a10 = r.a();
        a10.a(string);
        j.a aVar = (j.a) a10;
        aVar.f18532c = a.b(i10);
        if (string2 != null) {
            aVar.f18531b = Base64.decode(string2, 0);
        }
        a3.r rVar = w.a().f18560d;
        rVar.f84e.execute(new h(rVar, aVar.b(), i11, new e(this, jobParameters, 0)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
