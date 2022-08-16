package b0;

import android.app.Application;
import b0.f;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: s */
    public final /* synthetic */ Application f2400s;

    /* renamed from: t */
    public final /* synthetic */ f.a f2401t;

    public d(Application application, f.a aVar) {
        this.f2400s = application;
        this.f2401t = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2400s.unregisterActivityLifecycleCallbacks(this.f2401t);
    }
}
