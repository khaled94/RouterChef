package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.text.TextUtils;
import android.util.Log;
import d2.i;
import i0.a;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import t1.h;
import u1.j;
import u1.k;

/* loaded from: classes.dex */
public final class ForceStopRunnable implements Runnable {

    /* renamed from: v */
    public static final String f2384v = h.e("ForceStopRunnable");

    /* renamed from: w */
    public static final long f2385w = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: s */
    public final Context f2386s;

    /* renamed from: t */
    public final k f2387t;

    /* renamed from: u */
    public int f2388u = 0;

    /* loaded from: classes.dex */
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a */
        public static final String f2389a = h.e("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            h c10 = h.c();
            String str = f2389a;
            if (((h.a) c10).f18470b <= 2) {
                Log.v(str, "Rescheduling alarm that keeps track of force-stops.");
            }
            ForceStopRunnable.d(context);
        }
    }

    public ForceStopRunnable(Context context, k kVar) {
        this.f2386s = context.getApplicationContext();
        this.f2387t = kVar;
    }

    public static PendingIntent b(Context context, int i10) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return PendingIntent.getBroadcast(context, -1, intent, i10);
    }

    @SuppressLint({"ClassVerificationFailure"})
    public static void d(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent b10 = b(context, a.a() ? 167772160 : 134217728);
        long currentTimeMillis = System.currentTimeMillis() + f2385w;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, b10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.ForceStopRunnable.a():void");
    }

    public final boolean c() {
        androidx.work.a aVar = this.f2387t.f19024b;
        Objects.requireNonNull(aVar);
        if (TextUtils.isEmpty(null)) {
            h.c().a(f2384v, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean a10 = i.a(this.f2386s, aVar);
        h.c().a(f2384v, String.format("Is default app process = %s", Boolean.valueOf(a10)), new Throwable[0]);
        return a10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!c()) {
                return;
            }
            while (true) {
                j.a(this.f2386s);
                h.c().a(f2384v, "Performing cleanup operations.", new Throwable[0]);
                try {
                    a();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e10) {
                    int i10 = this.f2388u + 1;
                    this.f2388u = i10;
                    if (i10 < 3) {
                        h.c().a(f2384v, String.format("Retrying after %s", Long.valueOf(i10 * 300)), e10);
                        try {
                            Thread.sleep(this.f2388u * 300);
                        } catch (InterruptedException unused) {
                        }
                    } else {
                        h.c().b(f2384v, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                        Objects.requireNonNull(this.f2387t.f19024b);
                        throw illegalStateException;
                    }
                }
            }
        } finally {
            this.f2387t.e();
        }
    }
}
