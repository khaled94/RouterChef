package n3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import d.d;
import m4.k90;

/* loaded from: classes.dex */
public final class q1 extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (k90.f10300b) {
            k90.f10301c = false;
            k90.f10302d = false;
            g1.j("Ad debug logging enablement is out of date.");
        }
        d.d(context);
    }
}
