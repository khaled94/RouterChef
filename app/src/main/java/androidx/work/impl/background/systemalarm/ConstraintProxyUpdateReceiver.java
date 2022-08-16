package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import d2.g;
import f2.b;
import t1.h;
import u1.k;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f2328a = h.e("ConstrntProxyUpdtRecvr");

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: s */
        public final /* synthetic */ Intent f2329s;

        /* renamed from: t */
        public final /* synthetic */ Context f2330t;

        /* renamed from: u */
        public final /* synthetic */ BroadcastReceiver.PendingResult f2331u;

        public a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f2329s = intent;
            this.f2330t = context;
            this.f2331u = pendingResult;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                boolean booleanExtra = this.f2329s.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f2329s.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f2329s.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f2329s.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                h.c().a(ConstraintProxyUpdateReceiver.f2328a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)), new Throwable[0]);
                g.a(this.f2330t, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                g.a(this.f2330t, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                g.a(this.f2330t, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                g.a(this.f2330t, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f2331u.finish();
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            h.c().a(f2328a, String.format("Ignoring unknown action %s", action), new Throwable[0]);
        } else {
            ((b) k.c(context).f19026d).a(new a(intent, context, goAsync()));
        }
    }
}
