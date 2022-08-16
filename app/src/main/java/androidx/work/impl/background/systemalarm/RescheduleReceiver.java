package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;
import t1.h;
import u1.k;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f2332a = h.e("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        h.c().a(f2332a, String.format("Received intent %s", intent), new Throwable[0]);
        try {
            k c10 = k.c(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            Objects.requireNonNull(c10);
            synchronized (k.f19022l) {
                c10.f19031i = goAsync;
                if (c10.f19030h) {
                    goAsync.finish();
                    c10.f19031i = null;
                }
            }
        } catch (IllegalStateException e10) {
            h.c().b(f2332a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
        }
    }
}
