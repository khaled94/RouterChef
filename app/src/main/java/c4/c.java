package c4;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
public final class c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: w */
    public static final c f2675w = new c();

    /* renamed from: s */
    public final AtomicBoolean f2676s = new AtomicBoolean();

    /* renamed from: t */
    public final AtomicBoolean f2677t = new AtomicBoolean();
    @GuardedBy("sInstance")

    /* renamed from: u */
    public final ArrayList<a> f2678u = new ArrayList<>();
    @GuardedBy("sInstance")

    /* renamed from: v */
    public boolean f2679v = false;

    /* loaded from: classes.dex */
    public interface a {
        void a(boolean z10);
    }

    public static void a(Application application) {
        c cVar = f2675w;
        synchronized (cVar) {
            if (!cVar.f2679v) {
                application.registerActivityLifecycleCallbacks(cVar);
                application.registerComponentCallbacks(cVar);
                cVar.f2679v = true;
            }
        }
    }

    public final void b(boolean z10) {
        synchronized (f2675w) {
            Iterator<a> it = this.f2678u.iterator();
            while (it.hasNext()) {
                it.next().a(z10);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f2676s.compareAndSet(true, false);
        this.f2677t.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f2676s.compareAndSet(true, false);
        this.f2677t.set(true);
        if (compareAndSet) {
            b(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        if (i10 != 20 || !this.f2676s.compareAndSet(false, true)) {
            return;
        }
        this.f2677t.set(true);
        b(true);
    }
}
