package b0;

import android.app.Notification;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class p extends r {

    /* renamed from: b */
    public CharSequence f2434b;

    @Override // b0.r
    public final void a(Bundle bundle) {
        bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$BigTextStyle");
    }

    @Override // b0.r
    public final void b(m mVar) {
        new Notification.BigTextStyle(((s) mVar).f2456b).setBigContentTitle(null).bigText(this.f2434b);
    }

    @Override // b0.r
    public final String c() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
