package y4;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import s4.l0;

/* loaded from: classes.dex */
public final class t5 extends v5 {

    /* renamed from: v */
    public final AlarmManager f20744v = (AlarmManager) ((w2) this.f20505s).f20786s.getSystemService("alarm");

    /* renamed from: w */
    public s5 f20745w;

    /* renamed from: x */
    public Integer f20746x;

    public t5(a6 a6Var) {
        super(a6Var);
    }

    @Override // y4.v5
    public final void j() {
        AlarmManager alarmManager = this.f20744v;
        if (alarmManager != null) {
            alarmManager.cancel(m());
        }
        if (Build.VERSION.SDK_INT >= 24) {
            o();
        }
    }

    public final void k() {
        h();
        ((w2) this.f20505s).C().F.a("Unscheduling upload");
        AlarmManager alarmManager = this.f20744v;
        if (alarmManager != null) {
            alarmManager.cancel(m());
        }
        n().a();
        if (Build.VERSION.SDK_INT >= 24) {
            o();
        }
    }

    public final int l() {
        if (this.f20746x == null) {
            String valueOf = String.valueOf(((w2) this.f20505s).f20786s.getPackageName());
            this.f20746x = Integer.valueOf((valueOf.length() != 0 ? "measurement".concat(valueOf) : new String("measurement")).hashCode());
        }
        return this.f20746x.intValue();
    }

    public final PendingIntent m() {
        Context context = ((w2) this.f20505s).f20786s;
        return PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), l0.f17963a);
    }

    public final j n() {
        if (this.f20745w == null) {
            this.f20745w = new s5(this, this.f20760t.D);
        }
        return this.f20745w;
    }

    @TargetApi(24)
    public final void o() {
        JobScheduler jobScheduler = (JobScheduler) ((w2) this.f20505s).f20786s.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(l());
        }
    }
}
