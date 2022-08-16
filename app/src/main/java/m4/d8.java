package m4;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class d8 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: s */
    public final Application f7255s;

    /* renamed from: t */
    public final WeakReference<Application.ActivityLifecycleCallbacks> f7256t;

    /* renamed from: u */
    public boolean f7257u = false;

    public d8(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f7256t = new WeakReference<>(activityLifecycleCallbacks);
        this.f7255s = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f7256t.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityCreated(activity, bundle);
            } else if (!this.f7257u) {
                this.f7255s.unregisterActivityLifecycleCallbacks(this);
                this.f7257u = true;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f7256t.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityDestroyed(activity);
            } else if (!this.f7257u) {
                this.f7255s.unregisterActivityLifecycleCallbacks(this);
                this.f7257u = true;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f7256t.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityPaused(activity);
            } else if (!this.f7257u) {
                this.f7255s.unregisterActivityLifecycleCallbacks(this);
                this.f7257u = true;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f7256t.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityResumed(activity);
            } else if (!this.f7257u) {
                this.f7255s.unregisterActivityLifecycleCallbacks(this);
                this.f7257u = true;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f7256t.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivitySaveInstanceState(activity, bundle);
            } else if (!this.f7257u) {
                this.f7255s.unregisterActivityLifecycleCallbacks(this);
                this.f7257u = true;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f7256t.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityStarted(activity);
            } else if (!this.f7257u) {
                this.f7255s.unregisterActivityLifecycleCallbacks(this);
                this.f7257u = true;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f7256t.get();
            if (activityLifecycleCallbacks != null) {
                activityLifecycleCallbacks.onActivityStopped(activity);
            } else if (!this.f7257u) {
                this.f7255s.unregisterActivityLifecycleCallbacks(this);
                this.f7257u = true;
            }
        } catch (Exception unused) {
        }
    }
}
