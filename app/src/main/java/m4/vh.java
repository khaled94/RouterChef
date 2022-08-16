package m4;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import n3.g1;

/* loaded from: classes.dex */
public final class vh implements Application.ActivityLifecycleCallbacks {

    /* renamed from: s */
    public final Application f14689s;

    /* renamed from: t */
    public final WeakReference<Application.ActivityLifecycleCallbacks> f14690t;

    /* renamed from: u */
    public boolean f14691u = false;

    public vh(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f14690t = new WeakReference<>(activityLifecycleCallbacks);
        this.f14689s = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f14690t.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityCreated(activity, bundle);
            } else if (!this.f14691u) {
                this.f14689s.unregisterActivityLifecycleCallbacks(this);
                this.f14691u = true;
            }
        } catch (Exception e10) {
            g1.h("Error while dispatching lifecycle callback.", e10);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f14690t.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityDestroyed(activity);
            } else if (!this.f14691u) {
                this.f14689s.unregisterActivityLifecycleCallbacks(this);
                this.f14691u = true;
            }
        } catch (Exception e10) {
            g1.h("Error while dispatching lifecycle callback.", e10);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f14690t.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityPaused(activity);
            } else if (!this.f14691u) {
                this.f14689s.unregisterActivityLifecycleCallbacks(this);
                this.f14691u = true;
            }
        } catch (Exception e10) {
            g1.h("Error while dispatching lifecycle callback.", e10);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f14690t.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityResumed(activity);
            } else if (!this.f14691u) {
                this.f14689s.unregisterActivityLifecycleCallbacks(this);
                this.f14691u = true;
            }
        } catch (Exception e10) {
            g1.h("Error while dispatching lifecycle callback.", e10);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f14690t.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivitySaveInstanceState(activity, bundle);
            } else if (!this.f14691u) {
                this.f14689s.unregisterActivityLifecycleCallbacks(this);
                this.f14691u = true;
            }
        } catch (Exception e10) {
            g1.h("Error while dispatching lifecycle callback.", e10);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f14690t.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityStarted(activity);
            } else if (!this.f14691u) {
                this.f14689s.unregisterActivityLifecycleCallbacks(this);
                this.f14691u = true;
            }
        } catch (Exception e10) {
            g1.h("Error while dispatching lifecycle callback.", e10);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f14690t.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityStopped(activity);
            } else if (!this.f14691u) {
                this.f14689s.unregisterActivityLifecycleCallbacks(this);
                this.f14691u = true;
            }
        } catch (Exception e10) {
            g1.h("Error while dispatching lifecycle callback.", e10);
        }
    }
}
