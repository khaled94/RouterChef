package s4;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class j2 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: s */
    public final /* synthetic */ k2 f17936s;

    public j2(k2 k2Var) {
        this.f17936s = k2Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f17936s.b(new b2(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f17936s.b(new i2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f17936s.b(new e2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f17936s.b(new d2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        o0 o0Var = new o0();
        this.f17936s.b(new h2(this, activity, o0Var));
        Bundle c02 = o0Var.c0(50L);
        if (c02 != null) {
            bundle.putAll(c02);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f17936s.b(new c2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f17936s.b(new g2(this, activity));
    }
}
