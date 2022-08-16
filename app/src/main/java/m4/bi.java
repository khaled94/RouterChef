package m4;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import n3.g1;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class bi {

    /* renamed from: a */
    public final Object f6539a = new Object();
    @GuardedBy("activityTrackerLock")

    /* renamed from: b */
    public zh f6540b = null;
    @GuardedBy("activityTrackerLock")

    /* renamed from: c */
    public boolean f6541c = false;

    public final Activity a() {
        synchronized (this.f6539a) {
            try {
                zh zhVar = this.f6540b;
                if (zhVar == null) {
                    return null;
                }
                return zhVar.f16228s;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List<m4.ai>, java.util.ArrayList] */
    public final void b(ai aiVar) {
        synchronized (this.f6539a) {
            if (this.f6540b == null) {
                this.f6540b = new zh();
            }
            zh zhVar = this.f6540b;
            synchronized (zhVar.f16230u) {
                zhVar.f16233x.add(aiVar);
            }
        }
    }

    public final void c(Context context) {
        synchronized (this.f6539a) {
            try {
                if (!this.f6541c) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application == null) {
                        g1.j("Can not cast Context to Application");
                        return;
                    }
                    if (this.f6540b == null) {
                        this.f6540b = new zh();
                    }
                    zh zhVar = this.f6540b;
                    if (!zhVar.A) {
                        application.registerActivityLifecycleCallbacks(zhVar);
                        if (context instanceof Activity) {
                            zhVar.a((Activity) context);
                        }
                        zhVar.f16229t = application;
                        zhVar.B = ((Long) jo.f10145d.f10148c.a(es.f8242z0)).longValue();
                        zhVar.A = true;
                    }
                    this.f6541c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List<m4.ai>, java.util.ArrayList] */
    public final void d(ai aiVar) {
        synchronized (this.f6539a) {
            zh zhVar = this.f6540b;
            if (zhVar == null) {
                return;
            }
            synchronized (zhVar.f16230u) {
                zhVar.f16233x.remove(aiVar);
            }
        }
    }
}
