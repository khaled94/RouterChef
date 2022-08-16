package b2;

import androidx.work.impl.foreground.SystemForegroundService;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ int f2482s;

    /* renamed from: t */
    public final /* synthetic */ SystemForegroundService f2483t;

    public d(SystemForegroundService systemForegroundService, int i10) {
        this.f2483t = systemForegroundService;
        this.f2482s = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2483t.f2372w.cancel(this.f2482s);
    }
}
