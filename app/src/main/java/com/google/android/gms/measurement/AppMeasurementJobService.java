package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import java.util.Objects;
import y4.a6;
import y4.i5;
import y4.j5;
import y4.s1;
import y4.w2;
import z3.l;

@TargetApi(24)
/* loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements i5 {

    /* renamed from: s */
    public j5<AppMeasurementJobService> f2966s;

    @Override // y4.i5
    public final void a(Intent intent) {
    }

    @Override // y4.i5
    public final boolean b(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // y4.i5
    @TargetApi(24)
    public final void c(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final j5<AppMeasurementJobService> d() {
        if (this.f2966s == null) {
            this.f2966s = new j5<>(this);
        }
        return this.f2966s;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        w2.t(d().f20520a, null, null).C().F.a("Local AppMeasurementService is starting up");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        w2.t(d().f20520a, null, null).C().F.a("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        d().a(intent);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(final JobParameters jobParameters) {
        final j5<AppMeasurementJobService> d5 = d();
        final s1 C = w2.t(d5.f20520a, null, null).C();
        String string = jobParameters.getExtras().getString("action");
        C.F.b("Local AppMeasurementJobService called. action", string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            Runnable runnable = new Runnable() { // from class: y4.h5
                @Override // java.lang.Runnable
                public final void run() {
                    j5 j5Var = j5.this;
                    s1 s1Var = C;
                    JobParameters jobParameters2 = jobParameters;
                    Objects.requireNonNull(j5Var);
                    s1Var.F.a("AppMeasurementJobService processed last upload request.");
                    j5Var.f20520a.c(jobParameters2);
                }
            };
            a6 O = a6.O(d5.f20520a);
            O.B().q(new l(O, runnable));
            return true;
        }
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        d().b(intent);
        return true;
    }
}
