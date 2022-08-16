package c4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
public final class b0 extends BroadcastReceiver {

    /* renamed from: a */
    public Context f2673a;

    /* renamed from: b */
    public final r0 f2674b;

    public b0(r0 r0Var) {
        this.f2674b = r0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f2674b.a();
            synchronized (this) {
                Context context2 = this.f2673a;
                if (context2 != null) {
                    context2.unregisterReceiver(this);
                }
                this.f2673a = null;
            }
        }
    }
}
