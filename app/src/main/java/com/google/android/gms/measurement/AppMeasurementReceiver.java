package com.google.android.gms.measurement;

import a1.a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import java.util.Objects;
import y4.k2;
import y4.l2;
import y4.q1;
import y4.s1;
import y4.w2;

/* loaded from: classes.dex */
public final class AppMeasurementReceiver extends a implements k2 {

    /* renamed from: u */
    public l2 f2967u;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        q1 q1Var;
        if (this.f2967u == null) {
            this.f2967u = new l2(this);
        }
        l2 l2Var = this.f2967u;
        Objects.requireNonNull(l2Var);
        s1 C = w2.t(context, null, null).C();
        if (intent == null) {
            q1Var = C.A;
            str = "Receiver called with null intent";
        } else {
            String action = intent.getAction();
            C.F.b("Local receiver got", action);
            if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
                Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
                className.setAction("com.google.android.gms.measurement.UPLOAD");
                C.F.a("Starting wakeful intent.");
                Objects.requireNonNull((AppMeasurementReceiver) l2Var.f20550a);
                SparseArray<PowerManager.WakeLock> sparseArray = a.f9s;
                synchronized (sparseArray) {
                    int i10 = a.f10t;
                    int i11 = i10 + 1;
                    a.f10t = i11;
                    if (i11 <= 0) {
                        a.f10t = 1;
                    }
                    className.putExtra("androidx.contentpager.content.wakelockid", i10);
                    ComponentName startService = context.startService(className);
                    if (startService != null) {
                        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
                        newWakeLock.setReferenceCounted(false);
                        newWakeLock.acquire(60000L);
                        sparseArray.put(i10, newWakeLock);
                    }
                }
                return;
            } else if (!"com.android.vending.INSTALL_REFERRER".equals(action)) {
                return;
            } else {
                q1Var = C.A;
                str = "Install Referrer Broadcasts are deprecated";
            }
        }
        q1Var.a(str);
    }
}
