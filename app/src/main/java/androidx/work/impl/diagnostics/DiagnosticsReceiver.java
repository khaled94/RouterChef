package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import t1.h;
import t1.j;
import u1.k;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f2367a = h.e("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        h.c().a(f2367a, "Requesting diagnostics", new Throwable[0]);
        try {
            k.c(context).b(new j.a(DiagnosticsWorker.class).b());
        } catch (IllegalStateException e10) {
            h.c().b(f2367a, "WorkManager is not initialized", e10);
        }
    }
}
