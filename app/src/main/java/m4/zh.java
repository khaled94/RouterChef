package m4;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import c4.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;
import n3.g1;
import n3.h1;
import n3.s1;

@TargetApi(14)
/* loaded from: classes.dex */
public final class zh implements Application.ActivityLifecycleCallbacks {
    public long B;

    /* renamed from: s */
    public Activity f16228s;

    /* renamed from: t */
    public Application f16229t;

    /* renamed from: z */
    public s f16234z;

    /* renamed from: u */
    public final Object f16230u = new Object();

    /* renamed from: v */
    public boolean f16231v = true;

    /* renamed from: w */
    public boolean f16232w = false;
    @GuardedBy("lock")

    /* renamed from: x */
    public final List<ai> f16233x = new ArrayList();
    @GuardedBy("lock")
    public final List<oi> y = new ArrayList();
    public boolean A = false;

    public final void a(Activity activity) {
        synchronized (this.f16230u) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.f16228s = activity;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List<m4.oi>, java.util.ArrayList] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f16230u) {
            Activity activity2 = this.f16228s;
            if (activity2 != null) {
                if (activity2.equals(activity)) {
                    this.f16228s = null;
                }
                Iterator it = this.y.iterator();
                while (it.hasNext()) {
                    try {
                        if (((oi) it.next()).zza()) {
                            it.remove();
                        }
                    } catch (Exception e10) {
                        l3.s.B.f5793g.g(e10, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        g1.h("", e10);
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<m4.oi>, java.util.ArrayList] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(activity);
        synchronized (this.f16230u) {
            Iterator it = this.y.iterator();
            while (it.hasNext()) {
                try {
                    ((oi) it.next()).a();
                } catch (Exception e10) {
                    l3.s.B.f5793g.g(e10, "AppActivityTracker.ActivityListener.onActivityPaused");
                    g1.h("", e10);
                }
            }
        }
        this.f16232w = true;
        s sVar = this.f16234z;
        if (sVar != null) {
            s1.f16555i.removeCallbacks(sVar);
        }
        h1 h1Var = s1.f16555i;
        s sVar2 = new s(this, 1);
        this.f16234z = sVar2;
        h1Var.postDelayed(sVar2, this.B);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List<m4.oi>, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.List<m4.ai>, java.util.ArrayList] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(activity);
        this.f16232w = false;
        boolean z10 = !this.f16231v;
        this.f16231v = true;
        s sVar = this.f16234z;
        if (sVar != null) {
            s1.f16555i.removeCallbacks(sVar);
        }
        synchronized (this.f16230u) {
            Iterator it = this.y.iterator();
            while (it.hasNext()) {
                try {
                    ((oi) it.next()).c();
                } catch (Exception e10) {
                    l3.s.B.f5793g.g(e10, "AppActivityTracker.ActivityListener.onActivityResumed");
                    g1.h("", e10);
                }
            }
            if (z10) {
                Iterator it2 = this.f16233x.iterator();
                while (it2.hasNext()) {
                    try {
                        ((ai) it2.next()).J(true);
                    } catch (Exception e11) {
                        g1.h("", e11);
                    }
                }
            } else {
                g1.e("App is still foreground.");
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
