package w1;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import c2.d;
import c2.g;
import c2.i;
import d2.f;
import t1.h;
import u1.k;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    public static final String f19916a = h.e("Alarms");

    public static void a(Context context, String str, int i10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, androidx.work.impl.background.systemalarm.a.c(context, str), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        h.c().a(f19916a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i10)), new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void b(Context context, k kVar, String str, long j3) {
        int intValue;
        WorkDatabase workDatabase = kVar.f19025c;
        i iVar = (i) workDatabase.s();
        g a10 = iVar.a(str);
        if (a10 != null) {
            a(context, str, a10.f2621b);
            c(context, str, a10.f2621b, j3);
            return;
        }
        synchronized (f.class) {
            workDatabase.c();
            Long a11 = ((c2.f) workDatabase.r()).a("next_alarm_manager_id");
            int i10 = 0;
            intValue = a11 != null ? a11.intValue() : 0;
            if (intValue != Integer.MAX_VALUE) {
                i10 = intValue + 1;
            }
            ((c2.f) workDatabase.r()).b(new d("next_alarm_manager_id", i10));
            workDatabase.o();
            workDatabase.k();
        }
        iVar.b(new g(str, intValue));
        c(context, str, intValue, j3);
    }

    public static void c(Context context, String str, int i10, long j3) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, androidx.work.impl.background.systemalarm.a.c(context, str), 201326592);
        if (alarmManager != null) {
            alarmManager.setExact(0, j3, service);
        }
    }
}
