package b2;

import android.app.Notification;
import androidx.work.impl.foreground.SystemForegroundService;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f2479s;

    /* renamed from: t */
    public final /* synthetic */ Notification f2480t;

    /* renamed from: u */
    public final /* synthetic */ SystemForegroundService f2481u;

    public c(SystemForegroundService systemForegroundService, int i10, Notification notification) {
        this.f2481u = systemForegroundService;
        this.f2479s = i10;
        this.f2480t = notification;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2481u.f2372w.notify(this.f2479s, this.f2480t);
    }
}
