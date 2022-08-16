package com.google.android.gms.measurement;

import a1.a;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import java.util.Objects;
import y4.a6;
import y4.h3;
import y4.i5;
import y4.j5;
import y4.s1;
import y4.w2;
import z3.l;

/* loaded from: classes.dex */
public final class AppMeasurementService extends Service implements i5 {

    /* renamed from: s */
    public j5<AppMeasurementService> f2968s;

    @Override // y4.i5
    public final void a(Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = a.f9s;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray<PowerManager.WakeLock> sparseArray2 = a.f9s;
        synchronized (sparseArray2) {
            PowerManager.WakeLock wakeLock = sparseArray2.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                sparseArray2.remove(intExtra);
            } else {
                Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
            }
        }
    }

    @Override // y4.i5
    public final boolean b(int i10) {
        return stopSelfResult(i10);
    }

    @Override // y4.i5
    public final void c(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final j5<AppMeasurementService> d() {
        if (this.f2968s == null) {
            this.f2968s = new j5<>(this);
        }
        return this.f2968s;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        j5<AppMeasurementService> d5 = d();
        Objects.requireNonNull(d5);
        if (intent == null) {
            d5.c().f20710x.a("onBind called with null intent");
        } else {
            String action = intent.getAction();
            if ("com.google.android.gms.measurement.START".equals(action)) {
                return new h3(a6.O(d5.f20520a));
            }
            d5.c().A.b("onBind received unknown action", action);
        }
        return null;
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

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i10, final int i11) {
        final j5<AppMeasurementService> d5 = d();
        final s1 C = w2.t(d5.f20520a, null, null).C();
        if (intent == null) {
            C.A.a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        C.F.c("Local AppMeasurementService called. startId, action", Integer.valueOf(i11), action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        Runnable runnable = new Runnable() { // from class: y4.g5
            @Override // java.lang.Runnable
            public final void run() {
                j5 j5Var = j5.this;
                int i12 = i11;
                s1 s1Var = C;
                Intent intent2 = intent;
                if (j5Var.f20520a.b(i12)) {
                    s1Var.F.b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i12));
                    j5Var.c().F.a("Completed wakeful intent.");
                    j5Var.f20520a.a(intent2);
                }
            }
        };
        a6 O = a6.O(d5.f20520a);
        O.B().q(new l(O, runnable));
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        d().b(intent);
        return true;
    }
}
